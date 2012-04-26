package de.itemis.xtext.typesystem.checks;

import static de.itemis.xtext.typesystem.util.Utils.eString;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.characteristics.TypeCharacteristic;
import de.itemis.xtext.typesystem.checks.custom.StaticCustomTypeChecker;
import de.itemis.xtext.typesystem.exceptions.FeatureMustBeSingleValuedException;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class ConstrainPropertyCheck implements ISingleElementTypesystemCheck {
	public final EClass ctxClass;
	public final EStructuralFeature feature;
	public final Object[] validTypes;
	public final String info;
	private String errorMessage;
	public ConstrainPropertyCheck(String errorMessage, EClass ctxClass, EStructuralFeature feature, Object ... validTypes ) throws FeatureMustBeSingleValuedException {
		if ( feature.isMany() ) {
			throw new FeatureMustBeSingleValuedException("cannot use multi-valued feature for type comparison: "+feature.getName());
		}
		this.errorMessage = errorMessage;
		this.info = "constrained property type for "+ctxClass.getName()+"'s feature "+feature.getName();
		this.ctxClass = ctxClass;
		this.feature = feature;
		this.validTypes = validTypes;
	}
	public boolean isApplicable(EObject element) {
		return ctxClass.isInstance(element);
	}
	public boolean check(EObject element, ITypesystem ts, TypeCalculationTrace trace, ValidationMessageAcceptor acceptor, boolean showWarnings) {
		EObject val = (EObject) element.eGet(feature);
		EObject type = ts.typeof(val, trace.child(feature.getName(), val));
		if ( showWarnings && type == null ) {
			trace.add(val, "type of feature '"+feature.getName()+"' is undefined");
			acceptor.acceptWarning("type of feature '"+feature.getName()+"' is undefined", element, feature, -1, null);
		}
		for (Object o: validTypes) {
			if ( o instanceof EClass ) {
				EClass cls = (EClass) o;
				if ( ts.isInstanceOf(type, cls, trace)) {
					return true;
				} else {
					EObject coercedType = ts.tryToCoerceType(val, type, cls.getEPackage().getEFactoryInstance().create(cls) , trace);
					if ( ts.isInstanceOf(coercedType, cls, trace)) {
						return true;
					}
				}
			} else if ( o instanceof StaticCustomTypeChecker ) {
				if ( ((StaticCustomTypeChecker) o).isValid(ts, type, trace) ) {
					return true;
				} 
			} else if ( o instanceof TypeCharacteristic ) {
				if ( ts.hasCharacteristic(type, (TypeCharacteristic) o) ) {
					return true;
				}
			}
		}
		String m = errorMessage != null ? errorMessage : "incompatible type; expected "+ts.typeStrings(validTypes)+", but found "+ts.typeString(type)+" (on a "+ctxClass.getName()+")"; 
		acceptor.acceptError(m, element, feature, -1, null);
		return false;
	}
	@Override
	public void appendTraceInfo(List<String> collector, EObject element, String level) {
		collector.add( level+"["+eString(element)+"] "+info );
	}

}
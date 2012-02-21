package de.itemis.xtext.typesystem.checks;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.exceptions.FeatureMustBeSingleValuedException;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class EnsureUnorderedCompatibilityCheck extends AbstractCompatibilityCheck {
	public EnsureUnorderedCompatibilityCheck(EClass ctxClass, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException  {
		super( null, "unordered compatibility for "+ctxClass.getName()+"; itself and feature "+feature2.getName(), ctxClass, null, feature2 );
	}
	public EnsureUnorderedCompatibilityCheck(String errorMessage, EClass ctxClass, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException  {
		super( errorMessage, "unordered compatibility for "+ctxClass.getName()+"; itself and feature "+feature2.getName(), ctxClass, null, feature2 );
	}
	public EnsureUnorderedCompatibilityCheck(EClass ctxClass, EStructuralFeature feature1, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException  {
		super( null, "unordered compatibility for "+ctxClass.getName()+"; feature "+feature1.getName()+" and feature "+feature2.getName(), ctxClass, feature1, feature2 );
	}
	public EnsureUnorderedCompatibilityCheck(String errorMessage, EClass ctxClass, EStructuralFeature feature1, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException  {
		super( errorMessage, "unordered compatibility for "+ctxClass.getName()+"; feature "+feature1.getName()+" and feature "+feature2.getName(), ctxClass, feature1, feature2 );
	}
	public boolean check( EObject element, ITypesystem ts, TypeCalculationTrace trace, ValidationMessageAcceptor acceptor, boolean showWarnings ) {
		EObject val1;
		if ( feature1 != null ) {
			val1 = (EObject) element.eGet(feature1);
		} else {
			val1 = element;
		}
		EObject val2 = (EObject) element.eGet(feature2);
		if ( val2 != null ) {
			EObject type1 = ts.typeof(val1, trace.child(feature1 != null ? feature1.getName() : "self", val1));
			EObject type2 = ts.typeof(val2, trace.child(feature2.getName(), val2));
			if ( showWarnings && type1 == null ) {
				trace.add(val1, "type of feature '"+feature1.getName()+"' is undefined");
				acceptor.acceptWarning("type of feature '"+feature1.getName()+"' is undefined", element, feature1, -1, null);
			} else if ( showWarnings && type2 == null ){
				trace.add(val2, "type of featue '"+feature2.getName()+"' is undefined");
				acceptor.acceptWarning("type of '"+feature2.getName()+"' is undefined", element, feature2, -1, null);
			} 
			if ( !ts.isCompatibleTypeUnordered(val1, type1, val2, type2, trace) ) {
				String m = errorMessage != null ? errorMessage : "incompatible type "+ts.typeString(type1)+" and "+ts.typeString(type2)+" (on a "+ctxClass.getName()+")"; 
				acceptor.acceptError(m, element, feature2, -1, null);
				return false;
			}
		}
		return true;
	}
}

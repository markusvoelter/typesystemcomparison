package de.itemis.xtext.typesystem.rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class UseFeatureTCRule extends TCRule {

	private EStructuralFeature feature;

	public UseFeatureTCRule(ITypesystem ts, EClass type, EStructuralFeature feature) {
		super(ts, type, "using for "+type.getName()+" feature "+feature.getName());
		this.feature = feature;
	}

	@Override
	public EObject calculateType(TypeCalculationTrace trace, EObject element) {
		EObject featureValue = (EObject) element.eGet(feature);
		if ( featureValue == null ) {
			trace.add(element, "feature "+feature.getName()+" is null -> type is null");
			return null;
		}
		EObject t = ts.typeof( featureValue, trace.child(feature.getName(), featureValue) );
		if ( t == null ) {
			trace.add(featureValue, "type of feature '"+feature.getName()+"' is undefined");
		}
		return t;
	}

	
	
}

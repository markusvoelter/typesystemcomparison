package de.itemis.xtext.typesystem.rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class ComputeCommonTCRule extends TCRule {

	private EStructuralFeature f1;
	private EStructuralFeature f2;

	public ComputeCommonTCRule(ITypesystem ts, EClass type, EStructuralFeature f1, EStructuralFeature f2) {
		super(ts, type, "calculating for "+type.getName()+" common type of feature "+f1.getName()+" and "+f2.getName());
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public EObject calculateType(TypeCalculationTrace trace, EObject element) {
		EObject val1 = (EObject) element.eGet(f1);
		EObject val2 = (EObject) element.eGet(f2);
		EObject type1 = ts.typeof( val1, trace.child("val1", val1) );
		EObject type2 = ts.typeof( val2, trace.child("val2", val2) );
		if ( type1 == null ) {
			trace.add(element, "type of feature '"+f1.getName()+"' is undefined");
		}		
		if ( type2 == null ) {
			trace.add(element, "type of feature '"+f2.getName()+"' is undefined");
		}		
		return ts.computeCommonType( val1, type1, val2, type2, trace );
	}

	
	
}

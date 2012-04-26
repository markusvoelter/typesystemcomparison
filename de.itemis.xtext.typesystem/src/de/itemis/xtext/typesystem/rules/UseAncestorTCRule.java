package de.itemis.xtext.typesystem.rules;

import static de.itemis.xtext.typesystem.util.Utils.ancestor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class UseAncestorTCRule extends TCRule {

	private EClass ancestorClass;

	public UseAncestorTCRule(ITypesystem ts, EClass type, EClass ancestorClass) {
		super(ts, type, "ancestor "+type.getName()+" -> "+ancestorClass.getName());
		this.ancestorClass = ancestorClass;
	}

	@Override
	public EObject calculateType(TypeCalculationTrace trace, EObject element) {
		EObject ancestor = ancestor(element, ancestorClass);
		if ( ancestor == null ) {
			trace.add(element, "no ancestor of type "+ancestorClass.getName()+" found -> type is null");
			return null;
		}
		EObject t = ts.typeof( ancestor, trace.child("ancestor", ancestor) );
		if ( t == null ) {
			trace.add(element, "type of ancestor of type '"+ancestorClass.getName()+"' is undefined");
		}		
		return t;
	}

	
	
}

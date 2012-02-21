package de.itemis.xtext.typesystem.rules;

import static de.itemis.xtext.typesystem.util.Utils.create;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class UseFixedEClassTCRule extends TCRule {

	private EClass typeclass;

	public UseFixedEClassTCRule(ITypesystem ts, EClass type, EClass typeclass) {
		super(ts, type, "fixed EClass "+type.getName()+" -> "+typeclass.getName());
		this.typeclass = typeclass;
	}

	@Override
	public EObject calculateType(TypeCalculationTrace trace, EObject element) {
		return create(typeclass); 
	}

	
	
}

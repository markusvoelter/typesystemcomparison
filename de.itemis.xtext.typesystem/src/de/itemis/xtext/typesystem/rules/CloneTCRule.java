package de.itemis.xtext.typesystem.rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class CloneTCRule extends TCRule {

	public CloneTCRule(ITypesystem ts, EClass type) {
		super(ts, type, "clone "+type.getName());
	}

	@Override
	public EObject calculateType(TypeCalculationTrace trace, EObject element) {
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		EObject res = copier.copy(element);
		copier.copyReferences();
		return res;
	}

	
	
}

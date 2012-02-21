package de.itemis.xtext.typesystem.rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class UsePrototypeTCRule extends TCRule {

	private EObject prototype;

	public UsePrototypeTCRule(ITypesystem ts, EClass type, EObject prototype) {
		super(ts, type, "fixed EObject "+type.getName()+" -> "+ts.typeString(prototype));
		this.prototype = prototype;
	}

	@Override
	public EObject calculateType(TypeCalculationTrace trace, EObject element) {
		return new EcoreUtil.Copier().copy(prototype); 
	}

	
	
}

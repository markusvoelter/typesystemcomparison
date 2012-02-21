package de.itemis.xtext.typesystem.checks.custom;

import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public abstract class StaticCustomTypeChecker {  

	private String info;

	public StaticCustomTypeChecker( String info ) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return info;
	}

	public abstract boolean isValid( ITypesystem ts, EObject type, TypeCalculationTrace trace );
	
}

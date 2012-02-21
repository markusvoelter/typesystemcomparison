package de.itemis.xtext.typesystem.checks;

import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public abstract class CustomTypeChecker {

	private String info;

	public CustomTypeChecker( String info ) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return info;
	}

	public abstract boolean isValid( ITypesystem ts, EObject type, TypeCalculationTrace trace );
	
}

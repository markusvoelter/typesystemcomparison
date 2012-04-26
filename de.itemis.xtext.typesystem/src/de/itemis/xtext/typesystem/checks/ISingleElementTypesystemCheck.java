package de.itemis.xtext.typesystem.checks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.ITraceStep;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

/**
 * An interface for type system checks that affect only
 * one element
 */
public interface ISingleElementTypesystemCheck extends ITraceStep {

	/**
	 * predicate to determine whether the check is applicable
	 * for element
	 */
	public boolean isApplicable( EObject element );
	
	/**
	 * perfrorm the check; returns success, and reports
	 * issues to the acceptor 
	 */
	public boolean check( EObject element, ITypesystem ts, TypeCalculationTrace trace, ValidationMessageAcceptor acceptor, boolean showWarnings );
	
}

package de.itemis.xtext.typesystem.checks.custom;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public abstract class ContextDependentCustomTypeChecker {  

	private EClass ctxClass;
	
	public static abstract class Result {}
	public static class TypeIsValid extends Result{}
	public static class TypeIsInvalid extends Result{
		private EObject expected;
		private EObject actual;
		private EStructuralFeature feature;
		private int index;
		public TypeIsInvalid( EObject expected, EObject actual, EStructuralFeature feature, int index ) {
			this.expected = expected;
			this.actual = actual;
			this.feature = feature;
			this.index = index;
		}
		public TypeIsInvalid( EObject expected, EObject actual, EStructuralFeature feature ) {
			this( expected, actual, feature, -1 );
		}
		public EObject getExpectedType() {
			return expected;
		}
		public EObject getActualType() {
			return actual;
		}
		public EStructuralFeature getFeature() {
			return feature;
		}
		public int getFeatureID() {
			return feature.getFeatureID();
		}
		public int getIndex() {
			return index;
		}
	}
	
	public ContextDependentCustomTypeChecker( EClass ctxClass ) {
		this.ctxClass = ctxClass;
	}
	
	public EClass getContextType() {
		return ctxClass;
	}
	
	protected Result ok() {
		return new TypeIsValid();
	}
	
	protected Result fail(EObject expected, EObject actual, EStructuralFeature feature, int index) {
		return new TypeIsInvalid(expected, actual, feature, index);
	}
	
	protected Result fail(EObject expected, EObject actual, EStructuralFeature feature) {
		return new TypeIsInvalid(expected, actual, feature, -1);
	}

	public abstract Result isValidType( EObject ctx, ITypesystem ts, TypeCalculationTrace trace );
	
	
}

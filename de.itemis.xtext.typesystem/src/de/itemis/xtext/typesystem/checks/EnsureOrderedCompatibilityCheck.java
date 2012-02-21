package de.itemis.xtext.typesystem.checks;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.exceptions.FeatureMustBeSingleValuedException;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class EnsureOrderedCompatibilityCheck extends AbstractCompatibilityCheck {
	public EnsureOrderedCompatibilityCheck(EClass ctxClass, EStructuralFeature right) throws FeatureMustBeSingleValuedException  {
		super( null, "ordered compatibility for "+ctxClass.getName()+"; itself and feature "+right.getName(), ctxClass, null, right ); 
	}
	public EnsureOrderedCompatibilityCheck(String errorMessage, EClass ctxClass, EStructuralFeature right) throws FeatureMustBeSingleValuedException  {
		super( errorMessage, "ordered compatibility for "+ctxClass.getName()+"; itself and feature "+right.getName(), ctxClass, null, right ); 
	}
	public EnsureOrderedCompatibilityCheck(EClass ctxClass, EStructuralFeature left, EStructuralFeature right) throws FeatureMustBeSingleValuedException  {
		super( null, "unordered compatibility for "+ctxClass.getName()+"; feature "+left.getName()+" and feature "+right.getName(), ctxClass, left, right );
	}
	public EnsureOrderedCompatibilityCheck(String errorMessage, EClass ctxClass, EStructuralFeature left, EStructuralFeature right) throws FeatureMustBeSingleValuedException  {
		super( errorMessage, "unordered compatibility for "+ctxClass.getName()+"; feature "+left.getName()+" and feature "+right.getName(), ctxClass, left, right );
	}
	public boolean check( EObject element, ITypesystem ts, TypeCalculationTrace trace, ValidationMessageAcceptor acceptor, boolean showWarnings ) {
		EObject leftVal;
		if ( feature1 != null ) {
			leftVal = (EObject) element.eGet(feature1);
		} else {
			leftVal = element;
		}
		EObject rightVal = (EObject) element.eGet(feature2);
		if ( rightVal != null ) {
			EObject leftType = ts.typeof(leftVal, trace.child(feature1 != null ? feature1.getName() : "self", leftVal));
			EObject rightType = ts.typeof(rightVal, trace.child(feature2.getName(), rightVal));
			if ( showWarnings && leftType == null ) {
				trace.add(leftVal, "type of feature '"+feature1.getName()+"' is undefined");
				acceptor.acceptWarning("type of feature '"+feature1.getName()+"' is undefined", element, feature1, -1, null);
			} else if ( showWarnings && rightType == null ){
				trace.add(leftVal, "type of feature '"+feature2.getName()+"' is undefined");
				acceptor.acceptWarning("type of feature '"+feature2.getName()+"' is undefined", element, feature2, -1, null);
			} 
			if ( ts.isCompatibleTypeOrdered(leftVal, leftType, rightVal, rightType, trace) ) return true;
			String m = errorMessage != null ? errorMessage : "incompatible type "+ts.typeString(leftType)+" and "+ts.typeString(rightType)+" (on a "+ctxClass.getName()+")"; 
			acceptor.acceptError(m, element, feature2, -1, null);
			return false;
		}
		return true; 
	}
}


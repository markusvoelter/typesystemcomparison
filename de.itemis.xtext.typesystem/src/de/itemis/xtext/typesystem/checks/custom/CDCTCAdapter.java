package de.itemis.xtext.typesystem.checks.custom;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.checks.ISingleElementTypesystemCheck;
import de.itemis.xtext.typesystem.checks.custom.ContextDependentCustomTypeChecker.Result;
import de.itemis.xtext.typesystem.checks.custom.ContextDependentCustomTypeChecker.TypeIsInvalid;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class CDCTCAdapter implements ISingleElementTypesystemCheck {
	private ContextDependentCustomTypeChecker checker;
	public CDCTCAdapter( ContextDependentCustomTypeChecker checker ) {
		this.checker = checker;
	}
	public void appendTraceInfo(List<String> collector, EObject element, String level) {
	}
	
	public boolean isApplicable(EObject element) {
		return checker.getContextType().isInstance(element);
	}
	
	@Override
	public boolean check(EObject element, ITypesystem ts,
			TypeCalculationTrace trace, ValidationMessageAcceptor acceptor,
			boolean showWarnings) {
		Result res = checker.isValidType(element, ts, trace);
		if ( res instanceof TypeIsInvalid) {
			TypeIsInvalid inv = (TypeIsInvalid) res;
			acceptor.acceptError("incompatible type; expected "+ts.typeString(inv.getExpectedType())+
					", actual "+ts.typeString(inv.getActualType())+"(on a "+element.eClass().getName()+")", element, inv.getFeature(), inv.getIndex(), null, trace.toStringArray());
		}
		return true;
	}
	
}


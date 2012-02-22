package org.typesys.xsem.guidsl.xsemantics;

import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.typesys.xsem.guidsl.xsemGuiDsl.Attribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanType;
import org.typesys.xsem.guidsl.xsemGuiDsl.DerivedAttribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.Expression;
import org.typesys.xsem.guidsl.xsemGuiDsl.FloatType;
import org.typesys.xsem.guidsl.xsemGuiDsl.NumberLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.SimpleAttribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.StringLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.StringType;
import org.typesys.xsem.guidsl.xsemGuiDsl.Type;
import org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslFactory;

public class TypeSystem extends XsemanticsRuntimeSystem {
	public final static String SIMPLEATTRIBUTETYPE = "org.typesys.xsem.guidsl.xsemantics.rules.SimpleAttributeType";
	public final static String DERIVEDATTRIBUTETYPE = "org.typesys.xsem.guidsl.xsemantics.rules.DerivedAttributeType";
	public final static String BOOLEANLITERALTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.BooleanLiteralType";
	public final static String STRINGLITERALTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.StringLiteralType";
	public final static String NUMBERLITERALTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.NumberLiteralType";

	protected PolymorphicDispatcher<Result<Type>> attrtypeDispatcher;
	
	protected PolymorphicDispatcher<Result<Type>> exprtypeDispatcher;

	public TypeSystem() {
		init();
	}

	public void init() {
		attrtypeDispatcher = buildPolymorphicDispatcher1(
			"attrtypeImpl", 3, "||-", ":");
		exprtypeDispatcher = buildPolymorphicDispatcher1(
			"exprtypeImpl", 3, "|-", ":");
	}

	public Result<Type> attrtype(final Attribute attribute) {
		return attrtype(new RuleEnvironment(),
			null, attribute);
	}
	
	public Result<Type> attrtype(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_,
			final Attribute attribute) {
		try {
			return attrtypeInternal(_environment_, _trace_, attribute);
		} catch (Exception e) {
			return resultForFailure(e);
		}
	}
	
	public Result<Type> exprtype(final Expression expression) {
		return exprtype(new RuleEnvironment(),
			null, expression);
	}
	
	public Result<Type> exprtype(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_,
			final Expression expression) {
		try {
			return exprtypeInternal(_environment_, _trace_, expression);
		} catch (Exception e) {
			return resultForFailure(e);
		}
	}


	protected Result<Type> attrtypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_,
			final Attribute attribute) {
		try {
			checkParamsNotNull(attribute);
			return attrtypeDispatcher.invoke(_environment_, _trace_, attribute);
		} catch (Exception e) {
			sneakyThrowRuleFailedException(e);
			return null;
		}
	}
	
	protected Result<Type> exprtypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_,
			final Expression expression) {
		try {
			checkParamsNotNull(expression);
			return exprtypeDispatcher.invoke(_environment_, _trace_, expression);
		} catch (Exception e) {
			sneakyThrowRuleFailedException(e);
			return null;
		}
	}
	
	protected Result<Type> attrtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final SimpleAttribute attr) 
			throws RuleFailedException {
		try {
			RuleApplicationTrace _subtrace_ = newTrace(_trace_);
			Result<Type> _result_ = applyRuleSimpleAttributeType(G, _subtrace_, attr);
			addToTrace(_trace_, ruleName("SimpleAttributeType") + stringRepForEnv(G) + " ||- " + stringRep(attr) + " : " + stringRep(_result_.getFirst()));
			addAsSubtrace(_trace_, _subtrace_);
			return _result_;
		} catch (Exception e_applyRuleSimpleAttributeType) {
			throwRuleFailedException(ruleName("SimpleAttributeType") + stringRepForEnv(G) + " ||- " + stringRep(attr) + " : " + "Type",
				SIMPLEATTRIBUTETYPE,
				e_applyRuleSimpleAttributeType, new ErrorInformation(attr));
			return null;
		}
	}
	
	protected Result<Type> applyRuleSimpleAttributeType(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final SimpleAttribute attr) 
			throws RuleFailedException {
		
		Type _type = attr.getType();
		return new Result<Type>(_type);
	}
	
	protected Result<Type> attrtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final DerivedAttribute attr) 
			throws RuleFailedException {
		try {
			RuleApplicationTrace _subtrace_ = newTrace(_trace_);
			Result<Type> _result_ = applyRuleDerivedAttributeType(G, _subtrace_, attr);
			addToTrace(_trace_, ruleName("DerivedAttributeType") + stringRepForEnv(G) + " ||- " + stringRep(attr) + " : " + stringRep(_result_.getFirst()));
			addAsSubtrace(_trace_, _subtrace_);
			return _result_;
		} catch (Exception e_applyRuleDerivedAttributeType) {
			throwRuleFailedException(ruleName("DerivedAttributeType") + stringRepForEnv(G) + " ||- " + stringRep(attr) + " : " + "Type",
				DERIVEDATTRIBUTETYPE,
				e_applyRuleDerivedAttributeType, new ErrorInformation(attr));
			return null;
		}
	}
	
	protected Result<Type> applyRuleDerivedAttributeType(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final DerivedAttribute attr) 
			throws RuleFailedException {
		Type attrType = null;
		
		/* G |- attr.expr : attrType */
		Expression _expr = attr.getExpr();
		Result<Type> result = exprtypeInternal(G, _trace_, _expr);
		checkAssignableTo(result.getFirst(), Type.class);
		attrType = (Type) result.getFirst();
		
		return new Result<Type>(attrType);
	}
	
	protected Result<Type> exprtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final BooleanLiteral lit) 
			throws RuleFailedException {
		try {
			RuleApplicationTrace _subtrace_ = newTrace(_trace_);
			Result<Type> _result_ = applyRuleBooleanLiteralType(G, _subtrace_, lit);
			addToTrace(_trace_, ruleName("BooleanLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + stringRep(_result_.getFirst()));
			addAsSubtrace(_trace_, _subtrace_);
			return _result_;
		} catch (Exception e_applyRuleBooleanLiteralType) {
			throwRuleFailedException(ruleName("BooleanLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + "BooleanType",
				BOOLEANLITERALTYPE,
				e_applyRuleBooleanLiteralType, new ErrorInformation(lit));
			return null;
		}
	}
	
	protected Result<Type> applyRuleBooleanLiteralType(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final BooleanLiteral lit) 
			throws RuleFailedException {
		
		BooleanType _createBooleanType = XsemGuiDslFactory.eINSTANCE.createBooleanType();
		return new Result<Type>(_createBooleanType);
	}
	
	protected Result<Type> exprtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final StringLiteral lit) 
			throws RuleFailedException {
		try {
			RuleApplicationTrace _subtrace_ = newTrace(_trace_);
			Result<Type> _result_ = applyRuleStringLiteralType(G, _subtrace_, lit);
			addToTrace(_trace_, ruleName("StringLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + stringRep(_result_.getFirst()));
			addAsSubtrace(_trace_, _subtrace_);
			return _result_;
		} catch (Exception e_applyRuleStringLiteralType) {
			throwRuleFailedException(ruleName("StringLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + "StringType",
				STRINGLITERALTYPE,
				e_applyRuleStringLiteralType, new ErrorInformation(lit));
			return null;
		}
	}
	
	protected Result<Type> applyRuleStringLiteralType(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final StringLiteral lit) 
			throws RuleFailedException {
		
		StringType _createStringType = XsemGuiDslFactory.eINSTANCE.createStringType();
		return new Result<Type>(_createStringType);
	}
	
	protected Result<Type> exprtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final NumberLiteral lit) 
			throws RuleFailedException {
		try {
			RuleApplicationTrace _subtrace_ = newTrace(_trace_);
			Result<Type> _result_ = applyRuleNumberLiteralType(G, _subtrace_, lit);
			addToTrace(_trace_, ruleName("NumberLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + stringRep(_result_.getFirst()));
			addAsSubtrace(_trace_, _subtrace_);
			return _result_;
		} catch (Exception e_applyRuleNumberLiteralType) {
			throwRuleFailedException(ruleName("NumberLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + "FloatType",
				NUMBERLITERALTYPE,
				e_applyRuleNumberLiteralType, new ErrorInformation(lit));
			return null;
		}
	}
	
	protected Result<Type> applyRuleNumberLiteralType(final RuleEnvironment G, final RuleApplicationTrace _trace_,
			final NumberLiteral lit) 
			throws RuleFailedException {
		
		FloatType _createFloatType = XsemGuiDslFactory.eINSTANCE.createFloatType();
		return new Result<Type>(_createFloatType);
	}
}

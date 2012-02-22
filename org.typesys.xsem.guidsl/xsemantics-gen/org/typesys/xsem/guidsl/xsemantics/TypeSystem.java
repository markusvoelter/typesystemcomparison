package org.typesys.xsem.guidsl.xsemantics;

import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.typesys.xsem.guidsl.xsemGuiDsl.Attribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanType;
import org.typesys.xsem.guidsl.xsemGuiDsl.CheckBoxWidget;
import org.typesys.xsem.guidsl.xsemGuiDsl.DerivedAttribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.Expression;
import org.typesys.xsem.guidsl.xsemGuiDsl.FloatType;
import org.typesys.xsem.guidsl.xsemGuiDsl.NumberLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.SimpleAttribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.StringLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.StringType;
import org.typesys.xsem.guidsl.xsemGuiDsl.TextWidget;
import org.typesys.xsem.guidsl.xsemGuiDsl.Type;
import org.typesys.xsem.guidsl.xsemGuiDsl.Widget;
import org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslFactory;
import org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslPackage;

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

	public Result<Boolean> validateMustBeBoolean(final Widget widget) {
		try {
			return validateMustBeBooleanInternal(null, widget);
		} catch (Exception e) {
			return resultForFailure(e);
		}
	}
	
	public Result<Boolean> validateMustBeBooleanInternal(final RuleApplicationTrace _trace_, final Widget widget) 
			throws RuleFailedException {
		
		/* widget.validate == null or { empty |- widget.validate : var BooleanType boolType or fail error "validate expression must be boolean" source widget.validate } */
		try {
		  Expression _validate = widget.getValidate();
		  boolean _operator_equals = ObjectExtensions.operator_equals(_validate, null);
		  /* widget.validate == null */
		  if (!_operator_equals) {
		    sneakyThrowRuleFailedException("widget.validate == null");
		  }
		} catch (Exception e) {
		  /* empty |- widget.validate : var BooleanType boolType or fail error "validate expression must be boolean" source widget.validate */
		  try {
		    /* empty |- widget.validate : var BooleanType boolType */
		    Expression _validate_1 = widget.getValidate();
		    BooleanType boolType = null;
		    Result<Type> result = exprtypeInternal(emptyEnvironment(), _trace_, _validate_1);
		    checkAssignableTo(result.getFirst(), BooleanType.class);
		    boolType = (BooleanType) result.getFirst();
		    
		  } catch (Exception e_1) {
		    /* fail error "validate expression must be boolean" source widget.validate */
		    String error = "validate expression must be boolean";
		    Expression _validate_2 = widget.getValidate();
		    EObject source = _validate_2;
		    throwForExplicitFail(error, new ErrorInformation(source, null));
		  }
		}
		return new Result<Boolean>(true);
	}
	
	public Result<Boolean> validateTextWidgetAttributeNotBoolean(final TextWidget widget) {
		try {
			return validateTextWidgetAttributeNotBooleanInternal(null, widget);
		} catch (Exception e) {
			return resultForFailure(e);
		}
	}
	
	public Result<Boolean> validateTextWidgetAttributeNotBooleanInternal(final RuleApplicationTrace _trace_, final TextWidget widget) 
			throws RuleFailedException {
		
		{
		  /* empty ||- widget.attr : var Type attrType */
		  Attribute _attr = widget.getAttr();
		  Type attrType = null;
		  Result<Type> result = attrtypeInternal(emptyEnvironment(), _trace_, _attr);
		  checkAssignableTo(result.getFirst(), Type.class);
		  attrType = (Type) result.getFirst();
		  
		  /* !(attrType instanceof BooleanType) or fail error "text widget attribute must NOT be boolean" source widget feature XsemGuiDslPackage::eINSTANCE.widget_Attr */
		  try {
		    boolean _operator_not = BooleanExtensions.operator_not((attrType instanceof BooleanType));
		    /* !(attrType instanceof BooleanType) */
		    if (!_operator_not) {
		      sneakyThrowRuleFailedException("!(attrType instanceof BooleanType)");
		    }
		  } catch (Exception e) {
		    /* fail error "text widget attribute must NOT be boolean" source widget feature XsemGuiDslPackage::eINSTANCE.widget_Attr */
		    String error = "text widget attribute must NOT be boolean";
		    EObject source = widget;
		    EReference _widget_Attr = XsemGuiDslPackage.eINSTANCE.getWidget_Attr();
		    EStructuralFeature feature = _widget_Attr;
		    throwForExplicitFail(error, new ErrorInformation(source, feature));
		  }
		}
		return new Result<Boolean>(true);
	}
	
	public Result<Boolean> validateCheckBoxWidgetAttributeBoolean(final CheckBoxWidget widget) {
		try {
			return validateCheckBoxWidgetAttributeBooleanInternal(null, widget);
		} catch (Exception e) {
			return resultForFailure(e);
		}
	}
	
	public Result<Boolean> validateCheckBoxWidgetAttributeBooleanInternal(final RuleApplicationTrace _trace_, final CheckBoxWidget widget) 
			throws RuleFailedException {
		
		/* empty ||- widget.attr : var BooleanType attrType or fail error "checkbox widget attribute must be boolean" source widget feature XsemGuiDslPackage::eINSTANCE.widget_Attr */
		try {
		  /* empty ||- widget.attr : var BooleanType attrType */
		  Attribute _attr = widget.getAttr();
		  BooleanType attrType = null;
		  Result<Type> result = attrtypeInternal(emptyEnvironment(), _trace_, _attr);
		  checkAssignableTo(result.getFirst(), BooleanType.class);
		  attrType = (BooleanType) result.getFirst();
		  
		} catch (Exception e) {
		  /* fail error "checkbox widget attribute must be boolean" source widget feature XsemGuiDslPackage::eINSTANCE.widget_Attr */
		  String error = "checkbox widget attribute must be boolean";
		  EObject source = widget;
		  EReference _widget_Attr = XsemGuiDslPackage.eINSTANCE.getWidget_Attr();
		  EStructuralFeature feature = _widget_Attr;
		  throwForExplicitFail(error, new ErrorInformation(source, feature));
		}
		return new Result<Boolean>(true);
	}

	protected void attrtypeThrowException(String _issue, Exception _ex, final Attribute attribute) 
			throws RuleFailedException {
		
		String _stringRep = this.stringRep(attribute);
		String _operator_plus = StringExtensions.operator_plus("cannot type attribute ", _stringRep);
		String error = _operator_plus;
		EObject source = attribute;
		throwRuleFailedException(error,
				_issue, _ex,
				new ErrorInformation(source, null));
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
	
	protected void exprtypeThrowException(String _issue, Exception _ex, final Expression expression) 
			throws RuleFailedException {
		
		String _stringRep = this.stringRep(expression);
		String _operator_plus = StringExtensions.operator_plus("cannot type expression ", _stringRep);
		String error = _operator_plus;
		EObject source = expression;
		throwRuleFailedException(error,
				_issue, _ex,
				new ErrorInformation(source, null));
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
			attrtypeThrowException(SIMPLEATTRIBUTETYPE,
				e_applyRuleSimpleAttributeType, attr);
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
			attrtypeThrowException(DERIVEDATTRIBUTETYPE,
				e_applyRuleDerivedAttributeType, attr);
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
			exprtypeThrowException(BOOLEANLITERALTYPE,
				e_applyRuleBooleanLiteralType, lit);
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
			exprtypeThrowException(STRINGLITERALTYPE,
				e_applyRuleStringLiteralType, lit);
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
			exprtypeThrowException(NUMBERLITERALTYPE,
				e_applyRuleNumberLiteralType, lit);
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

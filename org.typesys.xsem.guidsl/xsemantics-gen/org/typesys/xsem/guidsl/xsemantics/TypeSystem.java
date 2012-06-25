package org.typesys.xsem.guidsl.xsemantics;

import com.google.common.base.Objects;
import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.typesys.xsem.guidsl.xsemGuiDsl.AndOrExpression;
import org.typesys.xsem.guidsl.xsemGuiDsl.ArithmeticSigned;
import org.typesys.xsem.guidsl.xsemGuiDsl.Attribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.AttributeRef;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanNegation;
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanType;
import org.typesys.xsem.guidsl.xsemGuiDsl.CheckBoxWidget;
import org.typesys.xsem.guidsl.xsemGuiDsl.Comparison;
import org.typesys.xsem.guidsl.xsemGuiDsl.Entity;
import org.typesys.xsem.guidsl.xsemGuiDsl.EntityType;
import org.typesys.xsem.guidsl.xsemGuiDsl.Equals;
import org.typesys.xsem.guidsl.xsemGuiDsl.Expression;
import org.typesys.xsem.guidsl.xsemGuiDsl.FieldContent;
import org.typesys.xsem.guidsl.xsemGuiDsl.FloatType;
import org.typesys.xsem.guidsl.xsemGuiDsl.IntType;
import org.typesys.xsem.guidsl.xsemGuiDsl.LenghtOf;
import org.typesys.xsem.guidsl.xsemGuiDsl.Minus;
import org.typesys.xsem.guidsl.xsemGuiDsl.MultiOrDiv;
import org.typesys.xsem.guidsl.xsemGuiDsl.NumberLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.NumberType;
import org.typesys.xsem.guidsl.xsemGuiDsl.Plus;
import org.typesys.xsem.guidsl.xsemGuiDsl.StringLiteral;
import org.typesys.xsem.guidsl.xsemGuiDsl.StringType;
import org.typesys.xsem.guidsl.xsemGuiDsl.TextWidget;
import org.typesys.xsem.guidsl.xsemGuiDsl.Typable;
import org.typesys.xsem.guidsl.xsemGuiDsl.Type;
import org.typesys.xsem.guidsl.xsemGuiDsl.Widget;
import org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslFactory;
import org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslPackage;

public class TypeSystem extends XsemanticsRuntimeSystem {
  public final static String ATTRIBUTETYPE = "org.typesys.xsem.guidsl.xsemantics.rules.AttributeType";
  
  public final static String BOOLEANLITERALTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.BooleanLiteralType";
  
  public final static String STRINGLITERALTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.StringLiteralType";
  
  public final static String NUMBERLITERALTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.NumberLiteralType";
  
  public final static String FIELDCONTENTTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.FieldContentType";
  
  public final static String NEWENTITYTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.NewEntityType";
  
  public final static String LENGTHOFTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.LengthOfType";
  
  public final static String ATTRIBUTEREFTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.AttributeRefType";
  
  public final static String MULTIORDIVTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.MultiOrDivType";
  
  public final static String MINUSTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.MinusType";
  
  public final static String PLUSTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.PlusType";
  
  public final static String COMPARISONTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.ComparisonType";
  
  public final static String EQUALSTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.EqualsType";
  
  public final static String ANDORTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.AndOrType";
  
  public final static String BOOLEANNEGATIONTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.BooleanNegationType";
  
  public final static String ARITHMETICSIGNEDTYPE = "org.typesys.xsem.guidsl.xsemantics.rules.ArithmeticSignedType";
  
  public final static String ISASSIGNABLEBASE = "org.typesys.xsem.guidsl.xsemantics.rules.IsAssignableBase";
  
  public final static String ENTITYTYPEASSIGNABLE = "org.typesys.xsem.guidsl.xsemantics.rules.EntityTypeAssignable";
  
  public final static String BOOLEANASSIGNABLETOSTRING = "org.typesys.xsem.guidsl.xsemantics.rules.BooleanAssignableToString";
  
  public final static String INTASSIGNABLETOSTRING = "org.typesys.xsem.guidsl.xsemantics.rules.IntAssignableToString";
  
  public final static String INTASSIGNABLETOFLOAT = "org.typesys.xsem.guidsl.xsemantics.rules.IntAssignableToFloat";
  
  public final static String MOSTGENERAL = "org.typesys.xsem.guidsl.xsemantics.rules.MostGeneral";
  
  private PolymorphicDispatcher<Result<Type>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> isAssignableDispatcher;
  
  private PolymorphicDispatcher<Result<Type>> mostGeneralDispatcher;
  
  public TypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    isAssignableDispatcher = buildPolymorphicDispatcher1(
    	"isAssignableImpl", 4, "|-", "<~");
    mostGeneralDispatcher = buildPolymorphicDispatcher1(
    	"mostGeneralImpl", 4, "|-", "~~", "|>");
  }
  
  public Result<Type> type(final Typable typable) {
    return type(new RuleEnvironment(), null, typable);
  } 
  
  public Result<Type> type(final RuleEnvironment _environment_, final Typable typable) {
    return type(_environment_, null, typable);
  }
  
  public Result<Type> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Typable typable) {
    try {
    	return typeInternal(_environment_, _trace_, typable);
    } catch (Exception _e_type) {
    	return resultForFailure(_e_type);
    }
  }
  
  public Result<Boolean> isAssignable(final Type left, final Type right) {
    return isAssignable(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> isAssignable(final RuleEnvironment _environment_, final Type left, final Type right) {
    return isAssignable(_environment_, null, left, right);
  }
  
  public Result<Boolean> isAssignable(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Type left, final Type right) {
    try {
    	return isAssignableInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_isAssignable) {
    	return resultForFailure(_e_isAssignable);
    }
  }
  
  public Result<Type> mostGeneral(final Type first, final Type second) {
    return mostGeneral(new RuleEnvironment(), null, first, second);
  }
  
  public Result<Type> mostGeneral(final RuleEnvironment _environment_, final Type first, final Type second) {
    return mostGeneral(_environment_, null, first, second);
  }
  
  public Result<Type> mostGeneral(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Type first, final Type second) {
    try {
    	return mostGeneralInternal(_environment_, _trace_, first, second);
    } catch (Exception _e_mostGeneral) {
    	return resultForFailure(_e_mostGeneral);
    }
  }
  
  public Result<Boolean> acyclicEntityHierarchy(final Entity entity) {
    try {
    	return acyclicEntityHierarchyInternal(null, entity);
    } catch (Exception e) {
    	return resultForFailure(e);
    }
  }
  
  protected Result<Boolean> acyclicEntityHierarchyInternal(final RuleApplicationTrace _trace_, final Entity entity) throws RuleFailedException {
    
    Entity _superType = entity.getSuperType();
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      /* !getAll(entity, XsemGuiDslPackage::eINSTANCE.entity_SuperType, XsemGuiDslPackage::eINSTANCE.entity_SuperType, typeof(Entity) ).contains(entity) or fail error "Cyclic hierarchy for " + entity.name source entity */
      try {
        EReference _entity_SuperType = XsemGuiDslPackage.eINSTANCE.getEntity_SuperType();
        EReference _entity_SuperType_1 = XsemGuiDslPackage.eINSTANCE.getEntity_SuperType();
        List<Entity> _all = this.<Entity>getAll(entity, _entity_SuperType, _entity_SuperType_1, 
          Entity.class);
        boolean _contains = _all.contains(entity);
        boolean _not = (!_contains);
        /* !getAll(entity, XsemGuiDslPackage::eINSTANCE.entity_SuperType, XsemGuiDslPackage::eINSTANCE.entity_SuperType, typeof(Entity) ).contains(entity) */
        if (!_not) {
          sneakyThrowRuleFailedException("!getAll(entity, XsemGuiDslPackage::eINSTANCE.entity_SuperType, XsemGuiDslPackage::eINSTANCE.entity_SuperType, typeof(Entity) ).contains(entity)");
        }
      } catch (Exception e) {
        /* fail error "Cyclic hierarchy for " + entity.name source entity */
        String _name = entity.getName();
        String _plus = ("Cyclic hierarchy for " + _name);
        String error = _plus;
        EObject source = entity;
        throwForExplicitFail(error, new ErrorInformation(source, null));
      }
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> attributeTypeChecks(final Attribute attribute) {
    try {
    	return attributeTypeChecksInternal(null, attribute);
    } catch (Exception e) {
    	return resultForFailure(e);
    }
  }
  
  protected Result<Boolean> attributeTypeChecksInternal(final RuleApplicationTrace _trace_, final Attribute attribute) throws RuleFailedException {
    
    /* empty |- attribute : var Type type */
    Type type = null;
    Result<Type> result = typeInternal(emptyEnvironment(), _trace_, attribute);
    checkAssignableTo(result.getFirst(), Type.class);
    type = (Type) result.getFirst();
    
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> validateMustBeBoolean(final Widget widget) {
    try {
    	return validateMustBeBooleanInternal(null, widget);
    } catch (Exception e) {
    	return resultForFailure(e);
    }
  }
  
  protected Result<Boolean> validateMustBeBooleanInternal(final RuleApplicationTrace _trace_, final Widget widget) throws RuleFailedException {
    
    /* widget.validate == null or { 'widgetcontent' <- widget.attr |- widget.validate : var BooleanType boolType or fail error "validate expression must be boolean" source widget.validate } */
    try {
      Expression _validate = widget.getValidate();
      boolean _equals = Objects.equal(_validate, null);
      /* widget.validate == null */
      if (!_equals) {
        sneakyThrowRuleFailedException("widget.validate == null");
      }
    } catch (Exception e) {
      /* 'widgetcontent' <- widget.attr |- widget.validate : var BooleanType boolType or fail error "validate expression must be boolean" source widget.validate */
      try {
        /* 'widgetcontent' <- widget.attr |- widget.validate : var BooleanType boolType */
        Expression _validate_1 = widget.getValidate();
        BooleanType boolType = null;
        Attribute _attr = widget.getAttr();
        Result<Type> result = typeInternal(environmentEntry("widgetcontent", _attr), _trace_, _validate_1);
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
  
  protected Result<Boolean> validateTextWidgetAttributeNotBooleanInternal(final RuleApplicationTrace _trace_, final TextWidget widget) throws RuleFailedException {
    
    {
      /* 'widgetcontent' <- widget.attr |- widget.attr : var Type attrType */
      Attribute _attr = widget.getAttr();
      Type attrType = null;
      Attribute _attr_1 = widget.getAttr();
      Result<Type> result = typeInternal(environmentEntry("widgetcontent", _attr_1), _trace_, _attr);
      checkAssignableTo(result.getFirst(), Type.class);
      attrType = (Type) result.getFirst();
      
      /* !(attrType instanceof BooleanType) or fail error "text widget attribute must NOT be boolean" source widget feature XsemGuiDslPackage::eINSTANCE.widget_Attr */
      try {
        boolean _not = (!(attrType instanceof BooleanType));
        /* !(attrType instanceof BooleanType) */
        if (!_not) {
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
  
  protected Result<Boolean> validateCheckBoxWidgetAttributeBooleanInternal(final RuleApplicationTrace _trace_, final CheckBoxWidget widget) throws RuleFailedException {
    
    /* 'widgetcontent' <- widget.attr |- widget.attr : var BooleanType attrType or fail error "checkbox widget attribute must be boolean" source widget feature XsemGuiDslPackage::eINSTANCE.widget_Attr */
    try {
      /* 'widgetcontent' <- widget.attr |- widget.attr : var BooleanType attrType */
      Attribute _attr = widget.getAttr();
      BooleanType attrType = null;
      Attribute _attr_1 = widget.getAttr();
      Result<Type> result = typeInternal(environmentEntry("widgetcontent", _attr_1), _trace_, _attr);
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
  
  protected Result<Type> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Typable typable) {
    try {
    	checkParamsNotNull(typable);
    	return typeDispatcher.invoke(_environment_, _trace_, typable);
    } catch (Exception _e_type) {
    	sneakyThrowRuleFailedException(_e_type);
    	return null;
    }
  }
  
  protected void typeThrowException(final String _issue, final Exception _ex, final Typable typable) throws RuleFailedException {
    
    String _stringRep = this.stringRep(typable);
    String _plus = ("cannot type " + _stringRep);
    String error = _plus;
    EObject source = typable;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(source, null));
  }
  
  protected Result<Boolean> isAssignableInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Type left, final Type right) {
    try {
    	checkParamsNotNull(left, right);
    	return isAssignableDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_isAssignable) {
    	sneakyThrowRuleFailedException(_e_isAssignable);
    	return null;
    }
  }
  
  protected void isAssignableThrowException(final String _issue, final Exception _ex, final Type left, final Type right) throws RuleFailedException {
    
    String _stringRep = this.stringRep(right);
    String _plus = (_stringRep + " is not assignable to ");
    String _stringRep_1 = this.stringRep(left);
    String _plus_1 = (_plus + _stringRep_1);
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Type> mostGeneralInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Type first, final Type second) {
    try {
    	checkParamsNotNull(first, second);
    	return mostGeneralDispatcher.invoke(_environment_, _trace_, first, second);
    } catch (Exception _e_mostGeneral) {
    	sneakyThrowRuleFailedException(_e_mostGeneral);
    	return null;
    }
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Attribute attr) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleAttributeType(G, _subtrace_, attr);
      addToTrace(_trace_, ruleName("AttributeType") + stringRepForEnv(G) + " |- " + stringRep(attr) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleAttributeType) {
      typeThrowException(ATTRIBUTETYPE,
      	e_applyRuleAttributeType, attr);
      return null;
    }
  }
  
  protected Result<Type> applyRuleAttributeType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Attribute attr) throws RuleFailedException {
    Type attrType = null; // output parameter
    
    Type _type = attr.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      {
        Expression _expr = attr.getExpr();
        boolean _notEquals_1 = (!Objects.equal(_expr, null));
        if (_notEquals_1) {
          {
            /* G |- attr.expr : var Type expType */
            Expression _expr_1 = attr.getExpr();
            Type expType = null;
            Result<Type> result = typeInternal(G, _trace_, _expr_1);
            checkAssignableTo(result.getFirst(), Type.class);
            expType = (Type) result.getFirst();
            
            /* G |- attr.type <~ expType or fail error "cannot assign " + stringRep(expType) + " to " + stringRep(attr.type) source attr feature XsemGuiDslPackage::eINSTANCE.attribute_Expr */
            try {
              /* G |- attr.type <~ expType */
              Type _type_1 = attr.getType();
              isAssignableInternal(G, _trace_, _type_1, expType);
            } catch (Exception e) {
              /* fail error "cannot assign " + stringRep(expType) + " to " + stringRep(attr.type) source attr feature XsemGuiDslPackage::eINSTANCE.attribute_Expr */
              String _stringRep = this.stringRep(expType);
              String _plus = ("cannot assign " + _stringRep);
              String _plus_1 = (_plus + 
                " to ");
              Type _type_2 = attr.getType();
              String _stringRep_1 = this.stringRep(_type_2);
              String _plus_2 = (_plus_1 + _stringRep_1);
              String error = _plus_2;
              EObject source = attr;
              EReference _attribute_Expr = XsemGuiDslPackage.eINSTANCE.getAttribute_Expr();
              EStructuralFeature feature = _attribute_Expr;
              throwForExplicitFail(error, new ErrorInformation(source, feature));
            }
          }
        }
        Type _type_3 = attr.getType();
        attrType = _type_3;
      }
    } else {
      /* G |- attr.expr : attrType */
      Expression _expr_2 = attr.getExpr();
      Result<Type> result_1 = typeInternal(G, _trace_, _expr_2);
      checkAssignableTo(result_1.getFirst(), Type.class);
      attrType = (Type) result_1.getFirst();
      
    }
    return new Result<Type>(attrType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final BooleanLiteral lit) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleBooleanLiteralType(G, _subtrace_, lit);
      addToTrace(_trace_, ruleName("BooleanLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleBooleanLiteralType) {
      typeThrowException(BOOLEANLITERALTYPE,
      	e_applyRuleBooleanLiteralType, lit);
      return null;
    }
  }
  
  protected Result<Type> applyRuleBooleanLiteralType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final BooleanLiteral lit) throws RuleFailedException {
    
    BooleanType _createBooleanType = XsemGuiDslFactory.eINSTANCE.createBooleanType();
    return new Result<Type>(_createBooleanType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringLiteral lit) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleStringLiteralType(G, _subtrace_, lit);
      addToTrace(_trace_, ruleName("StringLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleStringLiteralType) {
      typeThrowException(STRINGLITERALTYPE,
      	e_applyRuleStringLiteralType, lit);
      return null;
    }
  }
  
  protected Result<Type> applyRuleStringLiteralType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringLiteral lit) throws RuleFailedException {
    
    StringType _createStringType = XsemGuiDslFactory.eINSTANCE.createStringType();
    return new Result<Type>(_createStringType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final NumberLiteral lit) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleNumberLiteralType(G, _subtrace_, lit);
      addToTrace(_trace_, ruleName("NumberLiteralType") + stringRepForEnv(G) + " |- " + stringRep(lit) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleNumberLiteralType) {
      typeThrowException(NUMBERLITERALTYPE,
      	e_applyRuleNumberLiteralType, lit);
      return null;
    }
  }
  
  protected Result<Type> applyRuleNumberLiteralType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final NumberLiteral lit) throws RuleFailedException {
    
    FloatType _createFloatType = XsemGuiDslFactory.eINSTANCE.createFloatType();
    return new Result<Type>(_createFloatType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final FieldContent fieldContent) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleFieldContentType(G, _subtrace_, fieldContent);
      addToTrace(_trace_, ruleName("FieldContentType") + stringRepForEnv(G) + " |- " + stringRep(fieldContent) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleFieldContentType) {
      typeThrowException(FIELDCONTENTTYPE,
      	e_applyRuleFieldContentType, fieldContent);
      return null;
    }
  }
  
  protected Result<Type> applyRuleFieldContentType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final FieldContent fieldContent) throws RuleFailedException {
    Type type = null; // output parameter
    
    /* G |- env(G, 'widgetcontent', Attribute) : type */
    /* env(G, 'widgetcontent', Attribute) */
    Attribute _environmentaccess = environmentAccess(G, "widgetcontent", Attribute.class);
    Result<Type> result = typeInternal(G, _trace_, _environmentaccess);
    checkAssignableTo(result.getFirst(), Type.class);
    type = (Type) result.getFirst();
    
    return new Result<Type>(type);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final EntityType newEntity) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleNewEntityType(G, _subtrace_, newEntity);
      addToTrace(_trace_, ruleName("NewEntityType") + stringRepForEnv(G) + " |- " + stringRep(newEntity) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleNewEntityType) {
      typeThrowException(NEWENTITYTYPE,
      	e_applyRuleNewEntityType, newEntity);
      return null;
    }
  }
  
  protected Result<Type> applyRuleNewEntityType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final EntityType newEntity) throws RuleFailedException {
    
    return new Result<Type>(newEntity);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final LenghtOf len) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleLengthOfType(G, _subtrace_, len);
      addToTrace(_trace_, ruleName("LengthOfType") + stringRepForEnv(G) + " |- " + stringRep(len) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleLengthOfType) {
      typeThrowException(LENGTHOFTYPE,
      	e_applyRuleLengthOfType, len);
      return null;
    }
  }
  
  protected Result<Type> applyRuleLengthOfType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final LenghtOf len) throws RuleFailedException {
    
    /* G |- len.expr : var StringType stringType */
    Expression _expr = len.getExpr();
    StringType stringType = null;
    Result<Type> result = typeInternal(G, _trace_, _expr);
    checkAssignableTo(result.getFirst(), StringType.class);
    stringType = (StringType) result.getFirst();
    
    IntType _createIntType = XsemGuiDslFactory.eINSTANCE.createIntType();
    return new Result<Type>(_createIntType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AttributeRef attrRef) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleAttributeRefType(G, _subtrace_, attrRef);
      addToTrace(_trace_, ruleName("AttributeRefType") + stringRepForEnv(G) + " |- " + stringRep(attrRef) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleAttributeRefType) {
      typeThrowException(ATTRIBUTEREFTYPE,
      	e_applyRuleAttributeRefType, attrRef);
      return null;
    }
  }
  
  protected Result<Type> applyRuleAttributeRefType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AttributeRef attrRef) throws RuleFailedException {
    Type type = null; // output parameter
    
    /* G |- attrRef.attr : type */
    Attribute _attr = attrRef.getAttr();
    Result<Type> result = typeInternal(G, _trace_, _attr);
    checkAssignableTo(result.getFirst(), Type.class);
    type = (Type) result.getFirst();
    
    return new Result<Type>(type);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final MultiOrDiv multiOrDiv) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleMultiOrDivType(G, _subtrace_, multiOrDiv);
      addToTrace(_trace_, ruleName("MultiOrDivType") + stringRepForEnv(G) + " |- " + stringRep(multiOrDiv) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleMultiOrDivType) {
      typeThrowException(MULTIORDIVTYPE,
      	e_applyRuleMultiOrDivType, multiOrDiv);
      return null;
    }
  }
  
  protected Result<Type> applyRuleMultiOrDivType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final MultiOrDiv multiOrDiv) throws RuleFailedException {
    NumberType type = null; // output parameter
    
    {
      /* G |- multiOrDiv.left : var NumberType leftType */
      Expression _left = multiOrDiv.getLeft();
      NumberType leftType = null;
      Result<Type> result = typeInternal(G, _trace_, _left);
      checkAssignableTo(result.getFirst(), NumberType.class);
      leftType = (NumberType) result.getFirst();
      
      /* G |- multiOrDiv.right : var NumberType rightType */
      Expression _right = multiOrDiv.getRight();
      NumberType rightType = null;
      Result<Type> result_1 = typeInternal(G, _trace_, _right);
      checkAssignableTo(result_1.getFirst(), NumberType.class);
      rightType = (NumberType) result_1.getFirst();
      
      /* G |- leftType ~~ rightType |> type */
      Result<Type> result_2 = mostGeneralInternal(G, _trace_, leftType, rightType);
      checkAssignableTo(result_2.getFirst(), NumberType.class);
      type = (NumberType) result_2.getFirst();
      
    }
    return new Result<Type>(type);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Minus minus) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleMinusType(G, _subtrace_, minus);
      addToTrace(_trace_, ruleName("MinusType") + stringRepForEnv(G) + " |- " + stringRep(minus) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleMinusType) {
      typeThrowException(MINUSTYPE,
      	e_applyRuleMinusType, minus);
      return null;
    }
  }
  
  protected Result<Type> applyRuleMinusType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Minus minus) throws RuleFailedException {
    NumberType type = null; // output parameter
    
    {
      /* G |- minus.left : var NumberType leftType */
      Expression _left = minus.getLeft();
      NumberType leftType = null;
      Result<Type> result = typeInternal(G, _trace_, _left);
      checkAssignableTo(result.getFirst(), NumberType.class);
      leftType = (NumberType) result.getFirst();
      
      /* G |- minus.right : var NumberType rightType */
      Expression _right = minus.getRight();
      NumberType rightType = null;
      Result<Type> result_1 = typeInternal(G, _trace_, _right);
      checkAssignableTo(result_1.getFirst(), NumberType.class);
      rightType = (NumberType) result_1.getFirst();
      
      /* G |- leftType ~~ rightType |> type */
      Result<Type> result_2 = mostGeneralInternal(G, _trace_, leftType, rightType);
      checkAssignableTo(result_2.getFirst(), NumberType.class);
      type = (NumberType) result_2.getFirst();
      
    }
    return new Result<Type>(type);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Plus plus) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRulePlusType(G, _subtrace_, plus);
      addToTrace(_trace_, ruleName("PlusType") + stringRepForEnv(G) + " |- " + stringRep(plus) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRulePlusType) {
      typeThrowException(PLUSTYPE,
      	e_applyRulePlusType, plus);
      return null;
    }
  }
  
  protected Result<Type> applyRulePlusType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Plus plus) throws RuleFailedException {
    Type type = null; // output parameter
    
    {
      /* G |- plus.left : var Type leftType */
      Expression _left = plus.getLeft();
      Type leftType = null;
      Result<Type> result = typeInternal(G, _trace_, _left);
      checkAssignableTo(result.getFirst(), Type.class);
      leftType = (Type) result.getFirst();
      
      /* G |- plus.right : var Type rightType */
      Expression _right = plus.getRight();
      Type rightType = null;
      Result<Type> result_1 = typeInternal(G, _trace_, _right);
      checkAssignableTo(result_1.getFirst(), Type.class);
      rightType = (Type) result_1.getFirst();
      
      /* G |- leftType ~~ rightType |> type */
      Result<Type> result_2 = mostGeneralInternal(G, _trace_, leftType, rightType);
      checkAssignableTo(result_2.getFirst(), Type.class);
      type = (Type) result_2.getFirst();
      
    }
    return new Result<Type>(type);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Comparison comparison) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleComparisonType(G, _subtrace_, comparison);
      addToTrace(_trace_, ruleName("ComparisonType") + stringRepForEnv(G) + " |- " + stringRep(comparison) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleComparisonType) {
      typeThrowException(COMPARISONTYPE,
      	e_applyRuleComparisonType, comparison);
      return null;
    }
  }
  
  protected Result<Type> applyRuleComparisonType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Comparison comparison) throws RuleFailedException {
    
    {
      /* G |- comparison.left : var Type leftType */
      Expression _left = comparison.getLeft();
      Type leftType = null;
      Result<Type> result = typeInternal(G, _trace_, _left);
      checkAssignableTo(result.getFirst(), Type.class);
      leftType = (Type) result.getFirst();
      
      /* G |- comparison.right : var Type rightType */
      Expression _right = comparison.getRight();
      Type rightType = null;
      Result<Type> result_1 = typeInternal(G, _trace_, _right);
      checkAssignableTo(result_1.getFirst(), Type.class);
      rightType = (Type) result_1.getFirst();
      
      boolean _or = false;
      boolean _and = false;
      if (!(leftType instanceof StringType)) {
        _and = false;
      } else {
        _and = ((leftType instanceof StringType) && (rightType instanceof StringType));
      }
      if (_and) {
        _or = true;
      } else {
        boolean _and_1 = false;
        if (!(leftType instanceof NumberType)) {
          _and_1 = false;
        } else {
          _and_1 = ((leftType instanceof NumberType) && (rightType instanceof NumberType));
        }
        _or = (_and || _and_1);
      }
      /* (leftType instanceof StringType && rightType instanceof StringType) || (leftType instanceof NumberType && rightType instanceof NumberType) */
      if (!Boolean.valueOf(_or)) {
        sneakyThrowRuleFailedException("(leftType instanceof StringType && rightType instanceof StringType) || (leftType instanceof NumberType && rightType instanceof NumberType)");
      }
    }
    BooleanType _createBooleanType = XsemGuiDslFactory.eINSTANCE.createBooleanType();
    return new Result<Type>(_createBooleanType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Equals equals) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleEqualsType(G, _subtrace_, equals);
      addToTrace(_trace_, ruleName("EqualsType") + stringRepForEnv(G) + " |- " + stringRep(equals) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleEqualsType) {
      typeThrowException(EQUALSTYPE,
      	e_applyRuleEqualsType, equals);
      return null;
    }
  }
  
  protected Result<Type> applyRuleEqualsType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Equals equals) throws RuleFailedException {
    
    {
      /* G |- equals.left : var Type leftType */
      Expression _left = equals.getLeft();
      Type leftType = null;
      Result<Type> result = typeInternal(G, _trace_, _left);
      checkAssignableTo(result.getFirst(), Type.class);
      leftType = (Type) result.getFirst();
      
      /* G |- equals.right : var Type rightType */
      Expression _right = equals.getRight();
      Type rightType = null;
      Result<Type> result_1 = typeInternal(G, _trace_, _right);
      checkAssignableTo(result_1.getFirst(), Type.class);
      rightType = (Type) result_1.getFirst();
      
      /* (leftType instanceof NumberType && rightType instanceof NumberType) or leftType.eClass == rightType.eClass */
      try {
        boolean _and = false;
        if (!(leftType instanceof NumberType)) {
          _and = false;
        } else {
          _and = ((leftType instanceof NumberType) && (rightType instanceof NumberType));
        }
        /* leftType instanceof NumberType && rightType instanceof NumberType */
        if (!_and) {
          sneakyThrowRuleFailedException("leftType instanceof NumberType && rightType instanceof NumberType");
        }
      } catch (Exception e) {
        EClass _eClass = leftType.eClass();
        EClass _eClass_1 = rightType.eClass();
        boolean _equals = Objects.equal(_eClass, _eClass_1);
        /* leftType.eClass == rightType.eClass */
        if (!_equals) {
          sneakyThrowRuleFailedException("leftType.eClass == rightType.eClass");
        }
      }
    }
    BooleanType _createBooleanType = XsemGuiDslFactory.eINSTANCE.createBooleanType();
    return new Result<Type>(_createBooleanType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AndOrExpression andOr) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleAndOrType(G, _subtrace_, andOr);
      addToTrace(_trace_, ruleName("AndOrType") + stringRepForEnv(G) + " |- " + stringRep(andOr) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleAndOrType) {
      typeThrowException(ANDORTYPE,
      	e_applyRuleAndOrType, andOr);
      return null;
    }
  }
  
  protected Result<Type> applyRuleAndOrType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AndOrExpression andOr) throws RuleFailedException {
    
    {
      /* G |- andOr.left : var BooleanType leftType */
      Expression _left = andOr.getLeft();
      BooleanType leftType = null;
      Result<Type> result = typeInternal(G, _trace_, _left);
      checkAssignableTo(result.getFirst(), BooleanType.class);
      leftType = (BooleanType) result.getFirst();
      
      /* G |- andOr.right : var BooleanType rightType */
      Expression _right = andOr.getRight();
      BooleanType rightType = null;
      Result<Type> result_1 = typeInternal(G, _trace_, _right);
      checkAssignableTo(result_1.getFirst(), BooleanType.class);
      rightType = (BooleanType) result_1.getFirst();
      
    }
    BooleanType _createBooleanType = XsemGuiDslFactory.eINSTANCE.createBooleanType();
    return new Result<Type>(_createBooleanType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final BooleanNegation neg) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleBooleanNegationType(G, _subtrace_, neg);
      addToTrace(_trace_, ruleName("BooleanNegationType") + stringRepForEnv(G) + " |- " + stringRep(neg) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleBooleanNegationType) {
      typeThrowException(BOOLEANNEGATIONTYPE,
      	e_applyRuleBooleanNegationType, neg);
      return null;
    }
  }
  
  protected Result<Type> applyRuleBooleanNegationType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final BooleanNegation neg) throws RuleFailedException {
    
    /* G |- neg.expression : var BooleanType expType */
    Expression _expression = neg.getExpression();
    BooleanType expType = null;
    Result<Type> result = typeInternal(G, _trace_, _expression);
    checkAssignableTo(result.getFirst(), BooleanType.class);
    expType = (BooleanType) result.getFirst();
    
    BooleanType _createBooleanType = XsemGuiDslFactory.eINSTANCE.createBooleanType();
    return new Result<Type>(_createBooleanType);
  }
  
  protected Result<Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final ArithmeticSigned signed) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleArithmeticSignedType(G, _subtrace_, signed);
      addToTrace(_trace_, ruleName("ArithmeticSignedType") + stringRepForEnv(G) + " |- " + stringRep(signed) + " : " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleArithmeticSignedType) {
      typeThrowException(ARITHMETICSIGNEDTYPE,
      	e_applyRuleArithmeticSignedType, signed);
      return null;
    }
  }
  
  protected Result<Type> applyRuleArithmeticSignedType(final RuleEnvironment G, final RuleApplicationTrace _trace_, final ArithmeticSigned signed) throws RuleFailedException {
    NumberType numType = null; // output parameter
    
    /* G |- signed.expression : numType */
    Expression _expression = signed.getExpression();
    Result<Type> result = typeInternal(G, _trace_, _expression);
    checkAssignableTo(result.getFirst(), NumberType.class);
    numType = (NumberType) result.getFirst();
    
    return new Result<Type>(numType);
  }
  
  protected Result<Boolean> isAssignableImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Type left, final Type right) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Boolean> _result_ = applyRuleIsAssignableBase(G, _subtrace_, left, right);
      addToTrace(_trace_, ruleName("IsAssignableBase") + stringRepForEnv(G) + " |- " + stringRep(left) + " <~ " + stringRep(right));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleIsAssignableBase) {
      isAssignableThrowException(ISASSIGNABLEBASE,
      	e_applyRuleIsAssignableBase, left, right);
      return null;
    }
  }
  
  protected Result<Boolean> applyRuleIsAssignableBase(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Type left, final Type right) throws RuleFailedException {
    
    EClass _eClass = left.eClass();
    EClass _eClass_1 = right.eClass();
    boolean _isSuperTypeOf = _eClass.isSuperTypeOf(_eClass_1);
    /* left.eClass.isSuperTypeOf(right.eClass) */
    if (!Boolean.valueOf(_isSuperTypeOf)) {
      sneakyThrowRuleFailedException("left.eClass.isSuperTypeOf(right.eClass)");
    }
    return new Result<Boolean>(true);
  }
  
  protected Result<Boolean> isAssignableImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final EntityType left, final EntityType right) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Boolean> _result_ = applyRuleEntityTypeAssignable(G, _subtrace_, left, right);
      addToTrace(_trace_, ruleName("EntityTypeAssignable") + stringRepForEnv(G) + " |- " + stringRep(left) + " <~ " + stringRep(right));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleEntityTypeAssignable) {
      isAssignableThrowException(ENTITYTYPEASSIGNABLE,
      	e_applyRuleEntityTypeAssignable, left, right);
      return null;
    }
  }
  
  protected Result<Boolean> applyRuleEntityTypeAssignable(final RuleEnvironment G, final RuleApplicationTrace _trace_, final EntityType left, final EntityType right) throws RuleFailedException {
    
    /* left.ref == right.ref or getAll(right.ref, XsemGuiDslPackage::eINSTANCE.entity_SuperType, XsemGuiDslPackage::eINSTANCE.entity_SuperType, typeof(Entity) ).contains(left.ref) */
    try {
      Entity _ref = left.getRef();
      Entity _ref_1 = right.getRef();
      boolean _equals = Objects.equal(_ref, _ref_1);
      /* left.ref == right.ref */
      if (!_equals) {
        sneakyThrowRuleFailedException("left.ref == right.ref");
      }
    } catch (Exception e) {
      Entity _ref_2 = right.getRef();
      EReference _entity_SuperType = XsemGuiDslPackage.eINSTANCE.getEntity_SuperType();
      EReference _entity_SuperType_1 = XsemGuiDslPackage.eINSTANCE.getEntity_SuperType();
      List<Entity> _all = this.<Entity>getAll(_ref_2, _entity_SuperType, _entity_SuperType_1, 
        Entity.class);
      Entity _ref_3 = left.getRef();
      boolean _contains = _all.contains(_ref_3);
      /* getAll(right.ref, XsemGuiDslPackage::eINSTANCE.entity_SuperType, XsemGuiDslPackage::eINSTANCE.entity_SuperType, typeof(Entity) ).contains(left.ref) */
      if (!_contains) {
        sneakyThrowRuleFailedException("getAll(right.ref, XsemGuiDslPackage::eINSTANCE.entity_SuperType, XsemGuiDslPackage::eINSTANCE.entity_SuperType, typeof(Entity) ).contains(left.ref)");
      }
    }
    return new Result<Boolean>(true);
  }
  
  protected Result<Boolean> isAssignableImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringType left, final BooleanType right) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Boolean> _result_ = applyRuleBooleanAssignableToString(G, _subtrace_, left, right);
      addToTrace(_trace_, ruleName("BooleanAssignableToString") + stringRepForEnv(G) + " |- " + stringRep(left) + " <~ " + stringRep(right));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleBooleanAssignableToString) {
      isAssignableThrowException(BOOLEANASSIGNABLETOSTRING,
      	e_applyRuleBooleanAssignableToString, left, right);
      return null;
    }
  }
  
  protected Result<Boolean> applyRuleBooleanAssignableToString(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringType left, final BooleanType right) throws RuleFailedException {
    
    return new Result<Boolean>(true);
  }
  
  protected Result<Boolean> isAssignableImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringType left, final NumberType right) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Boolean> _result_ = applyRuleIntAssignableToString(G, _subtrace_, left, right);
      addToTrace(_trace_, ruleName("IntAssignableToString") + stringRepForEnv(G) + " |- " + stringRep(left) + " <~ " + stringRep(right));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleIntAssignableToString) {
      isAssignableThrowException(INTASSIGNABLETOSTRING,
      	e_applyRuleIntAssignableToString, left, right);
      return null;
    }
  }
  
  protected Result<Boolean> applyRuleIntAssignableToString(final RuleEnvironment G, final RuleApplicationTrace _trace_, final StringType left, final NumberType right) throws RuleFailedException {
    
    return new Result<Boolean>(true);
  }
  
  protected Result<Boolean> isAssignableImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final FloatType left, final IntType right) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Boolean> _result_ = applyRuleIntAssignableToFloat(G, _subtrace_, left, right);
      addToTrace(_trace_, ruleName("IntAssignableToFloat") + stringRepForEnv(G) + " |- " + stringRep(left) + " <~ " + stringRep(right));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleIntAssignableToFloat) {
      isAssignableThrowException(INTASSIGNABLETOFLOAT,
      	e_applyRuleIntAssignableToFloat, left, right);
      return null;
    }
  }
  
  protected Result<Boolean> applyRuleIntAssignableToFloat(final RuleEnvironment G, final RuleApplicationTrace _trace_, final FloatType left, final IntType right) throws RuleFailedException {
    
    return new Result<Boolean>(true);
  }
  
  protected Result<Type> mostGeneralImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Type first, final Type second) throws RuleFailedException {
    try {
      RuleApplicationTrace _subtrace_ = newTrace(_trace_);
      Result<Type> _result_ = applyRuleMostGeneral(G, _subtrace_, first, second);
      addToTrace(_trace_, ruleName("MostGeneral") + stringRepForEnv(G) + " |- " + stringRep(first) + " ~~ " + stringRep(second) + " |> " + stringRep(_result_.getFirst()));
      addAsSubtrace(_trace_, _subtrace_);
      return _result_;
    } catch (Exception e_applyRuleMostGeneral) {
      throwRuleFailedException(ruleName("MostGeneral") + stringRepForEnv(G) + " |- " + stringRep(first) + " ~~ " + stringRep(second) + " |> " + "Type",
      	MOSTGENERAL,
      	e_applyRuleMostGeneral, new ErrorInformation(first), new ErrorInformation(second));
      return null;
    }
  }
  
  protected Result<Type> applyRuleMostGeneral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Type first, final Type second) throws RuleFailedException {
    Type mostGeneral = null; // output parameter
    
    /* { G |- first <~ second mostGeneral = first } or mostGeneral = second */
    try {
      Type _xblockexpression = null;
      {
        /* G |- first <~ second */
        isAssignableInternal(G, _trace_, first, second);
        Type _mostGeneral = mostGeneral = first;
        _xblockexpression = (_mostGeneral);
      }
    } catch (Exception e) {
      mostGeneral = second;
    }
    return new Result<Type>(mostGeneral);
  }
}

/**
 * <copyright>
 * </copyright>
 *

 */
package org.typesys.xts.guidsl.guiDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.typesys.xts.guidsl.guiDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiDslFactoryImpl extends EFactoryImpl implements GuiDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuiDslFactory init()
  {
    try
    {
      GuiDslFactory theGuiDslFactory = (GuiDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.typesys.org/xts/guidsl/GuiDsl"); 
      if (theGuiDslFactory != null)
      {
        return theGuiDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuiDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GuiDslPackage.MODEL: return createModel();
      case GuiDslPackage.FORM: return createForm();
      case GuiDslPackage.WIDGET: return createWidget();
      case GuiDslPackage.TEXT_WIDGET: return createTextWidget();
      case GuiDslPackage.CHECK_BOX_WIDGET: return createCheckBoxWidget();
      case GuiDslPackage.ENTITY: return createEntity();
      case GuiDslPackage.ATTRIBUTE: return createAttribute();
      case GuiDslPackage.DERIVED_ATTRIBUTE: return createDerivedAttribute();
      case GuiDslPackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
      case GuiDslPackage.TYPE: return createType();
      case GuiDslPackage.ENTITY_TYPE: return createEntityType();
      case GuiDslPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case GuiDslPackage.FLOAT_TYPE: return createFloatType();
      case GuiDslPackage.INT_TYPE: return createIntType();
      case GuiDslPackage.BOOLEAN_TYPE: return createBooleanType();
      case GuiDslPackage.STRING_TYPE: return createStringType();
      case GuiDslPackage.EXPR: return createExpr();
      case GuiDslPackage.EXPRESSION: return createExpression();
      case GuiDslPackage.EQUALS: return createEquals();
      case GuiDslPackage.UNEQUALS: return createUnequals();
      case GuiDslPackage.GREATER: return createGreater();
      case GuiDslPackage.GREATER_EQUALS: return createGreaterEquals();
      case GuiDslPackage.SMALLER_EQUALS: return createSmallerEquals();
      case GuiDslPackage.LOGICAL_AND: return createLogicalAnd();
      case GuiDslPackage.IMPLIES: return createImplies();
      case GuiDslPackage.LOGICAL_OR: return createLogicalOr();
      case GuiDslPackage.SMALLER: return createSmaller();
      case GuiDslPackage.PLUS: return createPlus();
      case GuiDslPackage.MINUS: return createMinus();
      case GuiDslPackage.MULTI: return createMulti();
      case GuiDslPackage.DIV: return createDiv();
      case GuiDslPackage.NOT_EXPRESSION: return createNotExpression();
      case GuiDslPackage.TRUE_EXPR: return createTrueExpr();
      case GuiDslPackage.FALSE_EXPR: return createFalseExpr();
      case GuiDslPackage.FIELD_CONTENT: return createFieldContent();
      case GuiDslPackage.LENGHT_OF: return createlenghtOf();
      case GuiDslPackage.PAREN_EXPR: return createParenExpr();
      case GuiDslPackage.NUMBER_LITERAL: return createNumberLiteral();
      case GuiDslPackage.STRING_LITERAL: return createStringLiteral();
      case GuiDslPackage.ATTRIBUTE_REF: return createAttributeRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form createForm()
  {
    FormImpl form = new FormImpl();
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Widget createWidget()
  {
    WidgetImpl widget = new WidgetImpl();
    return widget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextWidget createTextWidget()
  {
    TextWidgetImpl textWidget = new TextWidgetImpl();
    return textWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBoxWidget createCheckBoxWidget()
  {
    CheckBoxWidgetImpl checkBoxWidget = new CheckBoxWidgetImpl();
    return checkBoxWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedAttribute createDerivedAttribute()
  {
    DerivedAttributeImpl derivedAttribute = new DerivedAttributeImpl();
    return derivedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleAttribute createSimpleAttribute()
  {
    SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
    return simpleAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unequals createUnequals()
  {
    UnequalsImpl unequals = new UnequalsImpl();
    return unequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greater createGreater()
  {
    GreaterImpl greater = new GreaterImpl();
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreaterEquals createGreaterEquals()
  {
    GreaterEqualsImpl greaterEquals = new GreaterEqualsImpl();
    return greaterEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallerEquals createSmallerEquals()
  {
    SmallerEqualsImpl smallerEquals = new SmallerEqualsImpl();
    return smallerEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAnd createLogicalAnd()
  {
    LogicalAndImpl logicalAnd = new LogicalAndImpl();
    return logicalAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implies createImplies()
  {
    ImpliesImpl implies = new ImpliesImpl();
    return implies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOr createLogicalOr()
  {
    LogicalOrImpl logicalOr = new LogicalOrImpl();
    return logicalOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Smaller createSmaller()
  {
    SmallerImpl smaller = new SmallerImpl();
    return smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrueExpr createTrueExpr()
  {
    TrueExprImpl trueExpr = new TrueExprImpl();
    return trueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FalseExpr createFalseExpr()
  {
    FalseExprImpl falseExpr = new FalseExprImpl();
    return falseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldContent createFieldContent()
  {
    FieldContentImpl fieldContent = new FieldContentImpl();
    return fieldContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lenghtOf createlenghtOf()
  {
    lenghtOfImpl lenghtOf = new lenghtOfImpl();
    return lenghtOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenExpr createParenExpr()
  {
    ParenExprImpl parenExpr = new ParenExprImpl();
    return parenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRef createAttributeRef()
  {
    AttributeRefImpl attributeRef = new AttributeRefImpl();
    return attributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDslPackage getGuiDslPackage()
  {
    return (GuiDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuiDslPackage getPackage()
  {
    return GuiDslPackage.eINSTANCE;
  }

} //GuiDslFactoryImpl

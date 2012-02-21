/**
 * <copyright>
 * </copyright>
 *
 */
package org.typesys.xts.guidsl.guiDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslFactory
 * @model kind="package"
 * @generated
 */
public interface GuiDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "guiDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.typesys.org/xts/guidsl/GuiDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "guiDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuiDslPackage eINSTANCE = org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.ModelImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 0;

  /**
   * The feature id for the '<em><b>Forms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FORMS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.FormImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getForm()
   * @generated
   */
  int FORM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__NAME = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__ENTITY = 1;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__WIDGETS = 2;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.WidgetImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 2;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ATTR = 0;

  /**
   * The feature id for the '<em><b>Validate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__VALIDATE = 1;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.TextWidgetImpl <em>Text Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.TextWidgetImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getTextWidget()
   * @generated
   */
  int TEXT_WIDGET = 3;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WIDGET__ATTR = WIDGET__ATTR;

  /**
   * The feature id for the '<em><b>Validate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WIDGET__VALIDATE = WIDGET__VALIDATE;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WIDGET__LENGTH = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.CheckBoxWidgetImpl <em>Check Box Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.CheckBoxWidgetImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getCheckBoxWidget()
   * @generated
   */
  int CHECK_BOX_WIDGET = 4;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_WIDGET__ATTR = WIDGET__ATTR;

  /**
   * The feature id for the '<em><b>Validate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_WIDGET__VALIDATE = WIDGET__VALIDATE;

  /**
   * The number of structural features of the '<em>Check Box Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.EntityImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.AttributeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.DerivedAttributeImpl <em>Derived Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.DerivedAttributeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getDerivedAttribute()
   * @generated
   */
  int DERIVED_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ATTRIBUTE__EXPR = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Derived Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.SimpleAttributeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getSimpleAttribute()
   * @generated
   */
  int SIMPLE_ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.TypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.EntityTypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 10;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__REF = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.PrimitiveTypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 11;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.FloatTypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 12;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.IntTypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 13;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.BooleanTypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 14;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.StringTypeImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 15;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.ExprImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 16;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.ExpressionImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 17;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.EqualsImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.UnequalsImpl <em>Unequals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.UnequalsImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getUnequals()
   * @generated
   */
  int UNEQUALS = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNEQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNEQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unequals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNEQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.GreaterImpl <em>Greater</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.GreaterImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getGreater()
   * @generated
   */
  int GREATER = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.GreaterEqualsImpl <em>Greater Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.GreaterEqualsImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getGreaterEquals()
   * @generated
   */
  int GREATER_EQUALS = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.SmallerEqualsImpl <em>Smaller Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.SmallerEqualsImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getSmallerEquals()
   * @generated
   */
  int SMALLER_EQUALS = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALLER_EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALLER_EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Smaller Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALLER_EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.LogicalAndImpl <em>Logical And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.LogicalAndImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getLogicalAnd()
   * @generated
   */
  int LOGICAL_AND = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Logical And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ImpliesImpl <em>Implies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.ImpliesImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getImplies()
   * @generated
   */
  int IMPLIES = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.LogicalOrImpl <em>Logical Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.LogicalOrImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getLogicalOr()
   * @generated
   */
  int LOGICAL_OR = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Logical Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.SmallerImpl <em>Smaller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.SmallerImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getSmaller()
   * @generated
   */
  int SMALLER = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALLER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALLER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Smaller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALLER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.PlusImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.MinusImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.MultiImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.DivImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getDiv()
   * @generated
   */
  int DIV = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.NotExpressionImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.TrueExprImpl <em>True Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.TrueExprImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getTrueExpr()
   * @generated
   */
  int TRUE_EXPR = 32;

  /**
   * The number of structural features of the '<em>True Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FalseExprImpl <em>False Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.FalseExprImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getFalseExpr()
   * @generated
   */
  int FALSE_EXPR = 33;

  /**
   * The number of structural features of the '<em>False Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FieldContentImpl <em>Field Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.FieldContentImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getFieldContent()
   * @generated
   */
  int FIELD_CONTENT = 34;

  /**
   * The number of structural features of the '<em>Field Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_CONTENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.lenghtOfImpl <em>lenght Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.lenghtOfImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getlenghtOf()
   * @generated
   */
  int LENGHT_OF = 35;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHT_OF__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>lenght Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHT_OF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ParenExprImpl <em>Paren Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.ParenExprImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getParenExpr()
   * @generated
   */
  int PAREN_EXPR = 36;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPR__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paren Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.NumberLiteralImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.StringLiteralImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.typesys.xts.guidsl.guiDsl.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.typesys.xts.guidsl.guiDsl.impl.AttributeRefImpl
   * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getAttributeRef()
   * @generated
   */
  int ATTRIBUTE_REF = 39;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REF__ATTR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.typesys.xts.guidsl.guiDsl.Model#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Model#getEntities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link org.typesys.xts.guidsl.guiDsl.Model#getForms <em>Forms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Forms</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Model#getForms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Forms();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for the attribute '{@link org.typesys.xts.guidsl.guiDsl.Form#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Form#getName()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Name();

  /**
   * Returns the meta object for the reference '{@link org.typesys.xts.guidsl.guiDsl.Form#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Form#getEntity()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Entity();

  /**
   * Returns the meta object for the containment reference list '{@link org.typesys.xts.guidsl.guiDsl.Form#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Form#getWidgets()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Widgets();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the reference '{@link org.typesys.xts.guidsl.guiDsl.Widget#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Widget#getAttr()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Attr();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Widget#getValidate <em>Validate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validate</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Widget#getValidate()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Validate();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.TextWidget <em>Text Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Widget</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.TextWidget
   * @generated
   */
  EClass getTextWidget();

  /**
   * Returns the meta object for the attribute '{@link org.typesys.xts.guidsl.guiDsl.TextWidget#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.TextWidget#getLength()
   * @see #getTextWidget()
   * @generated
   */
  EAttribute getTextWidget_Length();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.CheckBoxWidget <em>Check Box Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box Widget</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.CheckBoxWidget
   * @generated
   */
  EClass getCheckBoxWidget();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.typesys.xts.guidsl.guiDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.typesys.xts.guidsl.guiDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.typesys.xts.guidsl.guiDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.DerivedAttribute <em>Derived Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Derived Attribute</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.DerivedAttribute
   * @generated
   */
  EClass getDerivedAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.DerivedAttribute#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.DerivedAttribute#getExpr()
   * @see #getDerivedAttribute()
   * @generated
   */
  EReference getDerivedAttribute_Expr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.SimpleAttribute <em>Simple Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Attribute</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.SimpleAttribute
   * @generated
   */
  EClass getSimpleAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.SimpleAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.SimpleAttribute#getType()
   * @see #getSimpleAttribute()
   * @generated
   */
  EReference getSimpleAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for the reference '{@link org.typesys.xts.guidsl.guiDsl.EntityType#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.EntityType#getRef()
   * @see #getEntityType()
   * @generated
   */
  EReference getEntityType_Ref();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Unequals <em>Unequals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unequals</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Unequals
   * @generated
   */
  EClass getUnequals();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Unequals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Unequals#getLeft()
   * @see #getUnequals()
   * @generated
   */
  EReference getUnequals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Unequals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Unequals#getRight()
   * @see #getUnequals()
   * @generated
   */
  EReference getUnequals_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Greater <em>Greater</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Greater
   * @generated
   */
  EClass getGreater();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Greater#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Greater#getLeft()
   * @see #getGreater()
   * @generated
   */
  EReference getGreater_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Greater#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Greater#getRight()
   * @see #getGreater()
   * @generated
   */
  EReference getGreater_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.GreaterEquals <em>Greater Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Equals</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.GreaterEquals
   * @generated
   */
  EClass getGreaterEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.GreaterEquals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.GreaterEquals#getLeft()
   * @see #getGreaterEquals()
   * @generated
   */
  EReference getGreaterEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.GreaterEquals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.GreaterEquals#getRight()
   * @see #getGreaterEquals()
   * @generated
   */
  EReference getGreaterEquals_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.SmallerEquals <em>Smaller Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smaller Equals</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.SmallerEquals
   * @generated
   */
  EClass getSmallerEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.SmallerEquals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.SmallerEquals#getLeft()
   * @see #getSmallerEquals()
   * @generated
   */
  EReference getSmallerEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.SmallerEquals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.SmallerEquals#getRight()
   * @see #getSmallerEquals()
   * @generated
   */
  EReference getSmallerEquals_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.LogicalAnd <em>Logical And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical And</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalAnd
   * @generated
   */
  EClass getLogicalAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.LogicalAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalAnd#getLeft()
   * @see #getLogicalAnd()
   * @generated
   */
  EReference getLogicalAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.LogicalAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalAnd#getRight()
   * @see #getLogicalAnd()
   * @generated
   */
  EReference getLogicalAnd_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Implies <em>Implies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implies</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Implies
   * @generated
   */
  EClass getImplies();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Implies#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Implies#getLeft()
   * @see #getImplies()
   * @generated
   */
  EReference getImplies_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Implies#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Implies#getRight()
   * @see #getImplies()
   * @generated
   */
  EReference getImplies_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.LogicalOr <em>Logical Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Or</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalOr
   * @generated
   */
  EClass getLogicalOr();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.LogicalOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalOr#getLeft()
   * @see #getLogicalOr()
   * @generated
   */
  EReference getLogicalOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.LogicalOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalOr#getRight()
   * @see #getLogicalOr()
   * @generated
   */
  EReference getLogicalOr_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Smaller <em>Smaller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smaller</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Smaller
   * @generated
   */
  EClass getSmaller();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Smaller#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Smaller#getLeft()
   * @see #getSmaller()
   * @generated
   */
  EReference getSmaller_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Smaller#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Smaller#getRight()
   * @see #getSmaller()
   * @generated
   */
  EReference getSmaller_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Expression</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.NotExpression
   * @generated
   */
  EClass getNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.NotExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.NotExpression#getExpr()
   * @see #getNotExpression()
   * @generated
   */
  EReference getNotExpression_Expr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.TrueExpr <em>True Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.TrueExpr
   * @generated
   */
  EClass getTrueExpr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.FalseExpr <em>False Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>False Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.FalseExpr
   * @generated
   */
  EClass getFalseExpr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.FieldContent <em>Field Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Content</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.FieldContent
   * @generated
   */
  EClass getFieldContent();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.lenghtOf <em>lenght Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lenght Of</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.lenghtOf
   * @generated
   */
  EClass getlenghtOf();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.lenghtOf#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.lenghtOf#getExpr()
   * @see #getlenghtOf()
   * @generated
   */
  EReference getlenghtOf_Expr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.ParenExpr <em>Paren Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paren Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.ParenExpr
   * @generated
   */
  EClass getParenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.typesys.xts.guidsl.guiDsl.ParenExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.ParenExpr#getExpr()
   * @see #getParenExpr()
   * @generated
   */
  EReference getParenExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.typesys.xts.guidsl.guiDsl.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.typesys.xts.guidsl.guiDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.typesys.xts.guidsl.guiDsl.AttributeRef <em>Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Ref</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.AttributeRef
   * @generated
   */
  EClass getAttributeRef();

  /**
   * Returns the meta object for the reference '{@link org.typesys.xts.guidsl.guiDsl.AttributeRef#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attr</em>'.
   * @see org.typesys.xts.guidsl.guiDsl.AttributeRef#getAttr()
   * @see #getAttributeRef()
   * @generated
   */
  EReference getAttributeRef_Attr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GuiDslFactory getGuiDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.ModelImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

    /**
     * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FORMS = eINSTANCE.getModel_Forms();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.FormImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__NAME = eINSTANCE.getForm_Name();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__ENTITY = eINSTANCE.getForm_Entity();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__WIDGETS = eINSTANCE.getForm_Widgets();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.WidgetImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__ATTR = eINSTANCE.getWidget_Attr();

    /**
     * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__VALIDATE = eINSTANCE.getWidget_Validate();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.TextWidgetImpl <em>Text Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.TextWidgetImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getTextWidget()
     * @generated
     */
    EClass TEXT_WIDGET = eINSTANCE.getTextWidget();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_WIDGET__LENGTH = eINSTANCE.getTextWidget_Length();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.CheckBoxWidgetImpl <em>Check Box Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.CheckBoxWidgetImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getCheckBoxWidget()
     * @generated
     */
    EClass CHECK_BOX_WIDGET = eINSTANCE.getCheckBoxWidget();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.EntityImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.AttributeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.DerivedAttributeImpl <em>Derived Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.DerivedAttributeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getDerivedAttribute()
     * @generated
     */
    EClass DERIVED_ATTRIBUTE = eINSTANCE.getDerivedAttribute();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DERIVED_ATTRIBUTE__EXPR = eINSTANCE.getDerivedAttribute_Expr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.SimpleAttributeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getSimpleAttribute()
     * @generated
     */
    EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_ATTRIBUTE__TYPE = eINSTANCE.getSimpleAttribute_Type();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.TypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.EntityTypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_TYPE__REF = eINSTANCE.getEntityType_Ref();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.PrimitiveTypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.FloatTypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.IntTypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.BooleanTypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.StringTypeImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.ExprImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.ExpressionImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.EqualsImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__LEFT = eINSTANCE.getEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__RIGHT = eINSTANCE.getEquals_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.UnequalsImpl <em>Unequals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.UnequalsImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getUnequals()
     * @generated
     */
    EClass UNEQUALS = eINSTANCE.getUnequals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNEQUALS__LEFT = eINSTANCE.getUnequals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNEQUALS__RIGHT = eINSTANCE.getUnequals_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.GreaterImpl <em>Greater</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.GreaterImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getGreater()
     * @generated
     */
    EClass GREATER = eINSTANCE.getGreater();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER__LEFT = eINSTANCE.getGreater_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER__RIGHT = eINSTANCE.getGreater_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.GreaterEqualsImpl <em>Greater Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.GreaterEqualsImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getGreaterEquals()
     * @generated
     */
    EClass GREATER_EQUALS = eINSTANCE.getGreaterEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_EQUALS__LEFT = eINSTANCE.getGreaterEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_EQUALS__RIGHT = eINSTANCE.getGreaterEquals_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.SmallerEqualsImpl <em>Smaller Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.SmallerEqualsImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getSmallerEquals()
     * @generated
     */
    EClass SMALLER_EQUALS = eINSTANCE.getSmallerEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALLER_EQUALS__LEFT = eINSTANCE.getSmallerEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALLER_EQUALS__RIGHT = eINSTANCE.getSmallerEquals_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.LogicalAndImpl <em>Logical And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.LogicalAndImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getLogicalAnd()
     * @generated
     */
    EClass LOGICAL_AND = eINSTANCE.getLogicalAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND__LEFT = eINSTANCE.getLogicalAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND__RIGHT = eINSTANCE.getLogicalAnd_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ImpliesImpl <em>Implies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.ImpliesImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getImplies()
     * @generated
     */
    EClass IMPLIES = eINSTANCE.getImplies();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLIES__LEFT = eINSTANCE.getImplies_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLIES__RIGHT = eINSTANCE.getImplies_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.LogicalOrImpl <em>Logical Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.LogicalOrImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getLogicalOr()
     * @generated
     */
    EClass LOGICAL_OR = eINSTANCE.getLogicalOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR__LEFT = eINSTANCE.getLogicalOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR__RIGHT = eINSTANCE.getLogicalOr_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.SmallerImpl <em>Smaller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.SmallerImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getSmaller()
     * @generated
     */
    EClass SMALLER = eINSTANCE.getSmaller();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALLER__LEFT = eINSTANCE.getSmaller_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALLER__RIGHT = eINSTANCE.getSmaller_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.PlusImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.MinusImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.MultiImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.DivImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.NotExpressionImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getNotExpression()
     * @generated
     */
    EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EXPRESSION__EXPR = eINSTANCE.getNotExpression_Expr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.TrueExprImpl <em>True Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.TrueExprImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getTrueExpr()
     * @generated
     */
    EClass TRUE_EXPR = eINSTANCE.getTrueExpr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FalseExprImpl <em>False Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.FalseExprImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getFalseExpr()
     * @generated
     */
    EClass FALSE_EXPR = eINSTANCE.getFalseExpr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.FieldContentImpl <em>Field Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.FieldContentImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getFieldContent()
     * @generated
     */
    EClass FIELD_CONTENT = eINSTANCE.getFieldContent();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.lenghtOfImpl <em>lenght Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.lenghtOfImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getlenghtOf()
     * @generated
     */
    EClass LENGHT_OF = eINSTANCE.getlenghtOf();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENGHT_OF__EXPR = eINSTANCE.getlenghtOf_Expr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.ParenExprImpl <em>Paren Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.ParenExprImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getParenExpr()
     * @generated
     */
    EClass PAREN_EXPR = eINSTANCE.getParenExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAREN_EXPR__EXPR = eINSTANCE.getParenExpr_Expr();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.NumberLiteralImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.StringLiteralImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.typesys.xts.guidsl.guiDsl.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.typesys.xts.guidsl.guiDsl.impl.AttributeRefImpl
     * @see org.typesys.xts.guidsl.guiDsl.impl.GuiDslPackageImpl#getAttributeRef()
     * @generated
     */
    EClass ATTRIBUTE_REF = eINSTANCE.getAttributeRef();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_REF__ATTR = eINSTANCE.getAttributeRef_Attr();

  }

} //GuiDslPackage

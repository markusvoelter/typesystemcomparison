/**
 * <copyright>
 * </copyright>
 *

 */
package org.typesys.xts.guidsl.guiDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.typesys.xts.guidsl.guiDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage
 * @generated
 */
public class GuiDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GuiDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GuiDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuiDslSwitch<Adapter> modelSwitch =
    new GuiDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseForm(Form object)
      {
        return createFormAdapter();
      }
      @Override
      public Adapter caseWidget(Widget object)
      {
        return createWidgetAdapter();
      }
      @Override
      public Adapter caseTextWidget(TextWidget object)
      {
        return createTextWidgetAdapter();
      }
      @Override
      public Adapter caseCheckBoxWidget(CheckBoxWidget object)
      {
        return createCheckBoxWidgetAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseDerivedAttribute(DerivedAttribute object)
      {
        return createDerivedAttributeAdapter();
      }
      @Override
      public Adapter caseSimpleAttribute(SimpleAttribute object)
      {
        return createSimpleAttributeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object)
      {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object)
      {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseFloatType(FloatType object)
      {
        return createFloatTypeAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseBooleanType(BooleanType object)
      {
        return createBooleanTypeAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseEquals(Equals object)
      {
        return createEqualsAdapter();
      }
      @Override
      public Adapter caseUnequals(Unequals object)
      {
        return createUnequalsAdapter();
      }
      @Override
      public Adapter caseGreater(Greater object)
      {
        return createGreaterAdapter();
      }
      @Override
      public Adapter caseGreaterEquals(GreaterEquals object)
      {
        return createGreaterEqualsAdapter();
      }
      @Override
      public Adapter caseSmallerEquals(SmallerEquals object)
      {
        return createSmallerEqualsAdapter();
      }
      @Override
      public Adapter caseLogicalAnd(LogicalAnd object)
      {
        return createLogicalAndAdapter();
      }
      @Override
      public Adapter caseImplies(Implies object)
      {
        return createImpliesAdapter();
      }
      @Override
      public Adapter caseLogicalOr(LogicalOr object)
      {
        return createLogicalOrAdapter();
      }
      @Override
      public Adapter caseSmaller(Smaller object)
      {
        return createSmallerAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseNotExpression(NotExpression object)
      {
        return createNotExpressionAdapter();
      }
      @Override
      public Adapter caseTrueExpr(TrueExpr object)
      {
        return createTrueExprAdapter();
      }
      @Override
      public Adapter caseFalseExpr(FalseExpr object)
      {
        return createFalseExprAdapter();
      }
      @Override
      public Adapter caseFieldContent(FieldContent object)
      {
        return createFieldContentAdapter();
      }
      @Override
      public Adapter caselenghtOf(lenghtOf object)
      {
        return createlenghtOfAdapter();
      }
      @Override
      public Adapter caseParenExpr(ParenExpr object)
      {
        return createParenExprAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseAttributeRef(AttributeRef object)
      {
        return createAttributeRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Form
   * @generated
   */
  public Adapter createFormAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Widget
   * @generated
   */
  public Adapter createWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.TextWidget <em>Text Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.TextWidget
   * @generated
   */
  public Adapter createTextWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.CheckBoxWidget <em>Check Box Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.CheckBoxWidget
   * @generated
   */
  public Adapter createCheckBoxWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.DerivedAttribute <em>Derived Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.DerivedAttribute
   * @generated
   */
  public Adapter createDerivedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.SimpleAttribute <em>Simple Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.SimpleAttribute
   * @generated
   */
  public Adapter createSimpleAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.FloatType
   * @generated
   */
  public Adapter createFloatTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.BooleanType
   * @generated
   */
  public Adapter createBooleanTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Equals
   * @generated
   */
  public Adapter createEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Unequals <em>Unequals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Unequals
   * @generated
   */
  public Adapter createUnequalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Greater <em>Greater</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Greater
   * @generated
   */
  public Adapter createGreaterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.GreaterEquals <em>Greater Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.GreaterEquals
   * @generated
   */
  public Adapter createGreaterEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.SmallerEquals <em>Smaller Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.SmallerEquals
   * @generated
   */
  public Adapter createSmallerEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.LogicalAnd <em>Logical And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalAnd
   * @generated
   */
  public Adapter createLogicalAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Implies <em>Implies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Implies
   * @generated
   */
  public Adapter createImpliesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.LogicalOr <em>Logical Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.LogicalOr
   * @generated
   */
  public Adapter createLogicalOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Smaller <em>Smaller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Smaller
   * @generated
   */
  public Adapter createSmallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.NotExpression
   * @generated
   */
  public Adapter createNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.TrueExpr <em>True Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.TrueExpr
   * @generated
   */
  public Adapter createTrueExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.FalseExpr <em>False Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.FalseExpr
   * @generated
   */
  public Adapter createFalseExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.FieldContent <em>Field Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.FieldContent
   * @generated
   */
  public Adapter createFieldContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.lenghtOf <em>lenght Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.lenghtOf
   * @generated
   */
  public Adapter createlenghtOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.ParenExpr <em>Paren Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.ParenExpr
   * @generated
   */
  public Adapter createParenExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.typesys.xts.guidsl.guiDsl.AttributeRef <em>Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.typesys.xts.guidsl.guiDsl.AttributeRef
   * @generated
   */
  public Adapter createAttributeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GuiDslAdapterFactory

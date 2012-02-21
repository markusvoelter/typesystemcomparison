/**
 * <copyright>
 * </copyright>
 *
 */
package org.typesys.xts.guidsl.guiDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.typesys.xts.guidsl.guiDsl.Attribute;
import org.typesys.xts.guidsl.guiDsl.AttributeRef;
import org.typesys.xts.guidsl.guiDsl.GuiDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.impl.AttributeRefImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeRefImpl extends ExpressionImpl implements AttributeRef
{
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected Attribute attr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuiDslPackage.Literals.ATTRIBUTE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttr()
  {
    if (attr != null && attr.eIsProxy())
    {
      InternalEObject oldAttr = (InternalEObject)attr;
      attr = (Attribute)eResolveProxy(oldAttr);
      if (attr != oldAttr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiDslPackage.ATTRIBUTE_REF__ATTR, oldAttr, attr));
      }
    }
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(Attribute newAttr)
  {
    Attribute oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDslPackage.ATTRIBUTE_REF__ATTR, oldAttr, attr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuiDslPackage.ATTRIBUTE_REF__ATTR:
        if (resolve) return getAttr();
        return basicGetAttr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuiDslPackage.ATTRIBUTE_REF__ATTR:
        setAttr((Attribute)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuiDslPackage.ATTRIBUTE_REF__ATTR:
        setAttr((Attribute)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuiDslPackage.ATTRIBUTE_REF__ATTR:
        return attr != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeRefImpl

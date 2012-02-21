/**
 * <copyright>
 * </copyright>
 *
 */
package org.typesys.xts.guidsl.guiDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.typesys.xts.guidsl.guiDsl.Attribute;
import org.typesys.xts.guidsl.guiDsl.Expr;
import org.typesys.xts.guidsl.guiDsl.GuiDslPackage;
import org.typesys.xts.guidsl.guiDsl.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.impl.WidgetImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.impl.WidgetImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget
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
   * The cached value of the '{@link #getValidate() <em>Validate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidate()
   * @generated
   * @ordered
   */
  protected Expr validate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WidgetImpl()
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
    return GuiDslPackage.Literals.WIDGET;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiDslPackage.WIDGET__ATTR, oldAttr, attr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDslPackage.WIDGET__ATTR, oldAttr, attr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getValidate()
  {
    return validate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidate(Expr newValidate, NotificationChain msgs)
  {
    Expr oldValidate = validate;
    validate = newValidate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDslPackage.WIDGET__VALIDATE, oldValidate, newValidate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidate(Expr newValidate)
  {
    if (newValidate != validate)
    {
      NotificationChain msgs = null;
      if (validate != null)
        msgs = ((InternalEObject)validate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDslPackage.WIDGET__VALIDATE, null, msgs);
      if (newValidate != null)
        msgs = ((InternalEObject)newValidate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDslPackage.WIDGET__VALIDATE, null, msgs);
      msgs = basicSetValidate(newValidate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDslPackage.WIDGET__VALIDATE, newValidate, newValidate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GuiDslPackage.WIDGET__VALIDATE:
        return basicSetValidate(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GuiDslPackage.WIDGET__ATTR:
        if (resolve) return getAttr();
        return basicGetAttr();
      case GuiDslPackage.WIDGET__VALIDATE:
        return getValidate();
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
      case GuiDslPackage.WIDGET__ATTR:
        setAttr((Attribute)newValue);
        return;
      case GuiDslPackage.WIDGET__VALIDATE:
        setValidate((Expr)newValue);
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
      case GuiDslPackage.WIDGET__ATTR:
        setAttr((Attribute)null);
        return;
      case GuiDslPackage.WIDGET__VALIDATE:
        setValidate((Expr)null);
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
      case GuiDslPackage.WIDGET__ATTR:
        return attr != null;
      case GuiDslPackage.WIDGET__VALIDATE:
        return validate != null;
    }
    return super.eIsSet(featureID);
  }

} //WidgetImpl

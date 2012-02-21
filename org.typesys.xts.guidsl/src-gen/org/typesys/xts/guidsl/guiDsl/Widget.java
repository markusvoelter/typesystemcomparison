/**
 * <copyright>
 * </copyright>
 *

 */
package org.typesys.xts.guidsl.guiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Widget#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Widget#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' reference.
   * @see #setAttr(Attribute)
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getWidget_Attr()
   * @model
   * @generated
   */
  Attribute getAttr();

  /**
   * Sets the value of the '{@link org.typesys.xts.guidsl.guiDsl.Widget#getAttr <em>Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(Attribute value);

  /**
   * Returns the value of the '<em><b>Validate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validate</em>' containment reference.
   * @see #setValidate(Expr)
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getWidget_Validate()
   * @model containment="true"
   * @generated
   */
  Expr getValidate();

  /**
   * Sets the value of the '{@link org.typesys.xts.guidsl.guiDsl.Widget#getValidate <em>Validate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validate</em>' containment reference.
   * @see #getValidate()
   * @generated
   */
  void setValidate(Expr value);

} // Widget

/**
 * <copyright>
 * </copyright>
 *

 */
package org.typesys.xts.guidsl.guiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Form#getName <em>Name</em>}</li>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Form#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Form#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getForm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.typesys.xts.guidsl.guiDsl.Form#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getForm_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.typesys.xts.guidsl.guiDsl.Form#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
   * The list contents are of type {@link org.typesys.xts.guidsl.guiDsl.Widget}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widgets</em>' containment reference list.
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getForm_Widgets()
   * @model containment="true"
   * @generated
   */
  EList<Widget> getWidgets();

} // Form

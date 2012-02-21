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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Model#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.Model#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.typesys.xts.guidsl.guiDsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
   * The list contents are of type {@link org.typesys.xts.guidsl.guiDsl.Form}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forms</em>' containment reference list.
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getModel_Forms()
   * @model containment="true"
   * @generated
   */
  EList<Form> getForms();

} // Model

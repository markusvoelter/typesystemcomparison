/**
 * <copyright>
 * </copyright>
 *
 */
package org.typesys.xts.guidsl.guiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.DerivedAttribute#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getDerivedAttribute()
 * @model
 * @generated
 */
public interface DerivedAttribute extends Attribute
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getDerivedAttribute_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.typesys.xts.guidsl.guiDsl.DerivedAttribute#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // DerivedAttribute

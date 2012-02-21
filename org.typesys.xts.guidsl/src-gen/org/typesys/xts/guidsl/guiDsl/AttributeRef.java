/**
 * <copyright>
 * </copyright>
 *

 */
package org.typesys.xts.guidsl.guiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.typesys.xts.guidsl.guiDsl.AttributeRef#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getAttributeRef()
 * @model
 * @generated
 */
public interface AttributeRef extends Expression
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
   * @see org.typesys.xts.guidsl.guiDsl.GuiDslPackage#getAttributeRef_Attr()
   * @model
   * @generated
   */
  Attribute getAttr();

  /**
   * Sets the value of the '{@link org.typesys.xts.guidsl.guiDsl.AttributeRef#getAttr <em>Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(Attribute value);

} // AttributeRef

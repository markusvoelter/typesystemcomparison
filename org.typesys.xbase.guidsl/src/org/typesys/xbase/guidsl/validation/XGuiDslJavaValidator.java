package org.typesys.xbase.guidsl.validation;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator;
import org.typesys.xbase.guidsl.xGuiDsl.Attribute;
import org.typesys.xbase.guidsl.xGuiDsl.CheckBoxWidget;
import org.typesys.xbase.guidsl.xGuiDsl.DerivedAttribute;
import org.typesys.xbase.guidsl.xGuiDsl.SimpleAttribute;
import org.typesys.xbase.guidsl.xGuiDsl.TextWidget;
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage;

import com.google.inject.Inject;

public class XGuiDslJavaValidator extends XbaseJavaValidator {

	public static int TASK1_ERR = 101;
	public static int TASK2_ERR = 102;
	public static int TASK3_ERR = 103;
	
	@Inject
	private ITypeProvider typeProvider;
	
	/**
	 * 1) the expression after "validate" must be boolean
	 */
//	@Check
//	public void checkValidateIsBoolean(Widget widget) {
//		if (widget.getValidate() != null) {
//			XExpression expr = widget.getValidate();
//			JvmTypeReference type = typeProvider.getType(expr);
//			if (type == null) {
//				error("The validation part must be boolean, but it seems to be missing or a type could not be inferred.",
//						XGuiDslPackage.Literals.WIDGET__VALIDATE);
//			}
//			if (!type.getQualifiedName().equals(Boolean.TYPE.getName())) {
//				error("The validation part must boolean, but it was of type "
//						+ type.getQualifiedName(),
//						XGuiDslPackage.Literals.WIDGET__VALIDATE);
//			}
//		}
//	}

	/**
	 * 2) text widgets may only refer to non-boolean attributes
	 */
	@Check
	public void checkTextWidgetForNonBoolean(TextWidget widget) {
		Attribute attr = widget.getAttr();
		JvmTypeReference jvmTypeReference = getTypeForAttribute(attr);
		if (jvmTypeReference == null) {
			error("Textbox reference is missing or a type could not be inferred.",
					XGuiDslPackage.Literals.WIDGET__ATTR, TASK2_ERR);
		}
		if (jvmTypeReference.getQualifiedName().equals(Boolean.TYPE.getName())) {
			error("Textbox may NOT refer to boolean attributes.",
					XGuiDslPackage.Literals.WIDGET__ATTR, TASK2_ERR);
		}
	}

	protected JvmTypeReference getTypeForAttribute(Attribute attr) {
		JvmTypeReference jvmTypeReference = null;
		if (attr instanceof SimpleAttribute) {
			SimpleAttribute simpleAttribute = (SimpleAttribute) attr;
			jvmTypeReference = simpleAttribute.getType();
		} else if (attr instanceof DerivedAttribute) {
			DerivedAttribute derivedAttribute = (DerivedAttribute) attr;
			XExpression exprInGrammar = derivedAttribute.getExpr();
			jvmTypeReference = typeProvider.getType(exprInGrammar);
		}
		return jvmTypeReference;
	}

	/**
	 * 3) checkbox widgets may only refer to boolean attributes
	 */
	@Check
	public void checkBoxWidgetOnlyBoolean(CheckBoxWidget widget) {
		Attribute attr = widget.getAttr();
		JvmTypeReference jvmTypeReference = getTypeForAttribute(attr);
		if (jvmTypeReference == null) {
			error("Checkbox may only refer to boolean attributes.",
					XGuiDslPackage.Literals.WIDGET__ATTR, TASK3_ERR);
		}
		if (!jvmTypeReference.getQualifiedName().equals(Boolean.TYPE.getName())) {
			error("Checkbox may only refer to boolean attributes, but found type "
					+ jvmTypeReference.getQualifiedName(),
					XGuiDslPackage.Literals.WIDGET__ATTR, TASK3_ERR);
		}

	}

}

package org.typesys.guidsl.validation;

import org.eclipse.xtext.validation.Check;
import org.typesys.guidsl.guiDsl.Attribute;
import org.typesys.guidsl.guiDsl.CheckBoxWidget;
import org.typesys.guidsl.guiDsl.GuiDslPackage;
import org.typesys.guidsl.guiDsl.SimpleAttribute;
import org.typesys.guidsl.guiDsl.TextWidget;
import org.typesys.guidsl.guiDsl.Type;
import org.typesys.guidsl.guiDsl.Widget;
import org.typesys.guidsl.types.GuiDslTypeProvider;

import com.google.inject.Inject;

public class GuiDslJavaValidator extends AbstractGuiDslJavaValidator {

	@Inject
	GuiDslTypeProvider guiDslTypeProvider;

	/**
	 * Warns when a text widget refers to a boolean attribute
	 * 
	 * Does not handle derived attributes
	 * 
	 * @param widget
	 */
	@Check
	public void check(TextWidget widget) {
		Attribute attr = widget.getAttr();
		Type type = guiDslTypeProvider.getType(attr);
		if (type.eClass() == GuiDslPackage.Literals.BOOLEAN_TYPE) {
			error("A text widget may not refer to a boolean attribute.",
					GuiDslPackage.Literals.WIDGET__ATTR);
		}
	}

	@Check
	void check(CheckBoxWidget widget) {
		Attribute attr = widget.getAttr();
		Type type = guiDslTypeProvider.getType(attr);
		if (type.eClass() != GuiDslPackage.Literals.BOOLEAN_TYPE) {
			error("Checkbox widget may only refer to boolean attributes.",
					GuiDslPackage.Literals.WIDGET__ATTR);
		}
	}

	@Check
	void checkValidateBoolean(Widget widget) {
		if (widget == null || widget.getValidate() == null) {
			return;
		}
		Type type = guiDslTypeProvider.getType(widget.getValidate());
		String typeName = type == null ? "null" : type.eClass().getName();
		if (type == null
				|| type.eClass() != GuiDslPackage.Literals.BOOLEAN_TYPE) {
			warning("Maybe the validation is not boolean. The plain xtext implementation check is not fully implemented yet, the inferred type was "
					+ typeName + ".", GuiDslPackage.Literals.WIDGET__VALIDATE);
		}
	}
}

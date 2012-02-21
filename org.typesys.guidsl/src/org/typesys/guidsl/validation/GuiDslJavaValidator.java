package org.typesys.guidsl.validation;

import org.eclipse.xtext.validation.Check;
import org.typesys.guidsl.guiDsl.Attribute;
import org.typesys.guidsl.guiDsl.CheckBoxWidget;
import org.typesys.guidsl.guiDsl.GuiDslPackage;
import org.typesys.guidsl.guiDsl.SimpleAttribute;
import org.typesys.guidsl.guiDsl.TextWidget;
import org.typesys.guidsl.guiDsl.Type;

public class GuiDslJavaValidator extends AbstractGuiDslJavaValidator {

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
		if (attr instanceof SimpleAttribute) {
			SimpleAttribute simpleAttribute = (SimpleAttribute) attr;
			Type type = simpleAttribute.getType();
			if (type.eClass() == GuiDslPackage.Literals.BOOLEAN_TYPE) {
				error("Text widget may not refer to a boolean attribute.",
						GuiDslPackage.Literals.WIDGET__ATTR);
			}
		}
	}

	@Check
	void check(CheckBoxWidget widget) {
		Attribute attr = widget.getAttr();
		if (attr instanceof SimpleAttribute) {
			SimpleAttribute simpleAttribute = (SimpleAttribute) attr;
			Type type = simpleAttribute.getType();
			if (type.eClass() != GuiDslPackage.Literals.BOOLEAN_TYPE) {
				error("Checkbox widget may only refer to boolean attributes.",
						GuiDslPackage.Literals.WIDGET__ATTR);
			}
		}
	}

}

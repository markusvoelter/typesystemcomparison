package org.typesys.guidsl.validation;

import org.eclipse.xtext.validation.Check;
import org.typesys.guidsl.guiDsl.Attribute;
import org.typesys.guidsl.guiDsl.CheckBoxWidget;
import org.typesys.guidsl.guiDsl.CyclicDependencyType;
import org.typesys.guidsl.guiDsl.Expression;
import org.typesys.guidsl.guiDsl.GuiDslPackage;
import org.typesys.guidsl.guiDsl.TextWidget;
import org.typesys.guidsl.guiDsl.Type;
import org.typesys.guidsl.types.GuiDslTypeProvider;
import org.typesys.guidsl.types.TypeConformance;

import com.google.inject.Inject;

public class GuiDslJavaValidator extends AbstractGuiDslJavaValidator {

	public final static String INCOMPATIBLE_TYPES = "incompatible_types";

	@Inject
	private GuiDslTypeProvider guiDslTypeProvider;

	@Inject
	private TypeConformance conformance;

	/**
	 * 1) The expression after "validate" must be boolean. This covers
	 * expression validation in general. The {@see GuiDslTypeProvider} decides
	 * which type the expression should have.
	 * 
	 */
	@Check
	public void check(Expression expr) {
		Type expectedType = guiDslTypeProvider.getExpectedType(expr);
		Type actualType = guiDslTypeProvider.getType(expr);
		if (actualType instanceof CyclicDependencyType) {
			error("Type is part of a cyclic dependency.", null,
					INCOMPATIBLE_TYPES); return;
		}
		if (expectedType == null)
			return;
		if (!conformance.isAssignable(expectedType, actualType)) {
			error("Incompatible types. Expected '" + expectedType
					+ "' but was '" + actualType + "'", null,
					INCOMPATIBLE_TYPES);
		}
	}

	/**
	 * 2) Text widgets may only refer to non-boolean attributes.
	 * 
	 * @param widget
	 */
	@Check
	public void check(TextWidget widget) {
		Attribute attr = widget.getAttr();
		Type type = guiDslTypeProvider.getType(attr);
		if (type.eClass() == GuiDslPackage.Literals.BOOLEAN_TYPE) {
			error("A text widget may not refer to a boolean attribute.",
					GuiDslPackage.Literals.WIDGET__ATTR, INCOMPATIBLE_TYPES);
		}
	}

	/**
	 * 3) Checkbox widgets may only refer to boolean attributes.
	 */
	@Check
	void check(CheckBoxWidget widget) {
		Attribute attr = widget.getAttr();
		Type type = guiDslTypeProvider.getType(attr);
		if (type.eClass() != GuiDslPackage.Literals.BOOLEAN_TYPE) {
			error("Checkbox widget may only refer to boolean attributes.",
					GuiDslPackage.Literals.WIDGET__ATTR, INCOMPATIBLE_TYPES);
		}
	}
}

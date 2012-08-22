package org.typesys.guidsl.validation

import org.typesys.guidsl.validation.AbstractGuiDslJavaValidator
import com.google.inject.Inject
import org.typesys.guidsl.types.GuiDslTypeProvider
import org.typesys.guidsl.types.TypeConformance
import org.eclipse.xtext.validation.Check
import org.typesys.guidsl.guiDsl.Expression
import org.typesys.guidsl.guiDsl.TextWidget
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.CheckBoxWidget
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.typesys.guidsl.guiDsl.CyclicDependencyType
import org.typesys.guidsl.guiDsl.Widget
import org.typesys.guidsl.guiDsl.GuiDslPackage

class GuiDslValidator extends AbstractGuiDslJavaValidator {
	//tex
	public static val String INCOMPATIBLE_TYPES = "incompatible_types";

	@Inject
	extension GuiDslTypeProvider guiDslTypeProvider;

	@Inject
	extension TypeConformance conformance;

	/**
	 * 1) The expression after "validate" must be boolean. This covers
	 * expression validation in general. The {@link GuiDslTypeProvider} decides
	 * which type the expression has and which type it should have.
	 * 
	 */
	//tex
	@Check
	def public void check(Expression expr) {
		checkType(expr);
	}

	/**
	 * 2) Text widgets may only refer to non-boolean attributes.
	 * @param widget
	 */
	@Check
	def public void check(TextWidget widget) {
		val Type type = guiDslTypeProvider.getType(widget.getAttr());
		if (type.eClass() == GuiDslPackage$Literals::BOOLEAN_TYPE) {
			error("A text widget may not refer to a boolean attribute.",
					GuiDslPackage$Literals::WIDGET__ATTR, INCOMPATIBLE_TYPES);
		}
	}
	//tex

	/**
	 * 3) Checkbox widgets may only refer to boolean attributes.
	 */
	@Check
	def void check(CheckBoxWidget widget) {
		val Type type = guiDslTypeProvider.getType(widget.getAttr());
		if (type.eClass() != GuiDslPackage$Literals::BOOLEAN_TYPE) {
			error("Checkbox widget may only refer to boolean attributes.",
					GuiDslPackage$Literals::WIDGET__ATTR, INCOMPATIBLE_TYPES);
		}
	}
	
	@Check
	def void checkWidget(Widget widget) {
		checkType(widget, GuiDslPackage$Literals::WIDGET__ATTR);
	}
	
	def protected void checkType(EObject object) {
		checkType(object, null);
	}
	
	/**
	 * @param object - EObject from the DSL to check type, e.g. Widget
	 * @param feature - feature for error message location, e.g. Attribute reference,
	 * may be {@code null}
	 */
	def checkType(EObject object, EStructuralFeature feature) {
		val expectedType = object.getExpectedType
		val actualType = object.getType
		if (actualType instanceof CyclicDependencyType) {
			error("Type is part of a cyclic dependency.", feature,
					INCOMPATIBLE_TYPES); return;
		}
		if (expectedType == null)
			return;
		if (!expectedType.isAssignable(actualType)) {
			error("Incompatible types. Expected '" + expectedType
					+ "' but was '" + actualType + "'", feature,
					INCOMPATIBLE_TYPES);
		}
	}
	
}
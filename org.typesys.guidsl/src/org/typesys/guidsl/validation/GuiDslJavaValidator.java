package org.typesys.guidsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.typesys.guidsl.guiDsl.Attribute;
import org.typesys.guidsl.guiDsl.CheckBoxWidget;
import org.typesys.guidsl.guiDsl.CyclicDependencyType;
import org.typesys.guidsl.guiDsl.Expression;
import org.typesys.guidsl.guiDsl.GuiDslPackage;
import org.typesys.guidsl.guiDsl.TextWidget;
import org.typesys.guidsl.guiDsl.Type;
import org.typesys.guidsl.guiDsl.Widget;
import org.typesys.guidsl.types.GuiDslTypeProvider;
import org.typesys.guidsl.types.TypeConformance;

import com.google.inject.Inject;
	//tex
public class GuiDslJavaValidator extends AbstractGuiDslJavaValidator {

	//tex
	public final static String INCOMPATIBLE_TYPES = "incompatible_types";

	@Inject
	private GuiDslTypeProvider guiDslTypeProvider;

	@Inject
	private TypeConformance conformance;

	/**
	 * 1) The expression after "validate" must be boolean. This covers
	 * expression validation in general. The {@link GuiDslTypeProvider} decides
	 * which type the expression has and which type it should have.
	 * 
	 */
	//tex
	@Check
	public void check(Expression expr) {
		checkType(expr);
	}

	/**
	 * 2) Text widgets may only refer to non-boolean attributes.
	 * @param widget
	 */
	@Check
	public void check(TextWidget widget) {
		Type type = guiDslTypeProvider.getType(widget.getAttr());
		if (type.eClass() == GuiDslPackage.Literals.BOOLEAN_TYPE) {
			error("A text widget may not refer to a boolean attribute.",
					GuiDslPackage.Literals.WIDGET__ATTR, INCOMPATIBLE_TYPES);
		}
	}
	//tex

	/**
	 * 3) Checkbox widgets may only refer to boolean attributes.
	 */
	@Check
	void check(CheckBoxWidget widget) {
		Type type = guiDslTypeProvider.getType(widget.getAttr());
		if (type.eClass() != GuiDslPackage.Literals.BOOLEAN_TYPE) {
			error("Checkbox widget may only refer to boolean attributes.",
					GuiDslPackage.Literals.WIDGET__ATTR, INCOMPATIBLE_TYPES);
		}
	}
	
	@Check
	void checkWidget(Widget widget) {
		checkType(widget, GuiDslPackage.Literals.WIDGET__ATTR);
	}
	
	protected void checkType(EObject object) {
		checkType(object, null);
	}
	
//tex
	/**
	 * @param object - EObject from the DSL to check type, e.g. Widget
	 * @param feature - feature for error message location, e.g. Attribute reference,
	 * may be {@code null}
	 */
	protected void checkType(EObject object, EStructuralFeature feature) {
		Type expectedType = guiDslTypeProvider.getExpectedType(object);
		Type actualType = guiDslTypeProvider.getType(object);
//tex
		if (actualType instanceof CyclicDependencyType) {
			error("Type is part of a cyclic dependency.", feature,
					INCOMPATIBLE_TYPES); return;
		}
//tex
		if (expectedType == null)
			return;
		if (!conformance.isAssignable(expectedType, actualType)) {
			error("Incompatible types. Expected '" + expectedType
					+ "' but was '" + actualType + "'", feature,
					INCOMPATIBLE_TYPES);
		}
	}
//tex


	
}

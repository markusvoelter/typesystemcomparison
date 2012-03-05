package org.typesys.guidsl.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.typesys.guidsl.guiDsl.Attribute;
import org.typesys.guidsl.guiDsl.CheckBoxWidget;
import org.typesys.guidsl.guiDsl.CyclicDependencyType;
import org.typesys.guidsl.guiDsl.Expression;
import org.typesys.guidsl.guiDsl.GuiDslFactory;
import org.typesys.guidsl.guiDsl.GuiDslPackage;
import org.typesys.guidsl.guiDsl.PrimitiveType;
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

	//tex
	/**
	 * 1) The expression after "validate" must be boolean. This covers
	 * expression validation in general. The {@link GuiDslTypeProvider} decides
	 * which type the expression has and which type it should have.
	 * 
	 */
	@Check
	public void check(Expression expr) {
		Type expectedType = guiDslTypeProvider.getExpectedType(expr);
		Type actualType = guiDslTypeProvider.getType(expr);
		checkTypeCompatibility(expectedType, actualType);
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
	//tex

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
	
	protected void checkTypeCompatibility(Type expectedType, Type actualType) {
		checkTypeCompatibility(expectedType, actualType, null);
	}
	
	protected void checkTypeCompatibility(Type expectedType, Type actualType, EStructuralFeature feature) {
		if (actualType instanceof CyclicDependencyType) {
			error("Type is part of a cyclic dependency.", feature,
					INCOMPATIBLE_TYPES); return;
		}
		if (expectedType == null)
			return;
		if (!conformance.isAssignable(expectedType, actualType)) {
			error("Incompatible types. Expected '" + expectedType
					+ "' but was '" + actualType + "'", feature,
					INCOMPATIBLE_TYPES);
		}
	}

	/**
	 * Widgets may only refer to primitive types
	 */
	@Check
	void check(Widget widget) {
		Type expectedType = guiDslTypeProvider.getExpectedType(widget);
		Type actualType = guiDslTypeProvider.getType(widget);
		checkTypeCompatibility(expectedType, actualType, GuiDslPackage.Literals.WIDGET__ATTR);
	}	

	
}

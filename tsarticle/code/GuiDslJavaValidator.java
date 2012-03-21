public class GuiDslJavaValidator extends AbstractGuiDslJavaValidator {

	public final static String INCOMPATIBLE_TYPES = "incompatible_types";
	@Inject private GuiDslTypeProvider guiDslTypeProvider;
	@Inject private TypeConformance conformance;

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
	
	/**
	 * @param object - EObject from the DSL to check type, e.g. Widget
	 * @param feature - feature for error message location, e.g. Attribute reference,
	 * may be {@code null}
	 */
	protected void checkType(EObject object, EStructuralFeature feature) {
		Type expectedType = guiDslTypeProvider.getExpectedType(object);
		Type actualType = guiDslTypeProvider.getType(object);
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
	
}

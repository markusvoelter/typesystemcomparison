package org.typesys.xsem.guidsl.xsemantics.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsBasedDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.typesys.xsem.guidsl.xsemGuiDsl.Attribute;
import org.typesys.xsem.guidsl.xsemGuiDsl.CheckBoxWidget;
import org.typesys.xsem.guidsl.xsemGuiDsl.Entity;
import org.typesys.xsem.guidsl.xsemGuiDsl.TextWidget;
import org.typesys.xsem.guidsl.xsemGuiDsl.Widget;
import org.typesys.xsem.guidsl.xsemantics.TypeSystem;

public class TypeSystemValidator extends XsemanticsBasedDeclarativeValidator {
	@Inject
	protected TypeSystem xsemanticsSystem;

	@Check
	public void acyclicEntityHierarchy(final Entity entity) {
		generateErrors(
			xsemanticsSystem.acyclicEntityHierarchy(entity),
			entity);
	}
	
	@Check
	public void attributeTypeChecks(final Attribute attribute) {
		generateErrors(
			xsemanticsSystem.attributeTypeChecks(attribute),
			attribute);
	}
	
	@Check
	public void validateMustBeBoolean(final Widget widget) {
		generateErrors(
			xsemanticsSystem.validateMustBeBoolean(widget),
			widget);
	}
	
	@Check
	public void validateTextWidgetAttributeNotBoolean(final TextWidget widget) {
		generateErrors(
			xsemanticsSystem.validateTextWidgetAttributeNotBoolean(widget),
			widget);
	}
	
	@Check
	public void validateCheckBoxWidgetAttributeBoolean(final CheckBoxWidget widget) {
		generateErrors(
			xsemanticsSystem.validateCheckBoxWidgetAttributeBoolean(widget),
			widget);
	}
}

package org.typesys.xbase.guidsl.validation;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.typesys.xbase.guidsl.xGuiDsl.Widget;
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage;

import com.google.inject.Inject;

public class XGuiDslJavaValidator extends AbstractXGuiDslJavaValidator {

	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital",
	// MyDslPackage.Literals.GREETING__NAME);
	// }
	// }
	
	@Inject
	XGuiTypeInferrer xtend2JvmModelInferrer;

	@Check
	public void checkValidateIsBoolean(Widget widget) {
		if (widget.getValidate() != null) {
			XExpression expr = widget.getValidate().getExpr();
			JvmTypeReference type = xtend2JvmModelInferrer.getType(expr);
			warning("Type is " + type.getQualifiedName(), XGuiDslPackage.Literals.WIDGET__VALIDATE);
		}
	}

}

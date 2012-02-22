package org.typesys.xsem.guidsl.tests

import com.google.inject.Inject
import com.google.inject.Injector
import junit.framework.Assert
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import org.typesys.xsem.guidsl.validation.XsemGuiDslJavaValidator
import org.typesys.xsem.guidsl.xsemGuiDsl.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslValidatorTests extends XsemGuiDslAbstractTests {
	
	@Inject XsemGuiDslJavaValidator validator
	
	@Inject Injector injector
	
	ValidatorTester<XsemGuiDslJavaValidator> tester
	
	@Inject extension ParseHelper<Model>
	
	@Before
	def void setUp() {
		tester = new ValidatorTester<XsemGuiDslJavaValidator>(validator, injector)
	}
	
	@Test
	def void testWidgetValidation() {
		assertOk(inputs.testEntity)
	}
	
	@Test
	def void testWidgetValidationWrong() {
		assertAll(inputs.testWrongWidgets,
'''
Diagnostic ERROR "text widget attribute must NOT be boolean" at Model.forms[1]->Form'MyForm'.widgets[1]->TextWidget.attr==((instanceof SimpleAttribute: org.typesys.xsem.guidsl.xsemGuiDsl.impl.SimpleAttributeImpl (name: myBool))
Diagnostic ERROR "validate expression must be boolean" at Model.forms[1]->Form'MyForm'.widgets[2]->CheckBoxWidget.validate->StringLiteral
Diagnostic ERROR "checkbox widget attribute must be boolean" at Model.forms[1]->Form'MyForm'.widgets[3]->CheckBoxWidget.attr==((instanceof SimpleAttribute: org.typesys.xsem.guidsl.xsemGuiDsl.impl.SimpleAttributeImpl (name: myInt))'''
		)
	}
	
	def void assertOk(CharSequence program) {
		assertOk(tester.validate(program.parse))
	}
	
	def void assertOk(AssertableDiagnostics validate) {
		if (listOfDiagnostics(validate).size() != 0) {
			for (diag : listOfDiagnostics(validate)) {
				System::err.println(diag.toString());
			}
			Assert::fail("There are expected to be no diagnostics.: "
					+ diagnosticsToString(validate));
		}
	}
	
	def void assertAll(CharSequence program, CharSequence expectedErrors) {
		assertAll(
			tester.validate(program.parse),
			expectedErrors
		)
	}
	
	def void assertAll(AssertableDiagnostics validate,
			CharSequence expectedErrors) {
		Assert::assertEquals(
			removeObjectIdentifiers(expectedErrors.toString()).trim(),
			removeObjectIdentifiers(diagnosticsToString(validate))
		);
	}
	
	def listOfDiagnostics(AssertableDiagnostics validate) {
		return validate.getDiagnostic().getChildren();
	}
	
	def diagnosticsToString(AssertableDiagnostics validate) {
		validate.diagnostic.children.join("\n");
	}
	
	def removeObjectIdentifiers(String s) {
		s.replaceAll("@(\\w)+", "")
	}
}
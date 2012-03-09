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
Diagnostic ERROR "text widget attribute must NOT be boolean" at Model.forms[1]->Form'MyForm'.widgets[1]->TextWidget.attr==((instanceof Attribute: org.typesys.xsem.guidsl.xsemGuiDsl.impl.AttributeImpl (name: myBool))
Diagnostic ERROR "validate expression must be boolean" at Model.forms[1]->Form'MyForm'.widgets[2]->CheckBoxWidget.validate->StringLiteral
Diagnostic ERROR "checkbox widget attribute must be boolean" at Model.forms[1]->Form'MyForm'.widgets[3]->CheckBoxWidget.attr==((instanceof Attribute: org.typesys.xsem.guidsl.xsemGuiDsl.impl.AttributeImpl (name: myInt))'''
		)
	}
	
	@Test
	def void testCompareMixedWrong() {
		assertAll(inputs.testEntityForExpressions,
'''
Diagnostic ERROR code=org.typesys.xsem.guidsl.xsemantics.rules.ComparisonType "failed: cannot type expression '10' <= 20" at Model.entities[0]->Entity'MyEntity'.attributes[0]->Attribute'CompareMixed'.expr->Comparison
Diagnostic ERROR code=org.typesys.xsem.guidsl.xsemantics.rules.ComparisonType "failed: cannot type expression true <= false" at Model.entities[0]->Entity'MyEntity'.attributes[1]->Attribute'CompareBool'.expr->Comparison
Diagnostic ERROR code=org.typesys.xsem.guidsl.xsemantics.rules.EqualsType "failed: cannot type expression '10' == 20" at Model.entities[0]->Entity'MyEntity'.attributes[2]->Attribute'EqualsMixed'.expr->Equals'''
		)
	}
	
	@Test
	def void testCyclicHierarchy() {
		assertAll(inputs.testCyclicHierarchy,
'''
Diagnostic ERROR "Cyclic hierarchy for A" at Model.entities[0]->Entity'A'
Diagnostic ERROR "Cyclic hierarchy for B" at Model.entities[1]->Entity'B'
Diagnostic ERROR "Cyclic hierarchy for C" at Model.entities[2]->Entity'C' '''
		)
	}
	
	@Test
	def void testWrongAttributeInitialization() {
		assertAll(inputs.testWrongAttributeInitialization,
'''
Diagnostic ERROR code=org.typesys.xsem.guidsl.xsemantics.rules.AttributeType "failed: cannot type attribute wrong : Derived = new Base;" at Model.entities[2]->Entity'MyEntity'.attributes[1]->Attribute'wrong' '''
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
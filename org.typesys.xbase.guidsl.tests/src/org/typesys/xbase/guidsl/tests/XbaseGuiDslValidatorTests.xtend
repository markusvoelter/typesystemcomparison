package org.typesys.xbase.guidsl.tests

import com.google.inject.Inject
import com.google.inject.Injector
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.xbase.guidsl.XGuiDslInjectorProvider
import org.typesys.xbase.guidsl.validation.XGuiDslJavaValidator

import static org.typesys.xbase.guidsl.tests.XbaseGuiDslAbstractTests.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XGuiDslInjectorProvider))
class XbaseGuiDslValidatorTests extends XbaseGuiDslAbstractTests {

  @Inject Injector injector
  
  @Inject XGuiDslJavaValidator validator
  
  ValidatorTester<XGuiDslJavaValidator> validatorTester
  
  @Before
  override void setUp() {
    super.setUp()
    validatorTester = new ValidatorTester<XGuiDslJavaValidator>(validator, injector)
  }
	
  @Test
  def void task1() {
    validatorTester.validate(modelParser.parse(ROOT + "task1")).assertOK()
  }
  
  @Test
  def void task1inv() {
//    val p = modelParser.parse(ROOT + "task1invalid")
//    for (widget: p.forms.head.widgets ) {
//      validatorTester.validator.checkTextWidgetForNonBoolean(widget as TextWidget)
//      validatorTester.diagnose().assertError(XGuiDslJavaValidator::TASK2_ERR.toString)
//   	}
    /// println(diag)
    // diag.assertError()
  }

  @Test
  def void task2() {
    validatorTester.validate(modelParser.parse(ROOT + "task2")).assertOK()
  }
  
  @Test
  def void task2inv() {
    val diag = validatorTester.validate(modelParser.parse(ROOT + "task2invalid"))
    diag.assertError(XGuiDslJavaValidator::TASK2_ERR)
  }
  
  @Test
  def void task3() {
    validatorTester.validate(modelParser.parse(ROOT + "task3")).assertOK()
  }	

  @Test
  def void task3inv() {
    val diag = validatorTester.validate(modelParser.parse(ROOT + "task3invalid"))
    diag.assertError(XGuiDslJavaValidator::TASK3_ERR)
  }

	
}
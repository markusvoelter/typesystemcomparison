package org.typesys.xbase.guidsl.tests

import com.google.inject.Inject
import com.google.inject.Injector
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.xbase.XbasePackage$Literals
import org.eclipse.xtext.xbase.validation.IssueCodes
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.xbase.guidsl.XGuiDslInjectorProvider
import org.typesys.xbase.guidsl.validation.XGuiDslJavaValidator
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage$Literals

import static org.typesys.xbase.guidsl.tests.XbaseGuiDslAbstractTests.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XGuiDslInjectorProvider))
class XbaseGuiDslValidatorTests extends XbaseGuiDslAbstractTests {

  @Inject Injector injector
  
  @Inject XGuiDslJavaValidator validator
  
  @Inject extension ValidationTestHelper
  
  ValidatorTester<XGuiDslJavaValidator> validatorTester
  
  @Before
  override void setUp() {
    super.setUp()
    validatorTester = new ValidatorTester<XGuiDslJavaValidator>(validator, injector)
  }

  /**
   * Xbase evaluation takes care of the checks for task1
   */
  @Test
  def void task1() {
  	val model = xParseHelper.parse(ROOT + "task1")
    model.assertNoIssues
  }
  
  @Test
  def void task1inv() {
    val p = xParseHelper.parse(ROOT + "task1invalid")
    p.assertError(XbasePackage$Literals::XEXPRESSION, IssueCodes::INCOMPATIBLE_RETURN_TYPE,"boolean", "int") 
    p.assertError(XbasePackage$Literals::XEXPRESSION, IssueCodes::INCOMPATIBLE_RETURN_TYPE,"boolean", "java.lang.String")
  }

  @Test
  def void task2() {
     xParseHelper.parse(ROOT + "task2").assertNoIssues
  }
  
  @Test
  def void task2inv() {
    val p = xParseHelper.parse(ROOT + "task2invalid")
    p.assertError(XGuiDslPackage$Literals::TEXT_WIDGET, IssueCodes::INCOMPATIBLE_TYPES, "boolean")
  }
  
  @Test
  def void task3() {
    xParseHelper.parse(ROOT + "task3").assertNoIssues
  }	

  @Test
  def void task3inv() {
    val p = xParseHelper.parse(ROOT + "task3invalid")
    p.assertError(XGuiDslPackage$Literals::CHECK_BOX_WIDGET, IssueCodes::INCOMPATIBLE_TYPES, "boolean")
  }
	
}
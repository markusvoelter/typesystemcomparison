package org.typesys.xbase.guidsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XbasePackage$Literals
import org.eclipse.xtext.xbase.validation.IssueCodes
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.xbase.guidsl.XGuiDslInjectorProvider
import org.typesys.xbase.guidsl.xGuiDsl.Model
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XGuiDslInjectorProvider))
class ParsingTests {
	
	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper
	@Test
	def void simpleTest() {
		val model = '''
			entity PersonX {
				name      : String;
				firstName : String;
				age       : int; 
				weight    : Float;
				likesCake : boolean; 
			    /isAdult = age > 18;
				/greeting = "Hello " + firstName + " " + name;
			}
			
			entity House {
				floors : int; 
				street : String;
			}
			
			form PersonFormValidate edits PersonX {
				 text(20) -> name validate name.length > 2 ;
			}
		'''.parse
		model.assertNoErrors
	}
	
	@Test
	def void testExpectedReturnTypeOfValidation() {
		val model = '''
			entity PersonX {
				firstName : String;
			}
			
			form PersonForm edits PersonX {
				text (12) -> firstName validate firstName; 
			}
			
		'''.parse
		model.assertError(XbasePackage$Literals::XEXPRESSION, IssueCodes::INCOMPATIBLE_RETURN_TYPE, 'boolean','String')
	}
	
	@Test
	def void testCheckBoxMustPointToBooleanAttribute() {
		val model = '''
			entity PersonX {
				firstName : String;
			}
			
			form PersonForm edits PersonX {
				checkbox -> firstName; 
			}
			
		'''.parse
		model.assertError(XGuiDslPackage$Literals::CHECK_BOX_WIDGET, IssueCodes::INCOMPATIBLE_TYPES, 'boolean','String')
	}
	
	@Test
	def void testTextMustNotPointToBooleanAttribute() {
		val model = '''
			entity PersonX {
				myFlag : boolean;
			}
			
			form PersonForm edits PersonX {
				text (20) -> myFlag; 
			}
			
		'''.parse
		model.assertError(XGuiDslPackage$Literals::TEXT_WIDGET, IssueCodes::INCOMPATIBLE_TYPES, 'boolean')
	}
}
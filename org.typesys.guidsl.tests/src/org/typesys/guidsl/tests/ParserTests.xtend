package org.typesys.guidsl.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.typesys.guidsl.GuiDslInjectorProvider
import org.junit.Test
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.typesys.guidsl.guiDsl.Model
import org.typesys.guidsl.guiDsl.GuiDslPackage
import org.typesys.guidsl.validation.GuiDslJavaValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GuiDslInjectorProvider))
class ParserTests {
	
	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper
	@Test
	def void simpleTest() {
		val model = '''
			entity PersonX {
				name      : string;
				firstName : string;
				age       : int; 
				weight    : float;
				likesCake : bool; 
			    /isAdult = age > 18;
				/greeting = "Hello " + firstName + " " + name;
			}
			
			entity House {
				floors : int; 
				street : string;
			}
			
			form PersonFormValidate edits PersonX {
				 text(20) -> name validate lengthOf(name) > 2 ;
			}
		'''.parse
		model.assertNoErrors
	}
	
	@Test
	def void testExpectedReturnTypeOfValidation() {
		val model = '''
			entity PersonX {
				firstName : string;
			}
			
			form PersonForm edits PersonX {
				text (12) -> firstName validate firstName; 
			}
			
		'''.parse
		model.assertError(GuiDslPackage$Literals::EXPRESSION, GuiDslJavaValidator::INCOMPATIBLE_TYPES, 'bool','string')
	}
	
	@Test
	def void testCheckBoxMustPointToBooleanAttribute() {
		val model = '''
			entity PersonX {
				firstName : string;
			}
			
			form PersonForm edits PersonX {
				checkbox -> firstName; 
			}
			
		'''.parse
		model.assertError(GuiDslPackage$Literals::CHECK_BOX_WIDGET, GuiDslJavaValidator::INCOMPATIBLE_TYPES, 'boolean')
	}
	
	@Test
	def void testTextMustNotPointToBooleanAttribute() {
		val model = '''
			entity PersonX {
				myFlag : bool;
			}
			
			form PersonForm edits PersonX {
				text (20) -> myFlag; 
			}
			
		'''.parse
		model.assertError(GuiDslPackage$Literals::TEXT_WIDGET, GuiDslJavaValidator::INCOMPATIBLE_TYPES, 'boolean')
	}
}
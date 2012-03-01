package org.typesys.guidsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.guidsl.GuiDslInjectorProvider
import org.typesys.guidsl.guiDsl.Model
import org.typesys.guidsl.guiDsl.GuiDslPackage
import org.typesys.guidsl.validation.GuiDslJavaValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GuiDslInjectorProvider))
class InheritanceTest {

	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper

	CharSequence base = '''
				entity Person {
					name      : string;
					firstName : string;
					age       : int; 
					weight    : float;
					likesCake : bool; 
					/isAdult = age > 18;
					/greeting = "Hello " + firstName + " " + name;
					/testExpr = 2 - 2;
				}
				
				entity Teacher extends Person {
					subject : string;
				}
				
				entity Gym {}
	'''
	
	@Test
	def void simpleTest() { 
		val model = '''
				«base»
				entity School {
					/head : Person = new Teacher; // correct
					gym  = new Gym;
					gym2 : Gym = new Gym;
				}
		'''.parse
		model.assertNoErrors
	}
	
	@Test
	def void incompatibleTypes() {
		val model = '''
				«base»
				entity School {
					janitor: Person = new Gym; // error 
				}
		'''.parse
		model.assertError(GuiDslPackage$Literals::EXPRESSION, GuiDslJavaValidator::INCOMPATIBLE_TYPES, "Person", "Gym")
	}
	
}
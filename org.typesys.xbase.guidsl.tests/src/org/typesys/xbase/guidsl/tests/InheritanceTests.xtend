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
class InheritanceTests {
	
	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper
	
	CharSequence base = '''
				entity Person {
					name      : String;
					firstName : String;
					age       : int; 
					weight    : Float;
					likesCake : boolean; 
					isAdult = age > 18;
					greeting = "Hello " + firstName + " " + name;
					testExpr = 2 - 2;
				}
				
				entity Teacher extends Person {
					subject : String;
				}
				
				entity Gym {}
	'''	
	
	@Test
	def void simpleTest() {// TODO test without "/" for initialized attributes
		val model = '''
				«base»
				entity School {
					head : Person = new Teacher; // correct
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
		model.assertError(XbasePackage$Literals::XEXPRESSION, IssueCodes::INCOMPATIBLE_RETURN_TYPE, "Person", "Gym")
	}	
	
}
package org.typesys.xbase.guidsl.tests

import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.typesys.xbase.guidsl.XGuiDslInjectorProvider
import org.junit.Test
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.typesys.xbase.guidsl.xGuiDsl.Model
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XGuiDslInjectorProvider))
class ParsingTests {
	
	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper
	@Inject IGenerator generator
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
		val fsa = new InMemoryFileSystemAccess()
		generator.doGenerate(model.eResource, fsa)
		println(fsa.files)
		
		model.assertNoErrors
	}
}
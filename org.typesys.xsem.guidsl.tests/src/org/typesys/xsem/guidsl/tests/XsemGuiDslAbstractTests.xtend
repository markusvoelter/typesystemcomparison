package org.typesys.xsem.guidsl.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.typesys.xsem.guidsl.xsemGuiDsl.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslAbstractTests {
	
	protected XsemGuiDslInputs inputs = new XsemGuiDslInputs()
	
	@Inject extension ParseHelper<Model>
	
	def parseModel(CharSequence input) {
		input.parse
	}
}
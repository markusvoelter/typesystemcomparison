package org.typesys.xsem.guidsl.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslParserTests extends XsemGuiDslAbstractTests {
	
	@Test
	def void testEntity() {
		inputs.testEntity.parseModel
	}
}
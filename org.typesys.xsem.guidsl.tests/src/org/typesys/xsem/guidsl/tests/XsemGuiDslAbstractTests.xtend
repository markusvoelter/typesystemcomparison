package org.typesys.xsem.guidsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.runner.RunWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import org.typesys.xsem.guidsl.xsemGuiDsl.Attribute
import org.typesys.xsem.guidsl.xsemGuiDsl.Model

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.typesys.xsem.guidsl.xsemGuiDsl.DerivedAttribute
import org.typesys.xsem.guidsl.xsemGuiDsl.TextWidget

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslAbstractTests {
	
	protected XsemGuiDslInputs inputs = new XsemGuiDslInputs()
	
	@Inject extension ParseHelper<Model>
	
	def parseModel(CharSequence input) {
		input.parse
	}
	
	def attribute(CharSequence input, String attrName) {
		input.parse.
			getAllContentsOfType(typeof(Attribute)).
				findFirst [ it.name == attrName ]
	}
	
	def derivedAttribute(CharSequence input, String attrName) {
		input.parse.
			getAllContentsOfType(typeof(DerivedAttribute)).
				findFirst [ it.name == attrName ]
	}
	
	def textwidget(CharSequence input, int index) {
		input.parse.
			getAllContentsOfType(typeof(TextWidget)).get(index)
	}
}
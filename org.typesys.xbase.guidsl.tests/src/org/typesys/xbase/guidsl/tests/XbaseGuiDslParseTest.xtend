package org.typesys.xbase.guidsl.tests

import org.junit.Test
import org.typesys.xbase.guidsl.xGuiDsl.Form

import static org.junit.Assert.*
import org.typesys.xbase.guidsl.xGuiDsl.Widget

class XbaseGuiDslParseTest extends XbaseGuiDslAbstractTests {
	
    @Test
	def void parseForm() {
	  val model = xParseHelper.parse('''form PersonFormValidate edits PersonT {
	 text(20) -> name validate true;
}''')
      val form = model.elements.head as Form
      assertEquals("PersonFormValidate", form.name)
      assertEquals("PersonT", form.entity.name)
      assertEquals("name", form.entity.attributes.head.name)
      assertEquals("firstName", form.entity.attributes.get(1).name )
      assertEquals(form.widgets.head.attr, form.entity.attributes.head)
      assertNotNull(form.widgets.head.validate)
	}
	
}
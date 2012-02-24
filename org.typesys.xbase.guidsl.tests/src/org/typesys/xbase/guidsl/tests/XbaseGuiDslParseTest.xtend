package org.typesys.xbase.guidsl.tests

import org.junit.Test
import org.typesys.xbase.guidsl.xGuiDsl.Form

import static org.junit.Assert.*

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
// TODO
//      val widget = model.elements.head.widgets.head
//      assertNotNull(widget.validate)
	}
	
}
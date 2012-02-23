package org.typesys.xbase.guidsl.tests

import org.junit.Test
import org.typesys.xbase.guidsl.xGuiDsl.Form

import static org.junit.Assert.*

class XbaseGuiDslParseTest extends XbaseGuiDslAbstractTests {
	
    @Test
	def void parseForm() {
	  val model = modelParser.parse('''form PersonFormValidate edits PersonT {
	 text(20) -> name validate true;
}''')
      val form = model.forms.head as Form
      assertEquals("PersonFormValidate", form.name)
      assertEquals("PersonT", form.entity.name)
      assertEquals("name", form.entity.attributes.head.name)
      assertEquals("firstName", form.entity.attributes.get(1).name )
      val widget = model.forms.head.widgets.head
      assertNotNull(widget.validate)
	}
	
}
package org.typesys.xbase.guidsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.runner.RunWith
import org.typesys.xbase.guidsl.XGuiDslInjectorProvider
import org.typesys.xbase.guidsl.xGuiDsl.Model

import static org.typesys.xbase.guidsl.tests.XbaseGuiDslAbstractTests.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XGuiDslInjectorProvider))
class XbaseGuiDslAbstractTests {
	
	protected static String ROOT = "../exampleCode/test-samples/xbase/"
    protected static String ENTITIES = ROOT + "entities.xbgui"
    
    @Inject
	protected XParseHelper<Model> modelParser
    
    @Before
	def void setUp() {
		modelParser.parse(ENTITIES)
	}
    		
}
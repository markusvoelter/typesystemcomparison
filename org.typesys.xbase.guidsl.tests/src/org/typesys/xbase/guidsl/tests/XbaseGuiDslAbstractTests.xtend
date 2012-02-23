package org.typesys.xbase.guidsl.tests

import org.junit.Before
import com.google.inject.Inject
import org.typesys.xbase.guidsl.xGuiDsl.Model
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Provider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.typesys.xbase.guidsl.XGuiDslInjectorProvider

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
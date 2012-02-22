package org.typesys.xsem.guidsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import org.typesys.xsem.guidsl.xsemantics.TypeSystem
import it.xsemantics.runtime.RuleApplicationTrace
import it.xsemantics.runtime.util.TraceUtils
import junit.framework.Assert
import it.xsemantics.runtime.StringRepresentation

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslTypingTests extends XsemGuiDslAbstractTests {
	
	@Inject TypeSystem typesystem

	RuleApplicationTrace trace
	
	@Inject extension TraceUtils
	
	@Inject extension StringRepresentation
	
	@Before
	def void setUp() {
		trace = new RuleApplicationTrace()
	}
	
	@Test
	def void testStringAttribute() {
		assertAttributeType(inputs.testEntity, "myString", "string")
	}
	
	@Test
	def void testIntAttribute() {
		assertAttributeType(inputs.testEntity, "myInt", "int")
	}
	
	@Test
	def void testFloatAttribute() {
		assertAttributeType(inputs.testEntity, "myDecimal", "float")
	}
	
	@Test
	def void testBooleanAttribute() {
		assertAttributeType(inputs.testEntity, "myBool", "bool")
	}
	
	@Test
	def void testEntityAttribute() {
		assertAttributeType(inputs.testEntity, "myEntity", "MyEntity")
	}
	
	@Test
	def void testStringLiteral() {
		assertAttributeType(inputs.testEntity, "myStringDerived", "StringType")
	}
	
	@Test
	def void testDecimalLiteral() {
		assertAttributeType(inputs.testEntity, "myDecimalDerived", "FloatType")
	}

	@Test
	def void testBooleanLiteral() {
		assertAttributeType(inputs.testEntity, "myBooleanDerived", "BooleanType")
	}
	
	def void assertAttributeType(CharSequence input, String attrName, 
			CharSequence expectedType) {
		val result = typesystem.attrtype(null, trace, input.attribute(attrName))
		if (result.failed) {
			Assert::fail("unexpected failure: " +
				result.ruleFailedException.failureTraceAsString
			)
		}
		Assert::assertEquals(expectedType.toString, result.value.string)
	}
}
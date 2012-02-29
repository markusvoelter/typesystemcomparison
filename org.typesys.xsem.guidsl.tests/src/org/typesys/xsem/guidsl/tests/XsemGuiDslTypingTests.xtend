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
import org.typesys.xsem.guidsl.xsemGuiDsl.Expression
import it.xsemantics.runtime.RuleEnvironment

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
	
	@Test
	def void testMultiIntType() {
		assertAttributeType(inputs.testEntityForExpressions, "MultiInt", "int")
	}
	
	@Test
	def void testMultiFloatMostGeneralType() {
		assertAttributeType(inputs.testEntityForExpressions, "MultiFloatMostGeneral", "FloatType")
	}
	
	@Test
	def void testMultiFloatType() {
		assertAttributeType(inputs.testEntityForExpressions, "MultiFloat", "FloatType")
	}
	
	@Test
	def void testDivFloatType() {
		assertAttributeType(inputs.testEntityForExpressions, "Div", "FloatType")
	}
	
	@Test
	def void testMinusFloatType() {
		assertAttributeType(inputs.testEntityForExpressions, "Minus", "FloatType")
	}
	
	@Test
	def void testPlusFloatType() {
		assertAttributeType(inputs.testEntityForExpressions, "PlusNum", "FloatType")
	}
	
	@Test
	def void testPlusStringType() {
		assertAttributeType(inputs.testEntityForExpressions, "PlusString", "StringType")
	}
	
	@Test
	def void testPlusMixedType() {
		assertAttributeType(inputs.testEntityForExpressions, "PlusMixed", "StringType")
	}
	
	@Test
	def void testCompareNumType() {
		assertAttributeType(inputs.testEntityForExpressions, "CompareNum", "BooleanType")
	}

	@Test
	def void testCompareStringType() {
		assertAttributeType(inputs.testEntityForExpressions, "CompareString", "BooleanType")
	}
	
	@Test
	def void testEqualsNumType() {
		assertAttributeType(inputs.testEntityForExpressions, "EqualsNum", "BooleanType")
	}

	@Test
	def void testEqualsStringType() {
		assertAttributeType(inputs.testEntityForExpressions, "EqualsString", "BooleanType")
	}
	
	@Test
	def void testEqualsBoolType() {
		assertAttributeType(inputs.testEntityForExpressions, "EqualsBool", "BooleanType")
	}
	
	@Test
	def void testCompareMixedType() {
		assertAttributeType(inputs.testEntityForExpressions, "CompareMixed", null)
	}
	
	@Test
	def void testAndType() {
		assertAttributeType(inputs.testEntityForExpressions, "And", "BooleanType")
	}
	
	@Test
	def void testOrType() {
		assertAttributeType(inputs.testEntityForExpressions, "Or", "BooleanType")
	}
	
	@Test
	def void testBooleanNegationType() {
		assertAttributeType(inputs.testEntityForExpressions, "BooleanNegation", "BooleanType")
	}
	
	@Test
	def void testSignedIntType() {
		assertAttributeType(inputs.testEntityForExpressions, "SignedInt", "int")
	}
	
	@Test
	def void testSignedFloatType() {
		assertAttributeType(inputs.testEntityForExpressions, "SignedFloat", "FloatType")
	}
	
	@Test
	def void testLengthOfType() {
		assertAttributeType(inputs.testEntityForExpressions, "LengthOf", "IntType")
	}
	
	@Test
	def void testFieldContentType() {
		val widget = inputs.testEntity.textwidget(0)
		assertExpressionType(
			typesystem.environmentEntry('widgetcontent', widget.attr),
			widget.validate, 
			"BooleanType")
	}
	
	def void assertAttributeType(CharSequence input, String attrName, 
			CharSequence expectedType) {
		val result = typesystem.attrtype(null, trace, input.attribute(attrName))
		if (expectedType != null) {
			if (result.failed) {
				Assert::fail("unexpected failure: " +
					result.ruleFailedException.failureTraceAsString
				)
			}
			Assert::assertEquals(expectedType.toString, result.value.string)
		} else {
			if (!result.failed) {
				Assert::fail("unexpected success: " +
					trace.traceAsString
				)
			}
		}
	}
	
	def void assertExpressionType(RuleEnvironment env, Expression expression, 
			CharSequence expectedType) {
		val result = typesystem.exprtype(env, trace, expression)
		if (expectedType != null) {
			if (result.failed) {
				Assert::fail("unexpected failure: " +
					result.ruleFailedException.failureTraceAsString
				)
			}
			Assert::assertEquals(expectedType.toString, result.value.string)
		} else {
			if (!result.failed) {
				Assert::fail("unexpected success: " +
					trace.traceAsString
				)
			}
		}
	}
}
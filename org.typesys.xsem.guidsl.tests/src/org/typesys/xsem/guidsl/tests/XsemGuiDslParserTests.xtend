package org.typesys.xsem.guidsl.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import org.junit.Test
import org.typesys.xsem.guidsl.xsemGuiDsl.Expression
import com.google.inject.Inject
import it.xsemantics.runtime.StringRepresentation
import org.typesys.xsem.guidsl.xsemGuiDsl.BooleanNegation
import org.typesys.xsem.guidsl.xsemGuiDsl.Comparison
import org.typesys.xsem.guidsl.xsemGuiDsl.AndOrExpression
import org.typesys.xsem.guidsl.xsemGuiDsl.Plus
import org.typesys.xsem.guidsl.xsemGuiDsl.Minus
import org.typesys.xsem.guidsl.xsemGuiDsl.MultiOrDiv
import org.typesys.xsem.guidsl.xsemGuiDsl.ArithmeticSigned
import junit.framework.Assert

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslParserTests extends XsemGuiDslAbstractTests {
	
	@Inject extension StringRepresentation
	
	@Test
	def void testEntity() {
		inputs.testEntity.parseModel
	}
	
	@Test
	def void testExpressionAssociativity() {
		Assert::assertEquals(
'''
&&
	<
		+
			*
				1
				10
			/
				-
					2
				3
		1
	!
		myBool
'''.toString,
'''
entity MyEntity {
	myString : string;
	myBool : bool;
	myInt : int;
	myDecimal : float;
	
	/Exp = 1 * 10 + -2 / 3 < 1 && !myBool
}
'''.
				derivedAttribute("Exp").expr.expressionToString
		)
	}
	
	def expressionToString(Expression expression) {
		switch (expression) {
			AndOrExpression:
			'''
			«expression.op»
				«expression.left.expressionToString»
				«expression.right.expressionToString»
			'''
			Comparison:
			'''
			«expression.op»
				«expression.left.expressionToString»
				«expression.right.expressionToString»
			'''
			Plus:
			'''
			+
				«expression.left.expressionToString»
				«expression.right.expressionToString»
			'''
			Minus:
			'''
			-
				«expression.left.expressionToString»
				«expression.right.expressionToString»
			'''
			MultiOrDiv:
			'''
			«expression.op»
				«expression.left.expressionToString»
				«expression.right.expressionToString»
			'''
			BooleanNegation:
			'''
			!
				«expression.expression.expressionToString»
			'''
			ArithmeticSigned:
			'''
			-
				«expression.expression.expressionToString»
			'''
			default: expression.string
		}.toString
	}
}
package org.typesys.guidsl.types

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.typesys.guidsl.guiDsl.AttributeRef
import org.typesys.guidsl.guiDsl.DerivedAttribute
import org.typesys.guidsl.guiDsl.Div
import org.typesys.guidsl.guiDsl.Equals
import org.typesys.guidsl.guiDsl.Expression
import org.typesys.guidsl.guiDsl.FalseExpr
import org.typesys.guidsl.guiDsl.FloatLiteral
import org.typesys.guidsl.guiDsl.Greater
import org.typesys.guidsl.guiDsl.GreaterEquals
import org.typesys.guidsl.guiDsl.GuiDslFactory
import org.typesys.guidsl.guiDsl.Implies
import org.typesys.guidsl.guiDsl.IntLiteral
import org.typesys.guidsl.guiDsl.LogicalAnd
import org.typesys.guidsl.guiDsl.LogicalOr
import org.typesys.guidsl.guiDsl.Minus
import org.typesys.guidsl.guiDsl.Multi
import org.typesys.guidsl.guiDsl.NotExpression
import org.typesys.guidsl.guiDsl.Plus
import org.typesys.guidsl.guiDsl.SimpleAttribute
import org.typesys.guidsl.guiDsl.Smaller
import org.typesys.guidsl.guiDsl.SmallerEquals
import org.typesys.guidsl.guiDsl.StringLiteral
import org.typesys.guidsl.guiDsl.TrueExpr
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.Unequals
import org.typesys.guidsl.guiDsl.Widget
import org.typesys.guidsl.guiDsl.lenghtOf

class GuiDslTypeProvider {

	@Inject extension TypeConformance conformance
	
	// declare the built-in types for easy use
	Type bool = GuiDslFactory::eINSTANCE.createBooleanType
	Type _float = GuiDslFactory::eINSTANCE.createFloatType
	Type _int = GuiDslFactory::eINSTANCE.createIntType
	Type number = GuiDslFactory::eINSTANCE.createNumberType
	Type string = GuiDslFactory::eINSTANCE.createStringType
	
	/**
	 * 
	 * @return the type of an element, never <code>null</code>.
	 */
	def Type getType(EObject e) {
		switch e {
			SimpleAttribute : e.type
			DerivedAttribute : e.expr.type
			AttributeRef : e.attr.type
			
			Equals : bool
			Unequals : bool

			Greater : bool
			GreaterEquals : bool
			Smaller : bool
			SmallerEquals : bool

			LogicalAnd : bool
			LogicalOr : bool
			Implies : bool
			NotExpression : bool
			
			// type is the most general, e.g. int + float => float
			Plus : mostGeneral(e.left.type, e.right.type)
			Minus : mostGeneral(e.left.type, e.right.type)
			Multi : mostGeneral(e.left.type, e.right.type)
			// as in Java
			Div : e.left.type
			
			TrueExpr : bool
			FalseExpr : bool
			FloatLiteral : _float
			IntLiteral: _int
			StringLiteral : string
			
			// 'functions'
			lenghtOf : _int
			
			default : throw new IllegalArgumentException("unsupported element : "+e)
		}
	}
	
	/**
	 * @param e - Expression for which to compute an expected type. 
	 * 
	 * @return the expected type of the expression. <code>null</code> indicates no expectation.
	 * 
	 * The expected type is computed by checking the context, i.e. the container.
	 * Example: If the container is a logical function, a boolean type is expected
	 */
	def Type getExpectedType(Expression e) {
		return internalGetExpectedType(e.eContainer, e.eContainingFeature)
	}
	
	/**
	 * @param e - The container of an EObject of which to compute the expected type
	 * @param feature - The feature of {@code e} which holds the object for which
	 *  this function should tell what type it expects it to be. Currently, it is
	 *  not needed. <br>Example: The only reference to an expression a widget holds is the one 
	 * to the part after "validate", thus no checking needed. Otherwise one would add<br>
	 * {@code case feature == GuiDslPackage$Literals::WIDGET__VALIDATE} to the case statement.
	 * 
	 * @return the expected type, {@code null} if no particular type is expected.
	 * 
	 * Example: A widget is a container with a feature called "validate". The expected type is
	 * for this feature is boolean.
	 * 
	 */
	def protected Type internalGetExpectedType(EObject e, EStructuralFeature feature) {
		switch e {
			Widget : bool
			
			// an object contained (i.e. left or right side) 
			// in one of the following operators is expected to always be a number 
			Greater       : number
			GreaterEquals : number
			Smaller       : number
			SmallerEquals : number

			LogicalAnd    : bool
			LogicalOr     : bool
			Implies       : bool
			NotExpression : bool
			
			// the left side of these operators determines the expected type 
			Equals   : e.left.type
			Unequals : e.left.type
			
			Plus : {
				// everything can be added, it might end up as string
				mostGeneral(e.left.type, e.right.type).mostSpecific(string)
			}
			Minus : number
			Multi : number
			Div : number
			
			lenghtOf : string
			
			default : null
		}
	}

}
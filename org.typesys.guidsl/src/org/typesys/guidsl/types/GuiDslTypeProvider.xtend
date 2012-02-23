package org.typesys.guidsl.types

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.typesys.guidsl.guiDsl.AttributeRef
import org.typesys.guidsl.guiDsl.DerivedAttribute
import org.typesys.guidsl.guiDsl.Div
import org.typesys.guidsl.guiDsl.Equals
import org.typesys.guidsl.guiDsl.Expression
import org.typesys.guidsl.guiDsl.FalseExpr
import org.typesys.guidsl.guiDsl.Greater
import org.typesys.guidsl.guiDsl.GreaterEquals
import org.typesys.guidsl.guiDsl.GuiDslFactory
import org.typesys.guidsl.guiDsl.Implies
import org.typesys.guidsl.guiDsl.LogicalAnd
import org.typesys.guidsl.guiDsl.LogicalOr
import org.typesys.guidsl.guiDsl.Minus
import org.typesys.guidsl.guiDsl.Multi
import org.typesys.guidsl.guiDsl.NotExpression
import org.typesys.guidsl.guiDsl.NumberLiteral
import org.typesys.guidsl.guiDsl.Plus
import org.typesys.guidsl.guiDsl.SimpleAttribute
import org.typesys.guidsl.guiDsl.Smaller
import org.typesys.guidsl.guiDsl.SmallerEquals
import org.typesys.guidsl.guiDsl.TrueExpr
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.Unequals
import org.typesys.guidsl.guiDsl.Widget
import org.typesys.guidsl.guiDsl.lenghtOf
import com.google.inject.Inject
import org.typesys.guidsl.guiDsl.StringLiteral
import org.typesys.guidsl.guiDsl.StringType

class GuiDslTypeProvider {
	
	/**
	 * @return the type of an element. Never <code>null</code>
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
			
			Plus : e.left.type
			Minus : e.left.type
			Multi : e.left.type
			Div : e.left.type
			
			TrueExpr : bool
			FalseExpr : bool
			NumberLiteral : _float
			StringLiteral : string
			
			// 'functions'
			lenghtOf : _int
			
			default : throw new IllegalArgumentException("unsupported element : "+e)
		}
	}
	
	/**
	 * @return the expected type. <code>null</code> indicates no expectation.
	 */
	def Type getExpectedType(Expression e) {
		val containingFeature = e.eContainingFeature
		return internalGetExpectedType(e.eContainer, containingFeature)
	}
	
	def protected Type internalGetExpectedType(EObject e, EStructuralFeature feature) {
		switch e {
			Widget : bool
			
			Greater : number 
			GreaterEquals : number
			Smaller : number
			SmallerEquals : number
			
			LogicalAnd : bool
			LogicalOr : bool
			Implies : bool
			NotExpression : bool
			
			Equals : e.left.type 
			Unequals : e.left.type
			
			Plus :  {
				if (e.left.type instanceof StringType) {
					null
				} else {
					e.left.type
				}
			}
			Minus : number.or(e.left.type)
			Multi : number.or(e.left.type)
			Div : number.or(e.left.type)
			
			lenghtOf : string
			
			default : null
		}
	}
	
	@Inject TypeConformance conformance
	
	def Type or(Type atLeast, Type moreSpecific) {
		if (conformance.isAssignable(atLeast, moreSpecific))
			moreSpecific
		else 
			atLeast
	}
	
	def Type bool() {
		GuiDslFactory::eINSTANCE.createBooleanType
	}
	def Type _float() {
		GuiDslFactory::eINSTANCE.createFloatType
	}
	def Type _int() {
		GuiDslFactory::eINSTANCE.createIntType
	}
	def Type number() {
		GuiDslFactory::eINSTANCE.createNumberType
	}
	def Type string() {
		GuiDslFactory::eINSTANCE.createStringType
	}
	
}
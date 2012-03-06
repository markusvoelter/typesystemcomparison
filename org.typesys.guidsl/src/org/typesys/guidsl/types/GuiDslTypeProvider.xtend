package org.typesys.guidsl.types

import com.google.inject.Inject
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.typesys.guidsl.guiDsl.AndOrExpression
import org.typesys.guidsl.guiDsl.ArithmeticSigned
import org.typesys.guidsl.guiDsl.Attribute
import org.typesys.guidsl.guiDsl.AttributeRef
import org.typesys.guidsl.guiDsl.BooleanLiteral
import org.typesys.guidsl.guiDsl.BooleanNegation
import org.typesys.guidsl.guiDsl.Comparison
import org.typesys.guidsl.guiDsl.CyclicDependencyType
import org.typesys.guidsl.guiDsl.Entity
import org.typesys.guidsl.guiDsl.EntityType
import org.typesys.guidsl.guiDsl.Equality
import org.typesys.guidsl.guiDsl.FieldContent
import org.typesys.guidsl.guiDsl.FloatLiteral
import org.typesys.guidsl.guiDsl.GuiDslFactory
import org.typesys.guidsl.guiDsl.GuiDslPackage$Literals
import org.typesys.guidsl.guiDsl.IntLiteral
import org.typesys.guidsl.guiDsl.LengthOf
import org.typesys.guidsl.guiDsl.Minus
import org.typesys.guidsl.guiDsl.MultiOrDiv
import org.typesys.guidsl.guiDsl.Plus
import org.typesys.guidsl.guiDsl.StringLiteral
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.Widget

import static extension org.eclipse.xtext.EcoreUtil2.*

	//tex
class GuiDslTypeProvider {

	@Inject extension TypeConformance conformance
	
	// declare the built-in types for easy use
	Type bool = GuiDslFactory::eINSTANCE.createBooleanType
	Type _float = GuiDslFactory::eINSTANCE.createFloatType
	Type _int = GuiDslFactory::eINSTANCE.createIntType
	Type number = GuiDslFactory::eINSTANCE.createNumberType
	Type string = GuiDslFactory::eINSTANCE.createStringType
	Type primitive = GuiDslFactory::eINSTANCE.createPrimitiveType
	@Inject CyclicDependencyType cyclicType

	/** //tex
	 * @return the type of an element, {@ code null} if it cannot be determined.
	 */ //tex
	def Type getType(EObject e) {
		getType(e, newHashSet())
	}
	
	def Type getType(EObject e, Collection<EObject> visited) {
		if (visited.contains(e)) return cyclicType; // cycle detected
		visited.add(e)
		switch e {
			Widget : e.attr.getType(visited)
			Attribute case e.expr != null && e.type != null 
			   && e.type.isAssignable(e.expr.getType(visited)) : e.type
			Attribute case e.expr != null : e.expr.getType(visited)
			Attribute case e.type != null : e.type
			AttributeRef : e.attr.getType(visited)

			AndOrExpression : bool 
			Comparison : bool
			Equality : bool
			
			// type is the most general, e.g. int + float => float
			Plus : mostGeneral(e.left.getType(visited), e.right.getType(visited))
			Minus : mostGeneral(e.left.getType(visited), e.right.getType(visited))
			MultiOrDiv case e.op.equals("*"): mostGeneral(e.left.getType(visited),e.right.getType(visited))
			// as in Java
			MultiOrDiv case e.op.equals("/"): e.left.getType(visited)
			
			BooleanNegation : bool
			ArithmeticSigned : number
			
			// return type of attribute referenced by the widget
			FieldContent : return e.getContainerOfType(typeof(Widget))?.attr?.getType(visited)
			LengthOf : _int
			EntityType : e // type is itself
			BooleanLiteral : bool
			FloatLiteral : _float
			IntLiteral: _int
			StringLiteral : string

			default: null
		}
	} 
	//tex
	
	/**
	 * @param e - EObject for which to compute an expected type. 
	 * 
	 * @return the expected type of {@code e}. {@code null} indicates no expectation.
	 * 
	 * The expected type is computed by checking the context (if necessary),
	 * i.e. the container. Example: If the container is a logical function, 
	 * a boolean type is expected
	 **///tex
	def Type getExpectedType(EObject e) { 
		switch e {
			Widget : primitive
			default: internalGetExpectedType(e.eContainer, e.eContainingFeature) 
		}
	} 
	
//tex
	/**
	 * @param e - The container of an EObject of which to compute the expected type
	 * @param feature - The feature of {@code e} which holds the object for which
	 *  this function should tell what type it expects it to be. 
	 * 
	 * @return the expected type, {@code null} if no particular type is expected.
	 * 
	 * Example: A widget is a container with a feature called "validate". The expected type
	 * for this feature is boolean.
	 * 
	 */ //tex
	def protected Type internalGetExpectedType(EObject e, EStructuralFeature feature) {
		switch e {
			Widget case feature == GuiDslPackage$Literals::WIDGET__VALIDATE: bool
			
			Attribute case e.type != null : e.type
		
			AndOrExpression : bool 
			// an object contained (i.e. left or right side) 
			// in the following operator is expected to always be a number 
			Comparison : number
			// the left side of the operator determines the expected type 
			Equality : e.left.type
			// everything can be added, it might end up as string
			Plus :	mostGeneral(e.left.type, e.right.type).mostSpecific(string)
			Minus      : number
			MultiOrDiv : number

			BooleanNegation : bool
			ArithmeticSigned : number 
			
			LengthOf : string
			
			default : null
		}
	}
	//tex

}
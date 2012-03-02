package org.typesys.guidsl.types

import org.typesys.guidsl.guiDsl.FloatType
import org.typesys.guidsl.guiDsl.IntType
import org.typesys.guidsl.guiDsl.NumberType
import org.typesys.guidsl.guiDsl.StringType
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.Entity
import java.util.Collection
import org.typesys.guidsl.guiDsl.EntityType
import org.typesys.guidsl.guiDsl.PrimitiveType
import org.typesys.guidsl.guiDsl.BooleanType
import com.sun.xml.internal.bind.v2.runtime.reflect.PrimitiveArrayListerBoolean
import org.typesys.guidsl.guiDsl.GuiDslFactory

class TypeConformance {
	
     Type primitive = GuiDslFactory::eINSTANCE.createPrimitiveType
	
	/**
	 * Computes whether {@code right} can be used where {@code left}
     * is expected.
	 */
	def dispatch isAssignable(Type left, Type right) {
		print(left.eClass)
		print(" ") println (right.eClass) 
		left.eClass == right.eClass || right.eClass.ESuperTypes.contains(left.eClass) 
	}
	
	def dispatch isAssignable(EntityType left, EntityType right) {
		internalIsAssignable(left.ref, right.ref, newHashSet())
	}
	
	def internalIsAssignable(Entity left, Entity right, Collection<Entity> visited) {
		if (visited.contains(right)) return false; // cycle detected
		visited.add(right)
		left == right || (right.superType != null && 
			internalIsAssignable(left, right.superType, visited) )
	}

//	def dispatch isAssignable(PrimitiveType left, PrimitiveType right) { 
//		if (left.eClass == primitive.eClass) return true;
//		false
//	}

	def dispatch isAssignable(NumberType left, FloatType right) { true }
	
	def dispatch isAssignable(NumberType left, IntType right) { true }

	def dispatch isAssignable(FloatType left, IntType right) { true }

	def dispatch isAssignable(IntType left, FloatType right) { false }

	// allow numbers where strings are expected
	def dispatch isAssignable(StringType left, NumberType right) { true }
	
	// don't allow null types
	def dispatch isAssignable(Type left, Void right) { false }
	def dispatch isAssignable(Void left, Type right) { false }

//  uncomment to allow booleans to be assigned to strings
//	def dispatch isAssignable(StringType left, BooleanType right) { true }

//  uncomment for entity assignments
//	def dispatch isAssignable(EntityType left, EntityType right) {
//		left.ref == right.ref
//	}

	/**
	 * Returns the most general type of two arguments
	 * 
	 */
	def Type mostGeneral(Type one, Type two) {
		if (isAssignable(one, two)) 
		    one
		 else 
		    two
	}
	
	def Type mostSpecific(Type one, Type two) {
		if (isAssignable(one, two)) 
		    two
		 else
		    one
	}

}
package org.typesys.guidsl.types

import java.util.Collection
import org.typesys.guidsl.guiDsl.Entity
import org.typesys.guidsl.guiDsl.EntityType
import org.typesys.guidsl.guiDsl.FloatType
import org.typesys.guidsl.guiDsl.IntType
import org.typesys.guidsl.guiDsl.NumberType
import org.typesys.guidsl.guiDsl.StringType
import org.typesys.guidsl.guiDsl.Type
//tex
class TypeConformance {
	//tex
	/**
	 * Computes whether {@code right} can be used where {@code left}
     * is expected.
     * 
     * The inheritance hierarchy of the Ecore classes of the DSL is used
	 *///tex
	def dispatch isAssignable(Type left, Type right) {
		left.eClass == right.eClass || right.eClass.EAllSuperTypes.contains(left.eClass) 
	}
	//tex
	/**
	 * An entity can be assigned to its superType(s) (superType is a reference 
	 * specified in the DSL) 
	 */ //tex
	def dispatch isAssignable(EntityType left, EntityType right) {
		internalIsAssignable(left.ref, right.ref, newHashSet())
	}
	
	def internalIsAssignable(Entity left, Entity right, Collection<Entity> visited) {
		if (visited.contains(right)) return false; // cycle detected
		visited.add(right)
		left == right || (right.superType != null && 
			internalIsAssignable(left, right.superType, visited) )
	}
	
	// allow ints where floats are expected
	def dispatch isAssignable(FloatType left, IntType right) { true }

	// allow numbers where strings are expected
	def dispatch isAssignable(StringType left, NumberType right) { true }
		
	// don't allow null type assignments
	def dispatch isAssignable(Type left, Void right) { false }
	def dispatch isAssignable(Void left, Type right) { false }
	//tex

//  uncomment to allow booleans to be assigned to strings
//	def dispatch isAssignable(StringType left, BooleanType right) { true }

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
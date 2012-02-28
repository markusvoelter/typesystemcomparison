package org.typesys.guidsl.types

import org.typesys.guidsl.guiDsl.FloatType
import org.typesys.guidsl.guiDsl.IntType
import org.typesys.guidsl.guiDsl.NumberType
import org.typesys.guidsl.guiDsl.StringType
import org.typesys.guidsl.guiDsl.Type

class TypeConformance {
	
	/**
	 * Computes whether {@code right} can be used where {@code left}
     * is expected.
	 */
	def dispatch isAssignable(Type left, Type right) {
		left.eClass == right.eClass
	}

	def dispatch isAssignable(NumberType left, FloatType right) { true }
	
	def dispatch isAssignable(NumberType left, IntType right) { true }

	def dispatch isAssignable(FloatType left, IntType right) { true }

	def dispatch isAssignable(IntType left, FloatType right) { false }

	// allow numbers where strings are expected
	def dispatch isAssignable(StringType left, NumberType right) { true }

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
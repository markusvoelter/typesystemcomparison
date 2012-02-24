package org.typesys.guidsl.types

import org.typesys.guidsl.guiDsl.EntityType
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.NumberType
import org.typesys.guidsl.guiDsl.IntType
import org.typesys.guidsl.guiDsl.FloatType
import org.typesys.guidsl.guiDsl.StringType
import org.typesys.guidsl.guiDsl.BooleanType

class TypeConformance {
	
	/**
	 * Dispatch method, computes whether {@code right} is assignable to {@code left}, i.e.
	 * whether 
	 * {@code instanceOfLeft = instanceOfRight}
	 * is correct.
	 */
	def dispatch isAssignable(Type left, Type right) {
		left.eClass == right.eClass
	}

	def dispatch isAssignable(EntityType left, EntityType right) {
		left.ref == right.ref
	}

	def dispatch isAssignable(NumberType left, IntType right) { true }
	def dispatch isAssignable(NumberType left, FloatType right) { true }
	def dispatch isAssignable(IntType left, FloatType right) { false }
	
	def dispatch isAssignable(FloatType left, IntType right) { true }

	// note that with this rule, lengthOf(int) is also allowed
	def dispatch isAssignable(StringType left, NumberType right) { true }
	def dispatch isAssignable(StringType left, BooleanType right) { true }

}
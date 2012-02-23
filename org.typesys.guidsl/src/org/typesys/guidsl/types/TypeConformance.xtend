package org.typesys.guidsl.types

import org.typesys.guidsl.guiDsl.EntityType
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.NumberType

class TypeConformance {
	def dispatch boolean isAssignable(Type left, Type right) {
		left.eClass == right.eClass
	}
	
	def dispatch boolean isAssignable(NumberType left, NumberType right) {
		true
	}
	
	def dispatch isAssignable(EntityType left, EntityType right) {
		left.ref == right.ref
	}
	
}
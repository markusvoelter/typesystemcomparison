package org.typesys.guidsl.types

import org.eclipse.emf.ecore.EObject
import org.typesys.guidsl.guiDsl.AttributeRef
import org.typesys.guidsl.guiDsl.BooleanType
import org.typesys.guidsl.guiDsl.DerivedAttribute
import org.typesys.guidsl.guiDsl.Expr
import org.typesys.guidsl.guiDsl.FloatType
import org.typesys.guidsl.guiDsl.IntType
import org.typesys.guidsl.guiDsl.SimpleAttribute
import org.typesys.guidsl.guiDsl.StringType
import org.typesys.guidsl.guiDsl.Type

class GuiDslTypeProvider {
	
	def dispatch Type getType(EObject e) {
		null // tbd
	}
	
	def dispatch Type getType(Expr e) {
		null // tbd
	}
	
	def dispatch Type getType(AttributeRef e) {
	   getType(e.attr)	
	}

	def dispatch Type getType(SimpleAttribute e) {
		getType(e.type)
	}
	
	def dispatch Type getType(DerivedAttribute e) {
		getType(e.expr)
	}
	
	def dispatch Type getType(IntType e) {
		e
	}
	
	def dispatch Type getType(FloatType e) {
		e
	}
	
	def dispatch Type getType(StringType e) {
		e
	}

	def dispatch Type getType(BooleanType e) {
		e
	}
	
}
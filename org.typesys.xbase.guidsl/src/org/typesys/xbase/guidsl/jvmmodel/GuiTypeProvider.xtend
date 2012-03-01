package org.typesys.xbase.guidsl.jvmmodel

import org.eclipse.xtext.common.types.JvmTypeReference
import org.typesys.xbase.guidsl.xGuiDsl.Attribute
import org.typesys.xbase.guidsl.xGuiDsl.SimpleAttribute
import org.typesys.xbase.guidsl.xGuiDsl.DerivedAttribute
import com.google.inject.Inject
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xbase.XExpression
import org.typesys.xbase.guidsl.xGuiDsl.Entity
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.JvmDeclaredType

class GuiTypeProvider {
	
	@Inject ITypeProvider typeProvider
	
	@Inject JvmTypesBuilder jvmTypesBuilder
	
	@Inject IJvmModelAssociations associations
	
   	def JvmTypeReference getJvmType(Attribute attr) {
		switch attr {
			SimpleAttribute : attr.getType()
			DerivedAttribute : getJvmType(attr.getExpr())
			default: null
		}
	}
	
	def JvmTypeReference getJvmType(Entity entity) {
		val entityType = associations.getJvmElements(entity).head as JvmDeclaredType
		jvmTypesBuilder.newTypeRef(entityType)
	}
	
	def JvmTypeReference getJvmType(XExpression expression) {
		typeProvider.getType(expression)
	}
	
}
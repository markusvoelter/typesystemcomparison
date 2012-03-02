package org.typesys.xbase.guidsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.typesys.xbase.guidsl.xGuiDsl.Attribute
import org.typesys.xbase.guidsl.xGuiDsl.Entity

class GuiTypeProvider {
	
	@Inject ITypeProvider typeProvider
	
	@Inject JvmTypesBuilder jvmTypesBuilder
	
	@Inject IJvmModelAssociations associations
	
   	def JvmTypeReference getJvmType(Attribute attr) {
		switch attr {
			Attribute case attr.type != null : attr.type
			Attribute case attr.expr != null : getJvmType(attr.getExpr())
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
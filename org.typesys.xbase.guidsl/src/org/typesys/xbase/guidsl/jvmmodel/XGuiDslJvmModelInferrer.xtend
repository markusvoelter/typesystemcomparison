package org.typesys.xbase.guidsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.typesys.xbase.guidsl.xGuiDsl.Entity
import org.typesys.xbase.guidsl.xGuiDsl.SimpleAttribute
import org.typesys.xbase.guidsl.xGuiDsl.DerivedAttribute
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.typesys.xbase.guidsl.xGuiDsl.Form
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.common.types.JvmDeclaredType

class XGuiDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	
	@Inject IJvmModelAssociations associations
	
	@Inject extension IQualifiedNameProvider
	
	@Inject ITypeProvider typeProvider

   	def dispatch void infer(Entity element, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
   		acceptor.accept(element.toClass(element.fullyQualifiedName)).initializeLater [
			documentation = element.documentation
		    for (attribute : element.attributes) {
		    	switch attribute {
		        	SimpleAttribute : {
		            	members += attribute.toField(attribute.name, attribute.type)
			            members += attribute.toSetter(attribute.name, attribute.type)
			            members += attribute.toGetter(attribute.name, attribute.type)
		        	}
		        	DerivedAttribute : {
		        		val method = attribute.toGetter(attribute.name, typeProvider.getType(attribute.expr))
		        		method.body = attribute.expr
		        		members += method
		        	}
		        }
		    }   		 	
   		]
   	}
   	
   	def dispatch void infer(Form form, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
   		acceptor.accept(form.toClass(form.fullyQualifiedName)).initializeLater [
			documentation = form.documentation
			//TODO derived a method creating a real form, e.g. SWT, GWT, or something similar
		    for (widget: form.widgets) {
		    	if (widget.validate != null) {
		    		members += widget.toMethod('validate'+widget.attr.name.toFirstUpper, form.newTypeRef(Boolean::TYPE)) [
		    			val jvmType = associations.getJvmElements(form.entity).head as JvmDeclaredType
		    			parameters += widget.toParameter("it", newTypeRef(jvmType))
		    			body = widget.validate
		    		]
		    	}
		    }   		 	
   		]
   	}
}

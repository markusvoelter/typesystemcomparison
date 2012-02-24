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
	
	/**
	 * This methode infers a Java class for each entity with a field, getters and setters for
	 * simple attributes and a get-Method for derived attributes.
	 * 
	 * It is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 * 
	 * 
	 */
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
						members += attribute.toMethod("get" + attribute.name.toFirstUpper, typeProvider.getType(attribute.expr)) [
			        		body = attribute.expr
		        		]
		        	}
		        }
		    }   		 	
   		]
   	}   	

   	/**
   	 * Infers a Java class for each Form with a validate method with the Entity (that the Form refers to)
   	 * as a parameter, so that the entities attributes are on the scope of the validate clause.
   	 * The parameter is called "it" so that in the validate clause, attributes of the entity can be directly referenced.
   	 * Example:
   	 * 
   	 * text(20) -> firstName validate firstName.length > 2;
   	 * 
   	 * Alternative:
     * text(20) -> firstName validate it.firstName.length > 2;     
   	 */
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

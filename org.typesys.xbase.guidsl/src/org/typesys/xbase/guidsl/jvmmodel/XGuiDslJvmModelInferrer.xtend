package org.typesys.xbase.guidsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xtend2.typing.Xtend2TypeProvider
import org.typesys.xbase.guidsl.xGuiDsl.DerivedAttribute
import org.typesys.xbase.guidsl.xGuiDsl.Entity
import org.typesys.xbase.guidsl.xGuiDsl.Form
import org.typesys.xbase.guidsl.xGuiDsl.SimpleAttribute

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class XGuiDslJvmModelInferrer extends AbstractModelInferrer {

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder
	
	@Inject extension IQualifiedNameProvider
	
	@Inject TypeReferences typeReferences
	
	@Inject Xtend2TypeProvider xtend2TypeProvider

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
	 * r
	 */
   	def dispatch void infer(Entity entity, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		 
   		 acceptor.accept(entity.toClass(entity.fullyQualifiedName) [
		     documentation = entity.documentation
		      for (attribute : entity.attributes) {
		        switch attribute {
		         SimpleAttribute : {
		            members += attribute.toField(attribute.name, attribute.type)
		            members += attribute.toSetter(attribute.name, attribute.type)
		            members += attribute.toGetter(attribute.name, attribute.type)
		          }
		         DerivedAttribute : {
		         	val JvmOperation jvmOperation = attribute.derivedMethod;
		         	if (jvmOperation != null) {
		         		members += jvmOperation
		         	}
		         }
		        }
		      }   		 	
   		 ]
       )
   	}
   	
   	/**
   	 * Infers a Java method for a derived attribute.
   	 * The return type of the method is the type of the expression of the derived attribute.
   	 * The body of the method is the expression of the derived attribute.
   	 * 
   	 * Example:
   	 * /greeting = "Hello " + firstName + " " + name;
   	 * derives the Java method
   	 * public String getGreeting() 
   	 * 
   	 */
   	def JvmOperation getDerivedMethod(DerivedAttribute derivedAttribute) {
        if (derivedAttribute?.name == null) return null;
   		val derivedBody = derivedAttribute.expr?.expr
		if (derivedBody == null) return null;
        val returnTypeRef = xtend2TypeProvider.getType(derivedBody)
        if (returnTypeRef == null) return null;
		return derivedAttribute.toMethod("get" + derivedAttribute.name.toFirstUpper, returnTypeRef) [
		         		body = derivedBody
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
   	def dispatch void infer(Form form, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
		 acceptor.accept(form.toClass(form.fullyQualifiedName) [
		     documentation = form.documentation
		     var i = 0
             val booleanTypeRef = typeReferences.createTypeRef(typeReferences.findDeclaredType("boolean", form))
             val entityTypeRef = form.entityTypeRef
             if (entityTypeRef == null) return;
		     for (widget : form.widgets ) {
		     	members += toMethod("isWidget" + (i=i+1) + "Valid", booleanTypeRef) [
		     		 parameters += toParameter("it", entityTypeRef)
		     		 body = widget.validate?.expr
		     	]
		     }
   		 ]
       )
   	}
   	
   	def getEntityTypeRef(Form form) {
   		 val fqn = form?.entity?.fullyQualifiedName?.toString
   		 if (fqn == null) return null;
	     val entityTypeRef = typeReferences.createTypeRef(
	     	    typeReferences.findDeclaredType(fqn, form)
	     )
   		 if (entityTypeRef?.type == null) return null;
	     return entityTypeRef
   	}
}

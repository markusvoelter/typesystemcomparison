package org.typesys.xbase.guidsl.jvmmodel
 
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.typesys.xbase.guidsl.xGuiDsl.Entity
import org.eclipse.xtext.naming.IQualifiedNameProvider
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

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	def dispatch void infer(Entity element, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		 
   		 acceptor.accept(element.toClass(element.fullyQualifiedName) [
		     documentation = element.documentation
		      for (attribute : element.attributes) {
		        switch attribute {
		         SimpleAttribute case true : {
		            members += attribute.toField(attribute.name, attribute.type)
		            members += attribute.toSetter(attribute.name, attribute.type)
		            members += attribute.toGetter(attribute.name, attribute.type)
		          }
		        }
		      }   		 	
   		 ]
       )
   	}
}

def dispatch void infer(Entity element, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
	acceptor.accept(element.toClass(element.fullyQualifiedName)).initializeLater [
		documentation = element.documentation
		if (element.superType != null)
			superTypes += element.superType.cloneWithProxies
	    for (attribute : element.attributes) {
	    	if (attribute.expr != null) {
					members += attribute.toMethod("get" + attribute.name.toFirstUpper, attribute.getJvmType) [
		        		body = attribute.expr
	        		]
	        } else  {
	            	members += attribute.toField(attribute.name, attribute.getJvmType)
		            members += attribute.toGetter(attribute.name, attribute.getJvmType)
		            members += attribute.toSetter(attribute.name, attribute.getJvmType)
	        }
	    }
	]
}
@Inject ITypeProvider typeProvider

def JvmTypeReference getJvmType(Attribute attr) {
	switch attr {
		Attribute case attr.type != null : attr.type
		Attribute case attr.expr != null : 
		          typeProvider.getType(attr.getExpr())
		default: null
	}
}
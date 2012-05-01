public EObject typeCoerce(EObject candidateElement, 
		FloatType candidate, StringType expected, ... ) {
	
	if ( candidateElement instanceof NumberLiteral ) {
			...
			return create(lang.getStringType());
	}
	
	return null;
}
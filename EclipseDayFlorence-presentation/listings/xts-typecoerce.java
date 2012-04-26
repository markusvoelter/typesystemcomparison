public EObject typeCoerce( EObject candidateElement, FloatType candidate, 
		StringType expected, TypeCalculationTrace trace ) {
	if ( candidateElement instanceof NumberLiteral ) {
			trace.add( candidateElement, "Number coerced to string.");
			return create(cl.getStringType());
	}
	return null;
}
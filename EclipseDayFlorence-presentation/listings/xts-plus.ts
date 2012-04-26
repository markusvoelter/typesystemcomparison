subtype FloatType base IntType

characteristic NUMERIC {
	IntType, FloatType
} 

typeof Plus -> common left right {
	ensureType left :<=: StringType, char(NUMERIC)
	ensureType right :<=: StringType, char(NUMERIC)
	ensureCompatibility left :<=>: right
}

typeof Comparison -> BooleanType {
     ensureType left :<=: char(COMPARABLE)
     ensureType right :<=: char(COMPARABLE)
     ensureCompatibility left :<=>: right
}
typeof Minus -> common left right {
    ensureType left :<=: char(NUMERIC)
    ensureType right :<=: char(NUMERIC)
    ensureCompatibility left :<=>: right
}
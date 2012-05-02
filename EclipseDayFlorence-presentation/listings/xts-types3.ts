// text widgets may only refer to non-boolean attributes 
typeof TextWidget -> feature attr {
    ensureType length :<=: IntType
    ensureType attr :<=: StringType, IntType, FloatType
    ensureType validate :<=: BooleanType
}  

// checkbox widgets may only refer to boolean attributes
typeof CheckBoxWidget -> feature attr {
    ensureType attr :<=: BooleanType
    ensureType validate :<=: BooleanType
}
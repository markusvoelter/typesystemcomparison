typesystem org.typesys.xts.guidsl.typesys.GuiDlsTypesystem 
	ecore file "platform:/resource/org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/GuiDsl.ecore"
	language package org.typesys.xts.guidsl.guiDsl.GuiDslPackage 
	
section "Types"
 	typeof Type+ -> clone

section "Expressions" 

	characteristic COMPARABLE {
		IntType, FloatType, BooleanType, StringType
	}  
  
	characteristic NUMERIC {
		IntType, FloatType
	} 
 
 	subtype FloatType base IntType

	typeof Expression -> abstract

	typeof EntityType -> clone {
		recurse ref
	}
	
	typeof Entity -> javacode

 	typeof Comparison -> BooleanType {
 		ensureType left :<=: char(COMPARABLE)
 		ensureType right :<=: char(COMPARABLE)
 		ensureCompatibility left :<=>: right
 	}
 	typeof AndOrExpression -> BooleanType {
 		ensureType left :<=: BooleanType
 		ensureType right :<=: BooleanType 
 	}   
 	typeof Plus -> common left right {
 		ensureType left :<=: StringType, char(NUMERIC)
 		ensureType right :<=: StringType, char(NUMERIC)
 		ensureCompatibility left :<=>: right
 	} 
 	typeof Minus -> common left right {
 		ensureType left :<=: char(NUMERIC)
 		ensureType right :<=: char(NUMERIC)
 		ensureCompatibility left :<=>: right
 	} 
 	typeof MultiOrDiv -> common left right { 
 		ensureType left :<=: char(NUMERIC)
 		ensureType right :<=: char(NUMERIC)
 	} 
 	typeof BooleanNegation -> BooleanType {
 		ensureType expression :<=: BooleanType
 	}

 
 	
section "Literals"
  
  	typeof StringLiteral -> StringType
  	typeof NumberLiteral -> javacode
 	typeof BooleanLiteral -> BooleanType
	
section "Special Stuff"

 	typeof AttributeRef -> feature attr
	typeof LenghtOf -> IntType
	
	typeof Attribute -> abstract
	 
	typeof SimpleAttribute -> feature type
	typeof DerivedAttribute -> feature expr 
 		
	typeof FieldContent -> javacode
 

	// 1) the expression after "validate" must be boolean
	typeof Widget -> abstract
	
	// 2) text widgets may only refer to non-boolean attributes
	typeof TextWidget -> none {
//		ensureType length :<=: IntType
		ensureType attr :<=: StringType, IntType, FloatType
		ensureType validate :<=: BooleanType
	}
	
	// 3) checkbox widgets may only refer to boolean attributes
	typeof CheckBoxWidget -> none {
		ensureType attr :<=: BooleanType
		ensureType validate :<=: BooleanType
	}
	
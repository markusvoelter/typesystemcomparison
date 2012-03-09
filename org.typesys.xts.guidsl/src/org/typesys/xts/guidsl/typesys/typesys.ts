typesystem org.typesys.xts.guidsl.typesys.GuiDlsTypesystem 
	ecore file "platform:/resource/org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/GuiDsl.ecore"
	language package org.typesys.xts.guidsl.guiDsl.GuiDslPackage 
	
section "Types"
 	typeof Type+ -> clone
	typeof EntityType -> clone 
	
 	subtype FloatType base IntType

section "Literals"
  	typeof StringLiteral -> StringType
 	typeof BooleanLiteral -> BooleanType
  	typeof NumberLiteral -> javacode

section "Expressions" 

	characteristic COMPARABLE {
		IntType, FloatType, BooleanType, StringType
	}  
  
	characteristic NUMERIC {
		IntType, FloatType
	} 

	typeof Expression -> abstract

	typeof ArithmeticSigned -> feature expression

 	typeof Comparison -> BooleanType {
 		ensureType left :<=: char(COMPARABLE)
 		ensureType right :<=: char(COMPARABLE)
 		ensureCompatibility left :<=>: right
 	} 

 	typeof Equality -> BooleanType {
 		ensureType left :<=: char(COMPARABLE), BooleanType
 		ensureType right :<=: char(COMPARABLE), BooleanType
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

 
 	

 	typeof AttributeRef -> feature attr
	typeof LenghtOf -> IntType
	
	typeof Attribute -> common expr type {
		ensureCompatibility type :<=: expr
	}
	
	// 1) the expression after "validate" must be boolean
	typeof Widget -> abstract
	
	// 2) text widgets may only refer to non-boolean attributes 
	typeof TextWidget -> feature attr {
//		ensureType length :<=: IntType
		ensureType attr :<=: StringType, IntType, FloatType
		ensureType validate :<=: BooleanType
	}  
	
	// 3) checkbox widgets may only refer to boolean attributes
	typeof CheckBoxWidget -> feature attr {
		ensureType attr :<=: BooleanType
		ensureType validate :<=: BooleanType
	}
	
	typeof FieldContent -> ancestor Widget

	typeof NewExpr -> feature entity

	typeof Entity -> javacode
	
	
package org.typesys.xsem.guidsl.tests

class XsemGuiDslInputs {
	
	def testEntity()
'''
entity MyEntity {
	myString : string;
	myBool : bool;
	myInt : int;
	myDecimal : float;
}

entity MyOtherEntity {
	myEntity : MyEntity;
	/myStringDerived = 'foo';
	/myDecimalDerived = 10.54;
	/myBooleanDerived = true;
}

form MyForm edits MyEntity {
	text(10) -> myString validate true;
	checkbox -> myBool ;
}
'''

	def testEntityForExpressions()
'''
entity MyEntity {
	/CompareMixed = '10' <= 20; // WRONG!

	myString : string;
	myBool : bool;
	myInt : int;
	myDecimal : float;
	
	/MultiInt = myInt * myInt;
	/MultiFloatMostGeneral = myInt * 1;
	/MultiFloat = 5 * 1;
	/Div = myInt / 1;
	/Minus = myInt - 1;
	/PlusNum = myInt + 5;
	/PlusString = 'foo' + 'bar';
	/PlusMixed = 10 + 'bar';
	
	/CompareNum = myInt <= 20;
	/CompareString = '10' <= '20';
	
	/And = (myInt <= 20) && ('10' <= '20');
	/Or = (myInt <= 20) || ('10' <= '20');
	
	/BooleanNegation = !myBool;
	
	/LengthOf = lengthOf('foo' + 'bar');
	
	/SignedInt = -myInt;
	/SignedFloat = -10;
	
	/myDecimalDerived = 10.54;
	/myBooleanDerived = true;
}
'''

	def testEntityForExpressionParsing()
'''
entity MyEntity {
	myString : string;
	myBool : bool;
	myInt : int;
	myDecimal : float;
	
	/Exp = 1 * 10 + -2 / 3 < 1
}
'''

	def testWrongWidgets()
'''
«testEntity»

form MyForm edits MyEntity {
	text(10) -> myString validate true; // OK
	text(10) -> myBool validate true; // cannot refer to boolean attr
	checkbox -> myBool validate 'foo'; // validate expression must be boolean
	checkbox -> myInt validate false; // cannot refer to non boolean attr
}
'''
}
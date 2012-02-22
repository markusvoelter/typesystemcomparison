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
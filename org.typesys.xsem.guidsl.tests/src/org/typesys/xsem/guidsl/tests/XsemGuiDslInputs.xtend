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
'''
}
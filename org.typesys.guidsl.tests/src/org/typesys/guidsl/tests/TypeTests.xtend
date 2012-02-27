package org.typesys.guidsl.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.typesys.guidsl.GuiDslInjectorProvider
import org.junit.Test
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.guiDsl.GuiDslFactory
import com.google.inject.Inject
import org.typesys.guidsl.types.TypeConformance
import org.typesys.guidsl.types.GuiDslTypeProvider

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GuiDslInjectorProvider))
class TypeTests {
	
		// declare the built-in types for easy use
	Type bool = GuiDslFactory::eINSTANCE.createBooleanType
	Type _float = GuiDslFactory::eINSTANCE.createFloatType
	Type _int = GuiDslFactory::eINSTANCE.createIntType
	Type number = GuiDslFactory::eINSTANCE.createNumberType
	Type string = GuiDslFactory::eINSTANCE.createStringType
	
	@Inject
	extension GuiDslTypeProvider guiDslTypeProvider
	
	@Inject 
	extension TypeConformance
	
	@Test
	def void mostGeneral() {
		assertEquals(number, _float.mostGeneral(number))
		assertEquals(number, number.mostGeneral(_float))
	}
	
	@Test
	def void mostGeneralInt() {
	  assertEquals(_float, _float.mostGeneral(_int))
	  assertEquals(_float, _int.mostGeneral(_float))
	}
	
	@Test
	def void assignable() {
		bool.isAssignable(bool).assertTrue
		bool.isAssignable(string).assertFalse
		bool.isAssignable(_int).assertFalse
		bool.isAssignable(_float).assertFalse

		string.isAssignable(bool).assertTrue
		string.isAssignable(string).assertTrue
		string.isAssignable(_int).assertTrue
		string.isAssignable(_float).assertTrue

		_int.isAssignable(bool).assertFalse
		_int.isAssignable(string).assertFalse
		_int.isAssignable(_int).assertTrue
		_int.isAssignable(_float).assertFalse
	
		_float.isAssignable(bool).assertFalse
		_float.isAssignable(string).assertFalse
		_float.isAssignable(_int).assertTrue
		_float.isAssignable(_float).assertTrue
		
    }
	
	
}
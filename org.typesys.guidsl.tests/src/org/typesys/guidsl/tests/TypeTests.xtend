package org.typesys.guidsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.guidsl.GuiDslInjectorProvider
import org.typesys.guidsl.guiDsl.GuiDslFactory
import org.typesys.guidsl.guiDsl.Type
import org.typesys.guidsl.types.GuiDslTypeProvider
import org.typesys.guidsl.types.TypeConformance

import static org.junit.Assert.*

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
	
	/**
	 * Tests whether the most general of two types is correctly determined
	 */
	@Test
	def void mostGeneral() {
		assertEquals("float or number", number, _float.mostGeneral(number))
		assertEquals("int or number", number, _int.mostGeneral(number))
		assertEquals("number or number", number, number.mostGeneral(number))
		
		assertEquals("float or float", _float, _float.mostGeneral(_float))
		assertEquals("int or float", _float, _int.mostGeneral(_float))
		assertEquals("number or float", number, number.mostGeneral(_float))
	
		assertEquals("float or int", _float, _float.mostGeneral(_int))
		assertEquals("int or int", _int, _int.mostGeneral(_int))
		assertEquals("number or int", number, number.mostGeneral(_int))
	}
	
	/**
	 * Check whether a type can be assigned to another
	 */
	@Test
	def void assignable() {
		assertTrue("bool <- bool", bool.isAssignable(bool))
		assertFalse("bool <- string", bool.isAssignable(string))
		assertFalse("bool <- int", bool.isAssignable(_int))
		assertFalse("bool <- float", bool.isAssignable(_float))

		assertFalse("string <- bool", string.isAssignable(bool))
		assertTrue("string <- string", string.isAssignable(string))
		assertTrue("string <- int", string.isAssignable(_int))
		assertTrue("string <- float", string.isAssignable(_float))						

		assertFalse("int <- bool", _int.isAssignable(bool))
		assertFalse("int <- bool", _int.isAssignable(string))
		assertTrue("int <- bool", _int.isAssignable(_int))
		assertFalse("int <- bool", _int.isAssignable(_float))
		
		assertFalse("float <- bool", _float.isAssignable(bool))
		assertFalse("float <- string", _float.isAssignable(string))
		assertTrue("float <- int", _float.isAssignable(_int))
		assertTrue("float <- float", _float.isAssignable(_float))
    }
	
}
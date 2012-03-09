package org.typesys.xsem.guidsl.tests

import com.google.inject.Inject
import it.xsemantics.runtime.Result
import it.xsemantics.runtime.RuleApplicationTrace
import it.xsemantics.runtime.StringRepresentation
import it.xsemantics.runtime.util.TraceUtils
import junit.framework.Assert
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.typesys.xsem.guidsl.XsemGuiDslInjectorProvider
import org.typesys.xsem.guidsl.xsemGuiDsl.Entity
import org.typesys.xsem.guidsl.xsemGuiDsl.Type
import org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslFactory
import org.typesys.xsem.guidsl.xsemantics.TypeSystem

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XsemGuiDslInjectorProvider))
class XsemGuiDslConformanceTests extends XsemGuiDslAbstractTests {
	
	@Inject TypeSystem typesystem

	RuleApplicationTrace trace
	
	@Inject extension TraceUtils
	
	@Inject extension StringRepresentation
	
	// declare the built-in types for easy use
	Type bool = XsemGuiDslFactory::eINSTANCE.createBooleanType
	Type _float = XsemGuiDslFactory::eINSTANCE.createFloatType
	Type _int = XsemGuiDslFactory::eINSTANCE.createIntType
	Type number = XsemGuiDslFactory::eINSTANCE.createNumberType
	Type string = XsemGuiDslFactory::eINSTANCE.createStringType
	
	@Before
	def void setUp() {
		trace = new RuleApplicationTrace()
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
	
		number.isAssignable(_int).assertTrue
		number.isAssignable(_float).assertTrue
	
		_float.isAssignable(bool).assertFalse
		_float.isAssignable(string).assertFalse
		_float.isAssignable(_int).assertTrue
		_float.isAssignable(_float).assertTrue
    }
    
    @Test
	def void mostGeneral() {
		assertMostGeneral(number, _float, number)
		assertMostGeneral(number, number, _float)
	}
	
	@Test
	def void mostGeneralInt() {
	  	assertMostGeneral(_float, _float, _int)
	  	assertMostGeneral(_float, _int, _float)
	}
	
	@Test
	def void sameEntityIsAssignable() {
		val testEntityType = entityType("foo", null)
		testEntityType.isAssignable(testEntityType).assertTrue
	}
	
	@Test
	def void superEntityIsAssignable() {
		val t1 = entityType("foo1", null)
		val t2 = entityType("foo2", t1.ref)
		val t3 = entityType("foo3", t2.ref)
		t1.isAssignable(t3).assertTrue
		t3.isAssignable(t1).assertFalse
		entityType("unrelated", null).isAssignable(t1).assertFalse
	}
	
	def entityType(String name, Entity superEntity) {
		val entity = XsemGuiDslFactory::eINSTANCE.createEntity
		entity.name = name
		entity.superType = superEntity
		val type = XsemGuiDslFactory::eINSTANCE.createEntityType
		type.ref = entity
		type
	}
    
    def isAssignable(Type left, Type right) {
    	trace = new RuleApplicationTrace()
    	typesystem.isAssignable(null, trace, left, right)
    }
     
    def void assertTrue(Result<Boolean> result) {
    	if (result.failed) {
    		Assert::fail("unexpected failure: " +
				result.ruleFailedException.failureTraceAsString
			)
    	}
    	Assert::assertTrue(result.value)
    }
    
    def void assertFalse(Result<Boolean> result) {
    	if (!result.failed) {
    		Assert::fail("unexpected success: " +
				trace.traceAsString
			)
    	}
    	Assert::assertTrue(result.failed)
    }
    
    def void assertMostGeneral(Type expected, Type first, Type second) {
    	Assert::assertEquals(expected, typesystem.mostGeneral(first, second).value)
    }
	
	def void assertAttributeType(CharSequence input, String attrName, 
			CharSequence expectedType) {
		val result = typesystem.type(null, trace, input.attribute(attrName))
		if (result.failed) {
			Assert::fail("unexpected failure: " +
				result.ruleFailedException.failureTraceAsString
			)
		}
		Assert::assertEquals(expectedType.toString, result.value.string)
	}
}
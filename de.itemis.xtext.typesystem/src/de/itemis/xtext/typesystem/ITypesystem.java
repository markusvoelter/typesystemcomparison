package de.itemis.xtext.typesystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.characteristics.TypeCharacteristic;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

/**
 * An interface that provides access to type calculations. 
 * In 99% of all cases you will want to use the DefaultTypesystem 
 * class as the implementation. Whenever a TypeCalculationTrace is 
 * expected, pass in a new instance; it will be filled with trace 
 * information about how the type was calculated.
 */
public interface ITypesystem { 

	/**
	 * returns the type of the element. This method shall be called 
	 * as the primary interface to the type system. 
	 */
	public EObject typeof( EObject element, TypeCalculationTrace trace );

	/**
	 * compares whether the two types type1 and type2 are
	 * the same type (with an equals, no recursion)
	 */
	public boolean isSameType( EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace );
	
	/**
	 * compares whether the two types type1 and type 2 are
	 * type compatible - either can be a subtype of the other
	 */
	public boolean isCompatibleTypeUnordered( EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace );
	
	/**
	 * compares whether the two types type1 and type 2 are
	 * type compatible - type2 may be a subtype of type1, but
	 * not the other way round.
	 */
	public boolean isCompatibleTypeOrdered( EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace );
	
	/**
	 * checks whether element's name is unique in the 
	 * collection passed in. Not strictly a typesystem issue, 
	 * but useful in the same context.
	 */
	public boolean isNameLocallyUnique( EObject element, EList<? extends EObject> all );

	/**
	 * runs all the typesystem checks for m, if the implementation 
	 * class defines any. Can be used from within a validator.
	 */
	public void checkTypesystemConstraints(EObject m, ValidationMessageAcceptor acceptor);

	/**
	 * checks whether actualType is an instance of expectedType
	 */
	public boolean isInstanceOf( EObject actualType, EClass expectedType, TypeCalculationTrace trace );

	public EObject tryToCoerceType( EObject element, EObject candidate, EObject expected, TypeCalculationTrace trace);
	
	/**
	 * determines whether a type has a given characteristic
	 */
	public boolean hasCharacteristic( EObject actualType, TypeCharacteristic c );
	
	/**
	 * returns a more or less useful string representation of 
	 * an EObject
	 */
	public String typeString( Object type );
	
	/**
	 * returns a more or less useful string representation for 
	 * each Object
	 */
	public String typeStrings( Object[] types );
	
	/**
	 * calculates the common type (in terms of subtyping) of 
	 * the two types passedin
	 */
	public EObject computeCommonType(EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace);


}

package de.itemis.xtext.typesystem;

import static de.itemis.xtext.typesystem.util.Utils.eString;
import static de.itemis.xtext.typesystem.util.Utils.name;
import static de.itemis.xtext.typesystem.util.Utils.nullTolerantEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.itemis.xtext.typesystem.characteristics.TypeCharacteristic;
import de.itemis.xtext.typesystem.checks.ConstrainPropertyCheck;
import de.itemis.xtext.typesystem.checks.EnsureOrderedCompatibilityCheck;
import de.itemis.xtext.typesystem.checks.EnsureUnorderedCompatibilityCheck;
import de.itemis.xtext.typesystem.checks.ISingleElementTypesystemCheck;
import de.itemis.xtext.typesystem.checks.custom.CDCTCAdapter;
import de.itemis.xtext.typesystem.checks.custom.ContextDependentCustomTypeChecker;
import de.itemis.xtext.typesystem.checks.custom.StaticCustomTypeChecker;
import de.itemis.xtext.typesystem.exceptions.DuplicateRegistrationException;
import de.itemis.xtext.typesystem.exceptions.EClassDoesntHaveFeatureException;
import de.itemis.xtext.typesystem.exceptions.FeatureMustBeSingleValuedException;
import de.itemis.xtext.typesystem.exceptions.InvalidType;
import de.itemis.xtext.typesystem.exceptions.InvalidTypeSpecification;
import de.itemis.xtext.typesystem.rules.CloneTCRule;
import de.itemis.xtext.typesystem.rules.ComputeCommonTCRule;
import de.itemis.xtext.typesystem.rules.TCRule;
import de.itemis.xtext.typesystem.rules.UseAncestorTCRule;
import de.itemis.xtext.typesystem.rules.UseFeatureTCRule;
import de.itemis.xtext.typesystem.rules.UseFixedEClassTCRule;
import de.itemis.xtext.typesystem.rules.UsePrototypeTCRule;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Multimap;

public abstract class DefaultTypesystem implements ITypesystem {
	private static Logger LOGGER = Logger.getLogger(DefaultTypesystem.class);

	private Multimap<EClass, TCRule> rules = new Multimap<EClass, TCRule>();
	
	// various lists and maps to remember declarative
	// typing rules; explained below
	private Set<EClass> all = new HashSet<EClass>();
	private Multimap<EClass,EStructuralFeature> typeComparisonFeatures = new Multimap<EClass,EStructuralFeature>();
	private Multimap<EClass,EStructuralFeature> typeRecursionFeatures = new Multimap<EClass,EStructuralFeature>();
	private Multimap<EClass, TypeCharacteristic> characteristics = new Multimap<EClass, TypeCharacteristic>();
	private Map<EClass,EClass> subtypeToSupertype = new HashMap<EClass,EClass>();
	private Map<EClass,EClass> supertypeToSubtype = new HashMap<EClass,EClass>();
	private List<ISingleElementTypesystemCheck> singleElementChecks = new ArrayList<ISingleElementTypesystemCheck>();
	
	private List<EClass> typeRootEClasses = new ArrayList<EClass>();
	
	private boolean initialized = false;
	
	private boolean showWarningsIfTypeUndefined = true;
	
	public void setShowWarningsIfTypeUndefined( boolean b ) {
		showWarningsIfTypeUndefined = b;
	}
	
	/**
	 * the polymorphic dispatcher (see Xtext docs) used to call
	 * a type method polymorhpically for various types of elements.
	 * Use EObject type(YourType element) in subclass to define custom
	 * type calculation rules.
	 */
	private final PolymorphicDispatcher<EObject> typeofDispatcher = new PolymorphicDispatcher<EObject>("type", 2, 2,
			Collections.singletonList(this), new ErrorHandler<EObject>() {
				public EObject handle(Object[] params, Throwable e) {
					// if no suitable method is found, execute the
					// declarative type system rules registered in 
					// the DefaultTypesystem
					return useDeclarativeRules((EObject)params[0], (TypeCalculationTrace)params[1]);
				}
			});
    
	
	
	private final PolymorphicDispatcher<Boolean> compareTypeDispatcher = new PolymorphicDispatcher<Boolean>("compareTypes", 4, 4,
			Collections.singletonList(this), new ErrorHandler<Boolean>() {
				public Boolean handle(Object[] params, Throwable e) {
					return null;
				}
			});

	private final PolymorphicDispatcher<String> typeToStringDispatcher = new PolymorphicDispatcher<String>("typeToString", 1, 1,
			Collections.singletonList(this), new ErrorHandler<String>() {
				public String handle(Object[] params, Throwable e) {
					return null;
				}
			});

	private final PolymorphicDispatcher<EObject> typeCoercionDispatcher = new PolymorphicDispatcher<EObject>("typeCoerce", 4, 4,
			Collections.singletonList(this), new ErrorHandler<EObject>() {
				public EObject handle(Object[] params, Throwable e) {
					return null;
				}
			});

	public static enum CheckKind {
		same, unordered, ordered;
	}
	
	
	/**
	 * executes the type system rules declated via 
	 * the doInitialize() method.
	 */
	private EObject useDeclarativeRules(EObject element, TypeCalculationTrace trace) {
		EClass cls = element.eClass();
		
		List<TCRule> allRulesForTheClass = rules.get(cls);
		List<TCRule> applicableRules = new ArrayList<TCRule>(5);
		for (TCRule r : allRulesForTheClass) {
			if ( r.isApplicable(element)) {
				applicableRules.add(r);
			}
		}
		
		if ( applicableRules.size() == 0 ) {
			LOGGER.warn("no type calculation rules found for EClass "+eString(element)+" (isProxy="+element.eIsProxy()+")");
			LOGGER.debug(trace.toString());
		} else if ( applicableRules.size() > 1 ) {
			LOGGER.warn("multiple type calculation rules found for EClass "+eString(element)+": ");
			LOGGER.debug(trace.toString());
		} else {
			return applicableRules.get(0).type(trace, element);
		}
		
		return null;
	}
	

	public EObject computeCommonType(EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace) {
		if ( isSameType(element1, type1, element2, type2, trace)) return type1;
		if ( isSubtype(element1, type1, element2, type2, trace)) return type2;
		if ( isSubtype(element2, type2, element1, type1, trace)) return type1;
		
		EObject coercedType1 = tryToCoerceType(element1, type1, type2, trace);
		if ( coercedType1 != null ) {
			if ( isSameType(element1, coercedType1, element2, type2, trace)) return type1;
			if ( isSubtype(element1, coercedType1, element2, type2, trace)) return type2;
			if ( isSubtype(element2, type2, element1, coercedType1, trace)) return type1;
		}

		EObject coercedType2 = tryToCoerceType(element2, type2, type1, trace);
		if ( coercedType2 != null ) {
			if ( isSameType(element1, type1, element2, coercedType2, trace)) return type1;
			if ( isSubtype(element1, type1, element2, coercedType2, trace)) return type2;
			if ( isSubtype(element2, coercedType2, element1, type1, trace)) return type1;
		}
		
		
		LOGGER.error("cannot compute common type of "+typeString(type1)+" and "+typeString(type2) );
		LOGGER.debug("trace: \n"+trace.toString() );
		return null;
	}

	public EObject tryToCoerceType( EObject element, EObject currentType, EObject requiredType, TypeCalculationTrace trace) {
		EObject coerced = typeCoercionDispatcher.invoke(element, currentType, requiredType, trace);
		return coerced;
	}
 

	/**
	 * call this method to find out the type of an element.
	 * Lazily calls initialize() to register the declarative
	 * typing rules. Uses the poly dispatcher to call a type
	 * method (defined in subclasses) and if nothing is found,
	 * falls back to useDeclarativeRules
	 */
	public EObject typeof(EObject element, TypeCalculationTrace trace) {
		ensureInitialized();
		if ( element.eIsProxy() ) {
			LOGGER.warn(eString(element)+" trying to calculate a type for an EProxy - may fail!");
		}
		EObject res = (EObject) typeofDispatcher.invoke(element, trace);
		if ( res == null ) {
			return (EObject)useDeclarativeRules(element, trace);
		}
		checkSuperSuperTypes( res );
		return res;
	}
	
	private boolean hasValidSuperSuperType(EObject candidateType, EClass requiredSuperType) {
		if ( requiredSuperType != null ) {
			if ( candidateType instanceof EClass ) {
				EClass ec = (EClass) candidateType;
				if ( !ec.getEAllSuperTypes().contains(requiredSuperType) && !ec.equals(requiredSuperType )) {
					return false;
				}
			} else if ( !requiredSuperType.isInstance(candidateType) ) {
				return false;
			}
		}
		return true;
	}

	private void checkSuperSuperTypes(EObject candidateType) throws InvalidType {
		if ( typeRootEClasses.size() == 0 ) return;
		for (EClass ec: typeRootEClasses) {
			if ( hasValidSuperSuperType(candidateType, ec) ) return;
		}
		throw new  InvalidType("invalid type EClass: "+typeString(candidateType)+" is not a subtype of "+typeStrings(typeRootEClasses.toArray(new EClass[]{}))+", which have been registered as the required super types of all calculated types.");
	}

	
	
	/**
	 * ensures that initialize is called exactly once
	 */
	protected final void ensureInitialized() {
		if ( !initialized ) {
			initialized = true;
			initialize();
		}
	}
	
	/**
	 * to be overridden in subclasses; used to define
	 * the declarative typing rules
	 */
	protected abstract void initialize();
	

	/**
	 * checks if the same class is registered for type
	 * computation more than once; this is currently not
	 * possible.
	 */
	private void checkDuplicateRegistration( EClass cls ) throws DuplicateRegistrationException {
		if ( all.contains(cls)) {
			throw new DuplicateRegistrationException(cls.getName()+" already registered");
		}
		all.add(cls);
	}
	
	/**
	 * registers a type comparison feature. If two types (i.e. instances
	 * of cls) are compared using hasSameType, then the values of these
	 * features are also compared. 
	 * Typically called from initialize.
	 * @throws EClassDoesntHaveFeatureException 
	 */
	protected  void declareTypeComparisonFeature( EClass cls, EStructuralFeature feature ) throws FeatureMustBeSingleValuedException, DuplicateRegistrationException, EClassDoesntHaveFeatureException {
		checkSuperSuperTypes(cls);
		ensureValidFeature( cls, feature );
		typeComparisonFeatures.put(cls, feature);
	}
	
	private void ensureValidFeature(EClass cls, EStructuralFeature feature) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		if ( feature.isMany() ) {
			throw new FeatureMustBeSingleValuedException("cannot use multi-valued feature for type comparison: "+feature.getName());
		}
		if ( !classHasFeature( cls, feature )) {
			throw new EClassDoesntHaveFeatureException("EClass "+cls.getName()+" does not have a feature "+feature.getName());
		}
	}


	private boolean classHasFeature(EClass cls, EStructuralFeature feature) {
		EList<EStructuralFeature> all = cls.getEAllStructuralFeatures();
		boolean c = all.contains(feature);
		if ( !c ) {
			System.err.println("X");
		}
		return c;
	}


	protected  void declareTypeRecursionFeature( EClass cls, EStructuralFeature feature ) throws FeatureMustBeSingleValuedException, DuplicateRegistrationException, EClassDoesntHaveFeatureException {
		checkSuperSuperTypes(cls);
		ensureValidFeature( cls, feature );
		typeRecursionFeatures.put(cls, feature);
	}
	


	
	/**
	 * calculate type by cloning the element itself to get the type
	 * Typically called from initialize.
	 */
	protected void useCloneAsType( EClass elemClass ) throws DuplicateRegistrationException {
		checkDuplicateRegistration(elemClass);
		rules.put(elemClass, new CloneTCRule(this, elemClass));
	}
	
	/**
  	 * use a new instance of the associated class as the type
  	 * Typically called from initialize.
	 */
	protected void useFixedType( EClass elemClass, EClass typeclass ) throws DuplicateRegistrationException {
		checkDuplicateRegistration(elemClass);
		rules.put(elemClass, new UseFixedEClassTCRule(this, elemClass, typeclass));
	}

	/**
  	 * use a new instance of the associated class as the type
  	 * Typically called from initialize.
	 */
	protected void usePrototypeAsType( EClass elemClass, EObject prototype ) throws DuplicateRegistrationException {
		checkDuplicateRegistration(elemClass);
		if ( prototype instanceof EClass ) {
			LOGGER.warn("usePrototypeAsType called with an EClass as the prototype; this is most likely a bug!");
		}
		rules.put(elemClass, new UsePrototypeTCRule(this, elemClass, prototype));
	}

	protected void useCustomType( EClass elemClass, TCRule r ) throws DuplicateRegistrationException {
		checkDuplicateRegistration(elemClass);
		rules.put(elemClass, r);
	}

	/**
	 * derive the type of the element from the 
	 * (hopefully defined :-)) type of one of its features
	 * Typically called from initialize.
	 * @throws EClassDoesntHaveFeatureException 
	 * @throws FeatureMustBeSingleValuedException 
	 */
	protected void useTypeOfFeature( EClass elemClass, EStructuralFeature feature ) throws DuplicateRegistrationException, EClassDoesntHaveFeatureException, FeatureMustBeSingleValuedException {
		checkDuplicateRegistration(elemClass);
		ensureValidFeature( elemClass, feature );
		rules.put(elemClass, new UseFeatureTCRule(this, elemClass, feature));
	}
	
	/**
	 * derive the type of the elment by calculating the 
	 * common type of the two features.
	 * @throws DuplicateRegistrationException
	 * @throws EClassDoesntHaveFeatureException 
	 * @throws FeatureMustBeSingleValuedException 
	 */
	protected void computeCommonType( EClass elemClass, EStructuralFeature f1, EStructuralFeature f2 ) throws DuplicateRegistrationException, EClassDoesntHaveFeatureException, FeatureMustBeSingleValuedException {
		checkDuplicateRegistration(elemClass);
		ensureValidFeature( elemClass, f1 );
		ensureValidFeature( elemClass, f2 );
		rules.put(elemClass, new ComputeCommonTCRule(this, elemClass, f1, f2));
	}
	
	

	/**
	 * move up the containment hierachy
	 * to derive the type from an ancestor
	 * Typically called from initialize.
	 */
	protected void useTypeOfAncestor( EClass elemClass, EClass ancestor ) throws DuplicateRegistrationException {
		checkDuplicateRegistration(elemClass);
		rules.put(elemClass, new UseAncestorTCRule(this, elemClass, ancestor));
	}


	/**
	 * compare the two types. 
	 * First make sure the two classes are the same
	 * Then, if a type comparison feature is registered, 
	 * compare the value of the feature for both elements
	 */
	public boolean isSameType(EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace) {
		Boolean manual = compareTypeDispatcher.invoke(type1, type2, CheckKind.same, trace);
		if ( manual != null ) return manual.booleanValue();
		if ( type1.eClass().equals(type2.eClass()) ) {
			return handleComparisonAndRecursionFeatures(type1, type2, CheckKind.same, trace);
		} else {
			return false;
		}
	}

	/**
	 * compares the type comparison features -- it assumes that these features
	 * exist for both types; it uses the type1 to look up the features!
	 */
	private boolean handleComparisonAndRecursionFeatures( EObject type1, EObject type2, CheckKind kind, TypeCalculationTrace trace ) {
		EClass type1EClass = type1.eClass();
		if ( typeComparisonFeatures.containsKey( type1EClass )) {
			List<EStructuralFeature> comparisonFeatures = typeComparisonFeatures.get( type1EClass );
			for (EStructuralFeature f : comparisonFeatures) {
				Object val1 = type1.eGet(f);
				Object val2 = type2.eGet(f);
				if ( !nullTolerantEquals(val1, val2) ) {
					return false;
				}
			}
		}
		if ( typeRecursionFeatures.containsKey(type1EClass)) {
			List<EStructuralFeature> recursionFeatures = typeRecursionFeatures.get( type1EClass );
			for (EStructuralFeature f : recursionFeatures) {
				EObject val1 = (EObject) type1.eGet(f);
				EObject val2 = (EObject) type2.eGet(f);
				if ( !(val1 instanceof EObject ) ) {
					LOGGER.error("feature "+f.getName()+" of "+type1.eClass()+" is not an EObject!");
					continue;
				}
				if ( !(val2 instanceof EObject ) ) {
					LOGGER.error("feature "+f.getName()+" of "+type2.eClass()+" is not an EObject!");
					continue;
				}
				EObject val1type = typeof( (EObject) val1, trace.child("val1", val1) );
				EObject val2type = typeof( (EObject) val2, trace.child("val2", val2) );
				if ( kind == CheckKind.same ) {
					if ( !isSameType(val1, val1type, val2, val2type, trace)) return false; 
				} else if ( kind == CheckKind.unordered ) {
					if ( !isCompatibleTypeUnordered(val1, val1type, val2, val2type, trace)) return false;
				} else if ( kind == CheckKind.ordered ) {
					if ( !isCompatibleTypeOrdered(val1, val1type, val2, val2type, trace)) return false;
				}
			}
		}
		return true;
	}
	
	
	/**
	 * returns true if the type of element1 has a type that's
	 * a super type of element2's type -- or vice versa
	 * TODO: Possibility to do a polymorphic dispatcher override
	 */
	public boolean isCompatibleTypeUnordered(EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace) {
		Boolean manual = compareTypeDispatcher.invoke(type1, type2, CheckKind.unordered, trace);
		if ( manual != null && manual ) return true;
		if ( isSameType(element1, type1, element2, type2, trace)) return true;
		if ( (isSubtype( element1, type1, element2, type2, trace) || isSubtype( element2, type2, element1, type1, trace)) && handleComparisonAndRecursionFeatures(type1, type2, CheckKind.unordered, trace)) return true;
		EObject coercedType1 = tryToCoerceType(element1, type1, type2, trace);
		if ( coercedType1 != null && isCompatibleTypeUnordered(element1, coercedType1, element2, type2, trace)) return true;
		EObject coercedType2 = tryToCoerceType(element2, type2, type1, trace);
		if ( coercedType2 != null && isCompatibleTypeUnordered(element1, type1, element2, coercedType2, trace)) return true;
		return false;
	}

	/**
	 * returns true if the type of element1 and element2 are
	 * the same, or element2 is a subtype of element1
	 */
	public boolean isCompatibleTypeOrdered(EObject element1, EObject type1, EObject element2, EObject type2, TypeCalculationTrace trace) {
		Boolean manual = compareTypeDispatcher.invoke(type1, type2, CheckKind.ordered, trace);
		if ( manual != null && manual ) return true;
		if ( isSameType(element1, type1, element2, type2, trace)) return true;
		if ( isSameOrSubtype( element1, type1, element2, type2, trace)  && handleComparisonAndRecursionFeatures(type1, type2, CheckKind.ordered, trace)) return true;
		EObject coercedType1 = tryToCoerceType(element1, type1, type2, trace);
		if ( coercedType1 != null && isCompatibleTypeOrdered(element1, coercedType1, element2, type2, trace)) return true;
		EObject coercedType2 = tryToCoerceType(element2, type2, type1, trace);
		if ( coercedType2 != null && isCompatibleTypeOrdered(element1, type1, element2, coercedType2, trace)) return true;
		return false;
	}

	
	private boolean isSameOrSubtype(EObject element1, EObject subtype, EObject element2, EObject supertype, TypeCalculationTrace trace) {
		if ( isSameType(element1, subtype, element2, supertype, trace)) return true;
		return isSubtype(element1, subtype.eClass(), element2, supertype.eClass(), trace);
	}

	private boolean isSubtype(EObject element1, EObject subtype, EObject element2, EObject supertype, TypeCalculationTrace trace) {
		return isSubtypeWithClasses(subtype.eClass(), supertype.eClass());
	}

	
	/**
	 * determines whether subtypeClass is a subtype of supertypeClass
	 */
	private boolean isSubtypeWithClasses(EClass subtypeClass, EClass supertypeClass) {
		List<EClass> subtypeSupertypes = allSupertypes( subtypeClass );
		if ( subtypeSupertypes.contains(supertypeClass) ) return true;
		return false;
	}

	/**
	 * determines whether subtypeClass is a subtype of supertypeClass
	 */
	private boolean isSameOrSubtypeWithClasses(EClass subtypeClass, EClass supertypeClass, TypeCalculationTrace trace) {
		if ( isSubtypeWithClasses(subtypeClass, supertypeClass)) return true;
		return subtypeClass == supertypeClass;
	}


	/** 
	 * collects all supertypes of t
	 */
	private List<EClass> allSupertypes(EClass c) {
		List<EClass> res = new ArrayList<EClass>();
		findSupertypes( res, c );
		return res;
	}

	/**
	 * recursive helper method for the method above
	 */
	private void findSupertypes(List<EClass> res, EClass c) {
		if ( subtypeToSupertype.containsKey(c)) {
			EClass st = subtypeToSupertype.get(c);
			res.add(st);
			findSupertypes(res, st);
		}
	}

	/** 
	 * collects all subtypes of t
	 */
	private List<EClass> allSubtypes(EClass c) {
		List<EClass> res = new ArrayList<EClass>();
		findSubtypes( res, c );
		return res;
	}

	/**
	 * recursive helper method for the method above
	 */
	private void findSubtypes(List<EClass> res, EClass c) {
		if ( supertypeToSubtype.containsKey(c)) {
			EClass st = supertypeToSubtype.get(c);
			res.add(st);
			findSupertypes(res, st);
		}
	}
	


	/**
	 * checks whether actualType is an instance of expectedType
	 */
	public boolean isInstanceOf( EObject actualType, EClass expectedType, TypeCalculationTrace trace ) {
		boolean isDirectInstance = expectedType.isInstance(actualType);
		if ( isDirectInstance ) return true;
		List<EClass> allSubtypes = allSubtypes(expectedType);
		for (EClass superType : allSubtypes) {
			if ( superType.isInstance(actualType) ) return true;
		}
		return false;
	}
	
	/**
	 * checks whether element's name is unique in the 
	 * collection passed in. 
	 */
	public boolean isNameLocallyUnique( EObject element, EList<? extends EObject> all ) {
		int count = 0;
		String elementName = name(element);
		if ( elementName == null ) return true;
		for (EObject o: all) {
			String oname = name(o);
			if ( oname == null ) continue;
			if ( oname.equals(elementName)) count++;
			if ( count > 1 ) return false;
		}
		return true;
	}

	
	
	public void registerCustomTypeChecker( ContextDependentCustomTypeChecker checker ) {
		singleElementChecks.add(new CDCTCAdapter(checker));
	}
	
	
	/**
	 * define a type constraint for a feature. The type of 
	 * feature of instances of ctxClass must be an instance
	 * of typeClass. Typically called from initialize.
	 * @throws EClassDoesntHaveFeatureException 
	 * @throws InvalidTypeSpecification 
	 */
	protected void ensureFeatureType(EClass ctxClass, EStructuralFeature feature, Object ... validTypes) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException, InvalidTypeSpecification {
		ensureFeatureType(null, ctxClass, feature, validTypes);
	}

	/**
	 * same as above, but with custom error message
	 */
	protected void ensureFeatureType(String errorMessage, EClass ctxClass, EStructuralFeature feature, Object ... validTypes) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException, InvalidTypeSpecification {
		ensureValidFeature( ctxClass, feature );
		for (Object o: validTypes) {
			if ( !(o instanceof EClass) && !(o instanceof StaticCustomTypeChecker) && !(o instanceof TypeCharacteristic) ) {
				throw new InvalidTypeSpecification("types must be EClasses or instances of CustomTypechecker or instances of TypeCharacteristic");
			}
			if ( o instanceof EClass || o instanceof EObject ) {
				checkSuperSuperTypes((EObject) o);
			}
		}
		singleElementChecks.add( new ConstrainPropertyCheck(errorMessage, ctxClass, feature, validTypes) );
	}

	
	/**
	 * define a compatibility constraint for two features of an EClass. 
     * Typically called from initialize.
	 * @throws EClassDoesntHaveFeatureException 
	 */
	protected void ensureUnorderedCompatibility(EClass ctxClass, EStructuralFeature feature1, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		ensureValidFeature( ctxClass, feature1 );
		ensureValidFeature( ctxClass, feature2 );
		singleElementChecks.add( new EnsureUnorderedCompatibilityCheck(ctxClass, feature1, feature2) );
	}
	
	protected void ensureUnorderedCompatibility(String errorMessage, EClass ctxClass, EStructuralFeature feature1, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		ensureValidFeature( ctxClass, feature1 );
		ensureValidFeature( ctxClass, feature2 );
		singleElementChecks.add( new EnsureUnorderedCompatibilityCheck(errorMessage, ctxClass, feature1, feature2) );
	}

	protected void ensureUnorderedCompatibility(EClass ctxClass, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		ensureValidFeature( ctxClass, feature2 );
		singleElementChecks.add( new EnsureUnorderedCompatibilityCheck(ctxClass, feature2) );
	}
	
	protected void ensureUnorderedCompatibility(String errorMessage, EClass ctxClass, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		ensureValidFeature( ctxClass, feature2 );
		singleElementChecks.add( new EnsureUnorderedCompatibilityCheck(errorMessage, ctxClass, feature2) );
	}
	
	
	/**
	 * define a compatibility constraint for two features of an EClass. 
     * Typically called from initialize. feature2 must be the same or
     * a subtype of feature 1
	 * @throws EClassDoesntHaveFeatureException 
	 */
	protected void ensureOrderedCompatibility(EClass ctxClass, EStructuralFeature left, EStructuralFeature right) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		ensureValidFeature( ctxClass, left );
		ensureValidFeature( ctxClass, right );
		singleElementChecks.add( new EnsureOrderedCompatibilityCheck(ctxClass, left, right) );
	}
	
	protected void ensureOrderedCompatibility(String errorMessage, EClass ctxClass, EStructuralFeature left, EStructuralFeature right) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		checkSuperSuperTypes(ctxClass);
		ensureValidFeature( ctxClass, left );
		ensureValidFeature( ctxClass, right );
		singleElementChecks.add( new EnsureOrderedCompatibilityCheck(errorMessage, ctxClass, left, right) );
	}
	
	protected void ensureOrderedCompatibility(EClass ctxClass, EStructuralFeature right) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		checkSuperSuperTypes(ctxClass);
		ensureValidFeature( ctxClass, right );
		singleElementChecks.add( new EnsureOrderedCompatibilityCheck(ctxClass, right) );
	}
	
	protected void ensureOrderedCompatibility(String errorMessage, EClass ctxClass, EStructuralFeature right) throws FeatureMustBeSingleValuedException, EClassDoesntHaveFeatureException {
		checkSuperSuperTypes(ctxClass);
		ensureValidFeature( ctxClass, right );
		singleElementChecks.add( new EnsureOrderedCompatibilityCheck(errorMessage, ctxClass, right) );
	}
	
	/**
	 * called from a validator to execute the type system
	 * constraints
	 */
	public void checkTypesystemConstraints(EObject m, ValidationMessageAcceptor acceptor) {
		ensureInitialized();
		for (ISingleElementTypesystemCheck check: singleElementChecks) {
			if ( check.isApplicable(m) ) {
				check.check(m, this, new TypeCalculationTrace(), acceptor, showWarningsIfTypeUndefined);
			}
		}
	}
	
	/**
	 * returns a nice string representation for types
	 */
	public String typeString( Object type )  {
		if ( type == null ) {
			return "<null>";
		}
		String manual = typeToStringDispatcher.invoke(type);
		if ( manual != null ) {
			return manual;
		} 
		if ( type instanceof EClass ) {
			String name = ((EClass) type).getName();
			//if ( name.toLowerCase().endsWith("type")) name = name.substring(0,name.length()-4);
			for (TypeCharacteristic tc: characteristics.get((EClass) type)) {
				name += "|"+tc.toString();
			}
			return name;
		} else if ( type instanceof EObject ) {
			StringBuffer bf = new StringBuffer();
			EObject eType = (EObject)type;
			String name = name(eType);
			if ( name != null ) {
				bf.append("/"+name);
			}
			List<EStructuralFeature> comparisonFeatures = typeComparisonFeatures.get( eType.eClass() );
			for (EStructuralFeature f: comparisonFeatures) {
				Object v = eType.eGet(f);
				bf.append(typeString(v)+" ");
			}
			List<EStructuralFeature> recursionFeatures = typeRecursionFeatures.get( eType.eClass() );
			for (EStructuralFeature f: recursionFeatures) {
				Object v = eType.eGet(f);
				bf.append(typeString(v)+" ");
			}
			String inner = bf.toString().trim();
			String ecname = eType.eClass().getName();
			for (TypeCharacteristic tc: characteristics.get(((EObject) type).eClass())) {
				ecname += "|"+tc.toString();
			}
			//if ( ecname.toLowerCase().endsWith("type")) ecname = ecname.substring(0,ecname.length()-4);
			if ( inner.equals("")) return ecname;
			return ecname+"("+inner+")";
		} else {
			return type.toString();
		}
	}

	public String typeStrings( Object[] types )  {
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < types.length; i++) {
			if ( i > 0 ) {
				if ( types.length > 1 && i == types.length-1) bf.append(" or ");
				else bf.append(", "); 
			}
			bf.append(typeString(types[i]));
		}
		return bf.toString();
	}


	protected void declareSubtype(EClass subtype, EClass supertype) {
		checkSuperSuperTypes(subtype);
		checkSuperSuperTypes(supertype);
		subtypeToSupertype.put(subtype, supertype);
		supertypeToSubtype.put(supertype, subtype );
	}
	
	protected void declareCharacteristic(EClass type, TypeCharacteristic c) {
		checkSuperSuperTypes(type);
		characteristics.put(type, c);
	}
	
	@Override
	public boolean hasCharacteristic(EObject actualType, TypeCharacteristic c) {
		return characteristics.get(actualType.eClass()).contains(c);
	}
	
	protected EObject create( EClass cls ) {
		return cls.getEPackage().getEFactoryInstance().create(cls);
	}

	protected void declareTypeRootEClasses( EClass ... classes ) {
		for (EClass c : classes) {
			typeRootEClasses.add(c);
		}
	}
	
}

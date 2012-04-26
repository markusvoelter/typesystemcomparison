package de.itemis.xtext.typesystem.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Function;

public class Utils {

	/**
	 * Returns the ancestor of type ancestorClass of the ctx element 
	 */
	public static <C extends EObject> C ancestor(EObject ctx, Class<C> ancestorClass) {
		return EcoreUtil2.getContainerOfType(ctx, ancestorClass);
	}	

	/**
	 * like above, but using the EClass instead of the Java class object
	 */
	public static EObject ancestor(EObject ctx, EClass ancClass) {
		EObject anc = ctx.eContainer();
		while ( true ) {
			if ( anc == null ) return null;
			if ( ancClass.isInstance(anc)) return anc;
			anc = anc.eContainer();
		}
	}	
	
	public static List<EObject> ancestors(EObject ctx, EClass ancClass) {
		List<EObject> res = new ArrayList<EObject>();
		EObject anc = ctx.eContainer();
		while ( true ) {
			if ( anc == null ) return res;
			if ( ancClass.isInstance(anc)) res.add( anc );
			anc = anc.eContainer();
		}
	}	
	
	/**
	 * uses reflection to return the value of the name attribute
	 * if it exists, null otherwise
	 */
	public static String name( EObject object ) {
		EStructuralFeature namefeature = object.eClass().getEStructuralFeature("name");
		if ( namefeature == null ) {
			return null;
		} else {
			return (String) object.eGet(namefeature);
		}
	}

	/**
	 * a helper class for scope construction that contains
	 * a collection of elements as well as a function that
	 * calculates the name for the object. Used with
	 * buildScope below 
	 */
	public abstract static class ElementNamer {
		private List<? extends EObject> elements;
		public ElementNamer( List<? extends EObject> elements ) {
			this.elements = elements;
		}
		public List<? extends EObject> getElements() {
			return elements;
		}
		public abstract QualifiedName getName( EObject o ); 
	}

	/**
	 * Helper function to construct scopes from IScope objects,
	 * List<EObject>s and ElementNamers
	 */
	@SuppressWarnings("unchecked")
	public static IScope buildScope( Object ... scopes ) {
		List<EObject> objects = new ArrayList<EObject>();
		for (Object s: scopes) {
			if ( s instanceof List ) {
				objects.addAll( (List<EObject>)s );
			} 
		}
		IScope res = Scopes.scopeFor(objects); 
		for (Object s: scopes) {
			if ( s instanceof IScope ) {
				res = new SimpleScope(res, ((IScope) s).getAllElements());
			} else if ( s instanceof ElementNamer ) {
				final ElementNamer namer = (ElementNamer)s;
				res = Scopes.scopeFor(namer.getElements(), new Function<EObject, QualifiedName>() {
					public QualifiedName apply(EObject from) {
						return namer.getName(from);
					};
				}, res);
			}
		}
		return res;
	}
	
	

	/**
	 * utility class that finds all instances of a given type
	 * in the index. Note that the client instantiating this
	 * class has to pass in an IResourceDescriptions, which the
	 * client may get using @Inject
	 */
	public static class GlobalFinder {

		private IResourceDescriptions global;

		public GlobalFinder( IResourceDescriptions global ) {
			this.global = global;
		}
		
		public IScope find(EClass ... classes ) {
			return find(null, classes );
		}
		
		public IScope find(Filter p, EClass ... classes ) {
			final List<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
			Iterable<IResourceDescription> allResourceDescriptions = global.getAllResourceDescriptions();
			for (IResourceDescription description : allResourceDescriptions) {
				for (EClass cls : classes) {
					Iterable<IEObjectDescription> enums = description.getExportedObjectsByType(cls);
					for (IEObjectDescription od : enums) {
						if ( p == null ) res.add( od );
						else if ( p.include(od) ) res.add( od );
					}
				}
			}
			return new SimpleScope(res);
		}
		
	}

	public abstract static class Filter {
		public abstract boolean include( IEObjectDescription o );
	}
	

	/** 
	 * compares two objects and takes into account nulls
	 */
	public static boolean nullTolerantEquals(Object o1, Object o2) {
		if ( o1 == null ) {
			if ( o2 == null ) {
				return true;
			} else {
				return false;
			}
		} else {
			if ( o2 == null ) {
				return false;
			} else {
				return o1.equals(o2);
			}
		}
	}	

	/**
	 * outputs a more or less useful string represntation
	 * for an EObject
	 */
	public static String eString( EObject eObject )  {
		if ( eObject instanceof EClass ) {
			return ((EClass) eObject).getName();
		} else {
			String res;
			String name = name(eObject);
			if ( name != null ) {
				res = eObject.eClass().getName()+"/"+name;
			} else {
				res = eObject.eClass().getName();
			}
			if ( eObject.eIsProxy() ) {
				res += "[proxy]";
			}
			return res;
		}
	}	

	/**
	 * creates an instance of an EClass
	 */
	public static EObject create( EClass cls ) {
		return cls.getEPackage().getEFactoryInstance().create(cls);
	}
	

	public static Object eget( EObject eObject, String featureName) {
		Object val = eObject.eGet(eObject.eClass().getEStructuralFeature(featureName));
		return val;
	}

	public static EObject egetAndResolve( EObject eObject, String featureName, ResourceSet rs ) {
		EObject val = (EObject) eget( eObject, featureName );
		return resolveProxy((EObject) val, rs);
	}

	public static EObject getEObject( Issue issue, Resource r ) {
		URI uri = issue.getUriToProblem();
		EObject eObject = r.getEObject(uri.fragment());
		return eObject;
	}
	
	public static EObject resolveProxy( EObject eObject, ResourceSet rs ) {
		if ( eObject.eIsProxy()) {
			eObject = EcoreUtil.resolve(eObject, rs);
		}
		return eObject;
	}
	
	public static EObject clone( EObject source ) {
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		EObject clone = copier.copy(source);
		copier.copyReferences();
		return clone;
	}
	
}

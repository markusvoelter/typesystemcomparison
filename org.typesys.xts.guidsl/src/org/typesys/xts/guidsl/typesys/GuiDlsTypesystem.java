package org.typesys.xts.guidsl.typesys;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.typesys.xts.guidsl.guiDsl.Entity;
import org.typesys.xts.guidsl.guiDsl.EntityType;
import org.typesys.xts.guidsl.guiDsl.FloatType;
import org.typesys.xts.guidsl.guiDsl.GuiDslPackage;
import org.typesys.xts.guidsl.guiDsl.IntType;
import org.typesys.xts.guidsl.guiDsl.NumberLiteral;
import org.typesys.xts.guidsl.guiDsl.StringLiteral;
import org.typesys.xts.guidsl.guiDsl.StringType;

import com.google.common.collect.Sets;

import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class GuiDlsTypesystem extends GuiDlsTypesystemGenerated {

	private GuiDslPackage cl = GuiDslPackage.eINSTANCE;

	
	@Override
	protected void initialize() {
//		try { 
//			
			super.initialize();
//			
//			
//		} catch (TypesystemConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	@Override
	public EObject type( NumberLiteral s, TypeCalculationTrace trace ) {
		if ( s.getValue().equals(s.getValue().intValue())) {
			return create(cl.getIntType());
		}
		return create(cl.getFloatType());
	} 

	
	@Override
	protected EObject type(Entity element, TypeCalculationTrace trace) {
		EntityType et = (EntityType)create(cl.getEntityType());
		et.setRef(element);
		return et;
	}
	
	protected boolean compareTypes( EntityType t1, EntityType t2, CheckKind k, TypeCalculationTrace trace ) {
		if ( k == CheckKind.same ) return t1.getRef() == t2.getRef();
		if ( k == CheckKind.ordered ) return internalCompareTypesOrdered(t1.getRef(), t2.getRef(), Sets.<Entity>newHashSet());
		return false;
	}

	/**
	 * An entity can be assigned to its super type(s) (extends is a reference 
	 * specified in the DSL)
	 * @param t1 the type that is expected to be more general
	 * @param t2 the type that is checked if it is a subclass of t1
	 * @param to prevent cycles, set of types already visited
	 */
	protected boolean internalCompareTypesOrdered(Entity t1, Entity t2, Set<Entity> visited) {
		if (visited.contains(t2)) return false; // cycle detected
		visited.add(t2);
		return t1 == t2 || (t2.getExtends()!= null && 
				internalCompareTypesOrdered(t1, t2.getExtends(), visited));
	}
	
	/**
	 * A number may be coerced to be a string. This is useful for instance
	 * in concatenation with the plus operator.
	 * 
	 */
	public EObject typeCoerce( EObject candidateElement, FloatType candidate, StringType expected, TypeCalculationTrace trace ) {
		if ( candidateElement instanceof NumberLiteral ) {
				trace.add( candidateElement, "Number coerced to string.");
				return create(cl.getStringType());
		}
		return null;
	}
	
	
}
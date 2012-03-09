package org.typesys.xts.guidsl.typesys;

import org.eclipse.emf.ecore.EObject;
import org.typesys.xts.guidsl.guiDsl.Entity;
import org.typesys.xts.guidsl.guiDsl.EntityType;
import org.typesys.xts.guidsl.guiDsl.FieldContent;
import org.typesys.xts.guidsl.guiDsl.GuiDslPackage;
import org.typesys.xts.guidsl.guiDsl.NewExpr;
import org.typesys.xts.guidsl.guiDsl.NumberLiteral;
import org.typesys.xts.guidsl.guiDsl.Widget;

import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Utils;

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
		if ( k == CheckKind.ordered ) return t1.getRef().getExtends() == t2.getRef();
		return false;
	}

	
	
}

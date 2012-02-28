package org.typesys.xts.guidsl.typesys;

import org.eclipse.emf.ecore.EObject;
import org.typesys.xts.guidsl.guiDsl.FieldContent;
import org.typesys.xts.guidsl.guiDsl.GuiDslPackage;
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
	protected EObject type(FieldContent element, TypeCalculationTrace trace) {
		Widget w = (Widget) Utils.ancestor(element, Widget.class);
		return typeof(w.getAttr(), trace);
	}
		
	
}

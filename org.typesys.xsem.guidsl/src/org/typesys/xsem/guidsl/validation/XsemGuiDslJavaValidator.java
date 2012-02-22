package org.typesys.xsem.guidsl.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.typesys.xsem.guidsl.xsemantics.validation.TypeSystemValidator;
 

public class XsemGuiDslJavaValidator extends TypeSystemValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.typesys.xsem.guidsl.xsemGuiDsl.XsemGuiDslPackage.eINSTANCE);
		return result;
	}

}

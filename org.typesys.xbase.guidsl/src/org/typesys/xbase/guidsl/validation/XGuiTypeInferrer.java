package org.typesys.xbase.guidsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer;

public class XGuiTypeInferrer extends Xtend2JvmModelInferrer {
	
	public JvmTypeReference getType(EObject object) {
		return getTypeProxy(object);
	}

}

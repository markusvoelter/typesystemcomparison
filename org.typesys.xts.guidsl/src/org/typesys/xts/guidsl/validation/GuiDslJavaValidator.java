package org.typesys.xts.guidsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import com.google.inject.Inject;

import de.itemis.xtext.typesystem.ITypesystem;
 

public class GuiDslJavaValidator extends AbstractGuiDslJavaValidator {

	
	@Inject 
	private ITypesystem ts;
	
	
	@Check(CheckType.NORMAL)
	public void validateTypes( EObject m ) {
		ts.checkTypesystemConstraints( m, this );
	}	

}

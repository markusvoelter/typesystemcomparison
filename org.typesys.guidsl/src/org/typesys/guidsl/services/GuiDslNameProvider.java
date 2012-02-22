package org.typesys.guidsl.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class GuiDslNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		// if (obj instanceof Widget) { // TODO qualified name for widget
		// }
		return super.getFullyQualifiedName(obj);
	}

}

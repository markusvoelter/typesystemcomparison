package org.typesys.xbase.guidsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.typesys.xbase.guidsl.xGuiDsl.Form
import org.typesys.xbase.guidsl.xGuiDsl.Widget

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.xtext.scoping.Scopes.*
import org.eclipse.xtext.scoping.Scopes

class XGuiDslScopeProviderXbase extends XbaseScopeProvider {

	override getScope(EObject context, EReference reference) {
		getCustomScope(context, reference);
	}
	
    def dispatch getCustomScope(EObject context, EReference reference) {
    	super.getScope(context, reference)
    }

	def dispatch getCustomScope(Widget context, EReference reference) {
		context?.getContainerOfType(typeof(Form))?.entity?.attributes?.scopeFor
	}
		
}
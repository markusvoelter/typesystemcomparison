package org.typesys.xbase.guidsl.tests

import com.google.inject.Inject
import com.google.inject.Provider
import java.io.FileInputStream
import java.io.InputStream
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResourceSet

class XParseHelper<T extends EObject> extends ParseHelper<T> {
	
	
	protected XtextResourceSet xtextResourceSet = null
    
    @Inject
    new(Provider<XtextResourceSet> resourceSetProvider) {
     //  super()
       xtextResourceSet = resourceSetProvider.get      
    }
	
	/**
	 * parse everything into the same resource set
	 */
	def T parse(String filename) {
	 val filenameWithExtension = '''
	 «filename»«IF !filename.endsWith(fileExtension)».«fileExtension»«ENDIF»'''
	 val InputStream in = new FileInputStream(filenameWithExtension.toString())
	 return parse(in, computeUnusedUri(xtextResourceSet), null, xtextResourceSet);
	}
	
	override T parse(CharSequence text) throws Exception {
		return parse(text, xtextResourceSet);
	}
	
}
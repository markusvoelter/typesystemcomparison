
package org.typesys.xsem.guidsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XsemGuiDslStandaloneSetup extends XsemGuiDslStandaloneSetupGenerated{

	public static void doSetup() {
		new XsemGuiDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


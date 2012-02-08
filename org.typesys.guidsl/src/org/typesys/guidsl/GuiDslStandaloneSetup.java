
package org.typesys.guidsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GuiDslStandaloneSetup extends GuiDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GuiDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


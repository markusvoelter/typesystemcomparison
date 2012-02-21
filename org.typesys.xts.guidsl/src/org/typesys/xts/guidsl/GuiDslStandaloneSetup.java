
package org.typesys.xts.guidsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GuiDslStandaloneSetup extends GuiDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GuiDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


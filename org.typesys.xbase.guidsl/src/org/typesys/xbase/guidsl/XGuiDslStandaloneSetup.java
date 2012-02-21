
package org.typesys.xbase.guidsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XGuiDslStandaloneSetup extends XGuiDslStandaloneSetupGenerated{

	public static void doSetup() {
		new XGuiDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


package de.itemis.xtext.typesystem.exceptions;

/**
 * thrown if you try to define a typesystem check for features
 * that are multi-valued. Currently, only checks for single-valued
 * features are supported
 */
public class FeatureMustBeSingleValuedException extends TypesystemConfigurationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4410731287123435275L;

	public FeatureMustBeSingleValuedException() {
		super();
	}
	
	public FeatureMustBeSingleValuedException(String msg) {
		super(msg);
	}
	
}

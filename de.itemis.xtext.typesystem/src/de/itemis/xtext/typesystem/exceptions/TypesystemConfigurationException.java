package de.itemis.xtext.typesystem.exceptions;

public abstract class TypesystemConfigurationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8243474506024096059L;

	public TypesystemConfigurationException() {
		super();
	}
	
	public TypesystemConfigurationException(String msg) {
		super(msg);
	}
	
}

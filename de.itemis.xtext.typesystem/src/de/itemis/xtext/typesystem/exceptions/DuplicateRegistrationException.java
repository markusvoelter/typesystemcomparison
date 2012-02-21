package de.itemis.xtext.typesystem.exceptions;

/**
 * currently you can only define one type system rule per feature.
 * This exception is thrown if you try otherwise. This restriction
 * may be removed in the future.
 */
public class DuplicateRegistrationException extends TypesystemConfigurationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4722579820651051103L;

	public DuplicateRegistrationException() {
		super();
	}
	
	public DuplicateRegistrationException(String msg) {
		super(msg);
	}
	
	
	
}

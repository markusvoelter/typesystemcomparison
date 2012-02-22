package org.typesys.xsem.guidsl.xsemantics.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsBasedDeclarativeValidator;
import org.typesys.xsem.guidsl.xsemantics.TypeSystem;

public class TypeSystemValidator extends XsemanticsBasedDeclarativeValidator {
	@Inject
	protected TypeSystem xsemanticsSystem;

}

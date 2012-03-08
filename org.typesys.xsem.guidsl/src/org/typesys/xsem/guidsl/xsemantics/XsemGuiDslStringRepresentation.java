package org.typesys.xsem.guidsl.xsemantics;

import org.typesys.xsem.guidsl.xsemGuiDsl.EntityType;

import it.xsemantics.runtime.StringRepresentation;

public class XsemGuiDslStringRepresentation extends StringRepresentation {

	String stringRep(EntityType entityType) {
		return entityType.getRef().getName();
	}
}

package org.typesys.guidsl.guiDsl.impl;

import org.typesys.guidsl.guiDsl.Entity;
import org.typesys.guidsl.guiDsl.EntityType;

public class TypeImplCustom extends org.typesys.guidsl.guiDsl.impl.TypeImpl {

	/**
	 * friendly name for error messages and warnings in the DSL editor
	 */
	@Override
	public String toString() {
		if (this instanceof EntityType) {
			Entity ref = ((EntityType) this).getRef();
			if (ref != null) {
				return ref.getName() + " (Entity)";
			}
		}
		return eClass().getName();
	}

}

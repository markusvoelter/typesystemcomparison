package org.typesys.guidsl.guiDsl.impl;

public class TypeImplCustom extends org.typesys.guidsl.guiDsl.impl.TypeImpl {

	/**
	 * friendly name for error messages and warnings in the DSL editor
	 */
	@Override
	public String toString() {
		return eClass().getName();
	}

}

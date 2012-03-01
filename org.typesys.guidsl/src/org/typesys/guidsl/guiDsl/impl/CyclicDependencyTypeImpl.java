package org.typesys.guidsl.guiDsl.impl;

import org.typesys.guidsl.guiDsl.CyclicDependencyType;

public class CyclicDependencyTypeImpl extends TypeImplCustom implements CyclicDependencyType {

	@Override
	public String toString() {
		return "Cyclic Dependency";
	}
}

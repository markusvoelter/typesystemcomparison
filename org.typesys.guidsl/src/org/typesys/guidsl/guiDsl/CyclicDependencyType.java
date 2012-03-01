package org.typesys.guidsl.guiDsl;

import org.typesys.guidsl.guiDsl.impl.CyclicDependencyTypeImpl;

import com.google.inject.ImplementedBy;

@ImplementedBy(CyclicDependencyTypeImpl.class)
public interface CyclicDependencyType extends Type
{
}
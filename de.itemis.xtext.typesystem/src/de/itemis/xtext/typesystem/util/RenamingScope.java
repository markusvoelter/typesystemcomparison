/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.itemis.xtext.typesystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Function;

/**
 * @author "Karsten Thoms (karsten.thoms@itemis.de)" - Initial contribution and API
 */
public class RenamingScope implements IScope {
	private IScope delegate;

	private Function<QualifiedName, QualifiedName> renameFunction;

	public RenamingScope (IScope delegate, Function<QualifiedName, QualifiedName> renameFunction) {
		this.delegate = delegate;
		this.renameFunction = renameFunction;
	}

	public Iterable<IEObjectDescription> getAllElements() {
		return delegate.getAllElements();
	}

	public Iterable<IEObjectDescription> getElements(EObject object) {
		return delegate.getElements(object);
	}
	
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		return delegate.getElements(renameFunction.apply(name));
	}

	public IEObjectDescription getSingleElement(EObject object) {
		return delegate.getSingleElement(object);
	}
	
	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		return delegate.getSingleElement(renameFunction.apply(name));
	}
}

package de.itemis.xtext.typesystem.util;

import org.eclipse.emf.ecore.EStructuralFeature;

public class ESFPair {

	private EStructuralFeature f1;
	private EStructuralFeature f2;
	
	public ESFPair( EStructuralFeature f1, EStructuralFeature f2 ) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public EStructuralFeature getFeature1() {
		return f1;
	}
	
	public EStructuralFeature getFeature2() {
		return f2;
	}
	
}

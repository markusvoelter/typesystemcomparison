package de.itemis.xtext.typesystem.trace;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface ITraceStep {

	public void appendTraceInfo( List<String> collector, EObject element, String level );
	
}

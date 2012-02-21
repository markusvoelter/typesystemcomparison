package de.itemis.xtext.typesystem.trace;

import static de.itemis.xtext.typesystem.util.Utils.eString;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class StringTraceElement implements ITraceStep {
	
	private String info;

	public StringTraceElement(String info) {
		this.info = info;
	}
	

	@Override
	public void appendTraceInfo(List<String> collector, EObject element, String level) {
		collector.add( level+"["+eString(element)+"] "+info);
		
	}


}

package de.itemis.xtext.typesystem.trace;

import static de.itemis.xtext.typesystem.util.Utils.eString;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class TypeCalculationTrace implements ITraceStep {

	private List<P> elements = new ArrayList<P>();
	private String name;
	
	public TypeCalculationTrace() {}
	
	public TypeCalculationTrace( String name ) {
		this.name = name;
	}
	
	static class P {
		public EObject element;
		public ITraceStep traceElement;
		public P(EObject element, ITraceStep traceElement) {
			this.element = element;
			this.traceElement = traceElement;
		}
	}
	
	public void add(EObject element, ITraceStep r) {
		elements.add( new P(element, r) );
	}
	
	public void add( EObject element, String info ) {
		add( element, new StringTraceElement(info));
	}

	public TypeCalculationTrace child( String name, EObject element ) {
		TypeCalculationTrace t = new TypeCalculationTrace(name);
		this.add(element, t);
		return t;
	}
	
	@Override
	public void appendTraceInfo(List<String> collector, EObject element, String level) {
		if ( name != null ) {
			if ( element != null ) {
				collector.add( level+"["+eString(element)+"] ."+name );
			}
		}
		for (P e: elements) {
			//collector.add( level+e.element.eClass().getName() );
			e.traceElement.appendTraceInfo(collector, e.element, level+"  ");
		}
	}
	
	public String[] toStringArray() {
		List<String> lines = new ArrayList<String>();
		appendTraceInfo(lines, null, "");
		String[] res = new String[lines.size()];
		int i = 0;
		for (String l: lines) {
			res[i] = l;
			i++;
		}   
		return res;
	}
	
	@Override
	public String toString() {
		String res = "";
		for (String s: toStringArray()) {
			res += s + "\n";
		}
		return res;
	}
	
}
   
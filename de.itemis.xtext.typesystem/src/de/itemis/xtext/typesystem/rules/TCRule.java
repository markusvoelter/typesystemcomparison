package de.itemis.xtext.typesystem.rules;

import static de.itemis.xtext.typesystem.util.Utils.eString;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.ITraceStep;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public abstract class TCRule implements ITraceStep {

	protected EClass type;
	protected String traceInfo;
	protected ITypesystem ts;

	public TCRule( ITypesystem ts, EClass type, String traceInfo ) {
		this.type = type;
		this.traceInfo = traceInfo;
		this.ts = ts;
	}
	
	
	public void appendTraceInfo( List<String> collector, EObject element, String level ) {
		collector.add(level+"["+eString(element)+"] "+traceInfo);
	}
	
	public final EObject type( TypeCalculationTrace trace, EObject element ) {
		trace.add( element, this );
		return calculateType(trace, element);
	}
	
	public boolean isApplicable( EObject element ) {
		return true;
	}
	
	protected abstract EObject calculateType( TypeCalculationTrace trace, EObject object );
	
}

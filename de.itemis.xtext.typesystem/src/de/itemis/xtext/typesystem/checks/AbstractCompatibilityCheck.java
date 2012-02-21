package de.itemis.xtext.typesystem.checks;

import static de.itemis.xtext.typesystem.util.Utils.eString;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.itemis.xtext.typesystem.exceptions.FeatureMustBeSingleValuedException;

abstract class AbstractCompatibilityCheck implements ISingleElementTypesystemCheck {
	protected final EClass ctxClass;
	protected final EStructuralFeature feature1;
	protected final EStructuralFeature feature2;
	protected final String info;
	protected String errorMessage;
	public AbstractCompatibilityCheck(String errorMessage, String traceInfo, EClass ctxClass, EStructuralFeature feature1, EStructuralFeature feature2) throws FeatureMustBeSingleValuedException  {
		if ( feature1 != null && feature1.isMany() ) {
			throw new FeatureMustBeSingleValuedException("can only check compatibility for single-valued features ("+feature1.getName()+" is multi-valued)");
		}
		if ( feature2.isMany() ) {
			throw new FeatureMustBeSingleValuedException("can only check compatibility for single-valued features ("+feature2.getName()+" is multi-valued)");
		}
		this.errorMessage = errorMessage;
		this.info = traceInfo;
		this.ctxClass = ctxClass;
		this.feature1 = feature1;
		this.feature2 = feature2;
	}
	public boolean isApplicable(EObject element) {
		return ctxClass.isInstance(element);
	}
	public void appendTraceInfo(List<String> collector, EObject element, String level) {
		collector.add( level+"["+eString(element)+"] "+info );
	}


}
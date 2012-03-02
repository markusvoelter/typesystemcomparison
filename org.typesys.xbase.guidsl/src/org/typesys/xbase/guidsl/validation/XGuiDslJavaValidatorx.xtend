package org.typesys.xbase.guidsl.validation

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.validation.IssueCodes
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator
import org.typesys.xbase.guidsl.jvmmodel.GuiTypeProvider
import org.typesys.xbase.guidsl.xGuiDsl.CheckBoxWidget
import org.typesys.xbase.guidsl.xGuiDsl.TextWidget
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage$Literals
import org.typesys.xbase.guidsl.xGuiDsl.Widget
import org.eclipse.xtext.common.types.util.TypeConformanceComputer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.util.Primitives

class XGuiDslJavaValidatorx extends XbaseJavaValidator {
	
	@Inject
	private extension GuiTypeProvider typeProvider;
	
	@Inject TypeConformanceComputer typeConformanceComputer;
	
	@Inject Primitives primitives
	
	@Inject extension JvmTypesBuilder
	
	override List<EPackage> getEPackages() {
		val List<EPackage> packages = newArrayList() 
		packages.addAll(super.getEPackages())
		packages.add(XGuiDslPackage::eINSTANCE) 
		return packages
	}

	/**
	 * 1) The expression after "validate" must be boolean.
	 *  This is already covered by the XGuiDslJvmModelInferrer.
	 */
	
	/**
	 * 2) Text widgets may only refer to non-boolean attributes.
	 */
	@Check
	def void checkTextWidgetForNonBoolean(TextWidget widget) {
		val jvmTypeReference = widget.attr.getJvmType
		if (jvmTypeReference == null) {
			return
		}
		if (jvmTypeReference.getQualifiedName().equals(Boolean::TYPE.getName())) {
			error("Textbox may NOT refer to boolean attributes.",
					XGuiDslPackage$Literals::WIDGET__ATTR, IssueCodes::INCOMPATIBLE_TYPES);
		}
	}

	/**
	 * 3) Checkbox widgets may only refer to boolean attributes.
	 */
	@Check
	def void checkBoxWidgetOnlyBoolean(CheckBoxWidget widget) {
		val jvmTypeReference = widget.attr.getJvmType
		if (jvmTypeReference == null) {
			return
		}
		if (!jvmTypeReference.getQualifiedName().equals(Boolean::TYPE.getName())) {
			error("Checkbox may only refer to boolean attributes, but found type "
					+ jvmTypeReference.getQualifiedName(),
					XGuiDslPackage$Literals::WIDGET__ATTR, IssueCodes::INCOMPATIBLE_TYPES);
		}
	}
	
 	/**
	 * Widgets may only refer to primitive types (or Strings)
	 */
	@Check
	def void check(Widget widget) {
		val jvmTypeReference = widget.getJvmType
		if (jvmTypeReference == null) return;
		val stringRef = widget.newTypeRef(typeof(String).canonicalName)
		if (primitives.isPrimitive(jvmTypeReference) ||
			jvmTypeReference.identifier.equals(stringRef.identifier) 
		) 
		 {return;}
		error("Widgets may only refer to primitive types, but found type " + jvmTypeReference.qualifiedName,
			XGuiDslPackage$Literals::WIDGET__ATTR, IssueCodes::INCOMPATIBLE_TYPES)
	}
}
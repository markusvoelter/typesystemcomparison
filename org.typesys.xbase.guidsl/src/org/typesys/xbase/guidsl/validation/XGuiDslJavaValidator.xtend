package org.typesys.xbase.guidsl.validation

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xbase.validation.IssueCodes
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator
import org.typesys.xbase.guidsl.xGuiDsl.Attribute
import org.typesys.xbase.guidsl.xGuiDsl.CheckBoxWidget
import org.typesys.xbase.guidsl.xGuiDsl.DerivedAttribute
import org.typesys.xbase.guidsl.xGuiDsl.SimpleAttribute
import org.typesys.xbase.guidsl.xGuiDsl.TextWidget
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage$Literals

class XGuiDslJavaValidator extends XbaseJavaValidator {
	
	@Inject
	private ITypeProvider typeProvider;
	
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
	def public void checkTextWidgetForNonBoolean(TextWidget widget) {
		val JvmTypeReference jvmTypeReference = widget.attr.getTypeForAttribute
		if (jvmTypeReference == null) {
			return
		}
		if (jvmTypeReference.getQualifiedName().equals(Boolean::TYPE.getName())) {
			error("Textbox may NOT refer to boolean attributes.",
					XGuiDslPackage$Literals::WIDGET__ATTR, IssueCodes::INCOMPATIBLE_TYPES);
		}
	}

	def protected JvmTypeReference getTypeForAttribute(Attribute attr) {
		switch attr {
			SimpleAttribute : attr.getType()
			DerivedAttribute : typeProvider.getType(attr.getExpr())
			default: null
		}
	}

	/**
	 * 3) Checkbox widgets may only refer to boolean attributes.
	 */
	@Check
	def public void checkBoxWidgetOnlyBoolean(CheckBoxWidget widget) {
		val jvmTypeReference = widget.attr.getTypeForAttribute
		if (jvmTypeReference == null) {
			return;
		}
		if (!jvmTypeReference.getQualifiedName().equals(Boolean::TYPE.getName())) {
			error("Checkbox may only refer to boolean attributes, but found type "
					+ jvmTypeReference.getQualifiedName(),
					XGuiDslPackage$Literals::WIDGET__ATTR, IssueCodes::INCOMPATIBLE_TYPES);
		}
	}
	
}
package org.typesys.xbase.guidsl.validation;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator;
import org.typesys.xbase.guidsl.xGuiDsl.Attribute;
import org.typesys.xbase.guidsl.xGuiDsl.CheckBoxWidget;
import org.typesys.xbase.guidsl.xGuiDsl.DerivedAttribute;
import org.typesys.xbase.guidsl.xGuiDsl.SimpleAttribute;
import org.typesys.xbase.guidsl.xGuiDsl.TextWidget;
import org.typesys.xbase.guidsl.xGuiDsl.XGuiDslPackage;

import com.google.inject.Inject;

public class XGuiDslJavaValidator extends XbaseJavaValidator {
	
	@Inject
	private ITypeProvider typeProvider;
	
	@Inject JvmTypesBuilder jvmTypesBuilder;
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> packages = newArrayList(super.getEPackages());
		packages.add(XGuiDslPackage.eINSTANCE);
		return packages;
	}

	/**
	 * 1) The expression after "validate" must be boolean.
	 *  This is already covered by the XGuiDslJvmModelInferrer.
	 */
	
	/**
	 * 2) Text widgets may only refer to non-boolean attributes.
	 */
	@Check
	public void checkTextWidgetForNonBoolean(TextWidget widget) {
		Attribute attr = widget.getAttr();
		JvmTypeReference jvmTypeReference = getTypeForAttribute(attr);
		if (jvmTypeReference == null) {
			return;
		}
		if (jvmTypeReference.getQualifiedName().equals(Boolean.TYPE.getName())) {
			error("Textbox may NOT refer to boolean attributes.",
					XGuiDslPackage.Literals.WIDGET__ATTR, IssueCodes.INCOMPATIBLE_TYPES);
		}
	}

	protected JvmTypeReference getTypeForAttribute(Attribute attr) {
		JvmTypeReference jvmTypeReference = null;
		if (attr instanceof SimpleAttribute) {
			SimpleAttribute simpleAttribute = (SimpleAttribute) attr;
			jvmTypeReference = simpleAttribute.getType();
		} else if (attr instanceof DerivedAttribute) {
			DerivedAttribute derivedAttribute = (DerivedAttribute) attr;
			XExpression exprInGrammar = derivedAttribute.getExpr();
			jvmTypeReference = typeProvider.getType(exprInGrammar);
		}
		return jvmTypeReference;
	}

	/**
	 * 3) Checkbox widgets may only refer to boolean attributes.
	 */
	@Check
	public void checkBoxWidgetOnlyBoolean(CheckBoxWidget widget) {
		Attribute attr = widget.getAttr();
		JvmTypeReference jvmTypeReference = getTypeForAttribute(attr);
		if (jvmTypeReference == null) {
			return;
		}
		jvmTypeReference.getType();
		
		if (!jvmTypeReference.getQualifiedName().equals(Boolean.TYPE.getName())) {
			error("Checkbox may only refer to boolean attributes, but found type "
					+ jvmTypeReference.getQualifiedName(),
					XGuiDslPackage.Literals.WIDGET__ATTR, IssueCodes.INCOMPATIBLE_TYPES);
		}

	}

}

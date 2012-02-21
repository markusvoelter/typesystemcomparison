package org.typesys.xts.guidsl.typesys;

import org.eclipse.emf.ecore.EObject;
import de.itemis.xtext.typesystem.exceptions.TypesystemConfigurationException;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.characteristics.TypeCharacteristic;

public  abstract class GuiDlsTypesystemGenerated extends de.itemis.xtext.typesystem.DefaultTypesystem {

	protected org.typesys.xts.guidsl.guiDsl.GuiDslPackage p = org.typesys.xts.guidsl.guiDsl.GuiDslPackage.eINSTANCE;

	private TypeCharacteristic COMPARABLE = new TypeCharacteristic("COMPARABLE");
	private TypeCharacteristic NUMERIC = new TypeCharacteristic("NUMERIC");

	protected void initialize() {

		try {

			// ----------------------------------------------------------------
			// Section: Types



			// include subtypes! 
			useCloneAsType( p.getType() );
			useCloneAsType( p.getEntityType() );
			useCloneAsType( p.getPrimitiveType() );
			useCloneAsType( p.getFloatType() );
			useCloneAsType( p.getIntType() );
			useCloneAsType( p.getBooleanType() );
			useCloneAsType( p.getStringType() );
			// ------

			// ----------------------------------------------------------------
			// Section: Expressions


			declareCharacteristic(p.getIntType(), COMPARABLE);
			declareCharacteristic(p.getFloatType(), COMPARABLE);
			declareCharacteristic(p.getBooleanType(), COMPARABLE);
			declareCharacteristic(p.getStringType(), COMPARABLE);
			declareCharacteristic(p.getIntType(), NUMERIC);
			declareCharacteristic(p.getFloatType(), NUMERIC);

			declareSubtype( p.getFloatType(), p.getIntType());
			useFixedType( p.getEquals(), p.getBooleanType() );
			ensureFeatureType( p.getEquals(), p.getEquals_Left(), COMPARABLE );
			ensureFeatureType( p.getEquals(), p.getEquals_Right(), COMPARABLE );
			ensureUnorderedCompatibility( p.getEquals(), p.getEquals_Left(), p.getEquals_Right() );
			useFixedType( p.getUnequals(), p.getBooleanType() );
			ensureFeatureType( p.getUnequals(), p.getUnequals_Left(), COMPARABLE );
			ensureFeatureType( p.getUnequals(), p.getUnequals_Right(), COMPARABLE );
			ensureUnorderedCompatibility( p.getUnequals(), p.getUnequals_Left(), p.getUnequals_Right() );
			useFixedType( p.getGreater(), p.getBooleanType() );
			ensureFeatureType( p.getGreater(), p.getGreater_Left(), COMPARABLE );
			ensureFeatureType( p.getGreater(), p.getGreater_Right(), COMPARABLE );
			ensureUnorderedCompatibility( p.getGreater(), p.getGreater_Left(), p.getGreater_Right() );
			useFixedType( p.getSmaller(), p.getBooleanType() );
			ensureFeatureType( p.getSmaller(), p.getSmaller_Left(), COMPARABLE );
			ensureFeatureType( p.getSmaller(), p.getSmaller_Right(), COMPARABLE );
			ensureUnorderedCompatibility( p.getSmaller(), p.getSmaller_Left(), p.getSmaller_Right() );
			useFixedType( p.getGreaterEquals(), p.getBooleanType() );
			ensureFeatureType( p.getGreaterEquals(), p.getGreaterEquals_Left(), COMPARABLE );
			ensureFeatureType( p.getGreaterEquals(), p.getGreaterEquals_Right(), COMPARABLE );
			ensureUnorderedCompatibility( p.getGreaterEquals(), p.getGreaterEquals_Left(), p.getGreaterEquals_Right() );
			useFixedType( p.getSmallerEquals(), p.getBooleanType() );
			ensureFeatureType( p.getSmallerEquals(), p.getSmallerEquals_Left(), COMPARABLE );
			ensureFeatureType( p.getSmallerEquals(), p.getSmallerEquals_Right(), COMPARABLE );
			ensureUnorderedCompatibility( p.getSmallerEquals(), p.getSmallerEquals_Left(), p.getSmallerEquals_Right() );
			useFixedType( p.getLogicalAnd(), p.getBooleanType() );
			ensureFeatureType( p.getLogicalAnd(), p.getLogicalAnd_Left(), p.getBooleanType() );
			ensureFeatureType( p.getLogicalAnd(), p.getLogicalAnd_Right(), p.getBooleanType() );
			useFixedType( p.getLogicalOr(), p.getBooleanType() );
			ensureFeatureType( p.getLogicalOr(), p.getLogicalOr_Left(), p.getBooleanType() );
			ensureFeatureType( p.getLogicalOr(), p.getLogicalOr_Right(), p.getBooleanType() );
			computeCommonType( p.getPlus(), p.getPlus_Left(), p.getPlus_Right());
			ensureFeatureType( p.getPlus(), p.getPlus_Left(), p.getStringType(), NUMERIC );
			ensureFeatureType( p.getPlus(), p.getPlus_Right(), p.getStringType(), NUMERIC );
			computeCommonType( p.getMinus(), p.getMinus_Left(), p.getMinus_Right());
			ensureFeatureType( p.getMinus(), p.getMinus_Left(), NUMERIC );
			ensureFeatureType( p.getMinus(), p.getMinus_Right(), NUMERIC );
			computeCommonType( p.getMulti(), p.getMulti_Left(), p.getMulti_Right());
			ensureFeatureType( p.getMulti(), p.getMulti_Left(), NUMERIC );
			ensureFeatureType( p.getMulti(), p.getMulti_Right(), NUMERIC );
			useFixedType( p.getDiv(), p.getIntType() );
			ensureFeatureType( p.getDiv(), p.getDiv_Left(), NUMERIC );
			ensureFeatureType( p.getDiv(), p.getDiv_Right(), NUMERIC );
			useFixedType( p.getNotExpression(), p.getBooleanType() );
			ensureFeatureType( p.getNotExpression(), p.getNotExpression_Expr(), p.getBooleanType() );
			useFixedType( p.getImplies(), p.getBooleanType() );
			useTypeOfFeature( p.getParenExpr(), p.getParenExpr_Expr() );

			// ----------------------------------------------------------------
			// Section: Literals



			useFixedType( p.getStringLiteral(), p.getStringType() );
			useFixedType( p.getTrueExpr(), p.getBooleanType() );
			useFixedType( p.getFalseExpr(), p.getBooleanType() );

			// ----------------------------------------------------------------
			// Section: Special Stuff



			useTypeOfFeature( p.getAttributeRef(), p.getAttributeRef_Attr() );
			useFixedType( p.getlenghtOf(), p.getIntType() );
			useTypeOfFeature( p.getSimpleAttribute(), p.getSimpleAttribute_Type() );
			useTypeOfFeature( p.getDerivedAttribute(), p.getDerivedAttribute_Expr() );
			ensureFeatureType( p.getTextWidget(), p.getWidget_Attr(), p.getStringType(), p.getIntType(), p.getFloatType() );
			ensureFeatureType( p.getTextWidget(), p.getWidget_Validate(), p.getBooleanType() );
			ensureFeatureType( p.getCheckBoxWidget(), p.getWidget_Attr(), p.getBooleanType() );
			ensureFeatureType( p.getCheckBoxWidget(), p.getWidget_Validate(), p.getBooleanType() );

		} catch ( TypesystemConfigurationException ex ) {
			ex.printStackTrace();
		}
	}

	protected abstract EObject type( org.typesys.xts.guidsl.guiDsl.NumberLiteral element, TypeCalculationTrace trace );
	protected abstract EObject type( org.typesys.xts.guidsl.guiDsl.FieldContent element, TypeCalculationTrace trace );

}

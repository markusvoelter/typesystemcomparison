package org.typesys.xts.guidsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.typesys.xts.guidsl.guiDsl.AttributeRef;
import org.typesys.xts.guidsl.guiDsl.BooleanType;
import org.typesys.xts.guidsl.guiDsl.CheckBoxWidget;
import org.typesys.xts.guidsl.guiDsl.DerivedAttribute;
import org.typesys.xts.guidsl.guiDsl.Div;
import org.typesys.xts.guidsl.guiDsl.Entity;
import org.typesys.xts.guidsl.guiDsl.EntityType;
import org.typesys.xts.guidsl.guiDsl.Equals;
import org.typesys.xts.guidsl.guiDsl.FalseExpr;
import org.typesys.xts.guidsl.guiDsl.FieldContent;
import org.typesys.xts.guidsl.guiDsl.FloatType;
import org.typesys.xts.guidsl.guiDsl.Form;
import org.typesys.xts.guidsl.guiDsl.Greater;
import org.typesys.xts.guidsl.guiDsl.GreaterEquals;
import org.typesys.xts.guidsl.guiDsl.GuiDslPackage;
import org.typesys.xts.guidsl.guiDsl.Implies;
import org.typesys.xts.guidsl.guiDsl.IntType;
import org.typesys.xts.guidsl.guiDsl.LogicalAnd;
import org.typesys.xts.guidsl.guiDsl.LogicalOr;
import org.typesys.xts.guidsl.guiDsl.Minus;
import org.typesys.xts.guidsl.guiDsl.Model;
import org.typesys.xts.guidsl.guiDsl.Multi;
import org.typesys.xts.guidsl.guiDsl.NotExpression;
import org.typesys.xts.guidsl.guiDsl.NumberLiteral;
import org.typesys.xts.guidsl.guiDsl.ParenExpr;
import org.typesys.xts.guidsl.guiDsl.Plus;
import org.typesys.xts.guidsl.guiDsl.SimpleAttribute;
import org.typesys.xts.guidsl.guiDsl.Smaller;
import org.typesys.xts.guidsl.guiDsl.SmallerEquals;
import org.typesys.xts.guidsl.guiDsl.StringLiteral;
import org.typesys.xts.guidsl.guiDsl.StringType;
import org.typesys.xts.guidsl.guiDsl.TextWidget;
import org.typesys.xts.guidsl.guiDsl.TrueExpr;
import org.typesys.xts.guidsl.guiDsl.Unequals;
import org.typesys.xts.guidsl.guiDsl.lenghtOf;
import org.typesys.xts.guidsl.services.GuiDslGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractGuiDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected GuiDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GuiDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GuiDslPackage.ATTRIBUTE_REF:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Atomic(context, (AttributeRef) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getBooleanTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.CHECK_BOX_WIDGET:
				if(context == grammarAccess.getCheckBoxWidgetRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_CheckBoxWidget(context, (CheckBoxWidget) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.DERIVED_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getDerivedAttributeRule()) {
					sequence_DerivedAttribute(context, (DerivedAttribute) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.DIV:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0()) {
					sequence_MultiplicationLevel(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.ENTITY_TYPE:
				if(context == grammarAccess.getEntityTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.EQUALS:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (Equals) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.FALSE_EXPR:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Expr(context, (FalseExpr) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.FIELD_CONTENT:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Expr(context, (FieldContent) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.FLOAT_TYPE:
				if(context == grammarAccess.getFloatTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (FloatType) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.FORM:
				if(context == grammarAccess.getFormRule()) {
					sequence_Form(context, (Form) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.GREATER:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (Greater) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.GREATER_EQUALS:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (GreaterEquals) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.IMPLIES:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (Implies) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.INT_TYPE:
				if(context == grammarAccess.getIntTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.LOGICAL_AND:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (LogicalAnd) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.LOGICAL_OR:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (LogicalOr) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.MINUS:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_AdditionLevel(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.MULTI:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0()) {
					sequence_MultiplicationLevel(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.NOT_EXPRESSION:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_PrefixOpLevel(context, (NotExpression) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Atomic(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.PAREN_EXPR:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Atomic(context, (ParenExpr) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.PLUS:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_AdditionLevel(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.SIMPLE_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getSimpleAttributeRule()) {
					sequence_SimpleAttribute(context, (SimpleAttribute) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.SMALLER:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (Smaller) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.SMALLER_EQUALS:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (SmallerEquals) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Atomic(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.STRING_TYPE:
				if(context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.TEXT_WIDGET:
				if(context == grammarAccess.getTextWidgetRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_TextWidget(context, (TextWidget) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.TRUE_EXPR:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Expr(context, (TrueExpr) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.UNEQUALS:
				if(context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ComparisonLevel(context, (Unequals) semanticObject); 
					return; 
				}
				else break;
			case GuiDslPackage.LENGHT_OF:
				if(context == grammarAccess.getAdditionLevelRule() ||
				   context == grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonLevelRule() ||
				   context == grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0() ||
				   context == grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationLevelRule() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixOpLevelRule()) {
					sequence_Atomic(context, (lenghtOf) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AdditionLevel_Minus_1_0_1_0 right=MultiplicationLevel)
	 */
	protected void sequence_AdditionLevel(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionLevelAccess().getRightMultiplicationLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditionLevel_Plus_1_0_0_0 right=MultiplicationLevel)
	 */
	protected void sequence_AdditionLevel(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionLevelAccess().getRightMultiplicationLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     attr=[Attribute|ID]
	 */
	protected void sequence_Atomic(EObject context, AttributeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.ATTRIBUTE_REF__ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.ATTRIBUTE_REF__ATTR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getAttrAttributeIDTerminalRuleCall_7_1_0_1(), semanticObject.getAttr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DECIMAL_NUMBER
	 */
	protected void sequence_Atomic(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDECIMAL_NUMBERTerminalRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Atomic(EObject context, ParenExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.PAREN_EXPR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.PAREN_EXPR__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_4_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_6_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Atomic(EObject context, lenghtOf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.LENGHT_OF__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.LENGHT_OF__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_3_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attr=[Attribute|ID] validate=Expr?)
	 */
	protected void sequence_CheckBoxWidget(EObject context, CheckBoxWidget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_Equals_1_0_0_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, Equals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_Greater_1_0_2_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, Greater semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.GREATER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.GREATER__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.GREATER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.GREATER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_GreaterEquals_1_0_3_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, GreaterEquals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.GREATER_EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.GREATER_EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.GREATER_EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.GREATER_EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_Implies_1_0_6_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, Implies semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.IMPLIES__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.IMPLIES__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.IMPLIES__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.IMPLIES__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_LogicalAnd_1_0_5_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, LogicalAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.LOGICAL_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.LOGICAL_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.LOGICAL_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.LOGICAL_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_LogicalOr_1_0_7_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, LogicalOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.LOGICAL_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.LOGICAL_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.LOGICAL_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.LOGICAL_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_Smaller_1_0_8_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, Smaller semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.SMALLER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.SMALLER__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.SMALLER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.SMALLER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_SmallerEquals_1_0_4_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, SmallerEquals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.SMALLER_EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.SMALLER_EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.SMALLER_EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.SMALLER_EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonLevel_Unequals_1_0_1_0 right=AdditionLevel)
	 */
	protected void sequence_ComparisonLevel(EObject context, Unequals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.UNEQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.UNEQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.UNEQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.UNEQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=Expr)
	 */
	protected void sequence_DerivedAttribute(EObject context, DerivedAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.DERIVED_ATTRIBUTE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.DERIVED_ATTRIBUTE__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDerivedAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDerivedAttributeAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Entity|ID]
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.ENTITY_TYPE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.ENTITY_TYPE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityTypeAccess().getRefEntityIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FalseExpr}
	 */
	protected void sequence_Expr(EObject context, FalseExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FieldContent}
	 */
	protected void sequence_Expr(EObject context, FieldContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TrueExpr}
	 */
	protected void sequence_Expr(EObject context, TrueExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entity=[Entity|ID] widgets+=Widget*)
	 */
	protected void sequence_Form(EObject context, Form semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entities+=Entity | forms+=Form)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationLevel_Div_1_0_1_0 right=PrefixOpLevel)
	 */
	protected void sequence_MultiplicationLevel(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationLevelAccess().getRightPrefixOpLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationLevel_Multi_1_0_0_0 right=PrefixOpLevel)
	 */
	protected void sequence_MultiplicationLevel(EObject context, Multi semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.MULTI__LEFT));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.MULTI__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationLevelAccess().getRightPrefixOpLevelParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_PrefixOpLevel(EObject context, NotExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.NOT_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.NOT_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixOpLevelAccess().getExprExprParserRuleCall_0_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_SimpleAttribute(EObject context, SimpleAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, GuiDslPackage.Literals.SIMPLE_ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuiDslPackage.Literals.SIMPLE_ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimpleAttributeAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (length=DECIMAL_NUMBER attr=[Attribute|ID] validate=Expr?)
	 */
	protected void sequence_TextWidget(EObject context, TextWidget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BooleanType}
	 */
	protected void sequence_Type(EObject context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatType}
	 */
	protected void sequence_Type(EObject context, FloatType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_Type(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringType}
	 */
	protected void sequence_Type(EObject context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

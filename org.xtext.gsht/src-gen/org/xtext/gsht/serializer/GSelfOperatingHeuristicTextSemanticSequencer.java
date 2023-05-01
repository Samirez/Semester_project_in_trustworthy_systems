/*
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.gsht.gSelfOperatingHeuristicText.Alter;
import org.xtext.gsht.gSelfOperatingHeuristicText.Assignment;
import org.xtext.gsht.gSelfOperatingHeuristicText.Automaton;
import org.xtext.gsht.gSelfOperatingHeuristicText.Condition;
import org.xtext.gsht.gSelfOperatingHeuristicText.Event;
import org.xtext.gsht.gSelfOperatingHeuristicText.GSelfOperatingHeuristicTextPackage;
import org.xtext.gsht.gSelfOperatingHeuristicText.Global;
import org.xtext.gsht.gSelfOperatingHeuristicText.InitState;
import org.xtext.gsht.gSelfOperatingHeuristicText.Local;
import org.xtext.gsht.gSelfOperatingHeuristicText.Model;
import org.xtext.gsht.gSelfOperatingHeuristicText.State;
import org.xtext.gsht.gSelfOperatingHeuristicText.Transition;
import org.xtext.gsht.gSelfOperatingHeuristicText.VariableReference;
import org.xtext.gsht.services.GSelfOperatingHeuristicTextGrammarAccess;

@SuppressWarnings("all")
public class GSelfOperatingHeuristicTextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GSelfOperatingHeuristicTextGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GSelfOperatingHeuristicTextPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GSelfOperatingHeuristicTextPackage.ALTER:
				sequence_Alter(context, (Alter) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.AUTOMATON:
				sequence_Automaton(context, (Automaton) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.GLOBAL:
				sequence_Global(context, (Global) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.INIT_STATE:
				sequence_Initial(context, (InitState) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.LOCAL:
				sequence_Local(context, (Local) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case GSelfOperatingHeuristicTextPackage.VARIABLE_REFERENCE:
				sequence_VariableReference(context, (VariableReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Alter returns Alter
	 *
	 * Constraint:
	 *     (state=[State|ID] locals+=Local* transitions+=Transition*)
	 * </pre>
	 */
	protected void sequence_Alter(ISerializationContext context, Alter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (currentVar=VariableReference value=Value)
	 * </pre>
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.ASSIGNMENT__CURRENT_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.ASSIGNMENT__CURRENT_VAR));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.ASSIGNMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getCurrentVarVariableReferenceParserRuleCall_0_0(), semanticObject.getCurrentVar());
		feeder.accept(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Automaton returns Automaton
	 *
	 * Constraint:
	 *     (name=ID states+=[State|ID]*)
	 * </pre>
	 */
	protected void sequence_Automaton(ISerializationContext context, Automaton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (left=VariableReference operator=ComparisonOperator right=Value)
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.CONDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.CONDITION__LEFT));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.CONDITION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.CONDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.CONDITION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getLeftVariableReferenceParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getConditionAccess().getRightValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.EVENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Global returns Global
	 *     Variable returns Global
	 *
	 * Constraint:
	 *     (name=ID type=DataType value=Value)
	 * </pre>
	 */
	protected void sequence_Global(ISerializationContext context, Global semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGlobalAccess().getTypeDataTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGlobalAccess().getValueValueParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Initial returns InitState
	 *
	 * Constraint:
	 *     {InitState}
	 * </pre>
	 */
	protected void sequence_Initial(ISerializationContext context, InitState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Local returns Local
	 *     Variable returns Local
	 *
	 * Constraint:
	 *     (name=ID type=DataType value=Value)
	 * </pre>
	 */
	protected void sequence_Local(ISerializationContext context, Local semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLocalAccess().getTypeDataTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getLocalAccess().getValueValueParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID globals+=Global* events+=Event* (states+=State | alters+=Alter)* automaton+=Automaton*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (init?=Initial? name=ID locals+=Local* transitions+=Transition*)
	 * </pre>
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (event=[Event|ID] state=[State|ID] condition=Condition? assignment=Assignment?)
	 * </pre>
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VariableReference returns VariableReference
	 *
	 * Constraint:
	 *     variable=[Variable|ID]
	 * </pre>
	 */
	protected void sequence_VariableReference(ISerializationContext context, VariableReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE_REFERENCE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GSelfOperatingHeuristicTextPackage.Literals.VARIABLE_REFERENCE__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1(), semanticObject.eGet(GSelfOperatingHeuristicTextPackage.Literals.VARIABLE_REFERENCE__VARIABLE, false));
		feeder.finish();
	}
	
	
}

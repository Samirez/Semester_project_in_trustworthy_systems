/*
 * generated by Xtext 2.30.0
 */
grammar InternalGSelfOperatingHeuristicText;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.gsht.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.gsht.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.gsht.services.GSelfOperatingHeuristicTextGrammarAccess;

}

@parser::members {

 	private GSelfOperatingHeuristicTextGrammarAccess grammarAccess;

    public InternalGSelfOperatingHeuristicTextParser(TokenStream input, GSelfOperatingHeuristicTextGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected GSelfOperatingHeuristicTextGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='DRONE'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDRONEKeyword_0_0());
			}
			    |
			otherlv_1='drone'
			{
				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDroneKeyword_0_1());
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				otherlv_3='GLOBAL'
				{
					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0());
				}
				    |
				otherlv_4='global'
				{
					newLeafNode(otherlv_4, grammarAccess.getModelAccess().getGlobalKeyword_2_0_1());
				}
			)
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getGlobalsGlobalParserRuleCall_2_2_0());
					}
					lv_globals_6_0=ruleGlobal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"globals",
							lv_globals_6_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Global");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
		(
			(
				otherlv_8='EVENTS'
				{
					newLeafNode(otherlv_8, grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0());
				}
				    |
				otherlv_9='events'
				{
					newLeafNode(otherlv_9, grammarAccess.getModelAccess().getEventsKeyword_3_0_1());
				}
			)*
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0());
					}
					lv_events_11_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"events",
							lv_events_11_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3());
			}
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getStatesStateParserRuleCall_4_0_0());
					}
					lv_states_13_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"states",
							lv_states_13_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAltersAlterParserRuleCall_4_1_0());
					}
					lv_alters_14_0=ruleAlter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"alters",
							lv_alters_14_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Alter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getAutomatonAutomatonParserRuleCall_5_0());
				}
				lv_automaton_15_0=ruleAutomaton
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"automaton",
						lv_automaton_15_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.Automaton");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleGlobal
entryRuleGlobal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGlobalRule()); }
	iv_ruleGlobal=ruleGlobal
	{ $current=$iv_ruleGlobal.current; }
	EOF;

// Rule Global
ruleGlobal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getGlobalAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGlobalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1='AS'
			{
				newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getASKeyword_1_0());
			}
			    |
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getGlobalAccess().getAsKeyword_1_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGlobalAccess().getTypeDataTypeEnumRuleCall_2_0());
				}
				lv_type_3_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGlobalRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getGlobalAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getGlobalAccess().getValueSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGlobalRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleLocal
entryRuleLocal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocalRule()); }
	iv_ruleLocal=ruleLocal
	{ $current=$iv_ruleLocal.current; }
	EOF;

// Rule Local
ruleLocal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLocalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1='AS'
			{
				newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getASKeyword_1_0());
			}
			    |
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getLocalAccess().getAsKeyword_1_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLocalAccess().getTypeDataTypeEnumRuleCall_2_0());
				}
				lv_type_3_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocalRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getLocalAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getLocalAccess().getValueSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLocalRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='STATE'
			{
				newLeafNode(otherlv_0, grammarAccess.getStateAccess().getSTATEKeyword_0_0());
			}
			    |
			otherlv_1='state'
			{
				newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_0_1());
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				otherlv_3='PROPS'
				{
					newLeafNode(otherlv_3, grammarAccess.getStateAccess().getPROPSKeyword_2_0_0());
				}
				    |
				otherlv_4='props'
				{
					newLeafNode(otherlv_4, grammarAccess.getStateAccess().getPropsKeyword_2_0_1());
				}
			)
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getLocalsLocalParserRuleCall_2_2_0());
					}
					lv_locals_6_0=ruleLocal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"locals",
							lv_locals_6_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Local");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
		(
			(
				otherlv_8='TRANSITIONS'
				{
					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getTRANSITIONSKeyword_3_0_0());
				}
				    |
				otherlv_9='transitions'
				{
					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getTransitionsKeyword_3_0_1());
				}
			)
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_2_0());
					}
					lv_transitions_11_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"transitions",
							lv_transitions_11_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
			}
		)?
	)
;

// Entry rule entryRuleAlter
entryRuleAlter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlterRule()); }
	iv_ruleAlter=ruleAlter
	{ $current=$iv_ruleAlter.current; }
	EOF;

// Rule Alter
ruleAlter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='ALTER'
			{
				newLeafNode(otherlv_0, grammarAccess.getAlterAccess().getALTERKeyword_0_0());
			}
			    |
			otherlv_1='alter'
			{
				newLeafNode(otherlv_1, grammarAccess.getAlterAccess().getAlterKeyword_0_1());
			}
		)
		(
			otherlv_2='STATE'
			{
				newLeafNode(otherlv_2, grammarAccess.getAlterAccess().getSTATEKeyword_1_0());
			}
			    |
			otherlv_3='state'
			{
				newLeafNode(otherlv_3, grammarAccess.getAlterAccess().getStateKeyword_1_1());
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlterRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getAlterAccess().getStateStateCrossReference_2_0());
				}
			)
		)
		(
			(
				otherlv_5='PROPS'
				{
					newLeafNode(otherlv_5, grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0());
				}
				    |
				otherlv_6='props'
				{
					newLeafNode(otherlv_6, grammarAccess.getAlterAccess().getPropsKeyword_3_0_1());
				}
			)
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAlterAccess().getLocalsLocalParserRuleCall_3_2_0());
					}
					lv_locals_8_0=ruleLocal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAlterRule());
						}
						add(
							$current,
							"locals",
							lv_locals_8_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Local");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3());
			}
		)?
		(
			(
				otherlv_10='TRANSITIONS'
				{
					newLeafNode(otherlv_10, grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0());
				}
				    |
				otherlv_11='transitions'
				{
					newLeafNode(otherlv_11, grammarAccess.getAlterAccess().getTransitionsKeyword_4_0_1());
				}
			)
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAlterAccess().getTransitionsTransitionParserRuleCall_4_2_0());
					}
					lv_transitions_13_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAlterRule());
						}
						add(
							$current,
							"transitions",
							lv_transitions_13_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='ON'
			{
				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getONKeyword_0_0());
			}
			    |
			otherlv_1='on'
			{
				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getOnKeyword_0_1());
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0());
				}
			)
		)
		(
			otherlv_3='TO'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTOKeyword_2_0());
			}
			    |
			otherlv_4='to'
			{
				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getToKeyword_2_1());
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
				}
			)
		)
		(
			(
				otherlv_6='IF'
				{
					newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getIFKeyword_4_0_0());
				}
				    |
				otherlv_7='if'
				{
					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getIfKeyword_4_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_4_1_0());
					}
					lv_condition_8_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"condition",
							lv_condition_8_0,
							"org.xtext.gsht.GSelfOperatingHeuristicText.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					otherlv_9='SET'
					{
						newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0());
					}
					    |
					otherlv_10='set'
					{
						newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSetKeyword_4_2_0_1());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getTransitionAccess().getAssignmentAssignmentParserRuleCall_4_2_1_0());
						}
						lv_assignment_11_0=ruleAssignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTransitionRule());
							}
							set(
								$current,
								"assignment",
								lv_assignment_11_0,
								"org.xtext.gsht.GSelfOperatingHeuristicText.Assignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)?
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEventRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getLeftVariableReferenceParserRuleCall_0_0());
				}
				lv_left_0_0=ruleVariableReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.VariableReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0());
				}
				lv_operator_1_0=ruleComparisonOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"operator",
						lv_operator_1_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.ComparisonOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getRightValueParserRuleCall_2_0());
				}
				lv_right_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getCurrentVarVariableReferenceParserRuleCall_0_0());
				}
				lv_currentVar_0_0=ruleVariableReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"currentVar",
						lv_currentVar_0_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.VariableReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0());
				}
				lv_value_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariableReference
entryRuleVariableReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableReferenceRule()); }
	iv_ruleVariableReference=ruleVariableReference
	{ $current=$iv_ruleVariableReference.current; }
	EOF;

// Rule VariableReference
ruleVariableReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current.getText(); }
	EOF;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_BOOL_0=RULE_BOOL
		{
			$current.merge(this_BOOL_0);
		}
		{
			newLeafNode(this_BOOL_0, grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getValueAccess().getINTTerminalRuleCall_2());
		}
		    |
		this_DOUBLE_3=RULE_DOUBLE
		{
			$current.merge(this_DOUBLE_3);
		}
		{
			newLeafNode(this_DOUBLE_3, grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleAutomaton
entryRuleAutomaton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAutomatonRule()); }
	iv_ruleAutomaton=ruleAutomaton
	{ $current=$iv_ruleAutomaton.current; }
	EOF;

// Rule Automaton
ruleAutomaton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='AUTOMATON'
			{
				newLeafNode(otherlv_0, grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0());
			}
			    |
			otherlv_1='automaton'
			{
				newLeafNode(otherlv_1, grammarAccess.getAutomatonAccess().getAutomatonKeyword_0_1());
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAutomatonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAutomatonAccess().getLocationLocationParserRuleCall_3_0());
				}
				lv_location_4_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAutomatonRule());
					}
					add(
						$current,
						"location",
						lv_location_4_0,
						"org.xtext.gsht.GSelfOperatingHeuristicText.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLocation
entryRuleLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	iv_ruleLocation=ruleLocation
	{ $current=$iv_ruleLocation.current; }
	EOF;

// Rule Location
ruleLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLocationRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getStateStateCrossReference_0());
			}
		)
	)
;

// Rule DataType
ruleDataType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='??'
			{
				$current = grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='int'
			{
				$current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='boolean'
			{
				$current = grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='double'
			{
				$current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='String'
			{
				$current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule ComparisonOperator
ruleComparisonOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='\u00A4\u00A4'
			{
				$current = grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='=='
			{
				$current = grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='>'
			{
				$current = grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='<'
			{
				$current = grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='>='
			{
				$current = grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='<='
			{
				$current = grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6());
			}
		)
	)
;

RULE_INT : ('0'..'9')+;

RULE_BOOL : (('TRUE'|'true'|'True')|('FALSE'|'false'|'False'));

RULE_DOUBLE : ('0'..'9')+ '.' ('0'..'9')* (('E'|'e') ('+'|'-')? ('0'..'9')+)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

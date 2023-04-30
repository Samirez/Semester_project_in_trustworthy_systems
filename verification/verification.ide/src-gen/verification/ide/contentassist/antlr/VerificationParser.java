/*
 * generated by Xtext 2.30.0
 */
package verification.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import verification.ide.contentassist.antlr.internal.InternalVerificationParser;
import verification.services.VerificationGrammarAccess;

public class VerificationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VerificationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VerificationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives_0(), "rule__Model__Alternatives_0");
			builder.put(grammarAccess.getModelAccess().getAlternatives_2_0(), "rule__Model__Alternatives_2_0");
			builder.put(grammarAccess.getModelAccess().getAlternatives_3_0(), "rule__Model__Alternatives_3_0");
			builder.put(grammarAccess.getModelAccess().getAlternatives_4(), "rule__Model__Alternatives_4");
			builder.put(grammarAccess.getGlobalAccess().getAlternatives_1(), "rule__Global__Alternatives_1");
			builder.put(grammarAccess.getLocalAccess().getAlternatives_1(), "rule__Local__Alternatives_1");
			builder.put(grammarAccess.getStateAccess().getAlternatives_0(), "rule__State__Alternatives_0");
			builder.put(grammarAccess.getStateAccess().getAlternatives_2_0(), "rule__State__Alternatives_2_0");
			builder.put(grammarAccess.getStateAccess().getAlternatives_3_0(), "rule__State__Alternatives_3_0");
			builder.put(grammarAccess.getAlterAccess().getAlternatives_0(), "rule__Alter__Alternatives_0");
			builder.put(grammarAccess.getAlterAccess().getAlternatives_1(), "rule__Alter__Alternatives_1");
			builder.put(grammarAccess.getAlterAccess().getAlternatives_3_0(), "rule__Alter__Alternatives_3_0");
			builder.put(grammarAccess.getAlterAccess().getAlternatives_4_0(), "rule__Alter__Alternatives_4_0");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives_0(), "rule__Transition__Alternatives_0");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives_2(), "rule__Transition__Alternatives_2");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives_4_0(), "rule__Transition__Alternatives_4_0");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives_4_2_0(), "rule__Transition__Alternatives_4_2_0");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getAutomatonAccess().getAlternatives_0(), "rule__Automaton__Alternatives_0");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_2(), "rule__Model__Group_2__0");
			builder.put(grammarAccess.getModelAccess().getGroup_3(), "rule__Model__Group_3__0");
			builder.put(grammarAccess.getGlobalAccess().getGroup(), "rule__Global__Group__0");
			builder.put(grammarAccess.getGlobalAccess().getGroup_3(), "rule__Global__Group_3__0");
			builder.put(grammarAccess.getLocalAccess().getGroup(), "rule__Local__Group__0");
			builder.put(grammarAccess.getLocalAccess().getGroup_3(), "rule__Local__Group_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup_2(), "rule__State__Group_2__0");
			builder.put(grammarAccess.getStateAccess().getGroup_3(), "rule__State__Group_3__0");
			builder.put(grammarAccess.getAlterAccess().getGroup(), "rule__Alter__Group__0");
			builder.put(grammarAccess.getAlterAccess().getGroup_3(), "rule__Alter__Group_3__0");
			builder.put(grammarAccess.getAlterAccess().getGroup_4(), "rule__Alter__Group_4__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_4(), "rule__Transition__Group_4__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_4_2(), "rule__Transition__Group_4_2__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getAutomatonAccess().getGroup(), "rule__Automaton__Group__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getGlobalsAssignment_2_2(), "rule__Model__GlobalsAssignment_2_2");
			builder.put(grammarAccess.getModelAccess().getEventsAssignment_3_2(), "rule__Model__EventsAssignment_3_2");
			builder.put(grammarAccess.getModelAccess().getStatesAssignment_4_0(), "rule__Model__StatesAssignment_4_0");
			builder.put(grammarAccess.getModelAccess().getAltersAssignment_4_1(), "rule__Model__AltersAssignment_4_1");
			builder.put(grammarAccess.getModelAccess().getAutomatonAssignment_5(), "rule__Model__AutomatonAssignment_5");
			builder.put(grammarAccess.getGlobalAccess().getNameAssignment_0(), "rule__Global__NameAssignment_0");
			builder.put(grammarAccess.getGlobalAccess().getTypeAssignment_2(), "rule__Global__TypeAssignment_2");
			builder.put(grammarAccess.getGlobalAccess().getValueAssignment_3_1(), "rule__Global__ValueAssignment_3_1");
			builder.put(grammarAccess.getLocalAccess().getNameAssignment_0(), "rule__Local__NameAssignment_0");
			builder.put(grammarAccess.getLocalAccess().getTypeAssignment_2(), "rule__Local__TypeAssignment_2");
			builder.put(grammarAccess.getLocalAccess().getValueAssignment_3_1(), "rule__Local__ValueAssignment_3_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
			builder.put(grammarAccess.getStateAccess().getLocalsAssignment_2_2(), "rule__State__LocalsAssignment_2_2");
			builder.put(grammarAccess.getStateAccess().getTransitionsAssignment_3_2(), "rule__State__TransitionsAssignment_3_2");
			builder.put(grammarAccess.getAlterAccess().getStateAssignment_2(), "rule__Alter__StateAssignment_2");
			builder.put(grammarAccess.getAlterAccess().getLocalsAssignment_3_2(), "rule__Alter__LocalsAssignment_3_2");
			builder.put(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2(), "rule__Alter__TransitionsAssignment_4_2");
			builder.put(grammarAccess.getTransitionAccess().getEventAssignment_1(), "rule__Transition__EventAssignment_1");
			builder.put(grammarAccess.getTransitionAccess().getStateAssignment_3(), "rule__Transition__StateAssignment_3");
			builder.put(grammarAccess.getTransitionAccess().getConditionAssignment_4_1(), "rule__Transition__ConditionAssignment_4_1");
			builder.put(grammarAccess.getTransitionAccess().getAssignmentAssignment_4_2_1(), "rule__Transition__AssignmentAssignment_4_2_1");
			builder.put(grammarAccess.getEventAccess().getNameAssignment(), "rule__Event__NameAssignment");
			builder.put(grammarAccess.getConditionAccess().getLeftAssignment_0(), "rule__Condition__LeftAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_1(), "rule__Condition__OperatorAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getRightAssignment_2(), "rule__Condition__RightAssignment_2");
			builder.put(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0(), "rule__Assignment__CurrentVarAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
			builder.put(grammarAccess.getVariableReferenceAccess().getVariableAssignment(), "rule__VariableReference__VariableAssignment");
			builder.put(grammarAccess.getAutomatonAccess().getNameAssignment_1(), "rule__Automaton__NameAssignment_1");
			builder.put(grammarAccess.getAutomatonAccess().getLocationAssignment_3(), "rule__Automaton__LocationAssignment_3");
			builder.put(grammarAccess.getLocationAccess().getStateAssignment(), "rule__Location__StateAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VerificationGrammarAccess grammarAccess;

	@Override
	protected InternalVerificationParser createParser() {
		InternalVerificationParser result = new InternalVerificationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VerificationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VerificationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
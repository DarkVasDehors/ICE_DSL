/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalFsmParser;
import org.xtext.example.mydsl.services.FsmGrammarAccess;

public class FsmParser extends AbstractContentAssistParser {

	@Inject
	private FsmGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFsmParser createParser() {
		InternalFsmParser result = new InternalFsmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStateMachineAccess().getAlternatives_4(), "rule__StateMachine__Alternatives_4");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getStateMachineAccess().getNameAssignment_2(), "rule__StateMachine__NameAssignment_2");
					put(grammarAccess.getStateMachineAccess().getStateAssignment_4_0(), "rule__StateMachine__StateAssignment_4_0");
					put(grammarAccess.getStateMachineAccess().getTransitionAssignment_4_1(), "rule__StateMachine__TransitionAssignment_4_1");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getDefaultAssignment_3(), "rule__State__DefaultAssignment_3");
					put(grammarAccess.getTransitionAccess().getNameAssignment_2(), "rule__Transition__NameAssignment_2");
					put(grammarAccess.getTransitionAccess().getFromAssignment_4(), "rule__Transition__FromAssignment_4");
					put(grammarAccess.getTransitionAccess().getToAssignment_6(), "rule__Transition__ToAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

/*
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.gsht.parser.antlr.internal.InternalGSelfOperatingHeuristicTextParser;
import org.xtext.gsht.services.GSelfOperatingHeuristicTextGrammarAccess;

public class GSelfOperatingHeuristicTextParser extends AbstractAntlrParser {

	@Inject
	private GSelfOperatingHeuristicTextGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGSelfOperatingHeuristicTextParser createParser(XtextTokenStream stream) {
		return new InternalGSelfOperatingHeuristicTextParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public GSelfOperatingHeuristicTextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GSelfOperatingHeuristicTextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

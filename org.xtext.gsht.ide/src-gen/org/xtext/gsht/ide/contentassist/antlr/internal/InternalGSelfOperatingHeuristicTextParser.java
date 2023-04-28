package org.xtext.gsht.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.gsht.services.GSelfOperatingHeuristicTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSelfOperatingHeuristicTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DRONE'", "'drone'", "'GLOBAL'", "'global'", "'EVENTS'", "'events'", "'AS'", "'as'", "'STATE'", "'state'", "'PROPS'", "'props'", "'TRANSITIONS'", "'transitions'", "'ALTER'", "'alter'", "'ON'", "'on'", "'TO'", "'to'", "'IF'", "'if'", "'SET'", "'set'", "'AUTOMATON'", "'automaton'", "'??'", "'int'", "'boolean'", "'double'", "'String'", "'\\u00A4\\u00A4'", "'!='", "'=='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", "'='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGSelfOperatingHeuristicTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGSelfOperatingHeuristicTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGSelfOperatingHeuristicTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGSelfOperatingHeuristicText.g"; }


    	private GSelfOperatingHeuristicTextGrammarAccess grammarAccess;

    	public void setGrammarAccess(GSelfOperatingHeuristicTextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGSelfOperatingHeuristicText.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:54:1: ( ruleModel EOF )
            // InternalGSelfOperatingHeuristicText.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGSelfOperatingHeuristicText.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:69:3: ( rule__Model__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGlobal"
    // InternalGSelfOperatingHeuristicText.g:78:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:79:1: ( ruleGlobal EOF )
            // InternalGSelfOperatingHeuristicText.g:80:1: ruleGlobal EOF
            {
             before(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getGlobalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalGSelfOperatingHeuristicText.g:87:1: ruleGlobal : ( ( rule__Global__Group__0 ) ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:91:2: ( ( ( rule__Global__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:92:2: ( ( rule__Global__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:92:2: ( ( rule__Global__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:93:3: ( rule__Global__Group__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:94:3: ( rule__Global__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:94:4: rule__Global__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleLocal"
    // InternalGSelfOperatingHeuristicText.g:103:1: entryRuleLocal : ruleLocal EOF ;
    public final void entryRuleLocal() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:104:1: ( ruleLocal EOF )
            // InternalGSelfOperatingHeuristicText.g:105:1: ruleLocal EOF
            {
             before(grammarAccess.getLocalRule()); 
            pushFollow(FOLLOW_1);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getLocalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocal"


    // $ANTLR start "ruleLocal"
    // InternalGSelfOperatingHeuristicText.g:112:1: ruleLocal : ( ( rule__Local__Group__0 ) ) ;
    public final void ruleLocal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:116:2: ( ( ( rule__Local__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:117:2: ( ( rule__Local__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:117:2: ( ( rule__Local__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:118:3: ( rule__Local__Group__0 )
            {
             before(grammarAccess.getLocalAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:119:3: ( rule__Local__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:119:4: rule__Local__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Local__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleState"
    // InternalGSelfOperatingHeuristicText.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:129:1: ( ruleState EOF )
            // InternalGSelfOperatingHeuristicText.g:130:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGSelfOperatingHeuristicText.g:137:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:141:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:142:2: ( ( rule__State__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:142:2: ( ( rule__State__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:143:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:144:3: ( rule__State__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:144:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAlter"
    // InternalGSelfOperatingHeuristicText.g:153:1: entryRuleAlter : ruleAlter EOF ;
    public final void entryRuleAlter() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:154:1: ( ruleAlter EOF )
            // InternalGSelfOperatingHeuristicText.g:155:1: ruleAlter EOF
            {
             before(grammarAccess.getAlterRule()); 
            pushFollow(FOLLOW_1);
            ruleAlter();

            state._fsp--;

             after(grammarAccess.getAlterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlter"


    // $ANTLR start "ruleAlter"
    // InternalGSelfOperatingHeuristicText.g:162:1: ruleAlter : ( ( rule__Alter__Group__0 ) ) ;
    public final void ruleAlter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:166:2: ( ( ( rule__Alter__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:167:2: ( ( rule__Alter__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:167:2: ( ( rule__Alter__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:168:3: ( rule__Alter__Group__0 )
            {
             before(grammarAccess.getAlterAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:169:3: ( rule__Alter__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:169:4: rule__Alter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlter"


    // $ANTLR start "entryRuleTransition"
    // InternalGSelfOperatingHeuristicText.g:178:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:179:1: ( ruleTransition EOF )
            // InternalGSelfOperatingHeuristicText.g:180:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalGSelfOperatingHeuristicText.g:187:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:191:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:192:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:192:2: ( ( rule__Transition__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:193:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:194:3: ( rule__Transition__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:194:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalGSelfOperatingHeuristicText.g:203:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:204:1: ( ruleEvent EOF )
            // InternalGSelfOperatingHeuristicText.g:205:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalGSelfOperatingHeuristicText.g:212:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:216:2: ( ( ( rule__Event__NameAssignment ) ) )
            // InternalGSelfOperatingHeuristicText.g:217:2: ( ( rule__Event__NameAssignment ) )
            {
            // InternalGSelfOperatingHeuristicText.g:217:2: ( ( rule__Event__NameAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:218:3: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // InternalGSelfOperatingHeuristicText.g:219:3: ( rule__Event__NameAssignment )
            // InternalGSelfOperatingHeuristicText.g:219:4: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalGSelfOperatingHeuristicText.g:228:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:229:1: ( ruleCondition EOF )
            // InternalGSelfOperatingHeuristicText.g:230:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGSelfOperatingHeuristicText.g:237:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:241:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:242:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:242:2: ( ( rule__Condition__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:243:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:244:3: ( rule__Condition__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:244:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAssignment"
    // InternalGSelfOperatingHeuristicText.g:253:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:254:1: ( ruleAssignment EOF )
            // InternalGSelfOperatingHeuristicText.g:255:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalGSelfOperatingHeuristicText.g:262:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:266:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:267:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:267:2: ( ( rule__Assignment__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:268:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:269:3: ( rule__Assignment__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:269:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVariableReference"
    // InternalGSelfOperatingHeuristicText.g:278:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:279:1: ( ruleVariableReference EOF )
            // InternalGSelfOperatingHeuristicText.g:280:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalGSelfOperatingHeuristicText.g:287:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:291:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // InternalGSelfOperatingHeuristicText.g:292:2: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // InternalGSelfOperatingHeuristicText.g:292:2: ( ( rule__VariableReference__VariableAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:293:3: ( rule__VariableReference__VariableAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            // InternalGSelfOperatingHeuristicText.g:294:3: ( rule__VariableReference__VariableAssignment )
            // InternalGSelfOperatingHeuristicText.g:294:4: rule__VariableReference__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableReference__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleValue"
    // InternalGSelfOperatingHeuristicText.g:303:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:304:1: ( ruleValue EOF )
            // InternalGSelfOperatingHeuristicText.g:305:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGSelfOperatingHeuristicText.g:312:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:316:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:317:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:317:2: ( ( rule__Value__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:318:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:319:3: ( rule__Value__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:319:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAutomaton"
    // InternalGSelfOperatingHeuristicText.g:328:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:329:1: ( ruleAutomaton EOF )
            // InternalGSelfOperatingHeuristicText.g:330:1: ruleAutomaton EOF
            {
             before(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_1);
            ruleAutomaton();

            state._fsp--;

             after(grammarAccess.getAutomatonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalGSelfOperatingHeuristicText.g:337:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:341:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:342:2: ( ( rule__Automaton__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:342:2: ( ( rule__Automaton__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:343:3: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:344:3: ( rule__Automaton__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:344:4: rule__Automaton__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleLocation"
    // InternalGSelfOperatingHeuristicText.g:353:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:354:1: ( ruleLocation EOF )
            // InternalGSelfOperatingHeuristicText.g:355:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalGSelfOperatingHeuristicText.g:362:1: ruleLocation : ( ( rule__Location__StateAssignment ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:366:2: ( ( ( rule__Location__StateAssignment ) ) )
            // InternalGSelfOperatingHeuristicText.g:367:2: ( ( rule__Location__StateAssignment ) )
            {
            // InternalGSelfOperatingHeuristicText.g:367:2: ( ( rule__Location__StateAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:368:3: ( rule__Location__StateAssignment )
            {
             before(grammarAccess.getLocationAccess().getStateAssignment()); 
            // InternalGSelfOperatingHeuristicText.g:369:3: ( rule__Location__StateAssignment )
            // InternalGSelfOperatingHeuristicText.g:369:4: rule__Location__StateAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Location__StateAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getStateAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "ruleDataType"
    // InternalGSelfOperatingHeuristicText.g:378:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:382:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:383:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:383:2: ( ( rule__DataType__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:384:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:385:3: ( rule__DataType__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:385:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleComparisonOperator"
    // InternalGSelfOperatingHeuristicText.g:394:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:398:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:399:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:399:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:400:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:401:3: ( rule__ComparisonOperator__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:401:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rule__Model__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:409:1: rule__Model__Alternatives_0 : ( ( 'DRONE' ) | ( 'drone' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:413:1: ( ( 'DRONE' ) | ( 'drone' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:414:2: ( 'DRONE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:414:2: ( 'DRONE' )
                    // InternalGSelfOperatingHeuristicText.g:415:3: 'DRONE'
                    {
                     before(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:420:2: ( 'drone' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:420:2: ( 'drone' )
                    // InternalGSelfOperatingHeuristicText.g:421:3: 'drone'
                    {
                     before(grammarAccess.getModelAccess().getDroneKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDroneKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_0"


    // $ANTLR start "rule__Model__Alternatives_2_0"
    // InternalGSelfOperatingHeuristicText.g:430:1: rule__Model__Alternatives_2_0 : ( ( 'GLOBAL' ) | ( 'global' ) );
    public final void rule__Model__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:434:1: ( ( 'GLOBAL' ) | ( 'global' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:435:2: ( 'GLOBAL' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:435:2: ( 'GLOBAL' )
                    // InternalGSelfOperatingHeuristicText.g:436:3: 'GLOBAL'
                    {
                     before(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:441:2: ( 'global' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:441:2: ( 'global' )
                    // InternalGSelfOperatingHeuristicText.g:442:3: 'global'
                    {
                     before(grammarAccess.getModelAccess().getGlobalKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getGlobalKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_2_0"


    // $ANTLR start "rule__Model__Alternatives_3_0"
    // InternalGSelfOperatingHeuristicText.g:451:1: rule__Model__Alternatives_3_0 : ( ( 'EVENTS' ) | ( 'events' ) );
    public final void rule__Model__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:455:1: ( ( 'EVENTS' ) | ( 'events' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:456:2: ( 'EVENTS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:456:2: ( 'EVENTS' )
                    // InternalGSelfOperatingHeuristicText.g:457:3: 'EVENTS'
                    {
                     before(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:462:2: ( 'events' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:462:2: ( 'events' )
                    // InternalGSelfOperatingHeuristicText.g:463:3: 'events'
                    {
                     before(grammarAccess.getModelAccess().getEventsKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getEventsKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_3_0"


    // $ANTLR start "rule__Model__Alternatives_4"
    // InternalGSelfOperatingHeuristicText.g:472:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) );
    public final void rule__Model__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:476:1: ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=27 && LA4_0<=28)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:477:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:477:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    // InternalGSelfOperatingHeuristicText.g:478:3: ( rule__Model__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getModelAccess().getStatesAssignment_4_0()); 
                    // InternalGSelfOperatingHeuristicText.g:479:3: ( rule__Model__StatesAssignment_4_0 )
                    // InternalGSelfOperatingHeuristicText.g:479:4: rule__Model__StatesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__StatesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:483:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:483:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    // InternalGSelfOperatingHeuristicText.g:484:3: ( rule__Model__AltersAssignment_4_1 )
                    {
                     before(grammarAccess.getModelAccess().getAltersAssignment_4_1()); 
                    // InternalGSelfOperatingHeuristicText.g:485:3: ( rule__Model__AltersAssignment_4_1 )
                    // InternalGSelfOperatingHeuristicText.g:485:4: rule__Model__AltersAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__AltersAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getAltersAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_4"


    // $ANTLR start "rule__Global__Alternatives_1"
    // InternalGSelfOperatingHeuristicText.g:493:1: rule__Global__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Global__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:497:1: ( ( 'AS' ) | ( 'as' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:498:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:498:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:499:3: 'AS'
                    {
                     before(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:504:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:504:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:505:3: 'as'
                    {
                     before(grammarAccess.getGlobalAccess().getAsKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getGlobalAccess().getAsKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Alternatives_1"


    // $ANTLR start "rule__Local__Alternatives_1"
    // InternalGSelfOperatingHeuristicText.g:514:1: rule__Local__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Local__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:518:1: ( ( 'AS' ) | ( 'as' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:519:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:519:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:520:3: 'AS'
                    {
                     before(grammarAccess.getLocalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLocalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:525:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:525:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:526:3: 'as'
                    {
                     before(grammarAccess.getLocalAccess().getAsKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLocalAccess().getAsKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Alternatives_1"


    // $ANTLR start "rule__State__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:535:1: rule__State__Alternatives_0 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:539:1: ( ( 'STATE' ) | ( 'state' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:540:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:540:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:541:3: 'STATE'
                    {
                     before(grammarAccess.getStateAccess().getSTATEKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getSTATEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:546:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:546:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:547:3: 'state'
                    {
                     before(grammarAccess.getStateAccess().getStateKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getStateKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives_0"


    // $ANTLR start "rule__State__Alternatives_2_0"
    // InternalGSelfOperatingHeuristicText.g:556:1: rule__State__Alternatives_2_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__State__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:560:1: ( ( 'PROPS' ) | ( 'props' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:561:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:561:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:562:3: 'PROPS'
                    {
                     before(grammarAccess.getStateAccess().getPROPSKeyword_2_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPROPSKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:567:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:567:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:568:3: 'props'
                    {
                     before(grammarAccess.getStateAccess().getPropsKeyword_2_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPropsKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives_2_0"


    // $ANTLR start "rule__State__Alternatives_3_0"
    // InternalGSelfOperatingHeuristicText.g:577:1: rule__State__Alternatives_3_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__State__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:581:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:582:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:582:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:583:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getStateAccess().getTRANSITIONSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTRANSITIONSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:588:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:588:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:589:3: 'transitions'
                    {
                     before(grammarAccess.getStateAccess().getTransitionsKeyword_3_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTransitionsKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives_3_0"


    // $ANTLR start "rule__Alter__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:598:1: rule__Alter__Alternatives_0 : ( ( 'ALTER' ) | ( 'alter' ) );
    public final void rule__Alter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:602:1: ( ( 'ALTER' ) | ( 'alter' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:603:2: ( 'ALTER' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:603:2: ( 'ALTER' )
                    // InternalGSelfOperatingHeuristicText.g:604:3: 'ALTER'
                    {
                     before(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:609:2: ( 'alter' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:609:2: ( 'alter' )
                    // InternalGSelfOperatingHeuristicText.g:610:3: 'alter'
                    {
                     before(grammarAccess.getAlterAccess().getAlterKeyword_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getAlterKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Alternatives_0"


    // $ANTLR start "rule__Alter__Alternatives_1"
    // InternalGSelfOperatingHeuristicText.g:619:1: rule__Alter__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__Alter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:623:1: ( ( 'STATE' ) | ( 'state' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:624:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:624:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:625:3: 'STATE'
                    {
                     before(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:630:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:630:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:631:3: 'state'
                    {
                     before(grammarAccess.getAlterAccess().getStateKeyword_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getStateKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Alternatives_1"


    // $ANTLR start "rule__Alter__Alternatives_3_0"
    // InternalGSelfOperatingHeuristicText.g:640:1: rule__Alter__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__Alter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:644:1: ( ( 'PROPS' ) | ( 'props' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:645:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:645:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:646:3: 'PROPS'
                    {
                     before(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:651:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:651:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:652:3: 'props'
                    {
                     before(grammarAccess.getAlterAccess().getPropsKeyword_3_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getPropsKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Alternatives_3_0"


    // $ANTLR start "rule__Alter__Alternatives_4_0"
    // InternalGSelfOperatingHeuristicText.g:661:1: rule__Alter__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__Alter__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:665:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:666:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:666:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:667:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:672:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:672:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:673:3: 'transitions'
                    {
                     before(grammarAccess.getAlterAccess().getTransitionsKeyword_4_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getTransitionsKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Alternatives_4_0"


    // $ANTLR start "rule__Transition__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:682:1: rule__Transition__Alternatives_0 : ( ( 'ON' ) | ( 'on' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:686:1: ( ( 'ON' ) | ( 'on' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:687:2: ( 'ON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:687:2: ( 'ON' )
                    // InternalGSelfOperatingHeuristicText.g:688:3: 'ON'
                    {
                     before(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:693:2: ( 'on' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:693:2: ( 'on' )
                    // InternalGSelfOperatingHeuristicText.g:694:3: 'on'
                    {
                     before(grammarAccess.getTransitionAccess().getOnKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getOnKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_0"


    // $ANTLR start "rule__Transition__Alternatives_2"
    // InternalGSelfOperatingHeuristicText.g:703:1: rule__Transition__Alternatives_2 : ( ( 'TO' ) | ( 'to' ) );
    public final void rule__Transition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:707:1: ( ( 'TO' ) | ( 'to' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:708:2: ( 'TO' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:708:2: ( 'TO' )
                    // InternalGSelfOperatingHeuristicText.g:709:3: 'TO'
                    {
                     before(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:714:2: ( 'to' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:714:2: ( 'to' )
                    // InternalGSelfOperatingHeuristicText.g:715:3: 'to'
                    {
                     before(grammarAccess.getTransitionAccess().getToKeyword_2_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getToKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_2"


    // $ANTLR start "rule__Transition__Alternatives_4_0"
    // InternalGSelfOperatingHeuristicText.g:724:1: rule__Transition__Alternatives_4_0 : ( ( 'IF' ) | ( 'if' ) );
    public final void rule__Transition__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:728:1: ( ( 'IF' ) | ( 'if' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:729:2: ( 'IF' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:729:2: ( 'IF' )
                    // InternalGSelfOperatingHeuristicText.g:730:3: 'IF'
                    {
                     before(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:735:2: ( 'if' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:735:2: ( 'if' )
                    // InternalGSelfOperatingHeuristicText.g:736:3: 'if'
                    {
                     before(grammarAccess.getTransitionAccess().getIfKeyword_4_0_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getIfKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_4_0"


    // $ANTLR start "rule__Transition__Alternatives_4_2_0"
    // InternalGSelfOperatingHeuristicText.g:745:1: rule__Transition__Alternatives_4_2_0 : ( ( 'SET' ) | ( 'set' ) );
    public final void rule__Transition__Alternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:749:1: ( ( 'SET' ) | ( 'set' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:750:2: ( 'SET' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:750:2: ( 'SET' )
                    // InternalGSelfOperatingHeuristicText.g:751:3: 'SET'
                    {
                     before(grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:756:2: ( 'set' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:756:2: ( 'set' )
                    // InternalGSelfOperatingHeuristicText.g:757:3: 'set'
                    {
                     before(grammarAccess.getTransitionAccess().getSetKeyword_4_2_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSetKeyword_4_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_4_2_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:766:1: rule__Value__Alternatives : ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:770:1: ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt18=1;
                }
                break;
            case RULE_STRING:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
                {
                alt18=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:771:2: ( RULE_BOOL )
                    {
                    // InternalGSelfOperatingHeuristicText.g:771:2: ( RULE_BOOL )
                    // InternalGSelfOperatingHeuristicText.g:772:3: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:777:2: ( RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:777:2: ( RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:778:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:783:2: ( RULE_INT )
                    {
                    // InternalGSelfOperatingHeuristicText.g:783:2: ( RULE_INT )
                    // InternalGSelfOperatingHeuristicText.g:784:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:789:2: ( RULE_DOUBLE )
                    {
                    // InternalGSelfOperatingHeuristicText.g:789:2: ( RULE_DOUBLE )
                    // InternalGSelfOperatingHeuristicText.g:790:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_3()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Automaton__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:799:1: rule__Automaton__Alternatives_0 : ( ( 'AUTOMATON' ) | ( 'automaton' ) );
    public final void rule__Automaton__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:803:1: ( ( 'AUTOMATON' ) | ( 'automaton' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:804:2: ( 'AUTOMATON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:804:2: ( 'AUTOMATON' )
                    // InternalGSelfOperatingHeuristicText.g:805:3: 'AUTOMATON'
                    {
                     before(grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:810:2: ( 'automaton' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:810:2: ( 'automaton' )
                    // InternalGSelfOperatingHeuristicText.g:811:3: 'automaton'
                    {
                     before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0_1()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Alternatives_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:820:1: rule__DataType__Alternatives : ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:824:1: ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            case 42:
                {
                alt20=4;
                }
                break;
            case 43:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:825:2: ( ( '??' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:825:2: ( ( '??' ) )
                    // InternalGSelfOperatingHeuristicText.g:826:3: ( '??' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:827:3: ( '??' )
                    // InternalGSelfOperatingHeuristicText.g:827:4: '??'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:831:2: ( ( 'int' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:831:2: ( ( 'int' ) )
                    // InternalGSelfOperatingHeuristicText.g:832:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:833:3: ( 'int' )
                    // InternalGSelfOperatingHeuristicText.g:833:4: 'int'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:837:2: ( ( 'boolean' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:837:2: ( ( 'boolean' ) )
                    // InternalGSelfOperatingHeuristicText.g:838:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:839:3: ( 'boolean' )
                    // InternalGSelfOperatingHeuristicText.g:839:4: 'boolean'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:843:2: ( ( 'double' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:843:2: ( ( 'double' ) )
                    // InternalGSelfOperatingHeuristicText.g:844:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:845:3: ( 'double' )
                    // InternalGSelfOperatingHeuristicText.g:845:4: 'double'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:849:2: ( ( 'String' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:849:2: ( ( 'String' ) )
                    // InternalGSelfOperatingHeuristicText.g:850:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:851:3: ( 'String' )
                    // InternalGSelfOperatingHeuristicText.g:851:4: 'String'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:859:1: rule__ComparisonOperator__Alternatives : ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:863:1: ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt21=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt21=1;
                }
                break;
            case 45:
                {
                alt21=2;
                }
                break;
            case 46:
                {
                alt21=3;
                }
                break;
            case 47:
                {
                alt21=4;
                }
                break;
            case 48:
                {
                alt21=5;
                }
                break;
            case 49:
                {
                alt21=6;
                }
                break;
            case 50:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:864:2: ( ( '\\u00A4\\u00A4' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:864:2: ( ( '\\u00A4\\u00A4' ) )
                    // InternalGSelfOperatingHeuristicText.g:865:3: ( '\\u00A4\\u00A4' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:866:3: ( '\\u00A4\\u00A4' )
                    // InternalGSelfOperatingHeuristicText.g:866:4: '\\u00A4\\u00A4'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:870:2: ( ( '!=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:870:2: ( ( '!=' ) )
                    // InternalGSelfOperatingHeuristicText.g:871:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:872:3: ( '!=' )
                    // InternalGSelfOperatingHeuristicText.g:872:4: '!='
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:876:2: ( ( '==' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:876:2: ( ( '==' ) )
                    // InternalGSelfOperatingHeuristicText.g:877:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:878:3: ( '==' )
                    // InternalGSelfOperatingHeuristicText.g:878:4: '=='
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:882:2: ( ( '>' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:882:2: ( ( '>' ) )
                    // InternalGSelfOperatingHeuristicText.g:883:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:884:3: ( '>' )
                    // InternalGSelfOperatingHeuristicText.g:884:4: '>'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:888:2: ( ( '<' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:888:2: ( ( '<' ) )
                    // InternalGSelfOperatingHeuristicText.g:889:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:890:3: ( '<' )
                    // InternalGSelfOperatingHeuristicText.g:890:4: '<'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGSelfOperatingHeuristicText.g:894:2: ( ( '>=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:894:2: ( ( '>=' ) )
                    // InternalGSelfOperatingHeuristicText.g:895:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 
                    // InternalGSelfOperatingHeuristicText.g:896:3: ( '>=' )
                    // InternalGSelfOperatingHeuristicText.g:896:4: '>='
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGSelfOperatingHeuristicText.g:900:2: ( ( '<=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:900:2: ( ( '<=' ) )
                    // InternalGSelfOperatingHeuristicText.g:901:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6()); 
                    // InternalGSelfOperatingHeuristicText.g:902:3: ( '<=' )
                    // InternalGSelfOperatingHeuristicText.g:902:4: '<='
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGSelfOperatingHeuristicText.g:910:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:914:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:915:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:922:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:926:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:927:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:927:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:928:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:929:2: ( rule__Model__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:929:3: rule__Model__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGSelfOperatingHeuristicText.g:937:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:941:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:942:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:949:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:953:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:954:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:954:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:955:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:956:2: ( rule__Model__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:956:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalGSelfOperatingHeuristicText.g:964:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:968:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:969:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:976:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:980:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:981:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:981:1: ( ( rule__Model__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:982:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:983:2: ( rule__Model__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=15 && LA22_0<=16)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:983:3: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalGSelfOperatingHeuristicText.g:991:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:995:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:996:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1003:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1007:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1008:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1008:1: ( ( rule__Model__Group_3__0 )* )
            // InternalGSelfOperatingHeuristicText.g:1009:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1010:2: ( rule__Model__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)||LA23_0==51) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1010:3: rule__Model__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalGSelfOperatingHeuristicText.g:1018:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1022:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalGSelfOperatingHeuristicText.g:1023:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:1030:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1034:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1035:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1035:1: ( ( rule__Model__Alternatives_4 )* )
            // InternalGSelfOperatingHeuristicText.g:1036:2: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // InternalGSelfOperatingHeuristicText.g:1037:2: ( rule__Model__Alternatives_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=21 && LA24_0<=22)||(LA24_0>=27 && LA24_0<=28)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1037:3: rule__Model__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalGSelfOperatingHeuristicText.g:1045:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1049:1: ( rule__Model__Group__5__Impl )
            // InternalGSelfOperatingHeuristicText.g:1050:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalGSelfOperatingHeuristicText.g:1056:1: rule__Model__Group__5__Impl : ( ( rule__Model__AutomatonAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1060:1: ( ( ( rule__Model__AutomatonAssignment_5 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1061:1: ( ( rule__Model__AutomatonAssignment_5 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1061:1: ( ( rule__Model__AutomatonAssignment_5 )* )
            // InternalGSelfOperatingHeuristicText.g:1062:2: ( rule__Model__AutomatonAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAutomatonAssignment_5()); 
            // InternalGSelfOperatingHeuristicText.g:1063:2: ( rule__Model__AutomatonAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=37 && LA25_0<=38)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1063:3: rule__Model__AutomatonAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__AutomatonAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAutomatonAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalGSelfOperatingHeuristicText.g:1072:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1076:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:1077:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1084:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__Alternatives_2_0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1088:1: ( ( ( rule__Model__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1089:1: ( ( rule__Model__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1089:1: ( ( rule__Model__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1090:2: ( rule__Model__Alternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:1091:2: ( rule__Model__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:1091:3: rule__Model__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalGSelfOperatingHeuristicText.g:1099:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1103:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1104:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1111:1: rule__Model__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1115:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1116:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1116:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1117:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Model__Group_2__2"
    // InternalGSelfOperatingHeuristicText.g:1126:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl rule__Model__Group_2__3 ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1130:1: ( rule__Model__Group_2__2__Impl rule__Model__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1131:2: rule__Model__Group_2__2__Impl rule__Model__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__2"


    // $ANTLR start "rule__Model__Group_2__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1138:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__GlobalsAssignment_2_2 )* ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1142:1: ( ( ( rule__Model__GlobalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1143:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1143:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1144:2: ( rule__Model__GlobalsAssignment_2_2 )*
            {
             before(grammarAccess.getModelAccess().getGlobalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1145:2: ( rule__Model__GlobalsAssignment_2_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1145:3: rule__Model__GlobalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__GlobalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGlobalsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__2__Impl"


    // $ANTLR start "rule__Model__Group_2__3"
    // InternalGSelfOperatingHeuristicText.g:1153:1: rule__Model__Group_2__3 : rule__Model__Group_2__3__Impl ;
    public final void rule__Model__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1157:1: ( rule__Model__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1158:2: rule__Model__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__3"


    // $ANTLR start "rule__Model__Group_2__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1164:1: rule__Model__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1168:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1169:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1169:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1170:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__3__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // InternalGSelfOperatingHeuristicText.g:1180:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1184:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1185:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1192:1: rule__Model__Group_3__0__Impl : ( ( rule__Model__Alternatives_3_0 )* ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1196:1: ( ( ( rule__Model__Alternatives_3_0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1197:1: ( ( rule__Model__Alternatives_3_0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1197:1: ( ( rule__Model__Alternatives_3_0 )* )
            // InternalGSelfOperatingHeuristicText.g:1198:2: ( rule__Model__Alternatives_3_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1199:2: ( rule__Model__Alternatives_3_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=17 && LA27_0<=18)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1199:3: rule__Model__Alternatives_3_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Alternatives_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // InternalGSelfOperatingHeuristicText.g:1207:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1211:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1212:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1219:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1223:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1224:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1224:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1225:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // InternalGSelfOperatingHeuristicText.g:1234:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1238:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1239:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1246:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__EventsAssignment_3_2 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1250:1: ( ( ( rule__Model__EventsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1251:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1251:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1252:2: ( rule__Model__EventsAssignment_3_2 )*
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1253:2: ( rule__Model__EventsAssignment_3_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1253:3: rule__Model__EventsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__EventsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Model__Group_3__3"
    // InternalGSelfOperatingHeuristicText.g:1261:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1265:1: ( rule__Model__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1266:2: rule__Model__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3"


    // $ANTLR start "rule__Model__Group_3__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1272:1: rule__Model__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1276:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1277:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1277:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1278:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3__Impl"


    // $ANTLR start "rule__Global__Group__0"
    // InternalGSelfOperatingHeuristicText.g:1288:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1292:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1293:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0"


    // $ANTLR start "rule__Global__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1300:1: rule__Global__Group__0__Impl : ( ( rule__Global__NameAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1304:1: ( ( ( rule__Global__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1305:1: ( ( rule__Global__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1305:1: ( ( rule__Global__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1306:2: ( rule__Global__NameAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1307:2: ( rule__Global__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1307:3: rule__Global__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Global__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0__Impl"


    // $ANTLR start "rule__Global__Group__1"
    // InternalGSelfOperatingHeuristicText.g:1315:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1319:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1320:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1"


    // $ANTLR start "rule__Global__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1327:1: rule__Global__Group__1__Impl : ( ( rule__Global__Alternatives_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1331:1: ( ( ( rule__Global__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1332:1: ( ( rule__Global__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1332:1: ( ( rule__Global__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1333:2: ( rule__Global__Alternatives_1 )
            {
             before(grammarAccess.getGlobalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1334:2: ( rule__Global__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1334:3: rule__Global__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Global__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1__Impl"


    // $ANTLR start "rule__Global__Group__2"
    // InternalGSelfOperatingHeuristicText.g:1342:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1346:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1347:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Global__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2"


    // $ANTLR start "rule__Global__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1354:1: rule__Global__Group__2__Impl : ( ( rule__Global__TypeAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1358:1: ( ( ( rule__Global__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1359:1: ( ( rule__Global__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1359:1: ( ( rule__Global__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1360:2: ( rule__Global__TypeAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1361:2: ( rule__Global__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1361:3: rule__Global__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Global__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2__Impl"


    // $ANTLR start "rule__Global__Group__3"
    // InternalGSelfOperatingHeuristicText.g:1369:1: rule__Global__Group__3 : rule__Global__Group__3__Impl ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1373:1: ( rule__Global__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1374:2: rule__Global__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3"


    // $ANTLR start "rule__Global__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1380:1: rule__Global__Group__3__Impl : ( ( rule__Global__Group_3__0 )? ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1384:1: ( ( ( rule__Global__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1385:1: ( ( rule__Global__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1385:1: ( ( rule__Global__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1386:2: ( rule__Global__Group_3__0 )?
            {
             before(grammarAccess.getGlobalAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1387:2: ( rule__Global__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1387:3: rule__Global__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Global__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3__Impl"


    // $ANTLR start "rule__Global__Group_3__0"
    // InternalGSelfOperatingHeuristicText.g:1396:1: rule__Global__Group_3__0 : rule__Global__Group_3__0__Impl rule__Global__Group_3__1 ;
    public final void rule__Global__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1400:1: ( rule__Global__Group_3__0__Impl rule__Global__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1401:2: rule__Global__Group_3__0__Impl rule__Global__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Global__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_3__0"


    // $ANTLR start "rule__Global__Group_3__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1408:1: rule__Global__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Global__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1412:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1413:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1413:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1414:2: '='
            {
             before(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_3__0__Impl"


    // $ANTLR start "rule__Global__Group_3__1"
    // InternalGSelfOperatingHeuristicText.g:1423:1: rule__Global__Group_3__1 : rule__Global__Group_3__1__Impl ;
    public final void rule__Global__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1427:1: ( rule__Global__Group_3__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1428:2: rule__Global__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_3__1"


    // $ANTLR start "rule__Global__Group_3__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1434:1: rule__Global__Group_3__1__Impl : ( ( rule__Global__ValueAssignment_3_1 ) ) ;
    public final void rule__Global__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1438:1: ( ( ( rule__Global__ValueAssignment_3_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1439:1: ( ( rule__Global__ValueAssignment_3_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1439:1: ( ( rule__Global__ValueAssignment_3_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1440:2: ( rule__Global__ValueAssignment_3_1 )
            {
             before(grammarAccess.getGlobalAccess().getValueAssignment_3_1()); 
            // InternalGSelfOperatingHeuristicText.g:1441:2: ( rule__Global__ValueAssignment_3_1 )
            // InternalGSelfOperatingHeuristicText.g:1441:3: rule__Global__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Global__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_3__1__Impl"


    // $ANTLR start "rule__Local__Group__0"
    // InternalGSelfOperatingHeuristicText.g:1450:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1454:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1455:2: rule__Local__Group__0__Impl rule__Local__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Local__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__0"


    // $ANTLR start "rule__Local__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1462:1: rule__Local__Group__0__Impl : ( ( rule__Local__NameAssignment_0 ) ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1466:1: ( ( ( rule__Local__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1467:1: ( ( rule__Local__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1467:1: ( ( rule__Local__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1468:2: ( rule__Local__NameAssignment_0 )
            {
             before(grammarAccess.getLocalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1469:2: ( rule__Local__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1469:3: rule__Local__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Local__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__0__Impl"


    // $ANTLR start "rule__Local__Group__1"
    // InternalGSelfOperatingHeuristicText.g:1477:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1481:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1482:2: rule__Local__Group__1__Impl rule__Local__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Local__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__1"


    // $ANTLR start "rule__Local__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1489:1: rule__Local__Group__1__Impl : ( ( rule__Local__Alternatives_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1493:1: ( ( ( rule__Local__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1494:1: ( ( rule__Local__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1494:1: ( ( rule__Local__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1495:2: ( rule__Local__Alternatives_1 )
            {
             before(grammarAccess.getLocalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1496:2: ( rule__Local__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1496:3: rule__Local__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Local__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__1__Impl"


    // $ANTLR start "rule__Local__Group__2"
    // InternalGSelfOperatingHeuristicText.g:1504:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1508:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1509:2: rule__Local__Group__2__Impl rule__Local__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Local__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__2"


    // $ANTLR start "rule__Local__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1516:1: rule__Local__Group__2__Impl : ( ( rule__Local__TypeAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1520:1: ( ( ( rule__Local__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1521:1: ( ( rule__Local__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1521:1: ( ( rule__Local__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1522:2: ( rule__Local__TypeAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1523:2: ( rule__Local__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1523:3: rule__Local__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Local__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__2__Impl"


    // $ANTLR start "rule__Local__Group__3"
    // InternalGSelfOperatingHeuristicText.g:1531:1: rule__Local__Group__3 : rule__Local__Group__3__Impl ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1535:1: ( rule__Local__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1536:2: rule__Local__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Local__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__3"


    // $ANTLR start "rule__Local__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1542:1: rule__Local__Group__3__Impl : ( ( rule__Local__Group_3__0 )? ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1546:1: ( ( ( rule__Local__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1547:1: ( ( rule__Local__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1547:1: ( ( rule__Local__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1548:2: ( rule__Local__Group_3__0 )?
            {
             before(grammarAccess.getLocalAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1549:2: ( rule__Local__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1549:3: rule__Local__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Local__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__3__Impl"


    // $ANTLR start "rule__Local__Group_3__0"
    // InternalGSelfOperatingHeuristicText.g:1558:1: rule__Local__Group_3__0 : rule__Local__Group_3__0__Impl rule__Local__Group_3__1 ;
    public final void rule__Local__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1562:1: ( rule__Local__Group_3__0__Impl rule__Local__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1563:2: rule__Local__Group_3__0__Impl rule__Local__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Local__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group_3__0"


    // $ANTLR start "rule__Local__Group_3__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1570:1: rule__Local__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Local__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1574:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1575:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1575:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1576:2: '='
            {
             before(grammarAccess.getLocalAccess().getEqualsSignKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLocalAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group_3__0__Impl"


    // $ANTLR start "rule__Local__Group_3__1"
    // InternalGSelfOperatingHeuristicText.g:1585:1: rule__Local__Group_3__1 : rule__Local__Group_3__1__Impl ;
    public final void rule__Local__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1589:1: ( rule__Local__Group_3__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1590:2: rule__Local__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Local__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group_3__1"


    // $ANTLR start "rule__Local__Group_3__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1596:1: rule__Local__Group_3__1__Impl : ( ( rule__Local__ValueAssignment_3_1 ) ) ;
    public final void rule__Local__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1600:1: ( ( ( rule__Local__ValueAssignment_3_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1601:1: ( ( rule__Local__ValueAssignment_3_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1601:1: ( ( rule__Local__ValueAssignment_3_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1602:2: ( rule__Local__ValueAssignment_3_1 )
            {
             before(grammarAccess.getLocalAccess().getValueAssignment_3_1()); 
            // InternalGSelfOperatingHeuristicText.g:1603:2: ( rule__Local__ValueAssignment_3_1 )
            // InternalGSelfOperatingHeuristicText.g:1603:3: rule__Local__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Local__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalGSelfOperatingHeuristicText.g:1612:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1616:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1617:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1624:1: rule__State__Group__0__Impl : ( ( rule__State__Alternatives_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1628:1: ( ( ( rule__State__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1629:1: ( ( rule__State__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1629:1: ( ( rule__State__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1630:2: ( rule__State__Alternatives_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:1631:2: ( rule__State__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:1631:3: rule__State__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalGSelfOperatingHeuristicText.g:1639:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1643:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1644:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1651:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1655:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1656:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1656:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1657:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:1658:2: ( rule__State__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:1658:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalGSelfOperatingHeuristicText.g:1666:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1670:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1671:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1678:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1682:1: ( ( ( rule__State__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1683:1: ( ( rule__State__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1683:1: ( ( rule__State__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1684:2: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:1685:2: ( rule__State__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=23 && LA31_0<=24)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1685:3: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalGSelfOperatingHeuristicText.g:1693:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1697:1: ( rule__State__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1698:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1704:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1708:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1709:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1709:1: ( ( rule__State__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1710:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1711:2: ( rule__State__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=25 && LA32_0<=26)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1711:3: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // InternalGSelfOperatingHeuristicText.g:1720:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1724:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:1725:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1732:1: rule__State__Group_2__0__Impl : ( ( rule__State__Alternatives_2_0 ) ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1736:1: ( ( ( rule__State__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1737:1: ( ( rule__State__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1737:1: ( ( rule__State__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1738:2: ( rule__State__Alternatives_2_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:1739:2: ( rule__State__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:1739:3: rule__State__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // InternalGSelfOperatingHeuristicText.g:1747:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1751:1: ( rule__State__Group_2__1__Impl rule__State__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1752:2: rule__State__Group_2__1__Impl rule__State__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__State__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1759:1: rule__State__Group_2__1__Impl : ( '{' ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1763:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1764:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1764:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1765:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_2__2"
    // InternalGSelfOperatingHeuristicText.g:1774:1: rule__State__Group_2__2 : rule__State__Group_2__2__Impl rule__State__Group_2__3 ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1778:1: ( rule__State__Group_2__2__Impl rule__State__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1779:2: rule__State__Group_2__2__Impl rule__State__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__State__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2"


    // $ANTLR start "rule__State__Group_2__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1786:1: rule__State__Group_2__2__Impl : ( ( rule__State__LocalsAssignment_2_2 )* ) ;
    public final void rule__State__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1790:1: ( ( ( rule__State__LocalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1791:1: ( ( rule__State__LocalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1791:1: ( ( rule__State__LocalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1792:2: ( rule__State__LocalsAssignment_2_2 )*
            {
             before(grammarAccess.getStateAccess().getLocalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1793:2: ( rule__State__LocalsAssignment_2_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1793:3: rule__State__LocalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__State__LocalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getLocalsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2__Impl"


    // $ANTLR start "rule__State__Group_2__3"
    // InternalGSelfOperatingHeuristicText.g:1801:1: rule__State__Group_2__3 : rule__State__Group_2__3__Impl ;
    public final void rule__State__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1805:1: ( rule__State__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1806:2: rule__State__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__3"


    // $ANTLR start "rule__State__Group_2__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1812:1: rule__State__Group_2__3__Impl : ( '}' ) ;
    public final void rule__State__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1816:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1817:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1817:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1818:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__3__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalGSelfOperatingHeuristicText.g:1828:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1832:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1833:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1840:1: rule__State__Group_3__0__Impl : ( ( rule__State__Alternatives_3_0 ) ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1844:1: ( ( ( rule__State__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1845:1: ( ( rule__State__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1845:1: ( ( rule__State__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1846:2: ( rule__State__Alternatives_3_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1847:2: ( rule__State__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:1847:3: rule__State__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // InternalGSelfOperatingHeuristicText.g:1855:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1859:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1860:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1867:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1871:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1872:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1872:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1873:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_3__2"
    // InternalGSelfOperatingHeuristicText.g:1882:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1886:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1887:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__State__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2"


    // $ANTLR start "rule__State__Group_3__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:1894:1: rule__State__Group_3__2__Impl : ( ( rule__State__TransitionsAssignment_3_2 )* ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1898:1: ( ( ( rule__State__TransitionsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1899:1: ( ( rule__State__TransitionsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1899:1: ( ( rule__State__TransitionsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1900:2: ( rule__State__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1901:2: ( rule__State__TransitionsAssignment_3_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=29 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1901:3: rule__State__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__State__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2__Impl"


    // $ANTLR start "rule__State__Group_3__3"
    // InternalGSelfOperatingHeuristicText.g:1909:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1913:1: ( rule__State__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1914:2: rule__State__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3"


    // $ANTLR start "rule__State__Group_3__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:1920:1: rule__State__Group_3__3__Impl : ( '}' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1924:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1925:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1925:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1926:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3__Impl"


    // $ANTLR start "rule__Alter__Group__0"
    // InternalGSelfOperatingHeuristicText.g:1936:1: rule__Alter__Group__0 : rule__Alter__Group__0__Impl rule__Alter__Group__1 ;
    public final void rule__Alter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1940:1: ( rule__Alter__Group__0__Impl rule__Alter__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1941:2: rule__Alter__Group__0__Impl rule__Alter__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Alter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__0"


    // $ANTLR start "rule__Alter__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1948:1: rule__Alter__Group__0__Impl : ( ( rule__Alter__Alternatives_0 ) ) ;
    public final void rule__Alter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1952:1: ( ( ( rule__Alter__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1953:1: ( ( rule__Alter__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1953:1: ( ( rule__Alter__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1954:2: ( rule__Alter__Alternatives_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:1955:2: ( rule__Alter__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:1955:3: rule__Alter__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAlterAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__0__Impl"


    // $ANTLR start "rule__Alter__Group__1"
    // InternalGSelfOperatingHeuristicText.g:1963:1: rule__Alter__Group__1 : rule__Alter__Group__1__Impl rule__Alter__Group__2 ;
    public final void rule__Alter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1967:1: ( rule__Alter__Group__1__Impl rule__Alter__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1968:2: rule__Alter__Group__1__Impl rule__Alter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Alter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__1"


    // $ANTLR start "rule__Alter__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1975:1: rule__Alter__Group__1__Impl : ( ( rule__Alter__Alternatives_1 ) ) ;
    public final void rule__Alter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1979:1: ( ( ( rule__Alter__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1980:1: ( ( rule__Alter__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1980:1: ( ( rule__Alter__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1981:2: ( rule__Alter__Alternatives_1 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1982:2: ( rule__Alter__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1982:3: rule__Alter__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAlterAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__1__Impl"


    // $ANTLR start "rule__Alter__Group__2"
    // InternalGSelfOperatingHeuristicText.g:1990:1: rule__Alter__Group__2 : rule__Alter__Group__2__Impl rule__Alter__Group__3 ;
    public final void rule__Alter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1994:1: ( rule__Alter__Group__2__Impl rule__Alter__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1995:2: rule__Alter__Group__2__Impl rule__Alter__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Alter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__2"


    // $ANTLR start "rule__Alter__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2002:1: rule__Alter__Group__2__Impl : ( ( rule__Alter__StateAssignment_2 ) ) ;
    public final void rule__Alter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2006:1: ( ( ( rule__Alter__StateAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2007:1: ( ( rule__Alter__StateAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2007:1: ( ( rule__Alter__StateAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2008:2: ( rule__Alter__StateAssignment_2 )
            {
             before(grammarAccess.getAlterAccess().getStateAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2009:2: ( rule__Alter__StateAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2009:3: rule__Alter__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Alter__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__2__Impl"


    // $ANTLR start "rule__Alter__Group__3"
    // InternalGSelfOperatingHeuristicText.g:2017:1: rule__Alter__Group__3 : rule__Alter__Group__3__Impl rule__Alter__Group__4 ;
    public final void rule__Alter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2021:1: ( rule__Alter__Group__3__Impl rule__Alter__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2022:2: rule__Alter__Group__3__Impl rule__Alter__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Alter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__3"


    // $ANTLR start "rule__Alter__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:2029:1: rule__Alter__Group__3__Impl : ( ( rule__Alter__Group_3__0 )? ) ;
    public final void rule__Alter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2033:1: ( ( ( rule__Alter__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2034:1: ( ( rule__Alter__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2034:1: ( ( rule__Alter__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2035:2: ( rule__Alter__Group_3__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:2036:2: ( rule__Alter__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=23 && LA35_0<=24)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2036:3: rule__Alter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__3__Impl"


    // $ANTLR start "rule__Alter__Group__4"
    // InternalGSelfOperatingHeuristicText.g:2044:1: rule__Alter__Group__4 : rule__Alter__Group__4__Impl ;
    public final void rule__Alter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2048:1: ( rule__Alter__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2049:2: rule__Alter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__4"


    // $ANTLR start "rule__Alter__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:2055:1: rule__Alter__Group__4__Impl : ( ( rule__Alter__Group_4__0 )? ) ;
    public final void rule__Alter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2059:1: ( ( ( rule__Alter__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2060:1: ( ( rule__Alter__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2060:1: ( ( rule__Alter__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2061:2: ( rule__Alter__Group_4__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2062:2: ( rule__Alter__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=25 && LA36_0<=26)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2062:3: rule__Alter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group__4__Impl"


    // $ANTLR start "rule__Alter__Group_3__0"
    // InternalGSelfOperatingHeuristicText.g:2071:1: rule__Alter__Group_3__0 : rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 ;
    public final void rule__Alter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2075:1: ( rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:2076:2: rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Alter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__0"


    // $ANTLR start "rule__Alter__Group_3__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2083:1: rule__Alter__Group_3__0__Impl : ( ( rule__Alter__Alternatives_3_0 ) ) ;
    public final void rule__Alter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2087:1: ( ( ( rule__Alter__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2088:1: ( ( rule__Alter__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2088:1: ( ( rule__Alter__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2089:2: ( rule__Alter__Alternatives_3_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:2090:2: ( rule__Alter__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:2090:3: rule__Alter__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAlterAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__0__Impl"


    // $ANTLR start "rule__Alter__Group_3__1"
    // InternalGSelfOperatingHeuristicText.g:2098:1: rule__Alter__Group_3__1 : rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 ;
    public final void rule__Alter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2102:1: ( rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:2103:2: rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Alter__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__1"


    // $ANTLR start "rule__Alter__Group_3__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2110:1: rule__Alter__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2114:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2115:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2115:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2116:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__1__Impl"


    // $ANTLR start "rule__Alter__Group_3__2"
    // InternalGSelfOperatingHeuristicText.g:2125:1: rule__Alter__Group_3__2 : rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 ;
    public final void rule__Alter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2129:1: ( rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:2130:2: rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Alter__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__2"


    // $ANTLR start "rule__Alter__Group_3__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2137:1: rule__Alter__Group_3__2__Impl : ( ( rule__Alter__LocalsAssignment_3_2 )* ) ;
    public final void rule__Alter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2141:1: ( ( ( rule__Alter__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2142:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2142:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2143:2: ( rule__Alter__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getAlterAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:2144:2: ( rule__Alter__LocalsAssignment_3_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2144:3: rule__Alter__LocalsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Alter__LocalsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getAlterAccess().getLocalsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__2__Impl"


    // $ANTLR start "rule__Alter__Group_3__3"
    // InternalGSelfOperatingHeuristicText.g:2152:1: rule__Alter__Group_3__3 : rule__Alter__Group_3__3__Impl ;
    public final void rule__Alter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2156:1: ( rule__Alter__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2157:2: rule__Alter__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__3"


    // $ANTLR start "rule__Alter__Group_3__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:2163:1: rule__Alter__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2167:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2168:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2168:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2169:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_3__3__Impl"


    // $ANTLR start "rule__Alter__Group_4__0"
    // InternalGSelfOperatingHeuristicText.g:2179:1: rule__Alter__Group_4__0 : rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 ;
    public final void rule__Alter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2183:1: ( rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2184:2: rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Alter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__0"


    // $ANTLR start "rule__Alter__Group_4__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2191:1: rule__Alter__Group_4__0__Impl : ( ( rule__Alter__Alternatives_4_0 ) ) ;
    public final void rule__Alter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2195:1: ( ( ( rule__Alter__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2196:1: ( ( rule__Alter__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2196:1: ( ( rule__Alter__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2197:2: ( rule__Alter__Alternatives_4_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2198:2: ( rule__Alter__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2198:3: rule__Alter__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAlterAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__0__Impl"


    // $ANTLR start "rule__Alter__Group_4__1"
    // InternalGSelfOperatingHeuristicText.g:2206:1: rule__Alter__Group_4__1 : rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 ;
    public final void rule__Alter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2210:1: ( rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2211:2: rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Alter__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__1"


    // $ANTLR start "rule__Alter__Group_4__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2218:1: rule__Alter__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2222:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2223:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2223:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2224:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__1__Impl"


    // $ANTLR start "rule__Alter__Group_4__2"
    // InternalGSelfOperatingHeuristicText.g:2233:1: rule__Alter__Group_4__2 : rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 ;
    public final void rule__Alter__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2237:1: ( rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:2238:2: rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__Alter__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alter__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__2"


    // $ANTLR start "rule__Alter__Group_4__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2245:1: rule__Alter__Group_4__2__Impl : ( ( rule__Alter__TransitionsAssignment_4_2 )* ) ;
    public final void rule__Alter__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2249:1: ( ( ( rule__Alter__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2250:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2250:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2251:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2252:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=29 && LA38_0<=30)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2252:3: rule__Alter__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Alter__TransitionsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__2__Impl"


    // $ANTLR start "rule__Alter__Group_4__3"
    // InternalGSelfOperatingHeuristicText.g:2260:1: rule__Alter__Group_4__3 : rule__Alter__Group_4__3__Impl ;
    public final void rule__Alter__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2264:1: ( rule__Alter__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2265:2: rule__Alter__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alter__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__3"


    // $ANTLR start "rule__Alter__Group_4__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:2271:1: rule__Alter__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2275:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2276:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2276:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2277:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__Group_4__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2287:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2291:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2292:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2299:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2303:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2304:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2304:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2305:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2306:2: ( rule__Transition__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2306:3: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalGSelfOperatingHeuristicText.g:2314:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2318:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2319:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2326:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__EventAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2330:1: ( ( ( rule__Transition__EventAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2331:1: ( ( rule__Transition__EventAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2331:1: ( ( rule__Transition__EventAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2332:2: ( rule__Transition__EventAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2333:2: ( rule__Transition__EventAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2333:3: rule__Transition__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalGSelfOperatingHeuristicText.g:2341:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2345:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2346:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2353:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Alternatives_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2357:1: ( ( ( rule__Transition__Alternatives_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2358:1: ( ( rule__Transition__Alternatives_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2358:1: ( ( rule__Transition__Alternatives_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2359:2: ( rule__Transition__Alternatives_2 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            // InternalGSelfOperatingHeuristicText.g:2360:2: ( rule__Transition__Alternatives_2 )
            // InternalGSelfOperatingHeuristicText.g:2360:3: rule__Transition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalGSelfOperatingHeuristicText.g:2368:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2372:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2373:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:2380:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__StateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2384:1: ( ( ( rule__Transition__StateAssignment_3 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2385:1: ( ( rule__Transition__StateAssignment_3 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2385:1: ( ( rule__Transition__StateAssignment_3 ) )
            // InternalGSelfOperatingHeuristicText.g:2386:2: ( rule__Transition__StateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2387:2: ( rule__Transition__StateAssignment_3 )
            // InternalGSelfOperatingHeuristicText.g:2387:3: rule__Transition__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalGSelfOperatingHeuristicText.g:2395:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2399:1: ( rule__Transition__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2400:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:2406:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2410:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2411:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2411:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2412:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2413:2: ( rule__Transition__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=33 && LA39_0<=34)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2413:3: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalGSelfOperatingHeuristicText.g:2422:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2426:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2427:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2434:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__Alternatives_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2438:1: ( ( ( rule__Transition__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2439:1: ( ( rule__Transition__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2439:1: ( ( rule__Transition__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2440:2: ( rule__Transition__Alternatives_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2441:2: ( rule__Transition__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2441:3: rule__Transition__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalGSelfOperatingHeuristicText.g:2449:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2453:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2454:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2461:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ConditionAssignment_4_1 )? ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2465:1: ( ( ( rule__Transition__ConditionAssignment_4_1 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2466:1: ( ( rule__Transition__ConditionAssignment_4_1 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2466:1: ( ( rule__Transition__ConditionAssignment_4_1 )? )
            // InternalGSelfOperatingHeuristicText.g:2467:2: ( rule__Transition__ConditionAssignment_4_1 )?
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_4_1()); 
            // InternalGSelfOperatingHeuristicText.g:2468:2: ( rule__Transition__ConditionAssignment_4_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2468:3: rule__Transition__ConditionAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__ConditionAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getConditionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // InternalGSelfOperatingHeuristicText.g:2476:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2480:1: ( rule__Transition__Group_4__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2481:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2487:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )? ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2491:1: ( ( ( rule__Transition__Group_4_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2492:1: ( ( rule__Transition__Group_4_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2492:1: ( ( rule__Transition__Group_4_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2493:2: ( rule__Transition__Group_4_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2494:2: ( rule__Transition__Group_4_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=35 && LA41_0<=36)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2494:3: rule__Transition__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4_2__0"
    // InternalGSelfOperatingHeuristicText.g:2503:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2507:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // InternalGSelfOperatingHeuristicText.g:2508:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__0"


    // $ANTLR start "rule__Transition__Group_4_2__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2515:1: rule__Transition__Group_4_2__0__Impl : ( ( rule__Transition__Alternatives_4_2_0 ) ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2519:1: ( ( ( rule__Transition__Alternatives_4_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2520:1: ( ( rule__Transition__Alternatives_4_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2520:1: ( ( rule__Transition__Alternatives_4_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2521:2: ( rule__Transition__Alternatives_4_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:2522:2: ( rule__Transition__Alternatives_4_2_0 )
            // InternalGSelfOperatingHeuristicText.g:2522:3: rule__Transition__Alternatives_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_2__1"
    // InternalGSelfOperatingHeuristicText.g:2530:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2534:1: ( rule__Transition__Group_4_2__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2535:2: rule__Transition__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__1"


    // $ANTLR start "rule__Transition__Group_4_2__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2541:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__AssignmentAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2545:1: ( ( ( rule__Transition__AssignmentAssignment_4_2_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2546:1: ( ( rule__Transition__AssignmentAssignment_4_2_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2546:1: ( ( rule__Transition__AssignmentAssignment_4_2_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2547:2: ( rule__Transition__AssignmentAssignment_4_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignment_4_2_1()); 
            // InternalGSelfOperatingHeuristicText.g:2548:2: ( rule__Transition__AssignmentAssignment_4_2_1 )
            // InternalGSelfOperatingHeuristicText.g:2548:3: rule__Transition__AssignmentAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__AssignmentAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAssignmentAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2557:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2561:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2562:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2569:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2573:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2574:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2574:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2575:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2576:2: ( rule__Condition__LeftAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2576:3: rule__Condition__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGSelfOperatingHeuristicText.g:2584:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2588:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2589:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2596:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2600:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2601:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2601:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2602:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2603:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2603:3: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGSelfOperatingHeuristicText.g:2611:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2615:1: ( rule__Condition__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2616:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2622:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2626:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2627:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2627:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2628:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2629:2: ( rule__Condition__RightAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2629:3: rule__Condition__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2638:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2642:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2643:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2650:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__CurrentVarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2654:1: ( ( ( rule__Assignment__CurrentVarAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2655:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2655:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2656:2: ( rule__Assignment__CurrentVarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2657:2: ( rule__Assignment__CurrentVarAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2657:3: rule__Assignment__CurrentVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__CurrentVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalGSelfOperatingHeuristicText.g:2665:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2669:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2670:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2677:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2681:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:2682:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:2682:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:2683:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalGSelfOperatingHeuristicText.g:2692:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2696:1: ( rule__Assignment__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2697:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2703:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2707:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2708:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2708:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2709:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2710:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2710:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Automaton__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2719:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2723:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2724:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Automaton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__0"


    // $ANTLR start "rule__Automaton__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2731:1: rule__Automaton__Group__0__Impl : ( ( rule__Automaton__Alternatives_0 ) ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2735:1: ( ( ( rule__Automaton__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2736:1: ( ( rule__Automaton__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2736:1: ( ( rule__Automaton__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2737:2: ( rule__Automaton__Alternatives_0 )
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2738:2: ( rule__Automaton__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2738:3: rule__Automaton__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__0__Impl"


    // $ANTLR start "rule__Automaton__Group__1"
    // InternalGSelfOperatingHeuristicText.g:2746:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2750:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2751:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Automaton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__1"


    // $ANTLR start "rule__Automaton__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2758:1: rule__Automaton__Group__1__Impl : ( ( rule__Automaton__NameAssignment_1 ) ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2762:1: ( ( ( rule__Automaton__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2763:1: ( ( rule__Automaton__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2763:1: ( ( rule__Automaton__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2764:2: ( rule__Automaton__NameAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2765:2: ( rule__Automaton__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2765:3: rule__Automaton__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__1__Impl"


    // $ANTLR start "rule__Automaton__Group__2"
    // InternalGSelfOperatingHeuristicText.g:2773:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2777:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2778:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Automaton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__2"


    // $ANTLR start "rule__Automaton__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2785:1: rule__Automaton__Group__2__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2789:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2790:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2790:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2791:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__2__Impl"


    // $ANTLR start "rule__Automaton__Group__3"
    // InternalGSelfOperatingHeuristicText.g:2800:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2804:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2805:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Automaton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__3"


    // $ANTLR start "rule__Automaton__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:2812:1: rule__Automaton__Group__3__Impl : ( ( rule__Automaton__LocationAssignment_3 )* ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2816:1: ( ( ( rule__Automaton__LocationAssignment_3 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2817:1: ( ( rule__Automaton__LocationAssignment_3 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2817:1: ( ( rule__Automaton__LocationAssignment_3 )* )
            // InternalGSelfOperatingHeuristicText.g:2818:2: ( rule__Automaton__LocationAssignment_3 )*
            {
             before(grammarAccess.getAutomatonAccess().getLocationAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2819:2: ( rule__Automaton__LocationAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2819:3: rule__Automaton__LocationAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Automaton__LocationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getLocationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__3__Impl"


    // $ANTLR start "rule__Automaton__Group__4"
    // InternalGSelfOperatingHeuristicText.g:2827:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2831:1: ( rule__Automaton__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2832:2: rule__Automaton__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__4"


    // $ANTLR start "rule__Automaton__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:2838:1: rule__Automaton__Group__4__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2842:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2843:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2843:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2844:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__4__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:2854:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2858:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2859:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2859:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2860:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__GlobalsAssignment_2_2"
    // InternalGSelfOperatingHeuristicText.g:2869:1: rule__Model__GlobalsAssignment_2_2 : ( ruleGlobal ) ;
    public final void rule__Model__GlobalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2873:1: ( ( ruleGlobal ) )
            // InternalGSelfOperatingHeuristicText.g:2874:2: ( ruleGlobal )
            {
            // InternalGSelfOperatingHeuristicText.g:2874:2: ( ruleGlobal )
            // InternalGSelfOperatingHeuristicText.g:2875:3: ruleGlobal
            {
             before(grammarAccess.getModelAccess().getGlobalsGlobalParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGlobalsGlobalParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GlobalsAssignment_2_2"


    // $ANTLR start "rule__Model__EventsAssignment_3_2"
    // InternalGSelfOperatingHeuristicText.g:2884:1: rule__Model__EventsAssignment_3_2 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2888:1: ( ( ruleEvent ) )
            // InternalGSelfOperatingHeuristicText.g:2889:2: ( ruleEvent )
            {
            // InternalGSelfOperatingHeuristicText.g:2889:2: ( ruleEvent )
            // InternalGSelfOperatingHeuristicText.g:2890:3: ruleEvent
            {
             before(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EventsAssignment_3_2"


    // $ANTLR start "rule__Model__StatesAssignment_4_0"
    // InternalGSelfOperatingHeuristicText.g:2899:1: rule__Model__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Model__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2903:1: ( ( ruleState ) )
            // InternalGSelfOperatingHeuristicText.g:2904:2: ( ruleState )
            {
            // InternalGSelfOperatingHeuristicText.g:2904:2: ( ruleState )
            // InternalGSelfOperatingHeuristicText.g:2905:3: ruleState
            {
             before(grammarAccess.getModelAccess().getStatesStateParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatesStateParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatesAssignment_4_0"


    // $ANTLR start "rule__Model__AltersAssignment_4_1"
    // InternalGSelfOperatingHeuristicText.g:2914:1: rule__Model__AltersAssignment_4_1 : ( ruleAlter ) ;
    public final void rule__Model__AltersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2918:1: ( ( ruleAlter ) )
            // InternalGSelfOperatingHeuristicText.g:2919:2: ( ruleAlter )
            {
            // InternalGSelfOperatingHeuristicText.g:2919:2: ( ruleAlter )
            // InternalGSelfOperatingHeuristicText.g:2920:3: ruleAlter
            {
             before(grammarAccess.getModelAccess().getAltersAlterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlter();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAltersAlterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AltersAssignment_4_1"


    // $ANTLR start "rule__Model__AutomatonAssignment_5"
    // InternalGSelfOperatingHeuristicText.g:2929:1: rule__Model__AutomatonAssignment_5 : ( ruleAutomaton ) ;
    public final void rule__Model__AutomatonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2933:1: ( ( ruleAutomaton ) )
            // InternalGSelfOperatingHeuristicText.g:2934:2: ( ruleAutomaton )
            {
            // InternalGSelfOperatingHeuristicText.g:2934:2: ( ruleAutomaton )
            // InternalGSelfOperatingHeuristicText.g:2935:3: ruleAutomaton
            {
             before(grammarAccess.getModelAccess().getAutomatonAutomatonParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAutomaton();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAutomatonAutomatonParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AutomatonAssignment_5"


    // $ANTLR start "rule__Global__NameAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:2944:1: rule__Global__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Global__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2948:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2949:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2949:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2950:3: RULE_ID
            {
             before(grammarAccess.getGlobalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__NameAssignment_0"


    // $ANTLR start "rule__Global__TypeAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:2959:1: rule__Global__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Global__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2963:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:2964:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:2964:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:2965:3: ruleDataType
            {
             before(grammarAccess.getGlobalAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getTypeDataTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__TypeAssignment_2"


    // $ANTLR start "rule__Global__ValueAssignment_3_1"
    // InternalGSelfOperatingHeuristicText.g:2974:1: rule__Global__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Global__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2978:1: ( ( RULE_STRING ) )
            // InternalGSelfOperatingHeuristicText.g:2979:2: ( RULE_STRING )
            {
            // InternalGSelfOperatingHeuristicText.g:2979:2: ( RULE_STRING )
            // InternalGSelfOperatingHeuristicText.g:2980:3: RULE_STRING
            {
             before(grammarAccess.getGlobalAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ValueAssignment_3_1"


    // $ANTLR start "rule__Local__NameAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:2989:1: rule__Local__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Local__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2993:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2994:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2994:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2995:3: RULE_ID
            {
             before(grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__NameAssignment_0"


    // $ANTLR start "rule__Local__TypeAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3004:1: rule__Local__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Local__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3008:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:3009:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:3009:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:3010:3: ruleDataType
            {
             before(grammarAccess.getLocalAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getLocalAccess().getTypeDataTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__TypeAssignment_2"


    // $ANTLR start "rule__Local__ValueAssignment_3_1"
    // InternalGSelfOperatingHeuristicText.g:3019:1: rule__Local__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Local__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3023:1: ( ( RULE_STRING ) )
            // InternalGSelfOperatingHeuristicText.g:3024:2: ( RULE_STRING )
            {
            // InternalGSelfOperatingHeuristicText.g:3024:2: ( RULE_STRING )
            // InternalGSelfOperatingHeuristicText.g:3025:3: RULE_STRING
            {
             before(grammarAccess.getLocalAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocalAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__ValueAssignment_3_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:3034:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3038:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3039:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3039:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3040:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__LocalsAssignment_2_2"
    // InternalGSelfOperatingHeuristicText.g:3049:1: rule__State__LocalsAssignment_2_2 : ( ruleLocal ) ;
    public final void rule__State__LocalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3053:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:3054:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:3054:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:3055:3: ruleLocal
            {
             before(grammarAccess.getStateAccess().getLocalsLocalParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getStateAccess().getLocalsLocalParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__LocalsAssignment_2_2"


    // $ANTLR start "rule__State__TransitionsAssignment_3_2"
    // InternalGSelfOperatingHeuristicText.g:3064:1: rule__State__TransitionsAssignment_3_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3068:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:3069:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:3069:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:3070:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_3_2"


    // $ANTLR start "rule__Alter__StateAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3079:1: rule__Alter__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Alter__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3083:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3084:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3084:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3085:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAccess().getStateStateCrossReference_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:3086:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3087:4: RULE_ID
            {
             before(grammarAccess.getAlterAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAlterAccess().getStateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__StateAssignment_2"


    // $ANTLR start "rule__Alter__LocalsAssignment_3_2"
    // InternalGSelfOperatingHeuristicText.g:3098:1: rule__Alter__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__Alter__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3102:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:3103:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:3103:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:3104:3: ruleLocal
            {
             before(grammarAccess.getAlterAccess().getLocalsLocalParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getAlterAccess().getLocalsLocalParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__LocalsAssignment_3_2"


    // $ANTLR start "rule__Alter__TransitionsAssignment_4_2"
    // InternalGSelfOperatingHeuristicText.g:3113:1: rule__Alter__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Alter__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3117:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:3118:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:3118:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:3119:3: ruleTransition
            {
             before(grammarAccess.getAlterAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAlterAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alter__TransitionsAssignment_4_2"


    // $ANTLR start "rule__Transition__EventAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:3128:1: rule__Transition__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3132:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3133:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3133:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3134:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            // InternalGSelfOperatingHeuristicText.g:3135:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3136:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_1"


    // $ANTLR start "rule__Transition__StateAssignment_3"
    // InternalGSelfOperatingHeuristicText.g:3147:1: rule__Transition__StateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3151:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3152:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3152:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3153:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:3154:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3155:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_3"


    // $ANTLR start "rule__Transition__ConditionAssignment_4_1"
    // InternalGSelfOperatingHeuristicText.g:3166:1: rule__Transition__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3170:1: ( ( ruleCondition ) )
            // InternalGSelfOperatingHeuristicText.g:3171:2: ( ruleCondition )
            {
            // InternalGSelfOperatingHeuristicText.g:3171:2: ( ruleCondition )
            // InternalGSelfOperatingHeuristicText.g:3172:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionAssignment_4_1"


    // $ANTLR start "rule__Transition__AssignmentAssignment_4_2_1"
    // InternalGSelfOperatingHeuristicText.g:3181:1: rule__Transition__AssignmentAssignment_4_2_1 : ( ruleAssignment ) ;
    public final void rule__Transition__AssignmentAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3185:1: ( ( ruleAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:3186:2: ( ruleAssignment )
            {
            // InternalGSelfOperatingHeuristicText.g:3186:2: ( ruleAssignment )
            // InternalGSelfOperatingHeuristicText.g:3187:3: ruleAssignment
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignmentParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAssignmentAssignmentParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__AssignmentAssignment_4_2_1"


    // $ANTLR start "rule__Event__NameAssignment"
    // InternalGSelfOperatingHeuristicText.g:3196:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3200:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3201:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3201:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3202:3: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment"


    // $ANTLR start "rule__Condition__LeftAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:3211:1: rule__Condition__LeftAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3215:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3216:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3216:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3217:3: ruleVariableReference
            {
             before(grammarAccess.getConditionAccess().getLeftVariableReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLeftVariableReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__LeftAssignment_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:3226:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3230:1: ( ( ruleComparisonOperator ) )
            // InternalGSelfOperatingHeuristicText.g:3231:2: ( ruleComparisonOperator )
            {
            // InternalGSelfOperatingHeuristicText.g:3231:2: ( ruleComparisonOperator )
            // InternalGSelfOperatingHeuristicText.g:3232:3: ruleComparisonOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_1"


    // $ANTLR start "rule__Condition__RightAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3241:1: rule__Condition__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3245:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3246:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3246:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3247:3: ruleValue
            {
             before(grammarAccess.getConditionAccess().getRightValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getRightValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__RightAssignment_2"


    // $ANTLR start "rule__Assignment__CurrentVarAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:3256:1: rule__Assignment__CurrentVarAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Assignment__CurrentVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3260:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3261:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3261:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3262:3: ruleVariableReference
            {
             before(grammarAccess.getAssignmentAccess().getCurrentVarVariableReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getCurrentVarVariableReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__CurrentVarAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3271:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3275:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3276:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3276:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3277:3: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__VariableReference__VariableAssignment"
    // InternalGSelfOperatingHeuristicText.g:3286:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3290:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3291:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3291:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3292:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            // InternalGSelfOperatingHeuristicText.g:3293:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3294:4: RULE_ID
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__VariableAssignment"


    // $ANTLR start "rule__Automaton__NameAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:3305:1: rule__Automaton__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3309:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3310:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3310:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3311:3: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__NameAssignment_1"


    // $ANTLR start "rule__Automaton__LocationAssignment_3"
    // InternalGSelfOperatingHeuristicText.g:3320:1: rule__Automaton__LocationAssignment_3 : ( ruleLocation ) ;
    public final void rule__Automaton__LocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3324:1: ( ( ruleLocation ) )
            // InternalGSelfOperatingHeuristicText.g:3325:2: ( ruleLocation )
            {
            // InternalGSelfOperatingHeuristicText.g:3325:2: ( ruleLocation )
            // InternalGSelfOperatingHeuristicText.g:3326:3: ruleLocation
            {
             before(grammarAccess.getAutomatonAccess().getLocationLocationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getLocationLocationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__LocationAssignment_3"


    // $ANTLR start "rule__Location__StateAssignment"
    // InternalGSelfOperatingHeuristicText.g:3335:1: rule__Location__StateAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Location__StateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3339:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3340:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3340:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3341:3: ( RULE_ID )
            {
             before(grammarAccess.getLocationAccess().getStateStateCrossReference_0()); 
            // InternalGSelfOperatingHeuristicText.g:3342:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3343:4: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getStateStateIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getStateStateIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getLocationAccess().getStateStateCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__StateAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008006018678000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018600002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0007F00000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000000F0L});

}
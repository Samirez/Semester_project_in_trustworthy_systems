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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DRONE'", "'drone'", "'GLOBAL'", "'global'", "'EVENTS'", "'events'", "'AS'", "'as'", "'INIT'", "'init'", "'STATE'", "'state'", "'PROPS'", "'props'", "'TRANSITIONS'", "'transitions'", "'ALTER'", "'alter'", "'ON'", "'on'", "'TO'", "'to'", "'IF'", "'if'", "'SET'", "'set'", "'AUTOMATON'", "'automaton'", "'VERIFIERS'", "'verifiers'", "'??'", "'int'", "'boolean'", "'double'", "'String'", "'\\u00A4\\u00A4'", "'!='", "'=='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", "'='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


    // $ANTLR start "entryRuleInitial"
    // InternalGSelfOperatingHeuristicText.g:153:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:154:1: ( ruleInitial EOF )
            // InternalGSelfOperatingHeuristicText.g:155:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalGSelfOperatingHeuristicText.g:162:1: ruleInitial : ( () ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:166:2: ( ( () ) )
            // InternalGSelfOperatingHeuristicText.g:167:2: ( () )
            {
            // InternalGSelfOperatingHeuristicText.g:167:2: ( () )
            // InternalGSelfOperatingHeuristicText.g:168:3: ()
            {
             before(grammarAccess.getInitialAccess().getInitStateAction()); 
            // InternalGSelfOperatingHeuristicText.g:169:3: ()
            // InternalGSelfOperatingHeuristicText.g:169:4: 
            {
            }

             after(grammarAccess.getInitialAccess().getInitStateAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleAlter"
    // InternalGSelfOperatingHeuristicText.g:178:1: entryRuleAlter : ruleAlter EOF ;
    public final void entryRuleAlter() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:179:1: ( ruleAlter EOF )
            // InternalGSelfOperatingHeuristicText.g:180:1: ruleAlter EOF
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
    // InternalGSelfOperatingHeuristicText.g:187:1: ruleAlter : ( ( rule__Alter__Group__0 ) ) ;
    public final void ruleAlter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:191:2: ( ( ( rule__Alter__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:192:2: ( ( rule__Alter__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:192:2: ( ( rule__Alter__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:193:3: ( rule__Alter__Group__0 )
            {
             before(grammarAccess.getAlterAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:194:3: ( rule__Alter__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:194:4: rule__Alter__Group__0
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
    // InternalGSelfOperatingHeuristicText.g:203:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:204:1: ( ruleTransition EOF )
            // InternalGSelfOperatingHeuristicText.g:205:1: ruleTransition EOF
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
    // InternalGSelfOperatingHeuristicText.g:212:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:216:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:217:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:217:2: ( ( rule__Transition__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:218:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:219:3: ( rule__Transition__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:219:4: rule__Transition__Group__0
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
    // InternalGSelfOperatingHeuristicText.g:228:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:229:1: ( ruleEvent EOF )
            // InternalGSelfOperatingHeuristicText.g:230:1: ruleEvent EOF
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
    // InternalGSelfOperatingHeuristicText.g:237:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:241:2: ( ( ( rule__Event__NameAssignment ) ) )
            // InternalGSelfOperatingHeuristicText.g:242:2: ( ( rule__Event__NameAssignment ) )
            {
            // InternalGSelfOperatingHeuristicText.g:242:2: ( ( rule__Event__NameAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:243:3: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // InternalGSelfOperatingHeuristicText.g:244:3: ( rule__Event__NameAssignment )
            // InternalGSelfOperatingHeuristicText.g:244:4: rule__Event__NameAssignment
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
    // InternalGSelfOperatingHeuristicText.g:253:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:254:1: ( ruleCondition EOF )
            // InternalGSelfOperatingHeuristicText.g:255:1: ruleCondition EOF
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
    // InternalGSelfOperatingHeuristicText.g:262:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:266:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:267:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:267:2: ( ( rule__Condition__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:268:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:269:3: ( rule__Condition__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:269:4: rule__Condition__Group__0
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
    // InternalGSelfOperatingHeuristicText.g:278:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:279:1: ( ruleAssignment EOF )
            // InternalGSelfOperatingHeuristicText.g:280:1: ruleAssignment EOF
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
    // InternalGSelfOperatingHeuristicText.g:287:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:291:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:292:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:292:2: ( ( rule__Assignment__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:293:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:294:3: ( rule__Assignment__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:294:4: rule__Assignment__Group__0
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
    // InternalGSelfOperatingHeuristicText.g:303:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:304:1: ( ruleVariableReference EOF )
            // InternalGSelfOperatingHeuristicText.g:305:1: ruleVariableReference EOF
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
    // InternalGSelfOperatingHeuristicText.g:312:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:316:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // InternalGSelfOperatingHeuristicText.g:317:2: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // InternalGSelfOperatingHeuristicText.g:317:2: ( ( rule__VariableReference__VariableAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:318:3: ( rule__VariableReference__VariableAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            // InternalGSelfOperatingHeuristicText.g:319:3: ( rule__VariableReference__VariableAssignment )
            // InternalGSelfOperatingHeuristicText.g:319:4: rule__VariableReference__VariableAssignment
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
    // InternalGSelfOperatingHeuristicText.g:328:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:329:1: ( ruleValue EOF )
            // InternalGSelfOperatingHeuristicText.g:330:1: ruleValue EOF
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
    // InternalGSelfOperatingHeuristicText.g:337:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:341:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:342:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:342:2: ( ( rule__Value__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:343:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:344:3: ( rule__Value__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:344:4: rule__Value__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:353:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:354:1: ( ruleAutomaton EOF )
            // InternalGSelfOperatingHeuristicText.g:355:1: ruleAutomaton EOF
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
    // InternalGSelfOperatingHeuristicText.g:362:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:366:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:367:2: ( ( rule__Automaton__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:367:2: ( ( rule__Automaton__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:368:3: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:369:3: ( rule__Automaton__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:369:4: rule__Automaton__Group__0
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


    // $ANTLR start "entryRuleVerifiers"
    // InternalGSelfOperatingHeuristicText.g:378:1: entryRuleVerifiers : ruleVerifiers EOF ;
    public final void entryRuleVerifiers() throws RecognitionException {
        try {
            // InternalGSelfOperatingHeuristicText.g:379:1: ( ruleVerifiers EOF )
            // InternalGSelfOperatingHeuristicText.g:380:1: ruleVerifiers EOF
            {
             before(grammarAccess.getVerifiersRule()); 
            pushFollow(FOLLOW_1);
            ruleVerifiers();

            state._fsp--;

             after(grammarAccess.getVerifiersRule()); 
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
    // $ANTLR end "entryRuleVerifiers"


    // $ANTLR start "ruleVerifiers"
    // InternalGSelfOperatingHeuristicText.g:387:1: ruleVerifiers : ( ( rule__Verifiers__Group__0 ) ) ;
    public final void ruleVerifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:391:2: ( ( ( rule__Verifiers__Group__0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:392:2: ( ( rule__Verifiers__Group__0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:392:2: ( ( rule__Verifiers__Group__0 ) )
            // InternalGSelfOperatingHeuristicText.g:393:3: ( rule__Verifiers__Group__0 )
            {
             before(grammarAccess.getVerifiersAccess().getGroup()); 
            // InternalGSelfOperatingHeuristicText.g:394:3: ( rule__Verifiers__Group__0 )
            // InternalGSelfOperatingHeuristicText.g:394:4: rule__Verifiers__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verifiers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifiersAccess().getGroup()); 

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
    // $ANTLR end "ruleVerifiers"


    // $ANTLR start "ruleDataType"
    // InternalGSelfOperatingHeuristicText.g:403:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:407:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:408:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:408:2: ( ( rule__DataType__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:409:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:410:3: ( rule__DataType__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:410:4: rule__DataType__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:419:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:423:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:424:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:424:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:425:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:426:3: ( rule__ComparisonOperator__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:426:4: rule__ComparisonOperator__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:434:1: rule__Model__Alternatives_0 : ( ( 'DRONE' ) | ( 'drone' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:438:1: ( ( 'DRONE' ) | ( 'drone' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:439:2: ( 'DRONE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:439:2: ( 'DRONE' )
                    // InternalGSelfOperatingHeuristicText.g:440:3: 'DRONE'
                    {
                     before(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:445:2: ( 'drone' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:445:2: ( 'drone' )
                    // InternalGSelfOperatingHeuristicText.g:446:3: 'drone'
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
    // InternalGSelfOperatingHeuristicText.g:455:1: rule__Model__Alternatives_2_0 : ( ( 'GLOBAL' ) | ( 'global' ) );
    public final void rule__Model__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:459:1: ( ( 'GLOBAL' ) | ( 'global' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:460:2: ( 'GLOBAL' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:460:2: ( 'GLOBAL' )
                    // InternalGSelfOperatingHeuristicText.g:461:3: 'GLOBAL'
                    {
                     before(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:466:2: ( 'global' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:466:2: ( 'global' )
                    // InternalGSelfOperatingHeuristicText.g:467:3: 'global'
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
    // InternalGSelfOperatingHeuristicText.g:476:1: rule__Model__Alternatives_3_0 : ( ( 'EVENTS' ) | ( 'events' ) );
    public final void rule__Model__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:480:1: ( ( 'EVENTS' ) | ( 'events' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:481:2: ( 'EVENTS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:481:2: ( 'EVENTS' )
                    // InternalGSelfOperatingHeuristicText.g:482:3: 'EVENTS'
                    {
                     before(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:487:2: ( 'events' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:487:2: ( 'events' )
                    // InternalGSelfOperatingHeuristicText.g:488:3: 'events'
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
    // InternalGSelfOperatingHeuristicText.g:497:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) );
    public final void rule__Model__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:501:1: ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=21 && LA4_0<=24)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=29 && LA4_0<=30)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:502:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:502:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    // InternalGSelfOperatingHeuristicText.g:503:3: ( rule__Model__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getModelAccess().getStatesAssignment_4_0()); 
                    // InternalGSelfOperatingHeuristicText.g:504:3: ( rule__Model__StatesAssignment_4_0 )
                    // InternalGSelfOperatingHeuristicText.g:504:4: rule__Model__StatesAssignment_4_0
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
                    // InternalGSelfOperatingHeuristicText.g:508:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:508:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    // InternalGSelfOperatingHeuristicText.g:509:3: ( rule__Model__AltersAssignment_4_1 )
                    {
                     before(grammarAccess.getModelAccess().getAltersAssignment_4_1()); 
                    // InternalGSelfOperatingHeuristicText.g:510:3: ( rule__Model__AltersAssignment_4_1 )
                    // InternalGSelfOperatingHeuristicText.g:510:4: rule__Model__AltersAssignment_4_1
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
    // InternalGSelfOperatingHeuristicText.g:518:1: rule__Global__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Global__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:522:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:523:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:523:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:524:3: 'AS'
                    {
                     before(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:529:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:529:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:530:3: 'as'
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
    // InternalGSelfOperatingHeuristicText.g:539:1: rule__Local__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Local__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:543:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:544:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:544:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:545:3: 'AS'
                    {
                     before(grammarAccess.getLocalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLocalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:550:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:550:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:551:3: 'as'
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


    // $ANTLR start "rule__State__Alternatives_0_0"
    // InternalGSelfOperatingHeuristicText.g:560:1: rule__State__Alternatives_0_0 : ( ( 'INIT' ) | ( 'init' ) );
    public final void rule__State__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:564:1: ( ( 'INIT' ) | ( 'init' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:565:2: ( 'INIT' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:565:2: ( 'INIT' )
                    // InternalGSelfOperatingHeuristicText.g:566:3: 'INIT'
                    {
                     before(grammarAccess.getStateAccess().getINITKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getINITKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:571:2: ( 'init' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:571:2: ( 'init' )
                    // InternalGSelfOperatingHeuristicText.g:572:3: 'init'
                    {
                     before(grammarAccess.getStateAccess().getInitKeyword_0_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getInitKeyword_0_0_1()); 

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
    // $ANTLR end "rule__State__Alternatives_0_0"


    // $ANTLR start "rule__State__Alternatives_1"
    // InternalGSelfOperatingHeuristicText.g:581:1: rule__State__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__State__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:585:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:586:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:586:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:587:3: 'STATE'
                    {
                     before(grammarAccess.getStateAccess().getSTATEKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:592:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:592:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:593:3: 'state'
                    {
                     before(grammarAccess.getStateAccess().getStateKeyword_1_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getStateKeyword_1_1()); 

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
    // $ANTLR end "rule__State__Alternatives_1"


    // $ANTLR start "rule__State__Alternatives_3_0"
    // InternalGSelfOperatingHeuristicText.g:602:1: rule__State__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__State__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:606:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:607:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:607:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:608:3: 'PROPS'
                    {
                     before(grammarAccess.getStateAccess().getPROPSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:613:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:613:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:614:3: 'props'
                    {
                     before(grammarAccess.getStateAccess().getPropsKeyword_3_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPropsKeyword_3_0_1()); 

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


    // $ANTLR start "rule__State__Alternatives_4_0"
    // InternalGSelfOperatingHeuristicText.g:623:1: rule__State__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__State__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:627:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:628:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:628:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:629:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getStateAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:634:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:634:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:635:3: 'transitions'
                    {
                     before(grammarAccess.getStateAccess().getTransitionsKeyword_4_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTransitionsKeyword_4_0_1()); 

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
    // $ANTLR end "rule__State__Alternatives_4_0"


    // $ANTLR start "rule__Alter__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:644:1: rule__Alter__Alternatives_0 : ( ( 'ALTER' ) | ( 'alter' ) );
    public final void rule__Alter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:648:1: ( ( 'ALTER' ) | ( 'alter' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:649:2: ( 'ALTER' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:649:2: ( 'ALTER' )
                    // InternalGSelfOperatingHeuristicText.g:650:3: 'ALTER'
                    {
                     before(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:655:2: ( 'alter' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:655:2: ( 'alter' )
                    // InternalGSelfOperatingHeuristicText.g:656:3: 'alter'
                    {
                     before(grammarAccess.getAlterAccess().getAlterKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:665:1: rule__Alter__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__Alter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:669:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:670:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:670:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:671:3: 'STATE'
                    {
                     before(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:676:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:676:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:677:3: 'state'
                    {
                     before(grammarAccess.getAlterAccess().getStateKeyword_1_1()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:686:1: rule__Alter__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__Alter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:690:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:691:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:691:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:692:3: 'PROPS'
                    {
                     before(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:697:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:697:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:698:3: 'props'
                    {
                     before(grammarAccess.getAlterAccess().getPropsKeyword_3_0_1()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:707:1: rule__Alter__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__Alter__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:711:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:712:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:712:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:713:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:718:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:718:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:719:3: 'transitions'
                    {
                     before(grammarAccess.getAlterAccess().getTransitionsKeyword_4_0_1()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:728:1: rule__Transition__Alternatives_0 : ( ( 'ON' ) | ( 'on' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:732:1: ( ( 'ON' ) | ( 'on' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:733:2: ( 'ON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:733:2: ( 'ON' )
                    // InternalGSelfOperatingHeuristicText.g:734:3: 'ON'
                    {
                     before(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:739:2: ( 'on' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:739:2: ( 'on' )
                    // InternalGSelfOperatingHeuristicText.g:740:3: 'on'
                    {
                     before(grammarAccess.getTransitionAccess().getOnKeyword_0_1()); 
                    match(input,32,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:749:1: rule__Transition__Alternatives_2 : ( ( 'TO' ) | ( 'to' ) );
    public final void rule__Transition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:753:1: ( ( 'TO' ) | ( 'to' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:754:2: ( 'TO' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:754:2: ( 'TO' )
                    // InternalGSelfOperatingHeuristicText.g:755:3: 'TO'
                    {
                     before(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:760:2: ( 'to' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:760:2: ( 'to' )
                    // InternalGSelfOperatingHeuristicText.g:761:3: 'to'
                    {
                     before(grammarAccess.getTransitionAccess().getToKeyword_2_1()); 
                    match(input,34,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:770:1: rule__Transition__Alternatives_4_0 : ( ( 'IF' ) | ( 'if' ) );
    public final void rule__Transition__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:774:1: ( ( 'IF' ) | ( 'if' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:775:2: ( 'IF' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:775:2: ( 'IF' )
                    // InternalGSelfOperatingHeuristicText.g:776:3: 'IF'
                    {
                     before(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:781:2: ( 'if' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:781:2: ( 'if' )
                    // InternalGSelfOperatingHeuristicText.g:782:3: 'if'
                    {
                     before(grammarAccess.getTransitionAccess().getIfKeyword_4_0_1()); 
                    match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Transition__Alternatives_5_0"
    // InternalGSelfOperatingHeuristicText.g:791:1: rule__Transition__Alternatives_5_0 : ( ( 'SET' ) | ( 'set' ) );
    public final void rule__Transition__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:795:1: ( ( 'SET' ) | ( 'set' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:796:2: ( 'SET' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:796:2: ( 'SET' )
                    // InternalGSelfOperatingHeuristicText.g:797:3: 'SET'
                    {
                     before(grammarAccess.getTransitionAccess().getSETKeyword_5_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSETKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:802:2: ( 'set' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:802:2: ( 'set' )
                    // InternalGSelfOperatingHeuristicText.g:803:3: 'set'
                    {
                     before(grammarAccess.getTransitionAccess().getSetKeyword_5_0_1()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSetKeyword_5_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_5_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:812:1: rule__Value__Alternatives : ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:816:1: ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:817:2: ( RULE_BOOL )
                    {
                    // InternalGSelfOperatingHeuristicText.g:817:2: ( RULE_BOOL )
                    // InternalGSelfOperatingHeuristicText.g:818:3: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:823:2: ( RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:823:2: ( RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:824:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:829:2: ( RULE_INT )
                    {
                    // InternalGSelfOperatingHeuristicText.g:829:2: ( RULE_INT )
                    // InternalGSelfOperatingHeuristicText.g:830:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:835:2: ( RULE_DOUBLE )
                    {
                    // InternalGSelfOperatingHeuristicText.g:835:2: ( RULE_DOUBLE )
                    // InternalGSelfOperatingHeuristicText.g:836:3: RULE_DOUBLE
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
    // InternalGSelfOperatingHeuristicText.g:845:1: rule__Automaton__Alternatives_0 : ( ( 'AUTOMATON' ) | ( 'automaton' ) );
    public final void rule__Automaton__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:849:1: ( ( 'AUTOMATON' ) | ( 'automaton' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            else if ( (LA20_0==40) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:850:2: ( 'AUTOMATON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:850:2: ( 'AUTOMATON' )
                    // InternalGSelfOperatingHeuristicText.g:851:3: 'AUTOMATON'
                    {
                     before(grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:856:2: ( 'automaton' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:856:2: ( 'automaton' )
                    // InternalGSelfOperatingHeuristicText.g:857:3: 'automaton'
                    {
                     before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0_1()); 
                    match(input,40,FOLLOW_2); 
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


    // $ANTLR start "rule__Verifiers__Alternatives_0"
    // InternalGSelfOperatingHeuristicText.g:866:1: rule__Verifiers__Alternatives_0 : ( ( 'VERIFIERS' ) | ( 'verifiers' ) );
    public final void rule__Verifiers__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:870:1: ( ( 'VERIFIERS' ) | ( 'verifiers' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==42) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:871:2: ( 'VERIFIERS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:871:2: ( 'VERIFIERS' )
                    // InternalGSelfOperatingHeuristicText.g:872:3: 'VERIFIERS'
                    {
                     before(grammarAccess.getVerifiersAccess().getVERIFIERSKeyword_0_0()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getVerifiersAccess().getVERIFIERSKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:877:2: ( 'verifiers' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:877:2: ( 'verifiers' )
                    // InternalGSelfOperatingHeuristicText.g:878:3: 'verifiers'
                    {
                     before(grammarAccess.getVerifiersAccess().getVerifiersKeyword_0_1()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getVerifiersAccess().getVerifiersKeyword_0_1()); 

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
    // $ANTLR end "rule__Verifiers__Alternatives_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:887:1: rule__DataType__Alternatives : ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:891:1: ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            case 47:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:892:2: ( ( '??' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:892:2: ( ( '??' ) )
                    // InternalGSelfOperatingHeuristicText.g:893:3: ( '??' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:894:3: ( '??' )
                    // InternalGSelfOperatingHeuristicText.g:894:4: '??'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:898:2: ( ( 'int' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:898:2: ( ( 'int' ) )
                    // InternalGSelfOperatingHeuristicText.g:899:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:900:3: ( 'int' )
                    // InternalGSelfOperatingHeuristicText.g:900:4: 'int'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:904:2: ( ( 'boolean' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:904:2: ( ( 'boolean' ) )
                    // InternalGSelfOperatingHeuristicText.g:905:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:906:3: ( 'boolean' )
                    // InternalGSelfOperatingHeuristicText.g:906:4: 'boolean'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:910:2: ( ( 'double' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:910:2: ( ( 'double' ) )
                    // InternalGSelfOperatingHeuristicText.g:911:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:912:3: ( 'double' )
                    // InternalGSelfOperatingHeuristicText.g:912:4: 'double'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:916:2: ( ( 'String' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:916:2: ( ( 'String' ) )
                    // InternalGSelfOperatingHeuristicText.g:917:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:918:3: ( 'String' )
                    // InternalGSelfOperatingHeuristicText.g:918:4: 'String'
                    {
                    match(input,47,FOLLOW_2); 

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
    // InternalGSelfOperatingHeuristicText.g:926:1: rule__ComparisonOperator__Alternatives : ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:930:1: ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt23=1;
                }
                break;
            case 49:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            case 51:
                {
                alt23=4;
                }
                break;
            case 52:
                {
                alt23=5;
                }
                break;
            case 53:
                {
                alt23=6;
                }
                break;
            case 54:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:931:2: ( ( '\\u00A4\\u00A4' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:931:2: ( ( '\\u00A4\\u00A4' ) )
                    // InternalGSelfOperatingHeuristicText.g:932:3: ( '\\u00A4\\u00A4' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:933:3: ( '\\u00A4\\u00A4' )
                    // InternalGSelfOperatingHeuristicText.g:933:4: '\\u00A4\\u00A4'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:937:2: ( ( '!=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:937:2: ( ( '!=' ) )
                    // InternalGSelfOperatingHeuristicText.g:938:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:939:3: ( '!=' )
                    // InternalGSelfOperatingHeuristicText.g:939:4: '!='
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:943:2: ( ( '==' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:943:2: ( ( '==' ) )
                    // InternalGSelfOperatingHeuristicText.g:944:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:945:3: ( '==' )
                    // InternalGSelfOperatingHeuristicText.g:945:4: '=='
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:949:2: ( ( '>' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:949:2: ( ( '>' ) )
                    // InternalGSelfOperatingHeuristicText.g:950:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:951:3: ( '>' )
                    // InternalGSelfOperatingHeuristicText.g:951:4: '>'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:955:2: ( ( '<' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:955:2: ( ( '<' ) )
                    // InternalGSelfOperatingHeuristicText.g:956:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:957:3: ( '<' )
                    // InternalGSelfOperatingHeuristicText.g:957:4: '<'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGSelfOperatingHeuristicText.g:961:2: ( ( '>=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:961:2: ( ( '>=' ) )
                    // InternalGSelfOperatingHeuristicText.g:962:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 
                    // InternalGSelfOperatingHeuristicText.g:963:3: ( '>=' )
                    // InternalGSelfOperatingHeuristicText.g:963:4: '>='
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGSelfOperatingHeuristicText.g:967:2: ( ( '<=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:967:2: ( ( '<=' ) )
                    // InternalGSelfOperatingHeuristicText.g:968:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6()); 
                    // InternalGSelfOperatingHeuristicText.g:969:3: ( '<=' )
                    // InternalGSelfOperatingHeuristicText.g:969:4: '<='
                    {
                    match(input,54,FOLLOW_2); 

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
    // InternalGSelfOperatingHeuristicText.g:977:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:981:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:982:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:989:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:993:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:994:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:994:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:995:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:996:2: ( rule__Model__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:996:3: rule__Model__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:1004:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1008:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1009:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1016:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1020:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1021:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1021:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1022:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:1023:2: ( rule__Model__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:1023:3: rule__Model__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:1031:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1035:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1036:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1043:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1047:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1048:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1048:1: ( ( rule__Model__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1049:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:1050:2: ( rule__Model__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=15 && LA24_0<=16)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1050:3: rule__Model__Group_2__0
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
    // InternalGSelfOperatingHeuristicText.g:1058:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1062:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1063:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:1070:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1074:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1075:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1075:1: ( ( rule__Model__Group_3__0 )* )
            // InternalGSelfOperatingHeuristicText.g:1076:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1077:2: ( rule__Model__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=17 && LA25_0<=18)||LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1077:3: rule__Model__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGSelfOperatingHeuristicText.g:1085:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1089:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalGSelfOperatingHeuristicText.g:1090:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalGSelfOperatingHeuristicText.g:1097:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1101:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1102:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1102:1: ( ( rule__Model__Alternatives_4 )* )
            // InternalGSelfOperatingHeuristicText.g:1103:2: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // InternalGSelfOperatingHeuristicText.g:1104:2: ( rule__Model__Alternatives_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=21 && LA26_0<=24)||(LA26_0>=29 && LA26_0<=30)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1104:3: rule__Model__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalGSelfOperatingHeuristicText.g:1112:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1116:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalGSelfOperatingHeuristicText.g:1117:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

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
    // InternalGSelfOperatingHeuristicText.g:1124:1: rule__Model__Group__5__Impl : ( ( rule__Model__AutomatonAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1128:1: ( ( ( rule__Model__AutomatonAssignment_5 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1129:1: ( ( rule__Model__AutomatonAssignment_5 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1129:1: ( ( rule__Model__AutomatonAssignment_5 )* )
            // InternalGSelfOperatingHeuristicText.g:1130:2: ( rule__Model__AutomatonAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAutomatonAssignment_5()); 
            // InternalGSelfOperatingHeuristicText.g:1131:2: ( rule__Model__AutomatonAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=39 && LA27_0<=40)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1131:3: rule__Model__AutomatonAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__AutomatonAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "rule__Model__Group__6"
    // InternalGSelfOperatingHeuristicText.g:1139:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1143:1: ( rule__Model__Group__6__Impl )
            // InternalGSelfOperatingHeuristicText.g:1144:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalGSelfOperatingHeuristicText.g:1150:1: rule__Model__Group__6__Impl : ( ( rule__Model__VerifiersAssignment_6 )? ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1154:1: ( ( ( rule__Model__VerifiersAssignment_6 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1155:1: ( ( rule__Model__VerifiersAssignment_6 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1155:1: ( ( rule__Model__VerifiersAssignment_6 )? )
            // InternalGSelfOperatingHeuristicText.g:1156:2: ( rule__Model__VerifiersAssignment_6 )?
            {
             before(grammarAccess.getModelAccess().getVerifiersAssignment_6()); 
            // InternalGSelfOperatingHeuristicText.g:1157:2: ( rule__Model__VerifiersAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=41 && LA28_0<=42)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1157:3: rule__Model__VerifiersAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__VerifiersAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getVerifiersAssignment_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalGSelfOperatingHeuristicText.g:1166:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1170:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:1171:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
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
    // InternalGSelfOperatingHeuristicText.g:1178:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__Alternatives_2_0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1182:1: ( ( ( rule__Model__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1183:1: ( ( rule__Model__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1183:1: ( ( rule__Model__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1184:2: ( rule__Model__Alternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:1185:2: ( rule__Model__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:1185:3: rule__Model__Alternatives_2_0
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
    // InternalGSelfOperatingHeuristicText.g:1193:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1197:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1198:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
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
    // InternalGSelfOperatingHeuristicText.g:1205:1: rule__Model__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1209:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1210:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1210:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1211:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1220:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl rule__Model__Group_2__3 ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1224:1: ( rule__Model__Group_2__2__Impl rule__Model__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1225:2: rule__Model__Group_2__2__Impl rule__Model__Group_2__3
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
    // InternalGSelfOperatingHeuristicText.g:1232:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__GlobalsAssignment_2_2 )* ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1236:1: ( ( ( rule__Model__GlobalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1237:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1237:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1238:2: ( rule__Model__GlobalsAssignment_2_2 )*
            {
             before(grammarAccess.getModelAccess().getGlobalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1239:2: ( rule__Model__GlobalsAssignment_2_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1239:3: rule__Model__GlobalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__GlobalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalGSelfOperatingHeuristicText.g:1247:1: rule__Model__Group_2__3 : rule__Model__Group_2__3__Impl ;
    public final void rule__Model__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1251:1: ( rule__Model__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1252:2: rule__Model__Group_2__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1258:1: rule__Model__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1262:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1263:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1263:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1264:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1274:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1278:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1279:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1286:1: rule__Model__Group_3__0__Impl : ( ( rule__Model__Alternatives_3_0 )* ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1290:1: ( ( ( rule__Model__Alternatives_3_0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1291:1: ( ( rule__Model__Alternatives_3_0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1291:1: ( ( rule__Model__Alternatives_3_0 )* )
            // InternalGSelfOperatingHeuristicText.g:1292:2: ( rule__Model__Alternatives_3_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1293:2: ( rule__Model__Alternatives_3_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=17 && LA30_0<=18)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1293:3: rule__Model__Alternatives_3_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Alternatives_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalGSelfOperatingHeuristicText.g:1301:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1305:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1306:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:1313:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1317:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1318:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1318:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1319:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1328:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1332:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1333:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:1340:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__EventsAssignment_3_2 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1344:1: ( ( ( rule__Model__EventsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1345:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1345:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1346:2: ( rule__Model__EventsAssignment_3_2 )*
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1347:2: ( rule__Model__EventsAssignment_3_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1347:3: rule__Model__EventsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__EventsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalGSelfOperatingHeuristicText.g:1355:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1359:1: ( rule__Model__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1360:2: rule__Model__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1366:1: rule__Model__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1370:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1371:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1371:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1372:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1382:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1386:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1387:2: rule__Global__Group__0__Impl rule__Global__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1394:1: rule__Global__Group__0__Impl : ( ( rule__Global__NameAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1398:1: ( ( ( rule__Global__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1399:1: ( ( rule__Global__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1399:1: ( ( rule__Global__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1400:2: ( rule__Global__NameAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1401:2: ( rule__Global__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1401:3: rule__Global__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1409:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1413:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1414:2: rule__Global__Group__1__Impl rule__Global__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1421:1: rule__Global__Group__1__Impl : ( ( rule__Global__Alternatives_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1425:1: ( ( ( rule__Global__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1426:1: ( ( rule__Global__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1426:1: ( ( rule__Global__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1427:2: ( rule__Global__Alternatives_1 )
            {
             before(grammarAccess.getGlobalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1428:2: ( rule__Global__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1428:3: rule__Global__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1436:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1440:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1441:2: rule__Global__Group__2__Impl rule__Global__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1448:1: rule__Global__Group__2__Impl : ( ( rule__Global__TypeAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1452:1: ( ( ( rule__Global__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1453:1: ( ( rule__Global__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1453:1: ( ( rule__Global__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1454:2: ( rule__Global__TypeAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1455:2: ( rule__Global__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1455:3: rule__Global__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1463:1: rule__Global__Group__3 : rule__Global__Group__3__Impl rule__Global__Group__4 ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1467:1: ( rule__Global__Group__3__Impl rule__Global__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1468:2: rule__Global__Group__3__Impl rule__Global__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Global__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__4();

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
    // InternalGSelfOperatingHeuristicText.g:1475:1: rule__Global__Group__3__Impl : ( '=' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1479:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1480:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1480:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1481:2: '='
            {
             before(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3()); 

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


    // $ANTLR start "rule__Global__Group__4"
    // InternalGSelfOperatingHeuristicText.g:1490:1: rule__Global__Group__4 : rule__Global__Group__4__Impl ;
    public final void rule__Global__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1494:1: ( rule__Global__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1495:2: rule__Global__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__4__Impl();

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
    // $ANTLR end "rule__Global__Group__4"


    // $ANTLR start "rule__Global__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:1501:1: rule__Global__Group__4__Impl : ( ( rule__Global__ValueAssignment_4 ) ) ;
    public final void rule__Global__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1505:1: ( ( ( rule__Global__ValueAssignment_4 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1506:1: ( ( rule__Global__ValueAssignment_4 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1506:1: ( ( rule__Global__ValueAssignment_4 ) )
            // InternalGSelfOperatingHeuristicText.g:1507:2: ( rule__Global__ValueAssignment_4 )
            {
             before(grammarAccess.getGlobalAccess().getValueAssignment_4()); 
            // InternalGSelfOperatingHeuristicText.g:1508:2: ( rule__Global__ValueAssignment_4 )
            // InternalGSelfOperatingHeuristicText.g:1508:3: rule__Global__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Global__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Global__Group__4__Impl"


    // $ANTLR start "rule__Local__Group__0"
    // InternalGSelfOperatingHeuristicText.g:1517:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1521:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1522:2: rule__Local__Group__0__Impl rule__Local__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1529:1: rule__Local__Group__0__Impl : ( ( rule__Local__NameAssignment_0 ) ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1533:1: ( ( ( rule__Local__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1534:1: ( ( rule__Local__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1534:1: ( ( rule__Local__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1535:2: ( rule__Local__NameAssignment_0 )
            {
             before(grammarAccess.getLocalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1536:2: ( rule__Local__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1536:3: rule__Local__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1544:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1548:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1549:2: rule__Local__Group__1__Impl rule__Local__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1556:1: rule__Local__Group__1__Impl : ( ( rule__Local__Alternatives_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1560:1: ( ( ( rule__Local__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1561:1: ( ( rule__Local__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1561:1: ( ( rule__Local__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1562:2: ( rule__Local__Alternatives_1 )
            {
             before(grammarAccess.getLocalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1563:2: ( rule__Local__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1563:3: rule__Local__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1571:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1575:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1576:2: rule__Local__Group__2__Impl rule__Local__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1583:1: rule__Local__Group__2__Impl : ( ( rule__Local__TypeAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1587:1: ( ( ( rule__Local__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1588:1: ( ( rule__Local__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1588:1: ( ( rule__Local__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1589:2: ( rule__Local__TypeAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1590:2: ( rule__Local__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1590:3: rule__Local__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1598:1: rule__Local__Group__3 : rule__Local__Group__3__Impl rule__Local__Group__4 ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1602:1: ( rule__Local__Group__3__Impl rule__Local__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1603:2: rule__Local__Group__3__Impl rule__Local__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Local__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local__Group__4();

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
    // InternalGSelfOperatingHeuristicText.g:1610:1: rule__Local__Group__3__Impl : ( '=' ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1614:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1615:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1615:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1616:2: '='
            {
             before(grammarAccess.getLocalAccess().getEqualsSignKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLocalAccess().getEqualsSignKeyword_3()); 

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


    // $ANTLR start "rule__Local__Group__4"
    // InternalGSelfOperatingHeuristicText.g:1625:1: rule__Local__Group__4 : rule__Local__Group__4__Impl ;
    public final void rule__Local__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1629:1: ( rule__Local__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1630:2: rule__Local__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Local__Group__4__Impl();

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
    // $ANTLR end "rule__Local__Group__4"


    // $ANTLR start "rule__Local__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:1636:1: rule__Local__Group__4__Impl : ( ( rule__Local__ValueAssignment_4 ) ) ;
    public final void rule__Local__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1640:1: ( ( ( rule__Local__ValueAssignment_4 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1641:1: ( ( rule__Local__ValueAssignment_4 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1641:1: ( ( rule__Local__ValueAssignment_4 ) )
            // InternalGSelfOperatingHeuristicText.g:1642:2: ( rule__Local__ValueAssignment_4 )
            {
             before(grammarAccess.getLocalAccess().getValueAssignment_4()); 
            // InternalGSelfOperatingHeuristicText.g:1643:2: ( rule__Local__ValueAssignment_4 )
            // InternalGSelfOperatingHeuristicText.g:1643:3: rule__Local__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Local__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Local__Group__4__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalGSelfOperatingHeuristicText.g:1652:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1656:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1657:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGSelfOperatingHeuristicText.g:1664:1: rule__State__Group__0__Impl : ( ( rule__State__Group_0__0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1668:1: ( ( ( rule__State__Group_0__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1669:1: ( ( rule__State__Group_0__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1669:1: ( ( rule__State__Group_0__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1670:2: ( rule__State__Group_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0()); 
            // InternalGSelfOperatingHeuristicText.g:1671:2: ( rule__State__Group_0__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=21 && LA32_0<=22)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1671:3: rule__State__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_0()); 

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
    // InternalGSelfOperatingHeuristicText.g:1679:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1683:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1684:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGSelfOperatingHeuristicText.g:1691:1: rule__State__Group__1__Impl : ( ( rule__State__Alternatives_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1695:1: ( ( ( rule__State__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1696:1: ( ( rule__State__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1696:1: ( ( rule__State__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1697:2: ( rule__State__Alternatives_1 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1698:2: ( rule__State__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1698:3: rule__State__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_1()); 

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
    // InternalGSelfOperatingHeuristicText.g:1706:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1710:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1711:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGSelfOperatingHeuristicText.g:1718:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1722:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1723:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1723:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1724:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1725:2: ( rule__State__NameAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1725:3: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

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
    // InternalGSelfOperatingHeuristicText.g:1733:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1737:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1738:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

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
    // InternalGSelfOperatingHeuristicText.g:1745:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1749:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1750:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1750:1: ( ( rule__State__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1751:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1752:2: ( rule__State__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=25 && LA33_0<=26)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1752:3: rule__State__Group_3__0
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


    // $ANTLR start "rule__State__Group__4"
    // InternalGSelfOperatingHeuristicText.g:1760:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1764:1: ( rule__State__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1765:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__4__Impl();

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
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalGSelfOperatingHeuristicText.g:1771:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1775:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1776:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1776:1: ( ( rule__State__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1777:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:1778:2: ( rule__State__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=27 && LA34_0<=28)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1778:3: rule__State__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group_0__0"
    // InternalGSelfOperatingHeuristicText.g:1787:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1791:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // InternalGSelfOperatingHeuristicText.g:1792:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
            {
            pushFollow(FOLLOW_1);
            rule__State__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_0__1();

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
    // $ANTLR end "rule__State__Group_0__0"


    // $ANTLR start "rule__State__Group_0__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1799:1: rule__State__Group_0__0__Impl : ( ( rule__State__Alternatives_0_0 ) ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1803:1: ( ( ( rule__State__Alternatives_0_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1804:1: ( ( rule__State__Alternatives_0_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1804:1: ( ( rule__State__Alternatives_0_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1805:2: ( rule__State__Alternatives_0_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_0_0()); 
            // InternalGSelfOperatingHeuristicText.g:1806:2: ( rule__State__Alternatives_0_0 )
            // InternalGSelfOperatingHeuristicText.g:1806:3: rule__State__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_0_0()); 

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
    // $ANTLR end "rule__State__Group_0__0__Impl"


    // $ANTLR start "rule__State__Group_0__1"
    // InternalGSelfOperatingHeuristicText.g:1814:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1818:1: ( rule__State__Group_0__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1819:2: rule__State__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_0__1__Impl();

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
    // $ANTLR end "rule__State__Group_0__1"


    // $ANTLR start "rule__State__Group_0__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1825:1: rule__State__Group_0__1__Impl : ( ( rule__State__InitAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1829:1: ( ( ( rule__State__InitAssignment_0_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1830:1: ( ( rule__State__InitAssignment_0_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1830:1: ( ( rule__State__InitAssignment_0_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1831:2: ( rule__State__InitAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getInitAssignment_0_1()); 
            // InternalGSelfOperatingHeuristicText.g:1832:2: ( rule__State__InitAssignment_0_1 )
            // InternalGSelfOperatingHeuristicText.g:1832:3: rule__State__InitAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__State__InitAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInitAssignment_0_1()); 

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
    // $ANTLR end "rule__State__Group_0__1__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalGSelfOperatingHeuristicText.g:1841:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1845:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1846:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1853:1: rule__State__Group_3__0__Impl : ( ( rule__State__Alternatives_3_0 ) ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1857:1: ( ( ( rule__State__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1858:1: ( ( rule__State__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1858:1: ( ( rule__State__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1859:2: ( rule__State__Alternatives_3_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1860:2: ( rule__State__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:1860:3: rule__State__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:1868:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1872:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1873:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGSelfOperatingHeuristicText.g:1880:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1884:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1885:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1885:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1886:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1895:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1899:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1900:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalGSelfOperatingHeuristicText.g:1907:1: rule__State__Group_3__2__Impl : ( ( rule__State__LocalsAssignment_3_2 )* ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1911:1: ( ( ( rule__State__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1912:1: ( ( rule__State__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1912:1: ( ( rule__State__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1913:2: ( rule__State__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getStateAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1914:2: ( rule__State__LocalsAssignment_3_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1914:3: rule__State__LocalsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__State__LocalsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getLocalsAssignment_3_2()); 

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
    // InternalGSelfOperatingHeuristicText.g:1922:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1926:1: ( rule__State__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1927:2: rule__State__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1933:1: rule__State__Group_3__3__Impl : ( '}' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1937:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1938:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1938:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1939:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,56,FOLLOW_2); 
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


    // $ANTLR start "rule__State__Group_4__0"
    // InternalGSelfOperatingHeuristicText.g:1949:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1953:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:1954:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__1();

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
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:1961:1: rule__State__Group_4__0__Impl : ( ( rule__State__Alternatives_4_0 ) ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1965:1: ( ( ( rule__State__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1966:1: ( ( rule__State__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1966:1: ( ( rule__State__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1967:2: ( rule__State__Alternatives_4_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:1968:2: ( rule__State__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:1968:3: rule__State__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // InternalGSelfOperatingHeuristicText.g:1976:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1980:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:1981:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__State__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__2();

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
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:1988:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1992:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1993:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1993:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1994:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group_4__2"
    // InternalGSelfOperatingHeuristicText.g:2003:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2007:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:2008:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__State__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__3();

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
    // $ANTLR end "rule__State__Group_4__2"


    // $ANTLR start "rule__State__Group_4__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:2015:1: rule__State__Group_4__2__Impl : ( ( rule__State__TransitionsAssignment_4_2 )* ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2019:1: ( ( ( rule__State__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2020:1: ( ( rule__State__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2020:1: ( ( rule__State__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2021:2: ( rule__State__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2022:2: ( rule__State__TransitionsAssignment_4_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=31 && LA36_0<=32)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2022:3: rule__State__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__TransitionsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_4_2()); 

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
    // $ANTLR end "rule__State__Group_4__2__Impl"


    // $ANTLR start "rule__State__Group_4__3"
    // InternalGSelfOperatingHeuristicText.g:2030:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2034:1: ( rule__State__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2035:2: rule__State__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__3__Impl();

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
    // $ANTLR end "rule__State__Group_4__3"


    // $ANTLR start "rule__State__Group_4__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:2041:1: rule__State__Group_4__3__Impl : ( '}' ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2045:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2046:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2046:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2047:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__State__Group_4__3__Impl"


    // $ANTLR start "rule__Alter__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2057:1: rule__Alter__Group__0 : rule__Alter__Group__0__Impl rule__Alter__Group__1 ;
    public final void rule__Alter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2061:1: ( rule__Alter__Group__0__Impl rule__Alter__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2062:2: rule__Alter__Group__0__Impl rule__Alter__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalGSelfOperatingHeuristicText.g:2069:1: rule__Alter__Group__0__Impl : ( ( rule__Alter__Alternatives_0 ) ) ;
    public final void rule__Alter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2073:1: ( ( ( rule__Alter__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2074:1: ( ( rule__Alter__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2074:1: ( ( rule__Alter__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2075:2: ( rule__Alter__Alternatives_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2076:2: ( rule__Alter__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2076:3: rule__Alter__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2084:1: rule__Alter__Group__1 : rule__Alter__Group__1__Impl rule__Alter__Group__2 ;
    public final void rule__Alter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2088:1: ( rule__Alter__Group__1__Impl rule__Alter__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2089:2: rule__Alter__Group__1__Impl rule__Alter__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2096:1: rule__Alter__Group__1__Impl : ( ( rule__Alter__Alternatives_1 ) ) ;
    public final void rule__Alter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2100:1: ( ( ( rule__Alter__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2101:1: ( ( rule__Alter__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2101:1: ( ( rule__Alter__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2102:2: ( rule__Alter__Alternatives_1 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:2103:2: ( rule__Alter__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:2103:3: rule__Alter__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:2111:1: rule__Alter__Group__2 : rule__Alter__Group__2__Impl rule__Alter__Group__3 ;
    public final void rule__Alter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2115:1: ( rule__Alter__Group__2__Impl rule__Alter__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2116:2: rule__Alter__Group__2__Impl rule__Alter__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGSelfOperatingHeuristicText.g:2123:1: rule__Alter__Group__2__Impl : ( ( rule__Alter__StateAssignment_2 ) ) ;
    public final void rule__Alter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2127:1: ( ( ( rule__Alter__StateAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2128:1: ( ( rule__Alter__StateAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2128:1: ( ( rule__Alter__StateAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2129:2: ( rule__Alter__StateAssignment_2 )
            {
             before(grammarAccess.getAlterAccess().getStateAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2130:2: ( rule__Alter__StateAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2130:3: rule__Alter__StateAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2138:1: rule__Alter__Group__3 : rule__Alter__Group__3__Impl rule__Alter__Group__4 ;
    public final void rule__Alter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2142:1: ( rule__Alter__Group__3__Impl rule__Alter__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2143:2: rule__Alter__Group__3__Impl rule__Alter__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalGSelfOperatingHeuristicText.g:2150:1: rule__Alter__Group__3__Impl : ( ( rule__Alter__Group_3__0 )? ) ;
    public final void rule__Alter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2154:1: ( ( ( rule__Alter__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2155:1: ( ( rule__Alter__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2155:1: ( ( rule__Alter__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2156:2: ( rule__Alter__Group_3__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:2157:2: ( rule__Alter__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=25 && LA37_0<=26)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2157:3: rule__Alter__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:2165:1: rule__Alter__Group__4 : rule__Alter__Group__4__Impl ;
    public final void rule__Alter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2169:1: ( rule__Alter__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2170:2: rule__Alter__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2176:1: rule__Alter__Group__4__Impl : ( ( rule__Alter__Group_4__0 )? ) ;
    public final void rule__Alter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2180:1: ( ( ( rule__Alter__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2181:1: ( ( rule__Alter__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2181:1: ( ( rule__Alter__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2182:2: ( rule__Alter__Group_4__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2183:2: ( rule__Alter__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=27 && LA38_0<=28)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2183:3: rule__Alter__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:2192:1: rule__Alter__Group_3__0 : rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 ;
    public final void rule__Alter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2196:1: ( rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:2197:2: rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:2204:1: rule__Alter__Group_3__0__Impl : ( ( rule__Alter__Alternatives_3_0 ) ) ;
    public final void rule__Alter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2208:1: ( ( ( rule__Alter__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2209:1: ( ( rule__Alter__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2209:1: ( ( rule__Alter__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2210:2: ( rule__Alter__Alternatives_3_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:2211:2: ( rule__Alter__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:2211:3: rule__Alter__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:2219:1: rule__Alter__Group_3__1 : rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 ;
    public final void rule__Alter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2223:1: ( rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:2224:2: rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:2231:1: rule__Alter__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2235:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2236:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2236:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2237:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2246:1: rule__Alter__Group_3__2 : rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 ;
    public final void rule__Alter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2250:1: ( rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:2251:2: rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:2258:1: rule__Alter__Group_3__2__Impl : ( ( rule__Alter__LocalsAssignment_3_2 )* ) ;
    public final void rule__Alter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2262:1: ( ( ( rule__Alter__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2263:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2263:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2264:2: ( rule__Alter__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getAlterAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:2265:2: ( rule__Alter__LocalsAssignment_3_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2265:3: rule__Alter__LocalsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Alter__LocalsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalGSelfOperatingHeuristicText.g:2273:1: rule__Alter__Group_3__3 : rule__Alter__Group_3__3__Impl ;
    public final void rule__Alter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2277:1: ( rule__Alter__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2278:2: rule__Alter__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2284:1: rule__Alter__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2288:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2289:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2289:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2290:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2300:1: rule__Alter__Group_4__0 : rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 ;
    public final void rule__Alter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2304:1: ( rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2305:2: rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1
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
    // InternalGSelfOperatingHeuristicText.g:2312:1: rule__Alter__Group_4__0__Impl : ( ( rule__Alter__Alternatives_4_0 ) ) ;
    public final void rule__Alter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2316:1: ( ( ( rule__Alter__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2317:1: ( ( rule__Alter__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2317:1: ( ( rule__Alter__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2318:2: ( rule__Alter__Alternatives_4_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2319:2: ( rule__Alter__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2319:3: rule__Alter__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2327:1: rule__Alter__Group_4__1 : rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 ;
    public final void rule__Alter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2331:1: ( rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2332:2: rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalGSelfOperatingHeuristicText.g:2339:1: rule__Alter__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2343:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2344:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2344:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2345:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2354:1: rule__Alter__Group_4__2 : rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 ;
    public final void rule__Alter__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2358:1: ( rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:2359:2: rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalGSelfOperatingHeuristicText.g:2366:1: rule__Alter__Group_4__2__Impl : ( ( rule__Alter__TransitionsAssignment_4_2 )* ) ;
    public final void rule__Alter__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2370:1: ( ( ( rule__Alter__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2371:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2371:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2372:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2373:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=31 && LA40_0<=32)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2373:3: rule__Alter__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Alter__TransitionsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalGSelfOperatingHeuristicText.g:2381:1: rule__Alter__Group_4__3 : rule__Alter__Group_4__3__Impl ;
    public final void rule__Alter__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2385:1: ( rule__Alter__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2386:2: rule__Alter__Group_4__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2392:1: rule__Alter__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2396:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2397:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2397:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2398:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2408:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2412:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2413:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2420:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2424:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2425:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2425:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2426:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2427:2: ( rule__Transition__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2427:3: rule__Transition__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2435:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2439:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2440:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalGSelfOperatingHeuristicText.g:2447:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__EventAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2451:1: ( ( ( rule__Transition__EventAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2452:1: ( ( rule__Transition__EventAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2452:1: ( ( rule__Transition__EventAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2453:2: ( rule__Transition__EventAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2454:2: ( rule__Transition__EventAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2454:3: rule__Transition__EventAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2462:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2466:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2467:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2474:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Alternatives_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2478:1: ( ( ( rule__Transition__Alternatives_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2479:1: ( ( rule__Transition__Alternatives_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2479:1: ( ( rule__Transition__Alternatives_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2480:2: ( rule__Transition__Alternatives_2 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            // InternalGSelfOperatingHeuristicText.g:2481:2: ( rule__Transition__Alternatives_2 )
            // InternalGSelfOperatingHeuristicText.g:2481:3: rule__Transition__Alternatives_2
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
    // InternalGSelfOperatingHeuristicText.g:2489:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2493:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2494:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalGSelfOperatingHeuristicText.g:2501:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__StateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2505:1: ( ( ( rule__Transition__StateAssignment_3 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2506:1: ( ( rule__Transition__StateAssignment_3 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2506:1: ( ( rule__Transition__StateAssignment_3 ) )
            // InternalGSelfOperatingHeuristicText.g:2507:2: ( rule__Transition__StateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2508:2: ( rule__Transition__StateAssignment_3 )
            // InternalGSelfOperatingHeuristicText.g:2508:3: rule__Transition__StateAssignment_3
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
    // InternalGSelfOperatingHeuristicText.g:2516:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2520:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalGSelfOperatingHeuristicText.g:2521:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

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
    // InternalGSelfOperatingHeuristicText.g:2528:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2532:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2533:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2533:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2534:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2535:2: ( rule__Transition__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=35 && LA41_0<=36)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2535:3: rule__Transition__Group_4__0
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


    // $ANTLR start "rule__Transition__Group__5"
    // InternalGSelfOperatingHeuristicText.g:2543:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2547:1: ( rule__Transition__Group__5__Impl )
            // InternalGSelfOperatingHeuristicText.g:2548:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

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
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalGSelfOperatingHeuristicText.g:2554:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2558:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2559:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2559:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2560:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalGSelfOperatingHeuristicText.g:2561:2: ( rule__Transition__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=37 && LA42_0<=38)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2561:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalGSelfOperatingHeuristicText.g:2570:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2574:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2575:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGSelfOperatingHeuristicText.g:2582:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__Alternatives_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2586:1: ( ( ( rule__Transition__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2587:1: ( ( rule__Transition__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2587:1: ( ( rule__Transition__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2588:2: ( rule__Transition__Alternatives_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2589:2: ( rule__Transition__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2589:3: rule__Transition__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2597:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2601:1: ( rule__Transition__Group_4__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2602:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1__Impl();

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
    // InternalGSelfOperatingHeuristicText.g:2608:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ConditionAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2612:1: ( ( ( rule__Transition__ConditionAssignment_4_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2613:1: ( ( rule__Transition__ConditionAssignment_4_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2613:1: ( ( rule__Transition__ConditionAssignment_4_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2614:2: ( rule__Transition__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_4_1()); 
            // InternalGSelfOperatingHeuristicText.g:2615:2: ( rule__Transition__ConditionAssignment_4_1 )
            // InternalGSelfOperatingHeuristicText.g:2615:3: rule__Transition__ConditionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionAssignment_4_1();

            state._fsp--;


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


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalGSelfOperatingHeuristicText.g:2624:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2628:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalGSelfOperatingHeuristicText.g:2629:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

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
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2636:1: rule__Transition__Group_5__0__Impl : ( ( rule__Transition__Alternatives_5_0 ) ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2640:1: ( ( ( rule__Transition__Alternatives_5_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2641:1: ( ( rule__Transition__Alternatives_5_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2641:1: ( ( rule__Transition__Alternatives_5_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2642:2: ( rule__Transition__Alternatives_5_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_5_0()); 
            // InternalGSelfOperatingHeuristicText.g:2643:2: ( rule__Transition__Alternatives_5_0 )
            // InternalGSelfOperatingHeuristicText.g:2643:3: rule__Transition__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_5_0()); 

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
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalGSelfOperatingHeuristicText.g:2651:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2655:1: ( rule__Transition__Group_5__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2656:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:2662:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__AssignmentAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2666:1: ( ( ( rule__Transition__AssignmentAssignment_5_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2667:1: ( ( rule__Transition__AssignmentAssignment_5_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2667:1: ( ( rule__Transition__AssignmentAssignment_5_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2668:2: ( rule__Transition__AssignmentAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignment_5_1()); 
            // InternalGSelfOperatingHeuristicText.g:2669:2: ( rule__Transition__AssignmentAssignment_5_1 )
            // InternalGSelfOperatingHeuristicText.g:2669:3: rule__Transition__AssignmentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__AssignmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAssignmentAssignment_5_1()); 

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
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2678:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2682:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2683:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2690:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2694:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2695:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2695:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2696:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2697:2: ( rule__Condition__LeftAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2697:3: rule__Condition__LeftAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2705:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2709:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2710:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:2717:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2721:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2722:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2722:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2723:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2724:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2724:3: rule__Condition__OperatorAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2732:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2736:1: ( rule__Condition__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2737:2: rule__Condition__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2743:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2747:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2748:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2748:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2749:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2750:2: ( rule__Condition__RightAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2750:3: rule__Condition__RightAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2759:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2763:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2764:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2771:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__CurrentVarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2775:1: ( ( ( rule__Assignment__CurrentVarAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2776:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2776:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2777:2: ( rule__Assignment__CurrentVarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2778:2: ( rule__Assignment__CurrentVarAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2778:3: rule__Assignment__CurrentVarAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2786:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2790:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2791:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:2798:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2802:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:2803:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:2803:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:2804:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2813:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2817:1: ( rule__Assignment__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2818:2: rule__Assignment__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2824:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2828:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2829:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2829:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2830:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2831:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2831:3: rule__Assignment__ValueAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2840:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2844:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2845:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2852:1: rule__Automaton__Group__0__Impl : ( ( rule__Automaton__Alternatives_0 ) ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2856:1: ( ( ( rule__Automaton__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2857:1: ( ( rule__Automaton__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2857:1: ( ( rule__Automaton__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2858:2: ( rule__Automaton__Alternatives_0 )
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2859:2: ( rule__Automaton__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2859:3: rule__Automaton__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2867:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2871:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2872:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2879:1: rule__Automaton__Group__1__Impl : ( ( rule__Automaton__NameAssignment_1 ) ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2883:1: ( ( ( rule__Automaton__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2884:1: ( ( rule__Automaton__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2884:1: ( ( rule__Automaton__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2885:2: ( rule__Automaton__NameAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2886:2: ( rule__Automaton__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2886:3: rule__Automaton__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2894:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2898:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2899:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2906:1: rule__Automaton__Group__2__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2910:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2911:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2911:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2912:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2921:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2925:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2926:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:2933:1: rule__Automaton__Group__3__Impl : ( ( rule__Automaton__StatesAssignment_3 )* ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2937:1: ( ( ( rule__Automaton__StatesAssignment_3 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2938:1: ( ( rule__Automaton__StatesAssignment_3 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2938:1: ( ( rule__Automaton__StatesAssignment_3 )* )
            // InternalGSelfOperatingHeuristicText.g:2939:2: ( rule__Automaton__StatesAssignment_3 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2940:2: ( rule__Automaton__StatesAssignment_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2940:3: rule__Automaton__StatesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Automaton__StatesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 

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
    // InternalGSelfOperatingHeuristicText.g:2948:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2952:1: ( rule__Automaton__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2953:2: rule__Automaton__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2959:1: rule__Automaton__Group__4__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2963:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2964:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2964:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2965:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,56,FOLLOW_2); 
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


    // $ANTLR start "rule__Verifiers__Group__0"
    // InternalGSelfOperatingHeuristicText.g:2975:1: rule__Verifiers__Group__0 : rule__Verifiers__Group__0__Impl rule__Verifiers__Group__1 ;
    public final void rule__Verifiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2979:1: ( rule__Verifiers__Group__0__Impl rule__Verifiers__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2980:2: rule__Verifiers__Group__0__Impl rule__Verifiers__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Verifiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verifiers__Group__1();

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
    // $ANTLR end "rule__Verifiers__Group__0"


    // $ANTLR start "rule__Verifiers__Group__0__Impl"
    // InternalGSelfOperatingHeuristicText.g:2987:1: rule__Verifiers__Group__0__Impl : ( ( rule__Verifiers__Alternatives_0 ) ) ;
    public final void rule__Verifiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2991:1: ( ( ( rule__Verifiers__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2992:1: ( ( rule__Verifiers__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2992:1: ( ( rule__Verifiers__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2993:2: ( rule__Verifiers__Alternatives_0 )
            {
             before(grammarAccess.getVerifiersAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2994:2: ( rule__Verifiers__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2994:3: rule__Verifiers__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Verifiers__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVerifiersAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Verifiers__Group__0__Impl"


    // $ANTLR start "rule__Verifiers__Group__1"
    // InternalGSelfOperatingHeuristicText.g:3002:1: rule__Verifiers__Group__1 : rule__Verifiers__Group__1__Impl rule__Verifiers__Group__2 ;
    public final void rule__Verifiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3006:1: ( rule__Verifiers__Group__1__Impl rule__Verifiers__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:3007:2: rule__Verifiers__Group__1__Impl rule__Verifiers__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Verifiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verifiers__Group__2();

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
    // $ANTLR end "rule__Verifiers__Group__1"


    // $ANTLR start "rule__Verifiers__Group__1__Impl"
    // InternalGSelfOperatingHeuristicText.g:3014:1: rule__Verifiers__Group__1__Impl : ( '{' ) ;
    public final void rule__Verifiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3018:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:3019:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:3019:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:3020:2: '{'
            {
             before(grammarAccess.getVerifiersAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVerifiersAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Verifiers__Group__1__Impl"


    // $ANTLR start "rule__Verifiers__Group__2"
    // InternalGSelfOperatingHeuristicText.g:3029:1: rule__Verifiers__Group__2 : rule__Verifiers__Group__2__Impl rule__Verifiers__Group__3 ;
    public final void rule__Verifiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3033:1: ( rule__Verifiers__Group__2__Impl rule__Verifiers__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:3034:2: rule__Verifiers__Group__2__Impl rule__Verifiers__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Verifiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verifiers__Group__3();

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
    // $ANTLR end "rule__Verifiers__Group__2"


    // $ANTLR start "rule__Verifiers__Group__2__Impl"
    // InternalGSelfOperatingHeuristicText.g:3041:1: rule__Verifiers__Group__2__Impl : ( ( rule__Verifiers__VerifierAssignment_2 )* ) ;
    public final void rule__Verifiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3045:1: ( ( ( rule__Verifiers__VerifierAssignment_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:3046:1: ( ( rule__Verifiers__VerifierAssignment_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:3046:1: ( ( rule__Verifiers__VerifierAssignment_2 )* )
            // InternalGSelfOperatingHeuristicText.g:3047:2: ( rule__Verifiers__VerifierAssignment_2 )*
            {
             before(grammarAccess.getVerifiersAccess().getVerifierAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:3048:2: ( rule__Verifiers__VerifierAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_STRING) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:3048:3: rule__Verifiers__VerifierAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Verifiers__VerifierAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getVerifiersAccess().getVerifierAssignment_2()); 

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
    // $ANTLR end "rule__Verifiers__Group__2__Impl"


    // $ANTLR start "rule__Verifiers__Group__3"
    // InternalGSelfOperatingHeuristicText.g:3056:1: rule__Verifiers__Group__3 : rule__Verifiers__Group__3__Impl ;
    public final void rule__Verifiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3060:1: ( rule__Verifiers__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:3061:2: rule__Verifiers__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verifiers__Group__3__Impl();

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
    // $ANTLR end "rule__Verifiers__Group__3"


    // $ANTLR start "rule__Verifiers__Group__3__Impl"
    // InternalGSelfOperatingHeuristicText.g:3067:1: rule__Verifiers__Group__3__Impl : ( '}' ) ;
    public final void rule__Verifiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3071:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:3072:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:3072:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:3073:2: '}'
            {
             before(grammarAccess.getVerifiersAccess().getRightCurlyBracketKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVerifiersAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Verifiers__Group__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:3083:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3087:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3088:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3088:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3089:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3098:1: rule__Model__GlobalsAssignment_2_2 : ( ruleGlobal ) ;
    public final void rule__Model__GlobalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3102:1: ( ( ruleGlobal ) )
            // InternalGSelfOperatingHeuristicText.g:3103:2: ( ruleGlobal )
            {
            // InternalGSelfOperatingHeuristicText.g:3103:2: ( ruleGlobal )
            // InternalGSelfOperatingHeuristicText.g:3104:3: ruleGlobal
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
    // InternalGSelfOperatingHeuristicText.g:3113:1: rule__Model__EventsAssignment_3_2 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3117:1: ( ( ruleEvent ) )
            // InternalGSelfOperatingHeuristicText.g:3118:2: ( ruleEvent )
            {
            // InternalGSelfOperatingHeuristicText.g:3118:2: ( ruleEvent )
            // InternalGSelfOperatingHeuristicText.g:3119:3: ruleEvent
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
    // InternalGSelfOperatingHeuristicText.g:3128:1: rule__Model__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Model__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3132:1: ( ( ruleState ) )
            // InternalGSelfOperatingHeuristicText.g:3133:2: ( ruleState )
            {
            // InternalGSelfOperatingHeuristicText.g:3133:2: ( ruleState )
            // InternalGSelfOperatingHeuristicText.g:3134:3: ruleState
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
    // InternalGSelfOperatingHeuristicText.g:3143:1: rule__Model__AltersAssignment_4_1 : ( ruleAlter ) ;
    public final void rule__Model__AltersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3147:1: ( ( ruleAlter ) )
            // InternalGSelfOperatingHeuristicText.g:3148:2: ( ruleAlter )
            {
            // InternalGSelfOperatingHeuristicText.g:3148:2: ( ruleAlter )
            // InternalGSelfOperatingHeuristicText.g:3149:3: ruleAlter
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
    // InternalGSelfOperatingHeuristicText.g:3158:1: rule__Model__AutomatonAssignment_5 : ( ruleAutomaton ) ;
    public final void rule__Model__AutomatonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3162:1: ( ( ruleAutomaton ) )
            // InternalGSelfOperatingHeuristicText.g:3163:2: ( ruleAutomaton )
            {
            // InternalGSelfOperatingHeuristicText.g:3163:2: ( ruleAutomaton )
            // InternalGSelfOperatingHeuristicText.g:3164:3: ruleAutomaton
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


    // $ANTLR start "rule__Model__VerifiersAssignment_6"
    // InternalGSelfOperatingHeuristicText.g:3173:1: rule__Model__VerifiersAssignment_6 : ( ruleVerifiers ) ;
    public final void rule__Model__VerifiersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3177:1: ( ( ruleVerifiers ) )
            // InternalGSelfOperatingHeuristicText.g:3178:2: ( ruleVerifiers )
            {
            // InternalGSelfOperatingHeuristicText.g:3178:2: ( ruleVerifiers )
            // InternalGSelfOperatingHeuristicText.g:3179:3: ruleVerifiers
            {
             before(grammarAccess.getModelAccess().getVerifiersVerifiersParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVerifiers();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVerifiersVerifiersParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__VerifiersAssignment_6"


    // $ANTLR start "rule__Global__NameAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:3188:1: rule__Global__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Global__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3192:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3193:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3193:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3194:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3203:1: rule__Global__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Global__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3207:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:3208:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:3208:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:3209:3: ruleDataType
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


    // $ANTLR start "rule__Global__ValueAssignment_4"
    // InternalGSelfOperatingHeuristicText.g:3218:1: rule__Global__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__Global__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3222:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3223:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3223:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3224:3: ruleValue
            {
             before(grammarAccess.getGlobalAccess().getValueValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValueValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Global__ValueAssignment_4"


    // $ANTLR start "rule__Local__NameAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:3233:1: rule__Local__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Local__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3237:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3238:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3238:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3239:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3248:1: rule__Local__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Local__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3252:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:3253:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:3253:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:3254:3: ruleDataType
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


    // $ANTLR start "rule__Local__ValueAssignment_4"
    // InternalGSelfOperatingHeuristicText.g:3263:1: rule__Local__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__Local__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3267:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3268:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3268:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3269:3: ruleValue
            {
             before(grammarAccess.getLocalAccess().getValueValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getLocalAccess().getValueValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Local__ValueAssignment_4"


    // $ANTLR start "rule__State__InitAssignment_0_1"
    // InternalGSelfOperatingHeuristicText.g:3278:1: rule__State__InitAssignment_0_1 : ( ruleInitial ) ;
    public final void rule__State__InitAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3282:1: ( ( ruleInitial ) )
            // InternalGSelfOperatingHeuristicText.g:3283:2: ( ruleInitial )
            {
            // InternalGSelfOperatingHeuristicText.g:3283:2: ( ruleInitial )
            // InternalGSelfOperatingHeuristicText.g:3284:3: ruleInitial
            {
             before(grammarAccess.getStateAccess().getInitInitialParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInitInitialParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__State__InitAssignment_0_1"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3293:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3297:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3298:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3298:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3299:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__LocalsAssignment_3_2"
    // InternalGSelfOperatingHeuristicText.g:3308:1: rule__State__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__State__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3312:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:3313:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:3313:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:3314:3: ruleLocal
            {
             before(grammarAccess.getStateAccess().getLocalsLocalParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getStateAccess().getLocalsLocalParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__State__LocalsAssignment_3_2"


    // $ANTLR start "rule__State__TransitionsAssignment_4_2"
    // InternalGSelfOperatingHeuristicText.g:3323:1: rule__State__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3327:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:3328:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:3328:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:3329:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__State__TransitionsAssignment_4_2"


    // $ANTLR start "rule__Alter__StateAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3338:1: rule__Alter__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Alter__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3342:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3343:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3343:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3344:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAccess().getStateStateCrossReference_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:3345:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3346:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3357:1: rule__Alter__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__Alter__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3361:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:3362:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:3362:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:3363:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:3372:1: rule__Alter__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Alter__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3376:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:3377:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:3377:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:3378:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:3387:1: rule__Transition__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3391:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3392:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3392:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3393:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            // InternalGSelfOperatingHeuristicText.g:3394:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3395:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3406:1: rule__Transition__StateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3410:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3411:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3411:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3412:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:3413:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3414:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3425:1: rule__Transition__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3429:1: ( ( ruleCondition ) )
            // InternalGSelfOperatingHeuristicText.g:3430:2: ( ruleCondition )
            {
            // InternalGSelfOperatingHeuristicText.g:3430:2: ( ruleCondition )
            // InternalGSelfOperatingHeuristicText.g:3431:3: ruleCondition
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


    // $ANTLR start "rule__Transition__AssignmentAssignment_5_1"
    // InternalGSelfOperatingHeuristicText.g:3440:1: rule__Transition__AssignmentAssignment_5_1 : ( ruleAssignment ) ;
    public final void rule__Transition__AssignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3444:1: ( ( ruleAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:3445:2: ( ruleAssignment )
            {
            // InternalGSelfOperatingHeuristicText.g:3445:2: ( ruleAssignment )
            // InternalGSelfOperatingHeuristicText.g:3446:3: ruleAssignment
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignmentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAssignmentAssignmentParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Transition__AssignmentAssignment_5_1"


    // $ANTLR start "rule__Event__NameAssignment"
    // InternalGSelfOperatingHeuristicText.g:3455:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3459:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3460:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3460:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3461:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3470:1: rule__Condition__LeftAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3474:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3475:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3475:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3476:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3485:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3489:1: ( ( ruleComparisonOperator ) )
            // InternalGSelfOperatingHeuristicText.g:3490:2: ( ruleComparisonOperator )
            {
            // InternalGSelfOperatingHeuristicText.g:3490:2: ( ruleComparisonOperator )
            // InternalGSelfOperatingHeuristicText.g:3491:3: ruleComparisonOperator
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
    // InternalGSelfOperatingHeuristicText.g:3500:1: rule__Condition__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3504:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3505:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3505:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3506:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3515:1: rule__Assignment__CurrentVarAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Assignment__CurrentVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3519:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3520:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3520:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3521:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3530:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3534:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3535:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3535:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3536:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3545:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3549:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3550:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3550:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3551:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            // InternalGSelfOperatingHeuristicText.g:3552:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3553:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3564:1: rule__Automaton__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3568:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3569:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3569:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3570:3: RULE_ID
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


    // $ANTLR start "rule__Automaton__StatesAssignment_3"
    // InternalGSelfOperatingHeuristicText.g:3579:1: rule__Automaton__StatesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3583:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3584:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3584:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3585:3: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:3586:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3587:4: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getStatesStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAutomatonAccess().getStatesStateCrossReference_3_0()); 

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
    // $ANTLR end "rule__Automaton__StatesAssignment_3"


    // $ANTLR start "rule__Verifiers__VerifierAssignment_2"
    // InternalGSelfOperatingHeuristicText.g:3598:1: rule__Verifiers__VerifierAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Verifiers__VerifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3602:1: ( ( RULE_STRING ) )
            // InternalGSelfOperatingHeuristicText.g:3603:2: ( RULE_STRING )
            {
            // InternalGSelfOperatingHeuristicText.g:3603:2: ( RULE_STRING )
            // InternalGSelfOperatingHeuristicText.g:3604:3: RULE_STRING
            {
             before(grammarAccess.getVerifiersAccess().getVerifierSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifiersAccess().getVerifierSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Verifiers__VerifierAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080078061E78000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080000000060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000061E00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0080000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000180000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x007F000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000022L});

}
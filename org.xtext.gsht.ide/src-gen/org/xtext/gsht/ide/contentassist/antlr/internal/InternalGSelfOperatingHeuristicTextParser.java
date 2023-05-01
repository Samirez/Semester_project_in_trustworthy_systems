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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DRONE'", "'drone'", "'GLOBAL'", "'global'", "'EVENTS'", "'events'", "'AS'", "'as'", "'INIT'", "'init'", "'STATE'", "'state'", "'PROPS'", "'props'", "'TRANSITIONS'", "'transitions'", "'ALTER'", "'alter'", "'ON'", "'on'", "'TO'", "'to'", "'IF'", "'if'", "'SET'", "'set'", "'AUTOMATON'", "'automaton'", "'??'", "'int'", "'boolean'", "'double'", "'String'", "'\\u00A4\\u00A4'", "'!='", "'=='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", "'='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__13=13;
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


    // $ANTLR start "rule__State__Alternatives_0_0"
    // InternalGSelfOperatingHeuristicText.g:535:1: rule__State__Alternatives_0_0 : ( ( 'INIT' ) | ( 'init' ) );
    public final void rule__State__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:539:1: ( ( 'INIT' ) | ( 'init' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:540:2: ( 'INIT' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:540:2: ( 'INIT' )
                    // InternalGSelfOperatingHeuristicText.g:541:3: 'INIT'
                    {
                     before(grammarAccess.getStateAccess().getINITKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getINITKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:546:2: ( 'init' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:546:2: ( 'init' )
                    // InternalGSelfOperatingHeuristicText.g:547:3: 'init'
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
    // InternalGSelfOperatingHeuristicText.g:556:1: rule__State__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__State__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:560:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:561:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:561:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:562:3: 'STATE'
                    {
                     before(grammarAccess.getStateAccess().getSTATEKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:567:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:567:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:568:3: 'state'
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
    // InternalGSelfOperatingHeuristicText.g:577:1: rule__State__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__State__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:581:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:582:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:582:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:583:3: 'PROPS'
                    {
                     before(grammarAccess.getStateAccess().getPROPSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:588:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:588:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:589:3: 'props'
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
    // InternalGSelfOperatingHeuristicText.g:598:1: rule__State__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__State__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:602:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:603:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:603:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:604:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getStateAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:609:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:609:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:610:3: 'transitions'
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
    // InternalGSelfOperatingHeuristicText.g:619:1: rule__Alter__Alternatives_0 : ( ( 'ALTER' ) | ( 'alter' ) );
    public final void rule__Alter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:623:1: ( ( 'ALTER' ) | ( 'alter' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:624:2: ( 'ALTER' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:624:2: ( 'ALTER' )
                    // InternalGSelfOperatingHeuristicText.g:625:3: 'ALTER'
                    {
                     before(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:630:2: ( 'alter' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:630:2: ( 'alter' )
                    // InternalGSelfOperatingHeuristicText.g:631:3: 'alter'
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
    // InternalGSelfOperatingHeuristicText.g:640:1: rule__Alter__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__Alter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:644:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:645:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:645:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:646:3: 'STATE'
                    {
                     before(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:651:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:651:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:652:3: 'state'
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
    // InternalGSelfOperatingHeuristicText.g:661:1: rule__Alter__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__Alter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:665:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:666:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:666:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:667:3: 'PROPS'
                    {
                     before(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:672:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:672:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:673:3: 'props'
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
    // InternalGSelfOperatingHeuristicText.g:682:1: rule__Alter__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__Alter__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:686:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:687:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:687:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:688:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:693:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:693:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:694:3: 'transitions'
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
    // InternalGSelfOperatingHeuristicText.g:703:1: rule__Transition__Alternatives_0 : ( ( 'ON' ) | ( 'on' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:707:1: ( ( 'ON' ) | ( 'on' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:708:2: ( 'ON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:708:2: ( 'ON' )
                    // InternalGSelfOperatingHeuristicText.g:709:3: 'ON'
                    {
                     before(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:714:2: ( 'on' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:714:2: ( 'on' )
                    // InternalGSelfOperatingHeuristicText.g:715:3: 'on'
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
    // InternalGSelfOperatingHeuristicText.g:724:1: rule__Transition__Alternatives_2 : ( ( 'TO' ) | ( 'to' ) );
    public final void rule__Transition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:728:1: ( ( 'TO' ) | ( 'to' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:729:2: ( 'TO' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:729:2: ( 'TO' )
                    // InternalGSelfOperatingHeuristicText.g:730:3: 'TO'
                    {
                     before(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:735:2: ( 'to' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:735:2: ( 'to' )
                    // InternalGSelfOperatingHeuristicText.g:736:3: 'to'
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
    // InternalGSelfOperatingHeuristicText.g:745:1: rule__Transition__Alternatives_4_0 : ( ( 'IF' ) | ( 'if' ) );
    public final void rule__Transition__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:749:1: ( ( 'IF' ) | ( 'if' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:750:2: ( 'IF' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:750:2: ( 'IF' )
                    // InternalGSelfOperatingHeuristicText.g:751:3: 'IF'
                    {
                     before(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:756:2: ( 'if' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:756:2: ( 'if' )
                    // InternalGSelfOperatingHeuristicText.g:757:3: 'if'
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
    // InternalGSelfOperatingHeuristicText.g:766:1: rule__Transition__Alternatives_5_0 : ( ( 'SET' ) | ( 'set' ) );
    public final void rule__Transition__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:770:1: ( ( 'SET' ) | ( 'set' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:771:2: ( 'SET' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:771:2: ( 'SET' )
                    // InternalGSelfOperatingHeuristicText.g:772:3: 'SET'
                    {
                     before(grammarAccess.getTransitionAccess().getSETKeyword_5_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSETKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:777:2: ( 'set' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:777:2: ( 'set' )
                    // InternalGSelfOperatingHeuristicText.g:778:3: 'set'
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
    // InternalGSelfOperatingHeuristicText.g:787:1: rule__Value__Alternatives : ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:791:1: ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) )
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
                    // InternalGSelfOperatingHeuristicText.g:792:2: ( RULE_BOOL )
                    {
                    // InternalGSelfOperatingHeuristicText.g:792:2: ( RULE_BOOL )
                    // InternalGSelfOperatingHeuristicText.g:793:3: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:798:2: ( RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:798:2: ( RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:799:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:804:2: ( RULE_INT )
                    {
                    // InternalGSelfOperatingHeuristicText.g:804:2: ( RULE_INT )
                    // InternalGSelfOperatingHeuristicText.g:805:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:810:2: ( RULE_DOUBLE )
                    {
                    // InternalGSelfOperatingHeuristicText.g:810:2: ( RULE_DOUBLE )
                    // InternalGSelfOperatingHeuristicText.g:811:3: RULE_DOUBLE
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
    // InternalGSelfOperatingHeuristicText.g:820:1: rule__Automaton__Alternatives_0 : ( ( 'AUTOMATON' ) | ( 'automaton' ) );
    public final void rule__Automaton__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:824:1: ( ( 'AUTOMATON' ) | ( 'automaton' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:825:2: ( 'AUTOMATON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:825:2: ( 'AUTOMATON' )
                    // InternalGSelfOperatingHeuristicText.g:826:3: 'AUTOMATON'
                    {
                     before(grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getAutomatonAccess().getAUTOMATONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:831:2: ( 'automaton' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:831:2: ( 'automaton' )
                    // InternalGSelfOperatingHeuristicText.g:832:3: 'automaton'
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:841:1: rule__DataType__Alternatives : ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:845:1: ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 44:
                {
                alt21=4;
                }
                break;
            case 45:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:846:2: ( ( '??' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:846:2: ( ( '??' ) )
                    // InternalGSelfOperatingHeuristicText.g:847:3: ( '??' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:848:3: ( '??' )
                    // InternalGSelfOperatingHeuristicText.g:848:4: '??'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:852:2: ( ( 'int' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:852:2: ( ( 'int' ) )
                    // InternalGSelfOperatingHeuristicText.g:853:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:854:3: ( 'int' )
                    // InternalGSelfOperatingHeuristicText.g:854:4: 'int'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:858:2: ( ( 'boolean' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:858:2: ( ( 'boolean' ) )
                    // InternalGSelfOperatingHeuristicText.g:859:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:860:3: ( 'boolean' )
                    // InternalGSelfOperatingHeuristicText.g:860:4: 'boolean'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:864:2: ( ( 'double' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:864:2: ( ( 'double' ) )
                    // InternalGSelfOperatingHeuristicText.g:865:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:866:3: ( 'double' )
                    // InternalGSelfOperatingHeuristicText.g:866:4: 'double'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:870:2: ( ( 'String' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:870:2: ( ( 'String' ) )
                    // InternalGSelfOperatingHeuristicText.g:871:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:872:3: ( 'String' )
                    // InternalGSelfOperatingHeuristicText.g:872:4: 'String'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalGSelfOperatingHeuristicText.g:880:1: rule__ComparisonOperator__Alternatives : ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:884:1: ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt22=1;
                }
                break;
            case 47:
                {
                alt22=2;
                }
                break;
            case 48:
                {
                alt22=3;
                }
                break;
            case 49:
                {
                alt22=4;
                }
                break;
            case 50:
                {
                alt22=5;
                }
                break;
            case 51:
                {
                alt22=6;
                }
                break;
            case 52:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:885:2: ( ( '\\u00A4\\u00A4' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:885:2: ( ( '\\u00A4\\u00A4' ) )
                    // InternalGSelfOperatingHeuristicText.g:886:3: ( '\\u00A4\\u00A4' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:887:3: ( '\\u00A4\\u00A4' )
                    // InternalGSelfOperatingHeuristicText.g:887:4: '\\u00A4\\u00A4'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:891:2: ( ( '!=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:891:2: ( ( '!=' ) )
                    // InternalGSelfOperatingHeuristicText.g:892:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:893:3: ( '!=' )
                    // InternalGSelfOperatingHeuristicText.g:893:4: '!='
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:897:2: ( ( '==' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:897:2: ( ( '==' ) )
                    // InternalGSelfOperatingHeuristicText.g:898:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:899:3: ( '==' )
                    // InternalGSelfOperatingHeuristicText.g:899:4: '=='
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:903:2: ( ( '>' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:903:2: ( ( '>' ) )
                    // InternalGSelfOperatingHeuristicText.g:904:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:905:3: ( '>' )
                    // InternalGSelfOperatingHeuristicText.g:905:4: '>'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:909:2: ( ( '<' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:909:2: ( ( '<' ) )
                    // InternalGSelfOperatingHeuristicText.g:910:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:911:3: ( '<' )
                    // InternalGSelfOperatingHeuristicText.g:911:4: '<'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGSelfOperatingHeuristicText.g:915:2: ( ( '>=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:915:2: ( ( '>=' ) )
                    // InternalGSelfOperatingHeuristicText.g:916:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 
                    // InternalGSelfOperatingHeuristicText.g:917:3: ( '>=' )
                    // InternalGSelfOperatingHeuristicText.g:917:4: '>='
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGSelfOperatingHeuristicText.g:921:2: ( ( '<=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:921:2: ( ( '<=' ) )
                    // InternalGSelfOperatingHeuristicText.g:922:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6()); 
                    // InternalGSelfOperatingHeuristicText.g:923:3: ( '<=' )
                    // InternalGSelfOperatingHeuristicText.g:923:4: '<='
                    {
                    match(input,52,FOLLOW_2); 

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
    // InternalGSelfOperatingHeuristicText.g:931:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:935:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:936:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:943:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:947:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:948:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:948:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:949:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:950:2: ( rule__Model__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:950:3: rule__Model__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:958:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:962:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:963:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:970:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:974:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:975:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:975:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:976:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:977:2: ( rule__Model__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:977:3: rule__Model__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:985:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:989:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:990:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:997:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1001:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1002:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1002:1: ( ( rule__Model__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1003:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:1004:2: ( rule__Model__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=15 && LA23_0<=16)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1004:3: rule__Model__Group_2__0
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
    // InternalGSelfOperatingHeuristicText.g:1012:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1016:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1017:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:1024:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1028:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1029:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1029:1: ( ( rule__Model__Group_3__0 )* )
            // InternalGSelfOperatingHeuristicText.g:1030:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1031:2: ( rule__Model__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=17 && LA24_0<=18)||LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1031:3: rule__Model__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalGSelfOperatingHeuristicText.g:1039:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1043:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalGSelfOperatingHeuristicText.g:1044:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalGSelfOperatingHeuristicText.g:1051:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1055:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1056:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1056:1: ( ( rule__Model__Alternatives_4 )* )
            // InternalGSelfOperatingHeuristicText.g:1057:2: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // InternalGSelfOperatingHeuristicText.g:1058:2: ( rule__Model__Alternatives_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=21 && LA25_0<=24)||(LA25_0>=29 && LA25_0<=30)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1058:3: rule__Model__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGSelfOperatingHeuristicText.g:1066:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1070:1: ( rule__Model__Group__5__Impl )
            // InternalGSelfOperatingHeuristicText.g:1071:2: rule__Model__Group__5__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1077:1: rule__Model__Group__5__Impl : ( ( rule__Model__AutomatonAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1081:1: ( ( ( rule__Model__AutomatonAssignment_5 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1082:1: ( ( rule__Model__AutomatonAssignment_5 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1082:1: ( ( rule__Model__AutomatonAssignment_5 )* )
            // InternalGSelfOperatingHeuristicText.g:1083:2: ( rule__Model__AutomatonAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAutomatonAssignment_5()); 
            // InternalGSelfOperatingHeuristicText.g:1084:2: ( rule__Model__AutomatonAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=39 && LA26_0<=40)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1084:3: rule__Model__AutomatonAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__AutomatonAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalGSelfOperatingHeuristicText.g:1093:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1097:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:1098:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
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
    // InternalGSelfOperatingHeuristicText.g:1105:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__Alternatives_2_0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1109:1: ( ( ( rule__Model__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1110:1: ( ( rule__Model__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1110:1: ( ( rule__Model__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1111:2: ( rule__Model__Alternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:1112:2: ( rule__Model__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:1112:3: rule__Model__Alternatives_2_0
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
    // InternalGSelfOperatingHeuristicText.g:1120:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1124:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1125:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
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
    // InternalGSelfOperatingHeuristicText.g:1132:1: rule__Model__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1136:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1137:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1137:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1138:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1147:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl rule__Model__Group_2__3 ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1151:1: ( rule__Model__Group_2__2__Impl rule__Model__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1152:2: rule__Model__Group_2__2__Impl rule__Model__Group_2__3
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
    // InternalGSelfOperatingHeuristicText.g:1159:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__GlobalsAssignment_2_2 )* ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1163:1: ( ( ( rule__Model__GlobalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1164:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1164:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1165:2: ( rule__Model__GlobalsAssignment_2_2 )*
            {
             before(grammarAccess.getModelAccess().getGlobalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1166:2: ( rule__Model__GlobalsAssignment_2_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1166:3: rule__Model__GlobalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__GlobalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalGSelfOperatingHeuristicText.g:1174:1: rule__Model__Group_2__3 : rule__Model__Group_2__3__Impl ;
    public final void rule__Model__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1178:1: ( rule__Model__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1179:2: rule__Model__Group_2__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1185:1: rule__Model__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1189:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1190:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1190:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1191:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1201:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1205:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1206:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1213:1: rule__Model__Group_3__0__Impl : ( ( rule__Model__Alternatives_3_0 )* ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1217:1: ( ( ( rule__Model__Alternatives_3_0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1218:1: ( ( rule__Model__Alternatives_3_0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1218:1: ( ( rule__Model__Alternatives_3_0 )* )
            // InternalGSelfOperatingHeuristicText.g:1219:2: ( rule__Model__Alternatives_3_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1220:2: ( rule__Model__Alternatives_3_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=17 && LA28_0<=18)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1220:3: rule__Model__Alternatives_3_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Alternatives_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalGSelfOperatingHeuristicText.g:1228:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1232:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1233:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:1240:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1244:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1245:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1245:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1246:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1255:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1259:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1260:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:1267:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__EventsAssignment_3_2 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1271:1: ( ( ( rule__Model__EventsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1272:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1272:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1273:2: ( rule__Model__EventsAssignment_3_2 )*
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1274:2: ( rule__Model__EventsAssignment_3_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1274:3: rule__Model__EventsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__EventsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalGSelfOperatingHeuristicText.g:1282:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1286:1: ( rule__Model__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1287:2: rule__Model__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1293:1: rule__Model__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1297:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1298:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1298:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1299:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1309:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1313:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1314:2: rule__Global__Group__0__Impl rule__Global__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1321:1: rule__Global__Group__0__Impl : ( ( rule__Global__NameAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1325:1: ( ( ( rule__Global__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1326:1: ( ( rule__Global__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1326:1: ( ( rule__Global__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1327:2: ( rule__Global__NameAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1328:2: ( rule__Global__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1328:3: rule__Global__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1336:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1340:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1341:2: rule__Global__Group__1__Impl rule__Global__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1348:1: rule__Global__Group__1__Impl : ( ( rule__Global__Alternatives_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1352:1: ( ( ( rule__Global__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1353:1: ( ( rule__Global__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1353:1: ( ( rule__Global__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1354:2: ( rule__Global__Alternatives_1 )
            {
             before(grammarAccess.getGlobalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1355:2: ( rule__Global__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1355:3: rule__Global__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1363:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1367:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1368:2: rule__Global__Group__2__Impl rule__Global__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1375:1: rule__Global__Group__2__Impl : ( ( rule__Global__TypeAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1379:1: ( ( ( rule__Global__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1380:1: ( ( rule__Global__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1380:1: ( ( rule__Global__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1381:2: ( rule__Global__TypeAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1382:2: ( rule__Global__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1382:3: rule__Global__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1390:1: rule__Global__Group__3 : rule__Global__Group__3__Impl rule__Global__Group__4 ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1394:1: ( rule__Global__Group__3__Impl rule__Global__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1395:2: rule__Global__Group__3__Impl rule__Global__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:1402:1: rule__Global__Group__3__Impl : ( '=' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1406:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1407:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1407:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1408:2: '='
            {
             before(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1417:1: rule__Global__Group__4 : rule__Global__Group__4__Impl ;
    public final void rule__Global__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1421:1: ( rule__Global__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1422:2: rule__Global__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1428:1: rule__Global__Group__4__Impl : ( ( rule__Global__ValueAssignment_4 ) ) ;
    public final void rule__Global__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1432:1: ( ( ( rule__Global__ValueAssignment_4 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1433:1: ( ( rule__Global__ValueAssignment_4 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1433:1: ( ( rule__Global__ValueAssignment_4 ) )
            // InternalGSelfOperatingHeuristicText.g:1434:2: ( rule__Global__ValueAssignment_4 )
            {
             before(grammarAccess.getGlobalAccess().getValueAssignment_4()); 
            // InternalGSelfOperatingHeuristicText.g:1435:2: ( rule__Global__ValueAssignment_4 )
            // InternalGSelfOperatingHeuristicText.g:1435:3: rule__Global__ValueAssignment_4
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
    // InternalGSelfOperatingHeuristicText.g:1444:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1448:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1449:2: rule__Local__Group__0__Impl rule__Local__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1456:1: rule__Local__Group__0__Impl : ( ( rule__Local__NameAssignment_0 ) ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1460:1: ( ( ( rule__Local__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1461:1: ( ( rule__Local__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1461:1: ( ( rule__Local__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1462:2: ( rule__Local__NameAssignment_0 )
            {
             before(grammarAccess.getLocalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1463:2: ( rule__Local__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1463:3: rule__Local__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1471:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1475:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1476:2: rule__Local__Group__1__Impl rule__Local__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1483:1: rule__Local__Group__1__Impl : ( ( rule__Local__Alternatives_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1487:1: ( ( ( rule__Local__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1488:1: ( ( rule__Local__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1488:1: ( ( rule__Local__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1489:2: ( rule__Local__Alternatives_1 )
            {
             before(grammarAccess.getLocalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1490:2: ( rule__Local__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1490:3: rule__Local__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1498:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1502:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1503:2: rule__Local__Group__2__Impl rule__Local__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1510:1: rule__Local__Group__2__Impl : ( ( rule__Local__TypeAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1514:1: ( ( ( rule__Local__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1515:1: ( ( rule__Local__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1515:1: ( ( rule__Local__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1516:2: ( rule__Local__TypeAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1517:2: ( rule__Local__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1517:3: rule__Local__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1525:1: rule__Local__Group__3 : rule__Local__Group__3__Impl rule__Local__Group__4 ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1529:1: ( rule__Local__Group__3__Impl rule__Local__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1530:2: rule__Local__Group__3__Impl rule__Local__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:1537:1: rule__Local__Group__3__Impl : ( '=' ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1541:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1542:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1542:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1543:2: '='
            {
             before(grammarAccess.getLocalAccess().getEqualsSignKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1552:1: rule__Local__Group__4 : rule__Local__Group__4__Impl ;
    public final void rule__Local__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1556:1: ( rule__Local__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1557:2: rule__Local__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1563:1: rule__Local__Group__4__Impl : ( ( rule__Local__ValueAssignment_4 ) ) ;
    public final void rule__Local__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1567:1: ( ( ( rule__Local__ValueAssignment_4 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1568:1: ( ( rule__Local__ValueAssignment_4 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1568:1: ( ( rule__Local__ValueAssignment_4 ) )
            // InternalGSelfOperatingHeuristicText.g:1569:2: ( rule__Local__ValueAssignment_4 )
            {
             before(grammarAccess.getLocalAccess().getValueAssignment_4()); 
            // InternalGSelfOperatingHeuristicText.g:1570:2: ( rule__Local__ValueAssignment_4 )
            // InternalGSelfOperatingHeuristicText.g:1570:3: rule__Local__ValueAssignment_4
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
    // InternalGSelfOperatingHeuristicText.g:1579:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1583:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1584:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1591:1: rule__State__Group__0__Impl : ( ( rule__State__Group_0__0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1595:1: ( ( ( rule__State__Group_0__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1596:1: ( ( rule__State__Group_0__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1596:1: ( ( rule__State__Group_0__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1597:2: ( rule__State__Group_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0()); 
            // InternalGSelfOperatingHeuristicText.g:1598:2: ( rule__State__Group_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=21 && LA30_0<=22)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1598:3: rule__State__Group_0__0
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
    // InternalGSelfOperatingHeuristicText.g:1606:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1610:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1611:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1618:1: rule__State__Group__1__Impl : ( ( rule__State__Alternatives_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1622:1: ( ( ( rule__State__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1623:1: ( ( rule__State__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1623:1: ( ( rule__State__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1624:2: ( rule__State__Alternatives_1 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1625:2: ( rule__State__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1625:3: rule__State__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1633:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1637:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1638:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1645:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1649:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1650:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1650:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1651:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1652:2: ( rule__State__NameAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1652:3: rule__State__NameAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1660:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1664:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1665:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:1672:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1676:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1677:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1677:1: ( ( rule__State__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1678:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1679:2: ( rule__State__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=25 && LA31_0<=26)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1679:3: rule__State__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:1687:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1691:1: ( rule__State__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1692:2: rule__State__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1698:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1702:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1703:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1703:1: ( ( rule__State__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1704:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:1705:2: ( rule__State__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=27 && LA32_0<=28)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1705:3: rule__State__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:1714:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1718:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // InternalGSelfOperatingHeuristicText.g:1719:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
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
    // InternalGSelfOperatingHeuristicText.g:1726:1: rule__State__Group_0__0__Impl : ( ( rule__State__Alternatives_0_0 ) ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1730:1: ( ( ( rule__State__Alternatives_0_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1731:1: ( ( rule__State__Alternatives_0_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1731:1: ( ( rule__State__Alternatives_0_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1732:2: ( rule__State__Alternatives_0_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_0_0()); 
            // InternalGSelfOperatingHeuristicText.g:1733:2: ( rule__State__Alternatives_0_0 )
            // InternalGSelfOperatingHeuristicText.g:1733:3: rule__State__Alternatives_0_0
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
    // InternalGSelfOperatingHeuristicText.g:1741:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1745:1: ( rule__State__Group_0__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1746:2: rule__State__Group_0__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1752:1: rule__State__Group_0__1__Impl : ( ( rule__State__InitAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1756:1: ( ( ( rule__State__InitAssignment_0_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1757:1: ( ( rule__State__InitAssignment_0_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1757:1: ( ( rule__State__InitAssignment_0_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1758:2: ( rule__State__InitAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getInitAssignment_0_1()); 
            // InternalGSelfOperatingHeuristicText.g:1759:2: ( rule__State__InitAssignment_0_1 )
            // InternalGSelfOperatingHeuristicText.g:1759:3: rule__State__InitAssignment_0_1
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
    // InternalGSelfOperatingHeuristicText.g:1768:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1772:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1773:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1780:1: rule__State__Group_3__0__Impl : ( ( rule__State__Alternatives_3_0 ) ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1784:1: ( ( ( rule__State__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1785:1: ( ( rule__State__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1785:1: ( ( rule__State__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1786:2: ( rule__State__Alternatives_3_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1787:2: ( rule__State__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:1787:3: rule__State__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:1795:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1799:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1800:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:1807:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1811:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1812:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1812:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1813:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1822:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1826:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1827:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:1834:1: rule__State__Group_3__2__Impl : ( ( rule__State__LocalsAssignment_3_2 )* ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1838:1: ( ( ( rule__State__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1839:1: ( ( rule__State__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1839:1: ( ( rule__State__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1840:2: ( rule__State__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getStateAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1841:2: ( rule__State__LocalsAssignment_3_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1841:3: rule__State__LocalsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__State__LocalsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalGSelfOperatingHeuristicText.g:1849:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1853:1: ( rule__State__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1854:2: rule__State__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1860:1: rule__State__Group_3__3__Impl : ( '}' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1864:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1865:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1865:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1866:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1876:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1880:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:1881:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
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
    // InternalGSelfOperatingHeuristicText.g:1888:1: rule__State__Group_4__0__Impl : ( ( rule__State__Alternatives_4_0 ) ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1892:1: ( ( ( rule__State__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1893:1: ( ( rule__State__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1893:1: ( ( rule__State__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1894:2: ( rule__State__Alternatives_4_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:1895:2: ( rule__State__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:1895:3: rule__State__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:1903:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1907:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:1908:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
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
    // InternalGSelfOperatingHeuristicText.g:1915:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1919:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1920:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1920:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1921:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1930:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1934:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:1935:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
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
    // InternalGSelfOperatingHeuristicText.g:1942:1: rule__State__Group_4__2__Impl : ( ( rule__State__TransitionsAssignment_4_2 )* ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1946:1: ( ( ( rule__State__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1947:1: ( ( rule__State__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1947:1: ( ( rule__State__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1948:2: ( rule__State__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:1949:2: ( rule__State__TransitionsAssignment_4_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=31 && LA34_0<=32)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1949:3: rule__State__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__TransitionsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalGSelfOperatingHeuristicText.g:1957:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1961:1: ( rule__State__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1962:2: rule__State__Group_4__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1968:1: rule__State__Group_4__3__Impl : ( '}' ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1972:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1973:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1973:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1974:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1984:1: rule__Alter__Group__0 : rule__Alter__Group__0__Impl rule__Alter__Group__1 ;
    public final void rule__Alter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1988:1: ( rule__Alter__Group__0__Impl rule__Alter__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1989:2: rule__Alter__Group__0__Impl rule__Alter__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1996:1: rule__Alter__Group__0__Impl : ( ( rule__Alter__Alternatives_0 ) ) ;
    public final void rule__Alter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2000:1: ( ( ( rule__Alter__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2001:1: ( ( rule__Alter__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2001:1: ( ( rule__Alter__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2002:2: ( rule__Alter__Alternatives_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2003:2: ( rule__Alter__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2003:3: rule__Alter__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2011:1: rule__Alter__Group__1 : rule__Alter__Group__1__Impl rule__Alter__Group__2 ;
    public final void rule__Alter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2015:1: ( rule__Alter__Group__1__Impl rule__Alter__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2016:2: rule__Alter__Group__1__Impl rule__Alter__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2023:1: rule__Alter__Group__1__Impl : ( ( rule__Alter__Alternatives_1 ) ) ;
    public final void rule__Alter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2027:1: ( ( ( rule__Alter__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2028:1: ( ( rule__Alter__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2028:1: ( ( rule__Alter__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2029:2: ( rule__Alter__Alternatives_1 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:2030:2: ( rule__Alter__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:2030:3: rule__Alter__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:2038:1: rule__Alter__Group__2 : rule__Alter__Group__2__Impl rule__Alter__Group__3 ;
    public final void rule__Alter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2042:1: ( rule__Alter__Group__2__Impl rule__Alter__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2043:2: rule__Alter__Group__2__Impl rule__Alter__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2050:1: rule__Alter__Group__2__Impl : ( ( rule__Alter__StateAssignment_2 ) ) ;
    public final void rule__Alter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2054:1: ( ( ( rule__Alter__StateAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2055:1: ( ( rule__Alter__StateAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2055:1: ( ( rule__Alter__StateAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2056:2: ( rule__Alter__StateAssignment_2 )
            {
             before(grammarAccess.getAlterAccess().getStateAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2057:2: ( rule__Alter__StateAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2057:3: rule__Alter__StateAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2065:1: rule__Alter__Group__3 : rule__Alter__Group__3__Impl rule__Alter__Group__4 ;
    public final void rule__Alter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2069:1: ( rule__Alter__Group__3__Impl rule__Alter__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2070:2: rule__Alter__Group__3__Impl rule__Alter__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:2077:1: rule__Alter__Group__3__Impl : ( ( rule__Alter__Group_3__0 )? ) ;
    public final void rule__Alter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2081:1: ( ( ( rule__Alter__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2082:1: ( ( rule__Alter__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2082:1: ( ( rule__Alter__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2083:2: ( rule__Alter__Group_3__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:2084:2: ( rule__Alter__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=25 && LA35_0<=26)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2084:3: rule__Alter__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:2092:1: rule__Alter__Group__4 : rule__Alter__Group__4__Impl ;
    public final void rule__Alter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2096:1: ( rule__Alter__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2097:2: rule__Alter__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2103:1: rule__Alter__Group__4__Impl : ( ( rule__Alter__Group_4__0 )? ) ;
    public final void rule__Alter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2107:1: ( ( ( rule__Alter__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2108:1: ( ( rule__Alter__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2108:1: ( ( rule__Alter__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2109:2: ( rule__Alter__Group_4__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2110:2: ( rule__Alter__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=27 && LA36_0<=28)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2110:3: rule__Alter__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:2119:1: rule__Alter__Group_3__0 : rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 ;
    public final void rule__Alter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2123:1: ( rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:2124:2: rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:2131:1: rule__Alter__Group_3__0__Impl : ( ( rule__Alter__Alternatives_3_0 ) ) ;
    public final void rule__Alter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2135:1: ( ( ( rule__Alter__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2136:1: ( ( rule__Alter__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2136:1: ( ( rule__Alter__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2137:2: ( rule__Alter__Alternatives_3_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:2138:2: ( rule__Alter__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:2138:3: rule__Alter__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:2146:1: rule__Alter__Group_3__1 : rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 ;
    public final void rule__Alter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2150:1: ( rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:2151:2: rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:2158:1: rule__Alter__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2162:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2163:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2163:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2164:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2173:1: rule__Alter__Group_3__2 : rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 ;
    public final void rule__Alter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2177:1: ( rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:2178:2: rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:2185:1: rule__Alter__Group_3__2__Impl : ( ( rule__Alter__LocalsAssignment_3_2 )* ) ;
    public final void rule__Alter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2189:1: ( ( ( rule__Alter__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2190:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2190:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2191:2: ( rule__Alter__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getAlterAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:2192:2: ( rule__Alter__LocalsAssignment_3_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2192:3: rule__Alter__LocalsAssignment_3_2
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
    // InternalGSelfOperatingHeuristicText.g:2200:1: rule__Alter__Group_3__3 : rule__Alter__Group_3__3__Impl ;
    public final void rule__Alter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2204:1: ( rule__Alter__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2205:2: rule__Alter__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2211:1: rule__Alter__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2215:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2216:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2216:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2217:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2227:1: rule__Alter__Group_4__0 : rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 ;
    public final void rule__Alter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2231:1: ( rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2232:2: rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1
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
    // InternalGSelfOperatingHeuristicText.g:2239:1: rule__Alter__Group_4__0__Impl : ( ( rule__Alter__Alternatives_4_0 ) ) ;
    public final void rule__Alter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2243:1: ( ( ( rule__Alter__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2244:1: ( ( rule__Alter__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2244:1: ( ( rule__Alter__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2245:2: ( rule__Alter__Alternatives_4_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2246:2: ( rule__Alter__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2246:3: rule__Alter__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2254:1: rule__Alter__Group_4__1 : rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 ;
    public final void rule__Alter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2258:1: ( rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2259:2: rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2
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
    // InternalGSelfOperatingHeuristicText.g:2266:1: rule__Alter__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2270:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2271:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2271:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2272:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2281:1: rule__Alter__Group_4__2 : rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 ;
    public final void rule__Alter__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2285:1: ( rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:2286:2: rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3
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
    // InternalGSelfOperatingHeuristicText.g:2293:1: rule__Alter__Group_4__2__Impl : ( ( rule__Alter__TransitionsAssignment_4_2 )* ) ;
    public final void rule__Alter__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2297:1: ( ( ( rule__Alter__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2298:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2298:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2299:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2300:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=31 && LA38_0<=32)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2300:3: rule__Alter__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalGSelfOperatingHeuristicText.g:2308:1: rule__Alter__Group_4__3 : rule__Alter__Group_4__3__Impl ;
    public final void rule__Alter__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2312:1: ( rule__Alter__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2313:2: rule__Alter__Group_4__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2319:1: rule__Alter__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2323:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2324:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2324:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2325:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2335:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2339:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2340:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2347:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2351:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2352:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2352:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2353:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2354:2: ( rule__Transition__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2354:3: rule__Transition__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2362:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2366:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2367:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2374:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__EventAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2378:1: ( ( ( rule__Transition__EventAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2379:1: ( ( rule__Transition__EventAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2379:1: ( ( rule__Transition__EventAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2380:2: ( rule__Transition__EventAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2381:2: ( rule__Transition__EventAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2381:3: rule__Transition__EventAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2389:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2393:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2394:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2401:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Alternatives_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2405:1: ( ( ( rule__Transition__Alternatives_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2406:1: ( ( rule__Transition__Alternatives_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2406:1: ( ( rule__Transition__Alternatives_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2407:2: ( rule__Transition__Alternatives_2 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            // InternalGSelfOperatingHeuristicText.g:2408:2: ( rule__Transition__Alternatives_2 )
            // InternalGSelfOperatingHeuristicText.g:2408:3: rule__Transition__Alternatives_2
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
    // InternalGSelfOperatingHeuristicText.g:2416:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2420:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2421:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:2428:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__StateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2432:1: ( ( ( rule__Transition__StateAssignment_3 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2433:1: ( ( rule__Transition__StateAssignment_3 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2433:1: ( ( rule__Transition__StateAssignment_3 ) )
            // InternalGSelfOperatingHeuristicText.g:2434:2: ( rule__Transition__StateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2435:2: ( rule__Transition__StateAssignment_3 )
            // InternalGSelfOperatingHeuristicText.g:2435:3: rule__Transition__StateAssignment_3
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
    // InternalGSelfOperatingHeuristicText.g:2443:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2447:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalGSelfOperatingHeuristicText.g:2448:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // InternalGSelfOperatingHeuristicText.g:2455:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2459:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2460:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2460:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2461:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2462:2: ( rule__Transition__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=35 && LA39_0<=36)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2462:3: rule__Transition__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:2470:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2474:1: ( rule__Transition__Group__5__Impl )
            // InternalGSelfOperatingHeuristicText.g:2475:2: rule__Transition__Group__5__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2481:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2485:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2486:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2486:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2487:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalGSelfOperatingHeuristicText.g:2488:2: ( rule__Transition__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=37 && LA40_0<=38)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2488:3: rule__Transition__Group_5__0
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
    // InternalGSelfOperatingHeuristicText.g:2497:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2501:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2502:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
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
    // InternalGSelfOperatingHeuristicText.g:2509:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__Alternatives_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2513:1: ( ( ( rule__Transition__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2514:1: ( ( rule__Transition__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2514:1: ( ( rule__Transition__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2515:2: ( rule__Transition__Alternatives_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2516:2: ( rule__Transition__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2516:3: rule__Transition__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2524:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2528:1: ( rule__Transition__Group_4__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2529:2: rule__Transition__Group_4__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2535:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ConditionAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2539:1: ( ( ( rule__Transition__ConditionAssignment_4_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2540:1: ( ( rule__Transition__ConditionAssignment_4_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2540:1: ( ( rule__Transition__ConditionAssignment_4_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2541:2: ( rule__Transition__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_4_1()); 
            // InternalGSelfOperatingHeuristicText.g:2542:2: ( rule__Transition__ConditionAssignment_4_1 )
            // InternalGSelfOperatingHeuristicText.g:2542:3: rule__Transition__ConditionAssignment_4_1
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
    // InternalGSelfOperatingHeuristicText.g:2551:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2555:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalGSelfOperatingHeuristicText.g:2556:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
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
    // InternalGSelfOperatingHeuristicText.g:2563:1: rule__Transition__Group_5__0__Impl : ( ( rule__Transition__Alternatives_5_0 ) ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2567:1: ( ( ( rule__Transition__Alternatives_5_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2568:1: ( ( rule__Transition__Alternatives_5_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2568:1: ( ( rule__Transition__Alternatives_5_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2569:2: ( rule__Transition__Alternatives_5_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_5_0()); 
            // InternalGSelfOperatingHeuristicText.g:2570:2: ( rule__Transition__Alternatives_5_0 )
            // InternalGSelfOperatingHeuristicText.g:2570:3: rule__Transition__Alternatives_5_0
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
    // InternalGSelfOperatingHeuristicText.g:2578:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2582:1: ( rule__Transition__Group_5__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2583:2: rule__Transition__Group_5__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2589:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__AssignmentAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2593:1: ( ( ( rule__Transition__AssignmentAssignment_5_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2594:1: ( ( rule__Transition__AssignmentAssignment_5_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2594:1: ( ( rule__Transition__AssignmentAssignment_5_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2595:2: ( rule__Transition__AssignmentAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignment_5_1()); 
            // InternalGSelfOperatingHeuristicText.g:2596:2: ( rule__Transition__AssignmentAssignment_5_1 )
            // InternalGSelfOperatingHeuristicText.g:2596:3: rule__Transition__AssignmentAssignment_5_1
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
    // InternalGSelfOperatingHeuristicText.g:2605:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2609:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2610:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2617:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2621:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2622:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2622:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2623:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2624:2: ( rule__Condition__LeftAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2624:3: rule__Condition__LeftAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2632:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2636:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2637:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2644:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2648:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2649:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2649:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2650:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2651:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2651:3: rule__Condition__OperatorAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2659:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2663:1: ( rule__Condition__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2664:2: rule__Condition__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2670:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2674:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2675:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2675:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2676:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2677:2: ( rule__Condition__RightAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2677:3: rule__Condition__RightAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2686:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2690:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2691:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2698:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__CurrentVarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2702:1: ( ( ( rule__Assignment__CurrentVarAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2703:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2703:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2704:2: ( rule__Assignment__CurrentVarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2705:2: ( rule__Assignment__CurrentVarAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2705:3: rule__Assignment__CurrentVarAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2713:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2717:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2718:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2725:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2729:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:2730:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:2730:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:2731:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2740:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2744:1: ( rule__Assignment__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2745:2: rule__Assignment__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2751:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2755:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2756:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2756:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2757:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2758:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2758:3: rule__Assignment__ValueAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2767:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2771:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2772:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2779:1: rule__Automaton__Group__0__Impl : ( ( rule__Automaton__Alternatives_0 ) ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2783:1: ( ( ( rule__Automaton__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2784:1: ( ( rule__Automaton__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2784:1: ( ( rule__Automaton__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2785:2: ( rule__Automaton__Alternatives_0 )
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2786:2: ( rule__Automaton__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2786:3: rule__Automaton__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2794:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2798:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2799:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2806:1: rule__Automaton__Group__1__Impl : ( ( rule__Automaton__NameAssignment_1 ) ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2810:1: ( ( ( rule__Automaton__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2811:1: ( ( rule__Automaton__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2811:1: ( ( rule__Automaton__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2812:2: ( rule__Automaton__NameAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2813:2: ( rule__Automaton__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2813:3: rule__Automaton__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2821:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2825:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2826:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2833:1: rule__Automaton__Group__2__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2837:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2838:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2838:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2839:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2848:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2852:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2853:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:2860:1: rule__Automaton__Group__3__Impl : ( ( rule__Automaton__StatesAssignment_3 )* ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2864:1: ( ( ( rule__Automaton__StatesAssignment_3 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2865:1: ( ( rule__Automaton__StatesAssignment_3 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2865:1: ( ( rule__Automaton__StatesAssignment_3 )* )
            // InternalGSelfOperatingHeuristicText.g:2866:2: ( rule__Automaton__StatesAssignment_3 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2867:2: ( rule__Automaton__StatesAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2867:3: rule__Automaton__StatesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Automaton__StatesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalGSelfOperatingHeuristicText.g:2875:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2879:1: ( rule__Automaton__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2880:2: rule__Automaton__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2886:1: rule__Automaton__Group__4__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2890:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2891:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2891:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2892:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2902:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2906:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2907:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2907:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2908:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2917:1: rule__Model__GlobalsAssignment_2_2 : ( ruleGlobal ) ;
    public final void rule__Model__GlobalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2921:1: ( ( ruleGlobal ) )
            // InternalGSelfOperatingHeuristicText.g:2922:2: ( ruleGlobal )
            {
            // InternalGSelfOperatingHeuristicText.g:2922:2: ( ruleGlobal )
            // InternalGSelfOperatingHeuristicText.g:2923:3: ruleGlobal
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
    // InternalGSelfOperatingHeuristicText.g:2932:1: rule__Model__EventsAssignment_3_2 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2936:1: ( ( ruleEvent ) )
            // InternalGSelfOperatingHeuristicText.g:2937:2: ( ruleEvent )
            {
            // InternalGSelfOperatingHeuristicText.g:2937:2: ( ruleEvent )
            // InternalGSelfOperatingHeuristicText.g:2938:3: ruleEvent
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
    // InternalGSelfOperatingHeuristicText.g:2947:1: rule__Model__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Model__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2951:1: ( ( ruleState ) )
            // InternalGSelfOperatingHeuristicText.g:2952:2: ( ruleState )
            {
            // InternalGSelfOperatingHeuristicText.g:2952:2: ( ruleState )
            // InternalGSelfOperatingHeuristicText.g:2953:3: ruleState
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
    // InternalGSelfOperatingHeuristicText.g:2962:1: rule__Model__AltersAssignment_4_1 : ( ruleAlter ) ;
    public final void rule__Model__AltersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2966:1: ( ( ruleAlter ) )
            // InternalGSelfOperatingHeuristicText.g:2967:2: ( ruleAlter )
            {
            // InternalGSelfOperatingHeuristicText.g:2967:2: ( ruleAlter )
            // InternalGSelfOperatingHeuristicText.g:2968:3: ruleAlter
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
    // InternalGSelfOperatingHeuristicText.g:2977:1: rule__Model__AutomatonAssignment_5 : ( ruleAutomaton ) ;
    public final void rule__Model__AutomatonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2981:1: ( ( ruleAutomaton ) )
            // InternalGSelfOperatingHeuristicText.g:2982:2: ( ruleAutomaton )
            {
            // InternalGSelfOperatingHeuristicText.g:2982:2: ( ruleAutomaton )
            // InternalGSelfOperatingHeuristicText.g:2983:3: ruleAutomaton
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
    // InternalGSelfOperatingHeuristicText.g:2992:1: rule__Global__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Global__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2996:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2997:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2997:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2998:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3007:1: rule__Global__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Global__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3011:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:3012:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:3012:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:3013:3: ruleDataType
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
    // InternalGSelfOperatingHeuristicText.g:3022:1: rule__Global__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__Global__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3026:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3027:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3027:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3028:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3037:1: rule__Local__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Local__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3041:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3042:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3042:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3043:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3052:1: rule__Local__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Local__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3056:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:3057:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:3057:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:3058:3: ruleDataType
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
    // InternalGSelfOperatingHeuristicText.g:3067:1: rule__Local__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__Local__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3071:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3072:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3072:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3073:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3082:1: rule__State__InitAssignment_0_1 : ( ruleInitial ) ;
    public final void rule__State__InitAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3086:1: ( ( ruleInitial ) )
            // InternalGSelfOperatingHeuristicText.g:3087:2: ( ruleInitial )
            {
            // InternalGSelfOperatingHeuristicText.g:3087:2: ( ruleInitial )
            // InternalGSelfOperatingHeuristicText.g:3088:3: ruleInitial
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
    // InternalGSelfOperatingHeuristicText.g:3097:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3101:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3102:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3102:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3103:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3112:1: rule__State__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__State__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3116:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:3117:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:3117:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:3118:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:3127:1: rule__State__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3131:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:3132:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:3132:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:3133:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:3142:1: rule__Alter__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Alter__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3146:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3147:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3147:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3148:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAccess().getStateStateCrossReference_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:3149:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3150:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3161:1: rule__Alter__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__Alter__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3165:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:3166:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:3166:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:3167:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:3176:1: rule__Alter__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Alter__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3180:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:3181:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:3181:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:3182:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:3191:1: rule__Transition__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3195:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3196:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3196:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3197:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            // InternalGSelfOperatingHeuristicText.g:3198:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3199:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3210:1: rule__Transition__StateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3214:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3215:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3215:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3216:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:3217:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3218:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3229:1: rule__Transition__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3233:1: ( ( ruleCondition ) )
            // InternalGSelfOperatingHeuristicText.g:3234:2: ( ruleCondition )
            {
            // InternalGSelfOperatingHeuristicText.g:3234:2: ( ruleCondition )
            // InternalGSelfOperatingHeuristicText.g:3235:3: ruleCondition
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
    // InternalGSelfOperatingHeuristicText.g:3244:1: rule__Transition__AssignmentAssignment_5_1 : ( ruleAssignment ) ;
    public final void rule__Transition__AssignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3248:1: ( ( ruleAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:3249:2: ( ruleAssignment )
            {
            // InternalGSelfOperatingHeuristicText.g:3249:2: ( ruleAssignment )
            // InternalGSelfOperatingHeuristicText.g:3250:3: ruleAssignment
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
    // InternalGSelfOperatingHeuristicText.g:3259:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3263:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3264:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3264:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3265:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3274:1: rule__Condition__LeftAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3278:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3279:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3279:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3280:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3289:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3293:1: ( ( ruleComparisonOperator ) )
            // InternalGSelfOperatingHeuristicText.g:3294:2: ( ruleComparisonOperator )
            {
            // InternalGSelfOperatingHeuristicText.g:3294:2: ( ruleComparisonOperator )
            // InternalGSelfOperatingHeuristicText.g:3295:3: ruleComparisonOperator
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
    // InternalGSelfOperatingHeuristicText.g:3304:1: rule__Condition__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3308:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3309:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3309:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3310:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3319:1: rule__Assignment__CurrentVarAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Assignment__CurrentVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3323:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3324:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3324:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3325:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3334:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3338:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3339:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3339:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3340:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3349:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3353:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3354:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3354:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3355:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            // InternalGSelfOperatingHeuristicText.g:3356:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3357:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3368:1: rule__Automaton__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3372:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3373:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3373:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3374:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3383:1: rule__Automaton__StatesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3387:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3388:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3388:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3389:3: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:3390:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3391:4: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0020018061E78000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0020000000060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000061E00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0040000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040000180000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x001FC00000000000L});

}
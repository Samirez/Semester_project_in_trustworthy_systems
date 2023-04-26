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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DRONE'", "'drone'", "'GLOBAL'", "'global'", "'EVENTS'", "'events'", "'AS'", "'as'", "'INIT'", "'init'", "'STATE'", "'state'", "'PROPS'", "'props'", "'TRANSITIONS'", "'transitions'", "'ALTER'", "'alter'", "'ON'", "'on'", "'TO'", "'to'", "'IF'", "'if'", "'SET'", "'set'", "'??'", "'int'", "'boolean'", "'double'", "'String'", "'\\u00A4\\u00A4'", "'!='", "'=='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", "'='"
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


    // $ANTLR start "ruleDataType"
    // InternalGSelfOperatingHeuristicText.g:353:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:357:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:358:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:358:2: ( ( rule__DataType__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:359:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:360:3: ( rule__DataType__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:360:4: rule__DataType__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:369:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:373:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:374:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:374:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:375:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:376:3: ( rule__ComparisonOperator__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:376:4: rule__ComparisonOperator__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:384:1: rule__Model__Alternatives_0 : ( ( 'DRONE' ) | ( 'drone' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:388:1: ( ( 'DRONE' ) | ( 'drone' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:389:2: ( 'DRONE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:389:2: ( 'DRONE' )
                    // InternalGSelfOperatingHeuristicText.g:390:3: 'DRONE'
                    {
                     before(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:395:2: ( 'drone' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:395:2: ( 'drone' )
                    // InternalGSelfOperatingHeuristicText.g:396:3: 'drone'
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
    // InternalGSelfOperatingHeuristicText.g:405:1: rule__Model__Alternatives_2_0 : ( ( 'GLOBAL' ) | ( 'global' ) );
    public final void rule__Model__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:409:1: ( ( 'GLOBAL' ) | ( 'global' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:410:2: ( 'GLOBAL' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:410:2: ( 'GLOBAL' )
                    // InternalGSelfOperatingHeuristicText.g:411:3: 'GLOBAL'
                    {
                     before(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:416:2: ( 'global' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:416:2: ( 'global' )
                    // InternalGSelfOperatingHeuristicText.g:417:3: 'global'
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
    // InternalGSelfOperatingHeuristicText.g:426:1: rule__Model__Alternatives_3_0 : ( ( 'EVENTS' ) | ( 'events' ) );
    public final void rule__Model__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:430:1: ( ( 'EVENTS' ) | ( 'events' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:431:2: ( 'EVENTS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:431:2: ( 'EVENTS' )
                    // InternalGSelfOperatingHeuristicText.g:432:3: 'EVENTS'
                    {
                     before(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:437:2: ( 'events' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:437:2: ( 'events' )
                    // InternalGSelfOperatingHeuristicText.g:438:3: 'events'
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
    // InternalGSelfOperatingHeuristicText.g:447:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) );
    public final void rule__Model__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:451:1: ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) )
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
                    // InternalGSelfOperatingHeuristicText.g:452:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:452:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    // InternalGSelfOperatingHeuristicText.g:453:3: ( rule__Model__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getModelAccess().getStatesAssignment_4_0()); 
                    // InternalGSelfOperatingHeuristicText.g:454:3: ( rule__Model__StatesAssignment_4_0 )
                    // InternalGSelfOperatingHeuristicText.g:454:4: rule__Model__StatesAssignment_4_0
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
                    // InternalGSelfOperatingHeuristicText.g:458:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:458:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    // InternalGSelfOperatingHeuristicText.g:459:3: ( rule__Model__AltersAssignment_4_1 )
                    {
                     before(grammarAccess.getModelAccess().getAltersAssignment_4_1()); 
                    // InternalGSelfOperatingHeuristicText.g:460:3: ( rule__Model__AltersAssignment_4_1 )
                    // InternalGSelfOperatingHeuristicText.g:460:4: rule__Model__AltersAssignment_4_1
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
    // InternalGSelfOperatingHeuristicText.g:468:1: rule__Global__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Global__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:472:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:473:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:473:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:474:3: 'AS'
                    {
                     before(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:479:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:479:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:480:3: 'as'
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
    // InternalGSelfOperatingHeuristicText.g:489:1: rule__Local__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Local__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:493:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:494:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:494:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:495:3: 'AS'
                    {
                     before(grammarAccess.getLocalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLocalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:500:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:500:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:501:3: 'as'
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
    // InternalGSelfOperatingHeuristicText.g:510:1: rule__State__Alternatives_0_0 : ( ( 'INIT' ) | ( 'init' ) );
    public final void rule__State__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:514:1: ( ( 'INIT' ) | ( 'init' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:515:2: ( 'INIT' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:515:2: ( 'INIT' )
                    // InternalGSelfOperatingHeuristicText.g:516:3: 'INIT'
                    {
                     before(grammarAccess.getStateAccess().getINITKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getINITKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:521:2: ( 'init' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:521:2: ( 'init' )
                    // InternalGSelfOperatingHeuristicText.g:522:3: 'init'
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
    // InternalGSelfOperatingHeuristicText.g:531:1: rule__State__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__State__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:535:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:536:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:536:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:537:3: 'STATE'
                    {
                     before(grammarAccess.getStateAccess().getSTATEKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:542:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:542:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:543:3: 'state'
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
    // InternalGSelfOperatingHeuristicText.g:552:1: rule__State__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__State__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:556:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:557:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:557:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:558:3: 'PROPS'
                    {
                     before(grammarAccess.getStateAccess().getPROPSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:563:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:563:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:564:3: 'props'
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
    // InternalGSelfOperatingHeuristicText.g:573:1: rule__State__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__State__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:577:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:578:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:578:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:579:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getStateAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:584:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:584:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:585:3: 'transitions'
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
    // InternalGSelfOperatingHeuristicText.g:594:1: rule__Alter__Alternatives_0 : ( ( 'ALTER' ) | ( 'alter' ) );
    public final void rule__Alter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:598:1: ( ( 'ALTER' ) | ( 'alter' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:599:2: ( 'ALTER' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:599:2: ( 'ALTER' )
                    // InternalGSelfOperatingHeuristicText.g:600:3: 'ALTER'
                    {
                     before(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:605:2: ( 'alter' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:605:2: ( 'alter' )
                    // InternalGSelfOperatingHeuristicText.g:606:3: 'alter'
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
    // InternalGSelfOperatingHeuristicText.g:615:1: rule__Alter__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__Alter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:619:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:620:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:620:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:621:3: 'STATE'
                    {
                     before(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:626:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:626:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:627:3: 'state'
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
    // InternalGSelfOperatingHeuristicText.g:636:1: rule__Alter__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__Alter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:640:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:641:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:641:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:642:3: 'PROPS'
                    {
                     before(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:647:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:647:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:648:3: 'props'
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
    // InternalGSelfOperatingHeuristicText.g:657:1: rule__Alter__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__Alter__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:661:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:662:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:662:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:663:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:668:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:668:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:669:3: 'transitions'
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
    // InternalGSelfOperatingHeuristicText.g:678:1: rule__Transition__Alternatives_0 : ( ( 'ON' ) | ( 'on' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:682:1: ( ( 'ON' ) | ( 'on' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:683:2: ( 'ON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:683:2: ( 'ON' )
                    // InternalGSelfOperatingHeuristicText.g:684:3: 'ON'
                    {
                     before(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:689:2: ( 'on' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:689:2: ( 'on' )
                    // InternalGSelfOperatingHeuristicText.g:690:3: 'on'
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
    // InternalGSelfOperatingHeuristicText.g:699:1: rule__Transition__Alternatives_2 : ( ( 'TO' ) | ( 'to' ) );
    public final void rule__Transition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:703:1: ( ( 'TO' ) | ( 'to' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:704:2: ( 'TO' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:704:2: ( 'TO' )
                    // InternalGSelfOperatingHeuristicText.g:705:3: 'TO'
                    {
                     before(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:710:2: ( 'to' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:710:2: ( 'to' )
                    // InternalGSelfOperatingHeuristicText.g:711:3: 'to'
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
    // InternalGSelfOperatingHeuristicText.g:720:1: rule__Transition__Alternatives_4_0 : ( ( 'IF' ) | ( 'if' ) );
    public final void rule__Transition__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:724:1: ( ( 'IF' ) | ( 'if' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:725:2: ( 'IF' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:725:2: ( 'IF' )
                    // InternalGSelfOperatingHeuristicText.g:726:3: 'IF'
                    {
                     before(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:731:2: ( 'if' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:731:2: ( 'if' )
                    // InternalGSelfOperatingHeuristicText.g:732:3: 'if'
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


    // $ANTLR start "rule__Transition__Alternatives_4_2_0"
    // InternalGSelfOperatingHeuristicText.g:741:1: rule__Transition__Alternatives_4_2_0 : ( ( 'SET' ) | ( 'set' ) );
    public final void rule__Transition__Alternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:745:1: ( ( 'SET' ) | ( 'set' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:746:2: ( 'SET' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:746:2: ( 'SET' )
                    // InternalGSelfOperatingHeuristicText.g:747:3: 'SET'
                    {
                     before(grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:752:2: ( 'set' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:752:2: ( 'set' )
                    // InternalGSelfOperatingHeuristicText.g:753:3: 'set'
                    {
                     before(grammarAccess.getTransitionAccess().getSetKeyword_4_2_0_1()); 
                    match(input,38,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:762:1: rule__Value__Alternatives : ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:766:1: ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) )
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
                    // InternalGSelfOperatingHeuristicText.g:767:2: ( RULE_BOOL )
                    {
                    // InternalGSelfOperatingHeuristicText.g:767:2: ( RULE_BOOL )
                    // InternalGSelfOperatingHeuristicText.g:768:3: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:773:2: ( RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:773:2: ( RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:774:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:779:2: ( RULE_INT )
                    {
                    // InternalGSelfOperatingHeuristicText.g:779:2: ( RULE_INT )
                    // InternalGSelfOperatingHeuristicText.g:780:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:785:2: ( RULE_DOUBLE )
                    {
                    // InternalGSelfOperatingHeuristicText.g:785:2: ( RULE_DOUBLE )
                    // InternalGSelfOperatingHeuristicText.g:786:3: RULE_DOUBLE
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalGSelfOperatingHeuristicText.g:795:1: rule__DataType__Alternatives : ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:799:1: ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
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
                    // InternalGSelfOperatingHeuristicText.g:800:2: ( ( '??' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:800:2: ( ( '??' ) )
                    // InternalGSelfOperatingHeuristicText.g:801:3: ( '??' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:802:3: ( '??' )
                    // InternalGSelfOperatingHeuristicText.g:802:4: '??'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:806:2: ( ( 'int' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:806:2: ( ( 'int' ) )
                    // InternalGSelfOperatingHeuristicText.g:807:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:808:3: ( 'int' )
                    // InternalGSelfOperatingHeuristicText.g:808:4: 'int'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:812:2: ( ( 'boolean' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:812:2: ( ( 'boolean' ) )
                    // InternalGSelfOperatingHeuristicText.g:813:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:814:3: ( 'boolean' )
                    // InternalGSelfOperatingHeuristicText.g:814:4: 'boolean'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:818:2: ( ( 'double' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:818:2: ( ( 'double' ) )
                    // InternalGSelfOperatingHeuristicText.g:819:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:820:3: ( 'double' )
                    // InternalGSelfOperatingHeuristicText.g:820:4: 'double'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:824:2: ( ( 'String' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:824:2: ( ( 'String' ) )
                    // InternalGSelfOperatingHeuristicText.g:825:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:826:3: ( 'String' )
                    // InternalGSelfOperatingHeuristicText.g:826:4: 'String'
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
    // InternalGSelfOperatingHeuristicText.g:834:1: rule__ComparisonOperator__Alternatives : ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:838:1: ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
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
                    // InternalGSelfOperatingHeuristicText.g:839:2: ( ( '\\u00A4\\u00A4' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:839:2: ( ( '\\u00A4\\u00A4' ) )
                    // InternalGSelfOperatingHeuristicText.g:840:3: ( '\\u00A4\\u00A4' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:841:3: ( '\\u00A4\\u00A4' )
                    // InternalGSelfOperatingHeuristicText.g:841:4: '\\u00A4\\u00A4'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:845:2: ( ( '!=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:845:2: ( ( '!=' ) )
                    // InternalGSelfOperatingHeuristicText.g:846:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:847:3: ( '!=' )
                    // InternalGSelfOperatingHeuristicText.g:847:4: '!='
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:851:2: ( ( '==' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:851:2: ( ( '==' ) )
                    // InternalGSelfOperatingHeuristicText.g:852:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:853:3: ( '==' )
                    // InternalGSelfOperatingHeuristicText.g:853:4: '=='
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:857:2: ( ( '>' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:857:2: ( ( '>' ) )
                    // InternalGSelfOperatingHeuristicText.g:858:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:859:3: ( '>' )
                    // InternalGSelfOperatingHeuristicText.g:859:4: '>'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:863:2: ( ( '<' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:863:2: ( ( '<' ) )
                    // InternalGSelfOperatingHeuristicText.g:864:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:865:3: ( '<' )
                    // InternalGSelfOperatingHeuristicText.g:865:4: '<'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGSelfOperatingHeuristicText.g:869:2: ( ( '>=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:869:2: ( ( '>=' ) )
                    // InternalGSelfOperatingHeuristicText.g:870:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 
                    // InternalGSelfOperatingHeuristicText.g:871:3: ( '>=' )
                    // InternalGSelfOperatingHeuristicText.g:871:4: '>='
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGSelfOperatingHeuristicText.g:875:2: ( ( '<=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:875:2: ( ( '<=' ) )
                    // InternalGSelfOperatingHeuristicText.g:876:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6()); 
                    // InternalGSelfOperatingHeuristicText.g:877:3: ( '<=' )
                    // InternalGSelfOperatingHeuristicText.g:877:4: '<='
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
    // InternalGSelfOperatingHeuristicText.g:885:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:889:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:890:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:897:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:901:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:902:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:902:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:903:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:904:2: ( rule__Model__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:904:3: rule__Model__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:912:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:916:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:917:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:924:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:928:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:929:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:929:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:930:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:931:2: ( rule__Model__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:931:3: rule__Model__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:939:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:943:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:944:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:951:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:955:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:956:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:956:1: ( ( rule__Model__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:957:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:958:2: ( rule__Model__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=15 && LA22_0<=16)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:958:3: rule__Model__Group_2__0
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
    // InternalGSelfOperatingHeuristicText.g:966:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:970:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:971:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:978:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:982:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:983:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:983:1: ( ( rule__Model__Group_3__0 )* )
            // InternalGSelfOperatingHeuristicText.g:984:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:985:2: ( rule__Model__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)||LA23_0==51) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:985:3: rule__Model__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:993:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:997:1: ( rule__Model__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:998:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // InternalGSelfOperatingHeuristicText.g:1004:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1008:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1009:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1009:1: ( ( rule__Model__Alternatives_4 )* )
            // InternalGSelfOperatingHeuristicText.g:1010:2: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // InternalGSelfOperatingHeuristicText.g:1011:2: ( rule__Model__Alternatives_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=21 && LA24_0<=24)||(LA24_0>=29 && LA24_0<=30)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1011:3: rule__Model__Alternatives_4
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


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalGSelfOperatingHeuristicText.g:1020:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1024:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:1025:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGSelfOperatingHeuristicText.g:1032:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__Alternatives_2_0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1036:1: ( ( ( rule__Model__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1037:1: ( ( rule__Model__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1037:1: ( ( rule__Model__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1038:2: ( rule__Model__Alternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:1039:2: ( rule__Model__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:1039:3: rule__Model__Alternatives_2_0
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
    // InternalGSelfOperatingHeuristicText.g:1047:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1051:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1052:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1059:1: rule__Model__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1063:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1064:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1064:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1065:2: '{'
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
    // InternalGSelfOperatingHeuristicText.g:1074:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl rule__Model__Group_2__3 ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1078:1: ( rule__Model__Group_2__2__Impl rule__Model__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1079:2: rule__Model__Group_2__2__Impl rule__Model__Group_2__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1086:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__GlobalsAssignment_2_2 )* ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1090:1: ( ( ( rule__Model__GlobalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1091:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1091:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1092:2: ( rule__Model__GlobalsAssignment_2_2 )*
            {
             before(grammarAccess.getModelAccess().getGlobalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1093:2: ( rule__Model__GlobalsAssignment_2_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1093:3: rule__Model__GlobalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__GlobalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGSelfOperatingHeuristicText.g:1101:1: rule__Model__Group_2__3 : rule__Model__Group_2__3__Impl ;
    public final void rule__Model__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1105:1: ( rule__Model__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1106:2: rule__Model__Group_2__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1112:1: rule__Model__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1116:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1117:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1117:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1118:2: '}'
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
    // InternalGSelfOperatingHeuristicText.g:1128:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1132:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1133:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGSelfOperatingHeuristicText.g:1140:1: rule__Model__Group_3__0__Impl : ( ( rule__Model__Alternatives_3_0 )* ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1144:1: ( ( ( rule__Model__Alternatives_3_0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1145:1: ( ( rule__Model__Alternatives_3_0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1145:1: ( ( rule__Model__Alternatives_3_0 )* )
            // InternalGSelfOperatingHeuristicText.g:1146:2: ( rule__Model__Alternatives_3_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1147:2: ( rule__Model__Alternatives_3_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=17 && LA26_0<=18)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1147:3: rule__Model__Alternatives_3_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Alternatives_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalGSelfOperatingHeuristicText.g:1155:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1159:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1160:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1167:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1171:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1172:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1172:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1173:2: '{'
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
    // InternalGSelfOperatingHeuristicText.g:1182:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1186:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1187:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1194:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__EventsAssignment_3_2 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1198:1: ( ( ( rule__Model__EventsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1199:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1199:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1200:2: ( rule__Model__EventsAssignment_3_2 )*
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1201:2: ( rule__Model__EventsAssignment_3_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1201:3: rule__Model__EventsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__EventsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalGSelfOperatingHeuristicText.g:1209:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1213:1: ( rule__Model__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1214:2: rule__Model__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1220:1: rule__Model__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1224:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1225:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1225:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1226:2: '}'
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
    // InternalGSelfOperatingHeuristicText.g:1236:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1240:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1241:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGSelfOperatingHeuristicText.g:1248:1: rule__Global__Group__0__Impl : ( ( rule__Global__NameAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1252:1: ( ( ( rule__Global__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1253:1: ( ( rule__Global__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1253:1: ( ( rule__Global__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1254:2: ( rule__Global__NameAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1255:2: ( rule__Global__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1255:3: rule__Global__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1263:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1267:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1268:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGSelfOperatingHeuristicText.g:1275:1: rule__Global__Group__1__Impl : ( ( rule__Global__Alternatives_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1279:1: ( ( ( rule__Global__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1280:1: ( ( rule__Global__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1280:1: ( ( rule__Global__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1281:2: ( rule__Global__Alternatives_1 )
            {
             before(grammarAccess.getGlobalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1282:2: ( rule__Global__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1282:3: rule__Global__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1290:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1294:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1295:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGSelfOperatingHeuristicText.g:1302:1: rule__Global__Group__2__Impl : ( ( rule__Global__TypeAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1306:1: ( ( ( rule__Global__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1307:1: ( ( rule__Global__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1307:1: ( ( rule__Global__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1308:2: ( rule__Global__TypeAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1309:2: ( rule__Global__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1309:3: rule__Global__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1317:1: rule__Global__Group__3 : rule__Global__Group__3__Impl rule__Global__Group__4 ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1321:1: ( rule__Global__Group__3__Impl rule__Global__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1322:2: rule__Global__Group__3__Impl rule__Global__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGSelfOperatingHeuristicText.g:1329:1: rule__Global__Group__3__Impl : ( '=' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1333:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1334:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1334:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1335:2: '='
            {
             before(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1344:1: rule__Global__Group__4 : rule__Global__Group__4__Impl ;
    public final void rule__Global__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1348:1: ( rule__Global__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1349:2: rule__Global__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1355:1: rule__Global__Group__4__Impl : ( ( rule__Global__ValueAssignment_4 ) ) ;
    public final void rule__Global__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1359:1: ( ( ( rule__Global__ValueAssignment_4 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1360:1: ( ( rule__Global__ValueAssignment_4 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1360:1: ( ( rule__Global__ValueAssignment_4 ) )
            // InternalGSelfOperatingHeuristicText.g:1361:2: ( rule__Global__ValueAssignment_4 )
            {
             before(grammarAccess.getGlobalAccess().getValueAssignment_4()); 
            // InternalGSelfOperatingHeuristicText.g:1362:2: ( rule__Global__ValueAssignment_4 )
            // InternalGSelfOperatingHeuristicText.g:1362:3: rule__Global__ValueAssignment_4
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
    // InternalGSelfOperatingHeuristicText.g:1371:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1375:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1376:2: rule__Local__Group__0__Impl rule__Local__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGSelfOperatingHeuristicText.g:1383:1: rule__Local__Group__0__Impl : ( ( rule__Local__NameAssignment_0 ) ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1387:1: ( ( ( rule__Local__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1388:1: ( ( rule__Local__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1388:1: ( ( rule__Local__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1389:2: ( rule__Local__NameAssignment_0 )
            {
             before(grammarAccess.getLocalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1390:2: ( rule__Local__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1390:3: rule__Local__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1398:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1402:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1403:2: rule__Local__Group__1__Impl rule__Local__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGSelfOperatingHeuristicText.g:1410:1: rule__Local__Group__1__Impl : ( ( rule__Local__Alternatives_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1414:1: ( ( ( rule__Local__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1415:1: ( ( rule__Local__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1415:1: ( ( rule__Local__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1416:2: ( rule__Local__Alternatives_1 )
            {
             before(grammarAccess.getLocalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1417:2: ( rule__Local__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1417:3: rule__Local__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1425:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1429:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1430:2: rule__Local__Group__2__Impl rule__Local__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGSelfOperatingHeuristicText.g:1437:1: rule__Local__Group__2__Impl : ( ( rule__Local__TypeAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1441:1: ( ( ( rule__Local__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1442:1: ( ( rule__Local__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1442:1: ( ( rule__Local__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1443:2: ( rule__Local__TypeAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1444:2: ( rule__Local__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1444:3: rule__Local__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1452:1: rule__Local__Group__3 : rule__Local__Group__3__Impl rule__Local__Group__4 ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1456:1: ( rule__Local__Group__3__Impl rule__Local__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1457:2: rule__Local__Group__3__Impl rule__Local__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGSelfOperatingHeuristicText.g:1464:1: rule__Local__Group__3__Impl : ( '=' ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1468:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1469:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1469:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1470:2: '='
            {
             before(grammarAccess.getLocalAccess().getEqualsSignKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1479:1: rule__Local__Group__4 : rule__Local__Group__4__Impl ;
    public final void rule__Local__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1483:1: ( rule__Local__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1484:2: rule__Local__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1490:1: rule__Local__Group__4__Impl : ( ( rule__Local__ValueAssignment_4 ) ) ;
    public final void rule__Local__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1494:1: ( ( ( rule__Local__ValueAssignment_4 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1495:1: ( ( rule__Local__ValueAssignment_4 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1495:1: ( ( rule__Local__ValueAssignment_4 ) )
            // InternalGSelfOperatingHeuristicText.g:1496:2: ( rule__Local__ValueAssignment_4 )
            {
             before(grammarAccess.getLocalAccess().getValueAssignment_4()); 
            // InternalGSelfOperatingHeuristicText.g:1497:2: ( rule__Local__ValueAssignment_4 )
            // InternalGSelfOperatingHeuristicText.g:1497:3: rule__Local__ValueAssignment_4
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
    // InternalGSelfOperatingHeuristicText.g:1506:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1510:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1511:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:1518:1: rule__State__Group__0__Impl : ( ( rule__State__Group_0__0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1522:1: ( ( ( rule__State__Group_0__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1523:1: ( ( rule__State__Group_0__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1523:1: ( ( rule__State__Group_0__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1524:2: ( rule__State__Group_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0()); 
            // InternalGSelfOperatingHeuristicText.g:1525:2: ( rule__State__Group_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=21 && LA28_0<=22)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1525:3: rule__State__Group_0__0
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
    // InternalGSelfOperatingHeuristicText.g:1533:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1537:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1538:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1545:1: rule__State__Group__1__Impl : ( ( rule__State__Alternatives_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1549:1: ( ( ( rule__State__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1550:1: ( ( rule__State__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1550:1: ( ( rule__State__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1551:2: ( rule__State__Alternatives_1 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1552:2: ( rule__State__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1552:3: rule__State__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1560:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1564:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1565:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1572:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1576:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1577:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1577:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1578:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1579:2: ( rule__State__NameAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1579:3: rule__State__NameAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1587:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1591:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1592:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalGSelfOperatingHeuristicText.g:1599:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1603:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1604:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1604:1: ( ( rule__State__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1605:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1606:2: ( rule__State__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=25 && LA29_0<=26)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1606:3: rule__State__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:1614:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1618:1: ( rule__State__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1619:2: rule__State__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1625:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1629:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1630:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1630:1: ( ( rule__State__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1631:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:1632:2: ( rule__State__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=27 && LA30_0<=28)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1632:3: rule__State__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:1641:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1645:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // InternalGSelfOperatingHeuristicText.g:1646:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
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
    // InternalGSelfOperatingHeuristicText.g:1653:1: rule__State__Group_0__0__Impl : ( ( rule__State__Alternatives_0_0 ) ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1657:1: ( ( ( rule__State__Alternatives_0_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1658:1: ( ( rule__State__Alternatives_0_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1658:1: ( ( rule__State__Alternatives_0_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1659:2: ( rule__State__Alternatives_0_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_0_0()); 
            // InternalGSelfOperatingHeuristicText.g:1660:2: ( rule__State__Alternatives_0_0 )
            // InternalGSelfOperatingHeuristicText.g:1660:3: rule__State__Alternatives_0_0
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
    // InternalGSelfOperatingHeuristicText.g:1668:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1672:1: ( rule__State__Group_0__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1673:2: rule__State__Group_0__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1679:1: rule__State__Group_0__1__Impl : ( ( rule__State__InitAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1683:1: ( ( ( rule__State__InitAssignment_0_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1684:1: ( ( rule__State__InitAssignment_0_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1684:1: ( ( rule__State__InitAssignment_0_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1685:2: ( rule__State__InitAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getInitAssignment_0_1()); 
            // InternalGSelfOperatingHeuristicText.g:1686:2: ( rule__State__InitAssignment_0_1 )
            // InternalGSelfOperatingHeuristicText.g:1686:3: rule__State__InitAssignment_0_1
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
    // InternalGSelfOperatingHeuristicText.g:1695:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1699:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1700:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGSelfOperatingHeuristicText.g:1707:1: rule__State__Group_3__0__Impl : ( ( rule__State__Alternatives_3_0 ) ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1711:1: ( ( ( rule__State__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1712:1: ( ( rule__State__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1712:1: ( ( rule__State__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1713:2: ( rule__State__Alternatives_3_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1714:2: ( rule__State__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:1714:3: rule__State__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:1722:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1726:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1727:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1734:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1738:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1739:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1739:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1740:2: '{'
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
    // InternalGSelfOperatingHeuristicText.g:1749:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1753:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1754:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1761:1: rule__State__Group_3__2__Impl : ( ( rule__State__LocalsAssignment_3_2 )* ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1765:1: ( ( ( rule__State__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1766:1: ( ( rule__State__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1766:1: ( ( rule__State__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1767:2: ( rule__State__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getStateAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1768:2: ( rule__State__LocalsAssignment_3_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1768:3: rule__State__LocalsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__State__LocalsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalGSelfOperatingHeuristicText.g:1776:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1780:1: ( rule__State__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1781:2: rule__State__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1787:1: rule__State__Group_3__3__Impl : ( '}' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1791:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1792:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1792:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1793:2: '}'
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


    // $ANTLR start "rule__State__Group_4__0"
    // InternalGSelfOperatingHeuristicText.g:1803:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1807:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:1808:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGSelfOperatingHeuristicText.g:1815:1: rule__State__Group_4__0__Impl : ( ( rule__State__Alternatives_4_0 ) ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1819:1: ( ( ( rule__State__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1820:1: ( ( rule__State__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1820:1: ( ( rule__State__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1821:2: ( rule__State__Alternatives_4_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:1822:2: ( rule__State__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:1822:3: rule__State__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:1830:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1834:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:1835:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalGSelfOperatingHeuristicText.g:1842:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1846:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1847:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1847:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1848:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1857:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1861:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:1862:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGSelfOperatingHeuristicText.g:1869:1: rule__State__Group_4__2__Impl : ( ( rule__State__TransitionsAssignment_4_2 )* ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1873:1: ( ( ( rule__State__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1874:1: ( ( rule__State__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1874:1: ( ( rule__State__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1875:2: ( rule__State__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:1876:2: ( rule__State__TransitionsAssignment_4_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=31 && LA32_0<=32)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1876:3: rule__State__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__State__TransitionsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalGSelfOperatingHeuristicText.g:1884:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1888:1: ( rule__State__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1889:2: rule__State__Group_4__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1895:1: rule__State__Group_4__3__Impl : ( '}' ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1899:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1900:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1900:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1901:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1911:1: rule__Alter__Group__0 : rule__Alter__Group__0__Impl rule__Alter__Group__1 ;
    public final void rule__Alter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1915:1: ( rule__Alter__Group__0__Impl rule__Alter__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1916:2: rule__Alter__Group__0__Impl rule__Alter__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1923:1: rule__Alter__Group__0__Impl : ( ( rule__Alter__Alternatives_0 ) ) ;
    public final void rule__Alter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1927:1: ( ( ( rule__Alter__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1928:1: ( ( rule__Alter__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1928:1: ( ( rule__Alter__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1929:2: ( rule__Alter__Alternatives_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:1930:2: ( rule__Alter__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:1930:3: rule__Alter__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:1938:1: rule__Alter__Group__1 : rule__Alter__Group__1__Impl rule__Alter__Group__2 ;
    public final void rule__Alter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1942:1: ( rule__Alter__Group__1__Impl rule__Alter__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1943:2: rule__Alter__Group__1__Impl rule__Alter__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1950:1: rule__Alter__Group__1__Impl : ( ( rule__Alter__Alternatives_1 ) ) ;
    public final void rule__Alter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1954:1: ( ( ( rule__Alter__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1955:1: ( ( rule__Alter__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1955:1: ( ( rule__Alter__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1956:2: ( rule__Alter__Alternatives_1 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1957:2: ( rule__Alter__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1957:3: rule__Alter__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1965:1: rule__Alter__Group__2 : rule__Alter__Group__2__Impl rule__Alter__Group__3 ;
    public final void rule__Alter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1969:1: ( rule__Alter__Group__2__Impl rule__Alter__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1970:2: rule__Alter__Group__2__Impl rule__Alter__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1977:1: rule__Alter__Group__2__Impl : ( ( rule__Alter__StateAssignment_2 ) ) ;
    public final void rule__Alter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1981:1: ( ( ( rule__Alter__StateAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1982:1: ( ( rule__Alter__StateAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1982:1: ( ( rule__Alter__StateAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1983:2: ( rule__Alter__StateAssignment_2 )
            {
             before(grammarAccess.getAlterAccess().getStateAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1984:2: ( rule__Alter__StateAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1984:3: rule__Alter__StateAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1992:1: rule__Alter__Group__3 : rule__Alter__Group__3__Impl rule__Alter__Group__4 ;
    public final void rule__Alter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1996:1: ( rule__Alter__Group__3__Impl rule__Alter__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1997:2: rule__Alter__Group__3__Impl rule__Alter__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:2004:1: rule__Alter__Group__3__Impl : ( ( rule__Alter__Group_3__0 )? ) ;
    public final void rule__Alter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2008:1: ( ( ( rule__Alter__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2009:1: ( ( rule__Alter__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2009:1: ( ( rule__Alter__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2010:2: ( rule__Alter__Group_3__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:2011:2: ( rule__Alter__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=25 && LA33_0<=26)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2011:3: rule__Alter__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:2019:1: rule__Alter__Group__4 : rule__Alter__Group__4__Impl ;
    public final void rule__Alter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2023:1: ( rule__Alter__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2024:2: rule__Alter__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2030:1: rule__Alter__Group__4__Impl : ( ( rule__Alter__Group_4__0 )? ) ;
    public final void rule__Alter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2034:1: ( ( ( rule__Alter__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2035:1: ( ( rule__Alter__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2035:1: ( ( rule__Alter__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2036:2: ( rule__Alter__Group_4__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2037:2: ( rule__Alter__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=27 && LA34_0<=28)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2037:3: rule__Alter__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:2046:1: rule__Alter__Group_3__0 : rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 ;
    public final void rule__Alter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2050:1: ( rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:2051:2: rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGSelfOperatingHeuristicText.g:2058:1: rule__Alter__Group_3__0__Impl : ( ( rule__Alter__Alternatives_3_0 ) ) ;
    public final void rule__Alter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2062:1: ( ( ( rule__Alter__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2063:1: ( ( rule__Alter__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2063:1: ( ( rule__Alter__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2064:2: ( rule__Alter__Alternatives_3_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:2065:2: ( rule__Alter__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:2065:3: rule__Alter__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:2073:1: rule__Alter__Group_3__1 : rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 ;
    public final void rule__Alter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2077:1: ( rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:2078:2: rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:2085:1: rule__Alter__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2089:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2090:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2090:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2091:2: '{'
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
    // InternalGSelfOperatingHeuristicText.g:2100:1: rule__Alter__Group_3__2 : rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 ;
    public final void rule__Alter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2104:1: ( rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:2105:2: rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:2112:1: rule__Alter__Group_3__2__Impl : ( ( rule__Alter__LocalsAssignment_3_2 )* ) ;
    public final void rule__Alter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2116:1: ( ( ( rule__Alter__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2117:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2117:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2118:2: ( rule__Alter__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getAlterAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:2119:2: ( rule__Alter__LocalsAssignment_3_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2119:3: rule__Alter__LocalsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Alter__LocalsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalGSelfOperatingHeuristicText.g:2127:1: rule__Alter__Group_3__3 : rule__Alter__Group_3__3__Impl ;
    public final void rule__Alter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2131:1: ( rule__Alter__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2132:2: rule__Alter__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2138:1: rule__Alter__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2142:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2143:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2143:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2144:2: '}'
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
    // InternalGSelfOperatingHeuristicText.g:2154:1: rule__Alter__Group_4__0 : rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 ;
    public final void rule__Alter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2158:1: ( rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2159:2: rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGSelfOperatingHeuristicText.g:2166:1: rule__Alter__Group_4__0__Impl : ( ( rule__Alter__Alternatives_4_0 ) ) ;
    public final void rule__Alter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2170:1: ( ( ( rule__Alter__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2171:1: ( ( rule__Alter__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2171:1: ( ( rule__Alter__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2172:2: ( rule__Alter__Alternatives_4_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2173:2: ( rule__Alter__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2173:3: rule__Alter__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2181:1: rule__Alter__Group_4__1 : rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 ;
    public final void rule__Alter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2185:1: ( rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2186:2: rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2
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
    // InternalGSelfOperatingHeuristicText.g:2193:1: rule__Alter__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2197:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2198:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2198:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2199:2: '{'
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
    // InternalGSelfOperatingHeuristicText.g:2208:1: rule__Alter__Group_4__2 : rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 ;
    public final void rule__Alter__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2212:1: ( rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:2213:2: rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3
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
    // InternalGSelfOperatingHeuristicText.g:2220:1: rule__Alter__Group_4__2__Impl : ( ( rule__Alter__TransitionsAssignment_4_2 )* ) ;
    public final void rule__Alter__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2224:1: ( ( ( rule__Alter__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2225:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2225:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2226:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2227:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=31 && LA36_0<=32)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2227:3: rule__Alter__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Alter__TransitionsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalGSelfOperatingHeuristicText.g:2235:1: rule__Alter__Group_4__3 : rule__Alter__Group_4__3__Impl ;
    public final void rule__Alter__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2239:1: ( rule__Alter__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2240:2: rule__Alter__Group_4__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2246:1: rule__Alter__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2250:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2251:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2251:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2252:2: '}'
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
    // InternalGSelfOperatingHeuristicText.g:2262:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2266:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2267:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2274:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2278:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2279:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2279:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2280:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2281:2: ( rule__Transition__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2281:3: rule__Transition__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2289:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2293:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2294:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2301:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__EventAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2305:1: ( ( ( rule__Transition__EventAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2306:1: ( ( rule__Transition__EventAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2306:1: ( ( rule__Transition__EventAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2307:2: ( rule__Transition__EventAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2308:2: ( rule__Transition__EventAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2308:3: rule__Transition__EventAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2316:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2320:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2321:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2328:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Alternatives_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2332:1: ( ( ( rule__Transition__Alternatives_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2333:1: ( ( rule__Transition__Alternatives_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2333:1: ( ( rule__Transition__Alternatives_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2334:2: ( rule__Transition__Alternatives_2 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            // InternalGSelfOperatingHeuristicText.g:2335:2: ( rule__Transition__Alternatives_2 )
            // InternalGSelfOperatingHeuristicText.g:2335:3: rule__Transition__Alternatives_2
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
    // InternalGSelfOperatingHeuristicText.g:2343:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2347:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2348:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:2355:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__StateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2359:1: ( ( ( rule__Transition__StateAssignment_3 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2360:1: ( ( rule__Transition__StateAssignment_3 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2360:1: ( ( rule__Transition__StateAssignment_3 ) )
            // InternalGSelfOperatingHeuristicText.g:2361:2: ( rule__Transition__StateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2362:2: ( rule__Transition__StateAssignment_3 )
            // InternalGSelfOperatingHeuristicText.g:2362:3: rule__Transition__StateAssignment_3
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
    // InternalGSelfOperatingHeuristicText.g:2370:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2374:1: ( rule__Transition__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2375:2: rule__Transition__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2381:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2385:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2386:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2386:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2387:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2388:2: ( rule__Transition__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=35 && LA37_0<=36)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2388:3: rule__Transition__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:2397:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2401:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2402:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
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
    // InternalGSelfOperatingHeuristicText.g:2409:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__Alternatives_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2413:1: ( ( ( rule__Transition__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2414:1: ( ( rule__Transition__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2414:1: ( ( rule__Transition__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2415:2: ( rule__Transition__Alternatives_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2416:2: ( rule__Transition__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2416:3: rule__Transition__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2424:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2428:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2429:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
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
    // InternalGSelfOperatingHeuristicText.g:2436:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ConditionAssignment_4_1 )? ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2440:1: ( ( ( rule__Transition__ConditionAssignment_4_1 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2441:1: ( ( rule__Transition__ConditionAssignment_4_1 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2441:1: ( ( rule__Transition__ConditionAssignment_4_1 )? )
            // InternalGSelfOperatingHeuristicText.g:2442:2: ( rule__Transition__ConditionAssignment_4_1 )?
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_4_1()); 
            // InternalGSelfOperatingHeuristicText.g:2443:2: ( rule__Transition__ConditionAssignment_4_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2443:3: rule__Transition__ConditionAssignment_4_1
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
    // InternalGSelfOperatingHeuristicText.g:2451:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2455:1: ( rule__Transition__Group_4__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2456:2: rule__Transition__Group_4__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2462:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )? ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2466:1: ( ( ( rule__Transition__Group_4_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2467:1: ( ( rule__Transition__Group_4_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2467:1: ( ( rule__Transition__Group_4_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2468:2: ( rule__Transition__Group_4_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2469:2: ( rule__Transition__Group_4_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=37 && LA39_0<=38)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2469:3: rule__Transition__Group_4_2__0
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
    // InternalGSelfOperatingHeuristicText.g:2478:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2482:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // InternalGSelfOperatingHeuristicText.g:2483:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
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
    // InternalGSelfOperatingHeuristicText.g:2490:1: rule__Transition__Group_4_2__0__Impl : ( ( rule__Transition__Alternatives_4_2_0 ) ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2494:1: ( ( ( rule__Transition__Alternatives_4_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2495:1: ( ( rule__Transition__Alternatives_4_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2495:1: ( ( rule__Transition__Alternatives_4_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2496:2: ( rule__Transition__Alternatives_4_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:2497:2: ( rule__Transition__Alternatives_4_2_0 )
            // InternalGSelfOperatingHeuristicText.g:2497:3: rule__Transition__Alternatives_4_2_0
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
    // InternalGSelfOperatingHeuristicText.g:2505:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2509:1: ( rule__Transition__Group_4_2__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2510:2: rule__Transition__Group_4_2__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2516:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__AssignmentAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2520:1: ( ( ( rule__Transition__AssignmentAssignment_4_2_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2521:1: ( ( rule__Transition__AssignmentAssignment_4_2_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2521:1: ( ( rule__Transition__AssignmentAssignment_4_2_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2522:2: ( rule__Transition__AssignmentAssignment_4_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignment_4_2_1()); 
            // InternalGSelfOperatingHeuristicText.g:2523:2: ( rule__Transition__AssignmentAssignment_4_2_1 )
            // InternalGSelfOperatingHeuristicText.g:2523:3: rule__Transition__AssignmentAssignment_4_2_1
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
    // InternalGSelfOperatingHeuristicText.g:2532:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2536:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2537:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2544:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2548:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2549:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2549:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2550:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2551:2: ( rule__Condition__LeftAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2551:3: rule__Condition__LeftAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2559:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2563:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2564:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGSelfOperatingHeuristicText.g:2571:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2575:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2576:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2576:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2577:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2578:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2578:3: rule__Condition__OperatorAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2586:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2590:1: ( rule__Condition__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2591:2: rule__Condition__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2597:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2601:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2602:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2602:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2603:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2604:2: ( rule__Condition__RightAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2604:3: rule__Condition__RightAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2613:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2617:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2618:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGSelfOperatingHeuristicText.g:2625:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__CurrentVarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2629:1: ( ( ( rule__Assignment__CurrentVarAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2630:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2630:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2631:2: ( rule__Assignment__CurrentVarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2632:2: ( rule__Assignment__CurrentVarAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2632:3: rule__Assignment__CurrentVarAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2640:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2644:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2645:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGSelfOperatingHeuristicText.g:2652:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2656:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:2657:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:2657:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:2658:2: '='
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
    // InternalGSelfOperatingHeuristicText.g:2667:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2671:1: ( rule__Assignment__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2672:2: rule__Assignment__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2678:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2682:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2683:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2683:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2684:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2685:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2685:3: rule__Assignment__ValueAssignment_2
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalGSelfOperatingHeuristicText.g:2694:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2698:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2699:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2699:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2700:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2709:1: rule__Model__GlobalsAssignment_2_2 : ( ruleGlobal ) ;
    public final void rule__Model__GlobalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2713:1: ( ( ruleGlobal ) )
            // InternalGSelfOperatingHeuristicText.g:2714:2: ( ruleGlobal )
            {
            // InternalGSelfOperatingHeuristicText.g:2714:2: ( ruleGlobal )
            // InternalGSelfOperatingHeuristicText.g:2715:3: ruleGlobal
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
    // InternalGSelfOperatingHeuristicText.g:2724:1: rule__Model__EventsAssignment_3_2 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2728:1: ( ( ruleEvent ) )
            // InternalGSelfOperatingHeuristicText.g:2729:2: ( ruleEvent )
            {
            // InternalGSelfOperatingHeuristicText.g:2729:2: ( ruleEvent )
            // InternalGSelfOperatingHeuristicText.g:2730:3: ruleEvent
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
    // InternalGSelfOperatingHeuristicText.g:2739:1: rule__Model__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Model__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2743:1: ( ( ruleState ) )
            // InternalGSelfOperatingHeuristicText.g:2744:2: ( ruleState )
            {
            // InternalGSelfOperatingHeuristicText.g:2744:2: ( ruleState )
            // InternalGSelfOperatingHeuristicText.g:2745:3: ruleState
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
    // InternalGSelfOperatingHeuristicText.g:2754:1: rule__Model__AltersAssignment_4_1 : ( ruleAlter ) ;
    public final void rule__Model__AltersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2758:1: ( ( ruleAlter ) )
            // InternalGSelfOperatingHeuristicText.g:2759:2: ( ruleAlter )
            {
            // InternalGSelfOperatingHeuristicText.g:2759:2: ( ruleAlter )
            // InternalGSelfOperatingHeuristicText.g:2760:3: ruleAlter
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


    // $ANTLR start "rule__Global__NameAssignment_0"
    // InternalGSelfOperatingHeuristicText.g:2769:1: rule__Global__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Global__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2773:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2774:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2774:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2775:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2784:1: rule__Global__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Global__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2788:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:2789:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:2789:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:2790:3: ruleDataType
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
    // InternalGSelfOperatingHeuristicText.g:2799:1: rule__Global__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__Global__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2803:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:2804:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:2804:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:2805:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:2814:1: rule__Local__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Local__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2818:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2819:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2819:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2820:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2829:1: rule__Local__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Local__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2833:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:2834:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:2834:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:2835:3: ruleDataType
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
    // InternalGSelfOperatingHeuristicText.g:2844:1: rule__Local__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__Local__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2848:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:2849:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:2849:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:2850:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:2859:1: rule__State__InitAssignment_0_1 : ( ruleInitial ) ;
    public final void rule__State__InitAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2863:1: ( ( ruleInitial ) )
            // InternalGSelfOperatingHeuristicText.g:2864:2: ( ruleInitial )
            {
            // InternalGSelfOperatingHeuristicText.g:2864:2: ( ruleInitial )
            // InternalGSelfOperatingHeuristicText.g:2865:3: ruleInitial
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
    // InternalGSelfOperatingHeuristicText.g:2874:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2878:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2879:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2879:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2880:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2889:1: rule__State__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__State__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2893:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:2894:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:2894:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:2895:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:2904:1: rule__State__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2908:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:2909:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:2909:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:2910:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:2919:1: rule__Alter__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Alter__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2923:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:2924:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2924:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2925:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAccess().getStateStateCrossReference_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:2926:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2927:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2938:1: rule__Alter__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__Alter__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2942:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:2943:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:2943:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:2944:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:2953:1: rule__Alter__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Alter__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2957:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:2958:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:2958:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:2959:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:2968:1: rule__Transition__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2972:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:2973:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2973:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2974:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            // InternalGSelfOperatingHeuristicText.g:2975:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2976:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2987:1: rule__Transition__StateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2991:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:2992:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2992:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2993:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:2994:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2995:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3006:1: rule__Transition__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3010:1: ( ( ruleCondition ) )
            // InternalGSelfOperatingHeuristicText.g:3011:2: ( ruleCondition )
            {
            // InternalGSelfOperatingHeuristicText.g:3011:2: ( ruleCondition )
            // InternalGSelfOperatingHeuristicText.g:3012:3: ruleCondition
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
    // InternalGSelfOperatingHeuristicText.g:3021:1: rule__Transition__AssignmentAssignment_4_2_1 : ( ruleAssignment ) ;
    public final void rule__Transition__AssignmentAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3025:1: ( ( ruleAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:3026:2: ( ruleAssignment )
            {
            // InternalGSelfOperatingHeuristicText.g:3026:2: ( ruleAssignment )
            // InternalGSelfOperatingHeuristicText.g:3027:3: ruleAssignment
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
    // InternalGSelfOperatingHeuristicText.g:3036:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3040:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3041:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:3041:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3042:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:3051:1: rule__Condition__LeftAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3055:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3056:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3056:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3057:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3066:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3070:1: ( ( ruleComparisonOperator ) )
            // InternalGSelfOperatingHeuristicText.g:3071:2: ( ruleComparisonOperator )
            {
            // InternalGSelfOperatingHeuristicText.g:3071:2: ( ruleComparisonOperator )
            // InternalGSelfOperatingHeuristicText.g:3072:3: ruleComparisonOperator
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
    // InternalGSelfOperatingHeuristicText.g:3081:1: rule__Condition__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3085:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3086:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3086:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3087:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3096:1: rule__Assignment__CurrentVarAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Assignment__CurrentVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3100:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3101:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3101:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3102:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3111:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3115:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3116:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3116:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3117:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3126:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3130:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3131:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3131:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3132:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            // InternalGSelfOperatingHeuristicText.g:3133:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3134:4: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008000061E78000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000061E00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000180000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0007F00000000000L});

}
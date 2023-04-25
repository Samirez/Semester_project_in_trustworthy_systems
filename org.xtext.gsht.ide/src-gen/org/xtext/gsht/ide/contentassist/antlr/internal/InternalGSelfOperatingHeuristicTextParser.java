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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DRONE'", "'drone'", "'GLOBAL'", "'global'", "'EVENTS'", "'events'", "'AS'", "'as'", "'STATE'", "'state'", "'PROPS'", "'props'", "'TRANSITIONS'", "'transitions'", "'ALTER'", "'alter'", "'ON'", "'on'", "'TO'", "'to'", "'IF'", "'if'", "'SET'", "'set'", "'??'", "'int'", "'boolean'", "'double'", "'String'", "'\\u00A4\\u00A4'", "'!='", "'=='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", "'='"
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


    // $ANTLR start "ruleDataType"
    // InternalGSelfOperatingHeuristicText.g:328:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:332:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:333:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:333:2: ( ( rule__DataType__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:334:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:335:3: ( rule__DataType__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:335:4: rule__DataType__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:344:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:348:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalGSelfOperatingHeuristicText.g:349:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalGSelfOperatingHeuristicText.g:349:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalGSelfOperatingHeuristicText.g:350:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalGSelfOperatingHeuristicText.g:351:3: ( rule__ComparisonOperator__Alternatives )
            // InternalGSelfOperatingHeuristicText.g:351:4: rule__ComparisonOperator__Alternatives
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
    // InternalGSelfOperatingHeuristicText.g:359:1: rule__Model__Alternatives_0 : ( ( 'DRONE' ) | ( 'drone' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:363:1: ( ( 'DRONE' ) | ( 'drone' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:364:2: ( 'DRONE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:364:2: ( 'DRONE' )
                    // InternalGSelfOperatingHeuristicText.g:365:3: 'DRONE'
                    {
                     before(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDRONEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:370:2: ( 'drone' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:370:2: ( 'drone' )
                    // InternalGSelfOperatingHeuristicText.g:371:3: 'drone'
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
    // InternalGSelfOperatingHeuristicText.g:380:1: rule__Model__Alternatives_2_0 : ( ( 'GLOBAL' ) | ( 'global' ) );
    public final void rule__Model__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:384:1: ( ( 'GLOBAL' ) | ( 'global' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:385:2: ( 'GLOBAL' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:385:2: ( 'GLOBAL' )
                    // InternalGSelfOperatingHeuristicText.g:386:3: 'GLOBAL'
                    {
                     before(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:391:2: ( 'global' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:391:2: ( 'global' )
                    // InternalGSelfOperatingHeuristicText.g:392:3: 'global'
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
    // InternalGSelfOperatingHeuristicText.g:401:1: rule__Model__Alternatives_3_0 : ( ( 'EVENTS' ) | ( 'events' ) );
    public final void rule__Model__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:405:1: ( ( 'EVENTS' ) | ( 'events' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:406:2: ( 'EVENTS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:406:2: ( 'EVENTS' )
                    // InternalGSelfOperatingHeuristicText.g:407:3: 'EVENTS'
                    {
                     before(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:412:2: ( 'events' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:412:2: ( 'events' )
                    // InternalGSelfOperatingHeuristicText.g:413:3: 'events'
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
    // InternalGSelfOperatingHeuristicText.g:422:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) );
    public final void rule__Model__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:426:1: ( ( ( rule__Model__StatesAssignment_4_0 ) ) | ( ( rule__Model__AltersAssignment_4_1 ) ) )
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
                    // InternalGSelfOperatingHeuristicText.g:427:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:427:2: ( ( rule__Model__StatesAssignment_4_0 ) )
                    // InternalGSelfOperatingHeuristicText.g:428:3: ( rule__Model__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getModelAccess().getStatesAssignment_4_0()); 
                    // InternalGSelfOperatingHeuristicText.g:429:3: ( rule__Model__StatesAssignment_4_0 )
                    // InternalGSelfOperatingHeuristicText.g:429:4: rule__Model__StatesAssignment_4_0
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
                    // InternalGSelfOperatingHeuristicText.g:433:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:433:2: ( ( rule__Model__AltersAssignment_4_1 ) )
                    // InternalGSelfOperatingHeuristicText.g:434:3: ( rule__Model__AltersAssignment_4_1 )
                    {
                     before(grammarAccess.getModelAccess().getAltersAssignment_4_1()); 
                    // InternalGSelfOperatingHeuristicText.g:435:3: ( rule__Model__AltersAssignment_4_1 )
                    // InternalGSelfOperatingHeuristicText.g:435:4: rule__Model__AltersAssignment_4_1
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
    // InternalGSelfOperatingHeuristicText.g:443:1: rule__Global__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Global__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:447:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:448:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:448:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:449:3: 'AS'
                    {
                     before(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getGlobalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:454:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:454:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:455:3: 'as'
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
    // InternalGSelfOperatingHeuristicText.g:464:1: rule__Local__Alternatives_1 : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__Local__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:468:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:469:2: ( 'AS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:469:2: ( 'AS' )
                    // InternalGSelfOperatingHeuristicText.g:470:3: 'AS'
                    {
                     before(grammarAccess.getLocalAccess().getASKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLocalAccess().getASKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:475:2: ( 'as' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:475:2: ( 'as' )
                    // InternalGSelfOperatingHeuristicText.g:476:3: 'as'
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
    // InternalGSelfOperatingHeuristicText.g:485:1: rule__State__Alternatives_0 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:489:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:490:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:490:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:491:3: 'STATE'
                    {
                     before(grammarAccess.getStateAccess().getSTATEKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getSTATEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:496:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:496:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:497:3: 'state'
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
    // InternalGSelfOperatingHeuristicText.g:506:1: rule__State__Alternatives_2_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__State__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:510:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:511:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:511:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:512:3: 'PROPS'
                    {
                     before(grammarAccess.getStateAccess().getPROPSKeyword_2_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getPROPSKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:517:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:517:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:518:3: 'props'
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
    // InternalGSelfOperatingHeuristicText.g:527:1: rule__State__Alternatives_3_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__State__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:531:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:532:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:532:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:533:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getStateAccess().getTRANSITIONSKeyword_3_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getTRANSITIONSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:538:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:538:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:539:3: 'transitions'
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
    // InternalGSelfOperatingHeuristicText.g:548:1: rule__Alter__Alternatives_0 : ( ( 'ALTER' ) | ( 'alter' ) );
    public final void rule__Alter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:552:1: ( ( 'ALTER' ) | ( 'alter' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:553:2: ( 'ALTER' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:553:2: ( 'ALTER' )
                    // InternalGSelfOperatingHeuristicText.g:554:3: 'ALTER'
                    {
                     before(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getALTERKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:559:2: ( 'alter' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:559:2: ( 'alter' )
                    // InternalGSelfOperatingHeuristicText.g:560:3: 'alter'
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
    // InternalGSelfOperatingHeuristicText.g:569:1: rule__Alter__Alternatives_1 : ( ( 'STATE' ) | ( 'state' ) );
    public final void rule__Alter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:573:1: ( ( 'STATE' ) | ( 'state' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:574:2: ( 'STATE' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:574:2: ( 'STATE' )
                    // InternalGSelfOperatingHeuristicText.g:575:3: 'STATE'
                    {
                     before(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getSTATEKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:580:2: ( 'state' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:580:2: ( 'state' )
                    // InternalGSelfOperatingHeuristicText.g:581:3: 'state'
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
    // InternalGSelfOperatingHeuristicText.g:590:1: rule__Alter__Alternatives_3_0 : ( ( 'PROPS' ) | ( 'props' ) );
    public final void rule__Alter__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:594:1: ( ( 'PROPS' ) | ( 'props' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:595:2: ( 'PROPS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:595:2: ( 'PROPS' )
                    // InternalGSelfOperatingHeuristicText.g:596:3: 'PROPS'
                    {
                     before(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:601:2: ( 'props' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:601:2: ( 'props' )
                    // InternalGSelfOperatingHeuristicText.g:602:3: 'props'
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
    // InternalGSelfOperatingHeuristicText.g:611:1: rule__Alter__Alternatives_4_0 : ( ( 'TRANSITIONS' ) | ( 'transitions' ) );
    public final void rule__Alter__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:615:1: ( ( 'TRANSITIONS' ) | ( 'transitions' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:616:2: ( 'TRANSITIONS' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:616:2: ( 'TRANSITIONS' )
                    // InternalGSelfOperatingHeuristicText.g:617:3: 'TRANSITIONS'
                    {
                     before(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:622:2: ( 'transitions' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:622:2: ( 'transitions' )
                    // InternalGSelfOperatingHeuristicText.g:623:3: 'transitions'
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
    // InternalGSelfOperatingHeuristicText.g:632:1: rule__Transition__Alternatives_0 : ( ( 'ON' ) | ( 'on' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:636:1: ( ( 'ON' ) | ( 'on' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:637:2: ( 'ON' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:637:2: ( 'ON' )
                    // InternalGSelfOperatingHeuristicText.g:638:3: 'ON'
                    {
                     before(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getONKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:643:2: ( 'on' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:643:2: ( 'on' )
                    // InternalGSelfOperatingHeuristicText.g:644:3: 'on'
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
    // InternalGSelfOperatingHeuristicText.g:653:1: rule__Transition__Alternatives_2 : ( ( 'TO' ) | ( 'to' ) );
    public final void rule__Transition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:657:1: ( ( 'TO' ) | ( 'to' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:658:2: ( 'TO' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:658:2: ( 'TO' )
                    // InternalGSelfOperatingHeuristicText.g:659:3: 'TO'
                    {
                     before(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getTOKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:664:2: ( 'to' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:664:2: ( 'to' )
                    // InternalGSelfOperatingHeuristicText.g:665:3: 'to'
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
    // InternalGSelfOperatingHeuristicText.g:674:1: rule__Transition__Alternatives_4_0 : ( ( 'IF' ) | ( 'if' ) );
    public final void rule__Transition__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:678:1: ( ( 'IF' ) | ( 'if' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:679:2: ( 'IF' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:679:2: ( 'IF' )
                    // InternalGSelfOperatingHeuristicText.g:680:3: 'IF'
                    {
                     before(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getIFKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:685:2: ( 'if' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:685:2: ( 'if' )
                    // InternalGSelfOperatingHeuristicText.g:686:3: 'if'
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
    // InternalGSelfOperatingHeuristicText.g:695:1: rule__Transition__Alternatives_4_2_0 : ( ( 'SET' ) | ( 'set' ) );
    public final void rule__Transition__Alternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:699:1: ( ( 'SET' ) | ( 'set' ) )
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
                    // InternalGSelfOperatingHeuristicText.g:700:2: ( 'SET' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:700:2: ( 'SET' )
                    // InternalGSelfOperatingHeuristicText.g:701:3: 'SET'
                    {
                     before(grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:706:2: ( 'set' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:706:2: ( 'set' )
                    // InternalGSelfOperatingHeuristicText.g:707:3: 'set'
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
    // InternalGSelfOperatingHeuristicText.g:716:1: rule__Value__Alternatives : ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:720:1: ( ( RULE_BOOL ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DOUBLE ) )
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
                    // InternalGSelfOperatingHeuristicText.g:721:2: ( RULE_BOOL )
                    {
                    // InternalGSelfOperatingHeuristicText.g:721:2: ( RULE_BOOL )
                    // InternalGSelfOperatingHeuristicText.g:722:3: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:727:2: ( RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:727:2: ( RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:728:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:733:2: ( RULE_INT )
                    {
                    // InternalGSelfOperatingHeuristicText.g:733:2: ( RULE_INT )
                    // InternalGSelfOperatingHeuristicText.g:734:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:739:2: ( RULE_DOUBLE )
                    {
                    // InternalGSelfOperatingHeuristicText.g:739:2: ( RULE_DOUBLE )
                    // InternalGSelfOperatingHeuristicText.g:740:3: RULE_DOUBLE
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
    // InternalGSelfOperatingHeuristicText.g:749:1: rule__DataType__Alternatives : ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:753:1: ( ( ( '??' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            case 40:
                {
                alt19=4;
                }
                break;
            case 41:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:754:2: ( ( '??' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:754:2: ( ( '??' ) )
                    // InternalGSelfOperatingHeuristicText.g:755:3: ( '??' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:756:3: ( '??' )
                    // InternalGSelfOperatingHeuristicText.g:756:4: '??'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:760:2: ( ( 'int' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:760:2: ( ( 'int' ) )
                    // InternalGSelfOperatingHeuristicText.g:761:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:762:3: ( 'int' )
                    // InternalGSelfOperatingHeuristicText.g:762:4: 'int'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:766:2: ( ( 'boolean' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:766:2: ( ( 'boolean' ) )
                    // InternalGSelfOperatingHeuristicText.g:767:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:768:3: ( 'boolean' )
                    // InternalGSelfOperatingHeuristicText.g:768:4: 'boolean'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:772:2: ( ( 'double' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:772:2: ( ( 'double' ) )
                    // InternalGSelfOperatingHeuristicText.g:773:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:774:3: ( 'double' )
                    // InternalGSelfOperatingHeuristicText.g:774:4: 'double'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:778:2: ( ( 'String' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:778:2: ( ( 'String' ) )
                    // InternalGSelfOperatingHeuristicText.g:779:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:780:3: ( 'String' )
                    // InternalGSelfOperatingHeuristicText.g:780:4: 'String'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalGSelfOperatingHeuristicText.g:788:1: rule__ComparisonOperator__Alternatives : ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:792:1: ( ( ( '\\u00A4\\u00A4' ) ) | ( ( '!=' ) ) | ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
                {
                alt20=2;
                }
                break;
            case 44:
                {
                alt20=3;
                }
                break;
            case 45:
                {
                alt20=4;
                }
                break;
            case 46:
                {
                alt20=5;
                }
                break;
            case 47:
                {
                alt20=6;
                }
                break;
            case 48:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:793:2: ( ( '\\u00A4\\u00A4' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:793:2: ( ( '\\u00A4\\u00A4' ) )
                    // InternalGSelfOperatingHeuristicText.g:794:3: ( '\\u00A4\\u00A4' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 
                    // InternalGSelfOperatingHeuristicText.g:795:3: ( '\\u00A4\\u00A4' )
                    // InternalGSelfOperatingHeuristicText.g:795:4: '\\u00A4\\u00A4'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:799:2: ( ( '!=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:799:2: ( ( '!=' ) )
                    // InternalGSelfOperatingHeuristicText.g:800:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalGSelfOperatingHeuristicText.g:801:3: ( '!=' )
                    // InternalGSelfOperatingHeuristicText.g:801:4: '!='
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:805:2: ( ( '==' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:805:2: ( ( '==' ) )
                    // InternalGSelfOperatingHeuristicText.g:806:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    // InternalGSelfOperatingHeuristicText.g:807:3: ( '==' )
                    // InternalGSelfOperatingHeuristicText.g:807:4: '=='
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:811:2: ( ( '>' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:811:2: ( ( '>' ) )
                    // InternalGSelfOperatingHeuristicText.g:812:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 
                    // InternalGSelfOperatingHeuristicText.g:813:3: ( '>' )
                    // InternalGSelfOperatingHeuristicText.g:813:4: '>'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:817:2: ( ( '<' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:817:2: ( ( '<' ) )
                    // InternalGSelfOperatingHeuristicText.g:818:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 
                    // InternalGSelfOperatingHeuristicText.g:819:3: ( '<' )
                    // InternalGSelfOperatingHeuristicText.g:819:4: '<'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGSelfOperatingHeuristicText.g:823:2: ( ( '>=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:823:2: ( ( '>=' ) )
                    // InternalGSelfOperatingHeuristicText.g:824:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 
                    // InternalGSelfOperatingHeuristicText.g:825:3: ( '>=' )
                    // InternalGSelfOperatingHeuristicText.g:825:4: '>='
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGSelfOperatingHeuristicText.g:829:2: ( ( '<=' ) )
                    {
                    // InternalGSelfOperatingHeuristicText.g:829:2: ( ( '<=' ) )
                    // InternalGSelfOperatingHeuristicText.g:830:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6()); 
                    // InternalGSelfOperatingHeuristicText.g:831:3: ( '<=' )
                    // InternalGSelfOperatingHeuristicText.g:831:4: '<='
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalGSelfOperatingHeuristicText.g:839:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:843:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:844:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:851:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:855:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:856:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:856:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:857:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:858:2: ( rule__Model__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:858:3: rule__Model__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:866:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:870:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:871:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:878:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:882:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:883:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:883:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:884:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:885:2: ( rule__Model__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:885:3: rule__Model__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:893:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:897:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:898:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:905:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:909:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:910:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:910:1: ( ( rule__Model__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:911:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:912:2: ( rule__Model__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=15 && LA21_0<=16)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:912:3: rule__Model__Group_2__0
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
    // InternalGSelfOperatingHeuristicText.g:920:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:924:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:925:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalGSelfOperatingHeuristicText.g:932:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:936:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:937:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:937:1: ( ( rule__Model__Group_3__0 )* )
            // InternalGSelfOperatingHeuristicText.g:938:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:939:2: ( rule__Model__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=18)||LA22_0==49) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:939:3: rule__Model__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGSelfOperatingHeuristicText.g:947:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:951:1: ( rule__Model__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:952:2: rule__Model__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:958:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:962:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // InternalGSelfOperatingHeuristicText.g:963:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:963:1: ( ( rule__Model__Alternatives_4 )* )
            // InternalGSelfOperatingHeuristicText.g:964:2: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // InternalGSelfOperatingHeuristicText.g:965:2: ( rule__Model__Alternatives_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=21 && LA23_0<=22)||(LA23_0>=27 && LA23_0<=28)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:965:3: rule__Model__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGSelfOperatingHeuristicText.g:974:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:978:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:979:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
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
    // InternalGSelfOperatingHeuristicText.g:986:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__Alternatives_2_0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:990:1: ( ( ( rule__Model__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:991:1: ( ( rule__Model__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:991:1: ( ( rule__Model__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:992:2: ( rule__Model__Alternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:993:2: ( rule__Model__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:993:3: rule__Model__Alternatives_2_0
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
    // InternalGSelfOperatingHeuristicText.g:1001:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1005:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1006:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
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
    // InternalGSelfOperatingHeuristicText.g:1013:1: rule__Model__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1017:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1018:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1018:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1019:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1028:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl rule__Model__Group_2__3 ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1032:1: ( rule__Model__Group_2__2__Impl rule__Model__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1033:2: rule__Model__Group_2__2__Impl rule__Model__Group_2__3
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
    // InternalGSelfOperatingHeuristicText.g:1040:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__GlobalsAssignment_2_2 )* ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1044:1: ( ( ( rule__Model__GlobalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1045:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1045:1: ( ( rule__Model__GlobalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1046:2: ( rule__Model__GlobalsAssignment_2_2 )*
            {
             before(grammarAccess.getModelAccess().getGlobalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1047:2: ( rule__Model__GlobalsAssignment_2_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1047:3: rule__Model__GlobalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__GlobalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalGSelfOperatingHeuristicText.g:1055:1: rule__Model__Group_2__3 : rule__Model__Group_2__3__Impl ;
    public final void rule__Model__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1059:1: ( rule__Model__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1060:2: rule__Model__Group_2__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1066:1: rule__Model__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1070:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1071:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1071:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1072:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1082:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1086:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1087:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1094:1: rule__Model__Group_3__0__Impl : ( ( rule__Model__Alternatives_3_0 )* ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1098:1: ( ( ( rule__Model__Alternatives_3_0 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1099:1: ( ( rule__Model__Alternatives_3_0 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1099:1: ( ( rule__Model__Alternatives_3_0 )* )
            // InternalGSelfOperatingHeuristicText.g:1100:2: ( rule__Model__Alternatives_3_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1101:2: ( rule__Model__Alternatives_3_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=17 && LA25_0<=18)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1101:3: rule__Model__Alternatives_3_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Alternatives_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGSelfOperatingHeuristicText.g:1109:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1113:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1114:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:1121:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1125:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1126:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1126:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1127:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1136:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1140:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1141:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:1148:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__EventsAssignment_3_2 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1152:1: ( ( ( rule__Model__EventsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1153:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1153:1: ( ( rule__Model__EventsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1154:2: ( rule__Model__EventsAssignment_3_2 )*
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1155:2: ( rule__Model__EventsAssignment_3_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1155:3: rule__Model__EventsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__EventsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalGSelfOperatingHeuristicText.g:1163:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1167:1: ( rule__Model__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1168:2: rule__Model__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1174:1: rule__Model__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1178:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1179:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1179:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1180:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1190:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1194:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1195:2: rule__Global__Group__0__Impl rule__Global__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1202:1: rule__Global__Group__0__Impl : ( ( rule__Global__NameAssignment_0 ) ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1206:1: ( ( ( rule__Global__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1207:1: ( ( rule__Global__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1207:1: ( ( rule__Global__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1208:2: ( rule__Global__NameAssignment_0 )
            {
             before(grammarAccess.getGlobalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1209:2: ( rule__Global__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1209:3: rule__Global__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1217:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1221:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1222:2: rule__Global__Group__1__Impl rule__Global__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1229:1: rule__Global__Group__1__Impl : ( ( rule__Global__Alternatives_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1233:1: ( ( ( rule__Global__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1234:1: ( ( rule__Global__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1234:1: ( ( rule__Global__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1235:2: ( rule__Global__Alternatives_1 )
            {
             before(grammarAccess.getGlobalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1236:2: ( rule__Global__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1236:3: rule__Global__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1244:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1248:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1249:2: rule__Global__Group__2__Impl rule__Global__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1256:1: rule__Global__Group__2__Impl : ( ( rule__Global__TypeAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1260:1: ( ( ( rule__Global__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1261:1: ( ( rule__Global__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1261:1: ( ( rule__Global__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1262:2: ( rule__Global__TypeAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1263:2: ( rule__Global__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1263:3: rule__Global__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1271:1: rule__Global__Group__3 : rule__Global__Group__3__Impl ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1275:1: ( rule__Global__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1276:2: rule__Global__Group__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1282:1: rule__Global__Group__3__Impl : ( ( rule__Global__Group_3__0 )? ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1286:1: ( ( ( rule__Global__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1287:1: ( ( rule__Global__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1287:1: ( ( rule__Global__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1288:2: ( rule__Global__Group_3__0 )?
            {
             before(grammarAccess.getGlobalAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1289:2: ( rule__Global__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1289:3: rule__Global__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:1298:1: rule__Global__Group_3__0 : rule__Global__Group_3__0__Impl rule__Global__Group_3__1 ;
    public final void rule__Global__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1302:1: ( rule__Global__Group_3__0__Impl rule__Global__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1303:2: rule__Global__Group_3__0__Impl rule__Global__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGSelfOperatingHeuristicText.g:1310:1: rule__Global__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Global__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1314:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1315:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1315:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1316:2: '='
            {
             before(grammarAccess.getGlobalAccess().getEqualsSignKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1325:1: rule__Global__Group_3__1 : rule__Global__Group_3__1__Impl ;
    public final void rule__Global__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1329:1: ( rule__Global__Group_3__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1330:2: rule__Global__Group_3__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1336:1: rule__Global__Group_3__1__Impl : ( ( rule__Global__ValueAssignment_3_1 ) ) ;
    public final void rule__Global__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1340:1: ( ( ( rule__Global__ValueAssignment_3_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1341:1: ( ( rule__Global__ValueAssignment_3_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1341:1: ( ( rule__Global__ValueAssignment_3_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1342:2: ( rule__Global__ValueAssignment_3_1 )
            {
             before(grammarAccess.getGlobalAccess().getValueAssignment_3_1()); 
            // InternalGSelfOperatingHeuristicText.g:1343:2: ( rule__Global__ValueAssignment_3_1 )
            // InternalGSelfOperatingHeuristicText.g:1343:3: rule__Global__ValueAssignment_3_1
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
    // InternalGSelfOperatingHeuristicText.g:1352:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1356:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1357:2: rule__Local__Group__0__Impl rule__Local__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1364:1: rule__Local__Group__0__Impl : ( ( rule__Local__NameAssignment_0 ) ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1368:1: ( ( ( rule__Local__NameAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1369:1: ( ( rule__Local__NameAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1369:1: ( ( rule__Local__NameAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1370:2: ( rule__Local__NameAssignment_0 )
            {
             before(grammarAccess.getLocalAccess().getNameAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:1371:2: ( rule__Local__NameAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:1371:3: rule__Local__NameAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:1379:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1383:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1384:2: rule__Local__Group__1__Impl rule__Local__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1391:1: rule__Local__Group__1__Impl : ( ( rule__Local__Alternatives_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1395:1: ( ( ( rule__Local__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1396:1: ( ( rule__Local__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1396:1: ( ( rule__Local__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1397:2: ( rule__Local__Alternatives_1 )
            {
             before(grammarAccess.getLocalAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1398:2: ( rule__Local__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1398:3: rule__Local__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1406:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1410:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1411:2: rule__Local__Group__2__Impl rule__Local__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:1418:1: rule__Local__Group__2__Impl : ( ( rule__Local__TypeAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1422:1: ( ( ( rule__Local__TypeAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1423:1: ( ( rule__Local__TypeAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1423:1: ( ( rule__Local__TypeAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1424:2: ( rule__Local__TypeAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getTypeAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1425:2: ( rule__Local__TypeAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1425:3: rule__Local__TypeAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1433:1: rule__Local__Group__3 : rule__Local__Group__3__Impl ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1437:1: ( rule__Local__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1438:2: rule__Local__Group__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1444:1: rule__Local__Group__3__Impl : ( ( rule__Local__Group_3__0 )? ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1448:1: ( ( ( rule__Local__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1449:1: ( ( rule__Local__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1449:1: ( ( rule__Local__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1450:2: ( rule__Local__Group_3__0 )?
            {
             before(grammarAccess.getLocalAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1451:2: ( rule__Local__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1451:3: rule__Local__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:1460:1: rule__Local__Group_3__0 : rule__Local__Group_3__0__Impl rule__Local__Group_3__1 ;
    public final void rule__Local__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1464:1: ( rule__Local__Group_3__0__Impl rule__Local__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1465:2: rule__Local__Group_3__0__Impl rule__Local__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGSelfOperatingHeuristicText.g:1472:1: rule__Local__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Local__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1476:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:1477:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:1477:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:1478:2: '='
            {
             before(grammarAccess.getLocalAccess().getEqualsSignKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1487:1: rule__Local__Group_3__1 : rule__Local__Group_3__1__Impl ;
    public final void rule__Local__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1491:1: ( rule__Local__Group_3__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:1492:2: rule__Local__Group_3__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1498:1: rule__Local__Group_3__1__Impl : ( ( rule__Local__ValueAssignment_3_1 ) ) ;
    public final void rule__Local__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1502:1: ( ( ( rule__Local__ValueAssignment_3_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1503:1: ( ( rule__Local__ValueAssignment_3_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1503:1: ( ( rule__Local__ValueAssignment_3_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1504:2: ( rule__Local__ValueAssignment_3_1 )
            {
             before(grammarAccess.getLocalAccess().getValueAssignment_3_1()); 
            // InternalGSelfOperatingHeuristicText.g:1505:2: ( rule__Local__ValueAssignment_3_1 )
            // InternalGSelfOperatingHeuristicText.g:1505:3: rule__Local__ValueAssignment_3_1
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
    // InternalGSelfOperatingHeuristicText.g:1514:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1518:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1519:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:1526:1: rule__State__Group__0__Impl : ( ( rule__State__Alternatives_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1530:1: ( ( ( rule__State__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1531:1: ( ( rule__State__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1531:1: ( ( rule__State__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1532:2: ( rule__State__Alternatives_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:1533:2: ( rule__State__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:1533:3: rule__State__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:1541:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1545:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1546:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:1553:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1557:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1558:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1558:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1559:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:1560:2: ( rule__State__NameAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:1560:3: rule__State__NameAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:1568:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1572:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1573:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:1580:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1584:1: ( ( ( rule__State__Group_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1585:1: ( ( rule__State__Group_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1585:1: ( ( rule__State__Group_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1586:2: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // InternalGSelfOperatingHeuristicText.g:1587:2: ( rule__State__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=23 && LA29_0<=24)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1587:3: rule__State__Group_2__0
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
    // InternalGSelfOperatingHeuristicText.g:1595:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1599:1: ( rule__State__Group__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1600:2: rule__State__Group__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1606:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1610:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1611:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1611:1: ( ( rule__State__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1612:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1613:2: ( rule__State__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=25 && LA30_0<=26)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1613:3: rule__State__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:1622:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1626:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // InternalGSelfOperatingHeuristicText.g:1627:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGSelfOperatingHeuristicText.g:1634:1: rule__State__Group_2__0__Impl : ( ( rule__State__Alternatives_2_0 ) ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1638:1: ( ( ( rule__State__Alternatives_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1639:1: ( ( rule__State__Alternatives_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1639:1: ( ( rule__State__Alternatives_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1640:2: ( rule__State__Alternatives_2_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:1641:2: ( rule__State__Alternatives_2_0 )
            // InternalGSelfOperatingHeuristicText.g:1641:3: rule__State__Alternatives_2_0
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
    // InternalGSelfOperatingHeuristicText.g:1649:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1653:1: ( rule__State__Group_2__1__Impl rule__State__Group_2__2 )
            // InternalGSelfOperatingHeuristicText.g:1654:2: rule__State__Group_2__1__Impl rule__State__Group_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1661:1: rule__State__Group_2__1__Impl : ( '{' ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1665:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1666:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1666:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1667:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1676:1: rule__State__Group_2__2 : rule__State__Group_2__2__Impl rule__State__Group_2__3 ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1680:1: ( rule__State__Group_2__2__Impl rule__State__Group_2__3 )
            // InternalGSelfOperatingHeuristicText.g:1681:2: rule__State__Group_2__2__Impl rule__State__Group_2__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGSelfOperatingHeuristicText.g:1688:1: rule__State__Group_2__2__Impl : ( ( rule__State__LocalsAssignment_2_2 )* ) ;
    public final void rule__State__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1692:1: ( ( ( rule__State__LocalsAssignment_2_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1693:1: ( ( rule__State__LocalsAssignment_2_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1693:1: ( ( rule__State__LocalsAssignment_2_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1694:2: ( rule__State__LocalsAssignment_2_2 )*
            {
             before(grammarAccess.getStateAccess().getLocalsAssignment_2_2()); 
            // InternalGSelfOperatingHeuristicText.g:1695:2: ( rule__State__LocalsAssignment_2_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1695:3: rule__State__LocalsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__State__LocalsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalGSelfOperatingHeuristicText.g:1703:1: rule__State__Group_2__3 : rule__State__Group_2__3__Impl ;
    public final void rule__State__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1707:1: ( rule__State__Group_2__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1708:2: rule__State__Group_2__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1714:1: rule__State__Group_2__3__Impl : ( '}' ) ;
    public final void rule__State__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1718:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1719:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1719:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1720:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1730:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1734:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1735:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1742:1: rule__State__Group_3__0__Impl : ( ( rule__State__Alternatives_3_0 ) ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1746:1: ( ( ( rule__State__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1747:1: ( ( rule__State__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1747:1: ( ( rule__State__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1748:2: ( rule__State__Alternatives_3_0 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1749:2: ( rule__State__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:1749:3: rule__State__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:1757:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1761:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:1762:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGSelfOperatingHeuristicText.g:1769:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1773:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:1774:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:1774:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:1775:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1784:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1788:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:1789:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGSelfOperatingHeuristicText.g:1796:1: rule__State__Group_3__2__Impl : ( ( rule__State__TransitionsAssignment_3_2 )* ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1800:1: ( ( ( rule__State__TransitionsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:1801:1: ( ( rule__State__TransitionsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:1801:1: ( ( rule__State__TransitionsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:1802:2: ( rule__State__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:1803:2: ( rule__State__TransitionsAssignment_3_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=29 && LA32_0<=30)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1803:3: rule__State__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__State__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalGSelfOperatingHeuristicText.g:1811:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1815:1: ( rule__State__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:1816:2: rule__State__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1822:1: rule__State__Group_3__3__Impl : ( '}' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1826:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:1827:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:1827:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:1828:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:1838:1: rule__Alter__Group__0 : rule__Alter__Group__0__Impl rule__Alter__Group__1 ;
    public final void rule__Alter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1842:1: ( rule__Alter__Group__0__Impl rule__Alter__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:1843:2: rule__Alter__Group__0__Impl rule__Alter__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGSelfOperatingHeuristicText.g:1850:1: rule__Alter__Group__0__Impl : ( ( rule__Alter__Alternatives_0 ) ) ;
    public final void rule__Alter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1854:1: ( ( ( rule__Alter__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1855:1: ( ( rule__Alter__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1855:1: ( ( rule__Alter__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1856:2: ( rule__Alter__Alternatives_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:1857:2: ( rule__Alter__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:1857:3: rule__Alter__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:1865:1: rule__Alter__Group__1 : rule__Alter__Group__1__Impl rule__Alter__Group__2 ;
    public final void rule__Alter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1869:1: ( rule__Alter__Group__1__Impl rule__Alter__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:1870:2: rule__Alter__Group__1__Impl rule__Alter__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:1877:1: rule__Alter__Group__1__Impl : ( ( rule__Alter__Alternatives_1 ) ) ;
    public final void rule__Alter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1881:1: ( ( ( rule__Alter__Alternatives_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1882:1: ( ( rule__Alter__Alternatives_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1882:1: ( ( rule__Alter__Alternatives_1 ) )
            // InternalGSelfOperatingHeuristicText.g:1883:2: ( rule__Alter__Alternatives_1 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_1()); 
            // InternalGSelfOperatingHeuristicText.g:1884:2: ( rule__Alter__Alternatives_1 )
            // InternalGSelfOperatingHeuristicText.g:1884:3: rule__Alter__Alternatives_1
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
    // InternalGSelfOperatingHeuristicText.g:1892:1: rule__Alter__Group__2 : rule__Alter__Group__2__Impl rule__Alter__Group__3 ;
    public final void rule__Alter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1896:1: ( rule__Alter__Group__2__Impl rule__Alter__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:1897:2: rule__Alter__Group__2__Impl rule__Alter__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:1904:1: rule__Alter__Group__2__Impl : ( ( rule__Alter__StateAssignment_2 ) ) ;
    public final void rule__Alter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1908:1: ( ( ( rule__Alter__StateAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1909:1: ( ( rule__Alter__StateAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1909:1: ( ( rule__Alter__StateAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:1910:2: ( rule__Alter__StateAssignment_2 )
            {
             before(grammarAccess.getAlterAccess().getStateAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:1911:2: ( rule__Alter__StateAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:1911:3: rule__Alter__StateAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:1919:1: rule__Alter__Group__3 : rule__Alter__Group__3__Impl rule__Alter__Group__4 ;
    public final void rule__Alter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1923:1: ( rule__Alter__Group__3__Impl rule__Alter__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:1924:2: rule__Alter__Group__3__Impl rule__Alter__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGSelfOperatingHeuristicText.g:1931:1: rule__Alter__Group__3__Impl : ( ( rule__Alter__Group_3__0 )? ) ;
    public final void rule__Alter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1935:1: ( ( ( rule__Alter__Group_3__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1936:1: ( ( rule__Alter__Group_3__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1936:1: ( ( rule__Alter__Group_3__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1937:2: ( rule__Alter__Group_3__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_3()); 
            // InternalGSelfOperatingHeuristicText.g:1938:2: ( rule__Alter__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=23 && LA33_0<=24)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1938:3: rule__Alter__Group_3__0
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
    // InternalGSelfOperatingHeuristicText.g:1946:1: rule__Alter__Group__4 : rule__Alter__Group__4__Impl ;
    public final void rule__Alter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1950:1: ( rule__Alter__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:1951:2: rule__Alter__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:1957:1: rule__Alter__Group__4__Impl : ( ( rule__Alter__Group_4__0 )? ) ;
    public final void rule__Alter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1961:1: ( ( ( rule__Alter__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:1962:1: ( ( rule__Alter__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:1962:1: ( ( rule__Alter__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:1963:2: ( rule__Alter__Group_4__0 )?
            {
             before(grammarAccess.getAlterAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:1964:2: ( rule__Alter__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=25 && LA34_0<=26)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1964:3: rule__Alter__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:1973:1: rule__Alter__Group_3__0 : rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 ;
    public final void rule__Alter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1977:1: ( rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1 )
            // InternalGSelfOperatingHeuristicText.g:1978:2: rule__Alter__Group_3__0__Impl rule__Alter__Group_3__1
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
    // InternalGSelfOperatingHeuristicText.g:1985:1: rule__Alter__Group_3__0__Impl : ( ( rule__Alter__Alternatives_3_0 ) ) ;
    public final void rule__Alter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:1989:1: ( ( ( rule__Alter__Alternatives_3_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:1990:1: ( ( rule__Alter__Alternatives_3_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1990:1: ( ( rule__Alter__Alternatives_3_0 ) )
            // InternalGSelfOperatingHeuristicText.g:1991:2: ( rule__Alter__Alternatives_3_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:1992:2: ( rule__Alter__Alternatives_3_0 )
            // InternalGSelfOperatingHeuristicText.g:1992:3: rule__Alter__Alternatives_3_0
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
    // InternalGSelfOperatingHeuristicText.g:2000:1: rule__Alter__Group_3__1 : rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 ;
    public final void rule__Alter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2004:1: ( rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2 )
            // InternalGSelfOperatingHeuristicText.g:2005:2: rule__Alter__Group_3__1__Impl rule__Alter__Group_3__2
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
    // InternalGSelfOperatingHeuristicText.g:2012:1: rule__Alter__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2016:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2017:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2017:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2018:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2027:1: rule__Alter__Group_3__2 : rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 ;
    public final void rule__Alter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2031:1: ( rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3 )
            // InternalGSelfOperatingHeuristicText.g:2032:2: rule__Alter__Group_3__2__Impl rule__Alter__Group_3__3
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
    // InternalGSelfOperatingHeuristicText.g:2039:1: rule__Alter__Group_3__2__Impl : ( ( rule__Alter__LocalsAssignment_3_2 )* ) ;
    public final void rule__Alter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2043:1: ( ( ( rule__Alter__LocalsAssignment_3_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2044:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2044:1: ( ( rule__Alter__LocalsAssignment_3_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2045:2: ( rule__Alter__LocalsAssignment_3_2 )*
            {
             before(grammarAccess.getAlterAccess().getLocalsAssignment_3_2()); 
            // InternalGSelfOperatingHeuristicText.g:2046:2: ( rule__Alter__LocalsAssignment_3_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2046:3: rule__Alter__LocalsAssignment_3_2
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
    // InternalGSelfOperatingHeuristicText.g:2054:1: rule__Alter__Group_3__3 : rule__Alter__Group_3__3__Impl ;
    public final void rule__Alter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2058:1: ( rule__Alter__Group_3__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2059:2: rule__Alter__Group_3__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2065:1: rule__Alter__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2069:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2070:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2070:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2071:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2081:1: rule__Alter__Group_4__0 : rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 ;
    public final void rule__Alter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2085:1: ( rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2086:2: rule__Alter__Group_4__0__Impl rule__Alter__Group_4__1
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
    // InternalGSelfOperatingHeuristicText.g:2093:1: rule__Alter__Group_4__0__Impl : ( ( rule__Alter__Alternatives_4_0 ) ) ;
    public final void rule__Alter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2097:1: ( ( ( rule__Alter__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2098:1: ( ( rule__Alter__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2098:1: ( ( rule__Alter__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2099:2: ( rule__Alter__Alternatives_4_0 )
            {
             before(grammarAccess.getAlterAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2100:2: ( rule__Alter__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2100:3: rule__Alter__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2108:1: rule__Alter__Group_4__1 : rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 ;
    public final void rule__Alter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2112:1: ( rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2113:2: rule__Alter__Group_4__1__Impl rule__Alter__Group_4__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGSelfOperatingHeuristicText.g:2120:1: rule__Alter__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Alter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2124:1: ( ( '{' ) )
            // InternalGSelfOperatingHeuristicText.g:2125:1: ( '{' )
            {
            // InternalGSelfOperatingHeuristicText.g:2125:1: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:2126:2: '{'
            {
             before(grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2135:1: rule__Alter__Group_4__2 : rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 ;
    public final void rule__Alter__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2139:1: ( rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3 )
            // InternalGSelfOperatingHeuristicText.g:2140:2: rule__Alter__Group_4__2__Impl rule__Alter__Group_4__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGSelfOperatingHeuristicText.g:2147:1: rule__Alter__Group_4__2__Impl : ( ( rule__Alter__TransitionsAssignment_4_2 )* ) ;
    public final void rule__Alter__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2151:1: ( ( ( rule__Alter__TransitionsAssignment_4_2 )* ) )
            // InternalGSelfOperatingHeuristicText.g:2152:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            {
            // InternalGSelfOperatingHeuristicText.g:2152:1: ( ( rule__Alter__TransitionsAssignment_4_2 )* )
            // InternalGSelfOperatingHeuristicText.g:2153:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            {
             before(grammarAccess.getAlterAccess().getTransitionsAssignment_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2154:2: ( rule__Alter__TransitionsAssignment_4_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=29 && LA36_0<=30)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:2154:3: rule__Alter__TransitionsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalGSelfOperatingHeuristicText.g:2162:1: rule__Alter__Group_4__3 : rule__Alter__Group_4__3__Impl ;
    public final void rule__Alter__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2166:1: ( rule__Alter__Group_4__3__Impl )
            // InternalGSelfOperatingHeuristicText.g:2167:2: rule__Alter__Group_4__3__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2173:1: rule__Alter__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Alter__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2177:1: ( ( '}' ) )
            // InternalGSelfOperatingHeuristicText.g:2178:1: ( '}' )
            {
            // InternalGSelfOperatingHeuristicText.g:2178:1: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:2179:2: '}'
            {
             before(grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2189:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2193:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2194:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2201:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2205:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2206:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2206:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2207:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalGSelfOperatingHeuristicText.g:2208:2: ( rule__Transition__Alternatives_0 )
            // InternalGSelfOperatingHeuristicText.g:2208:3: rule__Transition__Alternatives_0
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
    // InternalGSelfOperatingHeuristicText.g:2216:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2220:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2221:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalGSelfOperatingHeuristicText.g:2228:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__EventAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2232:1: ( ( ( rule__Transition__EventAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2233:1: ( ( rule__Transition__EventAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2233:1: ( ( rule__Transition__EventAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2234:2: ( rule__Transition__EventAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2235:2: ( rule__Transition__EventAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2235:3: rule__Transition__EventAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2243:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2247:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalGSelfOperatingHeuristicText.g:2248:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalGSelfOperatingHeuristicText.g:2255:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Alternatives_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2259:1: ( ( ( rule__Transition__Alternatives_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2260:1: ( ( rule__Transition__Alternatives_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2260:1: ( ( rule__Transition__Alternatives_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2261:2: ( rule__Transition__Alternatives_2 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            // InternalGSelfOperatingHeuristicText.g:2262:2: ( rule__Transition__Alternatives_2 )
            // InternalGSelfOperatingHeuristicText.g:2262:3: rule__Transition__Alternatives_2
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
    // InternalGSelfOperatingHeuristicText.g:2270:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2274:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalGSelfOperatingHeuristicText.g:2275:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalGSelfOperatingHeuristicText.g:2282:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__StateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2286:1: ( ( ( rule__Transition__StateAssignment_3 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2287:1: ( ( rule__Transition__StateAssignment_3 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2287:1: ( ( rule__Transition__StateAssignment_3 ) )
            // InternalGSelfOperatingHeuristicText.g:2288:2: ( rule__Transition__StateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_3()); 
            // InternalGSelfOperatingHeuristicText.g:2289:2: ( rule__Transition__StateAssignment_3 )
            // InternalGSelfOperatingHeuristicText.g:2289:3: rule__Transition__StateAssignment_3
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
    // InternalGSelfOperatingHeuristicText.g:2297:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2301:1: ( rule__Transition__Group__4__Impl )
            // InternalGSelfOperatingHeuristicText.g:2302:2: rule__Transition__Group__4__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2308:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2312:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2313:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2313:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2314:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalGSelfOperatingHeuristicText.g:2315:2: ( rule__Transition__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=33 && LA37_0<=34)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2315:3: rule__Transition__Group_4__0
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
    // InternalGSelfOperatingHeuristicText.g:2324:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2328:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalGSelfOperatingHeuristicText.g:2329:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalGSelfOperatingHeuristicText.g:2336:1: rule__Transition__Group_4__0__Impl : ( ( rule__Transition__Alternatives_4_0 ) ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2340:1: ( ( ( rule__Transition__Alternatives_4_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2341:1: ( ( rule__Transition__Alternatives_4_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2341:1: ( ( rule__Transition__Alternatives_4_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2342:2: ( rule__Transition__Alternatives_4_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_0()); 
            // InternalGSelfOperatingHeuristicText.g:2343:2: ( rule__Transition__Alternatives_4_0 )
            // InternalGSelfOperatingHeuristicText.g:2343:3: rule__Transition__Alternatives_4_0
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
    // InternalGSelfOperatingHeuristicText.g:2351:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2355:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // InternalGSelfOperatingHeuristicText.g:2356:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalGSelfOperatingHeuristicText.g:2363:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ConditionAssignment_4_1 )? ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2367:1: ( ( ( rule__Transition__ConditionAssignment_4_1 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2368:1: ( ( rule__Transition__ConditionAssignment_4_1 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2368:1: ( ( rule__Transition__ConditionAssignment_4_1 )? )
            // InternalGSelfOperatingHeuristicText.g:2369:2: ( rule__Transition__ConditionAssignment_4_1 )?
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_4_1()); 
            // InternalGSelfOperatingHeuristicText.g:2370:2: ( rule__Transition__ConditionAssignment_4_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2370:3: rule__Transition__ConditionAssignment_4_1
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
    // InternalGSelfOperatingHeuristicText.g:2378:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2382:1: ( rule__Transition__Group_4__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2383:2: rule__Transition__Group_4__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2389:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )? ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2393:1: ( ( ( rule__Transition__Group_4_2__0 )? ) )
            // InternalGSelfOperatingHeuristicText.g:2394:1: ( ( rule__Transition__Group_4_2__0 )? )
            {
            // InternalGSelfOperatingHeuristicText.g:2394:1: ( ( rule__Transition__Group_4_2__0 )? )
            // InternalGSelfOperatingHeuristicText.g:2395:2: ( rule__Transition__Group_4_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            // InternalGSelfOperatingHeuristicText.g:2396:2: ( rule__Transition__Group_4_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=35 && LA39_0<=36)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:2396:3: rule__Transition__Group_4_2__0
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
    // InternalGSelfOperatingHeuristicText.g:2405:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2409:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // InternalGSelfOperatingHeuristicText.g:2410:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
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
    // InternalGSelfOperatingHeuristicText.g:2417:1: rule__Transition__Group_4_2__0__Impl : ( ( rule__Transition__Alternatives_4_2_0 ) ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2421:1: ( ( ( rule__Transition__Alternatives_4_2_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2422:1: ( ( rule__Transition__Alternatives_4_2_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2422:1: ( ( rule__Transition__Alternatives_4_2_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2423:2: ( rule__Transition__Alternatives_4_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_4_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:2424:2: ( rule__Transition__Alternatives_4_2_0 )
            // InternalGSelfOperatingHeuristicText.g:2424:3: rule__Transition__Alternatives_4_2_0
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
    // InternalGSelfOperatingHeuristicText.g:2432:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2436:1: ( rule__Transition__Group_4_2__1__Impl )
            // InternalGSelfOperatingHeuristicText.g:2437:2: rule__Transition__Group_4_2__1__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2443:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__AssignmentAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2447:1: ( ( ( rule__Transition__AssignmentAssignment_4_2_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2448:1: ( ( rule__Transition__AssignmentAssignment_4_2_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2448:1: ( ( rule__Transition__AssignmentAssignment_4_2_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2449:2: ( rule__Transition__AssignmentAssignment_4_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getAssignmentAssignment_4_2_1()); 
            // InternalGSelfOperatingHeuristicText.g:2450:2: ( rule__Transition__AssignmentAssignment_4_2_1 )
            // InternalGSelfOperatingHeuristicText.g:2450:3: rule__Transition__AssignmentAssignment_4_2_1
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
    // InternalGSelfOperatingHeuristicText.g:2459:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2463:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2464:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalGSelfOperatingHeuristicText.g:2471:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2475:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2476:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2476:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2477:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2478:2: ( rule__Condition__LeftAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2478:3: rule__Condition__LeftAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2486:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2490:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2491:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2498:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2502:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2503:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2503:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalGSelfOperatingHeuristicText.g:2504:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalGSelfOperatingHeuristicText.g:2505:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalGSelfOperatingHeuristicText.g:2505:3: rule__Condition__OperatorAssignment_1
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
    // InternalGSelfOperatingHeuristicText.g:2513:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2517:1: ( rule__Condition__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2518:2: rule__Condition__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2524:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2528:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2529:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2529:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2530:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2531:2: ( rule__Condition__RightAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2531:3: rule__Condition__RightAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2540:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2544:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalGSelfOperatingHeuristicText.g:2545:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalGSelfOperatingHeuristicText.g:2552:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__CurrentVarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2556:1: ( ( ( rule__Assignment__CurrentVarAssignment_0 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2557:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2557:1: ( ( rule__Assignment__CurrentVarAssignment_0 ) )
            // InternalGSelfOperatingHeuristicText.g:2558:2: ( rule__Assignment__CurrentVarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getCurrentVarAssignment_0()); 
            // InternalGSelfOperatingHeuristicText.g:2559:2: ( rule__Assignment__CurrentVarAssignment_0 )
            // InternalGSelfOperatingHeuristicText.g:2559:3: rule__Assignment__CurrentVarAssignment_0
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
    // InternalGSelfOperatingHeuristicText.g:2567:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2571:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalGSelfOperatingHeuristicText.g:2572:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalGSelfOperatingHeuristicText.g:2579:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2583:1: ( ( '=' ) )
            // InternalGSelfOperatingHeuristicText.g:2584:1: ( '=' )
            {
            // InternalGSelfOperatingHeuristicText.g:2584:1: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:2585:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGSelfOperatingHeuristicText.g:2594:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2598:1: ( rule__Assignment__Group__2__Impl )
            // InternalGSelfOperatingHeuristicText.g:2599:2: rule__Assignment__Group__2__Impl
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
    // InternalGSelfOperatingHeuristicText.g:2605:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2609:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalGSelfOperatingHeuristicText.g:2610:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2610:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalGSelfOperatingHeuristicText.g:2611:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalGSelfOperatingHeuristicText.g:2612:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalGSelfOperatingHeuristicText.g:2612:3: rule__Assignment__ValueAssignment_2
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
    // InternalGSelfOperatingHeuristicText.g:2621:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2625:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2626:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2626:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2627:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2636:1: rule__Model__GlobalsAssignment_2_2 : ( ruleGlobal ) ;
    public final void rule__Model__GlobalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2640:1: ( ( ruleGlobal ) )
            // InternalGSelfOperatingHeuristicText.g:2641:2: ( ruleGlobal )
            {
            // InternalGSelfOperatingHeuristicText.g:2641:2: ( ruleGlobal )
            // InternalGSelfOperatingHeuristicText.g:2642:3: ruleGlobal
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
    // InternalGSelfOperatingHeuristicText.g:2651:1: rule__Model__EventsAssignment_3_2 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2655:1: ( ( ruleEvent ) )
            // InternalGSelfOperatingHeuristicText.g:2656:2: ( ruleEvent )
            {
            // InternalGSelfOperatingHeuristicText.g:2656:2: ( ruleEvent )
            // InternalGSelfOperatingHeuristicText.g:2657:3: ruleEvent
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
    // InternalGSelfOperatingHeuristicText.g:2666:1: rule__Model__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Model__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2670:1: ( ( ruleState ) )
            // InternalGSelfOperatingHeuristicText.g:2671:2: ( ruleState )
            {
            // InternalGSelfOperatingHeuristicText.g:2671:2: ( ruleState )
            // InternalGSelfOperatingHeuristicText.g:2672:3: ruleState
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
    // InternalGSelfOperatingHeuristicText.g:2681:1: rule__Model__AltersAssignment_4_1 : ( ruleAlter ) ;
    public final void rule__Model__AltersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2685:1: ( ( ruleAlter ) )
            // InternalGSelfOperatingHeuristicText.g:2686:2: ( ruleAlter )
            {
            // InternalGSelfOperatingHeuristicText.g:2686:2: ( ruleAlter )
            // InternalGSelfOperatingHeuristicText.g:2687:3: ruleAlter
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
    // InternalGSelfOperatingHeuristicText.g:2696:1: rule__Global__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Global__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2700:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2701:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2701:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2702:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2711:1: rule__Global__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Global__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2715:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:2716:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:2716:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:2717:3: ruleDataType
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
    // InternalGSelfOperatingHeuristicText.g:2726:1: rule__Global__ValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Global__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2730:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:2731:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:2731:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:2732:3: ruleValue
            {
             before(grammarAccess.getGlobalAccess().getValueValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValueValueParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalGSelfOperatingHeuristicText.g:2741:1: rule__Local__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Local__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2745:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2746:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2746:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2747:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2756:1: rule__Local__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Local__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2760:1: ( ( ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:2761:2: ( ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:2761:2: ( ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:2762:3: ruleDataType
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
    // InternalGSelfOperatingHeuristicText.g:2771:1: rule__Local__ValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Local__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2775:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:2776:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:2776:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:2777:3: ruleValue
            {
             before(grammarAccess.getLocalAccess().getValueValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getLocalAccess().getValueValueParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalGSelfOperatingHeuristicText.g:2786:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2790:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2791:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2791:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2792:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2801:1: rule__State__LocalsAssignment_2_2 : ( ruleLocal ) ;
    public final void rule__State__LocalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2805:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:2806:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:2806:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:2807:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:2816:1: rule__State__TransitionsAssignment_3_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2820:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:2821:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:2821:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:2822:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:2831:1: rule__Alter__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Alter__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2835:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:2836:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2836:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2837:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAccess().getStateStateCrossReference_2_0()); 
            // InternalGSelfOperatingHeuristicText.g:2838:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2839:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2850:1: rule__Alter__LocalsAssignment_3_2 : ( ruleLocal ) ;
    public final void rule__Alter__LocalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2854:1: ( ( ruleLocal ) )
            // InternalGSelfOperatingHeuristicText.g:2855:2: ( ruleLocal )
            {
            // InternalGSelfOperatingHeuristicText.g:2855:2: ( ruleLocal )
            // InternalGSelfOperatingHeuristicText.g:2856:3: ruleLocal
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
    // InternalGSelfOperatingHeuristicText.g:2865:1: rule__Alter__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Alter__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2869:1: ( ( ruleTransition ) )
            // InternalGSelfOperatingHeuristicText.g:2870:2: ( ruleTransition )
            {
            // InternalGSelfOperatingHeuristicText.g:2870:2: ( ruleTransition )
            // InternalGSelfOperatingHeuristicText.g:2871:3: ruleTransition
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
    // InternalGSelfOperatingHeuristicText.g:2880:1: rule__Transition__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2884:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:2885:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2885:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2886:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            // InternalGSelfOperatingHeuristicText.g:2887:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2888:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2899:1: rule__Transition__StateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2903:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:2904:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:2904:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2905:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            // InternalGSelfOperatingHeuristicText.g:2906:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2907:4: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2918:1: rule__Transition__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2922:1: ( ( ruleCondition ) )
            // InternalGSelfOperatingHeuristicText.g:2923:2: ( ruleCondition )
            {
            // InternalGSelfOperatingHeuristicText.g:2923:2: ( ruleCondition )
            // InternalGSelfOperatingHeuristicText.g:2924:3: ruleCondition
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
    // InternalGSelfOperatingHeuristicText.g:2933:1: rule__Transition__AssignmentAssignment_4_2_1 : ( ruleAssignment ) ;
    public final void rule__Transition__AssignmentAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2937:1: ( ( ruleAssignment ) )
            // InternalGSelfOperatingHeuristicText.g:2938:2: ( ruleAssignment )
            {
            // InternalGSelfOperatingHeuristicText.g:2938:2: ( ruleAssignment )
            // InternalGSelfOperatingHeuristicText.g:2939:3: ruleAssignment
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
    // InternalGSelfOperatingHeuristicText.g:2948:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2952:1: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:2953:2: ( RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:2953:2: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:2954:3: RULE_ID
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
    // InternalGSelfOperatingHeuristicText.g:2963:1: rule__Condition__LeftAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2967:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:2968:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:2968:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:2969:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:2978:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2982:1: ( ( ruleComparisonOperator ) )
            // InternalGSelfOperatingHeuristicText.g:2983:2: ( ruleComparisonOperator )
            {
            // InternalGSelfOperatingHeuristicText.g:2983:2: ( ruleComparisonOperator )
            // InternalGSelfOperatingHeuristicText.g:2984:3: ruleComparisonOperator
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
    // InternalGSelfOperatingHeuristicText.g:2993:1: rule__Condition__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:2997:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:2998:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:2998:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:2999:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3008:1: rule__Assignment__CurrentVarAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Assignment__CurrentVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3012:1: ( ( ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:3013:2: ( ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:3013:2: ( ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:3014:3: ruleVariableReference
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
    // InternalGSelfOperatingHeuristicText.g:3023:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3027:1: ( ( ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:3028:2: ( ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:3028:2: ( ruleValue )
            // InternalGSelfOperatingHeuristicText.g:3029:3: ruleValue
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
    // InternalGSelfOperatingHeuristicText.g:3038:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGSelfOperatingHeuristicText.g:3042:1: ( ( ( RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:3043:2: ( ( RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3043:2: ( ( RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:3044:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            // InternalGSelfOperatingHeuristicText.g:3045:3: ( RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:3046:4: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002000018678000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018600002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001FC0000000000L});

}
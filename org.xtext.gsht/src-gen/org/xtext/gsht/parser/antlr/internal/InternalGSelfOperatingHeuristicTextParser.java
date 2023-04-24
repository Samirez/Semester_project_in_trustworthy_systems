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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSelfOperatingHeuristicTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DRONE'", "'drone'", "'GLOBAL'", "'global'", "'{'", "'}'", "'EVENTS'", "'events'", "'AS'", "'as'", "'='", "'STATE'", "'state'", "'PROPS'", "'props'", "'TRANSITIONS'", "'transitions'", "'ALTER'", "'alter'", "'ON'", "'on'", "'TO'", "'to'", "'IF'", "'if'", "'SET'", "'set'", "'??'", "'int'", "'boolean'", "'double'", "'String'", "'\\u00A4\\u00A4'", "'!='", "'=='", "'>'", "'<'", "'>='", "'<='"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
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
    public static final int RULE_DOUBLE=8;
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
    public static final int RULE_BOOL=6;
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




    // $ANTLR start "entryRuleModel"
    // InternalGSelfOperatingHeuristicText.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalGSelfOperatingHeuristicText.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGSelfOperatingHeuristicText.g:72:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'DRONE' | otherlv_1= 'drone' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}' )? ( (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}' )* ( ( (lv_states_13_0= ruleState ) ) | ( (lv_alters_14_0= ruleAlter ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_globals_6_0 = null;

        EObject lv_events_11_0 = null;

        EObject lv_states_13_0 = null;

        EObject lv_alters_14_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:78:2: ( ( (otherlv_0= 'DRONE' | otherlv_1= 'drone' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}' )? ( (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}' )* ( ( (lv_states_13_0= ruleState ) ) | ( (lv_alters_14_0= ruleAlter ) ) )* ) )
            // InternalGSelfOperatingHeuristicText.g:79:2: ( (otherlv_0= 'DRONE' | otherlv_1= 'drone' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}' )? ( (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}' )* ( ( (lv_states_13_0= ruleState ) ) | ( (lv_alters_14_0= ruleAlter ) ) )* )
            {
            // InternalGSelfOperatingHeuristicText.g:79:2: ( (otherlv_0= 'DRONE' | otherlv_1= 'drone' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}' )? ( (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}' )* ( ( (lv_states_13_0= ruleState ) ) | ( (lv_alters_14_0= ruleAlter ) ) )* )
            // InternalGSelfOperatingHeuristicText.g:80:3: (otherlv_0= 'DRONE' | otherlv_1= 'drone' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}' )? ( (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}' )* ( ( (lv_states_13_0= ruleState ) ) | ( (lv_alters_14_0= ruleAlter ) ) )*
            {
            // InternalGSelfOperatingHeuristicText.g:80:3: (otherlv_0= 'DRONE' | otherlv_1= 'drone' )
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
                    // InternalGSelfOperatingHeuristicText.g:81:4: otherlv_0= 'DRONE'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDRONEKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:86:4: otherlv_1= 'drone'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDroneKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:109:3: ( (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:110:4: (otherlv_3= 'GLOBAL' | otherlv_4= 'global' ) otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal ) )* otherlv_7= '}'
                    {
                    // InternalGSelfOperatingHeuristicText.g:110:4: (otherlv_3= 'GLOBAL' | otherlv_4= 'global' )
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
                            // InternalGSelfOperatingHeuristicText.g:111:5: otherlv_3= 'GLOBAL'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getGLOBALKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:116:5: otherlv_4= 'global'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_5); 

                            					newLeafNode(otherlv_4, grammarAccess.getModelAccess().getGlobalKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalGSelfOperatingHeuristicText.g:125:4: ( (lv_globals_6_0= ruleGlobal ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:126:5: (lv_globals_6_0= ruleGlobal )
                    	    {
                    	    // InternalGSelfOperatingHeuristicText.g:126:5: (lv_globals_6_0= ruleGlobal )
                    	    // InternalGSelfOperatingHeuristicText.g:127:6: lv_globals_6_0= ruleGlobal
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getGlobalsGlobalParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_globals_6_0=ruleGlobal();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"globals",
                    	    							lv_globals_6_0,
                    	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Global");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:149:3: ( (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||(LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:150:4: (otherlv_8= 'EVENTS' | otherlv_9= 'events' )* otherlv_10= '{' ( (lv_events_11_0= ruleEvent ) )* otherlv_12= '}'
            	    {
            	    // InternalGSelfOperatingHeuristicText.g:150:4: (otherlv_8= 'EVENTS' | otherlv_9= 'events' )*
            	    loop5:
            	    do {
            	        int alt5=3;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==19) ) {
            	            alt5=1;
            	        }
            	        else if ( (LA5_0==20) ) {
            	            alt5=2;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalGSelfOperatingHeuristicText.g:151:5: otherlv_8= 'EVENTS'
            	    	    {
            	    	    otherlv_8=(Token)match(input,19,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getModelAccess().getEVENTSKeyword_3_0_0());
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalGSelfOperatingHeuristicText.g:156:5: otherlv_9= 'events'
            	    	    {
            	    	    otherlv_9=(Token)match(input,20,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getModelAccess().getEventsKeyword_3_0_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
            	    			
            	    // InternalGSelfOperatingHeuristicText.g:165:4: ( (lv_events_11_0= ruleEvent ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalGSelfOperatingHeuristicText.g:166:5: (lv_events_11_0= ruleEvent )
            	    	    {
            	    	    // InternalGSelfOperatingHeuristicText.g:166:5: (lv_events_11_0= ruleEvent )
            	    	    // InternalGSelfOperatingHeuristicText.g:167:6: lv_events_11_0= ruleEvent
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_events_11_0=ruleEvent();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"events",
            	    	    							lv_events_11_0,
            	    	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Event");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalGSelfOperatingHeuristicText.g:189:3: ( ( (lv_states_13_0= ruleState ) ) | ( (lv_alters_14_0= ruleAlter ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }
                else if ( ((LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:190:4: ( (lv_states_13_0= ruleState ) )
            	    {
            	    // InternalGSelfOperatingHeuristicText.g:190:4: ( (lv_states_13_0= ruleState ) )
            	    // InternalGSelfOperatingHeuristicText.g:191:5: (lv_states_13_0= ruleState )
            	    {
            	    // InternalGSelfOperatingHeuristicText.g:191:5: (lv_states_13_0= ruleState )
            	    // InternalGSelfOperatingHeuristicText.g:192:6: lv_states_13_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStatesStateParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_states_13_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_13_0,
            	    							"org.xtext.gsht.GSelfOperatingHeuristicText.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGSelfOperatingHeuristicText.g:210:4: ( (lv_alters_14_0= ruleAlter ) )
            	    {
            	    // InternalGSelfOperatingHeuristicText.g:210:4: ( (lv_alters_14_0= ruleAlter ) )
            	    // InternalGSelfOperatingHeuristicText.g:211:5: (lv_alters_14_0= ruleAlter )
            	    {
            	    // InternalGSelfOperatingHeuristicText.g:211:5: (lv_alters_14_0= ruleAlter )
            	    // InternalGSelfOperatingHeuristicText.g:212:6: lv_alters_14_0= ruleAlter
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getAltersAlterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_alters_14_0=ruleAlter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"alters",
            	    							lv_alters_14_0,
            	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Alter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGlobal"
    // InternalGSelfOperatingHeuristicText.g:234:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:234:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalGSelfOperatingHeuristicText.g:235:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalGSelfOperatingHeuristicText.g:241:1: ruleGlobal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:247:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) )
            // InternalGSelfOperatingHeuristicText.g:248:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            {
            // InternalGSelfOperatingHeuristicText.g:248:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            // InternalGSelfOperatingHeuristicText.g:249:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            {
            // InternalGSelfOperatingHeuristicText.g:249:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:250:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:250:4: (lv_name_0_0= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:251:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGlobalAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:267:3: (otherlv_1= 'AS' | otherlv_2= 'as' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:268:4: otherlv_1= 'AS'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getASKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:273:4: otherlv_2= 'as'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getGlobalAccess().getAsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:278:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:279:4: (lv_type_3_0= ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:279:4: (lv_type_3_0= ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:280:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:297:3: (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:298:4: otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGSelfOperatingHeuristicText.g:302:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalGSelfOperatingHeuristicText.g:303:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:303:5: (lv_value_5_0= RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:304:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getGlobalAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGlobalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleLocal"
    // InternalGSelfOperatingHeuristicText.g:325:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:325:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalGSelfOperatingHeuristicText.g:326:2: iv_ruleLocal= ruleLocal EOF
            {
             newCompositeNode(grammarAccess.getLocalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocal=ruleLocal();

            state._fsp--;

             current =iv_ruleLocal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocal"


    // $ANTLR start "ruleLocal"
    // InternalGSelfOperatingHeuristicText.g:332:1: ruleLocal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:338:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? ) )
            // InternalGSelfOperatingHeuristicText.g:339:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            {
            // InternalGSelfOperatingHeuristicText.g:339:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )? )
            // InternalGSelfOperatingHeuristicText.g:340:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'AS' | otherlv_2= 'as' ) ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            {
            // InternalGSelfOperatingHeuristicText.g:340:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:341:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:341:4: (lv_name_0_0= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:342:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:358:3: (otherlv_1= 'AS' | otherlv_2= 'as' )
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
                    // InternalGSelfOperatingHeuristicText.g:359:4: otherlv_1= 'AS'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getASKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:364:4: otherlv_2= 'as'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalAccess().getAsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:369:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalGSelfOperatingHeuristicText.g:370:4: (lv_type_3_0= ruleDataType )
            {
            // InternalGSelfOperatingHeuristicText.g:370:4: (lv_type_3_0= ruleDataType )
            // InternalGSelfOperatingHeuristicText.g:371:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getLocalAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:388:3: (otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:389:4: otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getLocalAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGSelfOperatingHeuristicText.g:393:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalGSelfOperatingHeuristicText.g:394:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalGSelfOperatingHeuristicText.g:394:5: (lv_value_5_0= RULE_STRING )
                    // InternalGSelfOperatingHeuristicText.g:395:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getLocalAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleState"
    // InternalGSelfOperatingHeuristicText.g:416:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:416:46: (iv_ruleState= ruleState EOF )
            // InternalGSelfOperatingHeuristicText.g:417:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGSelfOperatingHeuristicText.g:423:1: ruleState returns [EObject current=null] : ( (otherlv_0= 'STATE' | otherlv_1= 'state' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}' )? ( (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_locals_6_0 = null;

        EObject lv_transitions_11_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:429:2: ( ( (otherlv_0= 'STATE' | otherlv_1= 'state' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}' )? ( (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? ) )
            // InternalGSelfOperatingHeuristicText.g:430:2: ( (otherlv_0= 'STATE' | otherlv_1= 'state' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}' )? ( (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? )
            {
            // InternalGSelfOperatingHeuristicText.g:430:2: ( (otherlv_0= 'STATE' | otherlv_1= 'state' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}' )? ( (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? )
            // InternalGSelfOperatingHeuristicText.g:431:3: (otherlv_0= 'STATE' | otherlv_1= 'state' ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}' )? ( (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )?
            {
            // InternalGSelfOperatingHeuristicText.g:431:3: (otherlv_0= 'STATE' | otherlv_1= 'state' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:432:4: otherlv_0= 'STATE'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getStateAccess().getSTATEKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:437:4: otherlv_1= 'state'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:442:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:443:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:443:4: (lv_name_2_0= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:444:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:460:3: ( (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=26 && LA16_0<=27)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:461:4: (otherlv_3= 'PROPS' | otherlv_4= 'props' ) otherlv_5= '{' ( (lv_locals_6_0= ruleLocal ) )* otherlv_7= '}'
                    {
                    // InternalGSelfOperatingHeuristicText.g:461:4: (otherlv_3= 'PROPS' | otherlv_4= 'props' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==27) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:462:5: otherlv_3= 'PROPS'
                            {
                            otherlv_3=(Token)match(input,26,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getStateAccess().getPROPSKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:467:5: otherlv_4= 'props'
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_5); 

                            					newLeafNode(otherlv_4, grammarAccess.getStateAccess().getPropsKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalGSelfOperatingHeuristicText.g:476:4: ( (lv_locals_6_0= ruleLocal ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:477:5: (lv_locals_6_0= ruleLocal )
                    	    {
                    	    // InternalGSelfOperatingHeuristicText.g:477:5: (lv_locals_6_0= ruleLocal )
                    	    // InternalGSelfOperatingHeuristicText.g:478:6: lv_locals_6_0= ruleLocal
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getLocalsLocalParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_locals_6_0=ruleLocal();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"locals",
                    	    							lv_locals_6_0,
                    	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Local");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:500:3: ( (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=28 && LA19_0<=29)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:501:4: (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' ) otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}'
                    {
                    // InternalGSelfOperatingHeuristicText.g:501:4: (otherlv_8= 'TRANSITIONS' | otherlv_9= 'transitions' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==29) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:502:5: otherlv_8= 'TRANSITIONS'
                            {
                            otherlv_8=(Token)match(input,28,FOLLOW_5); 

                            					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getTRANSITIONSKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:507:5: otherlv_9= 'transitions'
                            {
                            otherlv_9=(Token)match(input,29,FOLLOW_5); 

                            					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getTransitionsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGSelfOperatingHeuristicText.g:516:4: ( (lv_transitions_11_0= ruleTransition ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:517:5: (lv_transitions_11_0= ruleTransition )
                    	    {
                    	    // InternalGSelfOperatingHeuristicText.g:517:5: (lv_transitions_11_0= ruleTransition )
                    	    // InternalGSelfOperatingHeuristicText.g:518:6: lv_transitions_11_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_transitions_11_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_11_0,
                    	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAlter"
    // InternalGSelfOperatingHeuristicText.g:544:1: entryRuleAlter returns [EObject current=null] : iv_ruleAlter= ruleAlter EOF ;
    public final EObject entryRuleAlter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlter = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:544:46: (iv_ruleAlter= ruleAlter EOF )
            // InternalGSelfOperatingHeuristicText.g:545:2: iv_ruleAlter= ruleAlter EOF
            {
             newCompositeNode(grammarAccess.getAlterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlter=ruleAlter();

            state._fsp--;

             current =iv_ruleAlter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlter"


    // $ANTLR start "ruleAlter"
    // InternalGSelfOperatingHeuristicText.g:551:1: ruleAlter returns [EObject current=null] : ( (otherlv_0= 'ALTER' | otherlv_1= 'alter' ) (otherlv_2= 'STATE' | otherlv_3= 'state' ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}' )? ( (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleAlter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_locals_8_0 = null;

        EObject lv_transitions_13_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:557:2: ( ( (otherlv_0= 'ALTER' | otherlv_1= 'alter' ) (otherlv_2= 'STATE' | otherlv_3= 'state' ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}' )? ( (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' )? ) )
            // InternalGSelfOperatingHeuristicText.g:558:2: ( (otherlv_0= 'ALTER' | otherlv_1= 'alter' ) (otherlv_2= 'STATE' | otherlv_3= 'state' ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}' )? ( (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' )? )
            {
            // InternalGSelfOperatingHeuristicText.g:558:2: ( (otherlv_0= 'ALTER' | otherlv_1= 'alter' ) (otherlv_2= 'STATE' | otherlv_3= 'state' ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}' )? ( (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' )? )
            // InternalGSelfOperatingHeuristicText.g:559:3: (otherlv_0= 'ALTER' | otherlv_1= 'alter' ) (otherlv_2= 'STATE' | otherlv_3= 'state' ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}' )? ( (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' )?
            {
            // InternalGSelfOperatingHeuristicText.g:559:3: (otherlv_0= 'ALTER' | otherlv_1= 'alter' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:560:4: otherlv_0= 'ALTER'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlterAccess().getALTERKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:565:4: otherlv_1= 'alter'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getAlterAccess().getAlterKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:570:3: (otherlv_2= 'STATE' | otherlv_3= 'state' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:571:4: otherlv_2= 'STATE'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlterAccess().getSTATEKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:576:4: otherlv_3= 'state'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlterAccess().getStateKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:581:3: ( (otherlv_4= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:582:4: (otherlv_4= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:582:4: (otherlv_4= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:583:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_4, grammarAccess.getAlterAccess().getStateStateCrossReference_2_0());
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:594:3: ( (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=26 && LA24_0<=27)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:595:4: (otherlv_5= 'PROPS' | otherlv_6= 'props' ) otherlv_7= '{' ( (lv_locals_8_0= ruleLocal ) )* otherlv_9= '}'
                    {
                    // InternalGSelfOperatingHeuristicText.g:595:4: (otherlv_5= 'PROPS' | otherlv_6= 'props' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==26) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==27) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:596:5: otherlv_5= 'PROPS'
                            {
                            otherlv_5=(Token)match(input,26,FOLLOW_5); 

                            					newLeafNode(otherlv_5, grammarAccess.getAlterAccess().getPROPSKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:601:5: otherlv_6= 'props'
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_5); 

                            					newLeafNode(otherlv_6, grammarAccess.getAlterAccess().getPropsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGSelfOperatingHeuristicText.g:610:4: ( (lv_locals_8_0= ruleLocal ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:611:5: (lv_locals_8_0= ruleLocal )
                    	    {
                    	    // InternalGSelfOperatingHeuristicText.g:611:5: (lv_locals_8_0= ruleLocal )
                    	    // InternalGSelfOperatingHeuristicText.g:612:6: lv_locals_8_0= ruleLocal
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlterAccess().getLocalsLocalParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_locals_8_0=ruleLocal();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"locals",
                    	    							lv_locals_8_0,
                    	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Local");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:634:3: ( (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=28 && LA27_0<=29)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:635:4: (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' ) otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}'
                    {
                    // InternalGSelfOperatingHeuristicText.g:635:4: (otherlv_10= 'TRANSITIONS' | otherlv_11= 'transitions' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==29) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:636:5: otherlv_10= 'TRANSITIONS'
                            {
                            otherlv_10=(Token)match(input,28,FOLLOW_5); 

                            					newLeafNode(otherlv_10, grammarAccess.getAlterAccess().getTRANSITIONSKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:641:5: otherlv_11= 'transitions'
                            {
                            otherlv_11=(Token)match(input,29,FOLLOW_5); 

                            					newLeafNode(otherlv_11, grammarAccess.getAlterAccess().getTransitionsKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGSelfOperatingHeuristicText.g:650:4: ( (lv_transitions_13_0= ruleTransition ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=32 && LA26_0<=33)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:651:5: (lv_transitions_13_0= ruleTransition )
                    	    {
                    	    // InternalGSelfOperatingHeuristicText.g:651:5: (lv_transitions_13_0= ruleTransition )
                    	    // InternalGSelfOperatingHeuristicText.g:652:6: lv_transitions_13_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlterAccess().getTransitionsTransitionParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_transitions_13_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_13_0,
                    	    							"org.xtext.gsht.GSelfOperatingHeuristicText.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getAlterAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlter"


    // $ANTLR start "entryRuleTransition"
    // InternalGSelfOperatingHeuristicText.g:678:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:678:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalGSelfOperatingHeuristicText.g:679:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalGSelfOperatingHeuristicText.g:685:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'ON' | otherlv_1= 'on' ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'TO' | otherlv_4= 'to' ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )? )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_condition_8_0 = null;

        EObject lv_assignment_11_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:691:2: ( ( (otherlv_0= 'ON' | otherlv_1= 'on' ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'TO' | otherlv_4= 'to' ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )? )? ) )
            // InternalGSelfOperatingHeuristicText.g:692:2: ( (otherlv_0= 'ON' | otherlv_1= 'on' ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'TO' | otherlv_4= 'to' ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )? )? )
            {
            // InternalGSelfOperatingHeuristicText.g:692:2: ( (otherlv_0= 'ON' | otherlv_1= 'on' ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'TO' | otherlv_4= 'to' ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )? )? )
            // InternalGSelfOperatingHeuristicText.g:693:3: (otherlv_0= 'ON' | otherlv_1= 'on' ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'TO' | otherlv_4= 'to' ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )? )?
            {
            // InternalGSelfOperatingHeuristicText.g:693:3: (otherlv_0= 'ON' | otherlv_1= 'on' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            else if ( (LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:694:4: otherlv_0= 'ON'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getONKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:699:4: otherlv_1= 'on'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getOnKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:704:3: ( (otherlv_2= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:705:4: (otherlv_2= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:705:4: (otherlv_2= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:706:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0());
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:717:3: (otherlv_3= 'TO' | otherlv_4= 'to' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            else if ( (LA29_0==35) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:718:4: otherlv_3= 'TO'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTOKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:723:4: otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getToKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalGSelfOperatingHeuristicText.g:728:3: ( (otherlv_5= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:729:4: (otherlv_5= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:729:4: (otherlv_5= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:730:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:741:3: ( (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=36 && LA34_0<=37)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:742:4: (otherlv_6= 'IF' | otherlv_7= 'if' ) ( (lv_condition_8_0= ruleCondition ) )? ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )?
                    {
                    // InternalGSelfOperatingHeuristicText.g:742:4: (otherlv_6= 'IF' | otherlv_7= 'if' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==36) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==37) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:743:5: otherlv_6= 'IF'
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_20); 

                            					newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getIFKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:748:5: otherlv_7= 'if'
                            {
                            otherlv_7=(Token)match(input,37,FOLLOW_20); 

                            					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getIfKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalGSelfOperatingHeuristicText.g:753:4: ( (lv_condition_8_0= ruleCondition ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:754:5: (lv_condition_8_0= ruleCondition )
                            {
                            // InternalGSelfOperatingHeuristicText.g:754:5: (lv_condition_8_0= ruleCondition )
                            // InternalGSelfOperatingHeuristicText.g:755:6: lv_condition_8_0= ruleCondition
                            {

                            						newCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_21);
                            lv_condition_8_0=ruleCondition();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTransitionRule());
                            						}
                            						set(
                            							current,
                            							"condition",
                            							lv_condition_8_0,
                            							"org.xtext.gsht.GSelfOperatingHeuristicText.Condition");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalGSelfOperatingHeuristicText.g:772:4: ( (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=38 && LA33_0<=39)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:773:5: (otherlv_9= 'SET' | otherlv_10= 'set' ) ( (lv_assignment_11_0= ruleAssignment ) )
                            {
                            // InternalGSelfOperatingHeuristicText.g:773:5: (otherlv_9= 'SET' | otherlv_10= 'set' )
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==38) ) {
                                alt32=1;
                            }
                            else if ( (LA32_0==39) ) {
                                alt32=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalGSelfOperatingHeuristicText.g:774:6: otherlv_9= 'SET'
                                    {
                                    otherlv_9=(Token)match(input,38,FOLLOW_3); 

                                    						newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getSETKeyword_4_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalGSelfOperatingHeuristicText.g:779:6: otherlv_10= 'set'
                                    {
                                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                                    						newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSetKeyword_4_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalGSelfOperatingHeuristicText.g:784:5: ( (lv_assignment_11_0= ruleAssignment ) )
                            // InternalGSelfOperatingHeuristicText.g:785:6: (lv_assignment_11_0= ruleAssignment )
                            {
                            // InternalGSelfOperatingHeuristicText.g:785:6: (lv_assignment_11_0= ruleAssignment )
                            // InternalGSelfOperatingHeuristicText.g:786:7: lv_assignment_11_0= ruleAssignment
                            {

                            							newCompositeNode(grammarAccess.getTransitionAccess().getAssignmentAssignmentParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_assignment_11_0=ruleAssignment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTransitionRule());
                            							}
                            							set(
                            								current,
                            								"assignment",
                            								lv_assignment_11_0,
                            								"org.xtext.gsht.GSelfOperatingHeuristicText.Assignment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalGSelfOperatingHeuristicText.g:809:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:809:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalGSelfOperatingHeuristicText.g:810:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalGSelfOperatingHeuristicText.g:816:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:822:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:823:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:823:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:824:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:824:3: (lv_name_0_0= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:825:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalGSelfOperatingHeuristicText.g:844:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:844:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGSelfOperatingHeuristicText.g:845:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGSelfOperatingHeuristicText.g:851:1: ruleCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:857:2: ( ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // InternalGSelfOperatingHeuristicText.g:858:2: ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // InternalGSelfOperatingHeuristicText.g:858:2: ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            // InternalGSelfOperatingHeuristicText.g:859:3: ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // InternalGSelfOperatingHeuristicText.g:859:3: ( (lv_left_0_0= ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:860:4: (lv_left_0_0= ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:860:4: (lv_left_0_0= ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:861:5: lv_left_0_0= ruleVariableReference
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getLeftVariableReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_left_0_0=ruleVariableReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.VariableReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:878:3: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // InternalGSelfOperatingHeuristicText.g:879:4: (lv_operator_1_0= ruleComparisonOperator )
            {
            // InternalGSelfOperatingHeuristicText.g:879:4: (lv_operator_1_0= ruleComparisonOperator )
            // InternalGSelfOperatingHeuristicText.g:880:5: lv_operator_1_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_operator_1_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGSelfOperatingHeuristicText.g:897:3: ( (lv_right_2_0= ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:898:4: (lv_right_2_0= ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:898:4: (lv_right_2_0= ruleValue )
            // InternalGSelfOperatingHeuristicText.g:899:5: lv_right_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getRightValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAssignment"
    // InternalGSelfOperatingHeuristicText.g:920:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:920:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalGSelfOperatingHeuristicText.g:921:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalGSelfOperatingHeuristicText.g:927:1: ruleAssignment returns [EObject current=null] : ( ( (lv_currentVar_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_currentVar_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:933:2: ( ( ( (lv_currentVar_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGSelfOperatingHeuristicText.g:934:2: ( ( (lv_currentVar_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGSelfOperatingHeuristicText.g:934:2: ( ( (lv_currentVar_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // InternalGSelfOperatingHeuristicText.g:935:3: ( (lv_currentVar_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGSelfOperatingHeuristicText.g:935:3: ( (lv_currentVar_0_0= ruleVariableReference ) )
            // InternalGSelfOperatingHeuristicText.g:936:4: (lv_currentVar_0_0= ruleVariableReference )
            {
            // InternalGSelfOperatingHeuristicText.g:936:4: (lv_currentVar_0_0= ruleVariableReference )
            // InternalGSelfOperatingHeuristicText.g:937:5: lv_currentVar_0_0= ruleVariableReference
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getCurrentVarVariableReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_currentVar_0_0=ruleVariableReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"currentVar",
            						lv_currentVar_0_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.VariableReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalGSelfOperatingHeuristicText.g:958:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGSelfOperatingHeuristicText.g:959:4: (lv_value_2_0= ruleValue )
            {
            // InternalGSelfOperatingHeuristicText.g:959:4: (lv_value_2_0= ruleValue )
            // InternalGSelfOperatingHeuristicText.g:960:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.gsht.GSelfOperatingHeuristicText.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVariableReference"
    // InternalGSelfOperatingHeuristicText.g:981:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:981:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalGSelfOperatingHeuristicText.g:982:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalGSelfOperatingHeuristicText.g:988:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:994:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGSelfOperatingHeuristicText.g:995:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGSelfOperatingHeuristicText.g:995:2: ( (otherlv_0= RULE_ID ) )
            // InternalGSelfOperatingHeuristicText.g:996:3: (otherlv_0= RULE_ID )
            {
            // InternalGSelfOperatingHeuristicText.g:996:3: (otherlv_0= RULE_ID )
            // InternalGSelfOperatingHeuristicText.g:997:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleValue"
    // InternalGSelfOperatingHeuristicText.g:1011:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalGSelfOperatingHeuristicText.g:1011:45: (iv_ruleValue= ruleValue EOF )
            // InternalGSelfOperatingHeuristicText.g:1012:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGSelfOperatingHeuristicText.g:1018:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOL_0= RULE_BOOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_DOUBLE_3= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOL_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token this_DOUBLE_3=null;


        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:1024:2: ( (this_BOOL_0= RULE_BOOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_DOUBLE_3= RULE_DOUBLE ) )
            // InternalGSelfOperatingHeuristicText.g:1025:2: (this_BOOL_0= RULE_BOOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_DOUBLE_3= RULE_DOUBLE )
            {
            // InternalGSelfOperatingHeuristicText.g:1025:2: (this_BOOL_0= RULE_BOOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_DOUBLE_3= RULE_DOUBLE )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt35=1;
                }
                break;
            case RULE_STRING:
                {
                alt35=2;
                }
                break;
            case RULE_INT:
                {
                alt35=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1026:3: this_BOOL_0= RULE_BOOL
                    {
                    this_BOOL_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			current.merge(this_BOOL_0);
                    		

                    			newLeafNode(this_BOOL_0, grammarAccess.getValueAccess().getBOOLTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:1034:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:1042:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getValueAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:1050:3: this_DOUBLE_3= RULE_DOUBLE
                    {
                    this_DOUBLE_3=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_3);
                    		

                    			newLeafNode(this_DOUBLE_3, grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleDataType"
    // InternalGSelfOperatingHeuristicText.g:1061:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= '??' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'String' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:1067:2: ( ( (enumLiteral_0= '??' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'String' ) ) )
            // InternalGSelfOperatingHeuristicText.g:1068:2: ( (enumLiteral_0= '??' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'String' ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1068:2: ( (enumLiteral_0= '??' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'String' ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt36=1;
                }
                break;
            case 41:
                {
                alt36=2;
                }
                break;
            case 42:
                {
                alt36=3;
                }
                break;
            case 43:
                {
                alt36=4;
                }
                break;
            case 44:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1069:3: (enumLiteral_0= '??' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1069:3: (enumLiteral_0= '??' )
                    // InternalGSelfOperatingHeuristicText.g:1070:4: enumLiteral_0= '??'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNOTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:1077:3: (enumLiteral_1= 'int' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1077:3: (enumLiteral_1= 'int' )
                    // InternalGSelfOperatingHeuristicText.g:1078:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:1085:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1085:3: (enumLiteral_2= 'boolean' )
                    // InternalGSelfOperatingHeuristicText.g:1086:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:1093:3: (enumLiteral_3= 'double' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1093:3: (enumLiteral_3= 'double' )
                    // InternalGSelfOperatingHeuristicText.g:1094:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:1101:3: (enumLiteral_4= 'String' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1101:3: (enumLiteral_4= 'String' )
                    // InternalGSelfOperatingHeuristicText.g:1102:4: enumLiteral_4= 'String'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleComparisonOperator"
    // InternalGSelfOperatingHeuristicText.g:1112:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\u00A4\\u00A4' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalGSelfOperatingHeuristicText.g:1118:2: ( ( (enumLiteral_0= '\\u00A4\\u00A4' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // InternalGSelfOperatingHeuristicText.g:1119:2: ( (enumLiteral_0= '\\u00A4\\u00A4' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // InternalGSelfOperatingHeuristicText.g:1119:2: ( (enumLiteral_0= '\\u00A4\\u00A4' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt37=1;
                }
                break;
            case 46:
                {
                alt37=2;
                }
                break;
            case 47:
                {
                alt37=3;
                }
                break;
            case 48:
                {
                alt37=4;
                }
                break;
            case 49:
                {
                alt37=5;
                }
                break;
            case 50:
                {
                alt37=6;
                }
                break;
            case 51:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1120:3: (enumLiteral_0= '\\u00A4\\u00A4' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1120:3: (enumLiteral_0= '\\u00A4\\u00A4' )
                    // InternalGSelfOperatingHeuristicText.g:1121:4: enumLiteral_0= '\\u00A4\\u00A4'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getNOT_BOOLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:1128:3: (enumLiteral_1= '!=' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1128:3: (enumLiteral_1= '!=' )
                    // InternalGSelfOperatingHeuristicText.g:1129:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGSelfOperatingHeuristicText.g:1136:3: (enumLiteral_2= '==' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1136:3: (enumLiteral_2= '==' )
                    // InternalGSelfOperatingHeuristicText.g:1137:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGSelfOperatingHeuristicText.g:1144:3: (enumLiteral_3= '>' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1144:3: (enumLiteral_3= '>' )
                    // InternalGSelfOperatingHeuristicText.g:1145:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGSelfOperatingHeuristicText.g:1152:3: (enumLiteral_4= '<' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1152:3: (enumLiteral_4= '<' )
                    // InternalGSelfOperatingHeuristicText.g:1153:4: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGSelfOperatingHeuristicText.g:1160:3: (enumLiteral_5= '>=' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1160:3: (enumLiteral_5= '>=' )
                    // InternalGSelfOperatingHeuristicText.g:1161:4: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGREATER_THAN_OR_EQUALSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGSelfOperatingHeuristicText.g:1168:3: (enumLiteral_6= '<=' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:1168:3: (enumLiteral_6= '<=' )
                    // InternalGSelfOperatingHeuristicText.g:1169:4: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getLESS_THAN_OR_EQUALSEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000C31B8002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000C31A0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000C3000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000300040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000C000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000FE00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});

}
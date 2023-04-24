package org.xtext.gsht.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSelfOperatingHeuristicTextLexer extends Lexer {
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

    public InternalGSelfOperatingHeuristicTextLexer() {;} 
    public InternalGSelfOperatingHeuristicTextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGSelfOperatingHeuristicTextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGSelfOperatingHeuristicText.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:11:7: ( 'DRONE' )
            // InternalGSelfOperatingHeuristicText.g:11:9: 'DRONE'
            {
            match("DRONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:12:7: ( 'drone' )
            // InternalGSelfOperatingHeuristicText.g:12:9: 'drone'
            {
            match("drone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:13:7: ( 'GLOBAL' )
            // InternalGSelfOperatingHeuristicText.g:13:9: 'GLOBAL'
            {
            match("GLOBAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:14:7: ( 'global' )
            // InternalGSelfOperatingHeuristicText.g:14:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:15:7: ( 'EVENTS' )
            // InternalGSelfOperatingHeuristicText.g:15:9: 'EVENTS'
            {
            match("EVENTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:16:7: ( 'events' )
            // InternalGSelfOperatingHeuristicText.g:16:9: 'events'
            {
            match("events"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:17:7: ( 'AS' )
            // InternalGSelfOperatingHeuristicText.g:17:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:18:7: ( 'as' )
            // InternalGSelfOperatingHeuristicText.g:18:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:19:7: ( 'STATE' )
            // InternalGSelfOperatingHeuristicText.g:19:9: 'STATE'
            {
            match("STATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:20:7: ( 'state' )
            // InternalGSelfOperatingHeuristicText.g:20:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:21:7: ( 'PROPS' )
            // InternalGSelfOperatingHeuristicText.g:21:9: 'PROPS'
            {
            match("PROPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:22:7: ( 'props' )
            // InternalGSelfOperatingHeuristicText.g:22:9: 'props'
            {
            match("props"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:23:7: ( 'TRANSITIONS' )
            // InternalGSelfOperatingHeuristicText.g:23:9: 'TRANSITIONS'
            {
            match("TRANSITIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:24:7: ( 'transitions' )
            // InternalGSelfOperatingHeuristicText.g:24:9: 'transitions'
            {
            match("transitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:25:7: ( 'ALTER' )
            // InternalGSelfOperatingHeuristicText.g:25:9: 'ALTER'
            {
            match("ALTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:26:7: ( 'alter' )
            // InternalGSelfOperatingHeuristicText.g:26:9: 'alter'
            {
            match("alter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:27:7: ( 'ON' )
            // InternalGSelfOperatingHeuristicText.g:27:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:28:7: ( 'on' )
            // InternalGSelfOperatingHeuristicText.g:28:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:29:7: ( 'TO' )
            // InternalGSelfOperatingHeuristicText.g:29:9: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:30:7: ( 'to' )
            // InternalGSelfOperatingHeuristicText.g:30:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:31:7: ( 'IF' )
            // InternalGSelfOperatingHeuristicText.g:31:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:32:7: ( 'if' )
            // InternalGSelfOperatingHeuristicText.g:32:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:33:7: ( 'SET' )
            // InternalGSelfOperatingHeuristicText.g:33:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:34:7: ( 'set' )
            // InternalGSelfOperatingHeuristicText.g:34:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:35:7: ( '??' )
            // InternalGSelfOperatingHeuristicText.g:35:9: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:36:7: ( 'int' )
            // InternalGSelfOperatingHeuristicText.g:36:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:37:7: ( 'boolean' )
            // InternalGSelfOperatingHeuristicText.g:37:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:38:7: ( 'double' )
            // InternalGSelfOperatingHeuristicText.g:38:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:39:7: ( 'String' )
            // InternalGSelfOperatingHeuristicText.g:39:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:40:7: ( '\\u00A4\\u00A4' )
            // InternalGSelfOperatingHeuristicText.g:40:9: '\\u00A4\\u00A4'
            {
            match("\u00A4\u00A4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:41:7: ( '!=' )
            // InternalGSelfOperatingHeuristicText.g:41:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:42:7: ( '==' )
            // InternalGSelfOperatingHeuristicText.g:42:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:43:7: ( '>' )
            // InternalGSelfOperatingHeuristicText.g:43:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:44:7: ( '<' )
            // InternalGSelfOperatingHeuristicText.g:44:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:45:7: ( '>=' )
            // InternalGSelfOperatingHeuristicText.g:45:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:46:7: ( '<=' )
            // InternalGSelfOperatingHeuristicText.g:46:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:47:7: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:47:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:48:7: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:48:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:49:7: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:49:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3057:10: ( ( '0' .. '9' )+ )
            // InternalGSelfOperatingHeuristicText.g:3057:12: ( '0' .. '9' )+
            {
            // InternalGSelfOperatingHeuristicText.g:3057:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:3057:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3059:11: ( ( ( 'TRUE' | 'true' | 'True' ) | ( 'FALSE' | 'false' | 'False' ) ) )
            // InternalGSelfOperatingHeuristicText.g:3059:13: ( ( 'TRUE' | 'true' | 'True' ) | ( 'FALSE' | 'false' | 'False' ) )
            {
            // InternalGSelfOperatingHeuristicText.g:3059:13: ( ( 'TRUE' | 'true' | 'True' ) | ( 'FALSE' | 'false' | 'False' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='T'||LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='F'||LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:3059:14: ( 'TRUE' | 'true' | 'True' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:3059:14: ( 'TRUE' | 'true' | 'True' )
                    int alt2=3;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='T') ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1=='R') ) {
                            alt2=1;
                        }
                        else if ( (LA2_1=='r') ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0=='t') ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:3059:15: 'TRUE'
                            {
                            match("TRUE"); 


                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:3059:22: 'true'
                            {
                            match("true"); 


                            }
                            break;
                        case 3 :
                            // InternalGSelfOperatingHeuristicText.g:3059:29: 'True'
                            {
                            match("True"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:3059:37: ( 'FALSE' | 'false' | 'False' )
                    {
                    // InternalGSelfOperatingHeuristicText.g:3059:37: ( 'FALSE' | 'false' | 'False' )
                    int alt3=3;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='F') ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1=='A') ) {
                            alt3=1;
                        }
                        else if ( (LA3_1=='a') ) {
                            alt3=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_0=='f') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:3059:38: 'FALSE'
                            {
                            match("FALSE"); 


                            }
                            break;
                        case 2 :
                            // InternalGSelfOperatingHeuristicText.g:3059:46: 'false'
                            {
                            match("false"); 


                            }
                            break;
                        case 3 :
                            // InternalGSelfOperatingHeuristicText.g:3059:54: 'False'
                            {
                            match("False"); 


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3061:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // InternalGSelfOperatingHeuristicText.g:3061:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // InternalGSelfOperatingHeuristicText.g:3061:15: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:3061:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('.'); 
            // InternalGSelfOperatingHeuristicText.g:3061:31: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:3061:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalGSelfOperatingHeuristicText.g:3061:43: ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:3061:44: ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalGSelfOperatingHeuristicText.g:3061:54: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalGSelfOperatingHeuristicText.g:3061:65: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:3061:66: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3063:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGSelfOperatingHeuristicText.g:3063:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGSelfOperatingHeuristicText.g:3063:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:3063:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGSelfOperatingHeuristicText.g:3063:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3065:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGSelfOperatingHeuristicText.g:3065:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGSelfOperatingHeuristicText.g:3065:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:3065:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGSelfOperatingHeuristicText.g:3065:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:3065:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGSelfOperatingHeuristicText.g:3065:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:3065:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGSelfOperatingHeuristicText.g:3065:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:3065:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGSelfOperatingHeuristicText.g:3065:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3067:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGSelfOperatingHeuristicText.g:3067:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGSelfOperatingHeuristicText.g:3067:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:3067:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3069:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGSelfOperatingHeuristicText.g:3069:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGSelfOperatingHeuristicText.g:3069:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:3069:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalGSelfOperatingHeuristicText.g:3069:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:3069:41: ( '\\r' )? '\\n'
                    {
                    // InternalGSelfOperatingHeuristicText.g:3069:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:3069:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3071:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGSelfOperatingHeuristicText.g:3071:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGSelfOperatingHeuristicText.g:3071:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:3073:16: ( . )
            // InternalGSelfOperatingHeuristicText.g:3073:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGSelfOperatingHeuristicText.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_INT | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=48;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalGSelfOperatingHeuristicText.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGSelfOperatingHeuristicText.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGSelfOperatingHeuristicText.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGSelfOperatingHeuristicText.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGSelfOperatingHeuristicText.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGSelfOperatingHeuristicText.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGSelfOperatingHeuristicText.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGSelfOperatingHeuristicText.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGSelfOperatingHeuristicText.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGSelfOperatingHeuristicText.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGSelfOperatingHeuristicText.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGSelfOperatingHeuristicText.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGSelfOperatingHeuristicText.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGSelfOperatingHeuristicText.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGSelfOperatingHeuristicText.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalGSelfOperatingHeuristicText.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalGSelfOperatingHeuristicText.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalGSelfOperatingHeuristicText.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalGSelfOperatingHeuristicText.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalGSelfOperatingHeuristicText.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalGSelfOperatingHeuristicText.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalGSelfOperatingHeuristicText.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalGSelfOperatingHeuristicText.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalGSelfOperatingHeuristicText.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalGSelfOperatingHeuristicText.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalGSelfOperatingHeuristicText.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalGSelfOperatingHeuristicText.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalGSelfOperatingHeuristicText.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalGSelfOperatingHeuristicText.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalGSelfOperatingHeuristicText.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalGSelfOperatingHeuristicText.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalGSelfOperatingHeuristicText.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalGSelfOperatingHeuristicText.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalGSelfOperatingHeuristicText.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalGSelfOperatingHeuristicText.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalGSelfOperatingHeuristicText.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalGSelfOperatingHeuristicText.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalGSelfOperatingHeuristicText.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalGSelfOperatingHeuristicText.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalGSelfOperatingHeuristicText.g:1:244: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalGSelfOperatingHeuristicText.g:1:253: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 42 :
                // InternalGSelfOperatingHeuristicText.g:1:263: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 43 :
                // InternalGSelfOperatingHeuristicText.g:1:275: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalGSelfOperatingHeuristicText.g:1:283: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalGSelfOperatingHeuristicText.g:1:295: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalGSelfOperatingHeuristicText.g:1:311: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalGSelfOperatingHeuristicText.g:1:327: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // InternalGSelfOperatingHeuristicText.g:1:335: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\22\47\1\45\1\47\2\45\1\110\1\112\1\114\2\uffff\1\117\2\47\1\45\1\uffff\3\45\2\uffff\1\47\1\uffff\6\47\1\140\1\47\1\142\11\47\1\155\2\47\1\161\1\162\1\163\1\164\1\165\1\47\1\uffff\1\47\13\uffff\1\117\1\uffff\3\47\4\uffff\7\47\1\uffff\1\47\1\uffff\2\47\1\u0085\2\47\1\u0088\4\47\1\uffff\3\47\5\uffff\1\u0090\16\47\1\uffff\2\47\1\uffff\3\47\2\u00a4\1\47\1\u00a4\1\uffff\4\47\1\u00aa\1\u00ab\5\47\1\u00b1\1\u00b2\1\u00b3\1\47\1\u00b5\1\u00b6\1\u00b7\1\47\1\uffff\2\47\3\u00a4\2\uffff\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\3\uffff\1\u00c0\3\uffff\3\47\6\uffff\2\47\1\u00c6\2\47\1\uffff\4\47\1\u00cd\1\u00ce\2\uffff";
    static final String DFA20_eofS =
        "\u00cf\uffff";
    static final String DFA20_minS =
        "\1\0\1\122\1\157\1\114\1\154\1\126\1\166\1\114\1\154\1\105\1\145\1\122\1\162\1\117\1\157\1\116\1\156\1\106\1\146\1\77\1\157\1\u00a4\4\75\2\uffff\1\56\1\101\1\141\1\101\1\uffff\2\0\1\52\2\uffff\1\117\1\uffff\1\157\1\165\1\117\1\157\1\105\1\145\1\60\1\124\1\60\1\164\1\101\1\124\1\162\1\141\1\164\1\117\1\157\1\101\1\60\1\165\1\141\5\60\1\164\1\uffff\1\157\13\uffff\1\56\1\uffff\1\114\2\154\4\uffff\1\116\1\156\1\142\1\102\1\142\1\116\1\156\1\uffff\1\105\1\uffff\1\145\1\124\1\60\1\151\1\164\1\60\1\120\1\160\1\116\1\105\1\uffff\1\145\1\156\1\145\5\uffff\1\60\1\154\1\123\2\163\1\105\1\145\1\154\1\101\1\141\1\124\1\164\1\122\1\162\1\105\1\uffff\1\156\1\145\1\uffff\1\123\1\163\1\123\2\60\1\163\1\60\1\uffff\1\145\1\105\2\145\2\60\1\145\1\114\1\154\1\123\1\163\3\60\1\147\3\60\1\111\1\uffff\1\151\1\141\3\60\2\uffff\5\60\3\uffff\1\60\3\uffff\1\124\1\164\1\156\6\uffff\1\111\1\151\1\60\1\117\1\157\1\uffff\1\116\1\156\1\123\1\163\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\122\1\162\1\114\1\154\1\126\1\166\1\123\1\163\2\164\1\122\3\162\1\116\1\156\1\106\1\156\1\77\1\157\1\u00a4\4\75\2\uffff\1\71\2\141\1\172\1\uffff\2\uffff\1\57\2\uffff\1\117\1\uffff\1\157\1\165\1\117\1\157\1\105\1\145\1\172\1\124\1\172\1\164\1\101\1\124\1\162\1\141\1\164\1\117\1\157\1\125\1\172\2\165\5\172\1\164\1\uffff\1\157\13\uffff\1\71\1\uffff\1\114\2\154\4\uffff\1\116\1\156\1\142\1\102\1\142\1\116\1\156\1\uffff\1\105\1\uffff\1\145\1\124\1\172\1\151\1\164\1\172\1\120\1\160\1\116\1\105\1\uffff\1\145\1\156\1\145\5\uffff\1\172\1\154\1\123\2\163\1\105\1\145\1\154\1\101\1\141\1\124\1\164\1\122\1\162\1\105\1\uffff\1\156\1\145\1\uffff\1\123\1\163\1\123\2\172\1\163\1\172\1\uffff\1\145\1\105\2\145\2\172\1\145\1\114\1\154\1\123\1\163\3\172\1\147\3\172\1\111\1\uffff\1\151\1\141\3\172\2\uffff\5\172\3\uffff\1\172\3\uffff\1\124\1\164\1\156\6\uffff\1\111\1\151\1\172\1\117\1\157\1\uffff\1\116\1\156\1\123\1\163\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\32\uffff\1\45\1\46\4\uffff\1\53\3\uffff\1\57\1\60\1\uffff\1\53\33\uffff\1\31\1\uffff\1\36\1\37\1\40\1\47\1\43\1\41\1\44\1\42\1\45\1\46\1\50\1\uffff\1\52\3\uffff\1\54\1\55\1\56\1\57\7\uffff\1\7\1\uffff\1\10\12\uffff\1\23\3\uffff\1\24\1\21\1\22\1\25\1\26\17\uffff\1\27\2\uffff\1\30\7\uffff\1\32\23\uffff\1\51\5\uffff\1\1\1\2\5\uffff\1\17\1\20\1\11\1\uffff\1\12\1\13\1\14\3\uffff\1\34\1\3\1\4\1\5\1\6\1\35\5\uffff\1\33\6\uffff\1\15\1\16";
    static final String DFA20_specialS =
        "\1\1\40\uffff\1\0\1\2\u00ac\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\26\1\41\4\45\1\42\7\45\1\43\12\34\2\45\1\31\1\27\1\30\1\23\1\45\1\7\2\40\1\1\1\5\1\35\1\3\1\40\1\21\5\40\1\17\1\13\2\40\1\11\1\15\6\40\3\45\1\37\1\40\1\45\1\10\1\24\1\40\1\2\1\6\1\36\1\4\1\40\1\22\5\40\1\20\1\14\2\40\1\12\1\16\6\40\1\32\1\45\1\33\46\45\1\25\uff5b\45",
            "\1\46",
            "\1\51\2\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57\6\uffff\1\56",
            "\1\61\6\uffff\1\60",
            "\1\63\16\uffff\1\62\37\uffff\1\64",
            "\1\66\16\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\72\2\uffff\1\71\37\uffff\1\73",
            "\1\75\2\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101\7\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111",
            "\1\113",
            "",
            "",
            "\1\121\1\uffff\12\120",
            "\1\122\37\uffff\1\123",
            "\1\124",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\125",
            "\0\125",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\141",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\23\uffff\1\154",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\156",
            "\1\157\23\uffff\1\160",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\166",
            "",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121\1\uffff\12\120",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0086",
            "\1\u0087",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_INT | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_33 = input.LA(1);

                        s = -1;
                        if ( ((LA20_33>='\u0000' && LA20_33<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='D') ) {s = 1;}

                        else if ( (LA20_0=='d') ) {s = 2;}

                        else if ( (LA20_0=='G') ) {s = 3;}

                        else if ( (LA20_0=='g') ) {s = 4;}

                        else if ( (LA20_0=='E') ) {s = 5;}

                        else if ( (LA20_0=='e') ) {s = 6;}

                        else if ( (LA20_0=='A') ) {s = 7;}

                        else if ( (LA20_0=='a') ) {s = 8;}

                        else if ( (LA20_0=='S') ) {s = 9;}

                        else if ( (LA20_0=='s') ) {s = 10;}

                        else if ( (LA20_0=='P') ) {s = 11;}

                        else if ( (LA20_0=='p') ) {s = 12;}

                        else if ( (LA20_0=='T') ) {s = 13;}

                        else if ( (LA20_0=='t') ) {s = 14;}

                        else if ( (LA20_0=='O') ) {s = 15;}

                        else if ( (LA20_0=='o') ) {s = 16;}

                        else if ( (LA20_0=='I') ) {s = 17;}

                        else if ( (LA20_0=='i') ) {s = 18;}

                        else if ( (LA20_0=='?') ) {s = 19;}

                        else if ( (LA20_0=='b') ) {s = 20;}

                        else if ( (LA20_0=='\u00A4') ) {s = 21;}

                        else if ( (LA20_0=='!') ) {s = 22;}

                        else if ( (LA20_0=='=') ) {s = 23;}

                        else if ( (LA20_0=='>') ) {s = 24;}

                        else if ( (LA20_0=='<') ) {s = 25;}

                        else if ( (LA20_0=='{') ) {s = 26;}

                        else if ( (LA20_0=='}') ) {s = 27;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 28;}

                        else if ( (LA20_0=='F') ) {s = 29;}

                        else if ( (LA20_0=='f') ) {s = 30;}

                        else if ( (LA20_0=='^') ) {s = 31;}

                        else if ( ((LA20_0>='B' && LA20_0<='C')||LA20_0=='H'||(LA20_0>='J' && LA20_0<='N')||(LA20_0>='Q' && LA20_0<='R')||(LA20_0>='U' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='c'||LA20_0=='h'||(LA20_0>='j' && LA20_0<='n')||(LA20_0>='q' && LA20_0<='r')||(LA20_0>='u' && LA20_0<='z')) ) {s = 32;}

                        else if ( (LA20_0=='\"') ) {s = 33;}

                        else if ( (LA20_0=='\'') ) {s = 34;}

                        else if ( (LA20_0=='/') ) {s = 35;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 36;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='#' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='.')||(LA20_0>=':' && LA20_0<=';')||LA20_0=='@'||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||LA20_0=='|'||(LA20_0>='~' && LA20_0<='\u00A3')||(LA20_0>='\u00A5' && LA20_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_34 = input.LA(1);

                        s = -1;
                        if ( ((LA20_34>='\u0000' && LA20_34<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
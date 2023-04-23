package org.xtext.gsht.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSelfOperatingHeuristicTextLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=6;
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
            // InternalGSelfOperatingHeuristicText.g:12:7: ( 'GLOBAL' )
            // InternalGSelfOperatingHeuristicText.g:12:9: 'GLOBAL'
            {
            match("GLOBAL"); 


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
            // InternalGSelfOperatingHeuristicText.g:13:7: ( '{' )
            // InternalGSelfOperatingHeuristicText.g:13:9: '{'
            {
            match('{'); 

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
            // InternalGSelfOperatingHeuristicText.g:14:7: ( '}' )
            // InternalGSelfOperatingHeuristicText.g:14:9: '}'
            {
            match('}'); 

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
            // InternalGSelfOperatingHeuristicText.g:15:7: ( 'as' )
            // InternalGSelfOperatingHeuristicText.g:15:9: 'as'
            {
            match("as"); 


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
            // InternalGSelfOperatingHeuristicText.g:16:7: ( '=' )
            // InternalGSelfOperatingHeuristicText.g:16:9: '='
            {
            match('='); 

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
            // InternalGSelfOperatingHeuristicText.g:17:7: ( 'STATE' )
            // InternalGSelfOperatingHeuristicText.g:17:9: 'STATE'
            {
            match("STATE"); 


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
            // InternalGSelfOperatingHeuristicText.g:18:7: ( 'PROPS' )
            // InternalGSelfOperatingHeuristicText.g:18:9: 'PROPS'
            {
            match("PROPS"); 


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
            // InternalGSelfOperatingHeuristicText.g:19:7: ( 'TRANSITIONS' )
            // InternalGSelfOperatingHeuristicText.g:19:9: 'TRANSITIONS'
            {
            match("TRANSITIONS"); 


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
            // InternalGSelfOperatingHeuristicText.g:20:7: ( 'ALTER' )
            // InternalGSelfOperatingHeuristicText.g:20:9: 'ALTER'
            {
            match("ALTER"); 


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
            // InternalGSelfOperatingHeuristicText.g:21:7: ( 'ON' )
            // InternalGSelfOperatingHeuristicText.g:21:9: 'ON'
            {
            match("ON"); 


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
            // InternalGSelfOperatingHeuristicText.g:22:7: ( 'TO' )
            // InternalGSelfOperatingHeuristicText.g:22:9: 'TO'
            {
            match("TO"); 


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
            // InternalGSelfOperatingHeuristicText.g:23:7: ( 'IF' )
            // InternalGSelfOperatingHeuristicText.g:23:9: 'IF'
            {
            match("IF"); 


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
            // InternalGSelfOperatingHeuristicText.g:24:7: ( 'SET' )
            // InternalGSelfOperatingHeuristicText.g:24:9: 'SET'
            {
            match("SET"); 


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
            // InternalGSelfOperatingHeuristicText.g:25:7: ( 'EVENT' )
            // InternalGSelfOperatingHeuristicText.g:25:9: 'EVENT'
            {
            match("EVENT"); 


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
            // InternalGSelfOperatingHeuristicText.g:26:7: ( '??' )
            // InternalGSelfOperatingHeuristicText.g:26:9: '??'
            {
            match("??"); 


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
            // InternalGSelfOperatingHeuristicText.g:27:7: ( 'int' )
            // InternalGSelfOperatingHeuristicText.g:27:9: 'int'
            {
            match("int"); 


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
            // InternalGSelfOperatingHeuristicText.g:28:7: ( 'boolean' )
            // InternalGSelfOperatingHeuristicText.g:28:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalGSelfOperatingHeuristicText.g:29:7: ( 'double' )
            // InternalGSelfOperatingHeuristicText.g:29:9: 'double'
            {
            match("double"); 


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
            // InternalGSelfOperatingHeuristicText.g:30:7: ( 'String' )
            // InternalGSelfOperatingHeuristicText.g:30:9: 'String'
            {
            match("String"); 


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
            // InternalGSelfOperatingHeuristicText.g:31:7: ( '\\u00A4\\u00A4' )
            // InternalGSelfOperatingHeuristicText.g:31:9: '\\u00A4\\u00A4'
            {
            match("\u00A4\u00A4"); 


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
            // InternalGSelfOperatingHeuristicText.g:32:7: ( '!=' )
            // InternalGSelfOperatingHeuristicText.g:32:9: '!='
            {
            match("!="); 


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
            // InternalGSelfOperatingHeuristicText.g:33:7: ( '==' )
            // InternalGSelfOperatingHeuristicText.g:33:9: '=='
            {
            match("=="); 


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
            // InternalGSelfOperatingHeuristicText.g:34:7: ( '>' )
            // InternalGSelfOperatingHeuristicText.g:34:9: '>'
            {
            match('>'); 

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
            // InternalGSelfOperatingHeuristicText.g:35:7: ( '<' )
            // InternalGSelfOperatingHeuristicText.g:35:9: '<'
            {
            match('<'); 

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
            // InternalGSelfOperatingHeuristicText.g:36:7: ( '>=' )
            // InternalGSelfOperatingHeuristicText.g:36:9: '>='
            {
            match(">="); 


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
            // InternalGSelfOperatingHeuristicText.g:37:7: ( '<=' )
            // InternalGSelfOperatingHeuristicText.g:37:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGSelfOperatingHeuristicText.g:1059:10: ( ( '0' .. '9' )+ )
            // InternalGSelfOperatingHeuristicText.g:1059:12: ( '0' .. '9' )+
            {
            // InternalGSelfOperatingHeuristicText.g:1059:12: ( '0' .. '9' )+
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
            	    // InternalGSelfOperatingHeuristicText.g:1059:13: '0' .. '9'
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
            // InternalGSelfOperatingHeuristicText.g:1061:11: ( ( 'TRUE' | 'FALSE' ) )
            // InternalGSelfOperatingHeuristicText.g:1061:13: ( 'TRUE' | 'FALSE' )
            {
            // InternalGSelfOperatingHeuristicText.g:1061:13: ( 'TRUE' | 'FALSE' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='T') ) {
                alt2=1;
            }
            else if ( (LA2_0=='F') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1061:14: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:1061:21: 'FALSE'
                    {
                    match("FALSE"); 


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
            // InternalGSelfOperatingHeuristicText.g:1063:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // InternalGSelfOperatingHeuristicText.g:1063:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // InternalGSelfOperatingHeuristicText.g:1063:15: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1063:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // InternalGSelfOperatingHeuristicText.g:1063:31: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1063:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGSelfOperatingHeuristicText.g:1063:43: ( ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1063:44: ( 'E' | 'e' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalGSelfOperatingHeuristicText.g:1063:54: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
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

                    // InternalGSelfOperatingHeuristicText.g:1063:65: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:1063:66: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
            // InternalGSelfOperatingHeuristicText.g:1065:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGSelfOperatingHeuristicText.g:1065:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGSelfOperatingHeuristicText.g:1065:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1065:11: '^'
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

            // InternalGSelfOperatingHeuristicText.g:1065:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // InternalGSelfOperatingHeuristicText.g:1067:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGSelfOperatingHeuristicText.g:1067:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGSelfOperatingHeuristicText.g:1067:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1067:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGSelfOperatingHeuristicText.g:1067:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:1067:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGSelfOperatingHeuristicText.g:1067:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGSelfOperatingHeuristicText.g:1067:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGSelfOperatingHeuristicText.g:1067:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGSelfOperatingHeuristicText.g:1067:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGSelfOperatingHeuristicText.g:1067:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalGSelfOperatingHeuristicText.g:1069:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGSelfOperatingHeuristicText.g:1069:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGSelfOperatingHeuristicText.g:1069:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1069:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalGSelfOperatingHeuristicText.g:1071:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGSelfOperatingHeuristicText.g:1071:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGSelfOperatingHeuristicText.g:1071:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGSelfOperatingHeuristicText.g:1071:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalGSelfOperatingHeuristicText.g:1071:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGSelfOperatingHeuristicText.g:1071:41: ( '\\r' )? '\\n'
                    {
                    // InternalGSelfOperatingHeuristicText.g:1071:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGSelfOperatingHeuristicText.g:1071:41: '\\r'
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
            // InternalGSelfOperatingHeuristicText.g:1073:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGSelfOperatingHeuristicText.g:1073:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGSelfOperatingHeuristicText.g:1073:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalGSelfOperatingHeuristicText.g:1075:16: ( . )
            // InternalGSelfOperatingHeuristicText.g:1075:18: .
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
        // InternalGSelfOperatingHeuristicText.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_INT | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=36;
        alt18 = dfa18.predict(input);
        switch (alt18) {
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
                // InternalGSelfOperatingHeuristicText.g:1:172: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalGSelfOperatingHeuristicText.g:1:181: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 30 :
                // InternalGSelfOperatingHeuristicText.g:1:191: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 31 :
                // InternalGSelfOperatingHeuristicText.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalGSelfOperatingHeuristicText.g:1:211: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalGSelfOperatingHeuristicText.g:1:223: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalGSelfOperatingHeuristicText.g:1:239: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalGSelfOperatingHeuristicText.g:1:255: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalGSelfOperatingHeuristicText.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\2\40\2\uffff\1\40\1\46\7\40\1\36\3\40\2\36\1\70\1\72\1\75\1\40\1\36\1\uffff\3\36\2\uffff\1\40\1\uffff\1\40\2\uffff\1\105\2\uffff\5\40\1\114\1\40\1\116\1\117\1\40\1\uffff\3\40\7\uffff\1\75\1\uffff\1\40\4\uffff\2\40\1\uffff\1\40\1\130\4\40\1\uffff\1\40\2\uffff\1\40\1\137\6\40\1\uffff\3\40\1\151\2\40\1\uffff\3\40\1\157\1\40\1\161\1\40\1\163\1\40\1\uffff\1\165\1\166\2\40\1\151\1\uffff\1\171\1\uffff\1\172\1\uffff\1\40\2\uffff\1\40\1\175\2\uffff\1\40\1\177\1\uffff\1\40\1\uffff\2\40\1\u0083\1\uffff";
    static final String DFA18_eofS =
        "\u0084\uffff";
    static final String DFA18_minS =
        "\1\0\1\122\1\114\2\uffff\1\163\1\75\1\105\1\122\1\117\1\114\1\116\1\106\1\126\1\77\1\156\2\157\1\u00a4\3\75\1\56\2\101\1\uffff\2\0\1\52\2\uffff\1\117\1\uffff\1\117\2\uffff\1\60\2\uffff\1\101\1\124\1\162\1\117\1\101\1\60\1\124\2\60\1\105\1\uffff\1\164\1\157\1\165\7\uffff\1\56\1\uffff\1\114\4\uffff\1\116\1\102\1\uffff\1\124\1\60\1\151\1\120\1\116\1\105\1\uffff\1\105\2\uffff\1\116\1\60\1\154\1\142\1\123\1\105\1\101\1\105\1\uffff\1\156\2\123\1\60\1\122\1\124\1\uffff\1\145\1\154\1\105\1\60\1\114\1\60\1\147\1\60\1\111\1\uffff\2\60\1\141\1\145\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\124\2\uffff\1\156\1\60\2\uffff\1\111\1\60\1\uffff\1\117\1\uffff\1\116\1\123\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\122\1\114\2\uffff\1\163\1\75\1\164\2\122\1\114\1\116\1\106\1\126\1\77\1\156\2\157\1\u00a4\3\75\1\71\1\101\1\172\1\uffff\2\uffff\1\57\2\uffff\1\117\1\uffff\1\117\2\uffff\1\172\2\uffff\1\101\1\124\1\162\1\117\1\125\1\172\1\124\2\172\1\105\1\uffff\1\164\1\157\1\165\7\uffff\1\71\1\uffff\1\114\4\uffff\1\116\1\102\1\uffff\1\124\1\172\1\151\1\120\1\116\1\105\1\uffff\1\105\2\uffff\1\116\1\172\1\154\1\142\1\123\1\105\1\101\1\105\1\uffff\1\156\2\123\1\172\1\122\1\124\1\uffff\1\145\1\154\1\105\1\172\1\114\1\172\1\147\1\172\1\111\1\uffff\2\172\1\141\1\145\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\124\2\uffff\1\156\1\172\2\uffff\1\111\1\172\1\uffff\1\117\1\uffff\1\116\1\123\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\1\4\24\uffff\1\37\3\uffff\1\43\1\44\1\uffff\1\37\1\uffff\1\3\1\4\1\uffff\1\27\1\6\12\uffff\1\20\3\uffff\1\25\1\26\1\32\1\30\1\33\1\31\1\36\1\uffff\1\34\1\uffff\1\40\1\41\1\42\1\43\2\uffff\1\5\6\uffff\1\14\1\uffff\1\13\1\15\10\uffff\1\16\6\uffff\1\21\11\uffff\1\35\5\uffff\1\1\1\uffff\1\7\1\uffff\1\10\1\uffff\1\12\1\17\2\uffff\1\2\1\24\2\uffff\1\23\1\uffff\1\22\3\uffff\1\11";
    static final String DFA18_specialS =
        "\1\2\31\uffff\1\1\1\0\150\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\23\1\32\4\36\1\33\7\36\1\34\12\26\2\36\1\25\1\6\1\24\1\16\1\36\1\12\2\31\1\1\1\15\1\27\1\2\1\31\1\14\5\31\1\13\1\10\2\31\1\7\1\11\6\31\3\36\1\30\1\31\1\36\1\5\1\20\1\31\1\21\4\31\1\17\21\31\1\3\1\36\1\4\46\36\1\22\uff5b\36",
            "\1\37",
            "\1\41",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\50\16\uffff\1\47\37\uffff\1\51",
            "\1\52",
            "\1\54\2\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71",
            "\1\73\1\uffff\12\74",
            "\1\76",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\23\uffff\1\113",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\115",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73\1\uffff\12\74",
            "",
            "\1\124",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "",
            "",
            "\1\136",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\160",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\164",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\167",
            "\1\170",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\173",
            "",
            "",
            "\1\174",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\176",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_INT | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_27 = input.LA(1);

                        s = -1;
                        if ( ((LA18_27>='\u0000' && LA18_27<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_26 = input.LA(1);

                        s = -1;
                        if ( ((LA18_26>='\u0000' && LA18_26<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='D') ) {s = 1;}

                        else if ( (LA18_0=='G') ) {s = 2;}

                        else if ( (LA18_0=='{') ) {s = 3;}

                        else if ( (LA18_0=='}') ) {s = 4;}

                        else if ( (LA18_0=='a') ) {s = 5;}

                        else if ( (LA18_0=='=') ) {s = 6;}

                        else if ( (LA18_0=='S') ) {s = 7;}

                        else if ( (LA18_0=='P') ) {s = 8;}

                        else if ( (LA18_0=='T') ) {s = 9;}

                        else if ( (LA18_0=='A') ) {s = 10;}

                        else if ( (LA18_0=='O') ) {s = 11;}

                        else if ( (LA18_0=='I') ) {s = 12;}

                        else if ( (LA18_0=='E') ) {s = 13;}

                        else if ( (LA18_0=='?') ) {s = 14;}

                        else if ( (LA18_0=='i') ) {s = 15;}

                        else if ( (LA18_0=='b') ) {s = 16;}

                        else if ( (LA18_0=='d') ) {s = 17;}

                        else if ( (LA18_0=='\u00A4') ) {s = 18;}

                        else if ( (LA18_0=='!') ) {s = 19;}

                        else if ( (LA18_0=='>') ) {s = 20;}

                        else if ( (LA18_0=='<') ) {s = 21;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 22;}

                        else if ( (LA18_0=='F') ) {s = 23;}

                        else if ( (LA18_0=='^') ) {s = 24;}

                        else if ( ((LA18_0>='B' && LA18_0<='C')||LA18_0=='H'||(LA18_0>='J' && LA18_0<='N')||(LA18_0>='Q' && LA18_0<='R')||(LA18_0>='U' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='c'||(LA18_0>='e' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='z')) ) {s = 25;}

                        else if ( (LA18_0=='\"') ) {s = 26;}

                        else if ( (LA18_0=='\'') ) {s = 27;}

                        else if ( (LA18_0=='/') ) {s = 28;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 29;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='.')||(LA18_0>=':' && LA18_0<=';')||LA18_0=='@'||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\u00A3')||(LA18_0>='\u00A5' && LA18_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
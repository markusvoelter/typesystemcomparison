package org.typesys.xts.guidsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.typesys.xts.guidsl.services.GuiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECIMAL_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'edits'", "'{'", "'}'", "'text'", "'('", "')'", "'->'", "';'", "'validate'", "'checkbox'", "'entity'", "'/'", "'='", "':'", "'float'", "'int'", "'bool'", "'string'", "'=='", "'!='", "'>'", "'>='", "'<='", "'&&'", "'=>'", "'||'", "'<'", "'+'", "'-'", "'*'", "'!'", "'true'", "'false'", "'widgetcontent'", "'lengthOf'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DECIMAL_NUMBER=5;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalGuiDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g"; }


     
     	private GuiDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GuiDslGrammarAccess grammarAccess) {
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
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:61:1: ( ruleModel EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:69:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:73:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:74:1: ( ( rule__Model__Alternatives )* )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:74:1: ( ( rule__Model__Alternatives )* )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:75:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:76:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:76:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleForm"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:88:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:89:1: ( ruleForm EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:90:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm122);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm129); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:97:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:101:2: ( ( ( rule__Form__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:102:1: ( ( rule__Form__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:102:1: ( ( rule__Form__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:103:1: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:104:1: ( rule__Form__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:104:2: rule__Form__Group__0
            {
            pushFollow(FOLLOW_rule__Form__Group__0_in_ruleForm155);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleWidget"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:116:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:117:1: ( ruleWidget EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:118:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget182);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget189); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:125:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:129:2: ( ( ( rule__Widget__Alternatives ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:130:1: ( ( rule__Widget__Alternatives ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:130:1: ( ( rule__Widget__Alternatives ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:131:1: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:132:1: ( rule__Widget__Alternatives )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:132:2: rule__Widget__Alternatives
            {
            pushFollow(FOLLOW_rule__Widget__Alternatives_in_ruleWidget215);
            rule__Widget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextWidget"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:144:1: entryRuleTextWidget : ruleTextWidget EOF ;
    public final void entryRuleTextWidget() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:145:1: ( ruleTextWidget EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:146:1: ruleTextWidget EOF
            {
             before(grammarAccess.getTextWidgetRule()); 
            pushFollow(FOLLOW_ruleTextWidget_in_entryRuleTextWidget242);
            ruleTextWidget();

            state._fsp--;

             after(grammarAccess.getTextWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextWidget249); 

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
    // $ANTLR end "entryRuleTextWidget"


    // $ANTLR start "ruleTextWidget"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:153:1: ruleTextWidget : ( ( rule__TextWidget__Group__0 ) ) ;
    public final void ruleTextWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:157:2: ( ( ( rule__TextWidget__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:158:1: ( ( rule__TextWidget__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:158:1: ( ( rule__TextWidget__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:159:1: ( rule__TextWidget__Group__0 )
            {
             before(grammarAccess.getTextWidgetAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:160:1: ( rule__TextWidget__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:160:2: rule__TextWidget__Group__0
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__0_in_ruleTextWidget275);
            rule__TextWidget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextWidgetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextWidget"


    // $ANTLR start "entryRuleCheckBoxWidget"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:172:1: entryRuleCheckBoxWidget : ruleCheckBoxWidget EOF ;
    public final void entryRuleCheckBoxWidget() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:173:1: ( ruleCheckBoxWidget EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:174:1: ruleCheckBoxWidget EOF
            {
             before(grammarAccess.getCheckBoxWidgetRule()); 
            pushFollow(FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget302);
            ruleCheckBoxWidget();

            state._fsp--;

             after(grammarAccess.getCheckBoxWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBoxWidget309); 

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
    // $ANTLR end "entryRuleCheckBoxWidget"


    // $ANTLR start "ruleCheckBoxWidget"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:181:1: ruleCheckBoxWidget : ( ( rule__CheckBoxWidget__Group__0 ) ) ;
    public final void ruleCheckBoxWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:185:2: ( ( ( rule__CheckBoxWidget__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:186:1: ( ( rule__CheckBoxWidget__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:186:1: ( ( rule__CheckBoxWidget__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:187:1: ( rule__CheckBoxWidget__Group__0 )
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:188:1: ( rule__CheckBoxWidget__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:188:2: rule__CheckBoxWidget__Group__0
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__0_in_ruleCheckBoxWidget335);
            rule__CheckBoxWidget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxWidgetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckBoxWidget"


    // $ANTLR start "entryRuleEntity"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:200:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:201:1: ( ruleEntity EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:202:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity362);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity369); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:209:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:213:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:214:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:214:1: ( ( rule__Entity__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:215:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:216:1: ( rule__Entity__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:216:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity395);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:229:1: ( ruleAttribute EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute422);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute429); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:237:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:241:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:242:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:242:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:243:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:244:1: ( rule__Attribute__Alternatives )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:244:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute455);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDerivedAttribute"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:256:1: entryRuleDerivedAttribute : ruleDerivedAttribute EOF ;
    public final void entryRuleDerivedAttribute() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:257:1: ( ruleDerivedAttribute EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:258:1: ruleDerivedAttribute EOF
            {
             before(grammarAccess.getDerivedAttributeRule()); 
            pushFollow(FOLLOW_ruleDerivedAttribute_in_entryRuleDerivedAttribute482);
            ruleDerivedAttribute();

            state._fsp--;

             after(grammarAccess.getDerivedAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDerivedAttribute489); 

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
    // $ANTLR end "entryRuleDerivedAttribute"


    // $ANTLR start "ruleDerivedAttribute"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:265:1: ruleDerivedAttribute : ( ( rule__DerivedAttribute__Group__0 ) ) ;
    public final void ruleDerivedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:269:2: ( ( ( rule__DerivedAttribute__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:270:1: ( ( rule__DerivedAttribute__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:270:1: ( ( rule__DerivedAttribute__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:271:1: ( rule__DerivedAttribute__Group__0 )
            {
             before(grammarAccess.getDerivedAttributeAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:272:1: ( rule__DerivedAttribute__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:272:2: rule__DerivedAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__Group__0_in_ruleDerivedAttribute515);
            rule__DerivedAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDerivedAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDerivedAttribute"


    // $ANTLR start "entryRuleSimpleAttribute"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:284:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:285:1: ( ruleSimpleAttribute EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:286:1: ruleSimpleAttribute EOF
            {
             before(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute542);
            ruleSimpleAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute549); 

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
    // $ANTLR end "entryRuleSimpleAttribute"


    // $ANTLR start "ruleSimpleAttribute"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:293:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__Group__0 ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:297:2: ( ( ( rule__SimpleAttribute__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:298:1: ( ( rule__SimpleAttribute__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:298:1: ( ( rule__SimpleAttribute__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:299:1: ( rule__SimpleAttribute__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:300:1: ( rule__SimpleAttribute__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:300:2: rule__SimpleAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute575);
            rule__SimpleAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAttribute"


    // $ANTLR start "entryRuleType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:312:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:313:1: ( ruleType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:314:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType602);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType609); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:321:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:325:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:326:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:326:1: ( ( rule__Type__Alternatives ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:327:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:328:1: ( rule__Type__Alternatives )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:328:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType635);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:340:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:341:1: ( ruleEntityType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:342:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType662);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType669); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:349:1: ruleEntityType : ( ( rule__EntityType__RefAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:353:2: ( ( ( rule__EntityType__RefAssignment ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:354:1: ( ( rule__EntityType__RefAssignment ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:354:1: ( ( rule__EntityType__RefAssignment ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:355:1: ( rule__EntityType__RefAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getRefAssignment()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:356:1: ( rule__EntityType__RefAssignment )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:356:2: rule__EntityType__RefAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__RefAssignment_in_ruleEntityType695);
            rule__EntityType__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:368:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:369:1: ( rulePrimitiveType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:370:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType722);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType729); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:377:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:381:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:382:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:382:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:383:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:384:1: ( rule__PrimitiveType__Alternatives )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:384:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType755);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleFloatType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:396:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:397:1: ( ruleFloatType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:398:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType782);
            ruleFloatType();

            state._fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType789); 

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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:405:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:409:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:410:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:410:1: ( ( rule__FloatType__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:411:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:412:1: ( rule__FloatType__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:412:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType815);
            rule__FloatType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleIntType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:424:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:425:1: ( ruleIntType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:426:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType842);
            ruleIntType();

            state._fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType849); 

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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:433:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:437:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:438:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:438:1: ( ( rule__IntType__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:439:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:440:1: ( rule__IntType__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:440:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType875);
            rule__IntType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:452:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:453:1: ( ruleBooleanType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:454:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType902);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType909); 

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:461:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:465:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:466:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:466:1: ( ( rule__BooleanType__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:467:1: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:468:1: ( rule__BooleanType__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:468:2: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType935);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:480:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:481:1: ( ruleStringType EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:482:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType962);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType969); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:489:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:493:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:494:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:494:1: ( ( rule__StringType__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:495:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:496:1: ( rule__StringType__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:496:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType995);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleExpr"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:508:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:509:1: ( ruleExpr EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:510:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1022);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1029); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:517:1: ruleExpr : ( ruleComparisonLevel ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:521:2: ( ( ruleComparisonLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:522:1: ( ruleComparisonLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:522:1: ( ruleComparisonLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:523:1: ruleComparisonLevel
            {
             before(grammarAccess.getExprAccess().getComparisonLevelParserRuleCall()); 
            pushFollow(FOLLOW_ruleComparisonLevel_in_ruleExpr1055);
            ruleComparisonLevel();

            state._fsp--;

             after(grammarAccess.getExprAccess().getComparisonLevelParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleComparisonLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:536:1: entryRuleComparisonLevel : ruleComparisonLevel EOF ;
    public final void entryRuleComparisonLevel() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:537:1: ( ruleComparisonLevel EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:538:1: ruleComparisonLevel EOF
            {
             before(grammarAccess.getComparisonLevelRule()); 
            pushFollow(FOLLOW_ruleComparisonLevel_in_entryRuleComparisonLevel1081);
            ruleComparisonLevel();

            state._fsp--;

             after(grammarAccess.getComparisonLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonLevel1088); 

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
    // $ANTLR end "entryRuleComparisonLevel"


    // $ANTLR start "ruleComparisonLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:545:1: ruleComparisonLevel : ( ( rule__ComparisonLevel__Group__0 ) ) ;
    public final void ruleComparisonLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:549:2: ( ( ( rule__ComparisonLevel__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:550:1: ( ( rule__ComparisonLevel__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:550:1: ( ( rule__ComparisonLevel__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:551:1: ( rule__ComparisonLevel__Group__0 )
            {
             before(grammarAccess.getComparisonLevelAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:552:1: ( rule__ComparisonLevel__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:552:2: rule__ComparisonLevel__Group__0
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group__0_in_ruleComparisonLevel1114);
            rule__ComparisonLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonLevel"


    // $ANTLR start "entryRuleAdditionLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:564:1: entryRuleAdditionLevel : ruleAdditionLevel EOF ;
    public final void entryRuleAdditionLevel() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:565:1: ( ruleAdditionLevel EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:566:1: ruleAdditionLevel EOF
            {
             before(grammarAccess.getAdditionLevelRule()); 
            pushFollow(FOLLOW_ruleAdditionLevel_in_entryRuleAdditionLevel1141);
            ruleAdditionLevel();

            state._fsp--;

             after(grammarAccess.getAdditionLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionLevel1148); 

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
    // $ANTLR end "entryRuleAdditionLevel"


    // $ANTLR start "ruleAdditionLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:573:1: ruleAdditionLevel : ( ( rule__AdditionLevel__Group__0 ) ) ;
    public final void ruleAdditionLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:577:2: ( ( ( rule__AdditionLevel__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:578:1: ( ( rule__AdditionLevel__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:578:1: ( ( rule__AdditionLevel__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:579:1: ( rule__AdditionLevel__Group__0 )
            {
             before(grammarAccess.getAdditionLevelAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:580:1: ( rule__AdditionLevel__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:580:2: rule__AdditionLevel__Group__0
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group__0_in_ruleAdditionLevel1174);
            rule__AdditionLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionLevel"


    // $ANTLR start "entryRuleMultiplicationLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:592:1: entryRuleMultiplicationLevel : ruleMultiplicationLevel EOF ;
    public final void entryRuleMultiplicationLevel() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:593:1: ( ruleMultiplicationLevel EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:594:1: ruleMultiplicationLevel EOF
            {
             before(grammarAccess.getMultiplicationLevelRule()); 
            pushFollow(FOLLOW_ruleMultiplicationLevel_in_entryRuleMultiplicationLevel1201);
            ruleMultiplicationLevel();

            state._fsp--;

             after(grammarAccess.getMultiplicationLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationLevel1208); 

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
    // $ANTLR end "entryRuleMultiplicationLevel"


    // $ANTLR start "ruleMultiplicationLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:601:1: ruleMultiplicationLevel : ( ( rule__MultiplicationLevel__Group__0 ) ) ;
    public final void ruleMultiplicationLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:605:2: ( ( ( rule__MultiplicationLevel__Group__0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:606:1: ( ( rule__MultiplicationLevel__Group__0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:606:1: ( ( rule__MultiplicationLevel__Group__0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:607:1: ( rule__MultiplicationLevel__Group__0 )
            {
             before(grammarAccess.getMultiplicationLevelAccess().getGroup()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:608:1: ( rule__MultiplicationLevel__Group__0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:608:2: rule__MultiplicationLevel__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group__0_in_ruleMultiplicationLevel1234);
            rule__MultiplicationLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationLevel"


    // $ANTLR start "entryRulePrefixOpLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:620:1: entryRulePrefixOpLevel : rulePrefixOpLevel EOF ;
    public final void entryRulePrefixOpLevel() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:621:1: ( rulePrefixOpLevel EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:622:1: rulePrefixOpLevel EOF
            {
             before(grammarAccess.getPrefixOpLevelRule()); 
            pushFollow(FOLLOW_rulePrefixOpLevel_in_entryRulePrefixOpLevel1261);
            rulePrefixOpLevel();

            state._fsp--;

             after(grammarAccess.getPrefixOpLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixOpLevel1268); 

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
    // $ANTLR end "entryRulePrefixOpLevel"


    // $ANTLR start "rulePrefixOpLevel"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:629:1: rulePrefixOpLevel : ( ( rule__PrefixOpLevel__Alternatives ) ) ;
    public final void rulePrefixOpLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:633:2: ( ( ( rule__PrefixOpLevel__Alternatives ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:634:1: ( ( rule__PrefixOpLevel__Alternatives ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:634:1: ( ( rule__PrefixOpLevel__Alternatives ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:635:1: ( rule__PrefixOpLevel__Alternatives )
            {
             before(grammarAccess.getPrefixOpLevelAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:636:1: ( rule__PrefixOpLevel__Alternatives )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:636:2: rule__PrefixOpLevel__Alternatives
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__Alternatives_in_rulePrefixOpLevel1294);
            rule__PrefixOpLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrefixOpLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixOpLevel"


    // $ANTLR start "entryRuleAtomic"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:648:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:649:1: ( ruleAtomic EOF )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:650:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1321);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1328); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:657:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:661:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:662:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:662:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:663:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:664:1: ( rule__Atomic__Alternatives )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:664:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1354);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__Model__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:676:1: rule__Model__Alternatives : ( ( ( rule__Model__EntitiesAssignment_0 ) ) | ( ( rule__Model__FormsAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:680:1: ( ( ( rule__Model__EntitiesAssignment_0 ) ) | ( ( rule__Model__FormsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:681:1: ( ( rule__Model__EntitiesAssignment_0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:681:1: ( ( rule__Model__EntitiesAssignment_0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:682:1: ( rule__Model__EntitiesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:683:1: ( rule__Model__EntitiesAssignment_0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:683:2: rule__Model__EntitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_0_in_rule__Model__Alternatives1390);
                    rule__Model__EntitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:687:6: ( ( rule__Model__FormsAssignment_1 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:687:6: ( ( rule__Model__FormsAssignment_1 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:688:1: ( rule__Model__FormsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getFormsAssignment_1()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:689:1: ( rule__Model__FormsAssignment_1 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:689:2: rule__Model__FormsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__FormsAssignment_1_in_rule__Model__Alternatives1408);
                    rule__Model__FormsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFormsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Widget__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:698:1: rule__Widget__Alternatives : ( ( ruleTextWidget ) | ( ruleCheckBoxWidget ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:702:1: ( ( ruleTextWidget ) | ( ruleCheckBoxWidget ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:703:1: ( ruleTextWidget )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:703:1: ( ruleTextWidget )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:704:1: ruleTextWidget
                    {
                     before(grammarAccess.getWidgetAccess().getTextWidgetParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTextWidget_in_rule__Widget__Alternatives1441);
                    ruleTextWidget();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getTextWidgetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:709:6: ( ruleCheckBoxWidget )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:709:6: ( ruleCheckBoxWidget )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:710:1: ruleCheckBoxWidget
                    {
                     before(grammarAccess.getWidgetAccess().getCheckBoxWidgetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCheckBoxWidget_in_rule__Widget__Alternatives1458);
                    ruleCheckBoxWidget();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCheckBoxWidgetParserRuleCall_1()); 

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
    // $ANTLR end "rule__Widget__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:720:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleDerivedAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:724:1: ( ( ruleSimpleAttribute ) | ( ruleDerivedAttribute ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:725:1: ( ruleSimpleAttribute )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:725:1: ( ruleSimpleAttribute )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:726:1: ruleSimpleAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives1490);
                    ruleSimpleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:731:6: ( ruleDerivedAttribute )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:731:6: ( ruleDerivedAttribute )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:732:1: ruleDerivedAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getDerivedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDerivedAttribute_in_rule__Attribute__Alternatives1507);
                    ruleDerivedAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getDerivedAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:742:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleEntityType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:746:1: ( ( rulePrimitiveType ) | ( ruleEntityType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=27 && LA5_0<=30)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:747:1: ( rulePrimitiveType )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:747:1: ( rulePrimitiveType )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:748:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1539);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:753:6: ( ruleEntityType )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:753:6: ( ruleEntityType )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:754:1: ruleEntityType
                    {
                     before(grammarAccess.getTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__Type__Alternatives1556);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:764:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleFloatType ) | ( ruleBooleanType ) | ( ruleStringType ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:768:1: ( ( ruleIntType ) | ( ruleFloatType ) | ( ruleBooleanType ) | ( ruleStringType ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:769:1: ( ruleIntType )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:769:1: ( ruleIntType )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:770:1: ruleIntType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1588);
                    ruleIntType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:775:6: ( ruleFloatType )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:775:6: ( ruleFloatType )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:776:1: ruleFloatType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1605);
                    ruleFloatType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:781:6: ( ruleBooleanType )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:781:6: ( ruleBooleanType )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:782:1: ruleBooleanType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__PrimitiveType__Alternatives1622);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:787:6: ( ruleStringType )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:787:6: ( ruleStringType )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:788:1: ruleStringType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__PrimitiveType__Alternatives1639);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__ComparisonLevel__Alternatives_1_0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:798:1: rule__ComparisonLevel__Alternatives_1_0 : ( ( ( rule__ComparisonLevel__Group_1_0_0__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_1__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_2__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_3__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_4__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_5__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_6__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_7__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_8__0 ) ) );
    public final void rule__ComparisonLevel__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:802:1: ( ( ( rule__ComparisonLevel__Group_1_0_0__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_1__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_2__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_3__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_4__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_5__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_6__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_7__0 ) ) | ( ( rule__ComparisonLevel__Group_1_0_8__0 ) ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 35:
                {
                alt7=5;
                }
                break;
            case 36:
                {
                alt7=6;
                }
                break;
            case 37:
                {
                alt7=7;
                }
                break;
            case 38:
                {
                alt7=8;
                }
                break;
            case 39:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:803:1: ( ( rule__ComparisonLevel__Group_1_0_0__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:803:1: ( ( rule__ComparisonLevel__Group_1_0_0__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:804:1: ( rule__ComparisonLevel__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_0()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:805:1: ( rule__ComparisonLevel__Group_1_0_0__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:805:2: rule__ComparisonLevel__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_0__0_in_rule__ComparisonLevel__Alternatives_1_01671);
                    rule__ComparisonLevel__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:809:6: ( ( rule__ComparisonLevel__Group_1_0_1__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:809:6: ( ( rule__ComparisonLevel__Group_1_0_1__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:810:1: ( rule__ComparisonLevel__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_1()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:811:1: ( rule__ComparisonLevel__Group_1_0_1__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:811:2: rule__ComparisonLevel__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_1__0_in_rule__ComparisonLevel__Alternatives_1_01689);
                    rule__ComparisonLevel__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:815:6: ( ( rule__ComparisonLevel__Group_1_0_2__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:815:6: ( ( rule__ComparisonLevel__Group_1_0_2__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:816:1: ( rule__ComparisonLevel__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_2()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:817:1: ( rule__ComparisonLevel__Group_1_0_2__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:817:2: rule__ComparisonLevel__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_2__0_in_rule__ComparisonLevel__Alternatives_1_01707);
                    rule__ComparisonLevel__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:821:6: ( ( rule__ComparisonLevel__Group_1_0_3__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:821:6: ( ( rule__ComparisonLevel__Group_1_0_3__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:822:1: ( rule__ComparisonLevel__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_3()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:823:1: ( rule__ComparisonLevel__Group_1_0_3__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:823:2: rule__ComparisonLevel__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_3__0_in_rule__ComparisonLevel__Alternatives_1_01725);
                    rule__ComparisonLevel__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:827:6: ( ( rule__ComparisonLevel__Group_1_0_4__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:827:6: ( ( rule__ComparisonLevel__Group_1_0_4__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:828:1: ( rule__ComparisonLevel__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_4()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:829:1: ( rule__ComparisonLevel__Group_1_0_4__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:829:2: rule__ComparisonLevel__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_4__0_in_rule__ComparisonLevel__Alternatives_1_01743);
                    rule__ComparisonLevel__Group_1_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:833:6: ( ( rule__ComparisonLevel__Group_1_0_5__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:833:6: ( ( rule__ComparisonLevel__Group_1_0_5__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:834:1: ( rule__ComparisonLevel__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_5()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:835:1: ( rule__ComparisonLevel__Group_1_0_5__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:835:2: rule__ComparisonLevel__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_5__0_in_rule__ComparisonLevel__Alternatives_1_01761);
                    rule__ComparisonLevel__Group_1_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:839:6: ( ( rule__ComparisonLevel__Group_1_0_6__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:839:6: ( ( rule__ComparisonLevel__Group_1_0_6__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:840:1: ( rule__ComparisonLevel__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_6()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:841:1: ( rule__ComparisonLevel__Group_1_0_6__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:841:2: rule__ComparisonLevel__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_6__0_in_rule__ComparisonLevel__Alternatives_1_01779);
                    rule__ComparisonLevel__Group_1_0_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:845:6: ( ( rule__ComparisonLevel__Group_1_0_7__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:845:6: ( ( rule__ComparisonLevel__Group_1_0_7__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:846:1: ( rule__ComparisonLevel__Group_1_0_7__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_7()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:847:1: ( rule__ComparisonLevel__Group_1_0_7__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:847:2: rule__ComparisonLevel__Group_1_0_7__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_7__0_in_rule__ComparisonLevel__Alternatives_1_01797);
                    rule__ComparisonLevel__Group_1_0_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:851:6: ( ( rule__ComparisonLevel__Group_1_0_8__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:851:6: ( ( rule__ComparisonLevel__Group_1_0_8__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:852:1: ( rule__ComparisonLevel__Group_1_0_8__0 )
                    {
                     before(grammarAccess.getComparisonLevelAccess().getGroup_1_0_8()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:853:1: ( rule__ComparisonLevel__Group_1_0_8__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:853:2: rule__ComparisonLevel__Group_1_0_8__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_8__0_in_rule__ComparisonLevel__Alternatives_1_01815);
                    rule__ComparisonLevel__Group_1_0_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonLevelAccess().getGroup_1_0_8()); 

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
    // $ANTLR end "rule__ComparisonLevel__Alternatives_1_0"


    // $ANTLR start "rule__AdditionLevel__Alternatives_1_0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:862:1: rule__AdditionLevel__Alternatives_1_0 : ( ( ( rule__AdditionLevel__Group_1_0_0__0 ) ) | ( ( rule__AdditionLevel__Group_1_0_1__0 ) ) );
    public final void rule__AdditionLevel__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:866:1: ( ( ( rule__AdditionLevel__Group_1_0_0__0 ) ) | ( ( rule__AdditionLevel__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( (LA8_0==41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:867:1: ( ( rule__AdditionLevel__Group_1_0_0__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:867:1: ( ( rule__AdditionLevel__Group_1_0_0__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:868:1: ( rule__AdditionLevel__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionLevelAccess().getGroup_1_0_0()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:869:1: ( rule__AdditionLevel__Group_1_0_0__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:869:2: rule__AdditionLevel__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_0__0_in_rule__AdditionLevel__Alternatives_1_01848);
                    rule__AdditionLevel__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionLevelAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:873:6: ( ( rule__AdditionLevel__Group_1_0_1__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:873:6: ( ( rule__AdditionLevel__Group_1_0_1__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:874:1: ( rule__AdditionLevel__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionLevelAccess().getGroup_1_0_1()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:875:1: ( rule__AdditionLevel__Group_1_0_1__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:875:2: rule__AdditionLevel__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_1__0_in_rule__AdditionLevel__Alternatives_1_01866);
                    rule__AdditionLevel__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionLevelAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__AdditionLevel__Alternatives_1_0"


    // $ANTLR start "rule__MultiplicationLevel__Alternatives_1_0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:884:1: rule__MultiplicationLevel__Alternatives_1_0 : ( ( ( rule__MultiplicationLevel__Group_1_0_0__0 ) ) | ( ( rule__MultiplicationLevel__Group_1_0_1__0 ) ) );
    public final void rule__MultiplicationLevel__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:888:1: ( ( ( rule__MultiplicationLevel__Group_1_0_0__0 ) ) | ( ( rule__MultiplicationLevel__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:889:1: ( ( rule__MultiplicationLevel__Group_1_0_0__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:889:1: ( ( rule__MultiplicationLevel__Group_1_0_0__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:890:1: ( rule__MultiplicationLevel__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationLevelAccess().getGroup_1_0_0()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:891:1: ( rule__MultiplicationLevel__Group_1_0_0__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:891:2: rule__MultiplicationLevel__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_0__0_in_rule__MultiplicationLevel__Alternatives_1_01899);
                    rule__MultiplicationLevel__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationLevelAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:895:6: ( ( rule__MultiplicationLevel__Group_1_0_1__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:895:6: ( ( rule__MultiplicationLevel__Group_1_0_1__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:896:1: ( rule__MultiplicationLevel__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationLevelAccess().getGroup_1_0_1()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:897:1: ( rule__MultiplicationLevel__Group_1_0_1__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:897:2: rule__MultiplicationLevel__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_1__0_in_rule__MultiplicationLevel__Alternatives_1_01917);
                    rule__MultiplicationLevel__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationLevelAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__MultiplicationLevel__Alternatives_1_0"


    // $ANTLR start "rule__PrefixOpLevel__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:906:1: rule__PrefixOpLevel__Alternatives : ( ( ( rule__PrefixOpLevel__Group_0__0 ) ) | ( ruleAtomic ) );
    public final void rule__PrefixOpLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:910:1: ( ( ( rule__PrefixOpLevel__Group_0__0 ) ) | ( ruleAtomic ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==17||(LA10_0>=44 && LA10_0<=47)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:911:1: ( ( rule__PrefixOpLevel__Group_0__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:911:1: ( ( rule__PrefixOpLevel__Group_0__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:912:1: ( rule__PrefixOpLevel__Group_0__0 )
                    {
                     before(grammarAccess.getPrefixOpLevelAccess().getGroup_0()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:913:1: ( rule__PrefixOpLevel__Group_0__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:913:2: rule__PrefixOpLevel__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__0_in_rule__PrefixOpLevel__Alternatives1950);
                    rule__PrefixOpLevel__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrefixOpLevelAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:917:6: ( ruleAtomic )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:917:6: ( ruleAtomic )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:918:1: ruleAtomic
                    {
                     before(grammarAccess.getPrefixOpLevelAccess().getAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__PrefixOpLevel__Alternatives1968);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrefixOpLevelAccess().getAtomicParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrefixOpLevel__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:928:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:932:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 45:
                {
                alt11=2;
                }
                break;
            case 46:
                {
                alt11=3;
                }
                break;
            case 47:
                {
                alt11=4;
                }
                break;
            case 17:
                {
                alt11=5;
                }
                break;
            case RULE_DECIMAL_NUMBER:
                {
                alt11=6;
                }
                break;
            case RULE_STRING:
                {
                alt11=7;
                }
                break;
            case RULE_ID:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:933:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:933:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:934:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:935:1: ( rule__Atomic__Group_0__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:935:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2000);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:939:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:939:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:940:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:941:1: ( rule__Atomic__Group_1__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:941:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2018);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:945:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:945:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:946:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:947:1: ( rule__Atomic__Group_2__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:947:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2036);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:951:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:951:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:952:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:953:1: ( rule__Atomic__Group_3__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:953:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2054);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:957:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:957:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:958:1: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:959:1: ( rule__Atomic__Group_4__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:959:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives2072);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:963:6: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:963:6: ( ( rule__Atomic__Group_5__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:964:1: ( rule__Atomic__Group_5__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:965:1: ( rule__Atomic__Group_5__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:965:2: rule__Atomic__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_5__0_in_rule__Atomic__Alternatives2090);
                    rule__Atomic__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:969:6: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:969:6: ( ( rule__Atomic__Group_6__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:970:1: ( rule__Atomic__Group_6__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:971:1: ( rule__Atomic__Group_6__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:971:2: rule__Atomic__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_6__0_in_rule__Atomic__Alternatives2108);
                    rule__Atomic__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:975:6: ( ( rule__Atomic__Group_7__0 ) )
                    {
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:975:6: ( ( rule__Atomic__Group_7__0 ) )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:976:1: ( rule__Atomic__Group_7__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_7()); 
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:977:1: ( rule__Atomic__Group_7__0 )
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:977:2: rule__Atomic__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_7__0_in_rule__Atomic__Alternatives2126);
                    rule__Atomic__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Form__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:988:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:992:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:993:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__02157);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__1_in_rule__Form__Group__02160);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1000:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1004:1: ( ( 'form' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1005:1: ( 'form' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1005:1: ( 'form' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1006:1: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Form__Group__0__Impl2188); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1019:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1023:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1024:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__12219);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__2_in_rule__Form__Group__12222);
            rule__Form__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1031:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1035:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1036:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1036:1: ( ( rule__Form__NameAssignment_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1037:1: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1038:1: ( rule__Form__NameAssignment_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1038:2: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Form__NameAssignment_1_in_rule__Form__Group__1__Impl2249);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1048:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1052:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1053:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__22279);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__3_in_rule__Form__Group__22282);
            rule__Form__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1060:1: rule__Form__Group__2__Impl : ( 'edits' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1064:1: ( ( 'edits' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1065:1: ( 'edits' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1065:1: ( 'edits' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1066:1: 'edits'
            {
             before(grammarAccess.getFormAccess().getEditsKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Form__Group__2__Impl2310); 
             after(grammarAccess.getFormAccess().getEditsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1079:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1083:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1084:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__32341);
            rule__Form__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__4_in_rule__Form__Group__32344);
            rule__Form__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1091:1: rule__Form__Group__3__Impl : ( ( rule__Form__EntityAssignment_3 ) ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1095:1: ( ( ( rule__Form__EntityAssignment_3 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1096:1: ( ( rule__Form__EntityAssignment_3 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1096:1: ( ( rule__Form__EntityAssignment_3 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1097:1: ( rule__Form__EntityAssignment_3 )
            {
             before(grammarAccess.getFormAccess().getEntityAssignment_3()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1098:1: ( rule__Form__EntityAssignment_3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1098:2: rule__Form__EntityAssignment_3
            {
            pushFollow(FOLLOW_rule__Form__EntityAssignment_3_in_rule__Form__Group__3__Impl2371);
            rule__Form__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1108:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1112:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1113:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__42401);
            rule__Form__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__5_in_rule__Form__Group__42404);
            rule__Form__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1120:1: rule__Form__Group__4__Impl : ( '{' ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1124:1: ( ( '{' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1125:1: ( '{' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1125:1: ( '{' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1126:1: '{'
            {
             before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Form__Group__4__Impl2432); 
             after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1139:1: rule__Form__Group__5 : rule__Form__Group__5__Impl rule__Form__Group__6 ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1143:1: ( rule__Form__Group__5__Impl rule__Form__Group__6 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1144:2: rule__Form__Group__5__Impl rule__Form__Group__6
            {
            pushFollow(FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__52463);
            rule__Form__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__6_in_rule__Form__Group__52466);
            rule__Form__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1151:1: rule__Form__Group__5__Impl : ( ( rule__Form__WidgetsAssignment_5 )* ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1155:1: ( ( ( rule__Form__WidgetsAssignment_5 )* ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1156:1: ( ( rule__Form__WidgetsAssignment_5 )* )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1156:1: ( ( rule__Form__WidgetsAssignment_5 )* )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1157:1: ( rule__Form__WidgetsAssignment_5 )*
            {
             before(grammarAccess.getFormAccess().getWidgetsAssignment_5()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1158:1: ( rule__Form__WidgetsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16||LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1158:2: rule__Form__WidgetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Form__WidgetsAssignment_5_in_rule__Form__Group__5__Impl2493);
            	    rule__Form__WidgetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getWidgetsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__Form__Group__6"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1168:1: rule__Form__Group__6 : rule__Form__Group__6__Impl ;
    public final void rule__Form__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1172:1: ( rule__Form__Group__6__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1173:2: rule__Form__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__62524);
            rule__Form__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__6"


    // $ANTLR start "rule__Form__Group__6__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1179:1: rule__Form__Group__6__Impl : ( '}' ) ;
    public final void rule__Form__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1183:1: ( ( '}' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1184:1: ( '}' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1184:1: ( '}' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1185:1: '}'
            {
             before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Form__Group__6__Impl2552); 
             after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__6__Impl"


    // $ANTLR start "rule__TextWidget__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1212:1: rule__TextWidget__Group__0 : rule__TextWidget__Group__0__Impl rule__TextWidget__Group__1 ;
    public final void rule__TextWidget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1216:1: ( rule__TextWidget__Group__0__Impl rule__TextWidget__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1217:2: rule__TextWidget__Group__0__Impl rule__TextWidget__Group__1
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__0__Impl_in_rule__TextWidget__Group__02597);
            rule__TextWidget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__1_in_rule__TextWidget__Group__02600);
            rule__TextWidget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__0"


    // $ANTLR start "rule__TextWidget__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1224:1: rule__TextWidget__Group__0__Impl : ( 'text' ) ;
    public final void rule__TextWidget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1228:1: ( ( 'text' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1229:1: ( 'text' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1229:1: ( 'text' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1230:1: 'text'
            {
             before(grammarAccess.getTextWidgetAccess().getTextKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__TextWidget__Group__0__Impl2628); 
             after(grammarAccess.getTextWidgetAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__0__Impl"


    // $ANTLR start "rule__TextWidget__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1243:1: rule__TextWidget__Group__1 : rule__TextWidget__Group__1__Impl rule__TextWidget__Group__2 ;
    public final void rule__TextWidget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1247:1: ( rule__TextWidget__Group__1__Impl rule__TextWidget__Group__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1248:2: rule__TextWidget__Group__1__Impl rule__TextWidget__Group__2
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__1__Impl_in_rule__TextWidget__Group__12659);
            rule__TextWidget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__2_in_rule__TextWidget__Group__12662);
            rule__TextWidget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__1"


    // $ANTLR start "rule__TextWidget__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1255:1: rule__TextWidget__Group__1__Impl : ( '(' ) ;
    public final void rule__TextWidget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1259:1: ( ( '(' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1260:1: ( '(' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1260:1: ( '(' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1261:1: '('
            {
             before(grammarAccess.getTextWidgetAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__TextWidget__Group__1__Impl2690); 
             after(grammarAccess.getTextWidgetAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__1__Impl"


    // $ANTLR start "rule__TextWidget__Group__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1274:1: rule__TextWidget__Group__2 : rule__TextWidget__Group__2__Impl rule__TextWidget__Group__3 ;
    public final void rule__TextWidget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1278:1: ( rule__TextWidget__Group__2__Impl rule__TextWidget__Group__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1279:2: rule__TextWidget__Group__2__Impl rule__TextWidget__Group__3
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__2__Impl_in_rule__TextWidget__Group__22721);
            rule__TextWidget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__3_in_rule__TextWidget__Group__22724);
            rule__TextWidget__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__2"


    // $ANTLR start "rule__TextWidget__Group__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1286:1: rule__TextWidget__Group__2__Impl : ( ( rule__TextWidget__LengthAssignment_2 ) ) ;
    public final void rule__TextWidget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1290:1: ( ( ( rule__TextWidget__LengthAssignment_2 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1291:1: ( ( rule__TextWidget__LengthAssignment_2 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1291:1: ( ( rule__TextWidget__LengthAssignment_2 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1292:1: ( rule__TextWidget__LengthAssignment_2 )
            {
             before(grammarAccess.getTextWidgetAccess().getLengthAssignment_2()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1293:1: ( rule__TextWidget__LengthAssignment_2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1293:2: rule__TextWidget__LengthAssignment_2
            {
            pushFollow(FOLLOW_rule__TextWidget__LengthAssignment_2_in_rule__TextWidget__Group__2__Impl2751);
            rule__TextWidget__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextWidgetAccess().getLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__2__Impl"


    // $ANTLR start "rule__TextWidget__Group__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1303:1: rule__TextWidget__Group__3 : rule__TextWidget__Group__3__Impl rule__TextWidget__Group__4 ;
    public final void rule__TextWidget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1307:1: ( rule__TextWidget__Group__3__Impl rule__TextWidget__Group__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1308:2: rule__TextWidget__Group__3__Impl rule__TextWidget__Group__4
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__3__Impl_in_rule__TextWidget__Group__32781);
            rule__TextWidget__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__4_in_rule__TextWidget__Group__32784);
            rule__TextWidget__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__3"


    // $ANTLR start "rule__TextWidget__Group__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1315:1: rule__TextWidget__Group__3__Impl : ( ')' ) ;
    public final void rule__TextWidget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1319:1: ( ( ')' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1320:1: ( ')' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1320:1: ( ')' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1321:1: ')'
            {
             before(grammarAccess.getTextWidgetAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__TextWidget__Group__3__Impl2812); 
             after(grammarAccess.getTextWidgetAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__3__Impl"


    // $ANTLR start "rule__TextWidget__Group__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1334:1: rule__TextWidget__Group__4 : rule__TextWidget__Group__4__Impl rule__TextWidget__Group__5 ;
    public final void rule__TextWidget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1338:1: ( rule__TextWidget__Group__4__Impl rule__TextWidget__Group__5 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1339:2: rule__TextWidget__Group__4__Impl rule__TextWidget__Group__5
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__4__Impl_in_rule__TextWidget__Group__42843);
            rule__TextWidget__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__5_in_rule__TextWidget__Group__42846);
            rule__TextWidget__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__4"


    // $ANTLR start "rule__TextWidget__Group__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1346:1: rule__TextWidget__Group__4__Impl : ( '->' ) ;
    public final void rule__TextWidget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1350:1: ( ( '->' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1351:1: ( '->' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1351:1: ( '->' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1352:1: '->'
            {
             before(grammarAccess.getTextWidgetAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__TextWidget__Group__4__Impl2874); 
             after(grammarAccess.getTextWidgetAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__4__Impl"


    // $ANTLR start "rule__TextWidget__Group__5"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1365:1: rule__TextWidget__Group__5 : rule__TextWidget__Group__5__Impl rule__TextWidget__Group__6 ;
    public final void rule__TextWidget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1369:1: ( rule__TextWidget__Group__5__Impl rule__TextWidget__Group__6 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1370:2: rule__TextWidget__Group__5__Impl rule__TextWidget__Group__6
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__5__Impl_in_rule__TextWidget__Group__52905);
            rule__TextWidget__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__6_in_rule__TextWidget__Group__52908);
            rule__TextWidget__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__5"


    // $ANTLR start "rule__TextWidget__Group__5__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1377:1: rule__TextWidget__Group__5__Impl : ( ( rule__TextWidget__AttrAssignment_5 ) ) ;
    public final void rule__TextWidget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1381:1: ( ( ( rule__TextWidget__AttrAssignment_5 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1382:1: ( ( rule__TextWidget__AttrAssignment_5 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1382:1: ( ( rule__TextWidget__AttrAssignment_5 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1383:1: ( rule__TextWidget__AttrAssignment_5 )
            {
             before(grammarAccess.getTextWidgetAccess().getAttrAssignment_5()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1384:1: ( rule__TextWidget__AttrAssignment_5 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1384:2: rule__TextWidget__AttrAssignment_5
            {
            pushFollow(FOLLOW_rule__TextWidget__AttrAssignment_5_in_rule__TextWidget__Group__5__Impl2935);
            rule__TextWidget__AttrAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTextWidgetAccess().getAttrAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__5__Impl"


    // $ANTLR start "rule__TextWidget__Group__6"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1394:1: rule__TextWidget__Group__6 : rule__TextWidget__Group__6__Impl rule__TextWidget__Group__7 ;
    public final void rule__TextWidget__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1398:1: ( rule__TextWidget__Group__6__Impl rule__TextWidget__Group__7 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1399:2: rule__TextWidget__Group__6__Impl rule__TextWidget__Group__7
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__6__Impl_in_rule__TextWidget__Group__62965);
            rule__TextWidget__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group__7_in_rule__TextWidget__Group__62968);
            rule__TextWidget__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__6"


    // $ANTLR start "rule__TextWidget__Group__6__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1406:1: rule__TextWidget__Group__6__Impl : ( ( rule__TextWidget__Group_6__0 )? ) ;
    public final void rule__TextWidget__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1410:1: ( ( ( rule__TextWidget__Group_6__0 )? ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1411:1: ( ( rule__TextWidget__Group_6__0 )? )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1411:1: ( ( rule__TextWidget__Group_6__0 )? )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1412:1: ( rule__TextWidget__Group_6__0 )?
            {
             before(grammarAccess.getTextWidgetAccess().getGroup_6()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1413:1: ( rule__TextWidget__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1413:2: rule__TextWidget__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TextWidget__Group_6__0_in_rule__TextWidget__Group__6__Impl2995);
                    rule__TextWidget__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextWidgetAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__6__Impl"


    // $ANTLR start "rule__TextWidget__Group__7"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1423:1: rule__TextWidget__Group__7 : rule__TextWidget__Group__7__Impl ;
    public final void rule__TextWidget__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1427:1: ( rule__TextWidget__Group__7__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1428:2: rule__TextWidget__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TextWidget__Group__7__Impl_in_rule__TextWidget__Group__73026);
            rule__TextWidget__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__7"


    // $ANTLR start "rule__TextWidget__Group__7__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1434:1: rule__TextWidget__Group__7__Impl : ( ';' ) ;
    public final void rule__TextWidget__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1438:1: ( ( ';' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1439:1: ( ';' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1439:1: ( ';' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1440:1: ';'
            {
             before(grammarAccess.getTextWidgetAccess().getSemicolonKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__TextWidget__Group__7__Impl3054); 
             after(grammarAccess.getTextWidgetAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group__7__Impl"


    // $ANTLR start "rule__TextWidget__Group_6__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1469:1: rule__TextWidget__Group_6__0 : rule__TextWidget__Group_6__0__Impl rule__TextWidget__Group_6__1 ;
    public final void rule__TextWidget__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1473:1: ( rule__TextWidget__Group_6__0__Impl rule__TextWidget__Group_6__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1474:2: rule__TextWidget__Group_6__0__Impl rule__TextWidget__Group_6__1
            {
            pushFollow(FOLLOW_rule__TextWidget__Group_6__0__Impl_in_rule__TextWidget__Group_6__03101);
            rule__TextWidget__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextWidget__Group_6__1_in_rule__TextWidget__Group_6__03104);
            rule__TextWidget__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group_6__0"


    // $ANTLR start "rule__TextWidget__Group_6__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1481:1: rule__TextWidget__Group_6__0__Impl : ( 'validate' ) ;
    public final void rule__TextWidget__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1485:1: ( ( 'validate' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1486:1: ( 'validate' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1486:1: ( 'validate' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1487:1: 'validate'
            {
             before(grammarAccess.getTextWidgetAccess().getValidateKeyword_6_0()); 
            match(input,21,FOLLOW_21_in_rule__TextWidget__Group_6__0__Impl3132); 
             after(grammarAccess.getTextWidgetAccess().getValidateKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group_6__0__Impl"


    // $ANTLR start "rule__TextWidget__Group_6__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1500:1: rule__TextWidget__Group_6__1 : rule__TextWidget__Group_6__1__Impl ;
    public final void rule__TextWidget__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1504:1: ( rule__TextWidget__Group_6__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1505:2: rule__TextWidget__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__TextWidget__Group_6__1__Impl_in_rule__TextWidget__Group_6__13163);
            rule__TextWidget__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group_6__1"


    // $ANTLR start "rule__TextWidget__Group_6__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1511:1: rule__TextWidget__Group_6__1__Impl : ( ( rule__TextWidget__ValidateAssignment_6_1 ) ) ;
    public final void rule__TextWidget__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1515:1: ( ( ( rule__TextWidget__ValidateAssignment_6_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1516:1: ( ( rule__TextWidget__ValidateAssignment_6_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1516:1: ( ( rule__TextWidget__ValidateAssignment_6_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1517:1: ( rule__TextWidget__ValidateAssignment_6_1 )
            {
             before(grammarAccess.getTextWidgetAccess().getValidateAssignment_6_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1518:1: ( rule__TextWidget__ValidateAssignment_6_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1518:2: rule__TextWidget__ValidateAssignment_6_1
            {
            pushFollow(FOLLOW_rule__TextWidget__ValidateAssignment_6_1_in_rule__TextWidget__Group_6__1__Impl3190);
            rule__TextWidget__ValidateAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextWidgetAccess().getValidateAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__Group_6__1__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1532:1: rule__CheckBoxWidget__Group__0 : rule__CheckBoxWidget__Group__0__Impl rule__CheckBoxWidget__Group__1 ;
    public final void rule__CheckBoxWidget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1536:1: ( rule__CheckBoxWidget__Group__0__Impl rule__CheckBoxWidget__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1537:2: rule__CheckBoxWidget__Group__0__Impl rule__CheckBoxWidget__Group__1
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__0__Impl_in_rule__CheckBoxWidget__Group__03224);
            rule__CheckBoxWidget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__1_in_rule__CheckBoxWidget__Group__03227);
            rule__CheckBoxWidget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__0"


    // $ANTLR start "rule__CheckBoxWidget__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1544:1: rule__CheckBoxWidget__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__CheckBoxWidget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1548:1: ( ( 'checkbox' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1549:1: ( 'checkbox' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1549:1: ( 'checkbox' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1550:1: 'checkbox'
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getCheckboxKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__CheckBoxWidget__Group__0__Impl3255); 
             after(grammarAccess.getCheckBoxWidgetAccess().getCheckboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__0__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1563:1: rule__CheckBoxWidget__Group__1 : rule__CheckBoxWidget__Group__1__Impl rule__CheckBoxWidget__Group__2 ;
    public final void rule__CheckBoxWidget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1567:1: ( rule__CheckBoxWidget__Group__1__Impl rule__CheckBoxWidget__Group__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1568:2: rule__CheckBoxWidget__Group__1__Impl rule__CheckBoxWidget__Group__2
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__1__Impl_in_rule__CheckBoxWidget__Group__13286);
            rule__CheckBoxWidget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__2_in_rule__CheckBoxWidget__Group__13289);
            rule__CheckBoxWidget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__1"


    // $ANTLR start "rule__CheckBoxWidget__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1575:1: rule__CheckBoxWidget__Group__1__Impl : ( '->' ) ;
    public final void rule__CheckBoxWidget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1579:1: ( ( '->' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1580:1: ( '->' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1580:1: ( '->' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1581:1: '->'
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__CheckBoxWidget__Group__1__Impl3317); 
             after(grammarAccess.getCheckBoxWidgetAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__1__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1594:1: rule__CheckBoxWidget__Group__2 : rule__CheckBoxWidget__Group__2__Impl rule__CheckBoxWidget__Group__3 ;
    public final void rule__CheckBoxWidget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1598:1: ( rule__CheckBoxWidget__Group__2__Impl rule__CheckBoxWidget__Group__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1599:2: rule__CheckBoxWidget__Group__2__Impl rule__CheckBoxWidget__Group__3
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__2__Impl_in_rule__CheckBoxWidget__Group__23348);
            rule__CheckBoxWidget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__3_in_rule__CheckBoxWidget__Group__23351);
            rule__CheckBoxWidget__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__2"


    // $ANTLR start "rule__CheckBoxWidget__Group__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1606:1: rule__CheckBoxWidget__Group__2__Impl : ( ( rule__CheckBoxWidget__AttrAssignment_2 ) ) ;
    public final void rule__CheckBoxWidget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1610:1: ( ( ( rule__CheckBoxWidget__AttrAssignment_2 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1611:1: ( ( rule__CheckBoxWidget__AttrAssignment_2 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1611:1: ( ( rule__CheckBoxWidget__AttrAssignment_2 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1612:1: ( rule__CheckBoxWidget__AttrAssignment_2 )
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getAttrAssignment_2()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1613:1: ( rule__CheckBoxWidget__AttrAssignment_2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1613:2: rule__CheckBoxWidget__AttrAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__AttrAssignment_2_in_rule__CheckBoxWidget__Group__2__Impl3378);
            rule__CheckBoxWidget__AttrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxWidgetAccess().getAttrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__2__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1623:1: rule__CheckBoxWidget__Group__3 : rule__CheckBoxWidget__Group__3__Impl rule__CheckBoxWidget__Group__4 ;
    public final void rule__CheckBoxWidget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1627:1: ( rule__CheckBoxWidget__Group__3__Impl rule__CheckBoxWidget__Group__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1628:2: rule__CheckBoxWidget__Group__3__Impl rule__CheckBoxWidget__Group__4
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__3__Impl_in_rule__CheckBoxWidget__Group__33408);
            rule__CheckBoxWidget__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__4_in_rule__CheckBoxWidget__Group__33411);
            rule__CheckBoxWidget__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__3"


    // $ANTLR start "rule__CheckBoxWidget__Group__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1635:1: rule__CheckBoxWidget__Group__3__Impl : ( ( rule__CheckBoxWidget__Group_3__0 )? ) ;
    public final void rule__CheckBoxWidget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1639:1: ( ( ( rule__CheckBoxWidget__Group_3__0 )? ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1640:1: ( ( rule__CheckBoxWidget__Group_3__0 )? )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1640:1: ( ( rule__CheckBoxWidget__Group_3__0 )? )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1641:1: ( rule__CheckBoxWidget__Group_3__0 )?
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getGroup_3()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1642:1: ( rule__CheckBoxWidget__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1642:2: rule__CheckBoxWidget__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CheckBoxWidget__Group_3__0_in_rule__CheckBoxWidget__Group__3__Impl3438);
                    rule__CheckBoxWidget__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckBoxWidgetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__3__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1652:1: rule__CheckBoxWidget__Group__4 : rule__CheckBoxWidget__Group__4__Impl ;
    public final void rule__CheckBoxWidget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1656:1: ( rule__CheckBoxWidget__Group__4__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1657:2: rule__CheckBoxWidget__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__4__Impl_in_rule__CheckBoxWidget__Group__43469);
            rule__CheckBoxWidget__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__4"


    // $ANTLR start "rule__CheckBoxWidget__Group__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1663:1: rule__CheckBoxWidget__Group__4__Impl : ( ';' ) ;
    public final void rule__CheckBoxWidget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1667:1: ( ( ';' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1668:1: ( ';' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1668:1: ( ';' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1669:1: ';'
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__CheckBoxWidget__Group__4__Impl3497); 
             after(grammarAccess.getCheckBoxWidgetAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__4__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group_3__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1692:1: rule__CheckBoxWidget__Group_3__0 : rule__CheckBoxWidget__Group_3__0__Impl rule__CheckBoxWidget__Group_3__1 ;
    public final void rule__CheckBoxWidget__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1696:1: ( rule__CheckBoxWidget__Group_3__0__Impl rule__CheckBoxWidget__Group_3__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1697:2: rule__CheckBoxWidget__Group_3__0__Impl rule__CheckBoxWidget__Group_3__1
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group_3__0__Impl_in_rule__CheckBoxWidget__Group_3__03538);
            rule__CheckBoxWidget__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBoxWidget__Group_3__1_in_rule__CheckBoxWidget__Group_3__03541);
            rule__CheckBoxWidget__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group_3__0"


    // $ANTLR start "rule__CheckBoxWidget__Group_3__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1704:1: rule__CheckBoxWidget__Group_3__0__Impl : ( 'validate' ) ;
    public final void rule__CheckBoxWidget__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1708:1: ( ( 'validate' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1709:1: ( 'validate' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1709:1: ( 'validate' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1710:1: 'validate'
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getValidateKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__CheckBoxWidget__Group_3__0__Impl3569); 
             after(grammarAccess.getCheckBoxWidgetAccess().getValidateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group_3__0__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group_3__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1723:1: rule__CheckBoxWidget__Group_3__1 : rule__CheckBoxWidget__Group_3__1__Impl ;
    public final void rule__CheckBoxWidget__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1727:1: ( rule__CheckBoxWidget__Group_3__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1728:2: rule__CheckBoxWidget__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group_3__1__Impl_in_rule__CheckBoxWidget__Group_3__13600);
            rule__CheckBoxWidget__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group_3__1"


    // $ANTLR start "rule__CheckBoxWidget__Group_3__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1734:1: rule__CheckBoxWidget__Group_3__1__Impl : ( ( rule__CheckBoxWidget__ValidateAssignment_3_1 ) ) ;
    public final void rule__CheckBoxWidget__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1738:1: ( ( ( rule__CheckBoxWidget__ValidateAssignment_3_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1739:1: ( ( rule__CheckBoxWidget__ValidateAssignment_3_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1739:1: ( ( rule__CheckBoxWidget__ValidateAssignment_3_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1740:1: ( rule__CheckBoxWidget__ValidateAssignment_3_1 )
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getValidateAssignment_3_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1741:1: ( rule__CheckBoxWidget__ValidateAssignment_3_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1741:2: rule__CheckBoxWidget__ValidateAssignment_3_1
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__ValidateAssignment_3_1_in_rule__CheckBoxWidget__Group_3__1__Impl3627);
            rule__CheckBoxWidget__ValidateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxWidgetAccess().getValidateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1755:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1759:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1760:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03661);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03664);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1767:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1771:1: ( ( 'entity' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1772:1: ( 'entity' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1772:1: ( 'entity' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1773:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__0__Impl3692); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1786:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1790:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1791:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13723);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13726);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1798:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1802:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1803:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1803:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1804:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1805:1: ( rule__Entity__NameAssignment_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1805:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3753);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1815:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1819:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1820:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23783);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23786);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1827:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1831:1: ( ( '{' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1832:1: ( '{' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1832:1: ( '{' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1833:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__2__Impl3814); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1846:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1850:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1851:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33845);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33848);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1858:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1862:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1863:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1863:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1864:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1865:1: ( rule__Entity__AttributesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1865:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3875);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1875:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1879:1: ( rule__Entity__Group__4__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1880:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43906);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1886:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1890:1: ( ( '}' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1891:1: ( '}' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1891:1: ( '}' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1892:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__4__Impl3934); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__DerivedAttribute__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1915:1: rule__DerivedAttribute__Group__0 : rule__DerivedAttribute__Group__0__Impl rule__DerivedAttribute__Group__1 ;
    public final void rule__DerivedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1919:1: ( rule__DerivedAttribute__Group__0__Impl rule__DerivedAttribute__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1920:2: rule__DerivedAttribute__Group__0__Impl rule__DerivedAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__Group__0__Impl_in_rule__DerivedAttribute__Group__03975);
            rule__DerivedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DerivedAttribute__Group__1_in_rule__DerivedAttribute__Group__03978);
            rule__DerivedAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__0"


    // $ANTLR start "rule__DerivedAttribute__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1927:1: rule__DerivedAttribute__Group__0__Impl : ( '/' ) ;
    public final void rule__DerivedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1931:1: ( ( '/' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1932:1: ( '/' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1932:1: ( '/' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1933:1: '/'
            {
             before(grammarAccess.getDerivedAttributeAccess().getSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__DerivedAttribute__Group__0__Impl4006); 
             after(grammarAccess.getDerivedAttributeAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__0__Impl"


    // $ANTLR start "rule__DerivedAttribute__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1946:1: rule__DerivedAttribute__Group__1 : rule__DerivedAttribute__Group__1__Impl rule__DerivedAttribute__Group__2 ;
    public final void rule__DerivedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1950:1: ( rule__DerivedAttribute__Group__1__Impl rule__DerivedAttribute__Group__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1951:2: rule__DerivedAttribute__Group__1__Impl rule__DerivedAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__Group__1__Impl_in_rule__DerivedAttribute__Group__14037);
            rule__DerivedAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DerivedAttribute__Group__2_in_rule__DerivedAttribute__Group__14040);
            rule__DerivedAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__1"


    // $ANTLR start "rule__DerivedAttribute__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1958:1: rule__DerivedAttribute__Group__1__Impl : ( ( rule__DerivedAttribute__NameAssignment_1 ) ) ;
    public final void rule__DerivedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1962:1: ( ( ( rule__DerivedAttribute__NameAssignment_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1963:1: ( ( rule__DerivedAttribute__NameAssignment_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1963:1: ( ( rule__DerivedAttribute__NameAssignment_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1964:1: ( rule__DerivedAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getDerivedAttributeAccess().getNameAssignment_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1965:1: ( rule__DerivedAttribute__NameAssignment_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1965:2: rule__DerivedAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__NameAssignment_1_in_rule__DerivedAttribute__Group__1__Impl4067);
            rule__DerivedAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivedAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__1__Impl"


    // $ANTLR start "rule__DerivedAttribute__Group__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1975:1: rule__DerivedAttribute__Group__2 : rule__DerivedAttribute__Group__2__Impl rule__DerivedAttribute__Group__3 ;
    public final void rule__DerivedAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1979:1: ( rule__DerivedAttribute__Group__2__Impl rule__DerivedAttribute__Group__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1980:2: rule__DerivedAttribute__Group__2__Impl rule__DerivedAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__Group__2__Impl_in_rule__DerivedAttribute__Group__24097);
            rule__DerivedAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DerivedAttribute__Group__3_in_rule__DerivedAttribute__Group__24100);
            rule__DerivedAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__2"


    // $ANTLR start "rule__DerivedAttribute__Group__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1987:1: rule__DerivedAttribute__Group__2__Impl : ( '=' ) ;
    public final void rule__DerivedAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1991:1: ( ( '=' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1992:1: ( '=' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1992:1: ( '=' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:1993:1: '='
            {
             before(grammarAccess.getDerivedAttributeAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__DerivedAttribute__Group__2__Impl4128); 
             after(grammarAccess.getDerivedAttributeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__2__Impl"


    // $ANTLR start "rule__DerivedAttribute__Group__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2006:1: rule__DerivedAttribute__Group__3 : rule__DerivedAttribute__Group__3__Impl rule__DerivedAttribute__Group__4 ;
    public final void rule__DerivedAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2010:1: ( rule__DerivedAttribute__Group__3__Impl rule__DerivedAttribute__Group__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2011:2: rule__DerivedAttribute__Group__3__Impl rule__DerivedAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__Group__3__Impl_in_rule__DerivedAttribute__Group__34159);
            rule__DerivedAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DerivedAttribute__Group__4_in_rule__DerivedAttribute__Group__34162);
            rule__DerivedAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__3"


    // $ANTLR start "rule__DerivedAttribute__Group__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2018:1: rule__DerivedAttribute__Group__3__Impl : ( ( rule__DerivedAttribute__ExprAssignment_3 ) ) ;
    public final void rule__DerivedAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2022:1: ( ( ( rule__DerivedAttribute__ExprAssignment_3 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2023:1: ( ( rule__DerivedAttribute__ExprAssignment_3 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2023:1: ( ( rule__DerivedAttribute__ExprAssignment_3 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2024:1: ( rule__DerivedAttribute__ExprAssignment_3 )
            {
             before(grammarAccess.getDerivedAttributeAccess().getExprAssignment_3()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2025:1: ( rule__DerivedAttribute__ExprAssignment_3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2025:2: rule__DerivedAttribute__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__ExprAssignment_3_in_rule__DerivedAttribute__Group__3__Impl4189);
            rule__DerivedAttribute__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDerivedAttributeAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__3__Impl"


    // $ANTLR start "rule__DerivedAttribute__Group__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2035:1: rule__DerivedAttribute__Group__4 : rule__DerivedAttribute__Group__4__Impl ;
    public final void rule__DerivedAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2039:1: ( rule__DerivedAttribute__Group__4__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2040:2: rule__DerivedAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DerivedAttribute__Group__4__Impl_in_rule__DerivedAttribute__Group__44219);
            rule__DerivedAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__4"


    // $ANTLR start "rule__DerivedAttribute__Group__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2046:1: rule__DerivedAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__DerivedAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2050:1: ( ( ';' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2051:1: ( ';' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2051:1: ( ';' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2052:1: ';'
            {
             before(grammarAccess.getDerivedAttributeAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__DerivedAttribute__Group__4__Impl4247); 
             after(grammarAccess.getDerivedAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__Group__4__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2075:1: rule__SimpleAttribute__Group__0 : rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 ;
    public final void rule__SimpleAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2079:1: ( rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2080:2: rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__04288);
            rule__SimpleAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__04291);
            rule__SimpleAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__0"


    // $ANTLR start "rule__SimpleAttribute__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2087:1: rule__SimpleAttribute__Group__0__Impl : ( ( rule__SimpleAttribute__NameAssignment_0 ) ) ;
    public final void rule__SimpleAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2091:1: ( ( ( rule__SimpleAttribute__NameAssignment_0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2092:1: ( ( rule__SimpleAttribute__NameAssignment_0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2092:1: ( ( rule__SimpleAttribute__NameAssignment_0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2093:1: ( rule__SimpleAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameAssignment_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2094:1: ( rule__SimpleAttribute__NameAssignment_0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2094:2: rule__SimpleAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__NameAssignment_0_in_rule__SimpleAttribute__Group__0__Impl4318);
            rule__SimpleAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__0__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2104:1: rule__SimpleAttribute__Group__1 : rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 ;
    public final void rule__SimpleAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2108:1: ( rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2109:2: rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__14348);
            rule__SimpleAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__14351);
            rule__SimpleAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__1"


    // $ANTLR start "rule__SimpleAttribute__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2116:1: rule__SimpleAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2120:1: ( ( ':' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2121:1: ( ':' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2121:1: ( ':' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2122:1: ':'
            {
             before(grammarAccess.getSimpleAttributeAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__SimpleAttribute__Group__1__Impl4379); 
             after(grammarAccess.getSimpleAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__1__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2135:1: rule__SimpleAttribute__Group__2 : rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3 ;
    public final void rule__SimpleAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2139:1: ( rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2140:2: rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__24410);
            rule__SimpleAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAttribute__Group__3_in_rule__SimpleAttribute__Group__24413);
            rule__SimpleAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__2"


    // $ANTLR start "rule__SimpleAttribute__Group__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2147:1: rule__SimpleAttribute__Group__2__Impl : ( ( rule__SimpleAttribute__TypeAssignment_2 ) ) ;
    public final void rule__SimpleAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2151:1: ( ( ( rule__SimpleAttribute__TypeAssignment_2 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2152:1: ( ( rule__SimpleAttribute__TypeAssignment_2 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2152:1: ( ( rule__SimpleAttribute__TypeAssignment_2 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2153:1: ( rule__SimpleAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getTypeAssignment_2()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2154:1: ( rule__SimpleAttribute__TypeAssignment_2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2154:2: rule__SimpleAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__TypeAssignment_2_in_rule__SimpleAttribute__Group__2__Impl4440);
            rule__SimpleAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__2__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2164:1: rule__SimpleAttribute__Group__3 : rule__SimpleAttribute__Group__3__Impl ;
    public final void rule__SimpleAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2168:1: ( rule__SimpleAttribute__Group__3__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2169:2: rule__SimpleAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__3__Impl_in_rule__SimpleAttribute__Group__34470);
            rule__SimpleAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__3"


    // $ANTLR start "rule__SimpleAttribute__Group__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2175:1: rule__SimpleAttribute__Group__3__Impl : ( ';' ) ;
    public final void rule__SimpleAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2179:1: ( ( ';' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2180:1: ( ';' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2180:1: ( ';' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2181:1: ';'
            {
             before(grammarAccess.getSimpleAttributeAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__SimpleAttribute__Group__3__Impl4498); 
             after(grammarAccess.getSimpleAttributeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__3__Impl"


    // $ANTLR start "rule__FloatType__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2202:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2206:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2207:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__04537);
            rule__FloatType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__04540);
            rule__FloatType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__0"


    // $ANTLR start "rule__FloatType__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2214:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2218:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2219:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2219:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2220:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2221:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2223:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__0__Impl"


    // $ANTLR start "rule__FloatType__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2233:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2237:1: ( rule__FloatType__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2238:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__14598);
            rule__FloatType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__1"


    // $ANTLR start "rule__FloatType__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2244:1: rule__FloatType__Group__1__Impl : ( 'float' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2248:1: ( ( 'float' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2249:1: ( 'float' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2249:1: ( 'float' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2250:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__FloatType__Group__1__Impl4626); 
             after(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatType__Group__1__Impl"


    // $ANTLR start "rule__IntType__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2267:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2271:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2272:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__04661);
            rule__IntType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__04664);
            rule__IntType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__0"


    // $ANTLR start "rule__IntType__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2279:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2283:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2284:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2284:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2285:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2286:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2288:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__0__Impl"


    // $ANTLR start "rule__IntType__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2298:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2302:1: ( rule__IntType__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2303:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__14722);
            rule__IntType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__1"


    // $ANTLR start "rule__IntType__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2309:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2313:1: ( ( 'int' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2314:1: ( 'int' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2314:1: ( 'int' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2315:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__IntType__Group__1__Impl4750); 
             after(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2332:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2336:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2337:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0__Impl_in_rule__BooleanType__Group__04785);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__04788);
            rule__BooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2344:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2348:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2349:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2349:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2350:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2351:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2353:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2363:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2367:1: ( rule__BooleanType__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2368:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__1__Impl_in_rule__BooleanType__Group__14846);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2374:1: rule__BooleanType__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2378:1: ( ( 'bool' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2379:1: ( 'bool' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2379:1: ( 'bool' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2380:1: 'bool'
            {
             before(grammarAccess.getBooleanTypeAccess().getBoolKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__BooleanType__Group__1__Impl4874); 
             after(grammarAccess.getBooleanTypeAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2397:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2401:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2402:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__04909);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__04912);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2409:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2413:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2414:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2414:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2415:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2416:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2418:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2428:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2432:1: ( rule__StringType__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2433:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__14970);
            rule__StringType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2439:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2443:1: ( ( 'string' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2444:1: ( 'string' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2444:1: ( 'string' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2445:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__StringType__Group__1__Impl4998); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2462:1: rule__ComparisonLevel__Group__0 : rule__ComparisonLevel__Group__0__Impl rule__ComparisonLevel__Group__1 ;
    public final void rule__ComparisonLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2466:1: ( rule__ComparisonLevel__Group__0__Impl rule__ComparisonLevel__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2467:2: rule__ComparisonLevel__Group__0__Impl rule__ComparisonLevel__Group__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group__0__Impl_in_rule__ComparisonLevel__Group__05033);
            rule__ComparisonLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group__1_in_rule__ComparisonLevel__Group__05036);
            rule__ComparisonLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group__0"


    // $ANTLR start "rule__ComparisonLevel__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2474:1: rule__ComparisonLevel__Group__0__Impl : ( ruleAdditionLevel ) ;
    public final void rule__ComparisonLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2478:1: ( ( ruleAdditionLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2479:1: ( ruleAdditionLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2479:1: ( ruleAdditionLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2480:1: ruleAdditionLevel
            {
             before(grammarAccess.getComparisonLevelAccess().getAdditionLevelParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAdditionLevel_in_rule__ComparisonLevel__Group__0__Impl5063);
            ruleAdditionLevel();

            state._fsp--;

             after(grammarAccess.getComparisonLevelAccess().getAdditionLevelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2491:1: rule__ComparisonLevel__Group__1 : rule__ComparisonLevel__Group__1__Impl ;
    public final void rule__ComparisonLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2495:1: ( rule__ComparisonLevel__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2496:2: rule__ComparisonLevel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group__1__Impl_in_rule__ComparisonLevel__Group__15092);
            rule__ComparisonLevel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group__1"


    // $ANTLR start "rule__ComparisonLevel__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2502:1: rule__ComparisonLevel__Group__1__Impl : ( ( rule__ComparisonLevel__Group_1__0 )* ) ;
    public final void rule__ComparisonLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2506:1: ( ( ( rule__ComparisonLevel__Group_1__0 )* ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2507:1: ( ( rule__ComparisonLevel__Group_1__0 )* )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2507:1: ( ( rule__ComparisonLevel__Group_1__0 )* )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2508:1: ( rule__ComparisonLevel__Group_1__0 )*
            {
             before(grammarAccess.getComparisonLevelAccess().getGroup_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2509:1: ( rule__ComparisonLevel__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2509:2: rule__ComparisonLevel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ComparisonLevel__Group_1__0_in_rule__ComparisonLevel__Group__1__Impl5119);
            	    rule__ComparisonLevel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComparisonLevelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2523:1: rule__ComparisonLevel__Group_1__0 : rule__ComparisonLevel__Group_1__0__Impl rule__ComparisonLevel__Group_1__1 ;
    public final void rule__ComparisonLevel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2527:1: ( rule__ComparisonLevel__Group_1__0__Impl rule__ComparisonLevel__Group_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2528:2: rule__ComparisonLevel__Group_1__0__Impl rule__ComparisonLevel__Group_1__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1__0__Impl_in_rule__ComparisonLevel__Group_1__05154);
            rule__ComparisonLevel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1__1_in_rule__ComparisonLevel__Group_1__05157);
            rule__ComparisonLevel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2535:1: rule__ComparisonLevel__Group_1__0__Impl : ( ( rule__ComparisonLevel__Alternatives_1_0 ) ) ;
    public final void rule__ComparisonLevel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2539:1: ( ( ( rule__ComparisonLevel__Alternatives_1_0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2540:1: ( ( rule__ComparisonLevel__Alternatives_1_0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2540:1: ( ( rule__ComparisonLevel__Alternatives_1_0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2541:1: ( rule__ComparisonLevel__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonLevelAccess().getAlternatives_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2542:1: ( rule__ComparisonLevel__Alternatives_1_0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2542:2: rule__ComparisonLevel__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Alternatives_1_0_in_rule__ComparisonLevel__Group_1__0__Impl5184);
            rule__ComparisonLevel__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonLevelAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2552:1: rule__ComparisonLevel__Group_1__1 : rule__ComparisonLevel__Group_1__1__Impl ;
    public final void rule__ComparisonLevel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2556:1: ( rule__ComparisonLevel__Group_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2557:2: rule__ComparisonLevel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1__1__Impl_in_rule__ComparisonLevel__Group_1__15214);
            rule__ComparisonLevel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2563:1: rule__ComparisonLevel__Group_1__1__Impl : ( ( rule__ComparisonLevel__RightAssignment_1_1 ) ) ;
    public final void rule__ComparisonLevel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2567:1: ( ( ( rule__ComparisonLevel__RightAssignment_1_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2568:1: ( ( rule__ComparisonLevel__RightAssignment_1_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2568:1: ( ( rule__ComparisonLevel__RightAssignment_1_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2569:1: ( rule__ComparisonLevel__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonLevelAccess().getRightAssignment_1_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2570:1: ( rule__ComparisonLevel__RightAssignment_1_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2570:2: rule__ComparisonLevel__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__RightAssignment_1_1_in_rule__ComparisonLevel__Group_1__1__Impl5241);
            rule__ComparisonLevel__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonLevelAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_0__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2584:1: rule__ComparisonLevel__Group_1_0_0__0 : rule__ComparisonLevel__Group_1_0_0__0__Impl rule__ComparisonLevel__Group_1_0_0__1 ;
    public final void rule__ComparisonLevel__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2588:1: ( rule__ComparisonLevel__Group_1_0_0__0__Impl rule__ComparisonLevel__Group_1_0_0__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2589:2: rule__ComparisonLevel__Group_1_0_0__0__Impl rule__ComparisonLevel__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_0__0__Impl_in_rule__ComparisonLevel__Group_1_0_0__05275);
            rule__ComparisonLevel__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_0__1_in_rule__ComparisonLevel__Group_1_0_0__05278);
            rule__ComparisonLevel__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_0__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_0__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2596:1: rule__ComparisonLevel__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2600:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2601:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2601:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2602:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2603:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2605:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_0__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2615:1: rule__ComparisonLevel__Group_1_0_0__1 : rule__ComparisonLevel__Group_1_0_0__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2619:1: ( rule__ComparisonLevel__Group_1_0_0__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2620:2: rule__ComparisonLevel__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_0__1__Impl_in_rule__ComparisonLevel__Group_1_0_0__15336);
            rule__ComparisonLevel__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_0__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_0__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2626:1: rule__ComparisonLevel__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__ComparisonLevel__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2630:1: ( ( '==' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2631:1: ( '==' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2631:1: ( '==' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2632:1: '=='
            {
             before(grammarAccess.getComparisonLevelAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            match(input,31,FOLLOW_31_in_rule__ComparisonLevel__Group_1_0_0__1__Impl5364); 
             after(grammarAccess.getComparisonLevelAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2649:1: rule__ComparisonLevel__Group_1_0_1__0 : rule__ComparisonLevel__Group_1_0_1__0__Impl rule__ComparisonLevel__Group_1_0_1__1 ;
    public final void rule__ComparisonLevel__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2653:1: ( rule__ComparisonLevel__Group_1_0_1__0__Impl rule__ComparisonLevel__Group_1_0_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2654:2: rule__ComparisonLevel__Group_1_0_1__0__Impl rule__ComparisonLevel__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_1__0__Impl_in_rule__ComparisonLevel__Group_1_0_1__05399);
            rule__ComparisonLevel__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_1__1_in_rule__ComparisonLevel__Group_1_0_1__05402);
            rule__ComparisonLevel__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_1__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2661:1: rule__ComparisonLevel__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2665:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2666:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2666:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2667:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2668:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2670:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2680:1: rule__ComparisonLevel__Group_1_0_1__1 : rule__ComparisonLevel__Group_1_0_1__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2684:1: ( rule__ComparisonLevel__Group_1_0_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2685:2: rule__ComparisonLevel__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_1__1__Impl_in_rule__ComparisonLevel__Group_1_0_1__15460);
            rule__ComparisonLevel__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_1__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2691:1: rule__ComparisonLevel__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__ComparisonLevel__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2695:1: ( ( '!=' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2696:1: ( '!=' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2696:1: ( '!=' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2697:1: '!='
            {
             before(grammarAccess.getComparisonLevelAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            match(input,32,FOLLOW_32_in_rule__ComparisonLevel__Group_1_0_1__1__Impl5488); 
             after(grammarAccess.getComparisonLevelAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_2__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2714:1: rule__ComparisonLevel__Group_1_0_2__0 : rule__ComparisonLevel__Group_1_0_2__0__Impl rule__ComparisonLevel__Group_1_0_2__1 ;
    public final void rule__ComparisonLevel__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2718:1: ( rule__ComparisonLevel__Group_1_0_2__0__Impl rule__ComparisonLevel__Group_1_0_2__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2719:2: rule__ComparisonLevel__Group_1_0_2__0__Impl rule__ComparisonLevel__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_2__0__Impl_in_rule__ComparisonLevel__Group_1_0_2__05523);
            rule__ComparisonLevel__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_2__1_in_rule__ComparisonLevel__Group_1_0_2__05526);
            rule__ComparisonLevel__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_2__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_2__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2726:1: rule__ComparisonLevel__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2730:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2731:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2731:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2732:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2733:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2735:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_2__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2745:1: rule__ComparisonLevel__Group_1_0_2__1 : rule__ComparisonLevel__Group_1_0_2__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2749:1: ( rule__ComparisonLevel__Group_1_0_2__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2750:2: rule__ComparisonLevel__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_2__1__Impl_in_rule__ComparisonLevel__Group_1_0_2__15584);
            rule__ComparisonLevel__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_2__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_2__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2756:1: rule__ComparisonLevel__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__ComparisonLevel__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2760:1: ( ( '>' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2761:1: ( '>' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2761:1: ( '>' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2762:1: '>'
            {
             before(grammarAccess.getComparisonLevelAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            match(input,33,FOLLOW_33_in_rule__ComparisonLevel__Group_1_0_2__1__Impl5612); 
             after(grammarAccess.getComparisonLevelAccess().getGreaterThanSignKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_3__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2779:1: rule__ComparisonLevel__Group_1_0_3__0 : rule__ComparisonLevel__Group_1_0_3__0__Impl rule__ComparisonLevel__Group_1_0_3__1 ;
    public final void rule__ComparisonLevel__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2783:1: ( rule__ComparisonLevel__Group_1_0_3__0__Impl rule__ComparisonLevel__Group_1_0_3__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2784:2: rule__ComparisonLevel__Group_1_0_3__0__Impl rule__ComparisonLevel__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_3__0__Impl_in_rule__ComparisonLevel__Group_1_0_3__05647);
            rule__ComparisonLevel__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_3__1_in_rule__ComparisonLevel__Group_1_0_3__05650);
            rule__ComparisonLevel__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_3__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_3__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2791:1: rule__ComparisonLevel__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2795:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2796:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2796:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2797:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2798:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2800:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_3__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2810:1: rule__ComparisonLevel__Group_1_0_3__1 : rule__ComparisonLevel__Group_1_0_3__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2814:1: ( rule__ComparisonLevel__Group_1_0_3__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2815:2: rule__ComparisonLevel__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_3__1__Impl_in_rule__ComparisonLevel__Group_1_0_3__15708);
            rule__ComparisonLevel__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_3__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_3__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2821:1: rule__ComparisonLevel__Group_1_0_3__1__Impl : ( '>=' ) ;
    public final void rule__ComparisonLevel__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2825:1: ( ( '>=' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2826:1: ( '>=' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2826:1: ( '>=' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2827:1: '>='
            {
             before(grammarAccess.getComparisonLevelAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1()); 
            match(input,34,FOLLOW_34_in_rule__ComparisonLevel__Group_1_0_3__1__Impl5736); 
             after(grammarAccess.getComparisonLevelAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_4__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2844:1: rule__ComparisonLevel__Group_1_0_4__0 : rule__ComparisonLevel__Group_1_0_4__0__Impl rule__ComparisonLevel__Group_1_0_4__1 ;
    public final void rule__ComparisonLevel__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2848:1: ( rule__ComparisonLevel__Group_1_0_4__0__Impl rule__ComparisonLevel__Group_1_0_4__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2849:2: rule__ComparisonLevel__Group_1_0_4__0__Impl rule__ComparisonLevel__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_4__0__Impl_in_rule__ComparisonLevel__Group_1_0_4__05771);
            rule__ComparisonLevel__Group_1_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_4__1_in_rule__ComparisonLevel__Group_1_0_4__05774);
            rule__ComparisonLevel__Group_1_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_4__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_4__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2856:1: rule__ComparisonLevel__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2860:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2861:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2861:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2862:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2863:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2865:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_4__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2875:1: rule__ComparisonLevel__Group_1_0_4__1 : rule__ComparisonLevel__Group_1_0_4__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2879:1: ( rule__ComparisonLevel__Group_1_0_4__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2880:2: rule__ComparisonLevel__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_4__1__Impl_in_rule__ComparisonLevel__Group_1_0_4__15832);
            rule__ComparisonLevel__Group_1_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_4__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_4__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2886:1: rule__ComparisonLevel__Group_1_0_4__1__Impl : ( '<=' ) ;
    public final void rule__ComparisonLevel__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2890:1: ( ( '<=' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2891:1: ( '<=' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2891:1: ( '<=' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2892:1: '<='
            {
             before(grammarAccess.getComparisonLevelAccess().getLessThanSignEqualsSignKeyword_1_0_4_1()); 
            match(input,35,FOLLOW_35_in_rule__ComparisonLevel__Group_1_0_4__1__Impl5860); 
             after(grammarAccess.getComparisonLevelAccess().getLessThanSignEqualsSignKeyword_1_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_5__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2909:1: rule__ComparisonLevel__Group_1_0_5__0 : rule__ComparisonLevel__Group_1_0_5__0__Impl rule__ComparisonLevel__Group_1_0_5__1 ;
    public final void rule__ComparisonLevel__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2913:1: ( rule__ComparisonLevel__Group_1_0_5__0__Impl rule__ComparisonLevel__Group_1_0_5__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2914:2: rule__ComparisonLevel__Group_1_0_5__0__Impl rule__ComparisonLevel__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_5__0__Impl_in_rule__ComparisonLevel__Group_1_0_5__05895);
            rule__ComparisonLevel__Group_1_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_5__1_in_rule__ComparisonLevel__Group_1_0_5__05898);
            rule__ComparisonLevel__Group_1_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_5__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_5__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2921:1: rule__ComparisonLevel__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2925:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2926:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2926:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2927:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2928:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2930:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_5__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2940:1: rule__ComparisonLevel__Group_1_0_5__1 : rule__ComparisonLevel__Group_1_0_5__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2944:1: ( rule__ComparisonLevel__Group_1_0_5__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2945:2: rule__ComparisonLevel__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_5__1__Impl_in_rule__ComparisonLevel__Group_1_0_5__15956);
            rule__ComparisonLevel__Group_1_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_5__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_5__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2951:1: rule__ComparisonLevel__Group_1_0_5__1__Impl : ( '&&' ) ;
    public final void rule__ComparisonLevel__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2955:1: ( ( '&&' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2956:1: ( '&&' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2956:1: ( '&&' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2957:1: '&&'
            {
             before(grammarAccess.getComparisonLevelAccess().getAmpersandAmpersandKeyword_1_0_5_1()); 
            match(input,36,FOLLOW_36_in_rule__ComparisonLevel__Group_1_0_5__1__Impl5984); 
             after(grammarAccess.getComparisonLevelAccess().getAmpersandAmpersandKeyword_1_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_6__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2974:1: rule__ComparisonLevel__Group_1_0_6__0 : rule__ComparisonLevel__Group_1_0_6__0__Impl rule__ComparisonLevel__Group_1_0_6__1 ;
    public final void rule__ComparisonLevel__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2978:1: ( rule__ComparisonLevel__Group_1_0_6__0__Impl rule__ComparisonLevel__Group_1_0_6__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2979:2: rule__ComparisonLevel__Group_1_0_6__0__Impl rule__ComparisonLevel__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_6__0__Impl_in_rule__ComparisonLevel__Group_1_0_6__06019);
            rule__ComparisonLevel__Group_1_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_6__1_in_rule__ComparisonLevel__Group_1_0_6__06022);
            rule__ComparisonLevel__Group_1_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_6__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_6__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2986:1: rule__ComparisonLevel__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2990:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2991:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2991:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2992:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2993:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:2995:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_6__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_6__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3005:1: rule__ComparisonLevel__Group_1_0_6__1 : rule__ComparisonLevel__Group_1_0_6__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3009:1: ( rule__ComparisonLevel__Group_1_0_6__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3010:2: rule__ComparisonLevel__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_6__1__Impl_in_rule__ComparisonLevel__Group_1_0_6__16080);
            rule__ComparisonLevel__Group_1_0_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_6__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_6__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3016:1: rule__ComparisonLevel__Group_1_0_6__1__Impl : ( '=>' ) ;
    public final void rule__ComparisonLevel__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3020:1: ( ( '=>' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3021:1: ( '=>' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3021:1: ( '=>' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3022:1: '=>'
            {
             before(grammarAccess.getComparisonLevelAccess().getEqualsSignGreaterThanSignKeyword_1_0_6_1()); 
            match(input,37,FOLLOW_37_in_rule__ComparisonLevel__Group_1_0_6__1__Impl6108); 
             after(grammarAccess.getComparisonLevelAccess().getEqualsSignGreaterThanSignKeyword_1_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_6__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_7__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3039:1: rule__ComparisonLevel__Group_1_0_7__0 : rule__ComparisonLevel__Group_1_0_7__0__Impl rule__ComparisonLevel__Group_1_0_7__1 ;
    public final void rule__ComparisonLevel__Group_1_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3043:1: ( rule__ComparisonLevel__Group_1_0_7__0__Impl rule__ComparisonLevel__Group_1_0_7__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3044:2: rule__ComparisonLevel__Group_1_0_7__0__Impl rule__ComparisonLevel__Group_1_0_7__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_7__0__Impl_in_rule__ComparisonLevel__Group_1_0_7__06143);
            rule__ComparisonLevel__Group_1_0_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_7__1_in_rule__ComparisonLevel__Group_1_0_7__06146);
            rule__ComparisonLevel__Group_1_0_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_7__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_7__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3051:1: rule__ComparisonLevel__Group_1_0_7__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3055:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3056:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3056:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3057:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3058:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3060:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_7__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_7__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3070:1: rule__ComparisonLevel__Group_1_0_7__1 : rule__ComparisonLevel__Group_1_0_7__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3074:1: ( rule__ComparisonLevel__Group_1_0_7__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3075:2: rule__ComparisonLevel__Group_1_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_7__1__Impl_in_rule__ComparisonLevel__Group_1_0_7__16204);
            rule__ComparisonLevel__Group_1_0_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_7__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_7__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3081:1: rule__ComparisonLevel__Group_1_0_7__1__Impl : ( '||' ) ;
    public final void rule__ComparisonLevel__Group_1_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3085:1: ( ( '||' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3086:1: ( '||' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3086:1: ( '||' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3087:1: '||'
            {
             before(grammarAccess.getComparisonLevelAccess().getVerticalLineVerticalLineKeyword_1_0_7_1()); 
            match(input,38,FOLLOW_38_in_rule__ComparisonLevel__Group_1_0_7__1__Impl6232); 
             after(grammarAccess.getComparisonLevelAccess().getVerticalLineVerticalLineKeyword_1_0_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_7__1__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_8__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3104:1: rule__ComparisonLevel__Group_1_0_8__0 : rule__ComparisonLevel__Group_1_0_8__0__Impl rule__ComparisonLevel__Group_1_0_8__1 ;
    public final void rule__ComparisonLevel__Group_1_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3108:1: ( rule__ComparisonLevel__Group_1_0_8__0__Impl rule__ComparisonLevel__Group_1_0_8__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3109:2: rule__ComparisonLevel__Group_1_0_8__0__Impl rule__ComparisonLevel__Group_1_0_8__1
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_8__0__Impl_in_rule__ComparisonLevel__Group_1_0_8__06267);
            rule__ComparisonLevel__Group_1_0_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_8__1_in_rule__ComparisonLevel__Group_1_0_8__06270);
            rule__ComparisonLevel__Group_1_0_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_8__0"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_8__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3116:1: rule__ComparisonLevel__Group_1_0_8__0__Impl : ( () ) ;
    public final void rule__ComparisonLevel__Group_1_0_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3120:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3121:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3121:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3122:1: ()
            {
             before(grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3123:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3125:1: 
            {
            }

             after(grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_8__0__Impl"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_8__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3135:1: rule__ComparisonLevel__Group_1_0_8__1 : rule__ComparisonLevel__Group_1_0_8__1__Impl ;
    public final void rule__ComparisonLevel__Group_1_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3139:1: ( rule__ComparisonLevel__Group_1_0_8__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3140:2: rule__ComparisonLevel__Group_1_0_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonLevel__Group_1_0_8__1__Impl_in_rule__ComparisonLevel__Group_1_0_8__16328);
            rule__ComparisonLevel__Group_1_0_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_8__1"


    // $ANTLR start "rule__ComparisonLevel__Group_1_0_8__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3146:1: rule__ComparisonLevel__Group_1_0_8__1__Impl : ( '<' ) ;
    public final void rule__ComparisonLevel__Group_1_0_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3150:1: ( ( '<' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3151:1: ( '<' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3151:1: ( '<' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3152:1: '<'
            {
             before(grammarAccess.getComparisonLevelAccess().getLessThanSignKeyword_1_0_8_1()); 
            match(input,39,FOLLOW_39_in_rule__ComparisonLevel__Group_1_0_8__1__Impl6356); 
             after(grammarAccess.getComparisonLevelAccess().getLessThanSignKeyword_1_0_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__Group_1_0_8__1__Impl"


    // $ANTLR start "rule__AdditionLevel__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3169:1: rule__AdditionLevel__Group__0 : rule__AdditionLevel__Group__0__Impl rule__AdditionLevel__Group__1 ;
    public final void rule__AdditionLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3173:1: ( rule__AdditionLevel__Group__0__Impl rule__AdditionLevel__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3174:2: rule__AdditionLevel__Group__0__Impl rule__AdditionLevel__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group__0__Impl_in_rule__AdditionLevel__Group__06391);
            rule__AdditionLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionLevel__Group__1_in_rule__AdditionLevel__Group__06394);
            rule__AdditionLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group__0"


    // $ANTLR start "rule__AdditionLevel__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3181:1: rule__AdditionLevel__Group__0__Impl : ( ruleMultiplicationLevel ) ;
    public final void rule__AdditionLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3185:1: ( ( ruleMultiplicationLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3186:1: ( ruleMultiplicationLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3186:1: ( ruleMultiplicationLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3187:1: ruleMultiplicationLevel
            {
             before(grammarAccess.getAdditionLevelAccess().getMultiplicationLevelParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplicationLevel_in_rule__AdditionLevel__Group__0__Impl6421);
            ruleMultiplicationLevel();

            state._fsp--;

             after(grammarAccess.getAdditionLevelAccess().getMultiplicationLevelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group__0__Impl"


    // $ANTLR start "rule__AdditionLevel__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3198:1: rule__AdditionLevel__Group__1 : rule__AdditionLevel__Group__1__Impl ;
    public final void rule__AdditionLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3202:1: ( rule__AdditionLevel__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3203:2: rule__AdditionLevel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group__1__Impl_in_rule__AdditionLevel__Group__16450);
            rule__AdditionLevel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group__1"


    // $ANTLR start "rule__AdditionLevel__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3209:1: rule__AdditionLevel__Group__1__Impl : ( ( rule__AdditionLevel__Group_1__0 )* ) ;
    public final void rule__AdditionLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3213:1: ( ( ( rule__AdditionLevel__Group_1__0 )* ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3214:1: ( ( rule__AdditionLevel__Group_1__0 )* )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3214:1: ( ( rule__AdditionLevel__Group_1__0 )* )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3215:1: ( rule__AdditionLevel__Group_1__0 )*
            {
             before(grammarAccess.getAdditionLevelAccess().getGroup_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3216:1: ( rule__AdditionLevel__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3216:2: rule__AdditionLevel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditionLevel__Group_1__0_in_rule__AdditionLevel__Group__1__Impl6477);
            	    rule__AdditionLevel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAdditionLevelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group__1__Impl"


    // $ANTLR start "rule__AdditionLevel__Group_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3230:1: rule__AdditionLevel__Group_1__0 : rule__AdditionLevel__Group_1__0__Impl rule__AdditionLevel__Group_1__1 ;
    public final void rule__AdditionLevel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3234:1: ( rule__AdditionLevel__Group_1__0__Impl rule__AdditionLevel__Group_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3235:2: rule__AdditionLevel__Group_1__0__Impl rule__AdditionLevel__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group_1__0__Impl_in_rule__AdditionLevel__Group_1__06512);
            rule__AdditionLevel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionLevel__Group_1__1_in_rule__AdditionLevel__Group_1__06515);
            rule__AdditionLevel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1__0"


    // $ANTLR start "rule__AdditionLevel__Group_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3242:1: rule__AdditionLevel__Group_1__0__Impl : ( ( rule__AdditionLevel__Alternatives_1_0 ) ) ;
    public final void rule__AdditionLevel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3246:1: ( ( ( rule__AdditionLevel__Alternatives_1_0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3247:1: ( ( rule__AdditionLevel__Alternatives_1_0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3247:1: ( ( rule__AdditionLevel__Alternatives_1_0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3248:1: ( rule__AdditionLevel__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionLevelAccess().getAlternatives_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3249:1: ( rule__AdditionLevel__Alternatives_1_0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3249:2: rule__AdditionLevel__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Alternatives_1_0_in_rule__AdditionLevel__Group_1__0__Impl6542);
            rule__AdditionLevel__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionLevelAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionLevel__Group_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3259:1: rule__AdditionLevel__Group_1__1 : rule__AdditionLevel__Group_1__1__Impl ;
    public final void rule__AdditionLevel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3263:1: ( rule__AdditionLevel__Group_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3264:2: rule__AdditionLevel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group_1__1__Impl_in_rule__AdditionLevel__Group_1__16572);
            rule__AdditionLevel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1__1"


    // $ANTLR start "rule__AdditionLevel__Group_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3270:1: rule__AdditionLevel__Group_1__1__Impl : ( ( rule__AdditionLevel__RightAssignment_1_1 ) ) ;
    public final void rule__AdditionLevel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3274:1: ( ( ( rule__AdditionLevel__RightAssignment_1_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3275:1: ( ( rule__AdditionLevel__RightAssignment_1_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3275:1: ( ( rule__AdditionLevel__RightAssignment_1_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3276:1: ( rule__AdditionLevel__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionLevelAccess().getRightAssignment_1_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3277:1: ( rule__AdditionLevel__RightAssignment_1_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3277:2: rule__AdditionLevel__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionLevel__RightAssignment_1_1_in_rule__AdditionLevel__Group_1__1__Impl6599);
            rule__AdditionLevel__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionLevelAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_0__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3291:1: rule__AdditionLevel__Group_1_0_0__0 : rule__AdditionLevel__Group_1_0_0__0__Impl rule__AdditionLevel__Group_1_0_0__1 ;
    public final void rule__AdditionLevel__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3295:1: ( rule__AdditionLevel__Group_1_0_0__0__Impl rule__AdditionLevel__Group_1_0_0__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3296:2: rule__AdditionLevel__Group_1_0_0__0__Impl rule__AdditionLevel__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_0__0__Impl_in_rule__AdditionLevel__Group_1_0_0__06633);
            rule__AdditionLevel__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_0__1_in_rule__AdditionLevel__Group_1_0_0__06636);
            rule__AdditionLevel__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_0__0"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_0__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3303:1: rule__AdditionLevel__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditionLevel__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3307:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3308:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3308:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3309:1: ()
            {
             before(grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3310:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3312:1: 
            {
            }

             after(grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_0__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3322:1: rule__AdditionLevel__Group_1_0_0__1 : rule__AdditionLevel__Group_1_0_0__1__Impl ;
    public final void rule__AdditionLevel__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3326:1: ( rule__AdditionLevel__Group_1_0_0__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3327:2: rule__AdditionLevel__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_0__1__Impl_in_rule__AdditionLevel__Group_1_0_0__16694);
            rule__AdditionLevel__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_0__1"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_0__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3333:1: rule__AdditionLevel__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AdditionLevel__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3337:1: ( ( '+' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3338:1: ( '+' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3338:1: ( '+' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3339:1: '+'
            {
             before(grammarAccess.getAdditionLevelAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,40,FOLLOW_40_in_rule__AdditionLevel__Group_1_0_0__1__Impl6722); 
             after(grammarAccess.getAdditionLevelAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3356:1: rule__AdditionLevel__Group_1_0_1__0 : rule__AdditionLevel__Group_1_0_1__0__Impl rule__AdditionLevel__Group_1_0_1__1 ;
    public final void rule__AdditionLevel__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3360:1: ( rule__AdditionLevel__Group_1_0_1__0__Impl rule__AdditionLevel__Group_1_0_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3361:2: rule__AdditionLevel__Group_1_0_1__0__Impl rule__AdditionLevel__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_1__0__Impl_in_rule__AdditionLevel__Group_1_0_1__06757);
            rule__AdditionLevel__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_1__1_in_rule__AdditionLevel__Group_1_0_1__06760);
            rule__AdditionLevel__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_1__0"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3368:1: rule__AdditionLevel__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AdditionLevel__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3372:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3373:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3373:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3374:1: ()
            {
             before(grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3375:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3377:1: 
            {
            }

             after(grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3387:1: rule__AdditionLevel__Group_1_0_1__1 : rule__AdditionLevel__Group_1_0_1__1__Impl ;
    public final void rule__AdditionLevel__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3391:1: ( rule__AdditionLevel__Group_1_0_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3392:2: rule__AdditionLevel__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionLevel__Group_1_0_1__1__Impl_in_rule__AdditionLevel__Group_1_0_1__16818);
            rule__AdditionLevel__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_1__1"


    // $ANTLR start "rule__AdditionLevel__Group_1_0_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3398:1: rule__AdditionLevel__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AdditionLevel__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3402:1: ( ( '-' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3403:1: ( '-' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3403:1: ( '-' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3404:1: '-'
            {
             before(grammarAccess.getAdditionLevelAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,41,FOLLOW_41_in_rule__AdditionLevel__Group_1_0_1__1__Impl6846); 
             after(grammarAccess.getAdditionLevelAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3421:1: rule__MultiplicationLevel__Group__0 : rule__MultiplicationLevel__Group__0__Impl rule__MultiplicationLevel__Group__1 ;
    public final void rule__MultiplicationLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3425:1: ( rule__MultiplicationLevel__Group__0__Impl rule__MultiplicationLevel__Group__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3426:2: rule__MultiplicationLevel__Group__0__Impl rule__MultiplicationLevel__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group__0__Impl_in_rule__MultiplicationLevel__Group__06881);
            rule__MultiplicationLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationLevel__Group__1_in_rule__MultiplicationLevel__Group__06884);
            rule__MultiplicationLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group__0"


    // $ANTLR start "rule__MultiplicationLevel__Group__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3433:1: rule__MultiplicationLevel__Group__0__Impl : ( rulePrefixOpLevel ) ;
    public final void rule__MultiplicationLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3437:1: ( ( rulePrefixOpLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3438:1: ( rulePrefixOpLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3438:1: ( rulePrefixOpLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3439:1: rulePrefixOpLevel
            {
             before(grammarAccess.getMultiplicationLevelAccess().getPrefixOpLevelParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrefixOpLevel_in_rule__MultiplicationLevel__Group__0__Impl6911);
            rulePrefixOpLevel();

            state._fsp--;

             after(grammarAccess.getMultiplicationLevelAccess().getPrefixOpLevelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3450:1: rule__MultiplicationLevel__Group__1 : rule__MultiplicationLevel__Group__1__Impl ;
    public final void rule__MultiplicationLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3454:1: ( rule__MultiplicationLevel__Group__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3455:2: rule__MultiplicationLevel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group__1__Impl_in_rule__MultiplicationLevel__Group__16940);
            rule__MultiplicationLevel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group__1"


    // $ANTLR start "rule__MultiplicationLevel__Group__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3461:1: rule__MultiplicationLevel__Group__1__Impl : ( ( rule__MultiplicationLevel__Group_1__0 )* ) ;
    public final void rule__MultiplicationLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3465:1: ( ( ( rule__MultiplicationLevel__Group_1__0 )* ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3466:1: ( ( rule__MultiplicationLevel__Group_1__0 )* )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3466:1: ( ( rule__MultiplicationLevel__Group_1__0 )* )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3467:1: ( rule__MultiplicationLevel__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationLevelAccess().getGroup_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3468:1: ( rule__MultiplicationLevel__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24||LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3468:2: rule__MultiplicationLevel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1__0_in_rule__MultiplicationLevel__Group__1__Impl6967);
            	    rule__MultiplicationLevel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMultiplicationLevelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3482:1: rule__MultiplicationLevel__Group_1__0 : rule__MultiplicationLevel__Group_1__0__Impl rule__MultiplicationLevel__Group_1__1 ;
    public final void rule__MultiplicationLevel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3486:1: ( rule__MultiplicationLevel__Group_1__0__Impl rule__MultiplicationLevel__Group_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3487:2: rule__MultiplicationLevel__Group_1__0__Impl rule__MultiplicationLevel__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1__0__Impl_in_rule__MultiplicationLevel__Group_1__07002);
            rule__MultiplicationLevel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1__1_in_rule__MultiplicationLevel__Group_1__07005);
            rule__MultiplicationLevel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1__0"


    // $ANTLR start "rule__MultiplicationLevel__Group_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3494:1: rule__MultiplicationLevel__Group_1__0__Impl : ( ( rule__MultiplicationLevel__Alternatives_1_0 ) ) ;
    public final void rule__MultiplicationLevel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3498:1: ( ( ( rule__MultiplicationLevel__Alternatives_1_0 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3499:1: ( ( rule__MultiplicationLevel__Alternatives_1_0 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3499:1: ( ( rule__MultiplicationLevel__Alternatives_1_0 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3500:1: ( rule__MultiplicationLevel__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationLevelAccess().getAlternatives_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3501:1: ( rule__MultiplicationLevel__Alternatives_1_0 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3501:2: rule__MultiplicationLevel__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Alternatives_1_0_in_rule__MultiplicationLevel__Group_1__0__Impl7032);
            rule__MultiplicationLevel__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationLevelAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3511:1: rule__MultiplicationLevel__Group_1__1 : rule__MultiplicationLevel__Group_1__1__Impl ;
    public final void rule__MultiplicationLevel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3515:1: ( rule__MultiplicationLevel__Group_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3516:2: rule__MultiplicationLevel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1__1__Impl_in_rule__MultiplicationLevel__Group_1__17062);
            rule__MultiplicationLevel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1__1"


    // $ANTLR start "rule__MultiplicationLevel__Group_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3522:1: rule__MultiplicationLevel__Group_1__1__Impl : ( ( rule__MultiplicationLevel__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicationLevel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3526:1: ( ( ( rule__MultiplicationLevel__RightAssignment_1_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3527:1: ( ( rule__MultiplicationLevel__RightAssignment_1_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3527:1: ( ( rule__MultiplicationLevel__RightAssignment_1_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3528:1: ( rule__MultiplicationLevel__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationLevelAccess().getRightAssignment_1_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3529:1: ( rule__MultiplicationLevel__RightAssignment_1_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3529:2: rule__MultiplicationLevel__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__RightAssignment_1_1_in_rule__MultiplicationLevel__Group_1__1__Impl7089);
            rule__MultiplicationLevel__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationLevelAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_0__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3543:1: rule__MultiplicationLevel__Group_1_0_0__0 : rule__MultiplicationLevel__Group_1_0_0__0__Impl rule__MultiplicationLevel__Group_1_0_0__1 ;
    public final void rule__MultiplicationLevel__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3547:1: ( rule__MultiplicationLevel__Group_1_0_0__0__Impl rule__MultiplicationLevel__Group_1_0_0__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3548:2: rule__MultiplicationLevel__Group_1_0_0__0__Impl rule__MultiplicationLevel__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_0__0__Impl_in_rule__MultiplicationLevel__Group_1_0_0__07123);
            rule__MultiplicationLevel__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_0__1_in_rule__MultiplicationLevel__Group_1_0_0__07126);
            rule__MultiplicationLevel__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_0__0"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_0__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3555:1: rule__MultiplicationLevel__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicationLevel__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3559:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3560:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3560:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3561:1: ()
            {
             before(grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3562:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3564:1: 
            {
            }

             after(grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_0__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3574:1: rule__MultiplicationLevel__Group_1_0_0__1 : rule__MultiplicationLevel__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicationLevel__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3578:1: ( rule__MultiplicationLevel__Group_1_0_0__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3579:2: rule__MultiplicationLevel__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_0__1__Impl_in_rule__MultiplicationLevel__Group_1_0_0__17184);
            rule__MultiplicationLevel__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_0__1"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_0__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3585:1: rule__MultiplicationLevel__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicationLevel__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3589:1: ( ( '*' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3590:1: ( '*' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3590:1: ( '*' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3591:1: '*'
            {
             before(grammarAccess.getMultiplicationLevelAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,42,FOLLOW_42_in_rule__MultiplicationLevel__Group_1_0_0__1__Impl7212); 
             after(grammarAccess.getMultiplicationLevelAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3608:1: rule__MultiplicationLevel__Group_1_0_1__0 : rule__MultiplicationLevel__Group_1_0_1__0__Impl rule__MultiplicationLevel__Group_1_0_1__1 ;
    public final void rule__MultiplicationLevel__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3612:1: ( rule__MultiplicationLevel__Group_1_0_1__0__Impl rule__MultiplicationLevel__Group_1_0_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3613:2: rule__MultiplicationLevel__Group_1_0_1__0__Impl rule__MultiplicationLevel__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_1__0__Impl_in_rule__MultiplicationLevel__Group_1_0_1__07247);
            rule__MultiplicationLevel__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_1__1_in_rule__MultiplicationLevel__Group_1_0_1__07250);
            rule__MultiplicationLevel__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_1__0"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3620:1: rule__MultiplicationLevel__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationLevel__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3624:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3625:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3625:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3626:1: ()
            {
             before(grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3627:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3629:1: 
            {
            }

             after(grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3639:1: rule__MultiplicationLevel__Group_1_0_1__1 : rule__MultiplicationLevel__Group_1_0_1__1__Impl ;
    public final void rule__MultiplicationLevel__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3643:1: ( rule__MultiplicationLevel__Group_1_0_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3644:2: rule__MultiplicationLevel__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationLevel__Group_1_0_1__1__Impl_in_rule__MultiplicationLevel__Group_1_0_1__17308);
            rule__MultiplicationLevel__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_1__1"


    // $ANTLR start "rule__MultiplicationLevel__Group_1_0_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3650:1: rule__MultiplicationLevel__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicationLevel__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3654:1: ( ( '/' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3655:1: ( '/' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3655:1: ( '/' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3656:1: '/'
            {
             before(grammarAccess.getMultiplicationLevelAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_24_in_rule__MultiplicationLevel__Group_1_0_1__1__Impl7336); 
             after(grammarAccess.getMultiplicationLevelAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3673:1: rule__PrefixOpLevel__Group_0__0 : rule__PrefixOpLevel__Group_0__0__Impl rule__PrefixOpLevel__Group_0__1 ;
    public final void rule__PrefixOpLevel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3677:1: ( rule__PrefixOpLevel__Group_0__0__Impl rule__PrefixOpLevel__Group_0__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3678:2: rule__PrefixOpLevel__Group_0__0__Impl rule__PrefixOpLevel__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__0__Impl_in_rule__PrefixOpLevel__Group_0__07371);
            rule__PrefixOpLevel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__1_in_rule__PrefixOpLevel__Group_0__07374);
            rule__PrefixOpLevel__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__0"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3685:1: rule__PrefixOpLevel__Group_0__0__Impl : ( () ) ;
    public final void rule__PrefixOpLevel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3689:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3690:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3690:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3691:1: ()
            {
             before(grammarAccess.getPrefixOpLevelAccess().getNotExpressionAction_0_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3692:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3694:1: 
            {
            }

             after(grammarAccess.getPrefixOpLevelAccess().getNotExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__0__Impl"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3704:1: rule__PrefixOpLevel__Group_0__1 : rule__PrefixOpLevel__Group_0__1__Impl rule__PrefixOpLevel__Group_0__2 ;
    public final void rule__PrefixOpLevel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3708:1: ( rule__PrefixOpLevel__Group_0__1__Impl rule__PrefixOpLevel__Group_0__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3709:2: rule__PrefixOpLevel__Group_0__1__Impl rule__PrefixOpLevel__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__1__Impl_in_rule__PrefixOpLevel__Group_0__17432);
            rule__PrefixOpLevel__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__2_in_rule__PrefixOpLevel__Group_0__17435);
            rule__PrefixOpLevel__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__1"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3716:1: rule__PrefixOpLevel__Group_0__1__Impl : ( '!' ) ;
    public final void rule__PrefixOpLevel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3720:1: ( ( '!' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3721:1: ( '!' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3721:1: ( '!' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3722:1: '!'
            {
             before(grammarAccess.getPrefixOpLevelAccess().getExclamationMarkKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__PrefixOpLevel__Group_0__1__Impl7463); 
             after(grammarAccess.getPrefixOpLevelAccess().getExclamationMarkKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__1__Impl"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3735:1: rule__PrefixOpLevel__Group_0__2 : rule__PrefixOpLevel__Group_0__2__Impl rule__PrefixOpLevel__Group_0__3 ;
    public final void rule__PrefixOpLevel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3739:1: ( rule__PrefixOpLevel__Group_0__2__Impl rule__PrefixOpLevel__Group_0__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3740:2: rule__PrefixOpLevel__Group_0__2__Impl rule__PrefixOpLevel__Group_0__3
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__2__Impl_in_rule__PrefixOpLevel__Group_0__27494);
            rule__PrefixOpLevel__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__3_in_rule__PrefixOpLevel__Group_0__27497);
            rule__PrefixOpLevel__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__2"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3747:1: rule__PrefixOpLevel__Group_0__2__Impl : ( '(' ) ;
    public final void rule__PrefixOpLevel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3751:1: ( ( '(' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3752:1: ( '(' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3752:1: ( '(' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3753:1: '('
            {
             before(grammarAccess.getPrefixOpLevelAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__PrefixOpLevel__Group_0__2__Impl7525); 
             after(grammarAccess.getPrefixOpLevelAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__2__Impl"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3766:1: rule__PrefixOpLevel__Group_0__3 : rule__PrefixOpLevel__Group_0__3__Impl rule__PrefixOpLevel__Group_0__4 ;
    public final void rule__PrefixOpLevel__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3770:1: ( rule__PrefixOpLevel__Group_0__3__Impl rule__PrefixOpLevel__Group_0__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3771:2: rule__PrefixOpLevel__Group_0__3__Impl rule__PrefixOpLevel__Group_0__4
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__3__Impl_in_rule__PrefixOpLevel__Group_0__37556);
            rule__PrefixOpLevel__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__4_in_rule__PrefixOpLevel__Group_0__37559);
            rule__PrefixOpLevel__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__3"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3778:1: rule__PrefixOpLevel__Group_0__3__Impl : ( ( rule__PrefixOpLevel__ExprAssignment_0_3 ) ) ;
    public final void rule__PrefixOpLevel__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3782:1: ( ( ( rule__PrefixOpLevel__ExprAssignment_0_3 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3783:1: ( ( rule__PrefixOpLevel__ExprAssignment_0_3 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3783:1: ( ( rule__PrefixOpLevel__ExprAssignment_0_3 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3784:1: ( rule__PrefixOpLevel__ExprAssignment_0_3 )
            {
             before(grammarAccess.getPrefixOpLevelAccess().getExprAssignment_0_3()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3785:1: ( rule__PrefixOpLevel__ExprAssignment_0_3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3785:2: rule__PrefixOpLevel__ExprAssignment_0_3
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__ExprAssignment_0_3_in_rule__PrefixOpLevel__Group_0__3__Impl7586);
            rule__PrefixOpLevel__ExprAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getPrefixOpLevelAccess().getExprAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__3__Impl"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3795:1: rule__PrefixOpLevel__Group_0__4 : rule__PrefixOpLevel__Group_0__4__Impl ;
    public final void rule__PrefixOpLevel__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3799:1: ( rule__PrefixOpLevel__Group_0__4__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3800:2: rule__PrefixOpLevel__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__PrefixOpLevel__Group_0__4__Impl_in_rule__PrefixOpLevel__Group_0__47616);
            rule__PrefixOpLevel__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__4"


    // $ANTLR start "rule__PrefixOpLevel__Group_0__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3806:1: rule__PrefixOpLevel__Group_0__4__Impl : ( ')' ) ;
    public final void rule__PrefixOpLevel__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3810:1: ( ( ')' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3811:1: ( ')' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3811:1: ( ')' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3812:1: ')'
            {
             before(grammarAccess.getPrefixOpLevelAccess().getRightParenthesisKeyword_0_4()); 
            match(input,18,FOLLOW_18_in_rule__PrefixOpLevel__Group_0__4__Impl7644); 
             after(grammarAccess.getPrefixOpLevelAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__Group_0__4__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3835:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3839:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3840:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07685);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07688);
            rule__Atomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3847:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3851:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3852:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3852:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3853:1: ()
            {
             before(grammarAccess.getAtomicAccess().getTrueExprAction_0_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3854:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3856:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getTrueExprAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3866:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3870:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3871:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17746);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3877:1: rule__Atomic__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3881:1: ( ( 'true' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3882:1: ( 'true' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3882:1: ( 'true' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3883:1: 'true'
            {
             before(grammarAccess.getAtomicAccess().getTrueKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__Atomic__Group_0__1__Impl7774); 
             after(grammarAccess.getAtomicAccess().getTrueKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3900:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3904:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3905:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__07809);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__07812);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3912:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3916:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3917:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3917:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3918:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFalseExprAction_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3919:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3921:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFalseExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3931:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3935:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3936:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__17870);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3942:1: rule__Atomic__Group_1__1__Impl : ( 'false' ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3946:1: ( ( 'false' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3947:1: ( 'false' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3947:1: ( 'false' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3948:1: 'false'
            {
             before(grammarAccess.getAtomicAccess().getFalseKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__Atomic__Group_1__1__Impl7898); 
             after(grammarAccess.getAtomicAccess().getFalseKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3965:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3969:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3970:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__07933);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__07936);
            rule__Atomic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3977:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3981:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3982:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3982:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3983:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFieldContentAction_2_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3984:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3986:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFieldContentAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:3996:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4000:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4001:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__17994);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4007:1: rule__Atomic__Group_2__1__Impl : ( 'widgetcontent' ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4011:1: ( ( 'widgetcontent' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4012:1: ( 'widgetcontent' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4012:1: ( 'widgetcontent' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4013:1: 'widgetcontent'
            {
             before(grammarAccess.getAtomicAccess().getWidgetcontentKeyword_2_1()); 
            match(input,46,FOLLOW_46_in_rule__Atomic__Group_2__1__Impl8022); 
             after(grammarAccess.getAtomicAccess().getWidgetcontentKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4030:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4034:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4035:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08057);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08060);
            rule__Atomic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4042:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4046:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4047:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4047:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4048:1: ()
            {
             before(grammarAccess.getAtomicAccess().getLenghtOfAction_3_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4049:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4051:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getLenghtOfAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4061:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4065:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4066:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18118);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18121);
            rule__Atomic__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4073:1: rule__Atomic__Group_3__1__Impl : ( 'lengthOf' ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4077:1: ( ( 'lengthOf' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4078:1: ( 'lengthOf' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4078:1: ( 'lengthOf' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4079:1: 'lengthOf'
            {
             before(grammarAccess.getAtomicAccess().getLengthOfKeyword_3_1()); 
            match(input,47,FOLLOW_47_in_rule__Atomic__Group_3__1__Impl8149); 
             after(grammarAccess.getAtomicAccess().getLengthOfKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4092:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl rule__Atomic__Group_3__3 ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4096:1: ( rule__Atomic__Group_3__2__Impl rule__Atomic__Group_3__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4097:2: rule__Atomic__Group_3__2__Impl rule__Atomic__Group_3__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28180);
            rule__Atomic__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__3_in_rule__Atomic__Group_3__28183);
            rule__Atomic__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__2"


    // $ANTLR start "rule__Atomic__Group_3__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4104:1: rule__Atomic__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4108:1: ( ( '(' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4109:1: ( '(' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4109:1: ( '(' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4110:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__Atomic__Group_3__2__Impl8211); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__2__Impl"


    // $ANTLR start "rule__Atomic__Group_3__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4123:1: rule__Atomic__Group_3__3 : rule__Atomic__Group_3__3__Impl rule__Atomic__Group_3__4 ;
    public final void rule__Atomic__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4127:1: ( rule__Atomic__Group_3__3__Impl rule__Atomic__Group_3__4 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4128:2: rule__Atomic__Group_3__3__Impl rule__Atomic__Group_3__4
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__3__Impl_in_rule__Atomic__Group_3__38242);
            rule__Atomic__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__4_in_rule__Atomic__Group_3__38245);
            rule__Atomic__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__3"


    // $ANTLR start "rule__Atomic__Group_3__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4135:1: rule__Atomic__Group_3__3__Impl : ( ( rule__Atomic__ExprAssignment_3_3 ) ) ;
    public final void rule__Atomic__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4139:1: ( ( ( rule__Atomic__ExprAssignment_3_3 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4140:1: ( ( rule__Atomic__ExprAssignment_3_3 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4140:1: ( ( rule__Atomic__ExprAssignment_3_3 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4141:1: ( rule__Atomic__ExprAssignment_3_3 )
            {
             before(grammarAccess.getAtomicAccess().getExprAssignment_3_3()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4142:1: ( rule__Atomic__ExprAssignment_3_3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4142:2: rule__Atomic__ExprAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Atomic__ExprAssignment_3_3_in_rule__Atomic__Group_3__3__Impl8272);
            rule__Atomic__ExprAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getExprAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__3__Impl"


    // $ANTLR start "rule__Atomic__Group_3__4"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4152:1: rule__Atomic__Group_3__4 : rule__Atomic__Group_3__4__Impl ;
    public final void rule__Atomic__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4156:1: ( rule__Atomic__Group_3__4__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4157:2: rule__Atomic__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__4__Impl_in_rule__Atomic__Group_3__48302);
            rule__Atomic__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__4"


    // $ANTLR start "rule__Atomic__Group_3__4__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4163:1: rule__Atomic__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4167:1: ( ( ')' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4168:1: ( ')' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4168:1: ( ')' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4169:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_4()); 
            match(input,18,FOLLOW_18_in_rule__Atomic__Group_3__4__Impl8330); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__4__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4192:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4196:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4197:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08371);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08374);
            rule__Atomic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4204:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4208:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4209:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4209:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4210:1: ()
            {
             before(grammarAccess.getAtomicAccess().getParenExprAction_4_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4211:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4213:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getParenExprAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4223:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4227:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4228:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18432);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__2_in_rule__Atomic__Group_4__18435);
            rule__Atomic__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4235:1: rule__Atomic__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4239:1: ( ( '(' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4240:1: ( '(' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4240:1: ( '(' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4241:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,17,FOLLOW_17_in_rule__Atomic__Group_4__1__Impl8463); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4254:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4258:1: ( rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4259:2: rule__Atomic__Group_4__2__Impl rule__Atomic__Group_4__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__2__Impl_in_rule__Atomic__Group_4__28494);
            rule__Atomic__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__3_in_rule__Atomic__Group_4__28497);
            rule__Atomic__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__2"


    // $ANTLR start "rule__Atomic__Group_4__2__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4266:1: rule__Atomic__Group_4__2__Impl : ( ( rule__Atomic__ExprAssignment_4_2 ) ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4270:1: ( ( ( rule__Atomic__ExprAssignment_4_2 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4271:1: ( ( rule__Atomic__ExprAssignment_4_2 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4271:1: ( ( rule__Atomic__ExprAssignment_4_2 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4272:1: ( rule__Atomic__ExprAssignment_4_2 )
            {
             before(grammarAccess.getAtomicAccess().getExprAssignment_4_2()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4273:1: ( rule__Atomic__ExprAssignment_4_2 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4273:2: rule__Atomic__ExprAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Atomic__ExprAssignment_4_2_in_rule__Atomic__Group_4__2__Impl8524);
            rule__Atomic__ExprAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getExprAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__2__Impl"


    // $ANTLR start "rule__Atomic__Group_4__3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4283:1: rule__Atomic__Group_4__3 : rule__Atomic__Group_4__3__Impl ;
    public final void rule__Atomic__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4287:1: ( rule__Atomic__Group_4__3__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4288:2: rule__Atomic__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__3__Impl_in_rule__Atomic__Group_4__38554);
            rule__Atomic__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__3"


    // $ANTLR start "rule__Atomic__Group_4__3__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4294:1: rule__Atomic__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4298:1: ( ( ')' ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4299:1: ( ')' )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4299:1: ( ')' )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4300:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_4_3()); 
            match(input,18,FOLLOW_18_in_rule__Atomic__Group_4__3__Impl8582); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__3__Impl"


    // $ANTLR start "rule__Atomic__Group_5__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4321:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4325:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4326:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_5__0__Impl_in_rule__Atomic__Group_5__08621);
            rule__Atomic__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_5__1_in_rule__Atomic__Group_5__08624);
            rule__Atomic__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__0"


    // $ANTLR start "rule__Atomic__Group_5__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4333:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4337:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4338:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4338:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4339:1: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberLiteralAction_5_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4340:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4342:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getNumberLiteralAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__0__Impl"


    // $ANTLR start "rule__Atomic__Group_5__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4352:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4356:1: ( rule__Atomic__Group_5__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4357:2: rule__Atomic__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_5__1__Impl_in_rule__Atomic__Group_5__18682);
            rule__Atomic__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__1"


    // $ANTLR start "rule__Atomic__Group_5__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4363:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__ValueAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4367:1: ( ( ( rule__Atomic__ValueAssignment_5_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4368:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4368:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4369:1: ( rule__Atomic__ValueAssignment_5_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4370:1: ( rule__Atomic__ValueAssignment_5_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4370:2: rule__Atomic__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_5_1_in_rule__Atomic__Group_5__1__Impl8709);
            rule__Atomic__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__1__Impl"


    // $ANTLR start "rule__Atomic__Group_6__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4384:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4388:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4389:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_6__0__Impl_in_rule__Atomic__Group_6__08743);
            rule__Atomic__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_6__1_in_rule__Atomic__Group_6__08746);
            rule__Atomic__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__0"


    // $ANTLR start "rule__Atomic__Group_6__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4396:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4400:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4401:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4401:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4402:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringLiteralAction_6_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4403:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4405:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringLiteralAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__0__Impl"


    // $ANTLR start "rule__Atomic__Group_6__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4415:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4419:1: ( rule__Atomic__Group_6__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4420:2: rule__Atomic__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_6__1__Impl_in_rule__Atomic__Group_6__18804);
            rule__Atomic__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__1"


    // $ANTLR start "rule__Atomic__Group_6__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4426:1: rule__Atomic__Group_6__1__Impl : ( ( rule__Atomic__ValueAssignment_6_1 ) ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4430:1: ( ( ( rule__Atomic__ValueAssignment_6_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4431:1: ( ( rule__Atomic__ValueAssignment_6_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4431:1: ( ( rule__Atomic__ValueAssignment_6_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4432:1: ( rule__Atomic__ValueAssignment_6_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_6_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4433:1: ( rule__Atomic__ValueAssignment_6_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4433:2: rule__Atomic__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_6_1_in_rule__Atomic__Group_6__1__Impl8831);
            rule__Atomic__ValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__1__Impl"


    // $ANTLR start "rule__Atomic__Group_7__0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4447:1: rule__Atomic__Group_7__0 : rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 ;
    public final void rule__Atomic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4451:1: ( rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4452:2: rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_7__0__Impl_in_rule__Atomic__Group_7__08865);
            rule__Atomic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_7__1_in_rule__Atomic__Group_7__08868);
            rule__Atomic__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_7__0"


    // $ANTLR start "rule__Atomic__Group_7__0__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4459:1: rule__Atomic__Group_7__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4463:1: ( ( () ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4464:1: ( () )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4464:1: ( () )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4465:1: ()
            {
             before(grammarAccess.getAtomicAccess().getAttributeRefAction_7_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4466:1: ()
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4468:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getAttributeRefAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_7__0__Impl"


    // $ANTLR start "rule__Atomic__Group_7__1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4478:1: rule__Atomic__Group_7__1 : rule__Atomic__Group_7__1__Impl ;
    public final void rule__Atomic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4482:1: ( rule__Atomic__Group_7__1__Impl )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4483:2: rule__Atomic__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_7__1__Impl_in_rule__Atomic__Group_7__18926);
            rule__Atomic__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_7__1"


    // $ANTLR start "rule__Atomic__Group_7__1__Impl"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4489:1: rule__Atomic__Group_7__1__Impl : ( ( rule__Atomic__AttrAssignment_7_1 ) ) ;
    public final void rule__Atomic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4493:1: ( ( ( rule__Atomic__AttrAssignment_7_1 ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4494:1: ( ( rule__Atomic__AttrAssignment_7_1 ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4494:1: ( ( rule__Atomic__AttrAssignment_7_1 ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4495:1: ( rule__Atomic__AttrAssignment_7_1 )
            {
             before(grammarAccess.getAtomicAccess().getAttrAssignment_7_1()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4496:1: ( rule__Atomic__AttrAssignment_7_1 )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4496:2: rule__Atomic__AttrAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Atomic__AttrAssignment_7_1_in_rule__Atomic__Group_7__1__Impl8953);
            rule__Atomic__AttrAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAttrAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_7__1__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment_0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4511:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4515:1: ( ( ruleEntity ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4516:1: ( ruleEntity )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4516:1: ( ruleEntity )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4517:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment_08992);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment_0"


    // $ANTLR start "rule__Model__FormsAssignment_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4526:1: rule__Model__FormsAssignment_1 : ( ruleForm ) ;
    public final void rule__Model__FormsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4530:1: ( ( ruleForm ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4531:1: ( ruleForm )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4531:1: ( ruleForm )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4532:1: ruleForm
            {
             before(grammarAccess.getModelAccess().getFormsFormParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleForm_in_rule__Model__FormsAssignment_19023);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormsFormParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormsAssignment_1"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4541:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4545:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4546:1: ( RULE_ID )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4546:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4547:1: RULE_ID
            {
             before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Form__NameAssignment_19054); 
             after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__EntityAssignment_3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4556:1: rule__Form__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Form__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4560:1: ( ( ( RULE_ID ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4561:1: ( ( RULE_ID ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4561:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4562:1: ( RULE_ID )
            {
             before(grammarAccess.getFormAccess().getEntityEntityCrossReference_3_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4563:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4564:1: RULE_ID
            {
             before(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_39089); 
             after(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFormAccess().getEntityEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__EntityAssignment_3"


    // $ANTLR start "rule__Form__WidgetsAssignment_5"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4575:1: rule__Form__WidgetsAssignment_5 : ( ruleWidget ) ;
    public final void rule__Form__WidgetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4579:1: ( ( ruleWidget ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4580:1: ( ruleWidget )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4580:1: ( ruleWidget )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4581:1: ruleWidget
            {
             before(grammarAccess.getFormAccess().getWidgetsWidgetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Form__WidgetsAssignment_59124);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getFormAccess().getWidgetsWidgetParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__WidgetsAssignment_5"


    // $ANTLR start "rule__TextWidget__LengthAssignment_2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4590:1: rule__TextWidget__LengthAssignment_2 : ( RULE_DECIMAL_NUMBER ) ;
    public final void rule__TextWidget__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4594:1: ( ( RULE_DECIMAL_NUMBER ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4595:1: ( RULE_DECIMAL_NUMBER )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4595:1: ( RULE_DECIMAL_NUMBER )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4596:1: RULE_DECIMAL_NUMBER
            {
             before(grammarAccess.getTextWidgetAccess().getLengthDECIMAL_NUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_DECIMAL_NUMBER,FOLLOW_RULE_DECIMAL_NUMBER_in_rule__TextWidget__LengthAssignment_29155); 
             after(grammarAccess.getTextWidgetAccess().getLengthDECIMAL_NUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__LengthAssignment_2"


    // $ANTLR start "rule__TextWidget__AttrAssignment_5"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4605:1: rule__TextWidget__AttrAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TextWidget__AttrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4609:1: ( ( ( RULE_ID ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4610:1: ( ( RULE_ID ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4610:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4611:1: ( RULE_ID )
            {
             before(grammarAccess.getTextWidgetAccess().getAttrAttributeCrossReference_5_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4612:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4613:1: RULE_ID
            {
             before(grammarAccess.getTextWidgetAccess().getAttrAttributeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextWidget__AttrAssignment_59190); 
             after(grammarAccess.getTextWidgetAccess().getAttrAttributeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTextWidgetAccess().getAttrAttributeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__AttrAssignment_5"


    // $ANTLR start "rule__TextWidget__ValidateAssignment_6_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4624:1: rule__TextWidget__ValidateAssignment_6_1 : ( ruleExpr ) ;
    public final void rule__TextWidget__ValidateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4628:1: ( ( ruleExpr ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4629:1: ( ruleExpr )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4629:1: ( ruleExpr )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4630:1: ruleExpr
            {
             before(grammarAccess.getTextWidgetAccess().getValidateExprParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__TextWidget__ValidateAssignment_6_19225);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getTextWidgetAccess().getValidateExprParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextWidget__ValidateAssignment_6_1"


    // $ANTLR start "rule__CheckBoxWidget__AttrAssignment_2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4639:1: rule__CheckBoxWidget__AttrAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__CheckBoxWidget__AttrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4643:1: ( ( ( RULE_ID ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4644:1: ( ( RULE_ID ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4644:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4645:1: ( RULE_ID )
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getAttrAttributeCrossReference_2_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4646:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4647:1: RULE_ID
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getAttrAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CheckBoxWidget__AttrAssignment_29260); 
             after(grammarAccess.getCheckBoxWidgetAccess().getAttrAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCheckBoxWidgetAccess().getAttrAttributeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__AttrAssignment_2"


    // $ANTLR start "rule__CheckBoxWidget__ValidateAssignment_3_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4658:1: rule__CheckBoxWidget__ValidateAssignment_3_1 : ( ruleExpr ) ;
    public final void rule__CheckBoxWidget__ValidateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4662:1: ( ( ruleExpr ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4663:1: ( ruleExpr )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4663:1: ( ruleExpr )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4664:1: ruleExpr
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getValidateExprParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__CheckBoxWidget__ValidateAssignment_3_19295);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getCheckBoxWidgetAccess().getValidateExprParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__ValidateAssignment_3_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4673:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4677:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4678:1: ( RULE_ID )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4678:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4679:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_19326); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4688:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4692:1: ( ( ruleAttribute ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4693:1: ( ruleAttribute )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4693:1: ( ruleAttribute )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4694:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_39357);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__DerivedAttribute__NameAssignment_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4703:1: rule__DerivedAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DerivedAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4707:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4708:1: ( RULE_ID )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4708:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4709:1: RULE_ID
            {
             before(grammarAccess.getDerivedAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DerivedAttribute__NameAssignment_19388); 
             after(grammarAccess.getDerivedAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__NameAssignment_1"


    // $ANTLR start "rule__DerivedAttribute__ExprAssignment_3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4718:1: rule__DerivedAttribute__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__DerivedAttribute__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4722:1: ( ( ruleExpr ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4723:1: ( ruleExpr )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4723:1: ( ruleExpr )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4724:1: ruleExpr
            {
             before(grammarAccess.getDerivedAttributeAccess().getExprExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__DerivedAttribute__ExprAssignment_39419);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getDerivedAttributeAccess().getExprExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedAttribute__ExprAssignment_3"


    // $ANTLR start "rule__SimpleAttribute__NameAssignment_0"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4733:1: rule__SimpleAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4737:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4738:1: ( RULE_ID )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4738:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4739:1: RULE_ID
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleAttribute__NameAssignment_09450); 
             after(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__NameAssignment_0"


    // $ANTLR start "rule__SimpleAttribute__TypeAssignment_2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4748:1: rule__SimpleAttribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__SimpleAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4752:1: ( ( ruleType ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4753:1: ( ruleType )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4753:1: ( ruleType )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4754:1: ruleType
            {
             before(grammarAccess.getSimpleAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__SimpleAttribute__TypeAssignment_29481);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__TypeAssignment_2"


    // $ANTLR start "rule__EntityType__RefAssignment"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4763:1: rule__EntityType__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4767:1: ( ( ( RULE_ID ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4768:1: ( ( RULE_ID ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4768:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4769:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeAccess().getRefEntityCrossReference_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4770:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4771:1: RULE_ID
            {
             before(grammarAccess.getEntityTypeAccess().getRefEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityType__RefAssignment9516); 
             after(grammarAccess.getEntityTypeAccess().getRefEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getRefEntityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__RefAssignment"


    // $ANTLR start "rule__ComparisonLevel__RightAssignment_1_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4782:1: rule__ComparisonLevel__RightAssignment_1_1 : ( ruleAdditionLevel ) ;
    public final void rule__ComparisonLevel__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4786:1: ( ( ruleAdditionLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4787:1: ( ruleAdditionLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4787:1: ( ruleAdditionLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4788:1: ruleAdditionLevel
            {
             before(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditionLevel_in_rule__ComparisonLevel__RightAssignment_1_19551);
            ruleAdditionLevel();

            state._fsp--;

             after(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonLevel__RightAssignment_1_1"


    // $ANTLR start "rule__AdditionLevel__RightAssignment_1_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4797:1: rule__AdditionLevel__RightAssignment_1_1 : ( ruleMultiplicationLevel ) ;
    public final void rule__AdditionLevel__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4801:1: ( ( ruleMultiplicationLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4802:1: ( ruleMultiplicationLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4802:1: ( ruleMultiplicationLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4803:1: ruleMultiplicationLevel
            {
             before(grammarAccess.getAdditionLevelAccess().getRightMultiplicationLevelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicationLevel_in_rule__AdditionLevel__RightAssignment_1_19582);
            ruleMultiplicationLevel();

            state._fsp--;

             after(grammarAccess.getAdditionLevelAccess().getRightMultiplicationLevelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionLevel__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicationLevel__RightAssignment_1_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4812:1: rule__MultiplicationLevel__RightAssignment_1_1 : ( rulePrefixOpLevel ) ;
    public final void rule__MultiplicationLevel__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4816:1: ( ( rulePrefixOpLevel ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4817:1: ( rulePrefixOpLevel )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4817:1: ( rulePrefixOpLevel )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4818:1: rulePrefixOpLevel
            {
             before(grammarAccess.getMultiplicationLevelAccess().getRightPrefixOpLevelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrefixOpLevel_in_rule__MultiplicationLevel__RightAssignment_1_19613);
            rulePrefixOpLevel();

            state._fsp--;

             after(grammarAccess.getMultiplicationLevelAccess().getRightPrefixOpLevelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationLevel__RightAssignment_1_1"


    // $ANTLR start "rule__PrefixOpLevel__ExprAssignment_0_3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4827:1: rule__PrefixOpLevel__ExprAssignment_0_3 : ( ruleExpr ) ;
    public final void rule__PrefixOpLevel__ExprAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4831:1: ( ( ruleExpr ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4832:1: ( ruleExpr )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4832:1: ( ruleExpr )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4833:1: ruleExpr
            {
             before(grammarAccess.getPrefixOpLevelAccess().getExprExprParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__PrefixOpLevel__ExprAssignment_0_39644);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getPrefixOpLevelAccess().getExprExprParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOpLevel__ExprAssignment_0_3"


    // $ANTLR start "rule__Atomic__ExprAssignment_3_3"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4842:1: rule__Atomic__ExprAssignment_3_3 : ( ruleExpr ) ;
    public final void rule__Atomic__ExprAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4846:1: ( ( ruleExpr ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4847:1: ( ruleExpr )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4847:1: ( ruleExpr )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4848:1: ruleExpr
            {
             before(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atomic__ExprAssignment_3_39675);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ExprAssignment_3_3"


    // $ANTLR start "rule__Atomic__ExprAssignment_4_2"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4857:1: rule__Atomic__ExprAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__Atomic__ExprAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4861:1: ( ( ruleExpr ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4862:1: ( ruleExpr )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4862:1: ( ruleExpr )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4863:1: ruleExpr
            {
             before(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atomic__ExprAssignment_4_29706);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ExprAssignment_4_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_5_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4872:1: rule__Atomic__ValueAssignment_5_1 : ( RULE_DECIMAL_NUMBER ) ;
    public final void rule__Atomic__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4876:1: ( ( RULE_DECIMAL_NUMBER ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4877:1: ( RULE_DECIMAL_NUMBER )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4877:1: ( RULE_DECIMAL_NUMBER )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4878:1: RULE_DECIMAL_NUMBER
            {
             before(grammarAccess.getAtomicAccess().getValueDECIMAL_NUMBERTerminalRuleCall_5_1_0()); 
            match(input,RULE_DECIMAL_NUMBER,FOLLOW_RULE_DECIMAL_NUMBER_in_rule__Atomic__ValueAssignment_5_19737); 
             after(grammarAccess.getAtomicAccess().getValueDECIMAL_NUMBERTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_5_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_6_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4887:1: rule__Atomic__ValueAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4891:1: ( ( RULE_STRING ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4892:1: ( RULE_STRING )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4892:1: ( RULE_STRING )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4893:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_6_19768); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_6_1"


    // $ANTLR start "rule__Atomic__AttrAssignment_7_1"
    // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4902:1: rule__Atomic__AttrAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__AttrAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4906:1: ( ( ( RULE_ID ) ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4907:1: ( ( RULE_ID ) )
            {
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4907:1: ( ( RULE_ID ) )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4908:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getAttrAttributeCrossReference_7_1_0()); 
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4909:1: ( RULE_ID )
            // ../org.typesys.xts.guidsl.ui/src-gen/org/typesys/xts/guidsl/ui/contentassist/antlr/internal/InternalGuiDsl.g:4910:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getAttrAttributeIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__AttrAssignment_7_19803); 
             after(grammarAccess.getAtomicAccess().getAttrAttributeIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getAttrAttributeCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__AttrAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__0_in_ruleForm155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Alternatives_in_ruleWidget215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextWidget_in_entryRuleTextWidget242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextWidget249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__0_in_ruleTextWidget275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBoxWidget309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__0_in_ruleCheckBoxWidget335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedAttribute_in_entryRuleDerivedAttribute482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDerivedAttribute489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__0_in_ruleDerivedAttribute515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__RefAssignment_in_ruleEntityType695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonLevel_in_ruleExpr1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonLevel_in_entryRuleComparisonLevel1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonLevel1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group__0_in_ruleComparisonLevel1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionLevel_in_entryRuleAdditionLevel1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionLevel1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group__0_in_ruleAdditionLevel1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationLevel_in_entryRuleMultiplicationLevel1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationLevel1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group__0_in_ruleMultiplicationLevel1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixOpLevel_in_entryRulePrefixOpLevel1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixOpLevel1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Alternatives_in_rulePrefixOpLevel1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_0_in_rule__Model__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FormsAssignment_1_in_rule__Model__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextWidget_in_rule__Widget__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_rule__Widget__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedAttribute_in_rule__Attribute__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__Type__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__PrimitiveType__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__PrimitiveType__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_0__0_in_rule__ComparisonLevel__Alternatives_1_01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_1__0_in_rule__ComparisonLevel__Alternatives_1_01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_2__0_in_rule__ComparisonLevel__Alternatives_1_01707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_3__0_in_rule__ComparisonLevel__Alternatives_1_01725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_4__0_in_rule__ComparisonLevel__Alternatives_1_01743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_5__0_in_rule__ComparisonLevel__Alternatives_1_01761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_6__0_in_rule__ComparisonLevel__Alternatives_1_01779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_7__0_in_rule__ComparisonLevel__Alternatives_1_01797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_8__0_in_rule__ComparisonLevel__Alternatives_1_01815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_0__0_in_rule__AdditionLevel__Alternatives_1_01848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_1__0_in_rule__AdditionLevel__Alternatives_1_01866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_0__0_in_rule__MultiplicationLevel__Alternatives_1_01899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_1__0_in_rule__MultiplicationLevel__Alternatives_1_01917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__0_in_rule__PrefixOpLevel__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__PrefixOpLevel__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_5__0_in_rule__Atomic__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_6__0_in_rule__Atomic__Alternatives2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_7__0_in_rule__Atomic__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__02157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Form__Group__1_in_rule__Form__Group__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Form__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__12219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Form__Group__2_in_rule__Form__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__NameAssignment_1_in_rule__Form__Group__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__22279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Form__Group__3_in_rule__Form__Group__22282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Form__Group__2__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__32341 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Form__Group__4_in_rule__Form__Group__32344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__EntityAssignment_3_in_rule__Form__Group__3__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__42401 = new BitSet(new long[]{0x0000000000418000L});
    public static final BitSet FOLLOW_rule__Form__Group__5_in_rule__Form__Group__42404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Form__Group__4__Impl2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__52463 = new BitSet(new long[]{0x0000000000418000L});
    public static final BitSet FOLLOW_rule__Form__Group__6_in_rule__Form__Group__52466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__WidgetsAssignment_5_in_rule__Form__Group__5__Impl2493 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__62524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Form__Group__6__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__0__Impl_in_rule__TextWidget__Group__02597 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__1_in_rule__TextWidget__Group__02600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TextWidget__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__1__Impl_in_rule__TextWidget__Group__12659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__2_in_rule__TextWidget__Group__12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TextWidget__Group__1__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__2__Impl_in_rule__TextWidget__Group__22721 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__3_in_rule__TextWidget__Group__22724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__LengthAssignment_2_in_rule__TextWidget__Group__2__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__3__Impl_in_rule__TextWidget__Group__32781 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__4_in_rule__TextWidget__Group__32784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TextWidget__Group__3__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__4__Impl_in_rule__TextWidget__Group__42843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__5_in_rule__TextWidget__Group__42846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TextWidget__Group__4__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__5__Impl_in_rule__TextWidget__Group__52905 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__6_in_rule__TextWidget__Group__52908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__AttrAssignment_5_in_rule__TextWidget__Group__5__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__6__Impl_in_rule__TextWidget__Group__62965 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__7_in_rule__TextWidget__Group__62968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group_6__0_in_rule__TextWidget__Group__6__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group__7__Impl_in_rule__TextWidget__Group__73026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TextWidget__Group__7__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group_6__0__Impl_in_rule__TextWidget__Group_6__03101 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__TextWidget__Group_6__1_in_rule__TextWidget__Group_6__03104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TextWidget__Group_6__0__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__Group_6__1__Impl_in_rule__TextWidget__Group_6__13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextWidget__ValidateAssignment_6_1_in_rule__TextWidget__Group_6__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__0__Impl_in_rule__CheckBoxWidget__Group__03224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__1_in_rule__CheckBoxWidget__Group__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CheckBoxWidget__Group__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__1__Impl_in_rule__CheckBoxWidget__Group__13286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__2_in_rule__CheckBoxWidget__Group__13289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CheckBoxWidget__Group__1__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__2__Impl_in_rule__CheckBoxWidget__Group__23348 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__3_in_rule__CheckBoxWidget__Group__23351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__AttrAssignment_2_in_rule__CheckBoxWidget__Group__2__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__3__Impl_in_rule__CheckBoxWidget__Group__33408 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__4_in_rule__CheckBoxWidget__Group__33411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group_3__0_in_rule__CheckBoxWidget__Group__3__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__4__Impl_in_rule__CheckBoxWidget__Group__43469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CheckBoxWidget__Group__4__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group_3__0__Impl_in_rule__CheckBoxWidget__Group_3__03538 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group_3__1_in_rule__CheckBoxWidget__Group_3__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CheckBoxWidget__Group_3__0__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group_3__1__Impl_in_rule__CheckBoxWidget__Group_3__13600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__ValidateAssignment_3_1_in_rule__CheckBoxWidget__Group_3__1__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__0__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23783 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__2__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33845 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3875 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__4__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__0__Impl_in_rule__DerivedAttribute__Group__03975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__1_in_rule__DerivedAttribute__Group__03978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DerivedAttribute__Group__0__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__1__Impl_in_rule__DerivedAttribute__Group__14037 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__2_in_rule__DerivedAttribute__Group__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__NameAssignment_1_in_rule__DerivedAttribute__Group__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__2__Impl_in_rule__DerivedAttribute__Group__24097 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__3_in_rule__DerivedAttribute__Group__24100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DerivedAttribute__Group__2__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__3__Impl_in_rule__DerivedAttribute__Group__34159 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__4_in_rule__DerivedAttribute__Group__34162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__ExprAssignment_3_in_rule__DerivedAttribute__Group__3__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DerivedAttribute__Group__4__Impl_in_rule__DerivedAttribute__Group__44219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DerivedAttribute__Group__4__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__04288 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__04291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__NameAssignment_0_in_rule__SimpleAttribute__Group__0__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__14348 = new BitSet(new long[]{0x0000000078000010L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SimpleAttribute__Group__1__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__24410 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__3_in_rule__SimpleAttribute__Group__24413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__TypeAssignment_2_in_rule__SimpleAttribute__Group__2__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__3__Impl_in_rule__SimpleAttribute__Group__34470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimpleAttribute__Group__3__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__04537 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__04540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FloatType__Group__1__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__04661 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__04664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__14722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IntType__Group__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0__Impl_in_rule__BooleanType__Group__04785 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__04788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1__Impl_in_rule__BooleanType__Group__14846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BooleanType__Group__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__04909 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__04912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__14970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringType__Group__1__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group__0__Impl_in_rule__ComparisonLevel__Group__05033 = new BitSet(new long[]{0x000000FF80000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group__1_in_rule__ComparisonLevel__Group__05036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionLevel_in_rule__ComparisonLevel__Group__0__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group__1__Impl_in_rule__ComparisonLevel__Group__15092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1__0_in_rule__ComparisonLevel__Group__1__Impl5119 = new BitSet(new long[]{0x000000FF80000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1__0__Impl_in_rule__ComparisonLevel__Group_1__05154 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1__1_in_rule__ComparisonLevel__Group_1__05157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Alternatives_1_0_in_rule__ComparisonLevel__Group_1__0__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1__1__Impl_in_rule__ComparisonLevel__Group_1__15214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__RightAssignment_1_1_in_rule__ComparisonLevel__Group_1__1__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_0__0__Impl_in_rule__ComparisonLevel__Group_1_0_0__05275 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_0__1_in_rule__ComparisonLevel__Group_1_0_0__05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_0__1__Impl_in_rule__ComparisonLevel__Group_1_0_0__15336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ComparisonLevel__Group_1_0_0__1__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_1__0__Impl_in_rule__ComparisonLevel__Group_1_0_1__05399 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_1__1_in_rule__ComparisonLevel__Group_1_0_1__05402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_1__1__Impl_in_rule__ComparisonLevel__Group_1_0_1__15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ComparisonLevel__Group_1_0_1__1__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_2__0__Impl_in_rule__ComparisonLevel__Group_1_0_2__05523 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_2__1_in_rule__ComparisonLevel__Group_1_0_2__05526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_2__1__Impl_in_rule__ComparisonLevel__Group_1_0_2__15584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ComparisonLevel__Group_1_0_2__1__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_3__0__Impl_in_rule__ComparisonLevel__Group_1_0_3__05647 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_3__1_in_rule__ComparisonLevel__Group_1_0_3__05650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_3__1__Impl_in_rule__ComparisonLevel__Group_1_0_3__15708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ComparisonLevel__Group_1_0_3__1__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_4__0__Impl_in_rule__ComparisonLevel__Group_1_0_4__05771 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_4__1_in_rule__ComparisonLevel__Group_1_0_4__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_4__1__Impl_in_rule__ComparisonLevel__Group_1_0_4__15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ComparisonLevel__Group_1_0_4__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_5__0__Impl_in_rule__ComparisonLevel__Group_1_0_5__05895 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_5__1_in_rule__ComparisonLevel__Group_1_0_5__05898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_5__1__Impl_in_rule__ComparisonLevel__Group_1_0_5__15956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ComparisonLevel__Group_1_0_5__1__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_6__0__Impl_in_rule__ComparisonLevel__Group_1_0_6__06019 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_6__1_in_rule__ComparisonLevel__Group_1_0_6__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_6__1__Impl_in_rule__ComparisonLevel__Group_1_0_6__16080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ComparisonLevel__Group_1_0_6__1__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_7__0__Impl_in_rule__ComparisonLevel__Group_1_0_7__06143 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_7__1_in_rule__ComparisonLevel__Group_1_0_7__06146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_7__1__Impl_in_rule__ComparisonLevel__Group_1_0_7__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ComparisonLevel__Group_1_0_7__1__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_8__0__Impl_in_rule__ComparisonLevel__Group_1_0_8__06267 = new BitSet(new long[]{0x000000FF80000000L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_8__1_in_rule__ComparisonLevel__Group_1_0_8__06270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonLevel__Group_1_0_8__1__Impl_in_rule__ComparisonLevel__Group_1_0_8__16328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ComparisonLevel__Group_1_0_8__1__Impl6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group__0__Impl_in_rule__AdditionLevel__Group__06391 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group__1_in_rule__AdditionLevel__Group__06394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationLevel_in_rule__AdditionLevel__Group__0__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group__1__Impl_in_rule__AdditionLevel__Group__16450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1__0_in_rule__AdditionLevel__Group__1__Impl6477 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1__0__Impl_in_rule__AdditionLevel__Group_1__06512 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1__1_in_rule__AdditionLevel__Group_1__06515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Alternatives_1_0_in_rule__AdditionLevel__Group_1__0__Impl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1__1__Impl_in_rule__AdditionLevel__Group_1__16572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__RightAssignment_1_1_in_rule__AdditionLevel__Group_1__1__Impl6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_0__0__Impl_in_rule__AdditionLevel__Group_1_0_0__06633 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_0__1_in_rule__AdditionLevel__Group_1_0_0__06636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_0__1__Impl_in_rule__AdditionLevel__Group_1_0_0__16694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AdditionLevel__Group_1_0_0__1__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_1__0__Impl_in_rule__AdditionLevel__Group_1_0_1__06757 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_1__1_in_rule__AdditionLevel__Group_1_0_1__06760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionLevel__Group_1_0_1__1__Impl_in_rule__AdditionLevel__Group_1_0_1__16818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AdditionLevel__Group_1_0_1__1__Impl6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group__0__Impl_in_rule__MultiplicationLevel__Group__06881 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group__1_in_rule__MultiplicationLevel__Group__06884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixOpLevel_in_rule__MultiplicationLevel__Group__0__Impl6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group__1__Impl_in_rule__MultiplicationLevel__Group__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1__0_in_rule__MultiplicationLevel__Group__1__Impl6967 = new BitSet(new long[]{0x0000040001000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1__0__Impl_in_rule__MultiplicationLevel__Group_1__07002 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1__1_in_rule__MultiplicationLevel__Group_1__07005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Alternatives_1_0_in_rule__MultiplicationLevel__Group_1__0__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1__1__Impl_in_rule__MultiplicationLevel__Group_1__17062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__RightAssignment_1_1_in_rule__MultiplicationLevel__Group_1__1__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_0__0__Impl_in_rule__MultiplicationLevel__Group_1_0_0__07123 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_0__1_in_rule__MultiplicationLevel__Group_1_0_0__07126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_0__1__Impl_in_rule__MultiplicationLevel__Group_1_0_0__17184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MultiplicationLevel__Group_1_0_0__1__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_1__0__Impl_in_rule__MultiplicationLevel__Group_1_0_1__07247 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_1__1_in_rule__MultiplicationLevel__Group_1_0_1__07250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationLevel__Group_1_0_1__1__Impl_in_rule__MultiplicationLevel__Group_1_0_1__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiplicationLevel__Group_1_0_1__1__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__0__Impl_in_rule__PrefixOpLevel__Group_0__07371 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__1_in_rule__PrefixOpLevel__Group_0__07374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__1__Impl_in_rule__PrefixOpLevel__Group_0__17432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__2_in_rule__PrefixOpLevel__Group_0__17435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PrefixOpLevel__Group_0__1__Impl7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__2__Impl_in_rule__PrefixOpLevel__Group_0__27494 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__3_in_rule__PrefixOpLevel__Group_0__27497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrefixOpLevel__Group_0__2__Impl7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__3__Impl_in_rule__PrefixOpLevel__Group_0__37556 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__4_in_rule__PrefixOpLevel__Group_0__37559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__ExprAssignment_0_3_in_rule__PrefixOpLevel__Group_0__3__Impl7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOpLevel__Group_0__4__Impl_in_rule__PrefixOpLevel__Group_0__47616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrefixOpLevel__Group_0__4__Impl7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07685 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Atomic__Group_0__1__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__07809 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__07812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__17870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Atomic__Group_1__1__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__07933 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__07936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__17994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Atomic__Group_2__1__Impl8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__08057 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__08060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__18118 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__18121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Atomic__Group_3__1__Impl8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__28180 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__3_in_rule__Atomic__Group_3__28183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atomic__Group_3__2__Impl8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__3__Impl_in_rule__Atomic__Group_3__38242 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__4_in_rule__Atomic__Group_3__38245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ExprAssignment_3_3_in_rule__Atomic__Group_3__3__Impl8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__4__Impl_in_rule__Atomic__Group_3__48302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Atomic__Group_3__4__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__08371 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__08374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__18432 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__2_in_rule__Atomic__Group_4__18435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atomic__Group_4__1__Impl8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__2__Impl_in_rule__Atomic__Group_4__28494 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__3_in_rule__Atomic__Group_4__28497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ExprAssignment_4_2_in_rule__Atomic__Group_4__2__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__3__Impl_in_rule__Atomic__Group_4__38554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Atomic__Group_4__3__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_5__0__Impl_in_rule__Atomic__Group_5__08621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_5__1_in_rule__Atomic__Group_5__08624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_5__1__Impl_in_rule__Atomic__Group_5__18682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_5_1_in_rule__Atomic__Group_5__1__Impl8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_6__0__Impl_in_rule__Atomic__Group_6__08743 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_6__1_in_rule__Atomic__Group_6__08746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_6__1__Impl_in_rule__Atomic__Group_6__18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_6_1_in_rule__Atomic__Group_6__1__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_7__0__Impl_in_rule__Atomic__Group_7__08865 = new BitSet(new long[]{0x0000F80000020070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_7__1_in_rule__Atomic__Group_7__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_7__1__Impl_in_rule__Atomic__Group_7__18926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__AttrAssignment_7_1_in_rule__Atomic__Group_7__1__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment_08992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForm_in_rule__Model__FormsAssignment_19023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Form__NameAssignment_19054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Form__EntityAssignment_39089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Form__WidgetsAssignment_59124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_NUMBER_in_rule__TextWidget__LengthAssignment_29155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextWidget__AttrAssignment_59190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__TextWidget__ValidateAssignment_6_19225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CheckBoxWidget__AttrAssignment_29260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CheckBoxWidget__ValidateAssignment_3_19295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_19326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_39357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DerivedAttribute__NameAssignment_19388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__DerivedAttribute__ExprAssignment_39419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleAttribute__NameAssignment_09450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__SimpleAttribute__TypeAssignment_29481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityType__RefAssignment9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionLevel_in_rule__ComparisonLevel__RightAssignment_1_19551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationLevel_in_rule__AdditionLevel__RightAssignment_1_19582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixOpLevel_in_rule__MultiplicationLevel__RightAssignment_1_19613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__PrefixOpLevel__ExprAssignment_0_39644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atomic__ExprAssignment_3_39675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atomic__ExprAssignment_4_29706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_NUMBER_in_rule__Atomic__ValueAssignment_5_19737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_6_19768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__AttrAssignment_7_19803 = new BitSet(new long[]{0x0000000000000002L});

}
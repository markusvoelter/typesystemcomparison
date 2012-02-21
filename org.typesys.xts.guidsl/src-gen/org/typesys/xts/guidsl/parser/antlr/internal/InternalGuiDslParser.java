package org.typesys.xts.guidsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.typesys.xts.guidsl.services.GuiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'edits'", "'{'", "'}'", "'text'", "'('", "')'", "'->'", "'validate'", "';'", "'checkbox'", "'entity'", "'/'", "'='", "':'", "'float'", "'int'", "'bool'", "'string'", "'=='", "'!='", "'>'", "'>='", "'<='", "'&&'", "'=>'", "'||'", "'<'", "'+'", "'-'", "'*'", "'!'", "'true'", "'false'", "'widgetcontent'", "'lengthOf'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGuiDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g"; }



     	private GuiDslGrammarAccess grammarAccess;
     	
        public InternalGuiDslParser(TokenStream input, GuiDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GuiDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_forms_1_0= ruleForm ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_forms_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:79:28: ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_forms_1_0= ruleForm ) ) )* )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:80:1: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_forms_1_0= ruleForm ) ) )*
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:80:1: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_forms_1_0= ruleForm ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }
                else if ( (LA1_0==11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:80:2: ( (lv_entities_0_0= ruleEntity ) )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:80:2: ( (lv_entities_0_0= ruleEntity ) )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:81:1: (lv_entities_0_0= ruleEntity )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:81:1: (lv_entities_0_0= ruleEntity )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:82:3: lv_entities_0_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel131);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_0_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:99:6: ( (lv_forms_1_0= ruleForm ) )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:99:6: ( (lv_forms_1_0= ruleForm ) )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:100:1: (lv_forms_1_0= ruleForm )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:100:1: (lv_forms_1_0= ruleForm )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:101:3: lv_forms_1_0= ruleForm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFormsFormParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForm_in_ruleModel158);
            	    lv_forms_1_0=ruleForm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"forms",
            	            		lv_forms_1_0, 
            	            		"Form");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleForm"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:125:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:126:2: (iv_ruleForm= ruleForm EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:127:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm195);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm205); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:134:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_widgets_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:137:28: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:138:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:138:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:138:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'edits' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleForm242); 

                	newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:143:1: (lv_name_1_0= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm259); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleForm276); 

                	newLeafNode(otherlv_2, grammarAccess.getFormAccess().getEditsKeyword_2());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:164:1: ( (otherlv_3= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:165:1: (otherlv_3= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:165:1: (otherlv_3= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:166:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm296); 

            		newLeafNode(otherlv_3, grammarAccess.getFormAccess().getEntityEntityCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleForm308); 

                	newLeafNode(otherlv_4, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:181:1: ( (lv_widgets_5_0= ruleWidget ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:182:1: (lv_widgets_5_0= ruleWidget )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:182:1: (lv_widgets_5_0= ruleWidget )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:183:3: lv_widgets_5_0= ruleWidget
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormAccess().getWidgetsWidgetParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidget_in_ruleForm329);
            	    lv_widgets_5_0=ruleWidget();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_5_0, 
            	            		"Widget");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleForm342); 

                	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleWidget"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:211:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:212:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:213:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget378);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget388); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:220:1: ruleWidget returns [EObject current=null] : (this_TextWidget_0= ruleTextWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_TextWidget_0 = null;

        EObject this_CheckBoxWidget_1 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:223:28: ( (this_TextWidget_0= ruleTextWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:224:1: (this_TextWidget_0= ruleTextWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:224:1: (this_TextWidget_0= ruleTextWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:225:5: this_TextWidget_0= ruleTextWidget
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getTextWidgetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextWidget_in_ruleWidget435);
                    this_TextWidget_0=ruleTextWidget();

                    state._fsp--;

                     
                            current = this_TextWidget_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:235:5: this_CheckBoxWidget_1= ruleCheckBoxWidget
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCheckBoxWidgetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckBoxWidget_in_ruleWidget462);
                    this_CheckBoxWidget_1=ruleCheckBoxWidget();

                    state._fsp--;

                     
                            current = this_CheckBoxWidget_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextWidget"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:251:1: entryRuleTextWidget returns [EObject current=null] : iv_ruleTextWidget= ruleTextWidget EOF ;
    public final EObject entryRuleTextWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextWidget = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:252:2: (iv_ruleTextWidget= ruleTextWidget EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:253:2: iv_ruleTextWidget= ruleTextWidget EOF
            {
             newCompositeNode(grammarAccess.getTextWidgetRule()); 
            pushFollow(FOLLOW_ruleTextWidget_in_entryRuleTextWidget497);
            iv_ruleTextWidget=ruleTextWidget();

            state._fsp--;

             current =iv_ruleTextWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextWidget507); 

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
    // $ANTLR end "entryRuleTextWidget"


    // $ANTLR start "ruleTextWidget"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:260:1: ruleTextWidget returns [EObject current=null] : (otherlv_0= 'text' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleTextWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_validate_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:263:28: ( (otherlv_0= 'text' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) ) )? otherlv_8= ';' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:264:1: (otherlv_0= 'text' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) ) )? otherlv_8= ';' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:264:1: (otherlv_0= 'text' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) ) )? otherlv_8= ';' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:264:3: otherlv_0= 'text' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTextWidget544); 

                	newLeafNode(otherlv_0, grammarAccess.getTextWidgetAccess().getTextKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTextWidget556); 

                	newLeafNode(otherlv_1, grammarAccess.getTextWidgetAccess().getLeftParenthesisKeyword_1());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:272:1: ( (lv_length_2_0= RULE_INT ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:273:1: (lv_length_2_0= RULE_INT )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:273:1: (lv_length_2_0= RULE_INT )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:274:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextWidget573); 

            			newLeafNode(lv_length_2_0, grammarAccess.getTextWidgetAccess().getLengthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextWidgetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTextWidget590); 

                	newLeafNode(otherlv_3, grammarAccess.getTextWidgetAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTextWidget602); 

                	newLeafNode(otherlv_4, grammarAccess.getTextWidgetAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:298:1: ( (otherlv_5= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:299:1: (otherlv_5= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:299:1: (otherlv_5= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:300:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTextWidgetRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextWidget622); 

            		newLeafNode(otherlv_5, grammarAccess.getTextWidgetAccess().getAttrAttributeCrossReference_5_0()); 
            	

            }


            }

            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:311:2: (otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:311:4: otherlv_6= 'validate' ( (lv_validate_7_0= ruleExpr ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTextWidget635); 

                        	newLeafNode(otherlv_6, grammarAccess.getTextWidgetAccess().getValidateKeyword_6_0());
                        
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:315:1: ( (lv_validate_7_0= ruleExpr ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:316:1: (lv_validate_7_0= ruleExpr )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:316:1: (lv_validate_7_0= ruleExpr )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:317:3: lv_validate_7_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextWidgetAccess().getValidateExprParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleTextWidget656);
                    lv_validate_7_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextWidgetRule());
                    	        }
                           		set(
                           			current, 
                           			"validate",
                            		lv_validate_7_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTextWidget670); 

                	newLeafNode(otherlv_8, grammarAccess.getTextWidgetAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleTextWidget"


    // $ANTLR start "entryRuleCheckBoxWidget"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:345:1: entryRuleCheckBoxWidget returns [EObject current=null] : iv_ruleCheckBoxWidget= ruleCheckBoxWidget EOF ;
    public final EObject entryRuleCheckBoxWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBoxWidget = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:346:2: (iv_ruleCheckBoxWidget= ruleCheckBoxWidget EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:347:2: iv_ruleCheckBoxWidget= ruleCheckBoxWidget EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxWidgetRule()); 
            pushFollow(FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget706);
            iv_ruleCheckBoxWidget=ruleCheckBoxWidget();

            state._fsp--;

             current =iv_ruleCheckBoxWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBoxWidget716); 

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
    // $ANTLR end "entryRuleCheckBoxWidget"


    // $ANTLR start "ruleCheckBoxWidget"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:354:1: ruleCheckBoxWidget returns [EObject current=null] : (otherlv_0= 'checkbox' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleCheckBoxWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_validate_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:357:28: ( (otherlv_0= 'checkbox' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) ) )? otherlv_5= ';' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:358:1: (otherlv_0= 'checkbox' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) ) )? otherlv_5= ';' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:358:1: (otherlv_0= 'checkbox' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) ) )? otherlv_5= ';' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:358:3: otherlv_0= 'checkbox' otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCheckBoxWidget753); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckBoxWidgetAccess().getCheckboxKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCheckBoxWidget765); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckBoxWidgetAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:366:1: ( (otherlv_2= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:367:1: (otherlv_2= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:367:1: (otherlv_2= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:368:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckBoxWidgetRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckBoxWidget785); 

            		newLeafNode(otherlv_2, grammarAccess.getCheckBoxWidgetAccess().getAttrAttributeCrossReference_2_0()); 
            	

            }


            }

            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:379:2: (otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:379:4: otherlv_3= 'validate' ( (lv_validate_4_0= ruleExpr ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCheckBoxWidget798); 

                        	newLeafNode(otherlv_3, grammarAccess.getCheckBoxWidgetAccess().getValidateKeyword_3_0());
                        
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:383:1: ( (lv_validate_4_0= ruleExpr ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:384:1: (lv_validate_4_0= ruleExpr )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:384:1: (lv_validate_4_0= ruleExpr )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:385:3: lv_validate_4_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckBoxWidgetAccess().getValidateExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleCheckBoxWidget819);
                    lv_validate_4_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckBoxWidgetRule());
                    	        }
                           		set(
                           			current, 
                           			"validate",
                            		lv_validate_4_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCheckBoxWidget833); 

                	newLeafNode(otherlv_5, grammarAccess.getCheckBoxWidgetAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleCheckBoxWidget"


    // $ANTLR start "entryRuleEntity"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:413:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:414:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:415:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity869);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity879); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:422:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:425:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:426:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:426:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:426:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEntity916); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:430:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:431:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:431:1: (lv_name_1_0= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:432:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity933); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEntity950); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:452:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:453:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:453:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:454:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity971);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEntity984); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:482:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:483:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:484:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1020);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1030); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:491:1: ruleAttribute returns [EObject current=null] : (this_SimpleAttribute_0= ruleSimpleAttribute | this_DerivedAttribute_1= ruleDerivedAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttribute_0 = null;

        EObject this_DerivedAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:494:28: ( (this_SimpleAttribute_0= ruleSimpleAttribute | this_DerivedAttribute_1= ruleDerivedAttribute ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:495:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_DerivedAttribute_1= ruleDerivedAttribute )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:495:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_DerivedAttribute_1= ruleDerivedAttribute )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:496:5: this_SimpleAttribute_0= ruleSimpleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_ruleAttribute1077);
                    this_SimpleAttribute_0=ruleSimpleAttribute();

                    state._fsp--;

                     
                            current = this_SimpleAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:506:5: this_DerivedAttribute_1= ruleDerivedAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getDerivedAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDerivedAttribute_in_ruleAttribute1104);
                    this_DerivedAttribute_1=ruleDerivedAttribute();

                    state._fsp--;

                     
                            current = this_DerivedAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDerivedAttribute"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:522:1: entryRuleDerivedAttribute returns [EObject current=null] : iv_ruleDerivedAttribute= ruleDerivedAttribute EOF ;
    public final EObject entryRuleDerivedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedAttribute = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:523:2: (iv_ruleDerivedAttribute= ruleDerivedAttribute EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:524:2: iv_ruleDerivedAttribute= ruleDerivedAttribute EOF
            {
             newCompositeNode(grammarAccess.getDerivedAttributeRule()); 
            pushFollow(FOLLOW_ruleDerivedAttribute_in_entryRuleDerivedAttribute1139);
            iv_ruleDerivedAttribute=ruleDerivedAttribute();

            state._fsp--;

             current =iv_ruleDerivedAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDerivedAttribute1149); 

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
    // $ANTLR end "entryRuleDerivedAttribute"


    // $ANTLR start "ruleDerivedAttribute"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:531:1: ruleDerivedAttribute returns [EObject current=null] : (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ) ;
    public final EObject ruleDerivedAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:534:28: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:535:1: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:535:1: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:535:3: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDerivedAttribute1186); 

                	newLeafNode(otherlv_0, grammarAccess.getDerivedAttributeAccess().getSolidusKeyword_0());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:539:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:540:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:540:1: (lv_name_1_0= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:541:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDerivedAttribute1203); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDerivedAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDerivedAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDerivedAttribute1220); 

                	newLeafNode(otherlv_2, grammarAccess.getDerivedAttributeAccess().getEqualsSignKeyword_2());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:561:1: ( (lv_expr_3_0= ruleExpr ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:562:1: (lv_expr_3_0= ruleExpr )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:562:1: (lv_expr_3_0= ruleExpr )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:563:3: lv_expr_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getDerivedAttributeAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleDerivedAttribute1241);
            lv_expr_3_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDerivedAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleDerivedAttribute1253); 

                	newLeafNode(otherlv_4, grammarAccess.getDerivedAttributeAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleDerivedAttribute"


    // $ANTLR start "entryRuleSimpleAttribute"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:591:1: entryRuleSimpleAttribute returns [EObject current=null] : iv_ruleSimpleAttribute= ruleSimpleAttribute EOF ;
    public final EObject entryRuleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttribute = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:592:2: (iv_ruleSimpleAttribute= ruleSimpleAttribute EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:593:2: iv_ruleSimpleAttribute= ruleSimpleAttribute EOF
            {
             newCompositeNode(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1289);
            iv_ruleSimpleAttribute=ruleSimpleAttribute();

            state._fsp--;

             current =iv_ruleSimpleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute1299); 

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
    // $ANTLR end "entryRuleSimpleAttribute"


    // $ANTLR start "ruleSimpleAttribute"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:600:1: ruleSimpleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) ;
    public final EObject ruleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:603:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:604:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:604:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:604:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';'
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:604:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:605:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:605:1: (lv_name_0_0= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:606:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleAttribute1341); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSimpleAttribute1358); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleAttributeAccess().getColonKeyword_1());
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:626:1: ( (lv_type_2_0= ruleType ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:627:1: (lv_type_2_0= ruleType )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:627:1: (lv_type_2_0= ruleType )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:628:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSimpleAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSimpleAttribute1379);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSimpleAttribute1391); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleAttributeAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleSimpleAttribute"


    // $ANTLR start "entryRuleType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:656:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:657:2: (iv_ruleType= ruleType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:658:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1427);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1437); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:665:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:668:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_EntityType_1= ruleEntityType ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:669:1: (this_PrimitiveType_0= rulePrimitiveType | this_EntityType_1= ruleEntityType )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:669:1: (this_PrimitiveType_0= rulePrimitiveType | this_EntityType_1= ruleEntityType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=29)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:670:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType1484);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:680:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleType1511);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:696:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:697:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:698:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1546);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1556); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:705:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:708:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:709:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:709:1: ( (otherlv_0= RULE_ID ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:710:1: (otherlv_0= RULE_ID )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:710:1: (otherlv_0= RULE_ID )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:711:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityType1600); 

            		newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getRefEntityCrossReference_0()); 
            	

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:730:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:731:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:732:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1635);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1645); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:739:1: rulePrimitiveType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_FloatType_1 = null;

        EObject this_BooleanType_2 = null;

        EObject this_StringType_3 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:742:28: ( (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:743:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:743:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BooleanType_2= ruleBooleanType | this_StringType_3= ruleStringType )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:744:5: this_IntType_0= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_rulePrimitiveType1692);
                    this_IntType_0=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:754:5: this_FloatType_1= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_rulePrimitiveType1719);
                    this_FloatType_1=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:764:5: this_BooleanType_2= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_rulePrimitiveType1746);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:774:5: this_StringType_3= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_rulePrimitiveType1773);
                    this_StringType_3=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleFloatType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:790:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:791:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:792:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType1808);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType1818); 

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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:799:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:802:28: ( ( () otherlv_1= 'float' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:803:1: ( () otherlv_1= 'float' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:803:1: ( () otherlv_1= 'float' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:803:2: () otherlv_1= 'float'
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:803:2: ()
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:804:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleFloatType1864); 

                	newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getFloatKeyword_1());
                

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
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleIntType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:821:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:822:2: (iv_ruleIntType= ruleIntType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:823:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType1900);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType1910); 

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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:830:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:833:28: ( ( () otherlv_1= 'int' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:834:1: ( () otherlv_1= 'int' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:834:1: ( () otherlv_1= 'int' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:834:2: () otherlv_1= 'int'
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:834:2: ()
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:835:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIntType1956); 

                	newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
                

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:852:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:853:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:854:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1992);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType2002); 

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:861:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:864:28: ( ( () otherlv_1= 'bool' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:865:1: ( () otherlv_1= 'bool' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:865:1: ( () otherlv_1= 'bool' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:865:2: () otherlv_1= 'bool'
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:865:2: ()
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:866:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleBooleanType2048); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBoolKeyword_1());
                

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:883:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:884:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:885:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType2084);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType2094); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:892:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:895:28: ( ( () otherlv_1= 'string' ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:896:1: ( () otherlv_1= 'string' )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:896:1: ( () otherlv_1= 'string' )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:896:2: () otherlv_1= 'string'
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:896:2: ()
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:897:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleStringType2140); 

                	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
                

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleExpr"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:914:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:915:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:916:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2176);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2186); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:923:1: ruleExpr returns [EObject current=null] : this_ComparisonLevel_0= ruleComparisonLevel ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonLevel_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:926:28: (this_ComparisonLevel_0= ruleComparisonLevel )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:928:5: this_ComparisonLevel_0= ruleComparisonLevel
            {
             
                    newCompositeNode(grammarAccess.getExprAccess().getComparisonLevelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleComparisonLevel_in_ruleExpr2232);
            this_ComparisonLevel_0=ruleComparisonLevel();

            state._fsp--;

             
                    current = this_ComparisonLevel_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleComparisonLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:944:1: entryRuleComparisonLevel returns [EObject current=null] : iv_ruleComparisonLevel= ruleComparisonLevel EOF ;
    public final EObject entryRuleComparisonLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonLevel = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:945:2: (iv_ruleComparisonLevel= ruleComparisonLevel EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:946:2: iv_ruleComparisonLevel= ruleComparisonLevel EOF
            {
             newCompositeNode(grammarAccess.getComparisonLevelRule()); 
            pushFollow(FOLLOW_ruleComparisonLevel_in_entryRuleComparisonLevel2266);
            iv_ruleComparisonLevel=ruleComparisonLevel();

            state._fsp--;

             current =iv_ruleComparisonLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonLevel2276); 

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
    // $ANTLR end "entryRuleComparisonLevel"


    // $ANTLR start "ruleComparisonLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:953:1: ruleComparisonLevel returns [EObject current=null] : (this_AdditionLevel_0= ruleAdditionLevel ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) ) )* ) ;
    public final EObject ruleComparisonLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject this_AdditionLevel_0 = null;

        EObject lv_right_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:956:28: ( (this_AdditionLevel_0= ruleAdditionLevel ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) ) )* ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:957:1: (this_AdditionLevel_0= ruleAdditionLevel ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) ) )* )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:957:1: (this_AdditionLevel_0= ruleAdditionLevel ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) ) )* )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:958:5: this_AdditionLevel_0= ruleAdditionLevel ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonLevelAccess().getAdditionLevelParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAdditionLevel_in_ruleComparisonLevel2323);
            this_AdditionLevel_0=ruleAdditionLevel();

            state._fsp--;

             
                    current = this_AdditionLevel_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:1: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=30 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:2: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) ) ( (lv_right_19_0= ruleAdditionLevel ) )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:2: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '&&' ) | ( () otherlv_14= '=>' ) | ( () otherlv_16= '||' ) | ( () otherlv_18= '<' ) )
            	    int alt10=9;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt10=5;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt10=6;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt10=7;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt10=8;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt10=9;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:3: ( () otherlv_2= '==' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:3: ( () otherlv_2= '==' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:4: () otherlv_2= '=='
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:966:4: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:967:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getEqualsLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleComparisonLevel2346); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonLevelAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:977:6: ( () otherlv_4= '!=' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:977:6: ( () otherlv_4= '!=' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:977:7: () otherlv_4= '!='
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:977:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:978:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getUnequalsLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleComparisonLevel2375); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonLevelAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:988:6: ( () otherlv_6= '>' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:988:6: ( () otherlv_6= '>' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:988:7: () otherlv_6= '>'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:988:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:989:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getGreaterLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleComparisonLevel2404); 

            	                	newLeafNode(otherlv_6, grammarAccess.getComparisonLevelAccess().getGreaterThanSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:999:6: ( () otherlv_8= '>=' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:999:6: ( () otherlv_8= '>=' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:999:7: () otherlv_8= '>='
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:999:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1000:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getGreaterEqualsLeftAction_1_0_3_0(),
            	                        current);
            	                

            	            }

            	            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleComparisonLevel2433); 

            	                	newLeafNode(otherlv_8, grammarAccess.getComparisonLevelAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1());
            	                

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1010:6: ( () otherlv_10= '<=' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1010:6: ( () otherlv_10= '<=' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1010:7: () otherlv_10= '<='
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1010:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1011:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getSmallerEqualsLeftAction_1_0_4_0(),
            	                        current);
            	                

            	            }

            	            otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleComparisonLevel2462); 

            	                	newLeafNode(otherlv_10, grammarAccess.getComparisonLevelAccess().getLessThanSignEqualsSignKeyword_1_0_4_1());
            	                

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1021:6: ( () otherlv_12= '&&' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1021:6: ( () otherlv_12= '&&' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1021:7: () otherlv_12= '&&'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1021:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1022:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getLogicalAndLeftAction_1_0_5_0(),
            	                        current);
            	                

            	            }

            	            otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleComparisonLevel2491); 

            	                	newLeafNode(otherlv_12, grammarAccess.getComparisonLevelAccess().getAmpersandAmpersandKeyword_1_0_5_1());
            	                

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1032:6: ( () otherlv_14= '=>' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1032:6: ( () otherlv_14= '=>' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1032:7: () otherlv_14= '=>'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1032:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1033:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getImpliesLeftAction_1_0_6_0(),
            	                        current);
            	                

            	            }

            	            otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleComparisonLevel2520); 

            	                	newLeafNode(otherlv_14, grammarAccess.getComparisonLevelAccess().getEqualsSignGreaterThanSignKeyword_1_0_6_1());
            	                

            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1043:6: ( () otherlv_16= '||' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1043:6: ( () otherlv_16= '||' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1043:7: () otherlv_16= '||'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1043:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1044:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getLogicalOrLeftAction_1_0_7_0(),
            	                        current);
            	                

            	            }

            	            otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleComparisonLevel2549); 

            	                	newLeafNode(otherlv_16, grammarAccess.getComparisonLevelAccess().getVerticalLineVerticalLineKeyword_1_0_7_1());
            	                

            	            }


            	            }
            	            break;
            	        case 9 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1054:6: ( () otherlv_18= '<' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1054:6: ( () otherlv_18= '<' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1054:7: () otherlv_18= '<'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1054:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1055:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonLevelAccess().getSmallerLeftAction_1_0_8_0(),
            	                        current);
            	                

            	            }

            	            otherlv_18=(Token)match(input,38,FOLLOW_38_in_ruleComparisonLevel2578); 

            	                	newLeafNode(otherlv_18, grammarAccess.getComparisonLevelAccess().getLessThanSignKeyword_1_0_8_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1064:3: ( (lv_right_19_0= ruleAdditionLevel ) )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1065:1: (lv_right_19_0= ruleAdditionLevel )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1065:1: (lv_right_19_0= ruleAdditionLevel )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1066:3: lv_right_19_0= ruleAdditionLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonLevelAccess().getRightAdditionLevelParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionLevel_in_ruleComparisonLevel2601);
            	    lv_right_19_0=ruleAdditionLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonLevelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_19_0, 
            	            		"AdditionLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleComparisonLevel"


    // $ANTLR start "entryRuleAdditionLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1090:1: entryRuleAdditionLevel returns [EObject current=null] : iv_ruleAdditionLevel= ruleAdditionLevel EOF ;
    public final EObject entryRuleAdditionLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionLevel = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1091:2: (iv_ruleAdditionLevel= ruleAdditionLevel EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1092:2: iv_ruleAdditionLevel= ruleAdditionLevel EOF
            {
             newCompositeNode(grammarAccess.getAdditionLevelRule()); 
            pushFollow(FOLLOW_ruleAdditionLevel_in_entryRuleAdditionLevel2639);
            iv_ruleAdditionLevel=ruleAdditionLevel();

            state._fsp--;

             current =iv_ruleAdditionLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionLevel2649); 

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
    // $ANTLR end "entryRuleAdditionLevel"


    // $ANTLR start "ruleAdditionLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1099:1: ruleAdditionLevel returns [EObject current=null] : (this_MultiplicationLevel_0= ruleMultiplicationLevel ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) ) )* ) ;
    public final EObject ruleAdditionLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicationLevel_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1102:28: ( (this_MultiplicationLevel_0= ruleMultiplicationLevel ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) ) )* ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1103:1: (this_MultiplicationLevel_0= ruleMultiplicationLevel ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) ) )* )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1103:1: (this_MultiplicationLevel_0= ruleMultiplicationLevel ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) ) )* )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1104:5: this_MultiplicationLevel_0= ruleMultiplicationLevel ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionLevelAccess().getMultiplicationLevelParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplicationLevel_in_ruleAdditionLevel2696);
            this_MultiplicationLevel_0=ruleMultiplicationLevel();

            state._fsp--;

             
                    current = this_MultiplicationLevel_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=39 && LA13_0<=40)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationLevel ) )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==39) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==40) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:3: ( () otherlv_2= '+' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:4: () otherlv_2= '+'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1112:4: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1113:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionLevelAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAdditionLevel2719); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionLevelAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1123:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1123:6: ( () otherlv_4= '-' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1123:7: () otherlv_4= '-'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1123:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1124:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionLevelAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleAdditionLevel2748); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionLevelAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1133:3: ( (lv_right_5_0= ruleMultiplicationLevel ) )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1134:1: (lv_right_5_0= ruleMultiplicationLevel )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1134:1: (lv_right_5_0= ruleMultiplicationLevel )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1135:3: lv_right_5_0= ruleMultiplicationLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionLevelAccess().getRightMultiplicationLevelParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicationLevel_in_ruleAdditionLevel2771);
            	    lv_right_5_0=ruleMultiplicationLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionLevelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MultiplicationLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleAdditionLevel"


    // $ANTLR start "entryRuleMultiplicationLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1159:1: entryRuleMultiplicationLevel returns [EObject current=null] : iv_ruleMultiplicationLevel= ruleMultiplicationLevel EOF ;
    public final EObject entryRuleMultiplicationLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationLevel = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1160:2: (iv_ruleMultiplicationLevel= ruleMultiplicationLevel EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1161:2: iv_ruleMultiplicationLevel= ruleMultiplicationLevel EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationLevelRule()); 
            pushFollow(FOLLOW_ruleMultiplicationLevel_in_entryRuleMultiplicationLevel2809);
            iv_ruleMultiplicationLevel=ruleMultiplicationLevel();

            state._fsp--;

             current =iv_ruleMultiplicationLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationLevel2819); 

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
    // $ANTLR end "entryRuleMultiplicationLevel"


    // $ANTLR start "ruleMultiplicationLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1168:1: ruleMultiplicationLevel returns [EObject current=null] : (this_PrefixOpLevel_0= rulePrefixOpLevel ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) ) )* ) ;
    public final EObject ruleMultiplicationLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrefixOpLevel_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1171:28: ( (this_PrefixOpLevel_0= rulePrefixOpLevel ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) ) )* ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1172:1: (this_PrefixOpLevel_0= rulePrefixOpLevel ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) ) )* )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1172:1: (this_PrefixOpLevel_0= rulePrefixOpLevel ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) ) )* )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1173:5: this_PrefixOpLevel_0= rulePrefixOpLevel ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationLevelAccess().getPrefixOpLevelParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrefixOpLevel_in_ruleMultiplicationLevel2866);
            this_PrefixOpLevel_0=rulePrefixOpLevel();

            state._fsp--;

             
                    current = this_PrefixOpLevel_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23||LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixOpLevel ) )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==41) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==23) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:3: ( () otherlv_2= '*' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:4: () otherlv_2= '*'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1181:4: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1182:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationLevelAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleMultiplicationLevel2889); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationLevelAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1192:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1192:6: ( () otherlv_4= '/' )
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1192:7: () otherlv_4= '/'
            	            {
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1192:7: ()
            	            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1193:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationLevelAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMultiplicationLevel2918); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationLevelAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1202:3: ( (lv_right_5_0= rulePrefixOpLevel ) )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1203:1: (lv_right_5_0= rulePrefixOpLevel )
            	    {
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1203:1: (lv_right_5_0= rulePrefixOpLevel )
            	    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1204:3: lv_right_5_0= rulePrefixOpLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationLevelAccess().getRightPrefixOpLevelParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefixOpLevel_in_ruleMultiplicationLevel2941);
            	    lv_right_5_0=rulePrefixOpLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationLevelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"PrefixOpLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleMultiplicationLevel"


    // $ANTLR start "entryRulePrefixOpLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1228:1: entryRulePrefixOpLevel returns [EObject current=null] : iv_rulePrefixOpLevel= rulePrefixOpLevel EOF ;
    public final EObject entryRulePrefixOpLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixOpLevel = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1229:2: (iv_rulePrefixOpLevel= rulePrefixOpLevel EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1230:2: iv_rulePrefixOpLevel= rulePrefixOpLevel EOF
            {
             newCompositeNode(grammarAccess.getPrefixOpLevelRule()); 
            pushFollow(FOLLOW_rulePrefixOpLevel_in_entryRulePrefixOpLevel2979);
            iv_rulePrefixOpLevel=rulePrefixOpLevel();

            state._fsp--;

             current =iv_rulePrefixOpLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixOpLevel2989); 

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
    // $ANTLR end "entryRulePrefixOpLevel"


    // $ANTLR start "rulePrefixOpLevel"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1237:1: rulePrefixOpLevel returns [EObject current=null] : ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')' ) | this_Atomic_5= ruleAtomic ) ;
    public final EObject rulePrefixOpLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;

        EObject this_Atomic_5 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1240:28: ( ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')' ) | this_Atomic_5= ruleAtomic ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1241:1: ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')' ) | this_Atomic_5= ruleAtomic )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1241:1: ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')' ) | this_Atomic_5= ruleAtomic )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==16||(LA16_0>=43 && LA16_0<=46)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1241:2: ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')' )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1241:2: ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')' )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1241:3: () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ')'
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1241:3: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1242:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrefixOpLevelAccess().getNotExpressionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_rulePrefixOpLevel3036); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrefixOpLevelAccess().getExclamationMarkKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePrefixOpLevel3048); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrefixOpLevelAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1255:1: ( (lv_expr_3_0= ruleExpr ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1256:1: (lv_expr_3_0= ruleExpr )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1256:1: (lv_expr_3_0= ruleExpr )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1257:3: lv_expr_3_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrefixOpLevelAccess().getExprExprParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_rulePrefixOpLevel3069);
                    lv_expr_3_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrefixOpLevelRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_3_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePrefixOpLevel3081); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrefixOpLevelAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1279:5: this_Atomic_5= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrefixOpLevelAccess().getAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrefixOpLevel3110);
                    this_Atomic_5=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_5; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePrefixOpLevel"


    // $ANTLR start "entryRuleAtomic"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1295:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1296:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1297:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic3145);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic3155); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1304:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'widgetcontent' ) | ( () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')' ) | ( () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | ( () ( (lv_value_16_0= RULE_INT ) ) ) | ( () ( (lv_value_18_0= RULE_STRING ) ) ) | ( () ( (otherlv_20= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_value_16_0=null;
        Token lv_value_18_0=null;
        Token otherlv_20=null;
        EObject lv_expr_9_0 = null;

        EObject lv_expr_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1307:28: ( ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'widgetcontent' ) | ( () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')' ) | ( () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | ( () ( (lv_value_16_0= RULE_INT ) ) ) | ( () ( (lv_value_18_0= RULE_STRING ) ) ) | ( () ( (otherlv_20= RULE_ID ) ) ) ) )
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1308:1: ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'widgetcontent' ) | ( () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')' ) | ( () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | ( () ( (lv_value_16_0= RULE_INT ) ) ) | ( () ( (lv_value_18_0= RULE_STRING ) ) ) | ( () ( (otherlv_20= RULE_ID ) ) ) )
            {
            // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1308:1: ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'widgetcontent' ) | ( () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')' ) | ( () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | ( () ( (lv_value_16_0= RULE_INT ) ) ) | ( () ( (lv_value_18_0= RULE_STRING ) ) ) | ( () ( (otherlv_20= RULE_ID ) ) ) )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt17=1;
                }
                break;
            case 44:
                {
                alt17=2;
                }
                break;
            case 45:
                {
                alt17=3;
                }
                break;
            case 46:
                {
                alt17=4;
                }
                break;
            case 16:
                {
                alt17=5;
                }
                break;
            case RULE_INT:
                {
                alt17=6;
                }
                break;
            case RULE_STRING:
                {
                alt17=7;
                }
                break;
            case RULE_ID:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1308:2: ( () otherlv_1= 'true' )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1308:2: ( () otherlv_1= 'true' )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1308:3: () otherlv_1= 'true'
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1308:3: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1309:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getTrueExprAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAtomic3202); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getTrueKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1319:6: ( () otherlv_3= 'false' )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1319:6: ( () otherlv_3= 'false' )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1319:7: () otherlv_3= 'false'
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1319:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1320:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFalseExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleAtomic3231); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getFalseKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1330:6: ( () otherlv_5= 'widgetcontent' )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1330:6: ( () otherlv_5= 'widgetcontent' )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1330:7: () otherlv_5= 'widgetcontent'
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1330:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1331:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFieldContentAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleAtomic3260); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getWidgetcontentKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1341:6: ( () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')' )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1341:6: ( () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')' )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1341:7: () otherlv_7= 'lengthOf' otherlv_8= '(' ( (lv_expr_9_0= ruleExpr ) ) otherlv_10= ')'
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1341:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1342:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getLenghtOfAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleAtomic3289); 

                        	newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getLengthOfKeyword_3_1());
                        
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleAtomic3301); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_2());
                        
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1355:1: ( (lv_expr_9_0= ruleExpr ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1356:1: (lv_expr_9_0= ruleExpr )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1356:1: (lv_expr_9_0= ruleExpr )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1357:3: lv_expr_9_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic3322);
                    lv_expr_9_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_9_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleAtomic3334); 

                        	newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1378:6: ( () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1378:6: ( () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1378:7: () otherlv_12= '(' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1378:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1379:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getParenExprAction_4_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleAtomic3363); 

                        	newLeafNode(otherlv_12, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1388:1: ( (lv_expr_13_0= ruleExpr ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1389:1: (lv_expr_13_0= ruleExpr )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1389:1: (lv_expr_13_0= ruleExpr )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1390:3: lv_expr_13_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getExprExprParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic3384);
                    lv_expr_13_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_13_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleAtomic3396); 

                        	newLeafNode(otherlv_14, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_4_3());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1411:6: ( () ( (lv_value_16_0= RULE_INT ) ) )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1411:6: ( () ( (lv_value_16_0= RULE_INT ) ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1411:7: () ( (lv_value_16_0= RULE_INT ) )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1411:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1412:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getNumberLiteralAction_5_0(),
                                current);
                        

                    }

                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1417:2: ( (lv_value_16_0= RULE_INT ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1418:1: (lv_value_16_0= RULE_INT )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1418:1: (lv_value_16_0= RULE_INT )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1419:3: lv_value_16_0= RULE_INT
                    {
                    lv_value_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic3430); 

                    			newLeafNode(lv_value_16_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_16_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1436:6: ( () ( (lv_value_18_0= RULE_STRING ) ) )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1436:6: ( () ( (lv_value_18_0= RULE_STRING ) ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1436:7: () ( (lv_value_18_0= RULE_STRING ) )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1436:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1437:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getStringLiteralAction_6_0(),
                                current);
                        

                    }

                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1442:2: ( (lv_value_18_0= RULE_STRING ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1443:1: (lv_value_18_0= RULE_STRING )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1443:1: (lv_value_18_0= RULE_STRING )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1444:3: lv_value_18_0= RULE_STRING
                    {
                    lv_value_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic3469); 

                    			newLeafNode(lv_value_18_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_18_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1461:6: ( () ( (otherlv_20= RULE_ID ) ) )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1461:6: ( () ( (otherlv_20= RULE_ID ) ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1461:7: () ( (otherlv_20= RULE_ID ) )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1461:7: ()
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1462:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getAttributeRefAction_7_0(),
                                current);
                        

                    }

                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1467:2: ( (otherlv_20= RULE_ID ) )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1468:1: (otherlv_20= RULE_ID )
                    {
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1468:1: (otherlv_20= RULE_ID )
                    // ../org.typesys.xts.guidsl/src-gen/org/typesys/xts/guidsl/parser/antlr/internal/InternalGuiDsl.g:1469:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic3511); 

                    		newLeafNode(otherlv_20, grammarAccess.getAtomicAccess().getAttrAttributeCrossReference_7_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel131 = new BitSet(new long[]{0x0000000000400802L});
    public static final BitSet FOLLOW_ruleForm_in_ruleModel158 = new BitSet(new long[]{0x0000000000400802L});
    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleForm242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForm276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm296 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleForm308 = new BitSet(new long[]{0x000000000020C000L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleForm329 = new BitSet(new long[]{0x000000000020C000L});
    public static final BitSet FOLLOW_14_in_ruleForm342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextWidget_in_ruleWidget435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_ruleWidget462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextWidget_in_entryRuleTextWidget497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextWidget507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTextWidget544 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTextWidget556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextWidget573 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTextWidget590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTextWidget602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextWidget622 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleTextWidget635 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleTextWidget656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTextWidget670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBoxWidget716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCheckBoxWidget753 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCheckBoxWidget765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckBoxWidget785 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleCheckBoxWidget798 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCheckBoxWidget819 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCheckBoxWidget833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEntity916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity933 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity950 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity971 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_14_in_ruleEntity984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_ruleAttribute1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedAttribute_in_ruleAttribute1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDerivedAttribute_in_entryRuleDerivedAttribute1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDerivedAttribute1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDerivedAttribute1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDerivedAttribute1203 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDerivedAttribute1220 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleDerivedAttribute1241 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDerivedAttribute1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleAttribute1341 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSimpleAttribute1358 = new BitSet(new long[]{0x000000003C000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleSimpleAttribute1379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSimpleAttribute1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleType1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityType1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rulePrimitiveType1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rulePrimitiveType1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rulePrimitiveType1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePrimitiveType1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFloatType1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIntType1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBooleanType2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType2084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStringType2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonLevel_in_ruleExpr2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonLevel_in_entryRuleComparisonLevel2266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonLevel2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionLevel_in_ruleComparisonLevel2323 = new BitSet(new long[]{0x0000007FC0000002L});
    public static final BitSet FOLLOW_30_in_ruleComparisonLevel2346 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_31_in_ruleComparisonLevel2375 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_32_in_ruleComparisonLevel2404 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_33_in_ruleComparisonLevel2433 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_34_in_ruleComparisonLevel2462 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_35_in_ruleComparisonLevel2491 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_36_in_ruleComparisonLevel2520 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_37_in_ruleComparisonLevel2549 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_38_in_ruleComparisonLevel2578 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleAdditionLevel_in_ruleComparisonLevel2601 = new BitSet(new long[]{0x0000007FC0000002L});
    public static final BitSet FOLLOW_ruleAdditionLevel_in_entryRuleAdditionLevel2639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionLevel2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationLevel_in_ruleAdditionLevel2696 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleAdditionLevel2719 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_40_in_ruleAdditionLevel2748 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleMultiplicationLevel_in_ruleAdditionLevel2771 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationLevel_in_entryRuleMultiplicationLevel2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationLevel2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixOpLevel_in_ruleMultiplicationLevel2866 = new BitSet(new long[]{0x0000020000800002L});
    public static final BitSet FOLLOW_41_in_ruleMultiplicationLevel2889 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_23_in_ruleMultiplicationLevel2918 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_rulePrefixOpLevel_in_ruleMultiplicationLevel2941 = new BitSet(new long[]{0x0000020000800002L});
    public static final BitSet FOLLOW_rulePrefixOpLevel_in_entryRulePrefixOpLevel2979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixOpLevel2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrefixOpLevel3036 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrefixOpLevel3048 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePrefixOpLevel3069 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrefixOpLevel3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrefixOpLevel3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic3145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAtomic3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAtomic3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAtomic3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAtomic3289 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtomic3301 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic3322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomic3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAtomic3363 = new BitSet(new long[]{0x00007C0000010070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic3384 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomic3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic3511 = new BitSet(new long[]{0x0000000000000002L});

}
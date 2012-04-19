STAMP=stamp

GENERATEDTEXS = \
	MethodCall.java.tex \
	CodeScopeExample.java.tex \
	CodeValidationExample.java.tex \
	Cast.xtext.tex \
	CheckCast.java.tex \
	ScopeExample.java.tex \
	generatedMethods.java.tex \
	Selection.xtext.tex \
	Selection2.xtext.tex \
	fj.xtext.tex \
	fj2.xtext.tex \
	fjclass.xtext.tex \
	fjtype.xtext.tex \
	vars.rule.tex \
	grammar.typesystem.tex \
	judgments.rule.tex \
	subclass.rule.tex \
	subtype.rule.tex \
	cast.rule.tex

all: $(GENERATEDTEXS)

%.java.tex: %.java
	source-highlight -s java -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.xtext.tex: %.xtext xtext.lang
	source-highlight --lang-def xtext.lang -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.typesystem.tex: %.typesystem typesystem.lang
	source-highlight --lang-def typesystem.lang -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.rule.tex: %.rule typesystem.lang
	source-highlight --lang-def typesystem.lang -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

clean-gen:
	rm -f $(GENERATEDTEXS)

clean-all: clean-gen clean
STAMP=stamp

GENERATEDTEXS = SimpleRules.xsemantics.tex SimpleRules2.xsemantics.tex \
	Judgments.xsemantics.tex \
	Example.xtend.tex

all: $(GENERATEDTEXS)

STDOPTIONS=-t 4 --header=listing_header.txt --footer=listing_footer.txt --style-css-file=sh_ide-eclipse.css

%.java.tex: %.java
	source-highlight -s java -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.xtext.tex: %.xtext xtext.lang
	source-highlight --lang-def xtext.lang -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.xtend.tex: %.xtend xtend.lang sh_ide-eclipse.css
	source-highlight --lang-def xtend.lang -f latexcolor $< $(STDOPTIONS)
	touch $(STAMP)

%.xsemantics.tex: %.xsemantics xsemantics.lang sh_ide-eclipse.css
	source-highlight --lang-def xsemantics.lang -f latexcolor $< $(STDOPTIONS)
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

regenerate: clean-gen all
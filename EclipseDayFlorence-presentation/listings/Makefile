STAMP=stamp

GENERATEDTEXS = SimpleRules.xsemantics.tex

all: $(GENERATEDTEXS)

%.java.tex: %.java
	source-highlight -s java -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.xtext.tex: %.xtext xtext.lang
	source-highlight --lang-def xtext.lang -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
	touch $(STAMP)

%.xsemantics.tex: %.xsemantics xsemantics.lang
	source-highlight --lang-def xsemantics.lang -f latexcolor $< -t 4 --header=listing_header.txt --footer=listing_footer.txt
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
objects = \
	../org.typesys.guidsl/src/org/typesys/guidsl/types/GuiDslTypeProvider.xtend \
	../org.typesys.guidsl/src/org/typesys/guidsl/types/TypeConformance.xtend \
	../org.typesys.guidsl/src/org/typesys/guidsl/validation/GuiDslJavaValidator.java \
	../org.typesys.xbase.guidsl/src/org/typesys/xbase/guidsl/validation/XGuiDslJavaValidatorx.xtend \
	../org.typesys.xbase.guidsl/src/org/typesys/xbase/guidsl/jvmmodel/XGuiDslJvmModelInferrer.xtend

# add .tex suffix to original path => path will not exist => execute target each time
all: $(addsuffix .tex,$(objects))

# different source highlighting types
#%.xtend.tex: %.xtend
#	source-highlight  -s java -f latex -t 4 --regex-range=//tex -i $< -o code/$(@F)
#%.java.tex: %.java
#	source-highlight  -s java -f latex -t 4 --regex-range=//tex -i $< -o code/$(@F)

%.tex: %
	./extract-regex-range $< code/$(@F) //tex

clean: 
	cd code; rm $(addsuffix .tex,$(notdir $(objects)))

pdf:
	pdflatex -synctex=1 doc.tex lit.bib
#	pdflatex -synctex=1 -interaction=nonstopmode doc.tex lit.bib

# from "GNU make":
# $< - name of first prerequisite
# $(@F) - filename

# from source-highlight:
# regex-range - only capture and format code between regex
# -o output dir

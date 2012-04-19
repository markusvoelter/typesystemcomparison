all:
	cd listings && make
	make presentation.pdf

presentation.pdf: presentation.tex presbody.tex preamble.tex \
rules.tex \
listings/stamp \
	deleg.pdf consult.pdf
	pdflatex presentation.tex # && pdflatex presentation.tex

%.pdf: %.eps
	epstopdf $<

handouts.pdf: presentation.pdf handouts.tex
	pdflatex handouts && pdflatex handouts

handouts-6.pdf: presentation.pdf handouts.pdf
	pdfnup --nup 3x2 handouts.pdf --outfile handouts-6.pdf
#pdfnup --nup 3x2 --delta ".3cm .3cm" presentation.pdf --outfile handouts.pdf

clean-gen:
	cd listings && make clean-gen

clean: clean-gen
	rm -f presentation.pdf handouts*.pdf *.aux *.log
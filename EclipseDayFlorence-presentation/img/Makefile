toProcess = ast1.dot

%.png: %.dot
	dot -Tpng $< > $@

all: $(addsuffix .png,$(basename $(toProcess)))

clean: 
	rm -f $(addsuffix .png,$(basename $(toProcess)))
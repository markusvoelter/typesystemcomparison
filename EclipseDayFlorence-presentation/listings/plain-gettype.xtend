def Type getExpectedType(EObject e) {
    ...
	switch e {
	    ...
		Plus :	mostGeneral(e.left.type, e.right.type).mostSpecific(string)		

def Type mostGeneral(Type one, Type two) {
	if (isAssignable(one, two))
	  one 
	    else
	  two
	}

// allow numbers where strings are expected
def dispatch isAssignable(StringType left, NumberType right) { true }
		
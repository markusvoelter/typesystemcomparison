def Type mostGeneral(Type one, Type two) {
	if (isAssignable(one, two))
	  one 
	    else
	  two
	}
		

def dispatch isAssignable(Type left, Type right) { ... }
...
// allow numbers where strings are expected
def dispatch isAssignable(StringType left, NumberType right) { true }
...

package org.typesys.guidsl.tests


import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(typeof(Suite))
@Suite$SuiteClasses({typeof(ParserTests), typeof(TypeTests), typeof(InheritanceTest)})
class PlainXtextGuiDslAllTests {
	
}
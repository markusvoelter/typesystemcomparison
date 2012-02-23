package org.typesys.xbase.guidsl.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(typeof(Suite))
@Suite$SuiteClasses({typeof(XbaseGuiDslParseTest), typeof(XbaseGuiDslValidatorTests)})
class XbaseGuiDslAllTests {
	
}
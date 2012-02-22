/**
 * 
 */
package org.typesys.xsem.guidsl.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author bettini
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	XsemGuiDslParserTests.class,
	XsemGuiDslTypingTests.class,
	XsemGuiDslValidatorTests.class
})
public class XsemGuiDslAllTests {
}

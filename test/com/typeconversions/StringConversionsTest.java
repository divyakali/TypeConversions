package com.typeconversions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests all methods of StringConversions
 * 
 * @author aethena
 *
 */
public class StringConversionsTest {

	StringConversions conversion = new StringConversions();

	@Test
	public void stringToLongTest() {

		long expectedValue = 123;
		long actualValue = conversion.stringToLong("123");
		Assert.assertEquals("Expected value does not match actual",
				expectedValue, actualValue);
		expectedValue = -1123;
		actualValue = conversion.stringToLong("-1123");
		Assert.assertEquals("Expected value does not match actual",
				expectedValue, actualValue);
	}

	@Test(expected = NumberFormatException.class)
	public void stringToLongTestUnderflow() {

		conversion.stringToLong("-9223372036854775809");
	}

	@Test(expected = NumberFormatException.class)
	public void stringToLongTestOverflow() {

		conversion.stringToLong("9223372036854775808");
	}

	@Test
	public void stringToLongTestBounds() {

		long expectedValue = Long.MAX_VALUE;
		System.out.println(expectedValue);
		long actualValue = conversion.stringToLong("9223372036854775807");
		Assert.assertEquals("Expected value does not match actual",
				expectedValue, actualValue);

		expectedValue = Long.MIN_VALUE;
		actualValue = conversion.stringToLong("-9223372036854775808");
		Assert.assertEquals("Expected value does not match actual",
				expectedValue, actualValue);
	}

}

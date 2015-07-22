package com.typeconversions;

/**
 * Implements type conversions
 * 
 * @author aethena
 *
 */
public class StringConversions {
	/**
	 * Convert string to long
	 * 
	 * @param str
	 * @return
	 */
	public long stringToLong(String str)

	{

		long i = 0;
		char[] letters = str.toCharArray();
		// check if number is negative and parse
		if (str.startsWith("-")) {
			// if number has more than 20 characters(includes -)
			if (str.length() > 20)
				throw new NumberFormatException(
						"Number to convert is too small");
			else
				letters = str.substring(1).toCharArray();
		}
		if (!str.matches("[0-9]{1,19}")) {
			// if number has more than 19 characters
			if (str.length() > 20)
				throw new NumberFormatException("Number to convert is too big");
		}

		for (char ch : letters) {
			// check if adding the new digit will create overflow/underflow
			// problems. First condition is for positive numbers and second is
			// for negative
			if ((Long.MAX_VALUE - (i * 10)) >= Character.getNumericValue(ch)
					|| (str.startsWith("-") && (Long.MIN_VALUE + (i * 10) <= -Character
							.getNumericValue(ch))))
				i = (i * 10) + Character.getNumericValue(ch);
			else {
				throw new NumberFormatException("Number too big");
			}
		}
		if (str.startsWith("-"))
			return -i;
		else
			return i;

	}

}

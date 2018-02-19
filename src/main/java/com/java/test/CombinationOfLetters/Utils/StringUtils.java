package com.java.test.CombinationOfLetters.Utils;
/**
 * 
 */

/**
 * @author hemanth
 *
 */
public class StringUtils {

	/**
	 * @param nextLine
	 * @return
	 */
	public static boolean validateInput(String nextLine) {
		return nextLine.matches("[0-9]+") ? true : false;
	}
	private StringUtils() {}
}

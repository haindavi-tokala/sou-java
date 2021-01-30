/**
 * 
 */
package com.mylearnings.java.core.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author uppus
 * 
 */
public class RegerDemo3 {

	public static void main(String[] args) {
		// Pattern pattern = Pattern.compile("cat|dog|fish");//Prints if any
		// word present in the matcher
		// Pattern pattern = Pattern.compile(".x");//Prints if any character
		// present in the matcher
		// Pattern pattern = Pattern.compile("^i");//Prints if it is the first
		// character or word present in the matcher
		// Pattern pattern = Pattern.compile("u$");//Prints if it is the last
		// character or word present in the matcher
		// Pattern pattern = Pattern.compile("\\d");//Find a digit
		 Pattern pattern = Pattern.compile("\\s");//Find a whitespace
		// character
		//Pattern pattern = Pattern.compile("girl\\b");// Find a match at the
														// beginning of a word
														// like this: \bWORD, or
														// at the end of a word
														// like this: WORD\b
		//Pattern pattern = Pattern.compile("\\uxxxx");
		Matcher matcher = pattern.matcher("I'm good girl");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}

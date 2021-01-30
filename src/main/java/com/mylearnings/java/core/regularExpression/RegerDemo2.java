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
public class RegerDemo2 {

	public static void main(String[] args) {
		Pattern pattern = Pattern
				.compile("[^xyz]");
		Matcher matcher = pattern.matcher("z ");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}

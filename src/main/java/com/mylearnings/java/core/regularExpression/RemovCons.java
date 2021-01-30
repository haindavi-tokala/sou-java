package com.mylearnings.java.core.regularExpression;

import java.util.Arrays;
import java.util.List;

public class RemovCons {

	// function that returns true
	// if the character is an alphabet
	static boolean isAlphabet(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return true;
		if (ch >= 'A' && ch <= 'Z')
			return true;
		return false;
	}

	static String remConsonants(String str) {
		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		List<Character> al = Arrays.asList(vowels);

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			if (isAlphabet(sb.charAt(i)) && !al.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}
		}

		return sb.toString();
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";

		System.out.println(remConsonants(str));
	}
}

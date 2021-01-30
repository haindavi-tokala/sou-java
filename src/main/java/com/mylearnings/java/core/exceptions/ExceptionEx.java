package com.mylearnings.java.core.exceptions;

public class ExceptionEx {

	public static void main(String args[]) {
		String inputString = "Alive*is*Awesome$";
		String splCharStr = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (splCharStr.contains(Character.toString(ch))) {
				System.out.println(inputString + " contains special character");
				break;
			} else if (i == inputString.length() - 1)
				System.out.println(inputString
						+ " does NOT contain special character");

		}
	}
}

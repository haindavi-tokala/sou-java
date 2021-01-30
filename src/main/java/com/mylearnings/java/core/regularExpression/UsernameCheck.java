package com.mylearnings.java.core.regularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameCheck {

	public static void main(String[] agrs) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		List emails = new ArrayList();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("@yahoo.com");
		/*
		 * for (String email : emails) { Matcher matcher =
		 * pattern.matcher(emails); System.out.println(email + " : " +
		 * matcher.matches());
		 */

	}
}

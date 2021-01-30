package com.mylearnings.java.core.exceptions;

public class ArEx {
	static int a = 10;
	static int b = 5;
	static int c = 5;
	static int res;

	public static void main(String[] args) {
		try {
			res = a / (b - c);
		} catch (ArithmeticException e) {
			System.out.println("Custom Exception Occured is "+e.getMessage());
		}

	}

}

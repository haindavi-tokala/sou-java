package com.mylearnings.java.core.exceptions;

import java.io.*;

public class TrowableEx {

	public static void main(String[] args) throws Exception {

		try {

			divide(2, 0);
		}

		catch (ArithmeticException e) {

			System.out.println("Message String = " + e.getMessage());
		}
	}

	public static void divide(int a, int b) throws ArithmeticException {

		int c = a / b;
		System.out.println("Result:" + c);
	}
}

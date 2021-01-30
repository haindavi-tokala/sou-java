package com.mylearnings.java.core.wrapperclasss;

import java.util.Scanner;

public class SecondToString {
	public static void main(String[] args) {
		Long myLong = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter phone number");
		myLong = sc.nextLong();
		String myString = myLong.toString();
		if (myString.length() < 10) {
			System.out.println("Invalid Number");
		} else {
			System.out.println("Phne number is : " + myLong);

		}
	}
}

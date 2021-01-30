package com.mylearnings.java.core.enumex;

public class MonthEnum {

	public static void main(String args[]) {
		Month month = Month.JANUARY;

		switch (month) {
		case JANUARY:
			System.out.println("JANUARY");
			break;
		case FEBUARY:
			System.out.println("FEBUARY");
			break;
		case APRIL:
			System.out.println("APRIL");
			break;
		case AUGUST:
			System.out.println("AUGUST");
			break;
		case DECEMBER:
			System.out.println("DECEMBER");
			break;
		case OCTOBER:
			System.out.println("OCTOBER");
			break;

		default:
			System.out.println("other Month");
		}
	}
}

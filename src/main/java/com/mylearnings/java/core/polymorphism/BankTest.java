package com.mylearnings.java.core.polymorphism;

public class BankTest {

	public static void main(String args[]) {
		
		Bank b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.Interest());
		Bank a = new ICICI();
		System.out.println("ICICI Rate of Interest: " + a.Interest());
		Bank c = new AXIS();
		System.out.println("AXIS Rate of Interest: " + c.Interest());
	}
}

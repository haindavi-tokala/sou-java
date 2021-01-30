package com.mylearnings.java.core.exceptions;

import java.util.Scanner;

public class SoumyaAgeExcepImpl {

	public static void main(String args[]) {
		try {
			SoumyaAgeExcepImpl soumyaAgeExcepImpl = new SoumyaAgeExcepImpl();
			soumyaAgeExcepImpl.validate();
		} catch (SoumyaAgeExcep e) {
			System.out.println("Exception occured: " + e);
		}

	}

	public int validate() throws SoumyaAgeExcep {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the candidate : ");
		age = sc.nextInt();
		if (age < 18)
			throw new SoumyaAgeExcep("not eligible to vote");
		else
			System.out.println("welcome to vote");
		System.out.println("You are Eligible To Vote");
		return age;
	}

}


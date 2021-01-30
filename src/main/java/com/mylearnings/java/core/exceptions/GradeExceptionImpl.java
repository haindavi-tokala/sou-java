package com.mylearnings.java.core.exceptions;

import java.util.Scanner;

public class GradeExceptionImpl {
	public static void main(String args[]) {
		try {
			GradeExceptionImpl gradeExceptionImpl = new GradeExceptionImpl();
			gradeExceptionImpl.grade();
		} catch (GradeException e) {
			System.out.println("Exception occured: " + e);
		}

	}

	public int grade() throws GradeException {
		int percentage ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage of the candidate : ");
		percentage = sc.nextInt();
		if (percentage>100)
			throw new GradeException("Invalid Percentage");
		else if (percentage>=80 && percentage<=100)
			throw new GradeException("Distinction");
		else if(percentage>=60 && percentage<80)
			throw new GradeException("First Class");
		else if(percentage>=40 && percentage<60)
			throw new GradeException("Second Class");
		else
			System.out.println("Fail");
		return percentage;
	}

}

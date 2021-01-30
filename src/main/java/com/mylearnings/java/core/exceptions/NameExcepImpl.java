package com.mylearnings.java.core.exceptions;

import java.util.Scanner;

public class NameExcepImpl {
	public static void main(String args[]) {
		try {
			NameExcepImpl nameExcepImpl = new NameExcepImpl();
			nameExcepImpl.nameCheck();
		} catch (NameException e) {
			System.out.println("Exception occured: " + e);
		}

	}

	public String nameCheck() throws NameException {
		String name ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the candidate : ");
		name = sc.nextLine();
		if (name.startsWith("a"))
			throw new NameException("Comes First in the List");
		else
			System.out.println("Continues after a");
		
		return name;
	}

}

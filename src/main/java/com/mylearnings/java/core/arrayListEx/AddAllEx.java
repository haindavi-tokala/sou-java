package com.mylearnings.java.core.arrayListEx;

import java.util.ArrayList;

public class AddAllEx {

	public static void main(String args[]) {

		ArrayList<Integer> arrlist1 = new ArrayList<Integer>(5);

		arrlist1.add(12);
		arrlist1.add(20);
		arrlist1.add(45);

		System.out.println("Printing list1:");
		for (Integer number : arrlist1)
			System.out.println("Number = " + number);

		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

		arrlist2.add(25);
		arrlist2.add(30);
		arrlist2.add(31);
		arrlist2.add(35);

		System.out.println("Printing list2:");
		for (Integer number : arrlist2)
			System.out.println("Number = " + number);

		arrlist1.addAll(arrlist2);

		System.out.println("Printing all the elements");

		for (Integer number : arrlist1)
			System.out.println("Number = " + number);
	}

}

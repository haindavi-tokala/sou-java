package com.mylearnings.java.core.vector;

import java.util.*;

public class CopyInto {

	public static void main(String args[]) {
		// Creating an empty Vector
		Vector<String> vec_tor = new Vector<String>();
		vec_tor.add("My");
		vec_tor.add("name");
		vec_tor.add("is");
		vec_tor.add("uppu");
		vec_tor.add("soumya");

		// Displaying the Vector
		System.out.println("Vector: " + vec_tor);

		// Creating an array
		String arr[] = new String[5];

		arr[0] = "Hello";
		arr[1] = "World";

		// Displaying the initial array
		System.out.println("The initial array is: ");
		for (String str : arr)
			System.out.println(str);

		// Copying
		vec_tor.copyInto(arr);

		// The final array
		System.out.println("The final array is: ");
		for (String str : arr)
			System.out.println(str);
	}
}

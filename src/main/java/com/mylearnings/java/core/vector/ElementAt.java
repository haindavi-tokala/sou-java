package com.mylearnings.java.core.vector;

import java.util.Vector;

public class ElementAt {

	public static void main(String args[]) {

		// Creating an empty Vector
		Vector<String> vec_tor = new Vector<String>();

		// Use add() method to add elements in the Vector
		vec_tor.add("My");
		vec_tor.add("name");
		vec_tor.add("is");
		vec_tor.add("uppu");
		vec_tor.add("soumya");

		// Displaying the Vector
		System.out.println("Vector: " + vec_tor);

		// Fetching the specific element from the Vector
		System.out.println("The element is: " + vec_tor.elementAt(3));
	}
}

package com.mylearnings.java.core.vector;

import java.util.Vector;
import java.util.Collection;
import java.util.ArrayList;

public class AddAll {
	public static void main(String args[]) {

		// Creating an empty Vector
		Vector<String> vector = new Vector<String>();

		// Use add() method to add elements in the Vector
		vector.add("My");
		vector.add("Name");
		vector.add("Is");
		vector.add("Uppu");
		vector.add("Soumya");

		// A collection is created
		Collection<String> collection = new ArrayList<String>();
		collection.add("My");
		collection.add("Age");
		collection.add("Is");
		collection.add("21");
		collection.add("years");

		// Displaying the Vector
		System.out.println("The Vector is: " + vector);

		// Appending the collection to the vector
		vector.addAll(collection);

		// Clearing the vector using clear() and displaying
		System.out.println("The new vector is: " + vector);
	}
}

package com.mylearnings.java.core.vector;

import java.util.*;

public class Capacity {
	public static void main(String args[]) {
		Vector<String> vec_tor = new Vector<String>();

		vec_tor.add("My");
		vec_tor.add("name");
		vec_tor.add("is");
		vec_tor.add("uppu");
		vec_tor.add("soumya");

		// Displaying the Vector
		System.out.println("Vector: " + vec_tor);

		// Displaying the capacity of Vector
		System.out.println("The capacity is: " + vec_tor.capacity());
	}
}

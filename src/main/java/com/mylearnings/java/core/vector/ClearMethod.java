package com.mylearnings.java.core.vector;

import java.util.*;

public class ClearMethod {

	public static void main(String args[]) {
		Vector<String> vec_tor = new Vector<String>();

		vec_tor.add("My");
		vec_tor.add("name");
		vec_tor.add("is");
		vec_tor.add("uppu");
		vec_tor.add("soumya");

		System.out.println("Vector: " + vec_tor);

		vec_tor.clear();

		System.out.println("The final Vector: " + vec_tor);
	}
}

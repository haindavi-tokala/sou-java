package com.mylearnings.java.core.vector;

import java.util.*;

public class ContainsMethod {

	public static void main(String args[]) {
		Vector<String> vec_tor = new Vector<String>();
		vec_tor.add("My");
		vec_tor.add("name");
		vec_tor.add("is");
		vec_tor.add("uppu");
		vec_tor.add("soumya");

		System.out.println("Vector: " + vec_tor);

		System.out.println("Does the vector contains 'Geeks'? "
				+ vec_tor.contains("soumya"));

		System.out.println("Does the Vector contains '4'? "
				+ vec_tor.contains("age"));

		System.out.println("Does the Queue contains 'No'? "
				+ vec_tor.contains("22"));
	}

}

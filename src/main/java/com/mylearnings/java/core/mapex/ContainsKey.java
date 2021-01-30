package com.mylearnings.java.core.mapex;

import java.util.*;

public class ContainsKey {

	public static void main(String[] args) {

		// Creating an empty Map
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		map.put(21, "My");
		map.put(43, "name");
		map.put(26,"is");
		map.put(40,"uppu");
		map.put(23,"soumya");

		// Displaying the Map
		System.out.println("Initial Mappings are: " + map);

		// Checking for the key_element '20'
		System.out.println("Is the key '43' present? " + map.containsKey(43));

		// Checking for the key_element '5'
		System.out.println("Is the key '5' present? " + map.containsKey(5));
	}
}

package com.mylearnings.java.core.vector;

import java.util.*; 
import java.io.*; 

public class RemoveEle {

		public static void main(String[] arg) 
		{ 

			// create default vector of capacity 10 
			Vector<String> vec_tor = new Vector<String>(); 

			// Add elements using add() method 
			vec_tor.add("My");
			vec_tor.add("name");
			vec_tor.add("is");
			vec_tor.add("uppu");
			vec_tor.add("soumya");

			// removing first occurrence element at 1 
			vec_tor.remove(3); 

			// checking vector 
			System.out.println("after removal: " + vec_tor); 
		} 
	}


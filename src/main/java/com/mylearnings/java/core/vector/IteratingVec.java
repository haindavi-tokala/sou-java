package com.mylearnings.java.core.vector;

import java.util.*; 

public class IteratingVec {

		public static void main(String args[]) 
		{ 
			// create an instance of vector 
			Vector<String> vec_tor = new Vector<>(); 
			vec_tor.add("My");
			vec_tor.add("name");
			vec_tor.add("is");
			vec_tor.add("uppu");
			vec_tor.add("soumya");

			// Using the Get method and the 
			// for loop 
			for (int i = 0; i < vec_tor.size(); i++) { 

				System.out.print(vec_tor.get(i) + " "); 
			} 

			System.out.println(); 

			// Using the for each loop 
			for (String str : vec_tor) 
				System.out.print(str + " "); 
		} 
	}



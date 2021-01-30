package com.mylearnings.java.core.vector;
import java.util.*; 
public class ContainsAll {


		public static void main(String args[]) 
		{ 
			// Creating an empty Vector 
			Vector<String> vec_tor = new Vector<String>(); 

			// Use add() method to add elements into the Vector 
			vec_tor.add("My");
			vec_tor.add("name");
			vec_tor.add("is");
			vec_tor.add("uppu");
			vec_tor.add("soumya");

			// Displaying the Vector 
			System.out.println("Vector: " + vec_tor); 

			// Creating another empty Vector 
			Vector<String> colvec_tor = new Vector<String>(); 

			colvec_tor.add("name"); 
			colvec_tor.add("uppu"); 
			colvec_tor.add("soumya"); 

			System.out.println("Are all the contents equal? " + vec_tor.containsAll(colvec_tor)); 

			// Creating another empty Vector 
			Vector<String> colvec_tor2 = new Vector<String>(); 

			colvec_tor2.add("soumya"); 
			colvec_tor2.add("B.E"); 

			System.out.println("Are all the contents equal? " + vec_tor.containsAll(colvec_tor2)); 
		} 
	} 



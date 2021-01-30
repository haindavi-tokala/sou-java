package com.mylearnings.java.core.vector;

	import java.util.*; 

public class CloneMethod {
	
		@SuppressWarnings("unchecked")
		public static void main(String args[]) 
		{ 
			Vector<String> vec_tor = new Vector<String>(); 

			vec_tor.add("My");
			vec_tor.add("name");
			vec_tor.add("is");
			vec_tor.add("uppu");
			vec_tor.add("soumya");

			System.out.println("Vector: " + vec_tor); 

			ArrayList<String> copy_vector = (ArrayList<String>) vec_tor.clone(); 

			System.out.println("The cloned vector is: " + copy_vector); 
		} 

}

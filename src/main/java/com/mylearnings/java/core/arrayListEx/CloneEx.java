package com.mylearnings.java.core.arrayListEx;
import java.util.ArrayList;

public class CloneEx {
	 public static void main(String a[]) 
	    { 
	  
	        // create ArrayList 
	        ArrayList<String> ArrList1 
	            = new ArrayList<String>(); 
	  
	        // Insert elements in ArrayList 
	        ArrList1.add("Mukul"); 
	        ArrList1.add("Rahul"); 
	        ArrList1.add("Suraj"); 
	        ArrList1.add("Mayank"); 
	  
	        // print ArrayList1 
	        System.out.println("Original ArrayList = "
	                           + ArrList1); 
	  
	        // clone ArrayList 
	        ArrayList ArrList2 
	            = (ArrayList)ArrList1.clone(); 
	  
	        // print ArrayList2 
	        System.out.println("Clone ArrayList2 = "
	                           + ArrList2); 
	    } 
}

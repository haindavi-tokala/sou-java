package com.mylearnings.java.core.vector;

import java.util.Vector;

public class AddMethodWithIndex {
    public static void main(String args[]) 
    { 
  
        
        Vector<String> vec_tor = new Vector<String>(); 
  
        vec_tor.add("My"); 
        vec_tor.add("uppu"); 
        vec_tor.add("soumya"); 
        vec_tor.add("B.E"); 
        vec_tor.add("CSE");
  
        System.out.println("The vector is: " + vec_tor); 
 
        vec_tor.add(1,"name"); 
        vec_tor.add(2,"is");
        System.out.println("The new Vector is: " + vec_tor); 
    } 
}

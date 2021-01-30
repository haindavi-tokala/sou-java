/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 *
 */
public class PolymorphismTest3 {
     public String animal(String name)
     {
    	 return name+" is a mammal";
     }
     public String animal(String name,String color)
     {
    	 return name+" is a reptile and it is "+color;

     }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismTest3 polymorphismTest3=new PolymorphismTest3();
		System.out.println(polymorphismTest3.animal("cow"));
		System.out.println(polymorphismTest3.animal("lizard","brown"));

	}

}

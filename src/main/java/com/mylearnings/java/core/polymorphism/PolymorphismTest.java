/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 *
 */
public class PolymorphismTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person emp=new Employee();
		System.out.println(emp.role("Sr.Technical Manager"));
		Person father=new Father();
		System.out.println(father.role("father"));
		

	}

}

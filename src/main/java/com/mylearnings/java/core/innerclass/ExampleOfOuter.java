/**
 * 
 */
package com.mylearnings.java.core.innerclass;

/**
 * @author uppus
 * 
 */
public class ExampleOfOuter {
	String str1 = "Hello";
	String str2 = "World";

	public String concat() {
		return str1 + str2;

	}

	private class ExampleOfInner {

		public double triArea(double base, double height) {
			return  (base * height)*1/2;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleOfOuter exampleOfOuter=new ExampleOfOuter();
		ExampleOfOuter.ExampleOfInner exampleOfInner=exampleOfOuter.new ExampleOfInner();
		System.out.println(exampleOfOuter.concat());
		System.out.println(exampleOfInner.triArea(2.6, 1.8));

	}
}

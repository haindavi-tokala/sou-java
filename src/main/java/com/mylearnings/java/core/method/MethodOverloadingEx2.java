/**
 * 
 */
package com.mylearnings.java.core.method;

/**
 * @author uppus
 * 
 */
public class MethodOverloadingEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodOverloadingEx2 methodOverloadingEx2 = new MethodOverloadingEx2();

		System.out.println("Area of square is :" + methodOverloadingEx2.area(6));
		System.out.println("Area of rectangle is :" + methodOverloadingEx2.area(6, 5));
		System.out.println("Area of circle is :" + methodOverloadingEx2.area(6.87));

	}

	public double area(int a) {
		return Math.pow(a, 2);
	}

	public double area(float a, float b) {
		return a * b;
	}

	public double area(double r) {
		return Math.PI * Math.pow(r, 2);
	}

}

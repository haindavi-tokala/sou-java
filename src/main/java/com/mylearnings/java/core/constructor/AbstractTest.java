/**
 * 
 */
package com.mylearnings.java.core.constructor;

/**
 * @author uppus
 * 
 */
public class AbstractTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new Circle("Blue", 22.2);
		System.out.println(circle.toString());
		Rectangle rectangle = new Rectangle("Orange", 19.8, 10.9);
		System.out.println(rectangle.toString());

	}

}

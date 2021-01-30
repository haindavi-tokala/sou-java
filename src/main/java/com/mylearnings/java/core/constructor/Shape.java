/**
 * 
 */
package com.mylearnings.java.core.constructor;

/**
 * @author uppus Abstract Example
 * 
 */
abstract class Shape {
	String color;

	public Shape(String color) {
		System.out
				.println("This is a Shape constructor for color and it's been called");
		this.color = color;
	}

	abstract double area();

	public abstract String toString();

	public String getColor() {
		return color;
	}

}


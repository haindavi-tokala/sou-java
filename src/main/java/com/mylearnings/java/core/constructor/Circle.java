/**
 * 
 */
package com.mylearnings.java.core.constructor;

/**
 * @author uppus
 * 
 */
public class Circle extends Shape {

	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		System.out.println("This is a cicle constructor ");
	}
    @Override
	double area() {
 
		return Math.PI * Math.pow(radius, 2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.constructor.Shape#toString()
	 */
    @Override
	public String toString() {
		return "The circle color is "+super.color+ " and area is "+area();
	}

}

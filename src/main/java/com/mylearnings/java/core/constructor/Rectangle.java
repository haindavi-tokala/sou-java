package com.mylearnings.java.core.constructor;

public class Rectangle extends Shape {

	private double length;
	private double breadth;

	public Rectangle(String color, double length, double breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		System.out.println("this is a rectangle constructor");
	}
    @Override
	double area() {
		return length * breadth;
	}
    @Override
	public String toString() {
		return "The rectangle color is " + super.color + " and area is "
				+ area();

	}

}

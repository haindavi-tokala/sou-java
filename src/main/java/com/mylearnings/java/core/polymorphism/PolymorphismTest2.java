/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 * 
 */
public class PolymorphismTest2 {
	public int multiply(int x, int y) {
		return x * y;

	}

	public double multiply(double x, double y) {
		return x * y;

	}

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismTest2 polymorphismTest2=new PolymorphismTest2();
		System.out.println(polymorphismTest2.multiply(3, 4));
		System.out.println(polymorphismTest2.multiply(23.34,34.35));
	}

}

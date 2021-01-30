/**
 * 
 */
package com.mylearnings.java.core.innerclass;

/**
 * @author uppus
 * 
 */
class PrivateInnerClass {
	int x = 10;
	int y=22;

	public class ExampleOfInner {
		int y = 5;

	}
}

	/**
	 * @param args
	 */
public class PrivateInnerClassEx{
	public static void main(String[] args) {
		PrivateInnerClass exampleOfOuter = new PrivateInnerClass();
		PrivateInnerClass.ExampleOfInner exampleOfInner = exampleOfOuter.new ExampleOfInner();
		System.out.println(exampleOfOuter.x +" , " +exampleOfInner.y);

	}
}


/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 *
 */
public class ParentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   ParentEx parent =new ParentEx();
	   System.out.println(parent.character("Active"));
	   ParentEx child =new Child1();
	   System.out.println(child.character("Creativity"));
	   ParentEx child2 =new Child2();
	   System.out.println(child2.character("Lazy"));
	}

}

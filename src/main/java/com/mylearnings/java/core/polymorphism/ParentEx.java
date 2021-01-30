/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 * 
 */
public class ParentEx {
	String character(String name) {
		return "Character of parent is  " + name;
	}
}

class Child1 extends ParentEx {
	String character(String name) {
		return "Character of first child is  " + name;
	}
}

class Child2 extends ParentEx {
	String character(String name) {
		return "Character of second child is  " + name;
	}
}

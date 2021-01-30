/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 * 
 */ 
public class Bank {

	 float Interest() {
		return 0;
	}
}

class SBI extends Bank {
	float Interest() {
		return 7.9f;
	}
}

class ICICI extends Bank {
	float Interest() {
		return 3.3f;
	}
}

class AXIS extends Bank {
	float Interest() {
		return 4.3f;
	}
}

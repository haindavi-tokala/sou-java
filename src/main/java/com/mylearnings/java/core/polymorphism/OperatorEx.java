/**
 * 
 */
package com.mylearnings.java.core.polymorphism;

/**
 * @author uppus
 * 
 */
public class OperatorEx {
	void operator(String str1, String str2) {
		String s = str1 + str2;
		System.out
				.println("This is comcatenation operator and concatenated String is : "
						+ s);
	}
	void operator(int a,int b) {
		int c=a+b;
		System.out
				.println("This is unary operator and sum is : "
						+ c);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorEx operatorEx=new OperatorEx();
		operatorEx.operator(5,8);
		operatorEx.operator("Hello", " World");
		

	}

}

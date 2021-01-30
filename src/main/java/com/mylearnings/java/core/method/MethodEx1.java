/**
 * 
 */
package com.mylearnings.java.core.method;

/**
 * @author uppus
 * 
 */
public class MethodEx1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MethodEx1 methodEx1 = new MethodEx1();
		int fact, whilefact;
		//fact = factorial(5);
		//whilefact = factorialWhile(8);
		//System.out.println(whilefact);
		System.out.println(factorial(5));
		/*String str = "MALAYALAM";
		if (isPalindrome(str))
			System.out.println("yes");
		else
			System.out.println("No");
		double r;
		r = areaOfCircle(6);
		System.out.println(r);*/
	}

	public static int factorial(int n) {
		int fact = 1;
		{
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}

	public static boolean isPalindrome(String str) {
		int i = 0, j;
		j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

	public static double areaOfCircle(int r) {
		return Math.PI * Math.pow(r, 2);
	}

	public static int factorialWhile(int n) {
		int fact = 0;
		int i = 1;
		{
			while (i <= n) {
				fact = fact * i;
			}
		}
		return fact;
	}

}


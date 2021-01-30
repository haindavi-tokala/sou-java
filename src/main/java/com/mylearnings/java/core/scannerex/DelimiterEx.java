/**
 * 
 */
package com.mylearnings.java.core.scannerex;
import java.util.Scanner;
/**
 * @author uppus
 *
 */

public class DelimiterEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Hello World! 3 + 3.0 = 6.0 true ";

		Scanner scanner = new Scanner(s);
	/*	//System.out.println("" + scanner.nextLine());
		//scanner.useDelimiter("Wor");
*/		System.out.println("" + scanner.delimiter());
		scanner.close();
		
	}

}

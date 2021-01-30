/**
 * 
 */
package com.mylearnings.java.core.abstex;

/**
 * @author uppus
 * 
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PartTimeEmp partTimeEmp = new PartTimeEmp("vamsi", "24-10-1997", 23,
				"Vijayawada", "INDIA", 920539643, 8);
		FullTimeEmp fullTimeEmp = new FullTimeEmp("Soumya", "22-06-1999", 22,
				"Banglore", "INDIA", 990009990, 9);
		partTimeEmp.details();
		System.out.println(partTimeEmp.toString());
		fullTimeEmp.details();
		System.out.println(fullTimeEmp.toString());

	}

}

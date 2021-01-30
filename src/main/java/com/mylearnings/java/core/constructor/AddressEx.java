/**
 * 
 */
package com.mylearnings.java.core.constructor;

/**
 * @author uppus
 * 
 */
public class AddressEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address(111, "Radiant Enclave", "Kengeri",
				"Bengalore", "karnataka", 560060);
		//System.out.println(address.getZipCode());
		College college=new College();
		college.setAddress(address);
		System.out.println(college.getAddress().getCity());
	}

}

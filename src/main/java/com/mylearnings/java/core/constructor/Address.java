/**
 * 
 */
package com.mylearnings.java.core.constructor;

/**
 * @author uppus
 * 
 */
public class Address {

	private int flatNo;
	private String aptName;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;
	

	public Address() {
	}

	public Address(int flatNo, String aptName, String streetName, String city,
			String state, int zipCode) {
         this.flatNo=flatNo;
         this.aptName=aptName;
         this.streetName=streetName;
         this.city=city;
         this.state=state;
         this.zipCode=zipCode;
             
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}


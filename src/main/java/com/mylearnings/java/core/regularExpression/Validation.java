package com.mylearnings.java.core.regularExpression;

public class Validation {

	// validate first name
	public  boolean validateFirstName(String firstName) {
		return firstName.matches("^[\\p{L} .'-]+$");
		
	}

	// validate last name
	public  boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]*");
	}
	// validate Gender
	public  boolean validateGender(String gender) {
		return gender.matches("^Male|^Female|^Others");
	}
	//validate Address
	public  boolean validateAddress(String address) {
		return address.matches("^[#.[0-9a-zA-Z]\\s,-]*");
	}
	public  boolean validateStreetName(String streetName) {
		return streetName.matches("[a-zA-Z]*");
	}

	public  boolean validateCity(String city) {
		return city.matches("[a-zA-Z]*");
	}  

	// validate state
	public static boolean validateState(String state) {
		return state.matches("[a-zA-Z]*");
	}
	// validate Zip
	public  boolean validateZip(String zip) {
		return zip.matches("\\d{6}");
	}
	// validate Phne no
	public  boolean validatePhone(String phone) {
		return phone.matches("[0-9]{10}");
	}
	
	
}

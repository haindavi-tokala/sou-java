/**
 * 
 */
package com.mylearnings.java.core.abstex;

/**
 * @author uppus
 * 
 */
public abstract class Employee {
	String empName;
	String dob;
	int age;
	String city;
	String country;
	long phno;
	

	public Employee(String empName, String dob, int age, String city,
			String country, long phno) {
		this.empName = empName;
		this.dob=dob;
		this.age=age;
		this.city=city;
		this.country=country;
		this.phno=phno;
		
		
	}

	public String getDob() {
		return dob;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public long getPhno() {
		return phno;
	}

	public String getEmpName() {
		return empName;
	}

	abstract void details();

	abstract double salaryCal();

	public abstract String toString();
}

/**
 * 
 */
package com.mylearnings.java.core.abstex;

/**
 * @author uppus
 *
 */
public class PartTimeEmp extends Employee {
	int workingHrs;

	public PartTimeEmp(String empName, String dob, int age, String city,
			String country, long phno,int workingHrs) {
		super(empName, dob, age, city, country, phno);
		this.workingHrs=workingHrs;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.abstex.Employee#details()
	 */
	@Override
	void details() {
		System.out.println("Employee Name: "+empName);
		System.out.println("DOB: "+dob);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		System.out.println("Country : "+country);
		System.out.println("Phno: "+phno);

	}

	public int getWorkingHrs() {
		return workingHrs;
	}

	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.abstex.Employee#salaryCal()
	 */
	@Override
	double salaryCal() {
        double salary;
        salary=2000*workingHrs;
		return salary;
	}

	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.abstex.Employee#toString()
	 */
	@Override
	public String toString() {
		return "The salary of the parttime job employee is "+salaryCal();
	}

}


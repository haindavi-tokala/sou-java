/**
 * 
 */
package com.mylearnings.java.core.oopconcept;

/**
 * @author uppus
 * 
 */
public class EmpEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmp_age(34);
		employee.setEmp_id(2345);
		employee.setEmp_name("Soumya");
		employee.setEmp_sal(34000);
		System.out.println("Employee name : " + employee.getEmp_name());
		System.out.println("Employee age : " + employee.getEmp_age());
		System.out.println("Employee emp_id : " + employee.getEmp_id());
		System.out.println("Employee salary : " + employee.getEmp_sal());
	}

}


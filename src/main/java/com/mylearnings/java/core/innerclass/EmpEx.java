package com.mylearnings.java.core.innerclass;
import java.util.Scanner;


public class EmpEx {
	int empid;
	 String name;
	 float salary;
	 
	 public void getInput() {
	 
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the empid :: ");
	  empid = in.nextInt();
	  System.out.print("Enter the name :: ");
	  name = in.next();
	  System.out.print("Enter the salary :: ");
	  salary = in.nextFloat();
	 }
	 
	 public void display() {
	  
	  System.out.println("Employee id = " + empid);
	  System.out.println("Employee name = " + name);
	  System.out.println("Employee salary = " + salary);
	 }
	 
	 public static void main(String[] args) {
	 
		 EmpEx e[] = new EmpEx[5];
	  
	  for(int i=0; i<5; i++) {
	   
	   e[i] = new EmpEx();
	   e[i].getInput();
	  }
	  
	  System.out.println("EMPLOYEE DETAILS ARE:");
	  
	  for(int i=0; i<5; i++) {
	   
	   e[i].display();
	  }
	 }
}

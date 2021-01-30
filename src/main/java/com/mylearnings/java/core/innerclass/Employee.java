package com.mylearnings.java.core.innerclass;

import java.util.Scanner;

class EmpOuter {
	int empid;
	String name;
	float salary;
	 int i;

	public void getInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the empid :: ");
		empid = s.nextInt();
		System.out.print("Enter the name :: ");
		name = s.next();
		System.out.print("Enter the salary :: ");
		salary = s.nextFloat();
	}

	public void returnval() {
		EmpOuter e[] = new EmpOuter[4];
		{
			for (int i = 0; i < 3; i++) 
				e[i] = new EmpOuter();
				e[i].getInput();
			
		}
	}

	public class EmpInner {

		public void display() {

			System.out.println("Employee id = " + empid);
			System.out.println("Employee name = " + name);
			System.out.println("Employee salary = " + salary);

		}

		public void returndisp() {
			EmpInner emp[] = new EmpInner[4];
			
				for (int i = 0; i < 5; i++) {
					emp[i].display();
				
			}
		}
	}
}

public class Employee {
	public static void main (String[] args[]){
	EmpOuter obj=new EmpOuter();
	EmpOuter.EmpInner obj1=obj.new EmpInner();
	obj.returnval();
	obj1.returndisp();
	
}
}

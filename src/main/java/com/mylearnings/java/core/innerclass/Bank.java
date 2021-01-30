/**
 * 
 */
package com.mylearnings.java.core.innerclass;
import java.util.Scanner;

/**
 * @author uppus
 * 
 */
public class Bank {
	float amount;
	float  balance = 0;
	long accno;
	
	Scanner sc=new Scanner(System.in);
	void deposit() {
		
		System.out.println("Enter Account Number:");
        accno = sc.nextInt();
        System.out.println("Enter Initial Balance:");
        balance = sc.nextFloat(); 
        System.out.println("Enter Amount to be Deposited:");
        amount = sc.nextFloat();
		balance = balance + amount;
		System.out.println("Deposited! Account Balance is " + balance);
	}

	private class Calculation {
		
		float simpleInterest(float p, float  r,float  t) {
			float si;
			si = (p * r * t) / 100;
			return si;

		}
	}
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.deposit();
		Bank.Calculation cal=bank.new Calculation();
		System.out.println("Simple Interest is :"+cal.simpleInterest(200,12,2));
	}
	
}

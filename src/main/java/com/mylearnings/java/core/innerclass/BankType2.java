/**
 * 
 */
package com.mylearnings.java.core.innerclass;
import java.util.Scanner;

/**
 * @author uppus
 * 
 */
public class BankType2 {
	float amount;
	float  balance = 0;
	long accno;
	public BankType2(float amount,float  balance,long accno){
		this.amount=amount;
		this.balance=balance;
		this.accno=accno;
	}
	
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

	public class Calculation {
		
		float simpleInterest(float p, float  r,float  t) {
			float si;
			si = (p * r * t) / 100;
			return si;

		}
	}
	public static void main(String[] args){
	//	BankType2 bank=new BankType2(amount, amount, accno);
		//bank.deposit();
		//BankType2.Calculation cal=bank.new Calculation();
		//System.out.println("Simple Interest is :"+cal.simpleInterest(200,12,2));
	}
	
}

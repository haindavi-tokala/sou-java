package com.mylearnings.java.core.exceptions;

public class ArrayTryCatch {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 3, 5, 7 };
			System.out.println(arr[6]);  
		}
		 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of defined index range "+e.getMessage());
		}
		System.out.println("end of try catch");
	}

}

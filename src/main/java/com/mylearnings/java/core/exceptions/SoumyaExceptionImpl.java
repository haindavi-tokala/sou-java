/**
 * 
 */
package com.mylearnings.java.core.exceptions;

/**
 * @author uppus
 * 
 */
public class SoumyaExceptionImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throw new SoumyaException("This is my own exception");
		} catch (SoumyaException e) {
			System.out.println("Soumya Exception caught. " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("This is second catch code");
		}
		finally{
			System.out.println("This is my final exception ");
		}
	}

}

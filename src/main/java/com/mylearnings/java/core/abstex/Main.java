/**
 * 
 */
package com.mylearnings.java.core.abstex;

/**
 * @author uppus
 *
 */
public class Main {
	int x;
	public Main(int x){
		this.x=x;
	}

	public int getX() {
		return x;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Main main=new Main(5);
       System.out.println(main.getX());
	}

}


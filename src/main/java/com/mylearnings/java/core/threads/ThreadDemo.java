/**
 * 
 */
package com.mylearnings.java.core.threads;

/**
 * @author uppus
 * 
 */
public class ThreadDemo extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDemo threadDemo = new ThreadDemo();
		threadDemo.start();
	}

	public void run() {
		System.out.println("This is  my thread example");
	}

}

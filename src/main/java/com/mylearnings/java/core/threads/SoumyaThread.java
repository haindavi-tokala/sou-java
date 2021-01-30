package com.mylearnings.java.core.threads;

public class SoumyaThread extends Thread {

	public static void main(String[] args) {
		SoumyaThread soumyaThread = new SoumyaThread();
		SoumyaThread soumyaThread1 = new SoumyaThread();
		soumyaThread.start();
		System.out.println("This is outside thread");
		soumyaThread1.start();
	}

	public void run() {
		System.out.println("this is run method");
	}
}

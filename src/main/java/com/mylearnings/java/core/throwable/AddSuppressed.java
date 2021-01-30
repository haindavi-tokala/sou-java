package com.mylearnings.java.core.throwable;

import java.io.*;

public class AddSuppressed {

	public static void main(String[] args) throws Exception {

		try {

			testException();
		}

		catch (Throwable e) {

			Throwable[] suppExe = e.getSuppressed();

			for (int i = 0; i < suppExe.length; i++) {

				System.out.println("Suppressed Exceptions:");
				System.out.println(suppExe[i]);
			}
		}
	}

	public static void testException() throws Exception {
		Exception suppressed = new ArithmeticException();
		final Exception exe = new Exception();
		exe.addSuppressed(suppressed);
		throw exe;
	}
}

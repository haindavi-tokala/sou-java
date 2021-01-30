/**
 * 
 */
package com.mylearnings.java.core.exceptions;

/**
 * @author uppus
 * 
 */
public class SoumyaException extends Exception {
	public SoumyaException(String desc) {
		super(desc);
	}

	public SoumyaException(String desc, Throwable cause) {
		super(desc, cause);
	}

	public SoumyaException(Throwable cause) {
		super(cause);
	}

}

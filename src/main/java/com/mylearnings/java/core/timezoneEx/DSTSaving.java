/**
 * 
 */
package com.mylearnings.java.core.timezoneEx;

/**
 * @author uppus
 *
 */
import java.util.*;

public class DSTSaving {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimeZone offtime_zone = TimeZone.getTimeZone("Europe/Rome");

		System.out.println("The DST is: " + offtime_zone.getDSTSavings());
	}

}

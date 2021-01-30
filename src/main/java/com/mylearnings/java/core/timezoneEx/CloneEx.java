/**
 * 
 */
package com.mylearnings.java.core.timezoneEx;

/**
 * @author uppus
 *
 */
import java.util.*;

public class CloneEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TimeZone time_zone = TimeZone.getDefault();
		TimeZone time_zone = TimeZone.getTimeZone("Africa/Abidjan");

		System.out.println("Original TimeZone: " + time_zone);

		System.out.println("Cloned TimeZone: " + time_zone.clone());
	}
}

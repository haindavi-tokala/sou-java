/**
 * 
 */
package com.mylearnings.java.core.timezoneEx;

/**
 * @author uppus
 *
 */
import java.util.*;

public class RawOffset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimeZone offtime_zone = TimeZone.getTimeZone("Asia/Kolkata");

		System.out.println("The rawOffset time is: "
				+ offtime_zone.getRawOffset());
	}

}

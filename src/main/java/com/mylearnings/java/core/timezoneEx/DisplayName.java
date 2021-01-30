/**
 * 
 */
package com.mylearnings.java.core.timezoneEx;

/**
 * @author uppus
 *
 */
import java.util.*;

public class DisplayName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimeZone zone = TimeZone.getDefault();
		String name = zone.getDisplayName();
		System.out.println("Display name for default time zone: " + name);
	}

}

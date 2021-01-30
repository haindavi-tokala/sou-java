/**
 * 
 */
package com.mylearnings.java.core.timezoneEx;

/**
 * @author uppus
 *
 */
import java.util.TimeZone;
import java.util.Calendar;

public class GetOffset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimeZone zone = TimeZone.getTimeZone("UK/London");
		System.out.println("The Offset value of TimeZone: "
				+ zone.getOffset(Calendar.ZONE_OFFSET));
	}

}

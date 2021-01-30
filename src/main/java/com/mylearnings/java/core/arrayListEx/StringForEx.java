/**
 * 
 */
package com.mylearnings.java.core.arrayListEx;

/**
 * @author uppus
 *
 */
import java.util.ArrayList;

public class StringForEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(67);
		mark.add(78);
		mark.add(90);
		mark.add(99);
		mark.add(87);
		mark.add(89);
		for (int i = 0; i < mark.size(); i++) {
			System.out.println(mark.get(i));
		}
	}
}

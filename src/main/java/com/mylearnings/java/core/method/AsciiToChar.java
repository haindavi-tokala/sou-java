/**
 * 
 */
package com.mylearnings.java.core.method;

/**
 * @author uppus
 * 
 */
public class AsciiToChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AsciiToChar asciiToCharacter = new AsciiToChar();
		char ch;
		ch = asciiToCharacter.character();
		// System.out.println(ch); //Displaying ASCII value and its equivalent
		// Characte

	}

	public char character() {
		char cha = 0; // Character Variable Declaration
		for (int i = 0; i <= 255; i++) {
			cha = (char) i; // Converting ASCII value to Character
			System.out.println(i + "  =  " + cha);
		}
		return cha;
	}

}

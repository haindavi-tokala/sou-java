/**
 * 
 */
package com.mylearnings.java.core.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author uppus
 * 
 */
public class CharacterRegexEx1 {
	//private static final String REGEX = "[[a-z&&[^r-w]]A-Z]";//
	//private static final String REGEX = "[0-9]{3}";//prints a digit with consists of three characters continuously
	//private static final String REGEX = "[a-zA-Z]{3}";//print any string if continuously three character exists-"2ddd45"
	//private static final String REGEX = "\\s";//print if whitespace exists-"2ds 5fdd"
	//private static final String REGEX = "[^a-zA-Z0-9]";//print if any spl characters are present-"@$!^*dfv"
	//private static final String REGEX = "[^a-zA-Z0-9]";
	private static final String INPUT = "Mumbai:Chennai#Kolkata@Delhi//hyderabad";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*//Pattern pattern = Pattern.compile(REGEX);
		//Matcher matcher = pattern.matcher(INPUT);
		//boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		while(matcher.find()){
			System.out.println("Character Index "+matcher.start());
		}*/
		String[] stringarray=INPUT.split("\\p{Punct}");//prints city names	
        //String[] stringarray=INPUT.split("\\p{L}+");	//prints spl characters
        for(String string:stringarray ){
        	System.out.println(string);
        }
	}

}

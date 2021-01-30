package com.mylearnings.java.core.enumex;

public class SeasonEnum {

	public enum Season {
		WINTER, SPRING, SUMMER, AUTUMN
	}

	
	public static void main(String[] args) {
		for (Season s : Season.values())
			System.out.println(s);
	}
}

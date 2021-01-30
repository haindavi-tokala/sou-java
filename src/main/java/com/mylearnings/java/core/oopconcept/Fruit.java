/**
 * 
 */
package com.mylearnings.java.core.oopconcept;

/**
 * @author uppus
 * 
 */
 abstract class Fruit {
	String frt_taste;
	String color;

	public Fruit(String frt_taste, String color) {
		System.out.println("this is fruit constructor");
		this.frt_taste=frt_taste;
		this.color=color;
	}
	public String getFrt_taste() {
		return frt_taste;
	}
	public String getColor() {
		return color;
	}
	public String originPlace(String place)
	{
		return place;
		
	}
	abstract String season();
	public abstract String toString();

}

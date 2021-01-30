/**
 * 
 */
package com.mylearnings.java.core.oopconcept;

/**
 * @author uppus
 * 
 */
public class Mango extends Fruit {

	private String shape;

	public Mango(String frt_taste, String color, String shape) {
		super(frt_taste, color);
		this.shape = shape;
		System.out.println("this is mango constructor");
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.oopconcept.Fruit#season()
	 */
	@Override
	String season() {
		String season = "Summer";
		// TODO Auto-generated method stub
		return season;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.oopconcept.Fruit#toString()
	 */
	@Override
	public String toString() {

		return "The taste of mango is " + super.frt_taste + ". It is in "
				+ super.color + " color and its " + season()
				+ " seasonal fruit";
	}

}

/**
 * 
 */
package com.mylearnings.java.core.oopconcept;

/**
 * @author uppus
 *
 */
public class CustardApple extends Fruit {

	private String shape;

	public CustardApple(String frt_taste, String color,String shape) {
		super(frt_taste, color);
		this.shape=shape;
		System.out.println("this is custardapple constructor");
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.oopconcept.Fruit#season()
	 */
	@Override
	String season() {
		String season="winter";
		// TODO Auto-generated method stub
		return season;
	}

	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.oopconcept.Fruit#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The taste of custard apple is " + super.frt_taste + ". It is in "
		+ super.color + " color and its " + season()
		+ " seasonal fruit";
	}

}

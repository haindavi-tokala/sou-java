/**
 * 
 */
package com.mylearnings.java.core.abstractclass;

/**
 * @author uppus
 * 
 */
public class Density extends Physics {
	 double mass;
	 double volume;

	public Density(double mass, double volume) {
		this.mass = mass;
		this.volume = volume;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#methodExplaination()
	 */
	@Override
	public String methodExplaination() {
		return "What is the desity of the object with mass "
				+ mass + " and volume " + volume+" ?";

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#calculation()
	 */
	@Override
	public double calculation() {
		double density;
		density=mass/volume;
		return density;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#toString()
	 */
	@Override
	public String toString() {
		return "------The density of the object is :"+ calculation() +" kg/m3";
	}

}

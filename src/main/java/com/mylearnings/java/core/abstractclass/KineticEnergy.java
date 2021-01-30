/**
 * 
 */
package com.mylearnings.java.core.abstractclass;

/**
 * @author uppus
 * 
 */
public class KineticEnergy extends Physics {
	 double mass;
	 double velocity;

	public KineticEnergy(double mass, double velocity) {
		this.mass = mass;
		this.velocity = velocity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#methodExplaination()
	 */
	@Override
	public String methodExplaination() {
		return "What is the Kinetic energy of the object with mass "
				+ mass + " and velocity " + velocity+" ?";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#calculation()
	 */
	@Override
	public double calculation() {
		double k;
		k = (0.5 * mass * Math.pow(velocity, 2));
		return k;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#toString()
	 */
	@Override
	public String toString() {
		return "------Kinetic energy of the object is :"+ calculation() +" joule";
	}

}

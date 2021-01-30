/**
 * 
 */
package com.mylearnings.java.core.abstractclass;

/**
 * @author uppus
 * 
 */
public class NewtonsSecLaw extends Physics {
	 double mass;
	 double acceleration;

	public NewtonsSecLaw(double mass, double acceleration) {
		this.mass = mass;
		this.acceleration = acceleration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#methodExplaination()
	 */
	@Override
	public String methodExplaination() {
		return "What is the force of the object with mass "
				+ mass + " and acceleration " + acceleration
				+ " solve by using Newton's Second Law of Motion ?";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#calculation()
	 */
	@Override
	public double calculation() {
		double force;
		force=mass*acceleration;
		return force;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#toString()
	 */
	@Override
	public String toString() {
		return "-------The force of the object is :"+ calculation()+" newton";
	}

}

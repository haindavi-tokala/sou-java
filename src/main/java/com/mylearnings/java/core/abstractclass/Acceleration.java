/**
 * 
 */
package com.mylearnings.java.core.abstractclass;

/**
 * @author uppus
 * 
 */
public  class Acceleration extends Physics {
	 double finalVelocity;
	 double initialVelocity;
	 double time;

	public Acceleration(double finalVelocity, double initialVelocity,
			double time) {
		this.finalVelocity = finalVelocity;
		this.initialVelocity = initialVelocity;
		this.time = time;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#methodExplaination()
	 */
	@Override
	public String methodExplaination() {

		return "What is the acceleration of the object travelled with invitial velocity "
				+ initialVelocity
				+ "and final velocity"
				+ finalVelocity
				+ "and  time taken by that object is " + time+" ?";

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#calculation()
	 */
	@Override
	public double calculation() {
		double acceleration;
		acceleration = (finalVelocity - initialVelocity) / time;
		return acceleration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#toString()
	 */
	@Override
	public String toString() {
		return "--------The acceleration of the object is :" + calculation()+" m/s2";
	}

}

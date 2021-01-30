/**
 * 
 */
package com.mylearnings.java.core.abstractclass;

/**
 * @author uppus
 * 
 */
public class Speed extends Physics {
	 double distance;
	 double time;
	public Speed(double distance,double time){
		this.distance=distance;
		this.time=time;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#methodExplaination()
	 */
	@Override
	public String methodExplaination() {

		return "What is the speed of the object travelled in "
				+ distance + " and the time taken by that object is " + time+" ?";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#calculation()
	 */
	@Override
	public double calculation() {
		double speed;
		speed=distance/time;
		return speed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mylearnings.java.core.abstractclass.Physics#toString()
	 */
	@Override
	public String toString() {
		return "--------The speed of the object is : "+calculation() +" m/s";
	}

}

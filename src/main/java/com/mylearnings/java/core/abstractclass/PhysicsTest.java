/**
 * 
 */
package com.mylearnings.java.core.abstractclass;

/**
 * @author uppus
 *
 */
public class PhysicsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Speed speed=new Speed(22,4);
		Acceleration acceleration=new Acceleration(51.21, 24, 2.5);
		Density density=new Density(56, 65);
		NewtonsSecLaw newtonsSecLaw=new NewtonsSecLaw(34, 51);
		KineticEnergy kineticenergy=new KineticEnergy(11, 10);
		System.out.println(speed.methodExplaination());
		System.out.println(speed.toString());
		System.out.println(acceleration.methodExplaination());
		System.out.println(acceleration.toString());
		System.out.println(density.methodExplaination());
		System.out.println(density.toString());
		System.out.println(newtonsSecLaw.methodExplaination());
		System.out.println(newtonsSecLaw.toString());
		System.out.println(kineticenergy.methodExplaination());
		System.out.println(kineticenergy.toString());

		
	}

}

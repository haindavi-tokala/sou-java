/**
 * 
 */
package com.mylearnings.java.core.interface2ex;

/**
 * @author uppus
 *
 */
public class Engine implements Vehical {
private String fuelType;
private int cubicCapacity;
private String coolingType;
Engine(){
	
}
	public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getCubicCapacity() {
	return cubicCapacity;
}
public void setCubicCapacity(int cubicCapacity) {
	this.cubicCapacity = cubicCapacity;
}
public String getCoolingType() {
	return coolingType;
}
public void setCoolingType(String coolingType) {
	this.coolingType = coolingType;
}
	public Engine(String fuelType, int cubicCapacity, String coolingType) {
	super();
	this.fuelType = fuelType;
	this.cubicCapacity = cubicCapacity;
	this.coolingType = coolingType;
}
	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.interface2ex.Vehical#engine(java.lang.String)
	 */
	@Override
	public String engine(String typeOfEngine) {
		// TODO Auto-generated method stub
		return typeOfEngine;
	}
	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", cubicCapacity="
				+ cubicCapacity + ", coolingType=" + coolingType + "]";
	}

}

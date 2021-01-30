/**
 * 
 */
package com.mylearnings.java.core.interfaceex;

/**
 * @author uppus
 *
 */
public class Bus implements Vehical {
private String busName;
private int noOfSeats;
private int costOfBus;
public Bus(){
}

	public String getBusName() {
	return busName;
}

public void setBusName(String busName) {
	this.busName = busName;
}

public int getNoOfSeats() {
	return noOfSeats;
}

public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}

public int getCostOfBus() {
	return costOfBus;
}

public void setCostOfBus(int costOfBus) {
	this.costOfBus = costOfBus;
}

	@Override
	public String accessories(String acc1, String acc2, String acc3, String acc4) {
		// TODO Auto-generated method stub
		return "Accessories of the Bus " + busName + " are" + "1. " + acc1
				+ " 2. " + acc2 + " 3. " + acc3 + " 4. " + acc4;
	}

	@Override
	public String engine(String typeOfEngine) {
		// TODO Auto-generated method stub
		return typeOfEngine;
	}

	@Override
	public String features(String feature1, String feature2, String feature3,
			String feature4) {
		// TODO Auto-generated method stub
		return "Features of  " + busName + " are" + "1. " + feature1
				+ " 2. " + feature2 + " 3. " + feature3 + " 4. " + feature4;
	}
	public int fuelCapacity(int capacityOfFuel){
		return capacityOfFuel;
	}
	public int battery(int batteryCapacity){
		return batteryCapacity;
	}

	@Override
	public String toString() {
		return "Bus [busName=" + busName + ", noOfSeats=" + noOfSeats
				+ ", costOfBus=" + costOfBus + "]";
	}

}

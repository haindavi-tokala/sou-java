/**
 * 
 */
package com.mylearnings.java.core.interface2ex;


public class Bus  {
	private String busName;
	private int noOfSeats;
	private int costOfBus;
	Bus(){
		
	}
public Bus( String busName, int noOfSeats, int costOfBus) {
		
		this.busName = busName;
		this.noOfSeats = noOfSeats;
		this.costOfBus = costOfBus;
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

	
	public String accessories(String acc1, String acc2, String acc3, String acc4) {
		// TODO Auto-generated method stub
		return "Accessories of the Bus " + busName + " are" + "1. " + acc1
				+ " 2. " + acc2 + " 3. " + acc3 + " 4. " + acc4;
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

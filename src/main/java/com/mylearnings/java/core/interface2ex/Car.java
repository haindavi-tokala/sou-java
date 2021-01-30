/**
 * 
 */
package com.mylearnings.java.core.interface2ex;

/**
 * @author uppus
 * 
 */
public class Car  {
	private String carName;
	private int priceOfCar;
	private int noOfSeats;
private String engineType;

	Car(){
		
	}

	public Car(  String carName, int priceOfCar, int noOfSeats,String engineType) {
		 
		this.carName = carName;
		this.priceOfCar = priceOfCar;
		this.noOfSeats = noOfSeats;
		this. engineType= engineType;
	}



	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getPriceOfCar() {
		return priceOfCar;
	}

	public void setPriceOfCar(int priceOfCar) {
		this.priceOfCar = priceOfCar;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mylearnings.java.core.interfaceex.Vehical#accessories(java.lang.String
	 * , java.lang.String, java.lang.String, java.lang.String)
	 */
	public String accessories(String acc1, String acc2, String acc3, String acc4) {

		return "Accessories of the car " + carName + " are " + "1. " + acc1
				+ " 2. " + acc2 + " 3. " + acc3 + " 4. " + acc4;
	}

	
	
	
	
	public String fuelType(String typeOfFuel){
		return typeOfFuel+" is used in "+carName;
		
	}
	public int speed(int speedOfCar){
		return speedOfCar;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", priceOfCar=" + priceOfCar
				+ ", noOfSeats=" + noOfSeats + ", engineType=" + engineType
				+ "]";
	}

	
	
	

}

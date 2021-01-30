/**
 * 
 */
package com.mylearnings.java.core.interfaceex;

/**
 * @author uppus
 * 
 */
public class Car implements Vehical {
	private String carName;
	private int priceOfCar;
	private int noOfSeats;

	public Car() {

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
	@Override
	public String accessories(String acc1, String acc2, String acc3, String acc4) {

		return "Accessories of the car " + carName + " are" + "1. " + acc1
				+ " 2. " + acc2 + " 3. " + acc3 + " 4. " + acc4;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mylearnings.java.core.interfaceex.Vehical#engine(java.lang.String)
	 */
	@Override
	public String engine(String typeOfEngine) {
		return "Type of Engine : " + typeOfEngine + " of the car " + carName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mylearnings.java.core.interfaceex.Vehical#features(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String features(String feature1, String feature2, String feature3,
			String feature4) {
		return "Features of the car " + carName + " are" + "1. " + feature1
				+ " 2. " + feature2 + " 3. " + feature3 + " 4. " + feature4;

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
				+ ", noOfSeats=" + noOfSeats + "]";
	}

}

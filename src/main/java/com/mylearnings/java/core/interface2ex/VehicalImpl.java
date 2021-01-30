package com.mylearnings.java.core.interface2ex;

public class VehicalImpl implements Vehical {
	private Car car;
	private Bus bus;
	VehicalImpl(){
		
	}
	public VehicalImpl(Car car, Bus bus) {
		super();
		this.car = car;
		this.bus = bus;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	@Override
	public String engine(String typeOfEngine) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

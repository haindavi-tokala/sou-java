package com.mylearnings.java.core.interface2ex;

public class FinalCar {

	public static void main(String[] args) {
		VehicalImpl vehicalImpl=new VehicalImpl();
		Car car=new Car();
		car.setCarName("Rolls-Royce");
		car.setNoOfSeats(5);
		car.setPriceOfCar(234567);
		Engine engine=new Engine();
		engine.setCoolingType("Air Cooled");
		engine.setCubicCapacity(110);
		engine.setFuelType("Petrol");
		Features features=new Features("Bluetooth","Music System","Air Conditioner", "Digital Odometer");
		System.out.println(car.toString());
		System.out.println(engine.toString());
		System.out.println(features.toString());
		System.out.println(car.accessories("Air Freshner", "Cloth", "Repair Kit", "GPS Navigator"));
		Bus bus=new Bus();
		
	}

}

package com.vehiclerental;

// Inheritance, Car is a subclass of Vehicle
public class Car extends Vehicle {
	double insuranceCharge;
	
	public Car(String vehicleNumber, String model, double ratePerDay, int days, double insuranceCharge) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceCharge = insuranceCharge;
	}

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return (ratePerDay + insuranceCharge) * days;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Car " + " | " + vehicleNumber + " | " + model + " | " + days + " | " + ratePerDay);
	}
	
	
}

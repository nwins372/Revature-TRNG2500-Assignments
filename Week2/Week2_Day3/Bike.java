package com.vehiclerental;

// Inheritance, Bike is a subclass of Vehicle
public class Bike extends Vehicle{
	
	public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}

	@Override
	public double calculateRent() {
		
		return (ratePerDay * days) * 0.9;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike " + " | " + vehicleNumber + " | " + model + " | " + days + " | " + ratePerDay);
	}
	
}

package com.vehiclerental;
import java.util.Scanner;

public class RentalApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of vehicles:");
		int numberOfVehicles = sc.nextInt();
		sc.nextLine();
		
		double totalRent = 0.0;
		
		Vehicle[] vehicles = new Vehicle[numberOfVehicles];
		for (int i = 0; i < numberOfVehicles; i++) {
			int type = 0;
			while (true) {
                System.out.print("Enter type (1-Car, 2-Bike): ");
                if (sc.hasNextInt()) {
                    type = sc.nextInt();
                    sc.nextLine(); 
                    if (type == 1 || type == 2) {
                        break;
                    }
                } else {
                    sc.nextLine(); 
                }
                System.out.println("Invalid vehicle type. Please enter 1 for Car or 2 for Bike.");
            }
			
			System.out.print("Enter Vehicle Number: ");
            String vehicleNumber = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Rate per Day: ");
            double ratePerDay = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();
            sc.nextLine();
            
            // Regardless if they are Car or Bike, w/ runtime polymorphism the variables are Vehicles
            
            if (type == 1) {
                System.out.print("Enter Insurance per Day: ");
                double insurancePerDay = sc.nextDouble();
                sc.nextLine(); 

                Vehicle v = new Car(vehicleNumber, model, ratePerDay, days, insurancePerDay);
                vehicles[i] = v;
            } else {
                Vehicle v = new Bike(vehicleNumber, model, ratePerDay, days);
                vehicles[i] = v;
            }
        }
		System.out.println("--- Rental Details ---");

		// Polymorphism, the calculateRent method is overridden for Car and Bike from vehicle
        for (Vehicle v : vehicles) {
            v.displayDetails();
            totalRent += v.calculateRent();
        }

        System.out.println("Total Rent Collected: " + totalRent);

        sc.close();
			
			
		}
	

	}



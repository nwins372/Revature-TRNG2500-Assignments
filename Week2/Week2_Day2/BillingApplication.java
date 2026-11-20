// package com.smartstore.billing;
package week2.day2.assignment1;

import java.util.Scanner;

public class BillingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalAmount = productPrice * quantity;
        double discountAmount = calculateDiscount(totalAmount);
        double finalAmount = totalAmount - discountAmount;

        printBill(
                customerName,
                productName,
                totalAmount,
                discountAmount,
                finalAmount
        );

        scanner.close();
    }

    // Calculates the discount amount in rupees.
    public static double calculateDiscount(double totalAmount) {
        double discountPercentage = 0.0;

        if (totalAmount >= 5000) {
            discountPercentage = 10.0;
        } else if (totalAmount >= 1000) {
            discountPercentage = 5.0;
        }

        return totalAmount * discountPercentage / 100;
    }

    // Prints the bill using the existing output format.
    public static void printBill(
            String customerName,
            String productName,
            double totalAmount,
            double discountAmount,
            double finalAmount) {

        double discountPercentage = 0.0;

        if (totalAmount >= 5000) {
            discountPercentage = 10.0;
        } else if (totalAmount >= 1000) {
            discountPercentage = 5.0;
        }

        System.out.println("\nSmartStore Billing Details");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
        System.out.printf("Discount Percentage: %.2f%%%n", discountPercentage);
        System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
    }
}

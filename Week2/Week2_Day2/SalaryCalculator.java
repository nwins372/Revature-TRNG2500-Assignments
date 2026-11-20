package week2.day2.assignment1;

import java.util.Scanner;

/**
 * Calculates an employee's allowances, professional tax, and net salary.
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee details
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Clear the scanner buffer

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Stop execution if an invalid salary is entered
        if (basicSalary < 0) {
            System.out.println("Error: Basic salary cannot be negative.");
            scanner.close();
            return;
        }

        // Calculate salary components
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary, hra, da);
        double professionalTax = calculateProfessionalTax(grossSalary);
        double netSalary = grossSalary - professionalTax;

        // Display the salary report
        displaySalaryDetails(
                employeeId,
                employeeName,
                basicSalary,
                hra,
                da,
                grossSalary,
                professionalTax,
                netSalary);

        scanner.close();
    }

    // Calculates 20% of the basic salary as House Rent Allowance
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    // Calculates 10% of the basic salary as Dearness Allowance
    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    // Calculates the gross salary
    public static double calculateGrossSalary(
            double basicSalary,
            double hra,
            double da) {
        return basicSalary + hra + da;
    }

    // Deducts ₹200 professional tax when gross salary is above ₹20,000
    public static double calculateProfessionalTax(double grossSalary) {
        if (grossSalary > 20000) {
            return 200;
        }

        return 0;
    }

    // Displays all employee and salary information
    public static void displaySalaryDetails(
            int employeeId,
            String employeeName,
            double basicSalary,
            double hra,
            double da,
            double grossSalary,
            double professionalTax,
            double netSalary) {

        System.out.println("\n----------- Employee Salary Details -----------");
        System.out.printf("Employee ID:       %d%n", employeeId);
        System.out.printf("Employee Name:     %s%n", employeeName);
        System.out.printf("Basic Salary:      ₹%.2f%n", basicSalary);
        System.out.printf("HRA (20%%):         ₹%.2f%n", hra);
        System.out.printf("DA (10%%):          ₹%.2f%n", da);
        System.out.printf("Gross Salary:      ₹%.2f%n", grossSalary);
        System.out.printf("Professional Tax:  ₹%.2f%n", professionalTax);
        System.out.printf("Net Salary:        ₹%.2f%n", netSalary);
        System.out.println("-----------------------------------------------");
    }
}

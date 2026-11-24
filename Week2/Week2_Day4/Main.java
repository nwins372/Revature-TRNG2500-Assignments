package com.filehandlinglab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Alice", "Finance", 100, 90000);
		Employee e2 = new Employee("Bob", "Engineering", 101, 80000);
		Employee e3 = new Employee("Charlie", "Maintenance", 102, 80000);
		Employee e4 = new Employee("David", "HR", 103, 50000);
		Employee e5 = new Employee("Evelynn", "Accounting", 104, 100000);
		
		Employee[] emps = {e1, e2, e3, e4, e5};
		
		try (FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(emps);
			System.out.println("Employees written to employees.dat.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Employee[] retrievedEmps = (Employee[]) ois.readObject();
			System.out.println("\nEmployees:");
			for (Employee emp : retrievedEmps) {
				System.out.println(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	}



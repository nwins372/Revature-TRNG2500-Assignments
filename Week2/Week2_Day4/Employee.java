package com.filehandlinglab;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	String empName;
	String department;
	int empId;
	double salary;
	
	public Employee() {
		
			
	}

	public Employee(String empName, String department, int empId, double salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", department=" + department + ", empId=" + empId + ", salary=" + salary
				+ "]";
	}

	
	
	
}

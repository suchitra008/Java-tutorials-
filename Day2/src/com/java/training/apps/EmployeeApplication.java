package com.java.training.apps;

import com.java.training.oops.Contractor;
import com.java.training.oops.FullTimeEmployee;

public class EmployeeApplication {

	public static void main(String[] args) {

		Contractor contractor = new Contractor("Alex", "E001", 30, 8);
		System.out.println("Contractor salary is " + contractor.calculateSalary());

		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John", "E002", 70);
		System.out.println("FullTimeEmployee salary is : " + fullTimeEmployee.calculateSalary());
	}

}

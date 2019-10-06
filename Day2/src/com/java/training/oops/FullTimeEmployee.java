package com.java.training.oops;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name, String id, int paymentPerHour) {
		super(name, id, paymentPerHour);
	}
	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}
}
package com.java.training.oops;
public class Contractor extends Employee {
	
	private int workingHours;
	
	public Contractor(String name, String id, int paymentPerHour, int workingHours) {
		super(name, id, paymentPerHour);
		this.workingHours = workingHours;
	}
	
	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}
}
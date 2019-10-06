package com.java.training.oops;
/**
 * @author suchitraravindran
 * Inheritance and abstraction
 */
public abstract class Employee {
	
	private String name;
	private String id;
	private int paymentPerHour;
	
	public Employee(String name, String id, int paymentPerHour) {
		this.name = name;
		this.id = id;
		this.paymentPerHour = paymentPerHour;
	}
	
	public abstract int calculateSalary();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
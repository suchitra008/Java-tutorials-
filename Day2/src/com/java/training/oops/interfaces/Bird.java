package com.java.training.oops.interfaces;

public class Bird extends Animal {

	public void sing(){
		System.out.println("Bird.enclosing_method()");
	}

	@Override
	public void showDetails() {
		System.out.println("Bird.showDetails() nooflegs: " + getNooflegs());
	}
	
}

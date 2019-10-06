package com.java.training.oops.interfaces;

public abstract class Animal {

	private int nooflegs;

	public int getNooflegs() {
		return nooflegs;
	}

	public void setNooflegs(int nooflegs) {
		this.nooflegs = nooflegs;
	}
	public abstract void showDetails() ;
}

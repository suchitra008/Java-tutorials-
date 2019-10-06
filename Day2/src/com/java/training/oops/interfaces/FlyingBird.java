package com.java.training.oops.interfaces;

public class FlyingBird extends Bird implements IFly{

	private int speed;
	private String wingsColor;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void fly() {
		System.out.println("FlyingBird.fly() - Speed ! - " + speed );
	}

	@Override
	public void showDetails() {
		super.showDetails();//calling showDetail method of base claas (bird)
		System.out.println("Bird.showDetails() nooflegs: " + getWingsColor());

	}

	public String getWingsColor() {
		return wingsColor;
	}

	public void setWingsColor(String wingsColor) {
		this.wingsColor = wingsColor;
	}
	                                                 
}

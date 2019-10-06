package com.java.training.apps;

import com.java.training.oops.interfaces.Bird;
import com.java.training.oops.interfaces.FlyingBird;

public class AnimalApplication {

	public static void main(String[] args) {
		
		Bird penguins = new Bird();
		penguins.setNooflegs(2);
		penguins.showDetails();
		
		
		FlyingBird parrot = new FlyingBird();
		parrot.setSpeed(20);
		parrot.setNooflegs(2);
		parrot.setWingsColor("Green");
		
		parrot.fly();
		parrot.showDetails();
	}

}

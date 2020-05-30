package com.gorygon.strategy;

public class StrategyPlayground {
	public static void main(String[] args) {
		Duck yellowDucky = new RubberDuck("Rubber Ducky", 1, "air...");
		Duck superDuck = new SuperDuck("SuperDuck", 1000, "yellow Ducks");

		System.out.println(yellowDucky.getAlias()  + ": " + yellowDucky.tryFlying());
		System.out.println(superDuck.getAlias() + ": " + superDuck.tryFlying());

		yellowDucky.setFlyingType(new SimpleFlying());

		System.out.println(yellowDucky.getAlias()  + ": " + yellowDucky.tryFlying());
	}
}

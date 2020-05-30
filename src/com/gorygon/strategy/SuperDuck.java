package com.gorygon.strategy;


public class SuperDuck extends Duck {
	public SuperDuck(String alias, int age, String faveFood) {
		super(alias, age, faveFood);
		flyingType = new SimpleFlying();
	}
}

package com.gorygon.strategy;

public class RubberDuck extends Duck {
	public RubberDuck(String alias, int age, String faveFood) {
		super(alias, age, faveFood);
		flyingType = new NoFlying();
	}
}

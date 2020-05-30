package com.gorygon.strategy;

public class SimpleFlying implements FlyingBehavior {
	@Override
	public String tryFlying() {
		return "I can fly smoothly!";
	}
}

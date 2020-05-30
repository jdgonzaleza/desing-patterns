package com.gorygon.strategy;

public class NoFlying implements FlyingBehavior {
	@Override
	public String tryFlying() {
		return "I can't fly ☹️";
	}
}

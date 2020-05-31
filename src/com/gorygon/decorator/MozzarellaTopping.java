package com.gorygon.decorator;

public class MozzarellaTopping extends ToppingDecorator {

	public MozzarellaTopping(Pizza thePizza) {
		super(thePizza);
		System.out.println("Adding Dough");
		System.out.println("Adding moz");
	}

	@Override
	public String getDescription() {
		return thePizza.getDescription() + ", Mozzarella";
	}

	@Override
	public double getCost() {
		return thePizza.getCost() + .40;
	}
}

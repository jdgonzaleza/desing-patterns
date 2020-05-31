package com.gorygon.decorator;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza thePizza;

	public ToppingDecorator(Pizza thePizza) {
		this.thePizza = thePizza;
	}

	@Override
	public String getDescription() {
		return thePizza.getDescription();
	}

	@Override
	public double getCost() {
		return thePizza.getCost();
	}
}

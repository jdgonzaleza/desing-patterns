package com.gorygon.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza thePizza) {
		super(thePizza);
		System.out.println("Adding sauce");
	}

	@Override
	public String getDescription() {
		return thePizza.getDescription() + ", tomato sauce";
	}

	@Override
	public double getCost() {
		return thePizza.getCost() + .35;
	}
}

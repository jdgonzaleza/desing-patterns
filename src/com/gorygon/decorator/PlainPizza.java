package com.gorygon.decorator;

public class PlainPizza implements  Pizza{

	@Override
	public String getDescription() {
		return "Thin dough";
	}

	@Override
	public double getCost() {
		return 4.00;
	}
}

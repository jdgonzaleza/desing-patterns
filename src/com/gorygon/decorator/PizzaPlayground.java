package com.gorygon.decorator;

public class PizzaPlayground {
	public static void main(String[] args) {
		Pizza superPizza = new TomatoSauce(new MozzarellaTopping(new PlainPizza()));
		System.out.println("Description: " + superPizza.getDescription());
		System.out.println("Price: " + superPizza.getCost());
	}
}

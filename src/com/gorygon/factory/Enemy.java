package com.gorygon.factory;

public abstract class Enemy {
	private String name;
	private int damage;
	private int id;

	public Enemy(int id,String name, int damage) {
		this.id = id;
		this.name = name;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}

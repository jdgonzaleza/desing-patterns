package com.gorygon.strategy;

public class Duck {
	private String alias;
	private int age;
	private String faveFood;

	public Duck(String alias, int age, String faveFood) {
		alias = alias;
		this.age = age;
		this.faveFood = faveFood;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFaveFood() {
		return faveFood;
	}

	public void setFaveFood(String faveFood) {
		this.faveFood = faveFood;
	}
}

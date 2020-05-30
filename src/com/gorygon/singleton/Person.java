package com.gorygon.singleton;

public class Person {
	private String name;
	private int age;

	public static Person firstAndOnlyInstance;

	private Person() {
		name = "Juan Diego";
		age = 23;
	}

	public static Person getInstance() {
		if(firstAndOnlyInstance == null) {
			firstAndOnlyInstance = new Person();
		}
		return firstAndOnlyInstance;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

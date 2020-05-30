package com.gorygon.singleton;

public class SingletonPlayground {
	public static void main(String[] args) {
		Person p1 = Person.getInstance();
		Person p2 = Person.getInstance();

		System.out.println(p1.toString() + " is equal to " + p2.toString());
	}
}

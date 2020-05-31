package com.gorygon.prototype;

public abstract class Virus implements Cloneable{
	protected String name;
	public abstract Virus makeCopy();
	public abstract String toString();
}

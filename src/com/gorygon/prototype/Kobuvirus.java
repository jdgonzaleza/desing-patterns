package com.gorygon.prototype;

public class Kobuvirus extends Virus {
	public Kobuvirus() {
		name = "The Kobuvirus";
	}

	@Override
	public Virus makeCopy() {
		Virus clone = null;
		try {
			clone = (Kobuvirus) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return name;
	}
}

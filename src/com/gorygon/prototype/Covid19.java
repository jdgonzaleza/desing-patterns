package com.gorygon.prototype;

public class Covid19 extends Virus {
	public Covid19() {
		name = "Karanavaiirisusus!";
	}
	@Override
	public Virus makeCopy() {
		Virus clone = null;
		try {
			clone = (Covid19) super.clone();
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

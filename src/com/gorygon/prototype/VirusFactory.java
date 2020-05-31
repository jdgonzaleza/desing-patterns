package com.gorygon.prototype;

public class VirusFactory {
	public Virus getClone(Virus virus) {
		return virus.makeCopy();
	}
}

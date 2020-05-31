package com.gorygon.adapter;

public class QuarterBack implements FootballPalyer {
	@Override
	public void throwForward() {
		System.out.println("throwing football forward");
	}

	@Override
	public void scoreTouchDown() {
		System.out.println("Yeaaahh!! touchdown!");
	}

	@Override
	public void snap() {
		System.out.println("HUT!");
	}
}

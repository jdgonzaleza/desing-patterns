package com.gorygon.bridge;

public abstract class EntretainmentDevice {
	protected int deviceState;
	protected int maxLevel;
	protected int volumenLevel;

	public abstract void buttonFive();
	public abstract void buttonSix();

	public void deviceFeedback() {
		if(deviceState > maxLevel || deviceState < 0) {
			deviceState = 0;
		}
		System.out.println("Device on: " + deviceState);
	}

	public void buttonSeven() {
		volumenLevel++;
		System.out.println("volumen level: " + volumenLevel);
	}

	public void buttonEight() {
		if(volumenLevel > 0 ) {
			volumenLevel--;
		}
		System.out.println("volume level: "+ volumenLevel);
	}

}

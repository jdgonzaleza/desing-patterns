package com.gorygon.adapter;

public class RugbyPlayerAdapter implements FootballPalyer{
	private RugbyPlayer rugbyPlayer;

	public RugbyPlayerAdapter( RugbyPlayer rugbyPlayer) {
		this.rugbyPlayer = rugbyPlayer;
	}

	@Override
	public void throwForward() {
		rugbyPlayer.throwBallSides();
	}

	@Override
	public void scoreTouchDown() {
		rugbyPlayer.scoreTry();
	}

	@Override
	public void snap() {
		rugbyPlayer.scrum();
	}
}

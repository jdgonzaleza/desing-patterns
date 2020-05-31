package com.gorygon.builder;

public class FrenchRobotBuilder implements RobotBuilder {
	private Robot robot;

	public FrenchRobotBuilder() {
		robot = new Robot();
	}

	@Override
	public RobotBuilder buildHead() {
		robot.setRobotHead("La Tête");
		return this;
	}

	@Override
	public RobotBuilder buildTorso() {
		robot.setRobotTorso("Le torse");
		return this;
	}

	@Override
	public RobotBuilder buildArms() {
		robot.setRobotArms("Les bras");
		return this;
	}

	@Override
	public RobotBuilder buildLegs() {
		robot.setRobotLegs("Les jambes");
		return this;
	}

	@Override
	public Robot getRobot() {
		return robot;
	}
}

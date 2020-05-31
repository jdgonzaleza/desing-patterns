package com.gorygon.builder;

public class RobotDirector {
	private RobotBuilder robotBuilder;

	public RobotDirector(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	public Robot getRobot() {
		return robotBuilder.getRobot();
	}

	public void makeRobot() {
		robotBuilder
						.buildHead()
						.buildArms()
						.buildLegs()
						.buildTorso();
	}
}

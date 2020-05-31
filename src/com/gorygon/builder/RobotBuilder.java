package com.gorygon.builder;

public interface RobotBuilder {
	public RobotBuilder buildHead();
	public RobotBuilder buildTorso();
	public RobotBuilder buildArms();
	public RobotBuilder buildLegs();
	public Robot getRobot();
}

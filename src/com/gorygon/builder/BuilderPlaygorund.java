package com.gorygon.builder;

public class BuilderPlaygorund {
	public static void main(String[] args) {
		RobotBuilder frenchBuilder = new FrenchRobotBuilder();
		RobotDirector director = new RobotDirector(frenchBuilder);
		director.makeRobot();
		Robot firstFrenchRobot = director.getRobot();
		System.out.println(firstFrenchRobot.getRobotHead());
		System.out.println(firstFrenchRobot.getRobotTorso());
		System.out.println(firstFrenchRobot.getRobotArms());
		System.out.println(firstFrenchRobot.getRobotLegs());
	}
}

package com.gorygon.builder;

public class Robot implements RobotPlan {
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	@Override
	public void setRobotHead(String robotHead) {
		this.robotHead = robotHead;
	}

	@Override
	public void setRobotTorso(String robotTorso) {
		this.robotTorso = robotTorso;
	}

	@Override
	public void setRobotArms(String robotArms) {
		this.robotArms = robotArms;
	}

	@Override
	public void setRobotLegs(String robotLegs) {
		this.robotLegs = robotLegs;
	}

	public String getRobotHead() {
		return robotHead;
	}

	public String getRobotTorso() {
		return robotTorso;
	}

	public String getRobotArms() {
		return robotArms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}
}

package com.gorygon.observer;

public class Participant implements Observer {
	private String real_barca;
	private String bvb_bayern;
	private String chealse_liverpool;
	private int participantId;
	private static int idTracker = 0;
	private Subject betLiveInfo;

	public Participant(Subject betLiveInfo) {
		this.betLiveInfo = betLiveInfo;
		this.participantId = ++idTracker;
		betLiveInfo.register(this);

		System.out.println("participant " + participantId + " was added to the bet");
	}
	@Override
	public void update(String real_barca, String bvb_bayern, String chealse_liverpool) {
		this.real_barca = real_barca != null ? real_barca : "0-0";
		this.bvb_bayern = bvb_bayern != null ? bvb_bayern : "0-0";
		this.chealse_liverpool = chealse_liverpool !=null ? chealse_liverpool : "0-0";

		printResults();
	}
	public void printResults() {
		System.out.println("real-barca: " + real_barca);
		System.out.println("bvb-bayern: " + bvb_bayern);
		System.out.println("chealse-liverpool: " + chealse_liverpool);
	}
}

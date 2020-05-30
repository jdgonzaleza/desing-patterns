package com.gorygon.observer;

public class ObserverPlayground {
	public static void main(String[] args) {
		FootballBetLiveInfo betLiveInfo = new FootballBetLiveInfo();
		Participant p1 = new Participant(betLiveInfo);

		betLiveInfo.setReal_barca("2-0");
		betLiveInfo.setBvb_bayern("3-3");
		betLiveInfo.setChealse_liverpool("5-0");

		Participant p2 = new Participant(betLiveInfo);
		betLiveInfo.setReal_barca("2-1");

		betLiveInfo.unregister(p1);
	}
}

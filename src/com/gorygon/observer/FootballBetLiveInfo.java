package com.gorygon.observer;

import java.util.ArrayList;
import java.util.List;

public class FootballBetLiveInfo implements Subject {

	private List<Observer> participants = new ArrayList<>();
	private String real_barca;
	private String bvb_bayern;
	private String chealse_liverpool;

	@Override
	public void register(Observer paticipant) {
		participants.add(paticipant);
	}

	@Override
	public void unregister(Observer paticipant) {
		participants.remove(paticipant);
		System.out.println("participant was removed from the bet");
	}

	@Override
	public void notifyObserver() {
		for(Observer participant : participants) {
			participant.update(real_barca, bvb_bayern, chealse_liverpool);
		}
	}

	public void setReal_barca(String real_barca) {
		this.real_barca = real_barca;
		notifyObserver();
	}

	public void setBvb_bayern(String bvb_bayern) {
		this.bvb_bayern = bvb_bayern;
		notifyObserver();
	}

	public void setChealse_liverpool(String chealse_liverpool) {
		this.chealse_liverpool = chealse_liverpool;
		notifyObserver();
	}
}

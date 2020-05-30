package com.gorygon.observer;

public interface Subject {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyObserver();
}

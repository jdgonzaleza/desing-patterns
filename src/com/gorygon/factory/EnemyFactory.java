package com.gorygon.factory;

public class EnemyFactory {
	public Enemy spawnEnemy(int id) {
		if(id == 1){
			return new Snipper();
		} else if (id == 2) {
			return new Locust();
		} else if (id == 3) {
			return new GiantSpider();
		} else {
			return null;
		}
	}
}

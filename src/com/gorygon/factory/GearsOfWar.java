package com.gorygon.factory;

import java.util.Random;

public class GearsOfWar {
	public static void main(String[] args) {
		EnemyFactory enemyFactory = new EnemyFactory();
		Enemy enemy;
		Random r = new Random();
		int id;
		for(int i = 0; i< 10; i++ ){
			id = r.nextInt(4-1) + 1;
			enemy = enemyFactory.spawnEnemy(id);
			System.out.println(enemy.getName() + " has damage: " + enemy.getDamage());
		}
	}
}

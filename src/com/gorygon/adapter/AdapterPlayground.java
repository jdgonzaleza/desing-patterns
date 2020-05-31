package com.gorygon.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterPlayground {
	public static void main(String[] args) {
		FootballPalyer quaterBack = new QuarterBack();
		RugbyPlayer rugbyPlayer = new RugbyPlayer();

		List<FootballPalyer> footballers = Arrays.asList(quaterBack, new RugbyPlayerAdapter(rugbyPlayer));

		footballers.stream().forEach(f -> {
			f.snap();
			f.throwForward();
			f.scoreTouchDown();
		});
	}
}

package com.gorygon.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypePlayground {
	public static void main(String[] args) {
		VirusFactory factory = new VirusFactory();

		List<Virus> virus = new ArrayList<>();
		virus.add(new Kobuvirus());
		virus.add(new Covid19());
		virus.add(factory.getClone(virus.get(0)));
		virus.add(factory.getClone(virus.get(1)));

		virus.stream().forEach(v -> System.out.println(v.toString()));
	}
}

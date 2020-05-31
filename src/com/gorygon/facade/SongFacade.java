package com.gorygon.facade;

public class SongFacade {
	private GuitarLine guitarLine;
	private BassLine bassLine;
	private DrumsLine drumsLine;
	private Lyrics lyrics;

	private Song song;

	public SongFacade() {
		guitarLine = new GuitarLine();
		bassLine = new BassLine();
		drumsLine = new DrumsLine();
		lyrics = new Lyrics();

		song = new Song();
	}

	public Song createSong(String name) {
		song.setName(name);
		song.setGuitarPart(guitarLine.createLine());
		song.setBassPart(bassLine.createLine());
		song.setDrumsPart(drumsLine.createLine());
		song.setLyrics(lyrics.createLine());
		return song;
	}

}

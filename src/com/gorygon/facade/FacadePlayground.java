package com.gorygon.facade;

public class FacadePlayground {
	public static void main(String[] args) {
		SongFacade facade = new SongFacade();
		Song juanitasSong = facade.createSong("Las canciones de Juanita");

		System.out.println(juanitasSong.getName());
		System.out.println(juanitasSong.getLyrics());
		System.out.println(juanitasSong.getGuitarPart());
		System.out.println(juanitasSong.getBassPart());
		System.out.println(juanitasSong.getDrumsPart());
	}
}

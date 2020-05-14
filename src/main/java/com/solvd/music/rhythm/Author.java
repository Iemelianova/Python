package com.solvd.music.rhythm;

import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.music.MusicEras;
import com.solvd.music.rhythm.Rhythm;
public class Author extends Rhythm {

	private String composer;
	private final static Logger LOGGER = Logger.getLogger(Author.class);
	
	
	public Author() {
	}

	public Author(int century, String era, String kind, String composer) {
		super(century, era, kind);
		this.composer = composer;

	}
	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}
	@Override
	public void printInfo() {
		Author a = new Author();
		LOGGER.info("Century: " + a.getCentury());
		LOGGER.info("Music era: " + a.getEra());
		LOGGER.info("Kind of music: " + a.getKind());
		LOGGER.info("Composer: " + composer);

	}

	
}


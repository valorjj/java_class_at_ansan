package model;

import java.util.Comparator;

import controller.Manager;

public class Lyrics extends Manager implements Comparator<Lyrics> {

	// [필드]extends student_scores implements Comparable<Student>
	private String lyrics;
	private int number;

	// [생성자]
	public Lyrics(String lyrics, int number) {
		this.lyrics = lyrics;
		this.number = number;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int compare(Lyrics o1, Lyrics o2) {
		return o1.getNumber() - o2.getNumber();
	}

}

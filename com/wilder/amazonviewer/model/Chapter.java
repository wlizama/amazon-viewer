package com.wilder.amazonviewer.model;

public class Chapter extends Movie{
	private int id;
	private int sessionNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.setsessionNumber(sessionNumber);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getsessionNumber() {
		return sessionNumber;
	}
	public void setsessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		return  "\n :: CHAPTER ::" + 
			"\n Title: " + getTitle() +
			"\n Year: " + getYear() + 
			"\n Creator: " + getCreator() +
			"\n Duration: " + getDuration();
	}
}

package com.wilder.amazonviewer.model;

public class Serie extends Film{
	private int id;
	private int timeViewed;
	private int sessionQuantity;
	private Chapter[] chapter;
	
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	public int getsessionQuantity() {
		return sessionQuantity;
	}

	public void setsessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public Chapter[] getChapter() {
		return chapter;
	}

	public void setChapter(Chapter[] chapter) {
		this.chapter = chapter;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
}

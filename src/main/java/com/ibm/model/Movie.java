package com.ibm.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	
	private int mid;
	private String moviename;
	private String theatre;
	private String  timings;
	
	public Movie() {
		
	}
	public Movie(int mid, String moviename, String theatre, String timings) {
		super();
		this.mid = mid;
		this.moviename = moviename;
		this.theatre = theatre;
		this.timings = timings;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getTheatre() {
		return theatre;
	}
	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	
	

}

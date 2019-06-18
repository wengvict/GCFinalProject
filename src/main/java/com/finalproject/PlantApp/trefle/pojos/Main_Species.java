package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main_Species {
	
	private String type;
	private String status;
	private String synonym;
	private int year;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSynonym() {
		return synonym;
	}
	public void setSynonym(String synonym) {
		this.synonym = synonym;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Main_Species(String type, String status, String synonym, int year) {
		super();
		this.type = type;
		this.status = status;
		this.synonym = synonym;
		this.year = year;
	}
	public Main_Species() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Main_Species [type=" + type + ", status=" + status + ", synonym=" + synonym + ", year=" + year + "]";
	}
	
	

}

package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Precipitation_maximum {

	private Long inches;
	private Long cm;
	public Long getInches() {
		return inches;
	}
	public void setInches(Long inches) {
		this.inches = inches;
	}
	public Long getCm() {
		return cm;
	}
	public void setCm(Long cm) {
		this.cm = cm;
	}
	public Precipitation_maximum(Long inches, Long cm) {
		super();
		this.inches = inches;
		this.cm = cm;
	}
	public Precipitation_maximum() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "precipitation_maximum [inches=" + inches + ", cm=" + cm + "]";
	}
}

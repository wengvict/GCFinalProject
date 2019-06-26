package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Precipitation_maximum {

	private Double inches;
	private Double cm;
	
	public Precipitation_maximum() {
		super();
	}

	public Precipitation_maximum(Double inches, Double cm) {
		super();
		this.inches = inches;
		this.cm = cm;
	}

	public Double getInches() {
		return inches;
	}

	public void setInches(Double inches) {
		this.inches = inches;
	}

	public Double getCm() {
		return cm;
	}

	public void setCm(Double cm) {
		this.cm = cm;
	}

	@Override
	public String toString() {
		return "Precipitation_maximum [inches=" + inches + ", cm=" + cm + "]";
	}
	
	
}

package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Precipitation_minimum {
	
	private Double inches;
	private Double cm;
	
	public Precipitation_minimum() {
		super();
	}

	public Precipitation_minimum(Double inches, Double cm) {
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
		return "Precipitation_minimum [inches=" + inches + ", cm=" + cm + "]";
	}
	
	
	
}

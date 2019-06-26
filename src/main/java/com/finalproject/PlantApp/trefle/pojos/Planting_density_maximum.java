package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planting_density_maximum {
	
	private Double sqm;
	private Double acre;
	
	public Planting_density_maximum() {
		super();
	}

	public Planting_density_maximum(Double sqm, Double acre) {
		super();
		this.sqm = sqm;
		this.acre = acre;
	}

	public Double getSqm() {
		return sqm;
	}

	public void setSqm(Double sqm) {
		this.sqm = sqm;
	}

	public Double getAcre() {
		return acre;
	}

	public void setAcre(Double acre) {
		this.acre = acre;
	}

	@Override
	public String toString() {
		return "Planting_density_maximum [sqm=" + sqm + ", acre=" + acre + "]";
	}
	
	

}

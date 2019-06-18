package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planting_density_minimum {
	
	private Double sqm;
	private Double acre;
	
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
	public Planting_density_minimum(Double sqm, Double acre) {
		super();
		this.sqm = sqm;
		this.acre = acre;
	}
	public Planting_density_minimum() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Planting_density_minimum [sqm=" + sqm + ", acre=" + acre + "]";
	}
	

}

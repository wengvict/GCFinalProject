package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature_minimum {

	private Double deg_c;
	private Double deg_f;
	
	public Temperature_minimum() {
		super();
	}

	public Temperature_minimum(Double deg_c, Double deg_f) {
		super();
		this.deg_c = deg_c;
		this.deg_f = deg_f;
	}

	public Double getDeg_c() {
		return deg_c;
	}

	public void setDeg_c(Double deg_c) {
		this.deg_c = deg_c;
	}

	public Double getDeg_f() {
		return deg_f;
	}

	public void setDeg_f(Double deg_f) {
		this.deg_f = deg_f;
	}

	@Override
	public String toString() {
		return "Temperature_minimum [deg_c=" + deg_c + ", deg_f=" + deg_f + "]";
	}
	
	
	
}

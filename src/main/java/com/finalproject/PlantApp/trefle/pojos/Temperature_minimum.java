package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature_minimum {

	
	private Long deg_c;
	private Long deg_f;
	
	public Long getDeg_c() {
		return deg_c;
	}
	public void setDeg_c(Long deg_c) {
		this.deg_c = deg_c;
	}
	public Long getDeg_f() {
		return deg_f;
	}
	public void setDeg_f(Long deg_f) {
		this.deg_f = deg_f;
	}
	public Temperature_minimum(Long deg_c, Long deg_f) {
		super();
		this.deg_c = deg_c;
		this.deg_f = deg_f;
	}
	public Temperature_minimum() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Temperature_minimum [deg_c=" + deg_c + ", deg_f=" + deg_f + "]";
	}
	
	
}

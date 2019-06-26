package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mature_height {

	private Double cm;
	private Double ft;
	
	public Mature_height() {
		super();
	}

	public Mature_height(Double cm, Double ft) {
		super();
		this.cm = cm;
		this.ft = ft;
	}

	public Double getCm() {
		return cm;
	}

	public void setCm(Double cm) {
		this.cm = cm;
	}

	public Double getFt() {
		return ft;
	}

	public void setFt(Double ft) {
		this.ft = ft;
	}

	@Override
	public String toString() {
		return "Mature_height [cm=" + cm + ", ft=" + ft + "]";
	}
	
	
	
}

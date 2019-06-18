package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mature_height {

	
	private Long cm;
	private Long ft;
	public Long getCm() {
		return cm;
	}
	public void setCm(Long cm) {
		this.cm = cm;
	}
	public Long getFt() {
		return ft;
	}
	public void setFt(Long ft) {
		this.ft = ft;
	}
	public Mature_height(Long cm, Long ft) {
		super();
		this.cm = cm;
		this.ft = ft;
	}
	public Mature_height() {
		super();
	}
	@Override
	public String toString() {
		return "Mature_height [cm=" + cm + ", ft=" + ft + "]";
	}
	
	
}

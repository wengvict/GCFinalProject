package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SoilsAdaptation {

	
	private String medium;
	private String fine;
	private String coarse;
	
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getFine() {
		return fine;
	}
	public void setFine(String fine) {
		this.fine = fine;
	}
	public String getCoarse() {
		return coarse;
	}
	public void setCoarse(String coarse) {
		this.coarse = coarse;
	}
	public SoilsAdaptation(String medium, String fine, String coarse) {
		super();
		this.medium = medium;
		this.fine = fine;
		this.coarse = coarse;
	}
	public SoilsAdaptation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SoilsAdaptation [medium=" + medium + ", fine=" + fine + ", coarse=" + coarse + "]";
	}
	
	
}

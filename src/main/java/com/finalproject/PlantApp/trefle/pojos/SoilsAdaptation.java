package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SoilsAdaptation {

	private boolean medium;
	private boolean fine;
	private boolean coarse;
	
	public SoilsAdaptation() {
		super();
	}

	public SoilsAdaptation(boolean medium, boolean fine, boolean coarse) {
		super();
		this.medium = medium;
		this.fine = fine;
		this.coarse = coarse;
	}

	public boolean isMedium() {
		return medium;
	}

	public void setMedium(boolean medium) {
		this.medium = medium;
	}

	public boolean isFine() {
		return fine;
	}

	public void setFine(boolean fine) {
		this.fine = fine;
	}

	public boolean isCoarse() {
		return coarse;
	}

	public void setCoarse(boolean coarse) {
		this.coarse = coarse;
	}

	@Override
	public String toString() {
		return "SoilsAdaptation [medium=" + medium + ", fine=" + fine + ", coarse=" + coarse + "]";
	}
	
	
	
}	

package com.finalproject.PlantApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class USDAPlant {
	
	private String Symbol;
	@JsonProperty("Scientific_Name_x")
	private String scientificName;
	@JsonProperty("Common_Name")
	private String commonName;
	private String Duration;
	
	public USDAPlant() {
		super();
	}

	public USDAPlant(String symbol, String scientificName, String commonName, String duration) {
		super();
		Symbol = symbol;
		this.scientificName = scientificName;
		this.commonName = commonName;
		Duration = duration;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	@Override
	public String toString() {
		return "USDAPlant [Symbol=" + Symbol + ", scientificName=" + scientificName + ", commonName=" + commonName
				+ ", Duration=" + Duration + "]";
	}
	
	

}

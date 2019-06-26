package com.finalproject.PlantApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class USDAPlant {
	
	@JsonProperty("Family")
	private String family;
	@JsonProperty("Family_Common_Name")
	private String familyCommonName;
	@JsonProperty("Category")
	private String category;
	@JsonProperty("TrefleClass")
	private String plantclass;
	@JsonProperty("Scientific_Name_x")
	private String scientificName;
	@JsonProperty("Common_Name")
	private String commonName;
	@JsonProperty("Duration")
	private String duration;
	
	public USDAPlant() {
		super();
	}

	public USDAPlant(String family, String familyCommonName, String category, String plantclass, String scientificName,
			String commonName, String duration) {
		super();
		this.family = family;
		this.familyCommonName = familyCommonName;
		this.category = category;
		this.plantclass = plantclass;
		this.scientificName = scientificName;
		this.commonName = commonName;
		this.duration = duration;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getFamilyCommonName() {
		return familyCommonName;
	}

	public void setFamilyCommonName(String familyCommonName) {
		this.familyCommonName = familyCommonName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPlantclass() {
		return plantclass;
	}

	public void setPlantclass(String plantclass) {
		this.plantclass = plantclass;
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
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "USDAPlant [family=" + family + ", familyCommonName=" + familyCommonName + ", category=" + category
				+ ", plantclass=" + plantclass + ", scientificName=" + scientificName + ", commonName=" + commonName
				+ ", duration=" + duration + "]";
	}

	
	

}

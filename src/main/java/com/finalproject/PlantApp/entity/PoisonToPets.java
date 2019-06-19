package com.finalproject.PlantApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PoisonToPets {
	
	private Integer id;
	private String commonname;
	private String scientificname;
	private String othernames;
	private String dogs;
	private String cats;
	private String horses;
	private String poisonproperty;
	private String symptoms;
	
	public PoisonToPets() {
		super();
	}

	public PoisonToPets(Integer id, String commonname, String scientificname, String othernames, String dogs,
			String cats, String horses, String poisonproperty, String symptoms) {
		super();
		this.id = id;
		this.commonname = commonname;
		this.scientificname = scientificname;
		this.othernames = othernames;
		this.dogs = dogs;
		this.cats = cats;
		this.horses = horses;
		this.poisonproperty = poisonproperty;
		this.symptoms = symptoms;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommonname() {
		return commonname;
	}

	public void setCommonname(String commonname) {
		this.commonname = commonname;
	}

	public String getScientificname() {
		return scientificname;
	}

	public void setScientificname(String scientificname) {
		this.scientificname = scientificname;
	}

	public String getOthernames() {
		return othernames;
	}

	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}

	public String getDogs() {
		return dogs;
	}

	public void setDogs(String dogs) {
		this.dogs = dogs;
	}

	public String getCats() {
		return cats;
	}

	public void setCats(String cats) {
		this.cats = cats;
	}

	public String getHorses() {
		return horses;
	}

	public void setHorses(String horses) {
		this.horses = horses;
	}

	public String getPoisonproperty() {
		return poisonproperty;
	}

	public void setPoisonproperty(String poisonproperty) {
		this.poisonproperty = poisonproperty;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	@Override
	public String toString() {
		return "PoisonToPets [id=" + id + ", commonname=" + commonname + ", scientificname=" + scientificname
				+ ", othernames=" + othernames + ", dogs=" + dogs + ", cats=" + cats + ", horses=" + horses
				+ ", poisonproperty=" + poisonproperty + ", symptoms=" + symptoms + "]";
	}	
	

}

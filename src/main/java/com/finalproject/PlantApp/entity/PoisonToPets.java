package com.finalproject.PlantApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PoisonToPets {
	
	private String commonname;
	private String scentificname;
	private String othernames;
	private String dogs;
	private String cats;
	private String horses;
	private String poisonproperty;
	private String symptoms;
	public String getCommonname() {
		return commonname;
	}
	public void setCommonname(String commonname) {
		this.commonname = commonname;
	}
	public String getScentificname() {
		return scentificname;
	}
	public void setScentificname(String scentificname) {
		this.scentificname = scentificname;
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
	
	
	
	public PoisonToPets() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public PoisonToPets(String commonname, String scentificname, String othernames, String dogs, String cats,
			String horses, String poisonproperty, String symptoms) {
		
		this.commonname = commonname;
		this.scentificname = scentificname;
		this.othernames = othernames;
		this.dogs = dogs;
		this.cats = cats;
		this.horses = horses;
		this.poisonproperty = poisonproperty;
		this.symptoms = symptoms;
	}
	
	
	@Override
	public String toString() {
		return "PoisonToPets [commonname=" + commonname + ", scentificname=" + scentificname + ", othernames="
				+ othernames + ", dogs=" + dogs + ", cats=" + cats + ", horses=" + horses + ", poisonproperty="
				+ poisonproperty + ", symptoms=" + symptoms + "]";
	}
	
	
	
	
	
	
	
	
	

}

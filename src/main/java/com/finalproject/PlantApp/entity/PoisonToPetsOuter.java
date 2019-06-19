package com.finalproject.PlantApp.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PoisonToPetsOuter {

	@JsonProperty("toxicplant")
	ArrayList<PoisonToPets> toxicplant;

	public PoisonToPetsOuter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<PoisonToPets> getToxicplant() {
		return toxicplant;
	}

	public void setToxicplant(ArrayList<PoisonToPets> toxicplant) {
		this.toxicplant = toxicplant;
	}

	@Override
	public String toString() {
		return "PoisonToPetsOuter [toxicplant=" + toxicplant + "]";
	}
	
	

}

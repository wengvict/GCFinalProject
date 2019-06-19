package com.finalproject.PlantApp.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PoisonToPetOuter {

	ArrayList<PoisonToPets> toxicplant;

	public PoisonToPetOuter() {
		super();
	}

	public PoisonToPetOuter(ArrayList<PoisonToPets> toxicplant) {
		super();
		this.toxicplant = toxicplant;
	}

	public ArrayList<PoisonToPets> getToxicplant() {
		return toxicplant;
	}

	public void setToxicplant(ArrayList<PoisonToPets> toxicplant) {
		this.toxicplant = toxicplant;
	}

	@Override
	public String toString() {
		return "PoisonToPetOuter [toxicplant=" + toxicplant + "]";
	}
	
	
}

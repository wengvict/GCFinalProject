package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flower {
	
	private boolean conspicuous;
	private String color;
	
	public Flower() {
		super();
	}

	public Flower(boolean conspicuous, String color) {
		super();
		this.conspicuous = conspicuous;
		this.color = color;
	}

	public boolean isConspicuous() {
		return conspicuous;
	}

	public void setConspicuous(boolean conspicuous) {
		this.conspicuous = conspicuous;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Flower [conspicuous=" + conspicuous + ", color=" + color + "]";
	}

	

}

package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fruit_or_seed {
	
	private String seed_persistence;
	private String seed_period_end;
	private String seed_period_begin;
	private String seed_abundance;
	private String conspicuous;
	private String color;
	
	public Fruit_or_seed() {
		super();
	}

	public Fruit_or_seed(String seed_persistence, String seed_period_end, String seed_period_begin, String seed_abundance,
			String conspicuous, String color) {
		super();
		this.seed_persistence = seed_persistence;
		this.seed_period_end = seed_period_end;
		this.seed_period_begin = seed_period_begin;
		this.seed_abundance = seed_abundance;
		this.conspicuous = conspicuous;
		this.color = color;
	}

	public String getSeed_persistence() {
		return seed_persistence;
	}

	public void setSeed_persistence(String seed_persistence) {
		this.seed_persistence = seed_persistence;
	}

	public String getSeed_period_end() {
		return seed_period_end;
	}

	public void setSeed_period_end(String seed_period_end) {
		this.seed_period_end = seed_period_end;
	}

	public String getSeed_period_begin() {
		return seed_period_begin;
	}

	public void setSeed_period_begin(String seed_period_begin) {
		this.seed_period_begin = seed_period_begin;
	}

	public String getSeed_abundance() {
		return seed_abundance;
	}

	public void setSeed_abundance(String seed_abundance) {
		this.seed_abundance = seed_abundance;
	}

	public String getConspicuous() {
		return conspicuous;
	}

	public void setConspicuous(String conspicuous) {
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
		return "Fruit_or_seed [seed_persistence=" + seed_persistence + ", seed_period_end=" + seed_period_end
				+ ", seed_period_begin=" + seed_period_begin + ", seed_abundance=" + seed_abundance + ", conspicuous="
				+ conspicuous + ", color=" + color + "]";
	}
	
	

}

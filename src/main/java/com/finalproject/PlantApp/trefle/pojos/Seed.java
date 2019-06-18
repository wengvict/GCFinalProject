package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Seed {

	
	private String vegetative_spread_rate;
	private String small_grain;
	private String seeds_per_pound;
	private String seeding_vigor;
	private String seed_spread_rate;
	private String commercial_availability;
	private String bloom_period;
	public String getVegetative_spread_rate() {
		return vegetative_spread_rate;
	}
	public void setVegetative_spread_rate(String vegetative_spread_rate) {
		this.vegetative_spread_rate = vegetative_spread_rate;
	}
	public String getSmall_grain() {
		return small_grain;
	}
	public void setSmall_grain(String small_grain) {
		this.small_grain = small_grain;
	}
	public String getSeeds_per_pound() {
		return seeds_per_pound;
	}
	public void setSeeds_per_pound(String seeds_per_pound) {
		this.seeds_per_pound = seeds_per_pound;
	}
	public String getSeeding_vigor() {
		return seeding_vigor;
	}
	public void setSeeding_vigor(String seeding_vigor) {
		this.seeding_vigor = seeding_vigor;
	}
	public String getSeed_spread_rate() {
		return seed_spread_rate;
	}
	public void setSeed_spread_rate(String seed_spread_rate) {
		this.seed_spread_rate = seed_spread_rate;
	}
	public String getCommercial_availability() {
		return commercial_availability;
	}
	public void setCommercial_availability(String commercial_availability) {
		this.commercial_availability = commercial_availability;
	}
	public String getBloom_period() {
		return bloom_period;
	}
	public void setBloom_period(String bloom_period) {
		this.bloom_period = bloom_period;
	}
	
	
}

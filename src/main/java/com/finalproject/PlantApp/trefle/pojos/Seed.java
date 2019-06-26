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
	
	public Seed() {
		super();
	}

	public Seed(String vegetative_spread_rate, String small_grain, String seeds_per_pound, String seeding_vigor,
			String seed_spread_rate, String commercial_availability, String bloom_period) {
		super();
		this.vegetative_spread_rate = vegetative_spread_rate;
		this.small_grain = small_grain;
		this.seeds_per_pound = seeds_per_pound;
		this.seeding_vigor = seeding_vigor;
		this.seed_spread_rate = seed_spread_rate;
		this.commercial_availability = commercial_availability;
		this.bloom_period = bloom_period;
	}

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

	@Override
	public String toString() {
		return "Seed [vegetative_spread_rate=" + vegetative_spread_rate + ", small_grain=" + small_grain
				+ ", seeds_per_pound=" + seeds_per_pound + ", seeding_vigor=" + seeding_vigor + ", seed_spread_rate="
				+ seed_spread_rate + ", commercial_availability=" + commercial_availability + ", bloom_period="
				+ bloom_period + "]";
	}
	
	
	
}

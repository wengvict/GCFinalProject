package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Propagation {
	
	private boolean tubers;
	private boolean sprigs;
	private boolean sod;
	private boolean seed;
	private boolean cuttings;
	private boolean corms;
	private boolean container;
	private boolean bulbs;
	private boolean bare_root;
	
	public Propagation() {
		super();
	}

	public Propagation(boolean tubers, boolean sprigs, boolean sod, boolean seed, boolean cuttings, boolean corms,
			boolean container, boolean bulbs, boolean bare_root) {
		super();
		this.tubers = tubers;
		this.sprigs = sprigs;
		this.sod = sod;
		this.seed = seed;
		this.cuttings = cuttings;
		this.corms = corms;
		this.container = container;
		this.bulbs = bulbs;
		this.bare_root = bare_root;
	}

	public boolean isTubers() {
		return tubers;
	}

	public void setTubers(boolean tubers) {
		this.tubers = tubers;
	}

	public boolean isSprigs() {
		return sprigs;
	}

	public void setSprigs(boolean sprigs) {
		this.sprigs = sprigs;
	}

	public boolean isSod() {
		return sod;
	}

	public void setSod(boolean sod) {
		this.sod = sod;
	}

	public boolean isSeed() {
		return seed;
	}

	public void setSeed(boolean seed) {
		this.seed = seed;
	}

	public boolean isCuttings() {
		return cuttings;
	}

	public void setCuttings(boolean cuttings) {
		this.cuttings = cuttings;
	}

	public boolean isCorms() {
		return corms;
	}

	public void setCorms(boolean corms) {
		this.corms = corms;
	}

	public boolean isContainer() {
		return container;
	}

	public void setContainer(boolean container) {
		this.container = container;
	}

	public boolean isBulbs() {
		return bulbs;
	}

	public void setBulbs(boolean bulbs) {
		this.bulbs = bulbs;
	}

	public boolean isBare_root() {
		return bare_root;
	}

	public void setBare_root(boolean bare_root) {
		this.bare_root = bare_root;
	}

	@Override
	public String toString() {
		return "Propagation [tubers=" + tubers + ", sprigs=" + sprigs + ", sod=" + sod + ", seed=" + seed
				+ ", cuttings=" + cuttings + ", corms=" + corms + ", container=" + container + ", bulbs=" + bulbs
				+ ", bare_root=" + bare_root + "]";
	}
	
	

}

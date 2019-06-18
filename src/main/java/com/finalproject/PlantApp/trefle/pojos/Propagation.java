package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Propagation {
	
	private String tubers;
	private String sprigs;
	private String sod;
	private String seed;
	private String cuttings;
	private String corms;
	private String container;
	private String bulbs;
	private String bare_root;
	public String getTubers() {
		return tubers;
	}
	public void setTubers(String tubers) {
		this.tubers = tubers;
	}
	public String getSprigs() {
		return sprigs;
	}
	public void setSprigs(String sprigs) {
		this.sprigs = sprigs;
	}
	public String getSod() {
		return sod;
	}
	public void setSod(String sod) {
		this.sod = sod;
	}
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public String getCuttings() {
		return cuttings;
	}
	public void setCuttings(String cuttings) {
		this.cuttings = cuttings;
	}
	public String getCorms() {
		return corms;
	}
	public void setCorms(String corms) {
		this.corms = corms;
	}
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public String getBulbs() {
		return bulbs;
	}
	public void setBulbs(String bulbs) {
		this.bulbs = bulbs;
	}
	public String getBare_root() {
		return bare_root;
	}
	public void setBare_root(String bare_root) {
		this.bare_root = bare_root;
	}
	public Propagation(String tubers, String sprigs, String sod, String seed, String cuttings, String corms,
			String container, String bulbs, String bare_root) {
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
	public Propagation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Propagation [tubers=" + tubers + ", sprigs=" + sprigs + ", sod=" + sod + ", seed=" + seed
				+ ", cuttings=" + cuttings + ", corms=" + corms + ", container=" + container + ", bulbs=" + bulbs
				+ ", bare_root=" + bare_root + "]";
	}
	

}

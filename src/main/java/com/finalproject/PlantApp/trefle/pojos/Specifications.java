package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Specifications {

	private String toxicity;
	private String shape_and_orientation;
	private String regrowth_rate;
	private String nitrogen_fixation;
	private String low_growing_grass;
	private String lifespan;
	private String leaf_retention;
	private String known_alleopath;
	private String growth_rate;
	private String growth_period;
	private String growth_habitat;
	private String growth_form;
	private String fire_resistance;
	private String fall_conspicuous;
	private String coppice_potential;
	private String c_n_ratio;
	private String bloat;
	
	//gets n sets
	public String getToxicity() {
		return toxicity;
	}
	public void setToxicity(String toxicity) {
		this.toxicity = toxicity;
	}
	public String getShape_and_orientation() {
		return shape_and_orientation;
	}
	public void setShape_and_orientation(String shape_and_orientation) {
		this.shape_and_orientation = shape_and_orientation;
	}
	public String getRegrowth_rate() {
		return regrowth_rate;
	}
	public void setRegrowth_rate(String regrowth_rate) {
		this.regrowth_rate = regrowth_rate;
	}
	public String getNitrogen_fixation() {
		return nitrogen_fixation;
	}
	public void setNitrogen_fixation(String nitrogen_fixation) {
		this.nitrogen_fixation = nitrogen_fixation;
	}
	public String getLow_growing_grass() {
		return low_growing_grass;
	}
	public void setLow_growing_grass(String low_growing_grass) {
		this.low_growing_grass = low_growing_grass;
	}
	public String getLifespan() {
		return lifespan;
	}
	public void setLifespan(String lifespan) {
		this.lifespan = lifespan;
	}
	public String getLeaf_retention() {
		return leaf_retention;
	}
	public void setLeaf_retention(String leaf_retention) {
		this.leaf_retention = leaf_retention;
	}
	public String getKnown_alleopath() {
		return known_alleopath;
	}
	public void setKnown_alleopath(String known_alleopath) {
		this.known_alleopath = known_alleopath;
	}
	public String getGrowth_rate() {
		return growth_rate;
	}
	public void setGrowth_rate(String growth_rate) {
		this.growth_rate = growth_rate;
	}
	public String getGrowth_period() {
		return growth_period;
	}
	public void setGrowth_period(String growth_period) {
		this.growth_period = growth_period;
	}
	public String getGrowth_habitat() {
		return growth_habitat;
	}
	public void setGrowth_habitat(String growth_habitat) {
		this.growth_habitat = growth_habitat;
	}
	public String getGrowth_form() {
		return growth_form;
	}
	public void setGrowth_form(String growth_form) {
		this.growth_form = growth_form;
	}
	public String getFire_resistance() {
		return fire_resistance;
	}
	public void setFire_resistance(String fire_resistance) {
		this.fire_resistance = fire_resistance;
	}
	public String getFall_conspicuous() {
		return fall_conspicuous;
	}
	public void setFall_conspicuous(String fall_conspicuous) {
		this.fall_conspicuous = fall_conspicuous;
	}
	public String getCoppice_potential() {
		return coppice_potential;
	}
	public void setCoppice_potential(String coppice_potential) {
		this.coppice_potential = coppice_potential;
	}
	public String getC_n_ratio() {
		return c_n_ratio;
	}
	public void setC_n_ratio(String c_n_ratio) {
		this.c_n_ratio = c_n_ratio;
	}
	public String getBloat() {
		return bloat;
	}
	public void setBloat(String bloat) {
		this.bloat = bloat;
	}
	//constructors
	public Specifications(String toxicity, String shape_and_orientation, String regrowth_rate, String nitrogen_fixation,
			String low_growing_grass, String lifespan, String leaf_retention, String known_alleopath,
			String growth_rate, String growth_period, String growth_habitat, String growth_form, String fire_resistance,
			String fall_conspicuous, String coppice_potential, String c_n_ratio, String bloat) {
		super();
		this.toxicity = toxicity;
		this.shape_and_orientation = shape_and_orientation;
		this.regrowth_rate = regrowth_rate;
		this.nitrogen_fixation = nitrogen_fixation;
		this.low_growing_grass = low_growing_grass;
		this.lifespan = lifespan;
		this.leaf_retention = leaf_retention;
		this.known_alleopath = known_alleopath;
		this.growth_rate = growth_rate;
		this.growth_period = growth_period;
		this.growth_habitat = growth_habitat;
		this.growth_form = growth_form;
		this.fire_resistance = fire_resistance;
		this.fall_conspicuous = fall_conspicuous;
		this.coppice_potential = coppice_potential;
		this.c_n_ratio = c_n_ratio;
		this.bloat = bloat;
	}
	public Specifications() {
		super();
	}
	//to string
	@Override
	public String toString() {
		return "Specifications [toxicity=" + toxicity + ", shape_and_orientation=" + shape_and_orientation
				+ ", regrowth_rate=" + regrowth_rate + ", nitrogen_fixation=" + nitrogen_fixation
				+ ", low_growing_grass=" + low_growing_grass + ", lifespan=" + lifespan + ", leaf_retention="
				+ leaf_retention + ", known_alleopath=" + known_alleopath + ", growth_rate=" + growth_rate
				+ ", growth_period=" + growth_period + ", growth_habitat=" + growth_habitat + ", growth_form="
				+ growth_form + ", fire_resistance=" + fire_resistance + ", fall_conspicuous=" + fall_conspicuous
				+ ", coppice_potential=" + coppice_potential + ", c_n_ratio=" + c_n_ratio + ", bloat=" + bloat + "]";
	}
	
	
	
}

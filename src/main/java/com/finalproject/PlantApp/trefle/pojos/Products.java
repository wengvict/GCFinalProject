package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {
	
	private String veneer;
	private String pulpwood;
	private String protien_potential;
	private String post;
	private boolean palatable_human;
	private String palatable_graze_animal;
	private String palatable_browse_animal;
	private String nursery_stock;
	private String naval_store;
	private String lumber;
	private String fuelwood;
	private String fodder;
	private String christmas_tree;
	private String berry_nut_seed;
	
	public Products() {
		super();
	}

	public Products(String veneer, String pulpwood, String protien_potential, String post, boolean palatable_human,
			String palatable_graze_animal, String palatable_browse_animal, String nursery_stock, String naval_store,
			String lumber, String fuelwood, String fodder, String christmas_tree, String berry_nut_seed) {
		super();
		this.veneer = veneer;
		this.pulpwood = pulpwood;
		this.protien_potential = protien_potential;
		this.post = post;
		this.palatable_human = palatable_human;
		this.palatable_graze_animal = palatable_graze_animal;
		this.palatable_browse_animal = palatable_browse_animal;
		this.nursery_stock = nursery_stock;
		this.naval_store = naval_store;
		this.lumber = lumber;
		this.fuelwood = fuelwood;
		this.fodder = fodder;
		this.christmas_tree = christmas_tree;
		this.berry_nut_seed = berry_nut_seed;
	}

	public String getVeneer() {
		return veneer;
	}

	public void setVeneer(String veneer) {
		this.veneer = veneer;
	}

	public String getPulpwood() {
		return pulpwood;
	}

	public void setPulpwood(String pulpwood) {
		this.pulpwood = pulpwood;
	}

	public String getProtien_potential() {
		return protien_potential;
	}

	public void setProtien_potential(String protien_potential) {
		this.protien_potential = protien_potential;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public boolean isPalatable_human() {
		return palatable_human;
	}

	public void setPalatable_human(boolean palatable_human) {
		this.palatable_human = palatable_human;
	}

	public String getPalatable_graze_animal() {
		return palatable_graze_animal;
	}

	public void setPalatable_graze_animal(String palatable_graze_animal) {
		this.palatable_graze_animal = palatable_graze_animal;
	}

	public String getPalatable_browse_animal() {
		return palatable_browse_animal;
	}

	public void setPalatable_browse_animal(String palatable_browse_animal) {
		this.palatable_browse_animal = palatable_browse_animal;
	}

	public String getNursery_stock() {
		return nursery_stock;
	}

	public void setNursery_stock(String nursery_stock) {
		this.nursery_stock = nursery_stock;
	}

	public String getNaval_store() {
		return naval_store;
	}

	public void setNaval_store(String naval_store) {
		this.naval_store = naval_store;
	}

	public String getLumber() {
		return lumber;
	}

	public void setLumber(String lumber) {
		this.lumber = lumber;
	}

	public String getFuelwood() {
		return fuelwood;
	}

	public void setFuelwood(String fuelwood) {
		this.fuelwood = fuelwood;
	}

	public String getFodder() {
		return fodder;
	}

	public void setFodder(String fodder) {
		this.fodder = fodder;
	}

	public String getChristmas_tree() {
		return christmas_tree;
	}

	public void setChristmas_tree(String christmas_tree) {
		this.christmas_tree = christmas_tree;
	}

	public String getBerry_nut_seed() {
		return berry_nut_seed;
	}

	public void setBerry_nut_seed(String berry_nut_seed) {
		this.berry_nut_seed = berry_nut_seed;
	}

	@Override
	public String toString() {
		return "Products [veneer=" + veneer + ", pulpwood=" + pulpwood + ", protien_potential=" + protien_potential
				+ ", post=" + post + ", palatable_human=" + palatable_human + ", palatable_graze_animal="
				+ palatable_graze_animal + ", palatable_browse_animal=" + palatable_browse_animal + ", nursery_stock="
				+ nursery_stock + ", naval_store=" + naval_store + ", lumber=" + lumber + ", fuelwood=" + fuelwood
				+ ", fodder=" + fodder + ", christmas_tree=" + christmas_tree + ", berry_nut_seed=" + berry_nut_seed
				+ "]";
	}
	
	
}

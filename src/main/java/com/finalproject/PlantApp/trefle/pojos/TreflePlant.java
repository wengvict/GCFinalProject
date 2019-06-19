package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TreflePlant {
	
	private String scientific_name;
	private Order order;
	private Main_Species main_species;
	private Genus genus;
	private Family family;
	private Division division;
	
	public TreflePlant() {
		super();
	}

	public TreflePlant(String scientific_name, Order order, Main_Species main_species, Genus genus, Family family,
			Division division) {
		super();
		this.scientific_name = scientific_name;
		this.order = order;
		this.main_species = main_species;
		this.genus = genus;
		this.family = family;
		this.division = division;
	}

	public String getScientific_name() {
		return scientific_name;
	}

	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Main_Species getMain_species() {
		return main_species;
	}

	public void setMain_species(Main_Species main_species) {
		this.main_species = main_species;
	}

	public Genus getGenus() {
		return genus;
	}

	public void setGenus(Genus genus) {
		this.genus = genus;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "TreflePlant [scientific_name=" + scientific_name + ", order=" + order + ", main_species=" + main_species
				+ ", genus=" + genus + ", family=" + family + ", division=" + division + "]";
	}
	
		
	

}

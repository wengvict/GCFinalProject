package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrefleSources {
	
	private String last_update;
	private String name;
	private String source_url;
	private String species_id;
	
	public TrefleSources() {
		super();
	}

	public TrefleSources(String last_update, String name, String source_url, String species_id) {
		super();
		this.last_update = last_update;
		this.name = name;
		this.source_url = source_url;
		this.species_id = species_id;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource_url() {
		return source_url;
	}

	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}

	public String getSpecies_id() {
		return species_id;
	}

	public void setSpecies_id(String species_id) {
		this.species_id = species_id;
	}

	@Override
	public String toString() {
		return "TrefleSources [last_update=" + last_update + ", name=" + name + ", source_url=" + source_url
				+ ", species_id=" + species_id + "]";
	}
	
	
}

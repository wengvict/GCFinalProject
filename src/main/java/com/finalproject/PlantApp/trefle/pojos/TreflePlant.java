package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TreflePlant {
	
//	private String scientific_name;
//	private Order order;
//	private Main_Species main_species;
//	private Genus genus;
//	private Family family;
//	private Division division;
	
	private String scientific_name;
	private Integer id;
	private boolean complete_data;
	private String common_name;
	
	public TreflePlant() {
		super();
	}

	public TreflePlant(String scientific_name, Integer id, boolean complete_data, String common_name) {
		super();
		this.scientific_name = scientific_name;
		this.id = id;
		this.complete_data = complete_data;
		this.common_name = common_name;
	}

	public String getScientific_name() {
		return scientific_name;
	}

	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean getComplete_data() {
		return complete_data;
	}

	public void setComplete_data(boolean complete_data) {
		this.complete_data = complete_data;
	}

	public String getCommon_name() {
		return common_name;
	}

	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}

	@Override
	public String toString() {
		return "TreflePlant [scientific_name=" + scientific_name + ", id=" + id + ", complete_data=" + complete_data
				+ ", common_name=" + common_name + "]";
	}

	

}

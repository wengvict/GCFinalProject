package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Family {
	
	private String common_name;
	private Integer id;
	private String link;
	private String name;
	private String slug;
	
	public Family() {
		super();
	}

	public Family(String common_name, Integer id, String link, String name, String slug) {
		super();
		this.common_name = common_name;
		this.id = id;
		this.link = link;
		this.name = name;
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "Family [common_name=" + common_name + ", id=" + id + ", link=" + link + ", name=" + name + ", slug="
				+ slug + "]";
	}
	
	

}

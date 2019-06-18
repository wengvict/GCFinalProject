package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Division {

	
	private String slug;
	private String name;
	private String link;
	private Long id;
	
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Division(String slug, String name, String link, Long id) {
		super();
		this.slug = slug;
		this.name = name;
		this.link = link;
		this.id = id;
	}
	public Division() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Division [slug=" + slug + ", name=" + name + ", link=" + link + ", id=" + id + "]";
	}
	
	
}

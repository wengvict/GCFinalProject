package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

	
	private String slug;
	private String name;
	private String link;
	private long id;
	
	//gets n sets
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//constructors
	public Order(String slug, String name, String link, long id) {
		super();
		this.slug = slug;
		this.name = name;
		this.link = link;
		this.id = id;
	}
	public Order() {
		super();
	}
	//to string
	@Override
	public String toString() {
		return "OrderPojo [slug=" + slug + ", name=" + name + ", link=" + link + ", id=" + id + "]";
	}
	
	
}

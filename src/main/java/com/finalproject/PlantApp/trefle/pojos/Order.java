package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

	private String slug;
	private String name;
	private String link;
	private Integer id;
	
	public Order() {
		super();
	}

	public Order(String slug, String name, String link, Integer id) {
		super();
		this.slug = slug;
		this.name = name;
		this.link = link;
		this.id = id;
	}

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Order [slug=" + slug + ", name=" + name + ", link=" + link + ", id=" + id + "]";
	}
	
	
	
}

package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrefleClass {
	
	private Integer id;
	private String link;
	private String name;
	private String slug;
	
	public TrefleClass() {
		super();
	}

	public TrefleClass(Integer id, String link, String name, String slug) {
		super();
		this.id = id;
		this.link = link;
		this.name = name;
		this.slug = slug;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "TrefleClass [id=" + id + ", link=" + link + ", name=" + name + ", slug=" + slug + "]";
	}
	
	

}

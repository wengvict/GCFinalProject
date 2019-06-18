package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Foliage {
	
	private String texture;
	private String porosity_winter;
	private String porosity_summer;
	private String foliageColor;
	
	public Foliage() {
		super();
	}

	public Foliage(String texture, String porosity_winter, String porosity_summer, String foliageColor) {
		super();
		this.texture = texture;
		this.porosity_winter = porosity_winter;
		this.porosity_summer = porosity_summer;
		this.foliageColor = foliageColor;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getPorosity_winter() {
		return porosity_winter;
	}

	public void setPorosity_winter(String porosity_winter) {
		this.porosity_winter = porosity_winter;
	}

	public String getPorosity_summer() {
		return porosity_summer;
	}

	public void setPorosity_summer(String porosity_summer) {
		this.porosity_summer = porosity_summer;
	}

	public String getFoliageColor() {
		return foliageColor;
	}

	public void setFoliageColor(String foliageColor) {
		this.foliageColor = foliageColor;
	}

	@Override
	public String toString() {
		return "Foliage [texture=" + texture + ", porosity_winter=" + porosity_winter + ", porosity_summer="
				+ porosity_summer + ", foliageColor=" + foliageColor + "]";
	}
	
	

}

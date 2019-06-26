package com.finalproject.PlantApp.trefle.pojos;

public class Max_height_at_base_age {
	
	private Double cm;
	private Double ft;
	
	public Max_height_at_base_age() {
		super();
	}

	public Max_height_at_base_age(Double cm, Double ft) {
		super();
		this.cm = cm;
		this.ft = ft;
	}

	public Double getCm() {
		return cm;
	}

	public void setCm(Double cm) {
		this.cm = cm;
	}

	public Double getFt() {
		return ft;
	}

	public void setFt(Double ft) {
		this.ft = ft;
	}

	@Override
	public String toString() {
		return "Max_height_at_base_age [cm=" + cm + ", ft=" + ft + "]";
	}
	
	
}

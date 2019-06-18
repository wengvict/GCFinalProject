package com.finalproject.PlantApp.trefle.pojos;

public class Max_height_at_base_age {

	
	private Long cm;
	private Long ft;
	public Long getCm() {
		return cm;
	}
	public void setCm(Long cm) {
		this.cm = cm;
	}
	public Long getFt() {
		return ft;
	}
	public void setFt(Long ft) {
		this.ft = ft;
	}
	public Max_height_at_base_age(Long cm, Long ft) {
		super();
		this.cm = cm;
		this.ft = ft;
	}
	public Max_height_at_base_age() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Max_height_at_base_age [cm=" + cm + ", ft=" + ft + "]";
	}
	
	
}

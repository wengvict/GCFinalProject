package com.finalproject.PlantApp.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class USDAOuter {
	
	private Integer returned;
	private Long count;
	private String citation;
	private ArrayList<USDAPlant> data;
	
	public USDAOuter() {
		super();
	}

	public USDAOuter(Integer returned, Long count, String citation, ArrayList<USDAPlant> data) {
		super();
		this.returned = returned;
		this.count = count;
		this.citation = citation;
		this.data = data;
	}

	public Integer getReturned() {
		return returned;
	}

	public void setReturned(Integer returned) {
		this.returned = returned;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getCitation() {
		return citation;
	}

	public void setCitation(String citation) {
		this.citation = citation;
	}

	public ArrayList<USDAPlant> getData() {
		return data;
	}

	public void setData(ArrayList<USDAPlant> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "USDAOuter [returned=" + returned + ", count=" + count + ", citation=" + citation + ", data=" + data
				+ "]";
	}
	
	

}

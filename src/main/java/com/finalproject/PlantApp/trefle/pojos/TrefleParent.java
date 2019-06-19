package com.finalproject.PlantApp.trefle.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrefleParent {
	
	ArrayList<TreflePlant> trefleJson;

	public TrefleParent() {
		super();
	}

	public TrefleParent(ArrayList<TreflePlant> trefleJson) {
		super();
		this.trefleJson = trefleJson;
	}

	public ArrayList<TreflePlant> getTrefleJson() {
		return trefleJson;
	}

	public void setTrefleJson(ArrayList<TreflePlant> trefleJson) {
		this.trefleJson = trefleJson;
	}

	@Override
	public String toString() {
		return "TrefleParent [trefleJson=" + trefleJson + "]";
	}
	
	

}

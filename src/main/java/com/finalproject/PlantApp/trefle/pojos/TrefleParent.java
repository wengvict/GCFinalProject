package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrefleParent {
	
	TreflePlant trefleJson;

	public TrefleParent() {
		super();
	}

	public TrefleParent(TreflePlant trefleJson) {
		super();
		this.trefleJson = trefleJson;
	}

	public TreflePlant getTrefleJson() {
		return trefleJson;
	}

	public void setTrefleJson(TreflePlant trefleJson) {
		this.trefleJson = trefleJson;
	}

	@Override
	public String toString() {
		return "TrefleParent [trefleJson=" + trefleJson + "]";
	}

	
}

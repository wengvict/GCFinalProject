package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Growth {
	
	private String anaerobic_tolerance;
	private String caco_3_tolerance;
	private String cold_stratification_required;
	private String drought_tolerance;
	private String fertility_requirement;
	private String fire_tolerance;
	private String frost_free_days_minimum;
	private String hedge_tolerance;
	private String moisture_use;
	private Double ph_maximum;
	private Double ph_minimum;
	private Planting_density_maximum planting_density_maximum;
	private Planting_density_minimum planting_density_minimum;
	private Precipitation_maximum precipitation_maximum;
	private Precipitation_minimum precipitation_minimum;
	private String resprout_ability;
	private Root_depth_minimum root_depth_minimum;
	private String salinity_tolerance;
	private String shade_tolerance;
	private Temperature_minimum temperature_minimum;
	
	public Growth() {
		super();
	}

	public Growth(String anaerobic_tolerance, String caco_3_tolerance, String cold_stratification_required,
			String drought_tolerance, String fertility_requirement, String fire_tolerance,
			String frost_free_days_minimum, String hedge_tolerance, String moisture_use, Double ph_maximum,
			Double ph_minimum, Planting_density_maximum planting_density_maximum,
			Planting_density_minimum planting_density_minimum, Precipitation_maximum precipitation_maximum,
			Precipitation_minimum precipitation_minimum, String resprout_ability, Root_depth_minimum root_depth_minimum,
			String salinity_tolerance, String shade_tolerance, Temperature_minimum temperature_minimum) {
		super();
		this.anaerobic_tolerance = anaerobic_tolerance;
		this.caco_3_tolerance = caco_3_tolerance;
		this.cold_stratification_required = cold_stratification_required;
		this.drought_tolerance = drought_tolerance;
		this.fertility_requirement = fertility_requirement;
		this.fire_tolerance = fire_tolerance;
		this.frost_free_days_minimum = frost_free_days_minimum;
		this.hedge_tolerance = hedge_tolerance;
		this.moisture_use = moisture_use;
		this.ph_maximum = ph_maximum;
		this.ph_minimum = ph_minimum;
		this.planting_density_maximum = planting_density_maximum;
		this.planting_density_minimum = planting_density_minimum;
		this.precipitation_maximum = precipitation_maximum;
		this.precipitation_minimum = precipitation_minimum;
		this.resprout_ability = resprout_ability;
		this.root_depth_minimum = root_depth_minimum;
		this.salinity_tolerance = salinity_tolerance;
		this.shade_tolerance = shade_tolerance;
		this.temperature_minimum = temperature_minimum;
	}

	public String getAnaerobic_tolerance() {
		return anaerobic_tolerance;
	}

	public void setAnaerobic_tolerance(String anaerobic_tolerance) {
		this.anaerobic_tolerance = anaerobic_tolerance;
	}

	public String getCaco_3_tolerance() {
		return caco_3_tolerance;
	}

	public void setCaco_3_tolerance(String caco_3_tolerance) {
		this.caco_3_tolerance = caco_3_tolerance;
	}

	public String getCold_stratification_required() {
		return cold_stratification_required;
	}

	public void setCold_stratification_required(String cold_stratification_required) {
		this.cold_stratification_required = cold_stratification_required;
	}

	public String getDrought_tolerance() {
		return drought_tolerance;
	}

	public void setDrought_tolerance(String drought_tolerance) {
		this.drought_tolerance = drought_tolerance;
	}

	public String getFertility_requirement() {
		return fertility_requirement;
	}

	public void setFertility_requirement(String fertility_requirement) {
		this.fertility_requirement = fertility_requirement;
	}

	public String getFire_tolerance() {
		return fire_tolerance;
	}

	public void setFire_tolerance(String fire_tolerance) {
		this.fire_tolerance = fire_tolerance;
	}

	public String getFrost_free_days_minimum() {
		return frost_free_days_minimum;
	}

	public void setFrost_free_days_minimum(String frost_free_days_minimum) {
		this.frost_free_days_minimum = frost_free_days_minimum;
	}

	public String getHedge_tolerance() {
		return hedge_tolerance;
	}

	public void setHedge_tolerance(String hedge_tolerance) {
		this.hedge_tolerance = hedge_tolerance;
	}

	public String getMoisture_use() {
		return moisture_use;
	}

	public void setMoisture_use(String moisture_use) {
		this.moisture_use = moisture_use;
	}

	public Double getPh_maximum() {
		return ph_maximum;
	}

	public void setPh_maximum(Double ph_maximum) {
		this.ph_maximum = ph_maximum;
	}

	public Double getPh_minimum() {
		return ph_minimum;
	}

	public void setPh_minimum(Double ph_minimum) {
		this.ph_minimum = ph_minimum;
	}

	public Planting_density_maximum getPlanting_density_maximum() {
		return planting_density_maximum;
	}

	public void setPlanting_density_maximum(Planting_density_maximum planting_density_maximum) {
		this.planting_density_maximum = planting_density_maximum;
	}

	public Planting_density_minimum getPlanting_density_minimum() {
		return planting_density_minimum;
	}

	public void setPlanting_density_minimum(Planting_density_minimum planting_density_minimum) {
		this.planting_density_minimum = planting_density_minimum;
	}

	public Precipitation_maximum getPrecipitation_maximum() {
		return precipitation_maximum;
	}

	public void setPrecipitation_maximum(Precipitation_maximum precipitation_maximum) {
		this.precipitation_maximum = precipitation_maximum;
	}

	public Precipitation_minimum getPrecipitation_minimum() {
		return precipitation_minimum;
	}

	public void setPrecipitation_minimum(Precipitation_minimum precipitation_minimum) {
		this.precipitation_minimum = precipitation_minimum;
	}

	public String getResprout_ability() {
		return resprout_ability;
	}

	public void setResprout_ability(String resprout_ability) {
		this.resprout_ability = resprout_ability;
	}

	public Root_depth_minimum getRoot_depth_minimum() {
		return root_depth_minimum;
	}

	public void setRoot_depth_minimum(Root_depth_minimum root_depth_minimum) {
		this.root_depth_minimum = root_depth_minimum;
	}

	public String getSalinity_tolerance() {
		return salinity_tolerance;
	}

	public void setSalinity_tolerance(String salinity_tolerance) {
		this.salinity_tolerance = salinity_tolerance;
	}

	public String getShade_tolerance() {
		return shade_tolerance;
	}

	public void setShade_tolerance(String shade_tolerance) {
		this.shade_tolerance = shade_tolerance;
	}

	public Temperature_minimum getTemperature_minimum() {
		return temperature_minimum;
	}

	public void setTemperature_minimum(Temperature_minimum temperature_minimum) {
		this.temperature_minimum = temperature_minimum;
	}

	@Override
	public String toString() {
		return "Growth [anaerobic_tolerance=" + anaerobic_tolerance + ", caco_3_tolerance=" + caco_3_tolerance
				+ ", cold_stratification_required=" + cold_stratification_required + ", drought_tolerance="
				+ drought_tolerance + ", fertility_requirement=" + fertility_requirement + ", fire_tolerance="
				+ fire_tolerance + ", frost_free_days_minimum=" + frost_free_days_minimum + ", hedge_tolerance="
				+ hedge_tolerance + ", moisture_use=" + moisture_use + ", ph_maximum=" + ph_maximum + ", ph_minimum="
				+ ph_minimum + ", planting_density_maximum=" + planting_density_maximum + ", planting_density_minimum="
				+ planting_density_minimum + ", precipitation_maximum=" + precipitation_maximum
				+ ", precipitation_minimum=" + precipitation_minimum + ", resprout_ability=" + resprout_ability
				+ ", root_depth_minimum=" + root_depth_minimum + ", salinity_tolerance=" + salinity_tolerance
				+ ", shade_tolerance=" + shade_tolerance + ", temperature_minimum=" + temperature_minimum + "]";
	}
	
	

}

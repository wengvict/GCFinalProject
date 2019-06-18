package com.finalproject.PlantApp.trefle.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Growth {
	
	private anaerobic_tolerance anaerobic_tolerance;
	private caco_3_tolerance caco_3_tolerance;
	private cold_stratification_required cold_stratification_required;
	private drought_tolerance drought_tolerance;
	private fertility_requirement fertility_requirement;
	private fire_tolerance fire_tolerance;
	private frost_free_days_minimum frost_free_days_minimum;
	private hedge_tolerance hedge_tolerance;
	private moisture_use moisture_use;
	private ph_maximum ph_maximum;
	private ph_minimum ph_minimum;
	private planting_density_maximum planting_density_maximum;
	private planting_density_minimum planting_density_minimum;
	private precipitation_maximum precipitation_maximum;
	private precipitation_minimum precipitation_minimum;
	private resprout_ability resprout_ability;
	private root_depth_minimum root_depth_minimum;
	private salinity_tolerance salinity_tolerance;
	private shade_tolerance shade_tolerance;
	private temperature_minimum temperature_minimum;
	
	public Growth() {
		super();
	}

	public Growth(com.finalproject.PlantApp.trefle.pojos.anaerobic_tolerance anaerobic_tolerance,
			com.finalproject.PlantApp.trefle.pojos.caco_3_tolerance caco_3_tolerance,
			com.finalproject.PlantApp.trefle.pojos.cold_stratification_required cold_stratification_required,
			com.finalproject.PlantApp.trefle.pojos.drought_tolerance drought_tolerance,
			com.finalproject.PlantApp.trefle.pojos.fertility_requirement fertility_requirement,
			com.finalproject.PlantApp.trefle.pojos.fire_tolerance fire_tolerance,
			com.finalproject.PlantApp.trefle.pojos.frost_free_days_minimum frost_free_days_minimum,
			com.finalproject.PlantApp.trefle.pojos.hedge_tolerance hedge_tolerance,
			com.finalproject.PlantApp.trefle.pojos.moisture_use moisture_use,
			com.finalproject.PlantApp.trefle.pojos.ph_maximum ph_maximum,
			com.finalproject.PlantApp.trefle.pojos.ph_minimum ph_minimum,
			com.finalproject.PlantApp.trefle.pojos.planting_density_maximum planting_density_maximum,
			com.finalproject.PlantApp.trefle.pojos.planting_density_minimum planting_density_minimum,
			com.finalproject.PlantApp.trefle.pojos.precipitation_maximum precipitation_maximum,
			com.finalproject.PlantApp.trefle.pojos.precipitation_minimum precipitation_minimum,
			com.finalproject.PlantApp.trefle.pojos.resprout_ability resprout_ability,
			com.finalproject.PlantApp.trefle.pojos.root_depth_minimum root_depth_minimum,
			com.finalproject.PlantApp.trefle.pojos.salinity_tolerance salinity_tolerance,
			com.finalproject.PlantApp.trefle.pojos.shade_tolerance shade_tolerance,
			com.finalproject.PlantApp.trefle.pojos.temperature_minimum temperature_minimum) {
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

	public anaerobic_tolerance getAnaerobic_tolerance() {
		return anaerobic_tolerance;
	}

	public void setAnaerobic_tolerance(anaerobic_tolerance anaerobic_tolerance) {
		this.anaerobic_tolerance = anaerobic_tolerance;
	}

	public caco_3_tolerance getCaco_3_tolerance() {
		return caco_3_tolerance;
	}

	public void setCaco_3_tolerance(caco_3_tolerance caco_3_tolerance) {
		this.caco_3_tolerance = caco_3_tolerance;
	}

	public cold_stratification_required getCold_stratification_required() {
		return cold_stratification_required;
	}

	public void setCold_stratification_required(cold_stratification_required cold_stratification_required) {
		this.cold_stratification_required = cold_stratification_required;
	}

	public drought_tolerance getDrought_tolerance() {
		return drought_tolerance;
	}

	public void setDrought_tolerance(drought_tolerance drought_tolerance) {
		this.drought_tolerance = drought_tolerance;
	}

	public fertility_requirement getFertility_requirement() {
		return fertility_requirement;
	}

	public void setFertility_requirement(fertility_requirement fertility_requirement) {
		this.fertility_requirement = fertility_requirement;
	}

	public fire_tolerance getFire_tolerance() {
		return fire_tolerance;
	}

	public void setFire_tolerance(fire_tolerance fire_tolerance) {
		this.fire_tolerance = fire_tolerance;
	}

	public frost_free_days_minimum getFrost_free_days_minimum() {
		return frost_free_days_minimum;
	}

	public void setFrost_free_days_minimum(frost_free_days_minimum frost_free_days_minimum) {
		this.frost_free_days_minimum = frost_free_days_minimum;
	}

	public hedge_tolerance getHedge_tolerance() {
		return hedge_tolerance;
	}

	public void setHedge_tolerance(hedge_tolerance hedge_tolerance) {
		this.hedge_tolerance = hedge_tolerance;
	}

	public moisture_use getMoisture_use() {
		return moisture_use;
	}

	public void setMoisture_use(moisture_use moisture_use) {
		this.moisture_use = moisture_use;
	}

	public ph_maximum getPh_maximum() {
		return ph_maximum;
	}

	public void setPh_maximum(ph_maximum ph_maximum) {
		this.ph_maximum = ph_maximum;
	}

	public ph_minimum getPh_minimum() {
		return ph_minimum;
	}

	public void setPh_minimum(ph_minimum ph_minimum) {
		this.ph_minimum = ph_minimum;
	}

	public planting_density_maximum getPlanting_density_maximum() {
		return planting_density_maximum;
	}

	public void setPlanting_density_maximum(planting_density_maximum planting_density_maximum) {
		this.planting_density_maximum = planting_density_maximum;
	}

	public planting_density_minimum getPlanting_density_minimum() {
		return planting_density_minimum;
	}

	public void setPlanting_density_minimum(planting_density_minimum planting_density_minimum) {
		this.planting_density_minimum = planting_density_minimum;
	}

	public precipitation_maximum getPrecipitation_maximum() {
		return precipitation_maximum;
	}

	public void setPrecipitation_maximum(precipitation_maximum precipitation_maximum) {
		this.precipitation_maximum = precipitation_maximum;
	}

	public precipitation_minimum getPrecipitation_minimum() {
		return precipitation_minimum;
	}

	public void setPrecipitation_minimum(precipitation_minimum precipitation_minimum) {
		this.precipitation_minimum = precipitation_minimum;
	}

	public resprout_ability getResprout_ability() {
		return resprout_ability;
	}

	public void setResprout_ability(resprout_ability resprout_ability) {
		this.resprout_ability = resprout_ability;
	}

	public root_depth_minimum getRoot_depth_minimum() {
		return root_depth_minimum;
	}

	public void setRoot_depth_minimum(root_depth_minimum root_depth_minimum) {
		this.root_depth_minimum = root_depth_minimum;
	}

	public salinity_tolerance getSalinity_tolerance() {
		return salinity_tolerance;
	}

	public void setSalinity_tolerance(salinity_tolerance salinity_tolerance) {
		this.salinity_tolerance = salinity_tolerance;
	}

	public shade_tolerance getShade_tolerance() {
		return shade_tolerance;
	}

	public void setShade_tolerance(shade_tolerance shade_tolerance) {
		this.shade_tolerance = shade_tolerance;
	}

	public temperature_minimum getTemperature_minimum() {
		return temperature_minimum;
	}

	public void setTemperature_minimum(temperature_minimum temperature_minimum) {
		this.temperature_minimum = temperature_minimum;
	}
	
	
	

}

package com.finalproject.PlantApp.trefle.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrefleOuter {
	
	@JsonProperty("class")
	private TrefleClass trefleClass;
	private String common_name;
	//private ArrayList<Cultivars> cultivars;
	private Division division;
	private String duration;
	private Family family;
	private String family_common_name;
	//private ArrayList<Forms> forms;
	private Genus genus;
	//private ArrayList<Hybrids> hybrids;
	private String id;
	private ArrayList<PlantPics> images;
	private Main_Species main_species;
	private String native_status;
	private Order order;
	private String scientific_name;
	//private ArrayList<Subspecies> sub_species;
	//private ArrayList<Varieties> varieties;
	
	public TrefleOuter() {
		super();
	}

	public TrefleOuter(TrefleClass trefleClass, String common_name, Division division, String duration, Family family,
			String family_common_name, Genus genus, String id, ArrayList<PlantPics> images, Main_Species main_species,
			String native_status, Order order, String scientific_name) {
		super();
		this.trefleClass = trefleClass;
		this.common_name = common_name;
		this.division = division;
		this.duration = duration;
		this.family = family;
		this.family_common_name = family_common_name;
		this.genus = genus;
		this.id = id;
		this.images = images;
		this.main_species = main_species;
		this.native_status = native_status;
		this.order = order;
		this.scientific_name = scientific_name;
	}

	public TrefleClass getTrefleClass() {
		return trefleClass;
	}

	public void setTrefleClass(TrefleClass trefleClass) {
		this.trefleClass = trefleClass;
	}

	public String getCommon_name() {
		return common_name;
	}

	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public String getFamily_common_name() {
		return family_common_name;
	}

	public void setFamily_common_name(String family_common_name) {
		this.family_common_name = family_common_name;
	}

	public Genus getGenus() {
		return genus;
	}

	public void setGenus(Genus genus) {
		this.genus = genus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<PlantPics> getImages() {
		return images;
	}

	public void setImages(ArrayList<PlantPics> images) {
		this.images = images;
	}

	public Main_Species getMain_species() {
		return main_species;
	}

	public void setMain_species(Main_Species main_species) {
		this.main_species = main_species;
	}

	public String getNative_status() {
		return native_status;
	}

	public void setNative_status(String native_status) {
		this.native_status = native_status;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getScientific_name() {
		return scientific_name;
	}

	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}

	@Override
	public String toString() {
		return "TrefleOuter [trefleClass=" + trefleClass + ", common_name=" + common_name + ", division=" + division
				+ ", duration=" + duration + ", family=" + family + ", family_common_name=" + family_common_name
				+ ", genus=" + genus + ", id=" + id + ", images=" + images + ", main_species=" + main_species
				+ ", native_status=" + native_status + ", order=" + order + ", scientific_name=" + scientific_name
				+ "]";
	}
	
	
	
}

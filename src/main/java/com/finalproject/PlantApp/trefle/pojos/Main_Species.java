package com.finalproject.PlantApp.trefle.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main_Species {
	
	private String author;
	private String bibliography;
	private String common_name;
	private boolean complete_data;
	private String duration;
	private String family_common_name;
	private Flower flower;
	private Foliage foliage;
	private Fruit_or_seed fruit_or_seed;
	private Growth growth;
	private String id;
	private ArrayList<Images> images;
	private boolean is_main_species;
	private String main_species_id;
	private String native_status;
	private Products products;
	private Propagation propagation;
	private String scientific_name;
	private Seed seed;
	private String slug;
	private SoilsAdaptation soils_adaptation;
	@JsonProperty("sources")
	private ArrayList<TrefleSources> trefleSources;
	private Specifications specifications;
	private String status;
	private boolean synonym;
	private String type;
	private String year;
	
	public Main_Species() {
		super();
	}

	public Main_Species(String author, String bibliography, String common_name, boolean complete_data, String duration,
			String family_common_name, Flower flower, Foliage foliage, Fruit_or_seed fruit_or_seed, Growth growth,
			String id, ArrayList<Images> images, boolean is_main_species, String main_species_id, String native_status,
			Products products, Propagation propagation, String scientific_name, Seed seed, String slug,
			SoilsAdaptation soils_adaptation, ArrayList<TrefleSources> trefleSources, Specifications specifications,
			String status, boolean synonym, String type, String year) {
		super();
		this.author = author;
		this.bibliography = bibliography;
		this.common_name = common_name;
		this.complete_data = complete_data;
		this.duration = duration;
		this.family_common_name = family_common_name;
		this.flower = flower;
		this.foliage = foliage;
		this.fruit_or_seed = fruit_or_seed;
		this.growth = growth;
		this.id = id;
		this.images = images;
		this.is_main_species = is_main_species;
		this.main_species_id = main_species_id;
		this.native_status = native_status;
		this.products = products;
		this.propagation = propagation;
		this.scientific_name = scientific_name;
		this.seed = seed;
		this.slug = slug;
		this.soils_adaptation = soils_adaptation;
		this.trefleSources = trefleSources;
		this.specifications = specifications;
		this.status = status;
		this.synonym = synonym;
		this.type = type;
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBibliography() {
		return bibliography;
	}

	public void setBibliography(String bibliography) {
		this.bibliography = bibliography;
	}

	public String getCommon_name() {
		return common_name;
	}

	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}

	public boolean isComplete_data() {
		return complete_data;
	}

	public void setComplete_data(boolean complete_data) {
		this.complete_data = complete_data;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFamily_common_name() {
		return family_common_name;
	}

	public void setFamily_common_name(String family_common_name) {
		this.family_common_name = family_common_name;
	}

	public Flower getFlower() {
		return flower;
	}

	public void setFlower(Flower flower) {
		this.flower = flower;
	}

	public Foliage getFoliage() {
		return foliage;
	}

	public void setFoliage(Foliage foliage) {
		this.foliage = foliage;
	}

	public Fruit_or_seed getFruit_or_seed() {
		return fruit_or_seed;
	}

	public void setFruit_or_seed(Fruit_or_seed fruit_or_seed) {
		this.fruit_or_seed = fruit_or_seed;
	}

	public Growth getGrowth() {
		return growth;
	}

	public void setGrowth(Growth growth) {
		this.growth = growth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Images> getImages() {
		return images;
	}

	public void setImages(ArrayList<Images> images) {
		this.images = images;
	}

	public boolean isIs_main_species() {
		return is_main_species;
	}

	public void setIs_main_species(boolean is_main_species) {
		this.is_main_species = is_main_species;
	}

	public String getMain_species_id() {
		return main_species_id;
	}

	public void setMain_species_id(String main_species_id) {
		this.main_species_id = main_species_id;
	}

	public String getNative_status() {
		return native_status;
	}

	public void setNative_status(String native_status) {
		this.native_status = native_status;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Propagation getPropagation() {
		return propagation;
	}

	public void setPropagation(Propagation propagation) {
		this.propagation = propagation;
	}

	public String getScientific_name() {
		return scientific_name;
	}

	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}

	public Seed getSeed() {
		return seed;
	}

	public void setSeed(Seed seed) {
		this.seed = seed;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public SoilsAdaptation getSoils_adaptation() {
		return soils_adaptation;
	}

	public void setSoils_adaptation(SoilsAdaptation soils_adaptation) {
		this.soils_adaptation = soils_adaptation;
	}

	public ArrayList<TrefleSources> getTrefleSources() {
		return trefleSources;
	}

	public void setTrefleSources(ArrayList<TrefleSources> trefleSources) {
		this.trefleSources = trefleSources;
	}

	public Specifications getSpecifications() {
		return specifications;
	}

	public void setSpecifications(Specifications specifications) {
		this.specifications = specifications;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isSynonym() {
		return synonym;
	}

	public void setSynonym(boolean synonym) {
		this.synonym = synonym;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Main_Species [author=" + author + ", bibliography=" + bibliography + ", common_name=" + common_name
				+ ", complete_data=" + complete_data + ", duration=" + duration + ", family_common_name="
				+ family_common_name + ", flower=" + flower + ", foliage=" + foliage + ", fruit_or_seed="
				+ fruit_or_seed + ", growth=" + growth + ", id=" + id + ", images=" + images + ", is_main_species="
				+ is_main_species + ", main_species_id=" + main_species_id + ", native_status=" + native_status
				+ ", products=" + products + ", propagation=" + propagation + ", scientific_name=" + scientific_name
				+ ", seed=" + seed + ", slug=" + slug + ", soils_adaptation=" + soils_adaptation + ", trefleSources="
				+ trefleSources + ", specifications=" + specifications + ", status=" + status + ", synonym=" + synonym
				+ ", type=" + type + ", year=" + year + "]";
	}

	

}

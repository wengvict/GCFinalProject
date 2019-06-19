package com.finalproject.PlantApp.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="plantinventory")
public class PlantInventory {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	private Integer id;
	private String plantname;
	private LocalDateTime waterdate;
	@Column(name="formatteddate")
	private String formattedDate;
	@Column(name="nextwaterdate")
	private LocalDateTime nextWaterDate;
	@Column(name="nextformatteddate")
	private String nextDateFormatted;
	@Column(name="needswater")
	private Integer needsWater;
	
	
	public PlantInventory() {
		
	}
	
	
	public PlantInventory(Integer id, String plantname, LocalDateTime waterdate, String formattedDate,
			LocalDateTime nextWaterDate, String nextDateFormatted, Integer needsWater) {
		super();
		this.id = id;
		this.plantname = plantname;
		this.waterdate = waterdate;
		this.formattedDate = formattedDate;
		this.nextWaterDate = nextWaterDate;
		this.nextDateFormatted = nextDateFormatted;
		this.needsWater = needsWater;
	}
	
	public PlantInventory(String plantname, LocalDateTime waterdate, String formattedDate,
			LocalDateTime nextWaterDate, String nextDateFormatted, Integer needsWater) {
		this.plantname = plantname;
		this.waterdate = waterdate;
		this.formattedDate = formattedDate;
		this.nextWaterDate = nextWaterDate;
		this.nextDateFormatted = nextDateFormatted;
		this.needsWater = needsWater;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlantname() {
		return plantname;
	}

	public void setPlantname(String plantname) {
		this.plantname = plantname;
	}

	public LocalDateTime getWaterdate() {
		return waterdate;
	}

	public void setWaterdate(LocalDateTime waterdate) {
		this.waterdate = waterdate;
	}
	

	public String getFormattedDate() {
		return formattedDate;
	}
	

	public void setFormattedDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}

	public LocalDateTime getNextWaterDate() {
		return nextWaterDate;
	}

	public void setNextWaterDate(LocalDateTime nextWaterDate) {
		this.nextWaterDate = nextWaterDate;
	}

	public String getNextDateFormatted() {
		return nextDateFormatted;
	}

	public void setNextDateFormatted(String nextDateFormatted) {
		this.nextDateFormatted = nextDateFormatted;
	}
	
	public void setNextDateFormatted(LocalDateTime waterdate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		String formattedDateTime = waterdate.format(formatter);
		this.nextDateFormatted = formattedDateTime;
	}

	public void setFormattedDate(LocalDateTime waterdate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		String formattedDateTime = waterdate.format(formatter);
		this.formattedDate = formattedDateTime;
	}

	public Integer getNeedsWater() {
		return needsWater;
	}


	public void setNeedsWater(Integer needsWater) {
		this.needsWater = needsWater;
	}


	@Override
	public String toString() {
		return "PlantInventory [id=" + id + ", plantname=" + plantname + ", waterdate=" + waterdate + "]";
	}
	
	

}

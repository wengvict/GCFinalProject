package com.finalproject.PlantApp.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.entity.PlantInventory;
import com.finalproject.PlantApp.repository.PlantInventoryRepo;


public class GardenInventoryController {
	
	RestTemplate rt = new RestTemplate();
	@Autowired
	PlantInventoryRepo pir;
	
	@RequestMapping("/inventory")
	public ModelAndView index() {
		return new ModelAndView("gardeninventory", "p", pir.findAll());
	}
	@RequestMapping("/testing")
	public ModelAndView testingTest() {
		// this method requests and get a temporary token that can be passed into the URL
		Map<String, String> params = new HashMap<>();
		
		String url = "https://trefle.io/api/auth/claim?token=UGt4TGlIYTNNa3VkbzQ1Q2tUZjZCQT09&origin=http://localhost:8080/";

		@SuppressWarnings("unchecked")
		Map<String, String> response = rt.postForObject(url, params,Map.class);
		String token = response.get("token");
		System.out.println(token);
		String plUrl = "https://trefle.io/api/plants?token="+token;
		//TODO need to add in the basic POJO for trefle here
		//TrefleJson[] resp = rt.getForObject(plUrl, TrefleJson[].class);
		//System.out.println(resp[0].getId());
		return new ModelAndView("test");
	}
	
	@RequestMapping("/water")
	public ModelAndView water(@RequestParam("id")Integer id) {
		PlantInventory plant = pir.findById(id).get();
		plant.setWaterdate(LocalDate.now().atTime(12,0,0));
		plant.setNextWaterDate(LocalDateTime.now().plusDays(7));
		plant.setNextDateFormatted(plant.getNextWaterDate());
		plant.setFormattedDate(plant.getWaterdate());
		plant.setNeedsWater(0);
		pir.save(plant);
		System.out.println(plant);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/manualwater")
	public ModelAndView manualWaterPage(@RequestParam("id")Integer id) {
		PlantInventory plant = pir.findById(id).get();
		return new ModelAndView("manualwater","plant", plant);
		
	}
	
	@RequestMapping("/adddate")
	public ModelAndView waterManually(@RequestParam("id")Integer id, @RequestParam("waterdate") String date) {
		DateTimeFormatter DATEFORMATTER1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter DATEFORMATTER = new DateTimeFormatterBuilder().append(DATEFORMATTER1)
				    .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
				    .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
				    .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
				    .toFormatter();
		LocalDateTime waterdate = LocalDateTime.parse(date, DATEFORMATTER);
		PlantInventory plant = pir.findById(id).get();
		plant.setWaterdate(waterdate);
		plant.setNextWaterDate(waterdate.plusDays(7));
		plant.setNextDateFormatted(plant.getNextWaterDate());
		plant.setFormattedDate(plant.getWaterdate());
		if(plant.getNextWaterDate().isBefore(LocalDateTime.now())) {
			plant.setNeedsWater(1);
		}else {
			plant.setNeedsWater(0);
		}
		pir.save(plant);
		System.out.println(plant);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/removeplant")
	public ModelAndView removePlant(@RequestParam("id")Integer id) {
		PlantInventory plant = pir.findById(id).get();
		pir.delete(plant);
		return new ModelAndView("redirect:/");
	}

}

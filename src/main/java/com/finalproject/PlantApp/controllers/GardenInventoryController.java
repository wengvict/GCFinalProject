package com.finalproject.PlantApp.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.apiservices.TrefleService;
import com.finalproject.PlantApp.entity.PlantInventory;
import com.finalproject.PlantApp.repository.PlantInventoryRepo;

@Controller
public class GardenInventoryController {
	
	RestTemplate rt = new RestTemplate();
	@Autowired
	PlantInventoryRepo pir;
	
	@RequestMapping("/inventory")
	public ModelAndView index() {
		return new ModelAndView("gardeninventory", "p", pir.findAll());
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
		return new ModelAndView("redirect:/inventory");
	}
	
	@RequestMapping("/manualwater")
	public ModelAndView manualWaterPage(@RequestParam("id")Integer id) {
		PlantInventory plant = pir.findById(id).get();
		return new ModelAndView("adddatemanually","plant", plant);
		
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
		return new ModelAndView("redirect:/inventory");
	}
	
	@RequestMapping("/removeplant")
	public ModelAndView removePlant(@RequestParam("id")Integer id) {
		PlantInventory plant = pir.findById(id).get();
		pir.delete(plant);
		return new ModelAndView("redirect:/inventory");
	}

}

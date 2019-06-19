package com.finalproject.PlantApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/search")
	public ModelAndView searchPage() {
		return new ModelAndView("searchpage");
	}
	
	@RequestMapping("/AddDate")
		public ModelAndView addDate() {
		return new ModelAndView("adddatemanually");
	}
	
	@RequestMapping("/inventoryno")
		public ModelAndView getInventory() {
		return new ModelAndView("gardeninventory");
	}

}

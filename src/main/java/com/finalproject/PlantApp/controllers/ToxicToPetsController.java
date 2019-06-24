package com.finalproject.PlantApp.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.entity.PoisonToPets;
import com.finalproject.PlantApp.entity.PoisonToPetsOuter;

@Controller
public class ToxicToPetsController {
	RestTemplate rt = new RestTemplate();

	String url = "https://wengvict.github.io/ToxicPlantApi/ToxicPlants.json";

	PoisonToPetsOuter getKillerPlant = rt.getForObject(url, PoisonToPetsOuter.class);

	ArrayList<PoisonToPets> list = getKillerPlant.getToxicplant();

	@RequestMapping("/toxicitypage")
	public ModelAndView toxicityToPetsAll() {
//		for (int i = 0; i < list.size(); i++) {
//			//System.out.println(list.get(i).getCommonname());
//		}
		
		return new ModelAndView("toxictoanimals","all", list);
	}
	

	@RequestMapping("/toxictopets")
	public ModelAndView toxicitySearch(@RequestParam(value = "cats", required = false) String cats,
			@RequestParam(value = "dogs", required = false) String dogs,
			@RequestParam(value = "horse", required = false) String horse) {

		ModelAndView mv = new ModelAndView("toxictoanimals");

		if (cats != null) {
			ArrayList<PoisonToPets> poisonToCats = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getCats() != null) {
					if (list.get(i).getCats().equalsIgnoreCase("yes")) {
						poisonToCats.add(list.get(i));
					}

				}
			}
			mv.addObject("cats", poisonToCats.get(0));
		}

		if (dogs != null) {
			ArrayList<PoisonToPets> poisonToDogs = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDogs() != null) {
					if (list.get(i).getDogs().equalsIgnoreCase("yes")) {
						poisonToDogs.add(list.get(i));
					}

				}
			}
			mv.addObject("dogs", poisonToDogs.get(0));
		}

		if (horse != null) {
			ArrayList<PoisonToPets> poisonToHorse = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getHorses() != null) {
					if (list.get(i).getHorses().equalsIgnoreCase("yes")) {
						poisonToHorse.add(list.get(i));
					}

				}
			}
			mv.addObject("horse", poisonToHorse.get(0));

		}
		return mv;
	}
	@RequestMapping("/searchtoxstring")
	public ModelAndView toxicString(@RequestParam("toxstring")String toxstring){
		PoisonToPets plant = new PoisonToPets();
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCommonname().contains("adam")) {
					plant = list.get(i);
				
			}

		}
		System.out.println(plant);
		return new ModelAndView ("redirect:/toxicitypage","plantsearch", plant);
		
	}

	@RequestMapping("/toxicdetails")
	public ModelAndView toxDeetz(@RequestParam("id") Integer id) {
		PoisonToPets pp = new PoisonToPets();
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i).getId().intValue();
			if (num == id) {
				pp = list.get(i);
			}
		}
		return new ModelAndView("singletoxic", "donteat", pp);

	}

}

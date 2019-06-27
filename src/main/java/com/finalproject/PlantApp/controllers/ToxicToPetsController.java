package com.finalproject.PlantApp.controllers;

import java.util.ArrayList;
import java.util.Comparator;

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
		ModelAndView mv = new ModelAndView("toxictoanimals", "all", list);
		mv.addObject("counterstart", 0);
		mv.addObject("counterend", 10);
		return mv;
	}

	@RequestMapping("/toxicitypagenext")
	public ModelAndView toxicityToPetsNext(@RequestParam("counterend") int end) {
		ModelAndView mv = new ModelAndView("toxictoanimals", "all", list);
		mv.addObject("counterstart", end + 1);
		mv.addObject("counterend", end + 10);
		return mv;
	}

	@RequestMapping("/toxicitypageletter")
	public ModelAndView toxicityByLetter(@RequestParam("letter") char letter) {
		ModelAndView mv = new ModelAndView("toxictoanimalbyletter");
		ArrayList<PoisonToPets> arr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCommonname().toLowerCase().charAt(0) == letter) {
				arr.add(list.get(i));
			}
		}
		mv.addObject("all", arr);
		System.out.println(arr);
		return mv;

	}

	@RequestMapping("/toxictopets")
	public ModelAndView toxicitySearch(@RequestParam(value = "cats", required = false) String cats,
			@RequestParam(value = "dogs", required = false) String dogs,
			@RequestParam(value = "horse", required = false) String horse) {

		ModelAndView mv = new ModelAndView("petchecklist");
		
		ArrayList<PoisonToPets> poisonList = new ArrayList<>();

		if (cats != null) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getCats() != null) {
					if (list.get(i).getCats().equalsIgnoreCase("yes")) {
						poisonList.add(list.get(i));
					}

				}
			}
			
		}

		if (dogs != null) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getDogs() != null) {
					if (list.get(i).getDogs().equalsIgnoreCase("yes")) {
						if(poisonList.contains(list.get(i))) {
							continue;
						}else {
							poisonList.add(list.get(i));
						}
						
					}

				}
			}
			
		}

		if (horse != null) {
			
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getHorses() != null) {
					if (list.get(i).getHorses().equalsIgnoreCase("yes")) {
						if(poisonList.contains(list.get(i))) {
							continue;
						}else {
							poisonList.add(list.get(i));
						}
						
					}

				}
			}
			

		}
		poisonList.sort(Comparator.comparing(PoisonToPets::getCommonname));
		mv.addObject("plantlist", poisonList);
		return mv;
	}

	@RequestMapping("/searchtoxstring")
	public ModelAndView toxicString(@RequestParam("toxstring") String toxstring) {
		toxstring.toLowerCase();
		
		ModelAndView mv = new ModelAndView("toxictospecific");
		mv.addObject("userstring", toxstring);
		
		ArrayList<PoisonToPets> toxic = new ArrayList<>();
		PoisonToPets plant = new PoisonToPets();
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCommonname().toLowerCase().contains(toxstring)) {
				toxic.add(list.get(i));

			}

		}
		mv.addObject("plantsearch", toxic);

		return mv;
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

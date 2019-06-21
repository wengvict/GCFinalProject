package com.finalproject.PlantApp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.apiservices.TrefleService;
import com.finalproject.PlantApp.entity.PlantInventory;
import com.finalproject.PlantApp.repository.PlantInventoryRepo;
import com.finalproject.PlantApp.trefle.pojos.PlantPics;
import com.finalproject.PlantApp.trefle.pojos.TrefleOuter;
import com.finalproject.PlantApp.trefle.pojos.TreflePlant;

@Controller
public class SearchController {

	@Autowired
	PlantInventoryRepo pir;

	RestTemplate rt = new RestTemplate();

	@Value("${trefle.key}")
	String trefleKey;

	@RequestMapping("/findplants")
	public ModelAndView mainSearch(@RequestParam("plantname") String plantname,
			@RequestParam("nametype") String nametype) {
		ModelAndView mv = new ModelAndView("searchresults");

		plantname.toLowerCase();
		String token = TrefleService.getToken(trefleKey);

		ResponseEntity<TreflePlant[]> getPlant = TrefleService.getTreflePlantArray(plantname, token);
		Map<TreflePlant, PlantPics> plantMap = new HashMap<TreflePlant, PlantPics>();
		int pages = Integer.parseInt(getPlant.getHeaders().get("total-pages").get(0).toString());

		for (int j = 0; j < pages; j++) {
			for (int i = 0; i < getPlant.getBody().length; i++) {

				if (getPlant.getBody()[i].getComplete_data() == true) {

					if (getPlant.getBody()[i].getCommon_name() != null) {
						// System.out.println(getPlant[i].getCommon_name());

						if (nametype.equalsIgnoreCase("common")) {
							TreflePlant plant = getPlant.getBody()[i];
							TrefleOuter outer = TrefleService.getImage(getPlant.getBody()[i].getId(), token);
							PlantPics pics = outer.getImages().get(0);
							plantMap.put(plant, pics);

						} else if (nametype.equalsIgnoreCase("scientific")) {
							TreflePlant plant = getPlant.getBody()[i];
							TrefleOuter outer = TrefleService.getImage(getPlant.getBody()[i].getId(), token);
							PlantPics pics = outer.getImages().get(0);
							plantMap.put(plant, pics);
						}
					}
				}
			}
		}
		mv.addObject("search", plantname);
		mv.addObject("map", plantMap);
		return mv;
	}

	@RequestMapping("/allthethings")
	public ModelAndView mainSearch(@RequestParam("name") String plantname) {
		ModelAndView mv = new ModelAndView("searchresults");

		plantname.toLowerCase();
		String token = TrefleService.getToken(trefleKey);

		ResponseEntity<TreflePlant[]> getPlant = TrefleService.getTreflePlantArray(plantname, token);
		Map<TreflePlant, PlantPics> plantMap = new HashMap<TreflePlant, PlantPics>();
		int pages = Integer.parseInt(getPlant.getHeaders().get("total-pages").get(0).toString());

		for (int j = 0; j < pages; j++) {
			for (int i = 0; i < getPlant.getBody().length; i++) {

				if (getPlant.getBody()[i].getCommon_name() != null) {
					// System.out.println(getPlant[i].getCommon_name());
					TreflePlant plant = getPlant.getBody()[i];
					PlantPics pics =  new PlantPics("");
					plantMap.put(plant, pics);
				}
			}
		}
		mv.addObject("search", plantname);
		mv.addObject("map", plantMap);
		return mv;
	}

	@RequestMapping("/plantpage")
	public ModelAndView plantDetails(@RequestParam("plantid") String plantid) {
		String token = TrefleService.getToken(trefleKey);
		// System.out.println(token);
		String plUrl = "https://trefle.io/api/plants/" + plantid + "?token=" + token;

		TrefleOuter plant = rt.getForObject(plUrl, TrefleOuter.class);

		// got too carried away and tried implementing toxicity, did not have enough
		// time to figure it out

//		String toxUrl = "https://wengvict.github.io/ToxicPlantApi/ToxicPlants.json";
//		PoisonToPetsOuter getKillerPlant = rt.getForObject(url, PoisonToPetsOuter.class);
//		
//		ArrayList<PoisonToPets> list = getKillerPlant.getToxicplant();
//		System.out.println(list.size());
//		
//		PoisonToPets poisonObj = new PoisonToPets();
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getPoisonproperty());
//			if(list.get(i).getScientificname().contains(plant.getGenus().getName())) {
//				poisonObj = list.get(i);
//				//System.out.println(list.get(i).getCommonname());
//			} 
//		}
//
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("toxic", poisonObj.getCats());

		return new ModelAndView("plantpage", "plantfacts", plant);
	}

	@RequestMapping("/addplant")
	public ModelAndView addPlant(@RequestParam("scientificname") String scientificname) {
		PlantInventory addplant = new PlantInventory(scientificname, null, null, null, null, null);
		pir.save(addplant);

		// this saves plant but we will have to work on showing the results table with
		// the expressions language tag
		return new ModelAndView("redirect:/inventory", "addconfirm", "Plant has been added!");
	}

}

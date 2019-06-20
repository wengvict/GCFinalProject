package com.finalproject.PlantApp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.entity.PlantInventory;
import com.finalproject.PlantApp.repository.PlantInventoryRepo;
import com.finalproject.PlantApp.trefle.pojos.TrefleOuter;
import com.finalproject.PlantApp.trefle.pojos.TreflePlant;

@Controller
public class SearchController {
	
	@Autowired
	PlantInventoryRepo pir;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/findplants")
	public ModelAndView mainSearch(@RequestParam("plantname") String plantname,
			@RequestParam("nametype") String nametype) {
		
		plantname.toLowerCase();
		
		Map<String, String> params = new HashMap<>();
		
		String url = "https://trefle.io/api/auth/claim?token=UGt4TGlIYTNNa3VkbzQ1Q2tUZjZCQT09&origin=http://localhost:8080/";

		@SuppressWarnings("unchecked")
		Map<String, String> response = rt.postForObject(url, params,Map.class);
		String token = response.get("token");
		//System.out.println(token);
		String plUrl = "https://trefle.io/api/plants?q=" + plantname + "&token=" +token;
		
		TreflePlant[] getPlant = rt.getForObject(plUrl, TreflePlant[].class);
		ArrayList<TreflePlant> plantList = new ArrayList<TreflePlant>();
		
		//System.out.println(getPlant[0].getId());
		for(int i = 0; i < getPlant.length;i++) {
			
			if(getPlant[i].getCommon_name() != null) {
				//System.out.println(getPlant[i].getCommon_name());
				
				if(nametype.equalsIgnoreCase("common")) {
					TreflePlant plant = getPlant[i];
					plantList.add(plant);
					
				} else if(nametype.equalsIgnoreCase("scientific")) {
					TreflePlant plant = getPlant[i];
					plantList.add(plant);
				}
			}	
		}
				
		System.out.println(plantList);
		//System.out.println(plantList);
		return new ModelAndView("searchresults","plantresult", plantList);
	}
	
	@RequestMapping("/plantpage")
	public ModelAndView plantDetails(@RequestParam("plantid") String plantid) {		
		Map<String, String> params = new HashMap<>();
		
		String url = "https://trefle.io/api/auth/claim?token=UGt4TGlIYTNNa3VkbzQ1Q2tUZjZCQT09&origin=http://localhost:8080/";

		@SuppressWarnings("unchecked")
		Map<String, String> response = rt.postForObject(url, params,Map.class);
		String token = response.get("token");
		//System.out.println(token);
		String plUrl = "https://trefle.io/api/plants/" + plantid + "?token=" +token;
		
		TrefleOuter plant = rt.getForObject(plUrl, TrefleOuter.class);
		
		
		// got too carried away and tried implementing toxicity, did not have enough time to figure it out
		
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
		
		// this saves plant but we will have to work on showing the results table with the expressions language tag
		return new ModelAndView("redirect:/searchresults", "addconfirm", "Plant has been added!");
	}


}

package com.finalproject.PlantApp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.trefle.pojos.TrefleParent;
import com.finalproject.PlantApp.trefle.pojos.TreflePlant;

@Controller
public class SearchController {
	
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
		
		
		// nested for loop in jsp page for toxicity api?
		
		System.out.println(plantList);
		//System.out.println(plantList);
		return new ModelAndView("searchresults","plantresult", plantList);
	}

}

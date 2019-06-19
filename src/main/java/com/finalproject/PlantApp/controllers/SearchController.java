package com.finalproject.PlantApp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.entity.USDAOuter;
import com.finalproject.PlantApp.entity.USDAPlant;

@Controller
public class SearchController {
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/findplants")
	public ModelAndView mainSearch(@RequestParam("plantname") String plantname) {
		plantname.toLowerCase();
		
		Map<String, String> params = new HashMap<>();
		
		String url = "https://trefle.io/api/auth/claim?token=UGt4TGlIYTNNa3VkbzQ1Q2tUZjZCQT09&origin=http://localhost:8080/";

		@SuppressWarnings("unchecked")
		Map<String, String> response = rt.postForObject(url, params,Map.class);
		String token = response.get("token");
		System.out.println(token);
		String plUrl = "https://trefle.io/api/plants?token="+token;
		
		for(int i = 0; i < getPlants.getBody().getData().size();i++) {
			if(plantname.equals(getPlants.getBody().getData().get(i).getCommonName())) {
				
				plantindex = i;
			} //else if(plantname.equalsIgnoreCase(getPlants.getBody().getData().get(i).getScientificName())) {			
				
//				plantindex = i;
//			}
		}
		
		
			plant = getPlants.getBody().getData().get(plantindex);
			System.out.println(plant.getDuration());
		
		
		return new ModelAndView("searchpage","plantresult", plant);
	}

}

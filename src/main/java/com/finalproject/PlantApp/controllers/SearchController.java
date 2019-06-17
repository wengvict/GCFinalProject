package com.finalproject.PlantApp.controllers;

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
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", HttpHeaders.ACCEPT);
		
		ResponseEntity<USDAOuter> getPlants = rt.exchange("https://plantsdb.xyz/search",
				HttpMethod.GET, new HttpEntity<>("parameters", headers),
				USDAOuter.class);
		
		USDAPlant plant = new USDAPlant();
		int flag = 0;
		int plantindex = 0;
		
		for(int i = 0; i < getPlants.getBody().getData().size();i++) {
			if(plantname.equalsIgnoreCase(getPlants.getBody().getData().get(i).getCommonName())) {
				
				plantindex = i;
			} //else if(plantname.equalsIgnoreCase(getPlants.getBody().getData().get(i).getScientificName())) {			
//				flag++;
//				plantindex = i;
//			}
		}
		
		
			plant = getPlants.getBody().getData().get(plantindex);
		
		
		return new ModelAndView("redirect:searchpage","plantresult", plant.getCommonName());
	}

}

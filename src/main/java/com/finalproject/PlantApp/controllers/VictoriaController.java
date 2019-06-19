package com.finalproject.PlantApp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.PlantApp.entity.PoisonToPets;
import com.finalproject.PlantApp.entity.PoisonToPetsOuter;

@Controller
public class VictoriaController {
	
	RestTemplate rt = new RestTemplate();
	
//	@RequestMapping("findOnTrefle")
//	public ModelAndView plantInfo() {
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("token", trefleKey);
//		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
//		
//		//https://trefle.io/api/auth/claim?token=YOUR-TOKEN
//		String url = "https://trefle.io/api/plants/214941";
//		
//		ResponseEntity<TreflePlant> response = rt.exchange(url,
//				HttpMethod.GET, new HttpEntity<>("parameters", headers),TreflePlant.class);
//		
//		System.out.println(response.getBody().getMain_species().getStatus());
//		
//		return null;
//	}
	
	@RequestMapping("/toxicitysearch")
	public ModelAndView toxicitySearch() {

		String url = "https://wengvict.github.io/ToxicPlantApi/ToxicPlants.json";
		
		PoisonToPetsOuter getKillerPlant = rt.getForObject(url, PoisonToPetsOuter.class);
		
		System.out.println(getKillerPlant.getToxicplant());
		ArrayList<PoisonToPets> list = getKillerPlant.getToxicplant();
		System.out.println(list.size());
	//	int plantIndex = 0;
		PoisonToPets poisonObj = new PoisonToPets();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPoisonproperty());
			if(list.get(i).getCommonname().equalsIgnoreCase("yucca")) {
				poisonObj = list.get(i);
				//System.out.println(list.get(i).getCommonname());
			}
		}
		//System.out.println(getKillerPlant.getBody().getToxicplant().get(plantIndex).getPoisonproperty());
		 
		return new ModelAndView("tester", "toxic", poisonObj);
	}


}

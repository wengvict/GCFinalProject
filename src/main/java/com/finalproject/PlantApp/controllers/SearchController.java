package com.finalproject.PlantApp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
import com.finalproject.PlantApp.entity.User;
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
	public ModelAndView mainSearch(@RequestParam("plantname") String plantname) {
		
		// no need b/c responseentity already searches all names
//			,@RequestParam("nametype") String nametype) {
		
		ModelAndView mv = new ModelAndView("searchresults");

		plantname.toLowerCase();
		String token = TrefleService.getToken(trefleKey);

		ResponseEntity<TreflePlant[]> getPlantNotByPages = TrefleService.getTreflePlantArray(plantname, token);
		Map<TreflePlant, PlantPics> plantMap = new HashMap<TreflePlant, PlantPics>();
		int pages = Integer.parseInt(getPlantNotByPages.getHeaders().get("total-pages").get(0).toString());
		
//		ResponseEntity<TreflePlant[]> getPlant = TrefleService.getTreflePlantArrayByPages(plantname, token, pages);
		System.out.println(pages);
		
		// commented out because nested for-loop was causing some logic errors
		for (int j = 0; j < pages; j++) {
			
			ResponseEntity<TreflePlant[]> getPlant = TrefleService.getTreflePlantArrayByPages(plantname, token, j + 1);

		for (int i = 0; i < getPlant.getBody().length; i++) {
			
			// was only sending back one result even tho some had complete data. when commented out, results filled up
			// if (getPlant.getBody()[i].getComplete_data() == true) {

			if (getPlant.getBody()[i].getCommon_name() != null) {
				// System.out.println(getPlant[i].getCommon_name());
				
				// no need b/c passing plantname through responseentity already checks api for plant name
				// if (nametype.equalsIgnoreCase("common")) {
				TreflePlant plant = getPlant.getBody()[i];
				TrefleOuter outer = TrefleService.getImage(getPlant.getBody()[i].getId(), token);

				// validates that images is not null
				if (outer.getImages().size() > 0) {
					PlantPics pics = outer.getImages().get(0);
					plantMap.put(plant, pics);

				}		
						// same reason as the common nametype above
//						} else if (nametype.equalsIgnoreCase("scientific")) {
//							TreflePlant plant = getPlant.getBody()[i];
//							TrefleOuter outer = TrefleService.getImage(getPlant.getBody()[i].getId(), token);

//							if (outer.getImages().size() > 0) {
//							PlantPics pics = outer.getImages().get(0);
//							plantMap.put(plant, pics);
//							}
				// }
			}
			}
			//}
		}
		
//		System.out.println(plantMap.values().size());
		mv.addObject("search", plantname);
		mv.addObject("map", plantMap);
		return mv;
	}

	// completedata doesnt return the things we want to see
//	@RequestMapping("/allthethings")
//	public ModelAndView mainSearch(@RequestParam("name") String plantname) {
//		ModelAndView mv = new ModelAndView("searchresults");
//
//		plantname.toLowerCase();
//		String token = TrefleService.getToken(trefleKey);
//
//		ResponseEntity<TreflePlant[]> getPlant = TrefleService.getTreflePlantArray(plantname, token);
//		Map<TreflePlant, PlantPics> plantMap = new HashMap<TreflePlant, PlantPics>();
//		int pages = Integer.parseInt(getPlant.getHeaders().get("total-pages").get(0).toString());
//
//		for (int j = 0; j < pages; j++) {
//			for (int i = 0; i < getPlant.getBody().length; i++) {
//
//				if (getPlant.getBody()[i].getCommon_name() != null) {
//					// System.out.println(getPlant[i].getCommon_name());
//					TreflePlant plant = getPlant.getBody()[i];
//					PlantPics pics =  new PlantPics("");
//					plantMap.put(plant, pics);
//				}
//			}
//		}
////		mv.addObject("search", plantname);
////		mv.addObject("map", plantMap);
//		return mv;
//	}

	@RequestMapping("/plantpage")
	public ModelAndView plantDetails(@RequestParam("plantid") String plantid) {
		String token = TrefleService.getToken(trefleKey);
		// System.out.println(token);
		String plUrl = "https://trefle.io/api/plants/" + plantid + "?token=" + token;

		TrefleOuter plant = rt.getForObject(plUrl, TrefleOuter.class);

		return new ModelAndView("plantpage", "plantfacts", plant);
	}

	@RequestMapping("/addplant")
	public ModelAndView addPlant(HttpSession session, @RequestParam("scientificname") String scientificname) {
		User user = (User) session.getAttribute("user");
		if (user == null) {

			return new ModelAndView("userlogin", "pName", scientificname);
		} else {
			PlantInventory addplant = new PlantInventory(scientificname, null, null, null, null, null,
					user.getUserId());
			pir.save(addplant);

			// this saves plant but we will have to work on showing the results table with
			// the expressions language tag
			return new ModelAndView("redirect:/inventory", "addconfirm", "Plant has been added!");
		}

	}

}

package com.finalproject.PlantApp.apiservices;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.finalproject.PlantApp.trefle.pojos.TrefleOuter;
import com.finalproject.PlantApp.trefle.pojos.TreflePlant;

public class TrefleService {
	static RestTemplate rt = new RestTemplate();

	public static String getToken(String key) {
		Map<String, String> params = new HashMap<>();
		String url = "https://trefle.io/api/auth/claim?token=" + key + "&origin=http://localhost:8080/";
		@SuppressWarnings("unchecked")
		Map<String, String> response = rt.postForObject(url, params, Map.class);
		return response.get("token");
	}

	public static ResponseEntity<TreflePlant[]> getTreflePlantArray(String plantname, String token) {

		
		String plUrl = "https://trefle.io/api/plants?q=" + plantname + "&token=" + token;

		ResponseEntity<TreflePlant[]> getPlant = rt.getForEntity(plUrl, TreflePlant[].class);
		return getPlant;
	}
	
	public static ResponseEntity<TreflePlant[]> getTreflePlantArrayByPages(String plantname, String token, int pages) {

	
		String plUrl = "https://trefle.io/api/plants?page=" + pages + "&q=" + plantname + "&token=" + token;

		ResponseEntity<TreflePlant[]> getPlant = rt.getForEntity(plUrl, TreflePlant[].class);
		return getPlant;
	}

	public static TrefleOuter getImage(Integer id, String token) {
		String url = "https://trefle.io/api/plants/" + id + "?token=" + token;
		ResponseEntity<TrefleOuter> getPlant = rt.getForEntity(url, TrefleOuter.class);
		return getPlant.getBody();
	}

}

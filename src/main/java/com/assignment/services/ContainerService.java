package com.assignment.services;

import java.util.Arrays;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ContainerService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public int checkAvailable() throws JSONException {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String availebleContainer = restTemplate
				.exchange("https://maersk.com/api/bookings/checkAvailable", HttpMethod.GET, entity, String.class)
				.getBody();
		JSONObject json = new JSONObject(availebleContainer);
		int containerAvailableSize = json.getInt("availeble");
		
		return containerAvailableSize;
		
	}

}

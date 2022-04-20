package com.assignment.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.assignment.requestbody.model.RequestData;
import com.assignment.services.ContainerService;

@RestController
@RequestMapping("/api/bookings")
public class ContainerBookingController {

	@Autowired
	ContainerService containerService;

	@PostMapping("/endpoint1")
	public ResponseEntity<Boolean> checkContainerAvailability(@Valid @RequestBody RequestData requestBodydata) throws JSONException {

		boolean available = false;
		
		if (containerService.checkAvailable() > 0) {
			available = true;
		}
		
		return ResponseEntity.ok(available);

	}

}

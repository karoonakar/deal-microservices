package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Deal;
import com.example.service.DealProviderService;

@RestController
public class DealProviderCircuitBreakerController {

	@Autowired
	private DealProviderService dealProviderService;	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Resources<Deal> getData() {
		return dealProviderService.findAll();
		
	}

}

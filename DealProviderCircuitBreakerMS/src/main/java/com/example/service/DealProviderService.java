package com.example.service;

import org.springframework.hateoas.Resources;

import com.example.model.Deal;

public interface DealProviderService {
	
	Resources<Deal> findAll();
	

}

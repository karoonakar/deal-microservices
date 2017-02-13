package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Service;

import com.example.dao.DealProviderFeignClient;
import com.example.model.Deal;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class DealProviderServiceImpl implements DealProviderService{

	@Autowired
	private DealProviderFeignClient dao;

	@Override
	@HystrixCommand(fallbackMethod="findAllFallback")
	public Resources<Deal> findAll() {
		
		return dao.findAll();
	}
	
	
	public Resources<Deal> findAllFallback(){
		return new Resources<Deal>(){};
	}
	
	
}

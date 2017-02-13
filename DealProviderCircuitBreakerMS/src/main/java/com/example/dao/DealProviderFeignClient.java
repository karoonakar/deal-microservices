package com.example.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Deal;

@FeignClient("DealProvider-MS")
public interface DealProviderFeignClient {

	@RequestMapping(value="/datarest", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	Resources<Deal> findAll();
	
	
	//findByStartDateBefore
	@RequestMapping(value="/datarest/search/findByStartDateBefore/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	Resources<Deal> findByStartDateBefore(@RequestParam("startDate") @DateTimeFormat(iso=ISO.DATE) String date);
	
}


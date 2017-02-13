package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Deal;
import com.example.repository.DealRepository;

@RestController
public class DealProviderController {

	@Autowired
	private DealRepository manufacturerRepository;
	
	
	@RequestMapping(value="/findByStartDate/{startDate}",  method=RequestMethod.GET)
	public List<Deal> findByStartDate(@DateTimeFormat(iso=ISO.DATE) @PathVariable("startDate")Date date){
		
		return manufacturerRepository.findByStartDateBefore(date);
	}
}

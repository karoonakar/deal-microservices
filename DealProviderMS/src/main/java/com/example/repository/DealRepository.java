package com.example.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.example.model.Deal;


@RepositoryRestResource(path="/datarest")
public interface DealRepository extends MongoRepository<Deal, Integer> {


// http://localhost:8888/sg/datarest/search/findByStartDateBefore?startDate=2016-01-01
List<Deal> findByStartDateBefore(@Param("startDate") @DateTimeFormat(iso=ISO.DATE) Date date);


}

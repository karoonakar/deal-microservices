package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
@EnableHystrixDashboard

public class TurbineDashBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineDashBoardApplication.class, args);
	}
}

//http://localhost:58530/turbine.stream

//https://github.com/jtdev/spring-feign-data-rest-example
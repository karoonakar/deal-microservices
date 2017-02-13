package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class DealProviderConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealProviderConfigServerApplication.class, args);
	}
}


// look for http://localhost:8001/configprops
// http://localhost:8001/consul/
// http://localhost:8500/ui/#/dc1/services
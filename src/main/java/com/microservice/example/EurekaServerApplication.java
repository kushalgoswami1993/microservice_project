package com.microservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	
	//test for service
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}

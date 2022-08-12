package com.org.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FridayHandson2Application {

	public static void main(String[] args) {
		SpringApplication.run(FridayHandson2Application.class, args);
	}

}

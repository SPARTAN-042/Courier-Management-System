package com.Courier.CourierManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class CourierManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourierManagementSystemApplication.class, args);
	}

}

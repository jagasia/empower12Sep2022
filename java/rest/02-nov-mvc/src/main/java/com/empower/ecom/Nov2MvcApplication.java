package com.empower.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Nov2MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nov2MvcApplication.class, args);
		System.out.println("Mvc Application: Hello world");
	}

}

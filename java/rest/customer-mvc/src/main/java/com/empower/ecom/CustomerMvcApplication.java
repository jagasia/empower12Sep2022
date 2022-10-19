package com.empower.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMvcApplication.class, args);
	}

}

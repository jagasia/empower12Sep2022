package com.empower.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Oct27Demo11Application {

	@GetMapping
	public String home()
	{
		return "Hello world! this is aws demo done on 28-Oct-2022 at Bengaluru";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Oct27Demo11Application.class, args);
	}

}

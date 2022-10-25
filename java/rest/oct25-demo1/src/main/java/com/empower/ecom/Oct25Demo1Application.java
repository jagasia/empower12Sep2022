package com.empower.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Oct25Demo1Application {

	@GetMapping
	public String home()
	{
		return "Hi this is Jag. How are you!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Oct25Demo1Application.class, args);
	}

}

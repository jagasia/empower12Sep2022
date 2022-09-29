package com.empower.hrms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.empower.hrms.model.Product;

@Configuration
@ComponentScan(basePackages = {"com.empower"})
public class MyConfiguration {

	@Bean
	public Product prd()
	{
		return new Product(25, "Pen", 25.0);
	}
}

package com.empower.hrms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.empower.hrms.model.Address;

@Configuration
@ComponentScan(basePackages = {"com.empower","com"})
public class MyConfiguration {

	@Bean
	public Address address()
	{
		return new Address("12", "MG Road", "Bengaluru");
	}
	
	@Bean
	public Address add2()
	{
		return new Address("24", "Brigade Road", "Bengaluru");
	}
}

package com.empower.ecom.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","*"})
public class MyController {

	@GetMapping
	public String home()
	{
		return "Hello world";
	}
}

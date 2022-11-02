package com.empower.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/showLogin")
	public String showLogin()
	{
		return "login";
	}
	
	@GetMapping("/logout")
	public  String logout()
	{
		return "logout";
	}
}

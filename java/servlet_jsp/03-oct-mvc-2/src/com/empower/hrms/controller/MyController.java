package com.empower.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String home()
	{
		return "index";			//prefix + index + suffix
	}
	
	@RequestMapping("/about")
	public String aboutUs()
	{
		return "about-us";
	}
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

//@Controller
@RestController
public class MyController {
	@GetMapping("/")
//	@ResponseBody
	public Employee home()
	{
		Employee employee = new Employee(12, "Jag");
		return employee;
	}
}

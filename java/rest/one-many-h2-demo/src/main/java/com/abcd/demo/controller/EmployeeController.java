package com.abcd.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcd.demo.entity.Employee;
import com.abcd.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.create(employee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees() {
		return es.read();
	}
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id")Integer id) {
		return es.read(id);
	}
	
	@PutMapping
	public Employee create(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee create(@PathVariable("id")Integer id) {
		return es.delete(id);
	}
	
}

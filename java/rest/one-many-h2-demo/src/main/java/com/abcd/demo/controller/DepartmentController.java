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

import com.abcd.demo.entity.Department;
import com.abcd.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService ds;
	
	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		return ds.create(department);
	}
	
	@GetMapping
	public List<Department> getAllDepartments() {
		return ds.read();
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id")Integer id) {
		return ds.read(id);
	}
	
	@PutMapping
	public Department create(@RequestBody Department department) {
		return ds.update(department);
	}
	
	@DeleteMapping("/{id}")
	public Department create(@PathVariable("id")Integer id) {
		return ds.delete(id);
	}
	
}

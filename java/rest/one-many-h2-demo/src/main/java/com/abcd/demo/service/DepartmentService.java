package com.abcd.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcd.demo.entity.Department;
import com.abcd.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository dr;
	
	public Department create(Department department) {
		return dr.save(department);
	}
	public List<Department> read() {
		return dr.findAll();
	}
	public Department read(Integer id) {
		Optional<Department> temp = dr.findById(id);
		Department department=null;
		if(temp.isPresent())
		{
			department=temp.get();
		}
		return department;
	}
	public Department update(Department department) {
		Optional<Department> temp = dr.findById(department.getId());
		Department d=null;
		if(temp.isPresent())
		{
			d=department;
			dr.save(department);
		}
		return d;
	}
	public Department delete(Integer id) {
		Optional<Department> temp = dr.findById(id);
		Department department=null;
		if(temp.isPresent())
		{
			department=temp.get();
			dr.delete(department);
		}
		return department;
	}
	
}

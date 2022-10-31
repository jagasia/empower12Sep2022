package com.abcd.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcd.demo.entity.Employee;
import com.abcd.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee employee=null;
		if(temp.isPresent())
		{
			employee=temp.get();
		}
		return employee;
	}
	public Employee update(Employee employee) {
		Optional<Employee> temp = er.findById(employee.getId());
		Employee d=null;
		if(temp.isPresent())
		{
			d=employee;
			er.save(employee);
		}
		return d;
	}
	public Employee delete(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee employee=null;
		if(temp.isPresent())
		{
			employee=temp.get();
			er.delete(employee);
		}
		return employee;
	}
	
}

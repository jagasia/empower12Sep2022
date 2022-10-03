package com.empower.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.hrms.model.Customer;
import com.empower.hrms.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository cr;
	
	public Customer create(Customer customer) {
		return cr.save(customer);
	}
	public List<Customer> read() {
		return cr.findAll();
	}
	public Customer read(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer customer=null;
		if(temp.isPresent())
			customer=temp.get();
		return customer;
	}
	public Customer update(Customer customer) {
		Optional<Customer> temp = cr.findById(customer.getId());		
		if(temp.isPresent())
		{			
			cr.save(customer);
			return customer;
		}else
			return null;		
	}
	public Customer delete(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer customer=null;
		if(temp.isPresent())
		{
			customer=temp.get();
			cr.delete(customer);
		}
		return customer;
	}
	
}

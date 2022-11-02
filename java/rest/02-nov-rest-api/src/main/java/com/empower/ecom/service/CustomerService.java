package com.empower.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.ecom.entity.Customer;
import com.empower.ecom.repository.CustomerRepository;

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
	public Customer read(String email) {
		Optional<Customer> temp = cr.findById(email);
		Customer customer=null;
		if(temp.isPresent())
		{
			customer=temp.get();
		}
		return customer;
	}
	public Customer update(Customer customer) {
		Optional<Customer> temp = cr.findById(customer.getEmail());
		Customer c=null;
		if(temp.isPresent())
		{
			c=customer;
			cr.save(customer);
		}
		return c;
	}
	public Customer delete(String email) {
		Optional<Customer> temp = cr.findById(email);
		Customer customer=null;
		if(temp.isPresent())
		{
			customer=temp.get();
			cr.delete(customer);
		}
		return customer;
	}
	
}

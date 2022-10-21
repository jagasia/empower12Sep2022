package com.empower.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.ecom.model.Customer;
import com.empower.ecom.model.CustomerService;

@RestController
@RequestMapping("/customer")
//cross origin
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:3000","*"})
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@GetMapping
	public List<Customer> retrieveAllCustomers()
	{
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id") Integer id)
	{
		return cs.read(id);
	}
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return cs.create(customer);
	}
	
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return cs.update(customer);
	}
	
	@DeleteMapping("/{id}")
	public Customer removeCustomer(@PathVariable("id") Integer id)
	{
		return cs.delete(id);
	}
}

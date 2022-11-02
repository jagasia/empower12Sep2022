package com.empower.ecom.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.ecom.entity.Customer;
import com.empower.ecom.helper.AuthRequest;
import com.empower.ecom.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@PostMapping
	public Customer signup(@RequestBody Customer customer) {
		return cs.create(customer);
	}
	
	@GetMapping
	public List<Customer> read() {
		return cs.read();
	}
	
	@PostMapping("/login")
	public Customer validateLogin(@RequestBody AuthRequest authRequest) {
		Customer customer = cs.read(authRequest.getEmail());
		
		if(customer!=null && customer.getPassword().equals(authRequest.getPassword()))
		{			
			return customer;
		}
		return null;
	}
	
	@PutMapping
	public Customer update(@RequestBody Customer customer) {
		return cs.update(customer);
	}
	
	@DeleteMapping("/{email}")	
	public Customer delete(@PathVariable("email")String email) {
		return cs.delete(email);
	}
	
}

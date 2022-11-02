package com.empower.ecom.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.ecom.entity.Customer;
import com.empower.ecom.helper.AuthRequest;

@FeignClient(value = "customer-api",url = "http://localhost:5000/customer")
public interface CustomerApi {

	@PostMapping
	public Customer signup(@RequestBody Customer customer);
	
	@GetMapping
	public List<Customer> read();
	
	@PostMapping("/login")
	public Customer validateLogin(@RequestBody AuthRequest authRequest);
	
	@PutMapping
	public Customer update(@RequestBody Customer customer);
	
	@DeleteMapping("/{email}")	
	public Customer delete(@PathVariable("email")String email);
}

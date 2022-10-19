package com.empower.ecom;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.ecom.model.Customer;

@FeignClient(name = "CustomerApi",url = "http://localhost:8081/customer")
public interface CustomerApi {

	@GetMapping
	List<Customer> retrieveAllCustomers();

	@GetMapping("/{id}")
	Customer findCustomerById(@PathVariable("id") Integer id);

	@PostMapping
	Customer addCustomer(@RequestBody Customer customer);

	@PutMapping
	Customer updateCustomer(@RequestBody Customer customer);

	@DeleteMapping("/{id}")
	Customer removeCustomer(@PathVariable("id") Integer id);

}
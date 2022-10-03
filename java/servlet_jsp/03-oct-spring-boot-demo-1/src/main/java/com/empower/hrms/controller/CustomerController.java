package com.empower.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.empower.hrms.model.Customer;
import com.empower.hrms.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	

	@RequestMapping("/customer")
	public String customer(ModelMap model)
	{
		List<Customer> customers = cs.read();
		model.addAttribute("customers", customers);
		return "customer";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	public void addCustomer(Customer customer) {
		cs.create(customer);
	}
	public void getAllCustomers() {}
	public void findCustomerById() {}
	public void updateCustomer() {}
	public void deleteCustomer() {}
	
}

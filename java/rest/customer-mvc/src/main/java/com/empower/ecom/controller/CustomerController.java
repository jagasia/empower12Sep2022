package com.empower.ecom.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empower.ecom.CustomerApi;
import com.empower.ecom.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	private CustomerApi ca;
	
	@GetMapping("/")
	public ModelAndView home()
	{
		List<Customer> customers = ca.retrieveAllCustomers();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("customer");
		mv.addObject("customers", customers);
		mv.addObject("customer", new Customer());
		return mv;
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.POST, params = "add")
	public ModelAndView addCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult br)
	{
		if(br.hasErrors())
		{
			//go back
			System.out.println("There are errors");
			List<Customer> customers = ca.retrieveAllCustomers();
			ModelAndView mv=new ModelAndView();
			mv.setViewName("customer");
			mv.addObject("customers", customers);
			mv.addObject("customer", customer);
			return mv;
		}else
		{
			ca.addCustomer(customer);
		}
		return home();
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.POST, params = "update")
	public ModelAndView modifyCustomer(@ModelAttribute("customer") Customer customer)
	{
		ca.updateCustomer(customer);
		return home();
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.POST, params = "delete")
	public ModelAndView removeCustomer(@ModelAttribute("customer") Customer customer)
	{
		ca.removeCustomer(customer.getId());
		return home();
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id")Integer id)
	{
		Customer customer = ca.findCustomerById(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("customer");
		mv.addObject("customer", customer);
		mv.addObject("customers",ca.retrieveAllCustomers());
		return mv;
	}
}

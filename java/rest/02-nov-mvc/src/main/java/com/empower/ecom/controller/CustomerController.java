package com.empower.ecom.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empower.ecom.api.CustomerApi;
import com.empower.ecom.entity.Customer;
import com.empower.ecom.helper.AuthRequest;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerApi capi;
	
	@GetMapping
	public String showSignupPage()
	{
		return "customer-login";
	}
	
	@PostMapping("/signup")
	@ResponseBody
	public String signup(Customer customer)
	{
		capi.signup(customer);
		return "signup is done. check";
	}
	
	@PostMapping("/login")
//	@ResponseBody
	public String login(AuthRequest authRequest, HttpSession session)
	{
		String status="Login Failed.";
		Customer customer = capi.validateLogin(authRequest);
		if(customer!=null)
		{
			session.setAttribute("customer", customer);
			status="Login successful. You are "+customer.getName();
		}
		return "index";
	}
}

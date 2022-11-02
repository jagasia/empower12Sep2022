package com.empower.ecom.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empower.ecom.api.MerchantApi;
import com.empower.ecom.entity.Merchant;
import com.empower.ecom.helper.AuthRequest;

@Controller
@RequestMapping("/merchant")
public class MerchantController {
	@Autowired
	private MerchantApi mapi;
	
	@GetMapping
	public String showSignupPage()
	{
		return "merchant-login";
	}
	
	@PostMapping("/signup")
	@ResponseBody
	public String signup(Merchant merchant)
	{
		mapi.signup(merchant);
		return "signup is done. check";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String login(AuthRequest authRequest, HttpSession session)
	{
		String status="Login Failed.";
		Merchant merchant = mapi.validateLogin(authRequest);
		if(merchant!=null)
		{
			session.setAttribute("merchant", merchant);
			status="Login successful. You are "+merchant.getName();
		}
		return "index";
	}
}

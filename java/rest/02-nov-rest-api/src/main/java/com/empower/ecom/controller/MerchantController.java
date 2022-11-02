package com.empower.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.ecom.entity.Merchant;
import com.empower.ecom.helper.AuthRequest;
import com.empower.ecom.service.MerchantService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	@Autowired
	private MerchantService ms;
	
	@PostMapping
	public Merchant signup(@RequestBody Merchant merchant) {
		return ms.create(merchant);
	}
	
	@GetMapping
	public List<Merchant> read() {
		return ms.read();
	}
	
	@PostMapping("/login")
	public Merchant validateLogin(@RequestBody AuthRequest authRequest) {
		Merchant merchant = ms.read(authRequest.getEmail());
		
		if(merchant!=null && merchant.getPassword().equals(authRequest.getPassword()))
		{			
			return merchant;
		}
		return null;
	}
	
	@PutMapping
	public Merchant update(@RequestBody Merchant merchant) {
		return ms.update(merchant);
	}
	
	@DeleteMapping("/{email}")	
	public Merchant delete(@PathVariable("email")String email) {
		return ms.delete(email);
	}
	
}

package com.empower.ecom.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.ecom.entity.Merchant;
import com.empower.ecom.helper.AuthRequest;

@FeignClient(value = "merchant-api",url = "http://localhost:5000/merchant")
public interface MerchantApi {

	@PostMapping
	public Merchant signup(@RequestBody Merchant merchant);
	
	@GetMapping
	public List<Merchant> read();
	
	@PostMapping("/login")
	public Merchant validateLogin(@RequestBody AuthRequest authRequest);
	
	@PutMapping
	public Merchant update(@RequestBody Merchant merchant);
	
	@DeleteMapping("/{email}")	
	public Merchant delete(@PathVariable("email")String email);
}

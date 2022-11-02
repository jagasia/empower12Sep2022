package com.empower.ecom.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.ecom.entity.Sale;

@FeignClient(value = "sale-api",url = "http://localhost:5000/sale")
public interface SaleApi {
	@PostMapping
	public Sale placeOrder(@RequestBody Sale sale);
	@GetMapping
	public List<Sale> getAllSales();
	@GetMapping("/{id}")
	public Sale findSaleById(@PathVariable("id") Integer id);
	
	@GetMapping("/customer/{email}")
	public List<Sale> findSalesByCustomerEmail(@PathVariable("email") String email);
	
	@GetMapping("/merchant/{email}")
	public List<Sale> findSalesByMerchantEmail(@PathVariable("email") String email);
	
	@GetMapping("/product/{id}")
	public List<Sale> findSalesByProductId(@PathVariable("Id") Integer id);
	
	@PutMapping
	public Sale updateSale(@RequestBody Sale sale);
	
	@DeleteMapping("{id}")
	public Sale create(@PathVariable("id") Integer id);
}

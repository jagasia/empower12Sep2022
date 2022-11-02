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

import com.empower.ecom.entity.Sale;
import com.empower.ecom.service.SaleService;

@RestController
@RequestMapping("sale")
public class SaleController {
	@Autowired
	private SaleService ss;
	
	@PostMapping
	public Sale placeOrder(@RequestBody Sale sale) {
		return ss.create(sale);
	}
	@GetMapping
	public List<Sale> getAllSales() {
		return ss.read();
	}
	@GetMapping("/{id}")
	public Sale findSaleById(@PathVariable("id") Integer id) {
		return ss.read(id);
	}
	
	@GetMapping("/customer/{email}")
	public List<Sale> findSalesByCustomerEmail(@PathVariable("email") String email)
	{
		return ss.findSalesByCustomerEmail(email);
	}
	
	@GetMapping("/merchant/{email}")
	public List<Sale> findSalesByMerchantEmail(@PathVariable("email") String email)
	{
		return ss.findSalesByMerchantEmail(email);
	}
	
	@GetMapping("/product/{id}")
	public List<Sale> findSalesByProductId(@PathVariable("Id") Integer id)
	{
		return null;
	}
	@PutMapping
	public Sale updateSale(@RequestBody Sale sale) {
		return ss.update(sale);
	}
	
	@DeleteMapping("{id}")
	public Sale create(@PathVariable("id") Integer id) {
		return ss.delete(id);
	}
	
}

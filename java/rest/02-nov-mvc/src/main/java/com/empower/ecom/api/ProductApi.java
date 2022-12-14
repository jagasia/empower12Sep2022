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
import com.empower.ecom.entity.Product;

@FeignClient(value = "product-api",url = "http://localhost:5000/product")
public interface ProductApi {
	@PostMapping
	public Product addProduct(@RequestBody Product product);
	
	@GetMapping
	public List<Product> getAllProducts();
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id") Integer id);
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product);
	
	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable("id") Integer id);
	
	@PostMapping("/merchant")
	public List<Product> findProductsByMerchant(@RequestBody Merchant merchant);
}

package com.empower.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.ecom.entity.Product;
import com.empower.ecom.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product create(Product product) {
		return pr.save(product);
	}
	public List<Product> read() {
		return pr.findAll();
	}
	public Product read(Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product product=null;
		if(temp.isPresent())
		{
			product=temp.get();
		}
		return product;
	}
	public Product update(Product product) {
		Optional<Product> temp = pr.findById(product.getId());
		if(temp.isPresent())
		{
			pr.save(product);
			return product;
		}else
			return null;
	}
	public Product delete(Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product product=null;
		if(temp.isPresent())
		{
			product=temp.get();
			pr.delete(product);
		}
		return product;
	}
	
}

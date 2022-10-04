package com.empower.ecom.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		}else
			product=null;
		return product;
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

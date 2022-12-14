package com.empower.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.ecom.entity.Merchant;
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
		Product c=null;
		if(temp.isPresent())
		{
			c=product;
			pr.save(product);
		}
		return c;
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

	public List<Product> findProductsByMerchant(Merchant merchant)
	{
		return pr.findByMerchant(merchant);
	}
	
}

package com.empower.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.ecom.entity.Sale;
import com.empower.ecom.repository.SaleRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository sr;
	
	public Sale create(Sale sale) {
		return sr.save(sale);
	}
	
	public List<Sale> read() {
		return sr.findAll();
	}
	public Sale read(Integer id) {
		Optional<Sale> temp = sr.findById(id);
		Sale sale=null;
		if(temp.isPresent())
		{
			sale=temp.get();
		}
		return sale;
	}
	public Sale update(Sale sale) {
		Optional<Sale> temp = sr.findById(sale.getId());
		Sale c=null;
		if(temp.isPresent())
		{
			c=sale;
			sr.save(sale);
		}
		return c;
	}
	public Sale delete(Integer id) {
		Optional<Sale> temp = sr.findById(id);
		Sale sale=null;
		if(temp.isPresent())
		{
			sale=temp.get();
			sr.delete(sale);
		}
		return sale;
	}
	
	public List<Sale> findSalesByCustomerEmail(String email)
	{
		return sr.findSalesByCustomerEmail(email);
	}
	
	public List<Sale> findSalesByMerchantEmail(String email)
	{
		return sr.findSalesByMerchantEmail(email);
	}
	
}

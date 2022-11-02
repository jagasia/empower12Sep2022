package com.empower.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.ecom.entity.Merchant;
import com.empower.ecom.repository.MerchantRepository;

@Service
public class MerchantService {
	@Autowired
	private MerchantRepository mr;
	
	public Merchant create(Merchant merchant) {
		return mr.save(merchant);
	}
	
	public List<Merchant> read() {
		return mr.findAll();
	}
	public Merchant read(String email) {
		Optional<Merchant> temp = mr.findById(email);
		Merchant merchant=null;
		if(temp.isPresent())
		{
			merchant=temp.get();
		}
		return merchant;
	}
	public Merchant update(Merchant merchant) {
		Optional<Merchant> temp = mr.findById(merchant.getEmail());
		Merchant c=null;
		if(temp.isPresent())
		{
			c=merchant;
			mr.save(merchant);
		}
		return c;
	}
	public Merchant delete(String email) {
		Optional<Merchant> temp = mr.findById(email);
		Merchant merchant=null;
		if(temp.isPresent())
		{
			merchant=temp.get();
			mr.delete(merchant);
		}
		return merchant;
	}

	
}

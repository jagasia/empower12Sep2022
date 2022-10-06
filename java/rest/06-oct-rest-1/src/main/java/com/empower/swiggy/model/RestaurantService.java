package com.empower.swiggy.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository rr;
	
	public Restaurant create(Restaurant restaurant) {
		return rr.save(restaurant);
	}
	public List<Restaurant> read() {
		return rr.findAll();
	}
	public Restaurant read(Integer id) {
		Optional<Restaurant> temp = rr.findById(id);
		Restaurant restaurant=null;
		if(temp.isPresent())
			restaurant=temp.get();
		return restaurant;
	}
	public Restaurant update(Restaurant restaurant) {
		Optional<Restaurant> temp = rr.findById(restaurant.getId());
		if(temp.isPresent())
		{
			rr.save(restaurant);
			return restaurant;
		}
		else
			return null;
	}
	public Restaurant delete(Integer id) {
		Optional<Restaurant> temp = rr.findById(id);
		Restaurant restaurant=null;
		if(temp.isPresent())
		{
			restaurant=temp.get();
			rr.delete(restaurant);
		}
		return restaurant;
	}
	
}

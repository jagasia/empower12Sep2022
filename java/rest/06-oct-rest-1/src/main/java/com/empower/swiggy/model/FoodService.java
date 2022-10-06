package com.empower.swiggy.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	@Autowired
	private FoodRepository fr;
	
	public Food create(Food food) {
		return fr.save(food);
	}
	public List<Food> read() {
		return fr.findAll();
	}
	public Food read(Integer id) {
		Optional<Food> temp = fr.findById(id);
		Food food=null;
		if(temp.isPresent())
			food=temp.get();
		return food;
	}
	public Food update(Food food) {
		Optional<Food> temp = fr.findById(food.getId());
		Food f=null;
		if(temp.isPresent())
		{
			fr.save(food);
			f=food;			
		}
		return f;
	}
	public Food delete(Integer id) {
		Optional<Food> temp = fr.findById(id);
		Food food=null;
		if(temp.isPresent())
		{
			food=temp.get();
			fr.delete(food);
		}
		return food;
	}

	public List<Food> findFoodsByCategory(String category)
	{
		return fr.findByCategory(category);		
	}
	
	public List<Food> findFoodByPrice(Double price)
	{
		return fr.findFoodByPrice(price);
	}
}

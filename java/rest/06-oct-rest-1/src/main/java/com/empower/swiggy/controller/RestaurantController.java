package com.empower.swiggy.controller;

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

import com.empower.swiggy.model.Restaurant;
import com.empower.swiggy.model.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantService rs;
	
	@GetMapping
	public List<Restaurant> getAllRestaurants() {
		return rs.read();
	}
	
	@GetMapping("/{id}")
	public Restaurant findRestaurantById(@PathVariable("id") Integer id) {
		return rs.read(id);
	}
	
	@PostMapping
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return rs.create(restaurant);
	}
	
	@PutMapping
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
		return rs.update(restaurant);
	}
	
	@DeleteMapping("/{id}")
	public Restaurant deleteRestaurant(@PathVariable("id") Integer id) {
		return rs.delete(id);
	}
	
}

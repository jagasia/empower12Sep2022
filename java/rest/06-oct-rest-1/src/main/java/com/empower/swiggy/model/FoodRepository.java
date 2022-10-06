package com.empower.swiggy.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>
{
	List<Food> findByCategory(String category);
	
	@Query("from Food f where f.price<:price")
	List<Food> findFoodByPrice(@Param("price")Double price);
	
}

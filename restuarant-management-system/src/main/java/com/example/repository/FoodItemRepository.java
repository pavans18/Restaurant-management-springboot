package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.entity.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

	@Query(value = "select max(ITEMNUMBER) from FOOD_ITEMS", nativeQuery = true)
	public Integer findMaxItemNumber();

}

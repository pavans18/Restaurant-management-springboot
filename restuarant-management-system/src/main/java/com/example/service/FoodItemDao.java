package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.entity.FoodItem;

@Repository
public interface FoodItemDao {
	
	public List<FoodItem> showAllItems();
	
	public void saveItem(FoodItem foodItem);
	
	public Optional<FoodItem> findItem(Integer itemNumber);
	
	public void deleteItemByID(Integer itemNumber);
	
	public void editItem(FoodItem foodItem);
	
	public FoodItem getFoodItem(Integer itemNumber);

	public Integer getNumber();


}

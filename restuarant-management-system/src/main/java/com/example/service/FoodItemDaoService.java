package com.example.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.entity.FoodItem;
import com.example.repository.FoodItemRepository;

@Service
public class FoodItemDaoService {
	
	@Autowired
	private FoodItemRepository foodrepo;
	
	public List<FoodItem> showAllItems(){
		return foodrepo.findAll();
	}
	
	public void saveItem(FoodItem foodItem) {
		foodrepo.save(foodItem);
	}
	
	public Optional<FoodItem> findItem(int itemNumber) {
		
		return foodrepo.findById(itemNumber);
	}
	
	public void deleteItem(int itemNumber) {
		foodrepo.deleteById(itemNumber);
	}
	
	public void editItem(FoodItem foodItem) {
		
		foodrepo.save(foodItem);
	}
	
	public Optional<FoodItem> getFoodItem(int itemNumber) {
		return foodrepo.findById(itemNumber);

	}
	

	
	
	
}

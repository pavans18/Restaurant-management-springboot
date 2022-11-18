package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.entity.FoodItem;
import com.example.repository.FoodItemRepository;

@Repository
@Service
public class FoodItemDaoImpl implements FoodItemDao{

	@Autowired
	private FoodItemRepository foodrepo;

	@Override
	public List<FoodItem> showAllItems() {
		return foodrepo.findAll();
	}

	@Override
	public void saveItem(FoodItem foodItem) {

		foodrepo.save(foodItem);
	}

	@Override
	public Optional<FoodItem> findItem(Integer itemNumber) {

		return foodrepo.findById(itemNumber);
	}

	@Override
	public void deleteItemByID(Integer itemNumber) {
		foodrepo.deleteById(itemNumber);	
	}

	@Override
	public void editItem(FoodItem foodItem) {

		foodrepo.save(foodItem);

	}


	@Override
	public FoodItem getFoodItem(Integer itemNumber) {
		return foodrepo.findById(itemNumber).get();

	}

	@Override
	public Integer getNumber() {
		return foodrepo.findMaxItemNumber();
	}

}

package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, String> {

}

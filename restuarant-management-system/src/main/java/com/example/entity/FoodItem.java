package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FOOD_ITEMS")
public class FoodItem {

	@Id
	@Column(name ="ITEMNUMBER")
	private Integer itemNumber;
	private String itemName;
	private String cuisine;
	private Double price;
	private String availability;


}

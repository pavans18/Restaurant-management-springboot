package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "FOOD_ITEMS")
public class FoodItem {

	@Id
	@Column(name ="ITEMNUMBER")
	private Integer itemNumber;
	
	@NotEmpty(message = "item name is required")
	private String itemName;
	
	@NotEmpty(message = "cuisine is required")
	private String cuisine;
	
	@NotNull(message = "price is required")
	private Double price;
	
	@NotEmpty(message = "item availability is required")
	private String availability;
	
}

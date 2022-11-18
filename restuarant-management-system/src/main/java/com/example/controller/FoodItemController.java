package com.example.controller;



import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.FoodItem;
import com.example.service.FoodItemDaoImpl;


@RestController
public class FoodItemController {
	
	
	
	@Autowired
	FoodItemDaoImpl foodImpl;
	
	@GetMapping("/homePage")
	public ModelAndView gethomePage(Model model) {
		ModelAndView mv=new ModelAndView("homePage");
		mv.addObject("fooditems", foodImpl.showAllItems());
		return mv;
	}
	
	
	@GetMapping("/create")
	public ModelAndView addItem(Model model) {

		ModelAndView mv = new ModelAndView("insertItemPage");

		mv.addObject("fooditems", new FoodItem());

		return mv;

	}
	
	@PostMapping("/insert")
	public ModelAndView insertItem(@ModelAttribute("fooditems") FoodItem foodItem) {
		ModelAndView mv = new ModelAndView("redirect:/homePage");
		foodImpl.saveItem(foodItem);
		return mv;
	}
	
	
	@GetMapping("/insertItemPage")
	public ModelAndView createItem(Model model) {
		ModelAndView mv = new ModelAndView("insertItemPage");
		mv.addObject("fooditems", new FoodItem());
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteItemFood(@RequestParam int itemNumber) {
	ModelAndView mv = new ModelAndView("redirect/:homepage");
	foodImpl.deleteItemByID(itemNumber);
    return mv;    
	}
	
	
	
	
	
	@GetMapping("/editItem")
	public ModelAndView updateItem(Model model) {
		
		
		ModelAndView mv = new ModelAndView("editItemPage");

		mv.addObject("fooditems", new FoodItem());
		return mv;

	}
	
	
	
	
	
	@PostMapping("/edit")
	public ModelAndView editItem(@ModelAttribute("fooditems") FoodItem foodItem) {
		ModelAndView mv = new ModelAndView("redirect:/homePage");
		foodImpl.saveItem(foodItem);
		return mv;
	}
	
	
	
	/*
	@GetMapping("/delete")
	public ModelAndView deleteItem(Model model) {
		ModelAndView mv = new ModelAndView("homePage");
		mv.addObject("fooditems", foodItemDaoImpl.deleteItemByID(null)
		return mv;
	}
	*/
	/*
	@GetMapping("/delete/{itemNumber}")
	public String deleteItem(@PathVariable int itemNumber) {
		foodImpl.deleteItemByID(itemNumber);
		return "redirect:/homePage";
	}
	
	
/*
	
	@GetMapping("/edit/{itemNumber}")
	public ModelAndView editItem() {
		ModelAndView mv = new ModelAndView("editItemPage");
		
	}
	*/
	
	/*
	@GetMapping("/delete/{itemNumber")
	public ModelAndView deleteItem() {
		foodItemDaoImpl.deleteItem(itemNumber);
		
	}
	*/
	
	/*
	@PostMapping("/edit/{itemNumber}")
	public String updateItem(@PathVariable String itemNumber, @ModelAttribute("item") FoodItem foodItem, Model model) {
		FoodItem existingFoodItem = service.findItem(itemNumber);
		
		existingFoodItem.setItemName(foodItem.getItemName());
		existingFoodItem.setCuisine(foodItem.getCuisine());
		existingFoodItem.setPrice(foodItem.getPrice());
		existingFoodItem.setAvailability(foodItem.getAvailability());
		
		service.saveItem(existingFoodItem);
		return "redirect:/homePage";
		
	}
	*/
	

}


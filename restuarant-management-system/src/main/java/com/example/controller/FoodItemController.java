package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.entity.FoodItem;
import com.example.service.FoodItemDaoImpl;

@RestController
public class FoodItemController {

	@Autowired
	FoodItemDaoImpl foodImpl;

	//Request from index.html

	@GetMapping("/homePage")
	public ModelAndView gethomePage(Model model) {
		ModelAndView mv=new ModelAndView("homePage");
		mv.addObject("fooditems", foodImpl.showAllItems());
		return mv;
	}

	//Request from homePage.jsp

	@GetMapping("/create")
	public ModelAndView addItem(@ModelAttribute("fooditems") FoodItem foodItem) {

		Integer id;

		ModelAndView mv = new ModelAndView("insertItemPage");

		if(foodImpl.getNumber() == null)
			id = 101;
		else
			id = foodImpl.getNumber()+1;

		mv.addObject("id", id);

		return mv;

	}

	// Request from insertpage.jsp

	@PostMapping("/insert")
	public ModelAndView insertItem(@Valid @ModelAttribute("fooditems") FoodItem foodItem) {
		ModelAndView mv = new ModelAndView("redirect:/homePage");
		foodImpl.saveItem(foodItem);
		return mv;
	}

	//request from homePage.jsp

	@GetMapping("/delete")
	public ModelAndView deleteItemFood(@RequestParam Integer itemNumber) {
		ModelAndView mv = new ModelAndView("redirect:/homePage");
		foodImpl.deleteItemByID(itemNumber);
		return mv;    
	}

	//request from homePage.jsp

	@GetMapping("/editItem")
	public ModelAndView updateItem(@RequestParam Integer itemNumber) {


		ModelAndView mv = new ModelAndView("editItemPage");

		mv.addObject("fooditems", foodImpl.getFoodItem(itemNumber));
		return mv;

	}

	//request from editPage.jsp

	@PostMapping("/edit")
	public ModelAndView editItem(@ModelAttribute("fooditems") FoodItem foodItem) {
		ModelAndView mv = new ModelAndView("redirect:/homePage");
		foodImpl.saveItem(foodItem);
		return mv;
	}


}


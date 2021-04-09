package com.spboot.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spboot.test.entity.FoodInfo;
import com.spboot.test.service.FoodInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FoodInfoController {

	@Autowired
	private FoodInfoService foodService;
	
	@PostMapping("/food-insert")
	public @ResponseBody Integer insertFood(@ModelAttribute FoodInfo food) {
		log.info("foodInfo=>{}",food);
		return foodService.insertFoodInfo(food);
	}
}
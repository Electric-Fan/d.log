package com.dlog.diary.meal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dlog.diary.common.types.MealType;
import com.dlog.diary.meal.dto.DailyMealResponse;
import com.dlog.diary.meal.dto.FoodsResponse;
import com.dlog.diary.meal.dto.GoveFoodResponse;
import com.dlog.diary.meal.dto.GoveFoodsResponse;
import com.dlog.diary.meal.dto.MealResponse;

@Component
public class MealMockDataService {

	public DailyMealResponse getDailyMealsMockData(String date) {
		DailyMealResponse dailyMeals = new DailyMealResponse();
		dailyMeals.setDate(date);
		dailyMeals.setTotalCalories(1200);
		List<MealResponse> meals = new ArrayList<>();
		MealResponse meal = new MealResponse();
		meal.setMealType(MealType.BREAKFAST);
		meal.setMealCalories(400);
		meal.setMealPhotoPath("");

		List<FoodsResponse> foods = new ArrayList<>();
		FoodsResponse food = new FoodsResponse();
		food.setFoodName("닭가슴살");
		food.setCalorie(100);
		food.setCarbs(30);
		food.setFat(20);
		food.setProtein(100);
		food.setAmount(150);
		food.setAmountUnit("g");
		foods.add(food);
		meal.setFoods(foods);
		meals.add(meal);

		meal = new MealResponse();
		meal.setMealType(MealType.LUNCH);
		meal.setMealCalories(400);
		meal.setMealPhotoPath("");
		foods = new ArrayList<>();
		food = new FoodsResponse();
		food.setFoodName("삼겹살");
		food.setCalorie(400);
		food.setCarbs(30);
		food.setFat(100);
		food.setProtein(100);
		food.setAmount(150);
		food.setAmountUnit("g");
		foods.add(food);
		meal.setFoods(foods);
		meals.add(meal);
		dailyMeals.setMeals(meals);

		meal = new MealResponse();
		meal.setMealType(MealType.DINNER);
		meal.setMealCalories(400);
		meal.setMealPhotoPath("");
		foods = new ArrayList<>();
		food = new FoodsResponse();
		food.setFoodName("방울 토마토");
		food.setCalorie(100);
		food.setCarbs(90);
		food.setFat(10);
		food.setProtein(0);
		food.setAmount(100);
		food.setAmountUnit("g");
		foods.add(food);
		food = new FoodsResponse();
		food.setFoodName("샐러리");
		food.setCalorie(100);
		food.setCarbs(90);
		food.setFat(5);
		food.setProtein(5);
		food.setAmount(90);
		food.setAmountUnit("g");
		foods.add(food);
		food = new FoodsResponse();
		food.setFoodName("단호박");
		food.setCalorie(100);
		food.setCarbs(85);
		food.setFat(15);
		food.setProtein(0);
		food.setAmount(110);
		food.setAmountUnit("g");
		foods.add(food);
		meal.setFoods(foods);
		meals.add(meal);
		dailyMeals.setMeals(meals);
		return dailyMeals;
	}

	public GoveFoodsResponse getFoods(String foodName, String pageNo, String numOfRows) {
		GoveFoodsResponse response = new GoveFoodsResponse();
		List<GoveFoodResponse> foods = new ArrayList<>();
		GoveFoodResponse food = new GoveFoodResponse();
		food.setCalorie("200");
		food.setCarbs("30.2");
		food.setFat("10.3");
		food.setName(foodName);
		food.setProtein("320.4");
		food.setServingSize("120g");
		foods.add(food);

		food = new GoveFoodResponse();
		food.setCalorie("210");
		food.setCarbs("33.2");
		food.setFat("15.3");
		food.setName(foodName);
		food.setProtein("300.7");
		food.setServingSize("450g");
		foods.add(food);
		response.setFoods(foods);
		response.setTotalCount(2);
		return response;
	}

}

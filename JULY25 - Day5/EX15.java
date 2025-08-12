package com.wipro.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class FoodItemTest {

    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Veg Noodles", "Veg", "Chinese", 120);
        FoodItem f2 = new FoodItem("Chicken Curry", "Non Veg", "Indian", 150);
        FoodItem f3 = new FoodItem("Spring Rolls", "Veg", "Chinese", 100);
        FoodItem f4 = new FoodItem("Pad Thai", "Veg", "Thai", 140);
        FoodItem f5 = new FoodItem("Fried Rice", "Veg", "Chinese", 130);

        List<FoodItem> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        foodList.add(f5);
        
        foodList.stream()
        .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
        .max(Comparator.comparingDouble(FoodItem::getPrice))
        .ifPresentOrElse(
            f -> System.out.println("Most expensive Chinese dish: " + f),
            () -> System.out.println("No Chinese food found.")
        );

        
        
//        List<FoodItem> chineseFood = foodList.stream()
//            .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
//            .collect(Collectors.toList());
//
//        System.out.println(chineseFood);
    }
}
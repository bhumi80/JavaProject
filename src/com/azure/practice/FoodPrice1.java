package com.azure.practice;

import java.util.HashMap;

public class FoodPrice1 {
    public static void main(String[] args) {
        HashMap<String, Integer> foodItem = new HashMap<>();
        foodItem.put("Pizza small", 10);
        foodItem.put("Pizza medium", 12);
        foodItem.put("Pizza large", 20);
        foodItem.put("Burger", 8);
        foodItem.put("Sandwich", 5);
        foodItem.put("Burger & Chips", 11);
        foodItem.put("Sandwitch & Crips", 8);
        System.out.println(foodItem);
        System.out.println("A Prize of mention item is"+" "+ foodItem.get("Burger"));
        System.out.println("A Prize of mention item is"+" "+ foodItem.get("Pizza large"));
    }
}

package com.azure.practice;

import java.util.HashMap;

public class FoodPrice {
    public static String foodItem(String Item) {
        HashMap<String, Integer> foodItem = new HashMap<>();
        foodItem.put("Pizza small", 10);
        foodItem.put("Pizza medium", 12);
        foodItem.put("Pizza large", 20);
        foodItem.put("Burger", 8);
        foodItem.put("Sandwich", 5);
        foodItem.put("Burger & Chips", 11);
        foodItem.put("Sandwitch & Crips", 8);
        System.out.println(foodItem);

        for (String i:foodItem.keySet()) {
            System.out.println(foodItem.get(i));

        }
        return Item;
    }

    public static void main(String[] args) {
        System.out.println(foodItem("Burger"));
        System.out.println(foodItem("Sandwich"));


    }
}

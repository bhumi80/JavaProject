package com.azure.collection;

import java.util.HashSet;

public class HashSetWithString {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Ahmedabad");
        cities.add("Baroda");
        cities.add("Surat");
        cities.add("Jamnagar");
        System.out.println("Cities in Gujarat State in India");
        System.out.println(cities);
        System.out.println();
        int a =  cities.size();
        System.out.println("Size of the arraylist cities is :"+" "+ a);
        System.out.println();
        cities.add("Rajkot");
        System.out.println(cities);
        System.out.println();
        System.out.println("Is Cities arraylist contains Jamnagar :"+ " "+ cities.contains("Jamnagar"));
    }
}

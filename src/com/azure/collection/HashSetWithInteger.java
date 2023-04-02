package com.azure.collection;

import java.util.HashSet;

public class HashSetWithInteger {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(234);
        numbers.add(45);
        numbers.add(67);
        numbers.add(234);
        numbers.add(44);
        numbers.add(100);
        System.out.println("Hashset contains:"+" "+ numbers);
        System.out.println("Hashset size is :"+" "+ numbers.size());
        System.out.println("Hashset is empty? :"+ " "+ (numbers.size() == 0));
        numbers.remove(45);
        System.out.println("Remove one element so new hashset contains:"+" "+ numbers);
        numbers.clone();
        System.out.println("Copy all elements in hashset:"+" "+ numbers);
        System.out.println();
        System.out.println("Print all numbers");
        System.out.println("-------------------");
        for (int i:numbers) {
            System.out.println(i);
        }
        numbers.clear();
        System.out.println("Remove all elements in hashset:"+" "+ numbers);

    }
}

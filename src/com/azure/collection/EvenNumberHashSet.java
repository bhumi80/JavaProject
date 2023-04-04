package com.azure.collection;

import java.util.HashSet;

public class EvenNumberHashSet {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(10);
        evenNumber.add(12);
        evenNumber.add(14);
        evenNumber.add(16);
        evenNumber.add(18);
        System.out.println("Print even numbers :"+" "+ evenNumber );
        HashSet<Integer> number = new HashSet<>();
        number.add(25);
        number.addAll(evenNumber);
        System.out.println("New HashSet :"+" "+ number);
        System.out.println("Size of new Hashset :"+" "+ number.size());
    }
}

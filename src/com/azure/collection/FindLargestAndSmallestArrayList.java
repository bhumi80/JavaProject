package com.azure.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindLargestAndSmallestArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(35);
        numbers.add(345);
        numbers.add(12);
        numbers.add(45);
        numbers.add(500);
        System.out.println(numbers);
        System.out.println();
        System.out.println("Size of the arraylist is"+ " "+numbers.size());
        System.out.println();
        System.out.println("Smallest number in arraylist is"+" "+'='+" "+ Collections.min(numbers));
        System.out.println("Largest number is arraylist is"+" "+'='+" " + Collections.max(numbers));

    }
}

package com.azure.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(56);
        myNumbers.add(12);
        myNumbers.add(10);
        myNumbers.add(24);
        myNumbers.add(45);
        myNumbers.add(56);
        myNumbers.add(4);
        Collections.sort(myNumbers);
        for (int i:myNumbers) {
            System.out.println(i);
        }
        System.out.println("Array size is :"+ " "+ myNumbers.size());
    }
}

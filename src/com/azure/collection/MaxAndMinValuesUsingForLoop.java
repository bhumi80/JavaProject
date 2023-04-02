package com.azure.collection;

import java.util.ArrayList;

public class MaxAndMinValuesUsingForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(44);
        values.add(67);
        values.add(89);
        values.add(356);
        values.add(600);
        values.add(-34);
        values.add(2);
        values.add(2345);
        values.add(-20);
        System.out.println(values);
        System.out.println();
        int min = values.get(0);
        int max = values.get(0);
        for(int i = 1;i<values.size();i ++){
            if (values.get(i)< min){
                min = values.get(i);
            }
            if (values.get(i)>max){
                max = values.get(i);
            }
        } 
        System.out.println("Minimum values in arraylist is"+" "+'='+ " "+ min);
        System.out.println("Maximum values in arraylist is"+" "+'='+ " "+ max);
    }
}

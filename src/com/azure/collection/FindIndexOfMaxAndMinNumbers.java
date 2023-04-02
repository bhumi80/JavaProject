package com.azure.collection;

import java.util.ArrayList;

public class FindIndexOfMaxAndMinNumbers {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(23.56);
        numbers.add(234.67);
        numbers.add(0.45);
        numbers.add(2.15);
        numbers.add(78.56);
        numbers.add(-27.60);
        System.out.println("Size of the arraylist is"+ " "+ numbers.size());
        System.out.println();
        double min = numbers.get(0);
        double max = numbers.get(0);
        int indexOfMin = 0;
        int indexOfMax = 0;
        for(int i = 0; i< numbers.size();i ++){
            if(numbers.get(i)< min){
                min = numbers.get(i);
                indexOfMin = i;
            }
            if (numbers.get(i)>max){
                max = numbers.get(i);
                indexOfMax = i;
            }
        }
        System.out.println("Minimum number of arraylist is"+" "+ min+" "+"and index of min number is"+" "+indexOfMin);
        System.out.println("Maximum number of arraylist is"+" "+ max+" "+"and index of min number is"+" "+indexOfMax);

    }
}

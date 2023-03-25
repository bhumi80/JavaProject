package com.azure.loop;

public class SumOfOneToFifty {
    public static void sumOfNumbers(){
        int sum = 0;
        for(int i = 1; i <= 50; i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("Sum of numbers 1 to 50");
        System.out.println("----------------------");
        sumOfNumbers();
    }
}


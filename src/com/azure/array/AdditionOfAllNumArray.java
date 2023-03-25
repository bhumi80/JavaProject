package com.azure.array;

public class AdditionOfAllNumArray {
    public static void main(String[] args) {
        int[] num = {445,700,660,800,34,56,80};
        int sum = 0;
        for (int x:num) {
            sum = sum + x;

        }
        System.out.println("Addition of the numbers is"+ " "+ sum);


        }
    }


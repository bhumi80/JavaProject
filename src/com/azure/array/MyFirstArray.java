package com.azure.array;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] arrPattern = {1, 22, 333, 4444, 55555, 666666, 7777777, 88888888};
        int myArrPatternLength = arrPattern.length;
        System.out.println("Array pattern length"+" "+"="+ myArrPatternLength);
        System.out.println("========================");
        System.out.println("My pattern");
        System.out.println("----------");

        for (int i = 0; i < myArrPatternLength; i++) {
            System.out.println(arrPattern[i]);
        }
        /// print in reverse
            for (int j = myArrPatternLength - 2; j>=0; j--){
                System.out.println(arrPattern[j]);
        }
    }
}



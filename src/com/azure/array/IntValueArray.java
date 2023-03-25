package com.azure.array;

public class IntValueArray {
    public static void main(String[] args) {
        int[] arr={32334,56,23,56,3,4,89,11,2,3,123,345,56,700};
        //index     0     1  2  3 4 5 6  7  8 9  10  11 12  13
        int myArrLength = arr.length;

        System.out.println("Print length of array");
        System.out.println(myArrLength);
        System.out.println("Print all values");

        for (int i =0; i<myArrLength;i ++){
            System.out.println(arr[i]);
        }

    }
}

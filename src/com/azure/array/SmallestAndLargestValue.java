package com.azure.array;

public class SmallestAndLargestValue {
    public static void main(String[] args) {
        int[] numersArr = {23,45,6,234,678,890,67,34,12,674,1009,50,24,230,721};
        int numArrLength = numersArr.length;
        System.out.println("Number array length is"+" "+numArrLength);
        int smallest = numersArr[0];
        int largest = numersArr[0];
        for (int i = 0; i<=numArrLength-1;i ++){
            if(numersArr[i] < smallest) smallest= numersArr[i];
            if(numersArr[i] > largest) largest = numersArr[i];
        }
        System.out.println("The smallest number is" +" "+ smallest);
        System.out.println("The Largest number is" +" "+ largest);
    }
}

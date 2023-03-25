package com.azure.array;

public class LargestNumber {
   static int max;
    public static void largeNumbers(int[] numbers){
         max = numbers[0];
        int largeNumLength = numbers.length;
      for (int i = 1; i<largeNumLength-1;i= i+2){
         if(i +1>largeNumLength){
          if(numbers[i]> max)max = numbers[i];
      }
          if (numbers[i] > numbers[i + 1]){
    if(numbers[i]> max)max = numbers[i];
      }
   }
    }

    public static void main(String[] args) {
        int[] numbers = {345,890,12,34,78,7890,453,567,123,780};
        largeNumbers(numbers);
        System.out.println("Print largest number of above array"+" "+ max);
    }
}

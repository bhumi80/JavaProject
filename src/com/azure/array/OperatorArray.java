package com.azure.array;

public class OperatorArray {
    public static void main(String[] args) {
        int[] num = {345,67,234,56,90,100};
        //index       0   1  2  3   4   5
        int numLength = num.length;
        System.out.println("Array num length is"+" "+ numLength);
        System.out.println();
        System.out.println("** Original array values **");
        System.out.println("============================");
        for(int i = 0; i < numLength; i++){
            System.out.println(num[i]);
        }
        System.out.println("Addition of the two array numbers");
        System.out.println("--------------------------");
        num[0] = num[1]+ num[2];
        System.out.println("Sum is"+" "+num[0]);
        System.out.println();
        System.out.println("substraction  of the two array numbers");
        System.out.println("---------------------------------------");
        num[1] = num[3]-num[2];
        System.out.println("Substraction is"+" "+num[1]);
        System.out.println();
        System.out.println("Multiplication of two array numbers");
        System.out.println("---------------------------------------");
        num[2] = num[3] * num[4];
        System.out.println("Multiplication is"+" "+num[2]);
        System.out.println();
        System.out.println("Division of two array numbers");
        System.out.println("-------------------------------");
        num[4] = num[5] / num [3];
        System.out.println("Division is"+" "+num[4]);
        System.out.println();
        System.out.println("** Reassign values of original array **");
        System.out.println("=======================================");
        for (int j = 0;j<numLength; j++){
            System.out.println(num[j]);
        }

    }
}

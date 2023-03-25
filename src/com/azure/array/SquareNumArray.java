package com.azure.array;

public class SquareNumArray {
    public static void main(String[] args) {
        int[] squNum = {22,55,70,100,20,40,56,12,13,14,15,167,678};
        int squNumLen= squNum.length;
        int SquareNum = squNum[0];
        String name= "my array of square numbers";
        System.out.println(name.toUpperCase());
        System.out.println("===========================");

        for (int i = 0; i<squNumLen; i ++){
            SquareNum = squNum[i] * squNum[i];
            System.out.println("Square of number"+" "+squNum[i]+" "+'='+" "+SquareNum);

        }

    }
}

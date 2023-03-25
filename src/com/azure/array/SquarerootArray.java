package com.azure.array;

public class SquarerootArray {
    public static void main(String[] args) {
        double[] squRoot = {44,33,66,789,356,234,123,890,67,98,76,54,32,21};
        double squareRoot = squRoot[0];
        int squRootLen = squRoot.length;
        String a = "square root of my array";
        System.out.println(a.toUpperCase());
        System.out.println("=======================");
        for (int i = 0;i< squRootLen;i ++){
            squareRoot = squRoot[i]/2;
            System.out.println("Square root of"+" "+squRoot[i]+" "+'='+" "+squareRoot);
        }
    }
}

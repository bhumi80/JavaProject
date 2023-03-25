package com.azure.loop;

public class AdditionOfTenDoWhile {
    public static void CountInTen(){
        int a = 10;
        do{
            System.out.println(a);
            a = a +10;
        }
        while (a<=100);
    }

    public static void main(String[] args) {
        System.out.println("Counting in 10s");
        System.out.println("---------------");
        CountInTen();
    }
}

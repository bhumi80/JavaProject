package com.azure.loop;

public class SquareOfNumbers {
    public static void squareNum (){
        for(int a = 1; a<=20; a++){
            int b = a * a;
            System.out.println("Square of number"+" "+ a+" "+"="+ " "+ b);
        }
    }

    public static void main(String[] args) {
        squareNum();
    }
}

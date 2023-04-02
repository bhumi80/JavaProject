package com.azure.exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try{
            int x = 50;
            int y = 0;
            int z = x/y;
            System.out.println("Division of two number is ="+ " "+ z);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception: Number not divided by zero");
        }

    }
}

package com.azure.exception;

public class IllegalStateExceptionDemo {
    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println("Addition of positive integer:" + " " + c);
    }

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = -5;
            if (x > 0 && y > 0) {
                IllegalStateExceptionDemo.addition(x, y);
            } else {
                throw new IllegalStateException("Either one or two numbers are not positive integer");
            }
        }
        catch (IllegalStateException e){
            System.out.println("Illegal state exception");
        }
    }
}

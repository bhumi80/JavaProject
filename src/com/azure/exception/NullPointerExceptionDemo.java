package com.azure.exception;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try{
            String x = null;
            System.out.println(x.charAt(0));
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }
    }
}

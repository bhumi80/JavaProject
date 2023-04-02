package com.azure.exception;

public class StringIndexOutOfBoundDemo {
    public static void main(String[] args) {
        try{
            String name = "Exception in Java";
            System.out.println(name.charAt(24));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index out of bounds exception");
        }
    }
}

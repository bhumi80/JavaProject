package com.azure.abstraction;

public abstract class vehicle {
    String vehicleName;
    int noOfTyre;
    public static void color(String name){
        System.out.println("It has"+" "+ name+" "+"color");
    }
    abstract void start();
}

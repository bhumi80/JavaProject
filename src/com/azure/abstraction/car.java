package com.azure.abstraction;

public class car extends vehicle {
   public void start(){
       noOfTyre = 4;
       vehicleName = "Car";
       System.out.println(vehicleName+" "+"have"+" "+noOfTyre+" "+"tyre.");
       System.out.println("car start with key");
   }
    public static void main(String[] args) {
        car car = new car();
        car.start();
        color("Red");
    }

}

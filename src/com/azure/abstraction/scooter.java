package com.azure.abstraction;

public class scooter extends vehicle {
    public void start(){
        noOfTyre = 2;
        vehicleName = "Scooter";
        System.out.println(vehicleName+" "+"have"+" "+noOfTyre+" "+"tyre.");
        System.out.println("scooter start with kick.");
    }

    public static void main(String[] args) {
        scooter scooter = new scooter();
        scooter.start();
        color("Black");
    }
}

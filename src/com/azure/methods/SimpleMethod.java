package com.azure.methods;

public class SimpleMethod {
    // Simple Method //
    public static void countryName(){
        String countryName = "United Kingdom";
        System.out.println(countryName);
    }
    public void watching(){
        String watching = "I am watching a movie.";
        System.out.println(watching);
    }

    public static void main(String[] args) {
        countryName();
        SimpleMethod myWatchObject = new SimpleMethod();
        myWatchObject.watching();

    }
}

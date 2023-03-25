package com.azure.practiceMethodNonstatic;

public class DefaultNonStaticMethod {
    //Default modifier with parameterised method//
    int calculation( int a, int b, int c){
        int d = ((a+b) * (b * c)/(a + b));
        System.out.println("Answer of the BODMAS = "+" "+ d);
        return d;
    }

    public static void main(String[] args) {
        DefaultNonStaticMethod myCalculationObject = new DefaultNonStaticMethod();
        myCalculationObject.calculation(50,60,80);
    }
}

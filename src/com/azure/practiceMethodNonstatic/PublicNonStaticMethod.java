package com.azure.practiceMethodNonstatic;

public class PublicNonStaticMethod {
    //public modifier with return method//
    public int addition(){
        int a = 56;
        int b = 70;
        int c  = (a + b);
        System.out.println("Addition ="+ " "+ c);
        return c;
    }

    public static void main(String[] args) {
        PublicNonStaticMethod myAddObject = new PublicNonStaticMethod();
        myAddObject.addition();
    }

}

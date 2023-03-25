package com.azure.StaticObject;

public class bacteria {
    //Static Object //
    // state //
    static float x = 3.5f;           // bacteria size 0.5-5.0 micrometers in length
    static String shape = "Spherical"; // five shapes of bacteria spherical is one of them
    static int types = 4;              // 4 types of bacteria
    static boolean c = true;           // bacteria can be hazardous
    // Behaviour//
    public static void harmful(){
        System.out.println("bacteria can cause disease in human");
    }
    public static void supporting(){
     System.out.println("bacteria supports many form of life, in both plant and animals");
 }
    public static void main(String[] args) {
        System.out.println("Bacteria size "  + x);
        System.out.println("One type of bacteria shape is " + shape);
        System.out.println("bacteria have " + types +" " + "different types");
        System.out.println("Bacteria can be hazardous " +  "=" + " " + c);
        harmful();
        supporting();
    }


}
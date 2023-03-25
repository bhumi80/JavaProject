package com.azure.modifierStatic;

public class PublicModifier {
    // Public Modifier //
    public static String name = "Bhumika Suthar";
    public static int age = 40;
    public static String status = "Married";  // Marital status

    public static void main(String[] args) {
        System.out.println("My name is"+" "+ name+'.');
        System.out.println("I am"+ " "+ age + " "+ "years old.");
        System.out.println("I am"+" "+ status+ '.');
        // Access Protected Modifier in Public //
        System.out.println("She worked"+" "+ProtectedModifier.work+"for"+" "+ProtectedModifier.years+" "+"years.");
    }
}

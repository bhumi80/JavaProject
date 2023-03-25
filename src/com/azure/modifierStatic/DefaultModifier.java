package com.azure.modifierStatic;

public class DefaultModifier {

    // default modifier with static //

    static String name = "Bhumika Suthar";  // person name
    static int age = 40;   // person age
    static float weight = 60f;
    static boolean workInHospital = true;

    public static void main(String[] args) {
        System.out.println("PERSONAL INFORMATION ");
        System.out.println("=====================");
        System.out.println("My name is " + " "+name+'.');
        System.out.println("I am " + " " +age + " "+ "years old.");
        System.out.println("My weight is" + " "+ weight);
        System.out.println("I am working in hospital" + " " + '='+ " " +workInHospital);

        // access status from PublicModifier via static //
        System.out.println("I am"+" "+PublicModifier.status+'.');
        // access work and years code from protected modifier//
        System.out.println('I'+ " "+ "worked in"+ " "+ProtectedModifier.work+" "+"for"+" "+ProtectedModifier.years+'.');
    }
}


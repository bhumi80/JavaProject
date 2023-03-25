package com.azure.firstJavaClass;

import com.azure.modifierNonStatic.PublicBankModifier;

public class Practise1 {
    public static void main(String[] args) {
        System.out.println("it was a fun today in class");
        System.out.println("i learned lots of new things");
        System.out.println(" i am very excited  to learn more stuff");
        System.out.println("see you all next week");
        PublicBankModifier myPublicObject = new PublicBankModifier();

        // Public bank modifier access in main pacakge class called Practise 1 //
        System.out.println(myPublicObject.personName);
        System.out.println(myPublicObject.address);
    }
}

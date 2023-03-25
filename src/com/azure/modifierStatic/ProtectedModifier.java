package com.azure.modifierStatic;

import com.azure.modifierNonStatic.PublicBankModifier;

public class ProtectedModifier {
    //Protected Modifier//
    protected static String work = "Healthcare sector";
    protected static int years = 15;

    public static void main(String[] args) {
        System.out.println(work);
        System.out.println(years);
        System.out.println(PublicModifier.name+ " "+ "work in"+" "+ work+ " "+"past"+" "+ years+'.');
        // nonstatic public bank modifier use in static protected modifier//
        PublicBankModifier myPublicObject = new PublicBankModifier();
        System.out.println("Address ="+" "+ myPublicObject.address);
    }
}

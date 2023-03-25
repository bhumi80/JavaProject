package com.azure.modifierNonStatic;

public class PublicBankModifier {
    public String personName = "Bhumika Suthar";
    public String address = "Wellback Road, Harrow,HA2 0BT";

    public static void main(String[] args) {
        PublicBankModifier myObject = new PublicBankModifier();
        System.out.println(myObject.personName);
        System.out.println(myObject.address);
    }
}

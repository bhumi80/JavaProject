package com.azure.modifierNonStatic;

public class DefaultBankModifier {
    // Default Modifier with non-static //
    String BankDetails = "State Bank Of India";      // bank name
    int accountBalance = 5000;
    public static void deposit(){
        System.out.println("I am depositing Rs 2000.");
    }
    public static void main(String[] args) {
        DefaultBankModifier myDefaultObject = new DefaultBankModifier();
        deposit();
        System.out.println("Bank name =" + " "+myDefaultObject.BankDetails);
        System.out.println("My account balance is"+" "+ myDefaultObject.accountBalance);
        // Protected variable access in default//
       ProtectedBankModifier myObject = new ProtectedBankModifier();
        System.out.println("My final balance is"+" "+ myObject.balance);
    }
}

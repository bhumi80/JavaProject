package com.azure.modifierNonStatic;

import com.azure.modifierStatic.ProtectedModifier;

public class PrivateBankModifier {
    private int withdraw = 1000;
    private int accountBalance1 = 4000;
    public static boolean withdrawMoney = true;

    public static void main(String[] args) {
        PrivateBankModifier myPrivateObject = new PrivateBankModifier();
        System.out.println("I Withdrew Rs"+" "+ myPrivateObject.withdraw);
        System.out.println("My account balance is"+" "+ myPrivateObject.accountBalance1+'.');

        // protected modifier access in private//
        ProtectedBankModifier myProtectObject = new ProtectedBankModifier();
        System.out.println(myProtectObject.value1);
        System.out.println(myProtectObject.value2);
    }
}

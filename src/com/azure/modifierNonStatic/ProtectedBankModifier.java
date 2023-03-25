package com.azure.modifierNonStatic;

import com.azure.modifierStatic.ProtectedModifier;
import com.azure.modifierStatic.PublicModifier;
public class ProtectedBankModifier {
    // Protected Modifier //
    protected int value1 = 5000;    // deposit money value
    protected int value2 = 1000;    // withdraw money value
    protected int balance = (value1-value2);  // balance left at the end
    public static void main(String[] args) {
       ProtectedBankModifier myobject = new ProtectedBankModifier();
        System.out.println("Deposit money ="+ " "+myobject.value1);
        System.out.println("Withdraw money ="+" "+myobject.value2);
        System.out.println("Final balance ="+" "+myobject.balance);
        // static public modifier from package modifier static access in modifier non static package//
        System.out.println(PublicModifier.name);

    }
}

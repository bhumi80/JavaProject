package com.azure.TypeOfDataPrimitive;
// Reassign Float Value
public class ReassignFloatAndDoubleValue {
    public static void main(String[] args) {
        float shoppingBill;   // Grocery shopping bill initializing
        shoppingBill = 60.45f;  // value assigned for grocery shopping bill
        System.out.println(shoppingBill);
        shoppingBill = 78.05f;
        System.out.println(shoppingBill);

        double currencyInRupees; // currency in rupees initializing
        currencyInRupees = 100.25d; // assigned the value of rupees
        System.out.println(currencyInRupees);
        currencyInRupees = 99.67d; // reassigned the rupees value
        System.out.println(currencyInRupees);

    }
}

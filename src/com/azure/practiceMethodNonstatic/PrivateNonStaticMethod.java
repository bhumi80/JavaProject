package com.azure.practiceMethodNonstatic;

public class PrivateNonStaticMethod {
    //Private class in Default method//
    private String customerName = "Manoj Tiwari";
    private String BankName = "Bank of india";
    long accountNumber = 23456789045l;

    public static void main(String[] args) {
        PrivateNonStaticMethod myCustNumObject = new PrivateNonStaticMethod();
        PrivateNonStaticMethod myBankObj = new PrivateNonStaticMethod();
        PrivateNonStaticMethod myAccountObject = new PrivateNonStaticMethod();
        System.out.println(myCustNumObject.customerName +" "+ "is VIP customer.");
        System.out.println("He has account in"+" "+myCustNumObject.BankName+'.');
        System.out.println("His account number is"+" "+ myCustNumObject.accountNumber);
    }

}

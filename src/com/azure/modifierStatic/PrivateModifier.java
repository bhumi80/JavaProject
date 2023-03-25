package com.azure.modifierStatic;

public class PrivateModifier {
    // Private Modifier //
    private static String bankName = "Royal Bank of Scotland";   // bank details
    private static int number = 344567;   // account number

    public static void main(String[] args) {
        // access name from PublicModifier class //
        System.out.println(PublicModifier.name +" " + "open an account in "+" "+bankName+'.');
        System.out.println(PublicModifier.name +" "+ " bank account number is"+ " "+ number+'.');
        //Access Protected modifier via static.  //
        System.out.println(PublicModifier.name+" "+"worked in"+" "+ ProtectedModifier.work+'.');
        System.out.println("She worked in health care sector"+" "+"for"+" "+ProtectedModifier.years+" "+"years.");
    }

}

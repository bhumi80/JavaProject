package com.azure.TypeOfDataNonPrimitive;

public class NonPrimitiveString {
    public static void main(String[] args) {
        String myName = "My name is Bhumika.";
        System.out.println(myName);
        String myEducation = "I have degree in Bsc(Microbiology).";
        System.out.println(myEducation);
        String myWork = "I am working in hospital.";
        System.out.println(myWork);
        String myNativePlace = "I am from Anand known as milk city.";
        System.out.println(myNativePlace);
        String myChildren = "I have three kids one is 8 year old and twins 3 year old.";
        System.out.println(myChildren);
        System.out.println(myName.concat(myWork));
        System.out.println(myName.toUpperCase());
        System.out.println(myName.indexOf("m"));
        System.out.println(myName.contains("u"));
        String reverse = new StringBuffer(myName).reverse().toString();
        System.out.println(reverse);
    }
}

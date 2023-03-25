package com.azure.practiceMethodNonstatic;

public class ProtectedNonStaticMethod {
    // Protected modifier with parameterised method //
    protected int multiplication(int a, int b, int c){
       int multiplication = (a * b * c);
        System.out.println(multiplication);
        return multiplication;
    }
    protected String thaliName( String name1,String Name2,String Name3){
        String thaliName = (name1+" "+ Name2+" " + Name3);
        System.out.println(thaliName);
        return thaliName;
    }

    public static void main(String[] args) {
       ProtectedNonStaticMethod myMultiObject = new ProtectedNonStaticMethod();
       myMultiObject.multiplication(12,13,14);
        System.out.println("There are different cuisines in India.");
       ProtectedNonStaticMethod myThaliObject = new ProtectedNonStaticMethod();
        myThaliObject.thaliName("Punjabi Thali","Gujarati Thali","SouthIndian Thali");

    }
}

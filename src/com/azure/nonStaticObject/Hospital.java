package com.azure.nonStaticObject;

public class Hospital {
    // non static object //
    //state//
    String name = "The Lister Hospital";  // name of hospital
    String location= "Chelsea bridge road, SW1W 8RH";  // Address of the hospital
    int a = 60;         // patients number for blood test
    int b = 21095;      // no of babies delivered
    boolean babiesBorn = true;
    //behaviour//
    public void running(){
        System.out.println("Hospital running mainly IVF treatment procedure");
    }
    public void earning(){
    System.out.println("Hospital making more profit from IVF treatment.");
}
    public static void main(String[] args) {
        Hospital myHospital = new Hospital();
        System.out.println(myHospital.name);
        System.out.println(myHospital.location);
        System.out.println(myHospital.a);
        System.out.println(myHospital.b);
        System.out.println(myHospital.babiesBorn);
        myHospital.running();
        myHospital.earning();
    }
}

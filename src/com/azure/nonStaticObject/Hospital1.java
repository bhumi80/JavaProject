package com.azure.nonStaticObject;

public class Hospital1 {
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
        Hospital1 myHospital1Object = new Hospital1();
        System.out.println(myHospital1Object);
        String hospitalName = myHospital1Object.name;
        System.out.println(hospitalName);
        String hospitalLocation = myHospital1Object.location;
        System.out.println(hospitalLocation);
        int hospitalA = myHospital1Object.a;
        System.out.println(hospitalA);
        int hospitalB = myHospital1Object.b;
        System.out.println(hospitalB);
        boolean hospitalBabiesBorn = myHospital1Object.babiesBorn;
        System.out.println(hospitalBabiesBorn);

    }
}

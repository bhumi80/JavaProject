package com.azure.constructor;

public class PatientForSurgery {
    public static void surgeryInfo(){
        String b1 = "Patient admitted for surgery";
        String PatientBloodGroup = "B positive";
        System.out.println(b1);
        System.out.println("Patient blood group is"+" "+PatientBloodGroup);
    }
    public PatientForSurgery(){
        System.out.println("Patient is fasting from midnight");
    }

    public static void main(String[] args) {
        PatientInfo PatientInfo = new PatientInfo("Sayanthi Gosh",6543,5.8,60.5,8.30);
        //Constructor call from class PatientInfo
        PatientForSurgery PatientForSurgery = new PatientForSurgery();
        surgeryInfo();


    }
}

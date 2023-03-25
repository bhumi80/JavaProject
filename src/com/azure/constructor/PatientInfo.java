package com.azure.constructor;

public class PatientInfo {
    String patientName;
    int PatientId;
    double PatientHeight;
    double PatientWeight;
    double appointmentTime;
    public static void primaryPatientData(){
        String a1 = "Patient book for initial consultation";
        String a2 = "Pre consultation observations";
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();
    }
    public PatientInfo(String name,int Id,double height,double weight,double time){
        patientName = name;
        PatientId = Id;
        PatientHeight = height;
        PatientWeight = weight;
        appointmentTime = time;
        System.out.println("Patient name is"+" "+ name.toUpperCase());
        System.out.println("Patient hospital number is" +" "+ Id );
        System.out.println("Patient height is" +" "+ height);
        System.out.println("Patient weight is" +" "+ weight);
        System.out.println("Patient appoitment time is" +" "+ time);
        System.out.println();
        System.out.println("**********************************");
        System.out.println();
    }
    public static void main(String[] args){
        primaryPatientData();
        PatientInfo PatientInfo = new PatientInfo("Marlene Hunt",2345,5.6,54.6,14.00);
        PatientInfo PatientInfo1 = new PatientInfo("Meera Patel",56789,5.4,59.4,13.30);
        PatientInfo PatientInfo2 = new PatientInfo("Sandra Steven",25690,6.2,65,11.30);
    }
}

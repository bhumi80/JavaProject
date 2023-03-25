package com.azure.myPracticeModiAndMethod;

public class FirstSimpleMethod {
    public static void buyingInBulk (){
       String buyingInBulk = "Vikas buying lots of items in bulk";
       int itemNumbers = 10;
        System.out.println(buyingInBulk);
        System.out.println(itemNumbers);
    };
    public void  patientInfo(){
        String patientName = "Sunita Doshi";
        int patientWeight = 75;
        float patientBloodPressure = 125.5f;
        String patientBloodGroup = "B Negative";
        System.out.println("Day case surgery patient name is " + " " +patientName+'.');
        System.out.println("Her weight is"+" "+ patientWeight+'.');
        System.out.println("Her blood pressure is" +" "+ patientBloodPressure+'.');
        System.out.println("She have rare blood group which is "+" "+patientBloodGroup+'.');
    }


    public static void main(String[] args) {
        buyingInBulk();
        FirstSimpleMethod myPatientOblect = new FirstSimpleMethod();
        myPatientOblect.patientInfo();


    }
}

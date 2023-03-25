package com.azure.methods;

public class ReturnMethod {
    // Return Method //
    public static int payBill (){
        int waterBill = 160;
        int electricityBill = 250;
        int totalBill = (waterBill + electricityBill);
        return totalBill;
    }
    public String goingHolidays(){
        String placeName = "Sweden";  // holiday destination
        int days= 5;                  // staying for 5 days
        String goingHolidays =("I am going to"+" "+placeName +" "+ "for"+ " "+ days+" "+"days.");
        System.out.println(goingHolidays);
        return goingHolidays;
    }
    public static void main(String[] args) {
        System.out.println("I am paying my bills.");
        System.out.println("My total bill is =" + " "+ payBill());
        System.out.println("======================");
        ReturnMethod myHolidayObject= new ReturnMethod();
        System.out.println(myHolidayObject.goingHolidays());
    }
}

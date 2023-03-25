package com.azure.methods;

public class ParameterisedMethod {
    public static void depositData (String name1){
        System.out.println(name1);
    }
public static void amountData(int amount1){
    System.out.println(amount1);
}
         // non static
public void costingCarBills (int carServiceCost, int carRoadTax, int carFuelCost){
    System.out.println(carServiceCost + carRoadTax + carFuelCost);
}
    public static void main(String[] args) {
        String  name1 = "Chirag Patel";  //customer who depositing money their name
        System.out.println(name1+" "+"is first customer in bank to deposit money.");
        depositData(name1);
        int amount1 = 2000;
        System.out.println(name1 + " "+ "deposited"+ " "+'$'+amount1);
        System.out.println(name1 +" "+"car cost is below:-");
        System.out.println("*******************************");
        ParameterisedMethod myCostCarObject = new ParameterisedMethod();
        myCostCarObject.costingCarBills(50,20,40);

    }
}

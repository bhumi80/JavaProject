package com.azure.inheritance;

public class SingleClassB extends SingleClassA {
    int salary1 = 70000;
    int bonus = 10000;
    public void getSurgeonData(){
        String name1 = "Surgeon";
        System.out.println(name1+" "+"salary is"+" "+salary1);
        System.out.println(name1+" "+"gets bonus"+" "+bonus+" "+"as well");
    }
    public static void main(String[] args) {
        SingleClassB B = new SingleClassB();
        B.getData();
        B.getSurgeonData();
        System.out.println(B.a1);
    }
}

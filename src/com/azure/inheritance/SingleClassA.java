package com.azure.inheritance;

public class SingleClassA {
    int salary = 60000;
    String a1= "Doctor salary is less";
    public void getData(){
        String name = "Doctor";
        System.out.println(name +" "+"salary is"+" "+ salary);
    }
    public static void main(String[] args){
        SingleClassA A = new SingleClassA();
        A.getData();
    }

}

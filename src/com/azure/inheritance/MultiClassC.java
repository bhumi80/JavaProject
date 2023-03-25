package com.azure.inheritance;

public class MultiClassC {
    int a;
    int b;
    int c;
    public void addition(int a,int b){
        c = a+b;
        System.out.println("Addition of"+" "+ a+" "+"and"+" "+ b+" "+"="+" "+c);
    }

    public static void main(String[] args) {
        MultiClassC C = new MultiClassC();
        C.addition(35,67);
    }
}

package com.azure.inheritance;

public class MultiClassE extends MultiClassD {
    int m= 44;
    int n = 88;
    int l;
    public void multiplication(){
        l = m * n;
        System.out.println("Multiplication of number"+" "+m+" "+"and number"+" "+n+" "+'='+" "+ l);
    }

    public static void main(String[] args) {
        MultiClassE E = new MultiClassE();
        E.multiplication();
        E.addition(25,70);
        E.substraction();
    }
}

package com.azure.statements;

public class CheckMaxNumber {
    public static void checkMaxNumber(int a,int b, int c){
        //
        if (a!=b && b!=c && c!=a) {
            if (a > b && a > c) {
                System.out.println(a + " " + "is greater number");
            } else if (b > a && b > c) {
                System.out.println(b + " " + "is greater number");
            } else {
                System.out.println(c + " " + "is greater number");
            }
        }
        else {
                System.out.println("numbers are same");
            }
    }

    public static void main(String[] args) {
        checkMaxNumber(45,67,89);
        checkMaxNumber(30,30,50);
        checkMaxNumber(20,40,40);
        checkMaxNumber(50,60,50);
        checkMaxNumber(112,453,678);
    }
    }



package com.azure.loop;

public class OddEvenNumberWhile {
    public void oddNumber(){
        int x = 1 ;
        while (x<=50){
            System.out.println(x +" "+ "is odd number");
            x = x+2;
        }
    }
    public void evenNumber(){
        int a = 0;
        while (a<=50){
            System.out.println(a+" "+"is even numner");
            a = a+2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Odd Numbers");
        System.out.println("============");
        OddEvenNumberWhile myOddObject = new OddEvenNumberWhile();
        myOddObject.oddNumber();

        System.out.println("Even Numbers");
        System.out.println("=============");
        OddEvenNumberWhile myEvenObject = new OddEvenNumberWhile();
        myEvenObject.evenNumber();

    }
}

package com.azure.methods;

public class ClassMethod {
    public static int depositMoney ( int May,int  june, int july){
        int balance = (May + june + july);        // deposit money in three months
        return balance;
    }

    public static void main(String[] args) {
        System.out.println(depositMoney(200,400,600));
        System.out.println(depositMoney(60,45,90));

    }
}

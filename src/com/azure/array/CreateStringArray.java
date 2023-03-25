package com.azure.array;

public class CreateStringArray {
    public static void sentence(){
        String sen1 = "I would like to go to Switzerland";
        System.out.println(sen1);
        sen1 = sen1.replace("Switzerland","Finland");
        System.out.println(sen1);
    }


     public static void main(String[] args) {
        sentence();

    }
}

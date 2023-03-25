package com.azure.polymorphisam;

import java.sql.SQLOutput;

public class FormsOfWaterOverloading {
    public static void waterForm(String name){
        System.out.println("Solid form of water is ice.");
    }
    public static void waterForm(String name,String name1 ){
        System.out.println("Liquid form of water we use in drinking, washing etc.");
    }
    public static void waterForm(String name,String name1, String name2){
        System.out.println("Gas form of water is when you boil water and its turns to vapor.");
    }
    public static void main (String[] args){
        System.out.println("Water have three forms");
        waterForm("solid");
        waterForm("solid","liquid");
        waterForm("solid","liquid","gas");

    }
}

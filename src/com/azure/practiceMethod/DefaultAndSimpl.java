package com.azure.practiceMethod;

public class DefaultAndSimpl {
       static void  eating(){
        String cuisine = "Gujarati Thali";
        int foodItem = 15;
        String name = "Mukesh";
        String name1 = "supriya";
        String cuisine1 = "South Indian Thali";
        int foodItem1 = 10;

           System.out.println(name+" "+ "is eating"+" "+cuisine+'.');
           System.out.println(cuisine+" "+ "have"+" "+foodItem+" "+"food items"+'.');
           System.out.println(name1+" "+ "is eating"+" "+cuisine1+'.');
           System.out.println(cuisine1+" "+"have"+" "+foodItem1+" "+"food items"+'.');
             // protected and method class run in default//
           System.out.println(ProtectAndPara.multiplication(23,56,80));

    }

    public static void main(String[] args) {
        eating();
    }
}

package com.azure.practiceStatement;

public class SwitchResturantMenu {
    public static void main(String[] args) {
        String name = "Dawat Resturant";
        System.out.println(name);
        System.out.println("--------------");
        String typeOfFood = "Vegetarian";
        System.out.println("This resturant only served"+" "+ typeOfFood+'.');
        int Starter = 5;
        switch (Starter){
            case 1 :
                System.out.println("Customer ordered"+" "+"Samosa");
                break;
            case 2:
                System.out.println("Customer ordered"+" "+"Kachori");
                break;
            case 3:
                System.out.println("Customer ordered"+" "+"Khaman-Dholka");
                break;
            case 4:
                System.out.println("Customer ordered"+" "+"Dabeli");
                break;
            case 5:
                System.out.println("Customer ordered"+" "+"Vada Pav");
                break;
            case 6:
                System.out.println("Crispy Bhajia");
                break;
            default:
                System.out.println("Food served hot.");

        }
    }
}

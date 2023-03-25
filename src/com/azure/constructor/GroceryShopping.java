package com.azure.constructor;

public class GroceryShopping {
    public static int myShopping(){
        int money = 50;
        int shoppingCost = 45;
        int balance = (money - shoppingCost);
        System.out.println("I have £"+money+" "+"for shopping.");
        System.out.println("My shopping cost is £"+shoppingCost);
        System.out.println("I have £"+balance+" "+"left after shopping");
        return balance;
    }
    public  GroceryShopping(){
        String name = "My shopping list";
        String[] list = {"Rice","Wheat flour","Cooking oil","Vegetables","Moong dal"};
        System.out.println(name);
        System.out.println("===============");
        for(int i = 0;i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GroceryShopping G = new GroceryShopping();
        myShopping();
    }
}

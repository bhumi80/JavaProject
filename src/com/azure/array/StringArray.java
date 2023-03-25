package com.azure.array;

public class StringArray {
    public static void main(String[] args) {
        String[] restaurantMenu = {"Gujarati cuisine","South Indian cuisine","North Indian cuisine"};
        int myMenuLength= restaurantMenu.length;
        String[] gujaratiCuisine = {"Gujarati Thali","Khaman","Dhokla","Khadvi","Patra"};
        int gujCuisine = gujaratiCuisine.length;
        String[] southIndianCuisine = {"South Indian Thali","Masala Dosa","Idli","Uttapam","Rasam","Sambhar"};
        int southCuisine = southIndianCuisine.length;
        String[] northIndianCuisine = {"Punjabi Thali","Paneer Tikka","Malai Kofta","Paneer Lababdar","Chhole-Bhature","Nann"};
        int northCuisine = northIndianCuisine.length;
        System.out.println("Array restaurant menu length is"+" "+ myMenuLength);
        System.out.println("Restaurant Menu");
        System.out.println("================");
        for (String menu: restaurantMenu) {
            System.out.println(menu);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Gujarati cuisine array length is"+" "+gujCuisine);
        System.out.println("*** Gujarati Menu ***");
        System.out.println("--------------------");
        for (String order:gujaratiCuisine) {
            System.out.println(order);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("South Indian cuisine array length is"+" "+southCuisine);
        System.out.println("*** South Indian Menu ***");
        System.out.println("--------------------");
        for (String order:southIndianCuisine) {
            System.out.println(order);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("North Indian cuisine array length is"+ " "+northCuisine);
        System.out.println("*** North Indian Menu ***");
        System.out.println("--------------------");
        for (String order:northIndianCuisine) {
            System.out.println(order);
        }

    }

}

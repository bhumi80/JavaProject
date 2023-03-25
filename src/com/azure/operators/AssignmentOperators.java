package com.azure.operators;

public class AssignmentOperators {
    // Assignment Operators //
    public static void main(String[] args) {

        // equal to assignment operator //
        int waterBottlePrice;
        int juiceBottlePrice;
        waterBottlePrice = 10;
        juiceBottlePrice = 10;
        System.out.println(" Water bottle prize same as juice bottle" + " " + waterBottlePrice + "=" + juiceBottlePrice);

        // addition assignment operator //
        int jeansPrize = 25;
        int JeansPrizeIncrease = 10;

        System.out.println(" Jeans prize increase 25 to" +" " + (jeansPrize += JeansPrizeIncrease));

        // subtraction assignment operator //
        int dressValue = 45;
        int dressValueDecrease = 20;
        System.out.println( " dress value decrease 45 to " + " " + (dressValue -= dressValueDecrease));

        // multiplication assignment operator //
        int shoesValue = 30;
        int trainerValue1 = 5;
        System.out.println(" shoes value 5 time more than trainer value " + " "+ "=" + (shoesValue *= trainerValue1));

        // division assignment operator //
        int chocolates = 50;
        int chocolates1 = 10;
        System.out.println(" Children divided chocolates equally"+ " " + (chocolates /= chocolates1));

        // modulus assignment operator //
        int prize1 = 45;
        int prize2 = 25;
        System.out.println(" T-shirt prize " + "" + (prize1 %= prize2));


    }
}

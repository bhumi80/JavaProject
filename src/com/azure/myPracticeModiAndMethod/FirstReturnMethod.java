package com.azure.myPracticeModiAndMethod;

public class FirstReturnMethod {
public static int shoppingOnSale(){
    String name = "Varsha & Geeta went for shopping in sale.";
    int varshaSpend = 50;
    int geetaSpend = 70;
    int totalSpend = (varshaSpend + geetaSpend);
    System.out.println(name);
    System.out.println("They spend total"+" "+'£'+totalSpend+'.');
    return totalSpend;
}
public  int buyingMango(){
    String name = "Pinal going to buy mangoes from a shop.";
    int number = 12;  //number of mangoes he bought
    int pay = 18;
    int totalMoney = 50;
    int b = (totalMoney - pay);  //pinal have £50 and spend £18.50
    System.out.println(name);
    System.out.println("Pinal bought"+" "+number + " "+ "mangoes.");
    System.out.println("He has"+" "+'£'+totalMoney+" "+" in total and he pay"+" "+'£'+pay);
    System.out.println("Now Pinal have"+" "+'£'+b+" "+"left.");
    return b;

}

    public static void main(String[] args) {
        System.out.println(shoppingOnSale());
        FirstReturnMethod myBuyObject = new FirstReturnMethod();
        myBuyObject.buyingMango();
    }

}

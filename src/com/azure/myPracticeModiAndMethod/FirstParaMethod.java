package com.azure.myPracticeModiAndMethod;

public class FirstParaMethod {
    public static void solvingMaths(int x,int y, int z){
        System.out.println((x/y*z) + (y+z)-x); // (80/40 * 50  + (40+50=90)-80)
                                               // 100+10
    }
    public static void dividingChoclates(int a,int b, int c) {
        System.out.println (a/b);
        System.out.println(b/c);
    }
    public String travelingPlace(String name1, String name2, String name3){
        System.out.println("Ayan travelling to differnt places in India.");
       String travelingPlace = ("Ayan Traveling to "+" "+name1+','+" "+name2+','+" "+name3) ;
        System.out.println(travelingPlace);
        return travelingPlace;
    }
    public static void main(String[] args) {
        String name = "Lina doing maths BODMAS.";
        System.out.println(name);
        solvingMaths(80,40,50);
        String name1 = "Teacher dividing Choclates between three children.";
        System.out.println(name1);
        dividingChoclates(120,60,30);
        FirstParaMethod myTravelObject = new FirstParaMethod();
        myTravelObject.travelingPlace("Mathura","Liberty Statue", "Mount Abu");

    }



}

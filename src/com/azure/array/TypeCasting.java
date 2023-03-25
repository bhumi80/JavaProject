package com.azure.array;

public class TypeCasting {
    public static void wideningTypeCast(){
        int x = 2345;
        long y = x;
        System.out.println("Widening type casting");
        System.out.println();
        System.out.println("Print integer data type value is"+" "+ x);
        System.out.println("Print convert data from integer to long is"+" "+y);
    }
    public static void narrowingTypeCast(){
        double a = 56.78;
        int b = (int)a;
        System.out.println("Narrow type casting");
        System.out.println();
        System.out.println("The value in double is"+" "+a);
        System.out.println("The value in double is convert to inter datatype"+" "+ b);
    }
    public static void division(){
        int num1 = 800;
        int num2 = 960;
        double num3 = (double)num1/num2;
        System.out.println("Division of two numbers is converting in double ="+" "+num3);
    }
    public static void main(String[] args) {
        wideningTypeCast();
        System.out.println("_______________________________________________");
        System.out.println();
        narrowingTypeCast();
        System.out.println("_______________________________________________");
        System.out.println();
        division();
    }
}

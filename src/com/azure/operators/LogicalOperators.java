package com.azure.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical operators //
        // logical and //
        int y =50;
        int t = 60;
        boolean ans1 = y>t && t<90;  // y is less than t value not greater.
        System.out.println(ans1);

        int z = 20;
        int x = 30;
        boolean ans2 = z<x && x>z;
        System.out.println(ans2);  // z is less than x.

        //logical or //
        int a = 30;
        int e = 40;
        boolean ans3 = 30<40 || e>34;
        System.out.println(ans3);  // a is less than e.


        // Logical not //
        int c = 78;
        int f = 68;
        boolean ans4 = !(c<f && f>90);
        System.out.println(ans4);
    }
}

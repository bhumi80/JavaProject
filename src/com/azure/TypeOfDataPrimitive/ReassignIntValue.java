package com.azure.TypeOfDataPrimitive;
//Reassign value of integer
public class ReassignIntValue {
    public static void main(String[] args) {
        int a;   // declaration
        a = 20;  // assigning value
        System.out.println(a);
        a = 30;  //reassign value
        System.out.println(a);

        int x =20,y=30,z=40;
        System.out.println(x);
        int q = (x+y);
        int p = (y+z);
        int s = (p-q);
        System.out.println(q);
        System.out.println(p);
        System.out.println(s);
    }
}
package com.azure.practice;

public class Triangles {
    public static void main(String[] args) {
        //Equilateral = 3 sides same
        //isosceles = 2 sides same
        // scaeler = no sides same

        int a = 10;
        int b = 30;
        int c = 20;
        if (a ==b && b==c){
            System.out.println("The triangle is Equilateral");
        }
        else if(a ==b || b==c || a==c){
            System.out.println( "The triangle is isoceles");
        }
        else{
            System.out.println("the triangle is scaeler");
        }
    }

    }

package com.azure.dataTypesAndVariables;

public class StaticVariable {
    static String name1 = "Ajay";
    static String name2 = "Viren";
    static float height1 = 6.2f;
    static float height2 = 5.9f;
    static boolean height3 = (height1>height2);
    public static void talking () {
        System.out.println (name1 + "and" + name2+'.');
    }
    public static void swimming (){
        System.out.println( name1 + "is swimming"+'.');
    }
        public static void main(String[] args) {
            System.out.println("Those boys names are" +" " + name1 + " "+ "and" +" "+ name2+'.');
            System.out.println(name1+ " "+ "height is" + " " + height1+'.');
            System.out.println(name2+ " "+ "height is" + " " + height2+'.');
            System.out.println(name1 + " " + "height is more than " + " " + name2 + " " + '=' + " " +height3);
        }
    }

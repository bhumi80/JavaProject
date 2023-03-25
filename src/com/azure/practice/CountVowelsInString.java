package com.azure.practice;

public class CountVowelsInString {
    public static void main(String[] args) {
        String name = "bhumika patel";
       int nameLen = name.length();
        System.out.println(name.toUpperCase());
       System.out.println(name +" "+"string length"+'='+" "+nameLen);
        System.out.println();
        int count = 0;
        if(name.contains("a") ||name.contains("e") ||name.contains("i") ||name.contains("o") ||name.contains("u")) {
            System.out.println("A name" + " " + name + " " + "contains vowels.");
            System.out.println();
            }
        for (int i = 0; i <12; i++) {
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("String name contains"+" "+count+" "+"vowels");
    }
}

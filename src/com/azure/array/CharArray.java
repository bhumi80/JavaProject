package com.azure.array;

public class CharArray {
    public static void main(String[] args) {
        char[] symbol = {'£','*','$','%','!'};
        int symbolLength = symbol.length;
        System.out.println("Symbol length is "+" "+symbolLength);
        System.out.println("-------------------");
        System.out.println(symbol[0]+" "+symbol[1]+" "+symbol[2]+" "+symbol[3]+" "+symbol[4]);
        System.out.println();
        System.out.println("Print Star pattern");
        System.out.println("===================");
        for (int j = 1; j<symbolLength; j++){
            System.out.print(symbol[1]);
        }
        System.out.println();
        for (int k= 2; k<symbolLength;k++){
            System.out.print(symbol[1]);
        }
        System.out.println();
        for (int l = 3;l<symbolLength;l++){
            System.out.print(symbol[1]);
        }
        System.out.println();
        for (int m = 4;m<symbolLength; m++){
            System.out.println(symbol[1]);
        }

    }
}

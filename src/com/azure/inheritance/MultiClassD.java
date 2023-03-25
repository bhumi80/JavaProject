package com.azure.inheritance;

public class MultiClassD extends MultiClassC {
    public void substraction(){
        int x=1002;
        int y = 500;
        int z;
        z = x - y;
        System.out.println("Subtraction of number"+" "+x+" "+"and number"+" "+y+" "+'='+" "+ z);
    }

    public static void main(String[] args) {
        MultiClassD D = new MultiClassD();
        D.addition(300,489);
        D.substraction();

    }
}

package com.azure.practiceStatement;

public class LargeNumber {
    public void checkLargeNumber(){
        int a = 134;
        int b = 245;
        int c = 68;

        if (a>b && a>c){
            System.out.println(a + " "+ "is large number.");
        } else if (b>c && b>a) {
            System.out.println(b + " "+ "is large number.");
        }else {
            System.out.println(c + " "+ "is large number.");
        }
    }

    public static void main(String[] args) {
        LargeNumber myCheckLargeObject = new LargeNumber();
        myCheckLargeObject.checkLargeNumber();
    }
}

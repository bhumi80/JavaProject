package com.azure.exception;

import java.lang.reflect.Array;

public class ArrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        try {
            int[] a = {12, 34, 56, 78};
            a[5] = 7;
            for (int i = 0; i < a.length; i++) {
                System.out.println(a);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound");
        }
    }
}

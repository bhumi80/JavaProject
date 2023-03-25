package com.azure.constructor;

public class MyFirstConstructor {
    int studentId;
    String studentName;
    public void myClass(){
        System.out.println("My class name is Java class");
    }
    public MyFirstConstructor(){
        studentName = "Chirag Patel";
        studentId = 3456;
        System.out.println("Student name is"+" "+studentName +" "+"& student id is"+" "+studentId);
    }
    public static void main(String[]args){
        MyFirstConstructor MyFirstConstructor = new MyFirstConstructor();
        MyFirstConstructor.myClass();

    }

}

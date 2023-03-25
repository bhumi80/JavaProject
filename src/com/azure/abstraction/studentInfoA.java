package com.azure.abstraction;

public class studentInfoA implements studentInfoInterface{
    @Override
    public void data() {
        String studentName = "Disha Pandya";
        int rollNumber = 44;
        System.out.println("Student name is"+" "+studentName);
        System.out.println("Student rollnumber is"+" "+rollNumber);
    }


    public static void main(String[] args) {
        studentInfoA studentInfoA = new studentInfoA();
        studentInfoA.data();
    }
}

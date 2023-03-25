package com.azure.practiceStatement;

public class ResultCard {
    public static void displayResults() {

        String name = "Dhruvi Patel";   //student  name
        int maths = 95;                // student  maths score
        int science = 89;             // student  science score
        int english = 90;             // student english score
        int total1 = (maths + science + english);    // total score
        System.out.println("Student name ="+ " " + name);
        System.out.println("----------------------------");
        System.out.println(name + " " + "total score =" + " " + total1);
        if (maths >= 90) {
            System.out.println(name +" "+"maths grade ="+" "+'A');         // grade A
        } else if (maths >= 80) {
            System.out.println(name +" "+"maths grade ="+" "+'B');         // Grade B
        } else if (maths >= 70) {
            System.out.println(name +" "+"maths grade ="+" "+'C');        // Grade C
        } else if (maths >= 60) {
            System.out.println(name +" "+"maths grade ="+" "+'D');        // Grade D
        } else if (maths >= 35 && maths < 60) {
            System.out.println(name +" "+"maths grade ="+" "+'E');        //Grade E
        } else {
            System.out.println(name +" "+" is fail.");
        }
        if (science >= 90) {
            System.out.println(name +" "+"science grade ="+" "+'A');         // grade A
        } else if (science >= 80) {
            System.out.println(name +" "+"science grade ="+" "+'B');         // Grade B
        } else if (science >= 70) {
            System.out.println(name +" "+"science grade ="+" "+'C');        // Grade C
        } else if (science >= 60) {
            System.out.println(name +" "+"science grade ="+" "+'D');        // Grade D
        } else if (science >= 35 && maths < 60) {
            System.out.println(name +" "+"science grade ="+" "+'E');        //Grade E
        } else {
            System.out.println(name +" "+ "is fail.");
        }
        if (english >= 90) {
            System.out.println(name +" "+"science grade ="+" "+'A');         // grade A
        } else if (english >= 80) {
            System.out.println(name +" "+"science grade ="+" "+'B');         // Grade B
        } else if (english >= 70) {
            System.out.println(name +" "+"science grade ="+" "+'C');        // Grade C
        } else if (english >= 60) {
            System.out.println(name +" "+"science grade ="+" "+'D');        // Grade D
        } else if (english >= 35 && maths < 60) {
            System.out.println(name +" "+"science grade ="+" "+'E');        //Grade E
        } else {
            System.out.println(name=" "+" "+"is fail.");
        }

    }

    public static void main(String[] args) {
        System.out.println("STUDENT RESULT CARD");
        System.out.println("====================");
        displayResults();

    }
}


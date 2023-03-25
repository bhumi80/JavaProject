package com.azure.statements;

public class GradingSystem {
   public static void GradingInSchool(int marks) {

           if (marks >= 90) {
               System.out.println("Student pass with Distinction");
           } else if (marks >= 80) {
               System.out.println("Student pass with grade A");
           } else if (marks >= 70) {
               System.out.println("Student pass with grade B");
           } else if (marks >= 60) {
               System.out.println("Student pass with grade C");
           } else if (marks >= 50) {
               System.out.println("student pass with grade D");
           } else if (marks >= 40) {
               System.out.println("Student pass with grade E");
           } else  {
               System.out.println("Student is Fail");
           }
       }
    public static void main(String[] args) {
        GradingInSchool(78);
        GradingInSchool(96);
        GradingInSchool(89);
        GradingInSchool(59);
        GradingInSchool(45);
    }
   }




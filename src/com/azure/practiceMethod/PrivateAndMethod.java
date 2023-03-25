package com.azure.practiceMethod;

public class PrivateAndMethod {
    private static void empSalary(){
        String emp1 = "Sudhir Pandey";
        String emp2 = "Asha Deshmukh";
        int emp1Salary = 40000;
        int emp2Salary = 35000;
        int combineSalary = (emp1Salary +emp2Salary);
        System.out.println(emp1 + " "+ "salary is"+" "+ emp1Salary);
        System.out.println(emp2 + " "+ "salary is"+" "+ emp2Salary );
        System.out.println("They earning together ="+ " "+ combineSalary);


    }

    public static void main(String[] args) {
        empSalary();

    }
}

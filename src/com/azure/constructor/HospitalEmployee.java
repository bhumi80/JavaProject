package com.azure.constructor;

import com.azure.nonStaticObject.Hospital;

public class HospitalEmployee {
    String employeeName;
    int employeePayRollNumber;
    int empSalary;
    public static void  workingInHospital(){
        String CompName = "HCA international Ltd";
        String hosName = "The Lister Hospital";
        String hosAddress = "Chelsea bridge road, SW1W 6TP";
        String name1 = "hospital employee details";
        System.out.println(name1.toUpperCase());
        System.out.println("*************************");
        System.out.println();
        System.out.println(CompName);
        System.out.println(hosName);
        System.out.println(hosAddress);
        System.out.println();
    }
    public HospitalEmployee(String name,int payrollNumber,int salary) {
        String employeeName = name;
        int employeePayRollNumber = payrollNumber;
        int empSalary = salary;
        System.out.println("A employee name is"+" "+ employeeName);
        System.out.println(employeeName+" "+"payroll number is"+" "+employeePayRollNumber);
        System.out.println(employeeName+" "+"salary is"+" "+empSalary);
        System.out.println();
    }
    public static void main(String[] args){
        workingInHospital();
        HospitalEmployee H = new HospitalEmployee("Rose Parker",23345,28000);
        HospitalEmployee H1 = new HospitalEmployee("Rita Patkar",45567,35000);
        HospitalEmployee H2 = new HospitalEmployee("Jenny Stewart",23456,45000);
    }
}


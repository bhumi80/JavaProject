package com.azure.practiceMethod;

public class ProtectAndPara {
    protected static int multiplication(int a, int b, int c){
        int d = (a * b * c);
        System.out.println(d);
        return d;
    }
    protected static  String empName (String emp1, String emp2, String emp3){
        String allEmpName = (emp1+" "+ emp2+" "+emp3);
        System.out.println(allEmpName);
        return allEmpName;
    }

    public static void main(String[] args) {
        System.out.println(multiplication(5,6,8));
        System.out.println(empName("Rita","Meena","Tina"));

    }
}


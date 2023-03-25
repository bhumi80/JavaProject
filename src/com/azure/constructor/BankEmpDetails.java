package com.azure.constructor;

public class BankEmpDetails {
    String empName;
    int empId;
    public void bankEmp(){
        String bankName = "RBS";
        String address = "Harrow road,Harrow";
        System.out.println("A bank name is"+" "+bankName);
        System.out.println("Bank address is"+" "+address);
    }
    public BankEmpDetails(String Name,int Id){
        empName = "name";
        empId = Id;
        System.out.println(Name);
        System.out.println(empId);
    }

    public static void main(String[] args) {
        BankEmpDetails B = new BankEmpDetails("Tara Patni",2345);
        B.bankEmp();
    }
}

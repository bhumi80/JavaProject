package com.azure.inheritance;

public class ComputerClassHiera extends UniversityDepartmentHiera  {
    int teachers1 = 4;
    int teachAssistant1 = 3;
    int students1 = 100;
    public void computerClassInfo(){
        System.out.println("Computer Department");
        System.out.println("====================");
        System.out.println("Computer department have"+" "+ teachers1 +" "+"teachers");
        System.out.println("Computer department have"+" "+ teachAssistant1 +" "+"teacher assistants");
        System.out.println("Computer department have"+" "+students1+" "+"students");
        System.out.println();
    }

    public static void main(String[] args) {
        ComputerClassHiera Computer = new ComputerClassHiera();
        Computer.uniInfo();
        Computer.computerClassInfo();

    }
}

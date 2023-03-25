package com.azure.inheritance;

public class UniversityDepartmentHiera {
    public void uniInfo(){
        String uniName = "Sardar Patel university";
        int number = 3;
        System.out.println(uniName);
        System.out.println("----------------------");
        System.out.println(uniName+" "+ "have"+" "+ number+" "+"main departments");
        System.out.println();
        int teachers = 3;
        int teachAssistant = 4;
        int students = 70;
        System.out.println("Maths Department");
        System.out.println("====================");
        System.out.println("Maths department have"+" "+ teachers +" "+"teachers");
        System.out.println("Maths department have"+" "+ teachAssistant +" "+"teacher assistants");
        System.out.println("Maths department have"+" "+ students +" "+"students");
        System.out.println();
        }



    public static void main(String[] args) {
        UniversityDepartmentHiera University = new UniversityDepartmentHiera();
        University.uniInfo();

    }
}

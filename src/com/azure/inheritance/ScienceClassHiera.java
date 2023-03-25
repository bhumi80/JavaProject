package com.azure.inheritance;

public class ScienceClassHiera extends UniversityDepartmentHiera {
    int teachers2 = 6;
    int teachAssistant2 = 3;
    int students2 = 150;
    public void ScienceClassInfo(){
        System.out.println("Science Department");
        System.out.println("====================");
        System.out.println("Science department have"+" "+ teachers2 +" "+"teachers");
        System.out.println("Science department have"+" "+ teachAssistant2 +" "+"teacher assistants");
        System.out.println("Science department have"+" "+students2+" "+"students");
        System.out.println();
    }

    public static void main(String[] args) {
        ScienceClassHiera Science = new ScienceClassHiera();
        Science.uniInfo();
        Science.ScienceClassInfo();
    }
}

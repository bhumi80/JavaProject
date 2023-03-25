package com.azure.dataTypesAndVariables;

public class InstanceOrGlobalVariable {
    String name = "Bhumika";
    String surname = "Suthar";
    int age = 42;
    float weight = 62.60f;

    public static void main(String[] args) {
        InstanceOrGlobalVariable myBiodata = new InstanceOrGlobalVariable();
        System.out.println(myBiodata);
        System.out.println(" My first name is " + " " + myBiodata.name + '.');
        System.out.println(" My surname is " + " " + myBiodata.surname+'.');
        System.out.println(" I am " + " " + myBiodata.age + " years old.");
        System.out.println(" My Current weight is " + " " + myBiodata.weight+'.');
    }
}
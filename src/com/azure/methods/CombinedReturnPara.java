package com.azure.methods;

public class CombinedReturnPara {
    public String admittedPatientsData (String name1, String name2, String name3){
        String recordNames = (name1 + name2 + name3);
        return recordNames;
    }

    public static void main(String[] args) {
        CombinedReturnPara myRecordObject = new CombinedReturnPara();
        System.out.println(myRecordObject.admittedPatientsData("Sharad Mistry ", "Tina Patel ", "Rohit Thakkar "));
    }
}

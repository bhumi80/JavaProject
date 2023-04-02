package com.azure.collection;

import java.util.HashMap;

public class PatientInfoHashMap {
    public static void main(String[] args) {
        HashMap<String,Double> patInfo = new HashMap<>();
        patInfo.put("Nita",69.45);
        patInfo.put("Ekta",75.05);
        patInfo.put("Dhara",56.65);
        patInfo.put("Prisha",53.56);
        System.out.println("Hashmap contains patient names and weights:"+" "+ patInfo);
        System.out.println("Hashmap size is"+" "+ patInfo.size());
        System.out.println();
        for (String i:patInfo.keySet()) {
            System.out.println("Key -patient name:"+" "+ i+" "+"Values -patient weight:"+" "+ patInfo.get(i));
        }
    }
}

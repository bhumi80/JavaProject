package com.azure.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CountryAndPopulation {
    public static void main(String[] args) {
        // country(key) and population(value) in crores
        HashMap<String,Integer> countryInfo = new HashMap<>();
        countryInfo.put("India",140);
        countryInfo.put("China",141);
        countryInfo.put("US",33);
        countryInfo.put("Germany",9);
        System.out.println("Countries and their population in crores :"+" "+ countryInfo);
        //insert new value
        countryInfo.put("Germany",11);
        System.out.println("Countries and their population in crores :"+" "+ countryInfo);
        System.out.println();
        // search key in map
        if (countryInfo.containsKey("Germany")){
            System.out.println("Key is present in a map");
        }else{
            System.out.println("Key not present in a map");
        }
        System.out.println();
        //search value in map
        if (countryInfo.containsValue(150)){
            System.out.println("Value is present in map");
        }else {
            System.out.println("value is not present in map");
        }
        System.out.println();
        // get the value of the key
        System.out.println(countryInfo.get("US"));
        System.out.println(countryInfo.get("France"));
        System.out.println();
        //print key and values using loop
        System.out.println("Print country information");
        System.out.println("*************************");
        for(Map.Entry<String,Integer> e:countryInfo.entrySet()){
            System.out.println(e.getKey()+" "+'='+" "+ e.getValue());
        }
        System.out.println();
        // remove any key from map
        countryInfo.remove("China");
        System.out.println("Reprint  countries information :"+ " "+ countryInfo);
    }

}

package com.azure.practiceMethod;

public class PublicAndMethod {
    public static void productInfo() {
        String productName = "Mattress"; // mattress (Width,legth,depth)
        boolean single = true;
        int width = 90;
        int length = 190;
        int depth = 9;
        int mattressSize = (width + length + depth);
        System.out.println("Product name is"+" "+productName+'.');
        System.out.println(mattressSize+"cm");
        System.out.println("Mattress is single="+" "+ single);

    }

    public static void main(String[] args) {

        productInfo();
        //print value from class protectAndPara in Public//
        System.out.println(ProtectAndPara.empName("Rita","Asha","Pooja"));

    }
}

package com.azure;

public class FirstStringClass {
    public static void main(String[] args) {
        String fullName = "Bhumika Suthar";
        String firstName = "Bhumika";
        String LastName = "Suthar";
        String work = "Bhumika Suthar is working in the hospital.";
        StringBuffer objFullName = new StringBuffer(fullName);

        System.out.println("My full name length = " + " " +fullName.length());
        System.out.println("Replace the word hospital with bank in string="+ " "+work.replace("hospital", "bank"));
        System.out.println("Join first and last name ="+" "+firstName.concat(LastName));
        System.out.println("convert to uppercase = " + " "+ fullName.toUpperCase());
        System.out.println("convert to lowercase = "+ " "+ firstName.toLowerCase());
        System.out.println("string work contains ="+" "+ work.contains("hospital"));
        System.out.println("Reverse the Full Name = "+ " "+objFullName.reverse());

    }
}

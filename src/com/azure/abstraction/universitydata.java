package com.azure.abstraction;

public class universitydata implements studentInfoInterface {
        public void universityData() {

                String a = "University have 3 main department";
                System.out.println(a);
                System.out.println("**************************");
                String[] depName = {"Science","Computer","Chemistry"};
                for(int i=0;i<depName.length;i++){
                        System.out.println(depName[i]);
                }
                System.out.println();
        }
        @Override
        public void data() {
                String studentName = "Arya Patel";
                int StudentId = 30;
                String depname = "Computer";
                System.out.println(studentName + " " + "is studying in" +" "+ depname);
                System.out.println("Her ID number is" + " " + StudentId);
        }

        public static void main(String[] args) {
                universitydata universitydata = new universitydata();
                universitydata.universityData();
                universitydata.data();

        }

}

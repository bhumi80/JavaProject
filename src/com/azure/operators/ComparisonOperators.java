package com.azure.operators;

public class ComparisonOperators {

    public static void main(String[] args) {

        // Comparison Operators //
        String childSurname1 = "Patel";
        String childSurname2 = "Mistry";
        boolean ans1 = childSurname1 == childSurname2;
        System.out.println("Anaya and Arya have same surname" + "="  + " "+ ans1 );

        // not equal to operator//
        String childName1 = "Ansh";
        String childName2 = "Anshu";
        boolean ans2 = childName1 != childName2;
        System.out.println("Ansh and Anshu not same name" + "=" + ans2);

        //greater than operator //
        int ricePrize = 21;
        int wheatFlourPrize = 14;
        boolean ans3 = ricePrize > wheatFlourPrize;
        System.out.println("Rice prize more than wheat flour" + "=" + "" + ans3);

        // less than operator //
        float weight1 = 68.65f;
        float weight2 = 60.50f;
        boolean ans4 = weight1 < weight2;
        System.out.println("Weigth1 have less weight than weight2 " + "= " + "" + ans4);

        // greater than or equal to //
        int x = 88;
        int y = 67;
        boolean ans5 = (x >= y);
        System.out.println(ans5);

        // less than or equal to //
        int a = 78;
        int b = 78;
        boolean ans6 = (a<=b);
        System.out.println(ans6);



    }

}
